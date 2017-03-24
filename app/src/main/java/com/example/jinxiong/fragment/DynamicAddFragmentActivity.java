package com.example.jinxiong.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jinxiong.fragment.fragment.MyFragment1;

public class DynamicAddFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_add_fragment);


        this.findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                MyFragment1 myFragment1 = new MyFragment1();
                transaction.add(R.id.root_view, myFragment1);
                transaction.addToBackStack(null);

                transaction.commit();
            }
        });

    }
}
