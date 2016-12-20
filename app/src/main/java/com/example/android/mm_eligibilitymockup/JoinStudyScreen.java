package com.example.android.mm_eligibilitymockup;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class JoinStudyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_study_screen);


//    public void onRadioButtonClicked(View view){
//        boolean checked = ((RadioButton) view).isChecked();
//        Intent intent2 = new Intent(this, ineligibility_screen.class);
//        Intent intent1 = new Intent(this, Above18Screen.class);
//        switch(view.getId()){
//            case R.id.radio_yes:
//                if (checked)
//                    startActivity(intent1);
//                    break;
//            case R.id.radio_no:
//                if (checked)
//                    startActivity(intent2);
//                    break;
//        }
//
//    }



//    RadioGroup.OnCheckedChangeListener listener =
//        new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup buttonView, boolean isChecked) {
//                Intent intent2 = new Intent(JoinStudyScreen.this, ineligibility_screen.class);
//                String key = null;
//                switch(buttonView.getId()) {
//                    case R.id.radio_yes:
//                        key = "key1";
////                        startActivity(intent1);
//                        Context context = getApplicationContext();
//                        int duration = Toast.LENGTH_SHORT;
//                        Toast toast = Toast.makeText(context, key, duration);
//                        toast.show();
//                        startAbove18Screen();
//                        break;
//                    case R.id.radio_no:
//                        key = "key2";
//                        break;
//                    default:
//                        return;
//                }
//                // Save the state here using key
//            }
//        };
//    }

//    private void startAbove18Screen() {
//        Intent intent1 = new Intent(JoinStudyScreen.this, Above18Screen.class);
//        startActivity(intent1);
//    }
    }

    public void joinStudyNextScreen(View view) {
//        RadioGroup itemtypeGroup = (RadioGroup) findViewById(R.id.radio_group);
        RadioButton yesButton = (RadioButton) findViewById(R.id.radio_yes);
        RadioButton noButton = (RadioButton) findViewById(R.id.radio_no);

        if (yesButton.isChecked()){
            //some code
            Intent intent1 = new Intent(JoinStudyScreen.this, Above18Screen.class);
            startActivity(intent1);
        } else if (noButton.isChecked()){
            //some code
            Intent intent = new Intent(JoinStudyScreen.this, ineligibility_screen.class);
            startActivity(intent);
        }
//        itemtypeGroup.clearCheck();
//        int checkedId = itemtypeGroup.getId();
//        int checkedId2 = itemtypeGroup.getCheckedRadioButtonId();
//        if (checkedId == R.id.radio_yes) {
//            //some code
//            Intent intent1 = new Intent(JoinStudyScreen.this, Above18Screen.class);
//            startActivity(intent1);
//        } else if (checkedId == R.id.radio_no) {
//
//        }


//        itemtypeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//                if (checkedId == R.id.radio_yes) {
//                    //some code
//                    Intent intent1 = new Intent(JoinStudyScreen.this, Above18Screen.class);
//                    startActivity(intent1);
//                } else if (checkedId == R.id.radio_no) {
//                    //some code
//                    Intent intent = new Intent(JoinStudyScreen.this, ineligibility_screen.class);
//                    startActivity(intent);
//                }

//            }
//        });
    }
}
