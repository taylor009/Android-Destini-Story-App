package com.tmgbinarycreations.destinistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mBottomButton.setText(R.string.T3_Ans2);
            }
        });
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryTextView.setText(R.string.T2_Story);
                mTopButton.setText(R.string.T2_Ans1);
                mBottomButton.setText(R.string.T2_Ans2);
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    }
}
