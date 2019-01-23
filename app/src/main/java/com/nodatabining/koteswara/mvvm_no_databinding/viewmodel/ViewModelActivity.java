package com.nodatabining.koteswara.mvvm_no_databinding.viewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nodatabining.koteswara.mvvm_no_databinding.R;

public class ViewModelActivity extends AppCompatActivity {
    private String TAG=this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        TextView mtextview=findViewById(R.id.number);

       // DataGenerator dataGenerator=new DataGenerator();
        DataGenerator dataGenerator=ViewModelProviders.of(this).get(DataGenerator.class);
        mtextview.setText(dataGenerator.getNumber());

        Log.i(TAG, "random number:"+dataGenerator.getNumber());
    }
}
