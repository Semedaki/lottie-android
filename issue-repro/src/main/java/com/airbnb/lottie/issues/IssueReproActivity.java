package com.example.lottieballexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieCompositionFactory;

public class IssueReproActivity extends AppCompatActivity {

    private LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.issue_repro_activity);

        lottie = findViewById(R.id.lottie_video);
    }

    public void startVideo(View view)
    {
        LottieCompositionFactory.clearCache(this);
        lottie.enableMergePathsForKitKatAndAbove(true);
        lottie.setCacheComposition(false);
        lottie.playAnimation();
    }
}