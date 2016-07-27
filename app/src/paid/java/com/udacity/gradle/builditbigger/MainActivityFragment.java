package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.udacity.gradle.builditbigger.util.CallBack;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    CallBack callBack;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
        Button button = (Button) viewGroup.findViewById(R.id.joke_button_paid);
        button.setOnClickListener(view -> tellJoke());
        return viewGroup;
    }

    private void tellJoke() {
        callBack.executeAsync();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack = (CallBack) context;
        } catch (ClassCastException castException) {
            /** The activity does not implement the listener. */
        }
    }
}
