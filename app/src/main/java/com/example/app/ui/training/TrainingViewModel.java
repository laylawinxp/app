package com.example.app.ui.training;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrainingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TrainingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is training fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}