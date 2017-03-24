package com.example.jinxiong.fragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jinxiong.fragment.R;

/**
 * Created by jinxiong on 2017/3/20.
 */

public class MyFragment1 extends Fragment {

    private static final String TAG = "MyFragment1";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "Fragment onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Fragment onCreate: ");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "Fragment onCreateView: ");
        return inflater.inflate(R.layout.my_fragment1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);
        Log.d(TAG, "Fragment  onActivityCreated: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "Fragment  onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Fragment  onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "Fragment  onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "Fragment  onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "Fragment onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Fragment  onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "Fragment onDetach: ");
    }
}
