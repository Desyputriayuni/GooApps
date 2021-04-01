package com.example.gooapps.ui.homesecond;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomesecondViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomesecondViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home second fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}