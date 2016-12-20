package com.example.android.mm_eligibilitymockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EligibilityDesc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligibility_desc);
    }

    public void choose18orAbove(View view) {
        Intent intent = new Intent(this, JoinStudyScreen.class);
        startActivity(intent);
    }
}
