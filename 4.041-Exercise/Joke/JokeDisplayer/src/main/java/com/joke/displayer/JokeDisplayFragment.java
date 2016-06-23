package com.joke.displayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeDisplayFragment extends Fragment {

    TextView textView;

    public static final String JOKES_EXTRA = "JOKES";

    public JokeDisplayFragment() {
    }

    public static JokeDisplayFragment getInstance(Bundle params) {
        JokeDisplayFragment jokeDisplayFragment = new JokeDisplayFragment();
        jokeDisplayFragment.setArguments(params);
        return jokeDisplayFragment;
    }

    public static Bundle getParams(ArrayList<String> jokes) {
        Bundle params = new Bundle();
        params.putStringArrayList(JOKES_EXTRA, jokes);
        return params;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_joke, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getView().findViewById(R.id.txt_joke_library);
        if (getArguments() != null && getArguments().containsKey(JOKES_EXTRA)) {
            ArrayList<String> jokes = getArguments().getStringArrayList(JOKES_EXTRA);
            if (jokes != null && jokes.size() > 0) {
                for (String joke : jokes)
                    textView.append(joke + "\n");
                return;
            }
        }
        textView.setText("Sorry! No Jokes to show.");

    }
}
