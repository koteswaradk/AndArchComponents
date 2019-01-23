package com.nodatabining.koteswara.mvvm_no_databinding.lifecycleawarecomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nodatabining.koteswara.mvvm_no_databinding.R;

public class LifeCycleAwareActivity extends AppCompatActivity {
    private String TAG=this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_aware);
        Log.i(TAG,"Owner ON CREATE");
        getLifecycle().addObserver(new LifeCycleAwareObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Owner ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Owner ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Owner ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Owner ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Owner ON DESTROY");
    }
}
