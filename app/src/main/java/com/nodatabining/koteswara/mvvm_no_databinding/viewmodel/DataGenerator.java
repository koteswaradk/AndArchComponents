package com.nodatabining.koteswara.mvvm_no_databinding.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class DataGenerator extends ViewModel {
    private String TAG=this.getClass().getSimpleName();
    private String myRandomNumber;
    public String getNumber(){
        Log.i(TAG,"get number");
        if (myRandomNumber==null){
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber() {
        Log.i(TAG,"create new number");
        Random random=new Random();
        myRandomNumber="Number: " +(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG,"view model cleared");

    }
}
