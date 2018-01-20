package com.example.elhadji.e_learningquizz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Sentences used below are defined here !
     */
    String forSince = "I've been trying to convince her";



    // Declarations of right checkboxes below:
    CheckBox boxFor;
    CheckBox boxSince;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialization of checkboxes below:
        boxFor = (CheckBox) findViewById(R.id.forcheckbox);
        boxSince = (CheckBox) findViewById(R.id.sincecheckbox);


    }

    /**
     * Test methods are defined below!
     */
    public void testStartFor(View view) {
        makeSentence(forSince + "  since/for 20 minutes.");
    }






    /**
     * Submit answers method
     */
    public void submitAnswers(View view) {
        // Go in with control flow statement!
        if (boxFor.isChecked()) {
            giveAnswer("You got it, right !\n" + forSince + " for 20 minutes.");
        } else {
            Toast.makeText(this, " Ooooopps, you miss the right answer!", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Reset button method below:
     */
    public void resetBoxes(View view) {
        //Use toggle() attributes to uncheck boxes !

        if (boxFor.isChecked()) {
            boxFor.toggle();
        }
        if (boxSince.isChecked()) {
            boxSince.toggle();
        }




        makeSentence("Click on one test please!");
        giveAnswer("Thank you for trying, let's see the answer!");
    }


    /*
     Direction to the second activity
     */
    public void goToSecondActivity(View v) {
        // Use Intent to start the second activity
        Intent intencion = new Intent(this, ThisThatActivity.class);
        startActivity(intencion);
        finish();
    }


    /**
     * Display sentence method:
     */
    public void makeSentence(String sentence) {
        TextView phase = (TextView) findViewById(R.id.sentence_text);
        phase.setText(sentence);
    }

    /**
     * Give sentence method:
     */
    public void giveAnswer(String ansmer) {
        TextView phase = (TextView) findViewById(R.id.result_text_view);
        phase.setText(ansmer);
    }
}

