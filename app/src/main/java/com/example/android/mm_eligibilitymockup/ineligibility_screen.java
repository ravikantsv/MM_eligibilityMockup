package com.example.android.mm_eligibilitymockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ineligibility_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ineligibility_screen);

        TextView link = (TextView) findViewById(R.id.war_on_melanoma);
        link.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void LaunchIntroScreen(View view) {
        Intent intent = new Intent(this, Intro3Screen.class);
        startActivity(intent);
    }
}
