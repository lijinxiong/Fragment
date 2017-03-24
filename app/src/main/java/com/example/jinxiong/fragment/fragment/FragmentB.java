package com.example.jinxiong.fragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jinxiong.fragment.R;

/**
 * Created by jinxiong on 2017/3/24.
 */

public class FragmentB extends Fragment {

    ActionB mActionB;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof ActionB) {
            mActionB = (ActionB) context;
        }else {
            try {
                throw new Exception("must implement ActionB");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        this.getActivity().findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActionB.actionB();
            }
        });
    }

    public interface ActionB{
        void actionB();
    }

}
