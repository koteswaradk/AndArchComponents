package com.nodatabining.koteswara.mvvm_no_databinding.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class LIveDataGenerator extends ViewModel {
    private String TAG=this.getClass().getSimpleName();
    private MutableLiveData<String> myRandomNumber;
    public MutableLiveData<String> getNumber(){
        Log.i(TAG,"get number");
        if (myRandomNumber==null){
            myRandomNumber=new MutableLiveData<>();
            createNumber();
        }
        return myRandomNumber;
    }

    public void createNumber() {
        Log.i(TAG,"create new number");
        Random random=new Random();
        myRandomNumber.setValue("Number: " +(random.nextInt(10-1)+1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG,"view model cleared");

    }
}
