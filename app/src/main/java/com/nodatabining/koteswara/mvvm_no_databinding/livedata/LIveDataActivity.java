package com.nodatabining.koteswara.mvvm_no_databinding.livedata;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.nodatabining.koteswara.mvvm_no_databinding.R;
import com.nodatabining.koteswara.mvvm_no_databinding.viewmodel.DataGenerator;

public class LIveDataActivity extends AppCompatActivity {
    private String TAG=this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
       final TextView  mtextview=findViewById(R.id.number);

        // DataGenerator dataGenerator=new DataGenerator();
        final LIveDataGenerator dataGenerator=ViewModelProviders.of(this).get(LIveDataGenerator.class);

        final LiveData<String> myrandomnumber=dataGenerator.getNumber();
        myrandomnumber.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                mtextview.setText(s);
                Log.i(TAG, "UI Updated:"+dataGenerator.getNumber());
            }
        });
        findViewById(R.id.update_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataGenerator.createNumber();
            }
        });



    }
}
