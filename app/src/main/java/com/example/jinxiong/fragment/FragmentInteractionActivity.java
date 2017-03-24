package com.example.jinxiong.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.example.jinxiong.fragment.fragment.FragmentA;
import com.example.jinxiong.fragment.fragment.FragmentB;

public class FragmentInteractionActivity extends AppCompatActivity implements FragmentA.ActionA, FragmentB.ActionB {

    Fragment fragmentA;
    Fragment fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_interaction);

        if (fragmentA == null) {
            fragmentA = new FragmentA();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.root_view, fragmentA);
        transaction.commit();
    }

    @Override
    public void actionB() {
        if (fragmentA == null) {
            fragmentA = new FragmentA();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.root_view, fragmentA);
        transaction.commit();
    }

    @Override
    public void actionA() {
        if (fragmentB == null) {
            fragmentB = new FragmentB();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.root_view, fragmentB);
        transaction.commit();
    }
}
