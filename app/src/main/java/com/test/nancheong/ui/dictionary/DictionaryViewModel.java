package com.test.nancheong.ui.dictionary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DictionaryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DictionaryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dictionary fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}