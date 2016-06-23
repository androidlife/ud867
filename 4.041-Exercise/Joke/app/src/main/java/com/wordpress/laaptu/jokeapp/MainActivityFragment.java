package com.wordpress.laaptu.jokeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.joke.displayer.JokeDisplayActivity;
import com.joke.smith.JokeSmith;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    Button btnTellJoke;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnTellJoke = (Button) getView().findViewById(R.id.btn_tell_joke);
        btnTellJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seeJokes();
            }
        });

    }

    public void seeJokes() {
        startActivity(JokeDisplayActivity.launchActivity(getContext(), new JokeSmith().tellJokes()));
    }
}
