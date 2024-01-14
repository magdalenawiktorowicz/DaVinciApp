package es.studium.davinciapp.ui.escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

public class EscultorViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public EscultorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is escultor fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
