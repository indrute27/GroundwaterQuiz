package com.example.android.groundwaterquiz;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.groundwaterquiz.R.id.Answer2;

public class MainActivity extends AppCompatActivity {

    int correctAnswers[] = {3,1,2,4,4,1,4,4,3,2,2,1,4,2,4};
    int userAnswers[] = new int[15];
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //on click of Submit button check if an answer choice was made
    //if answer choice was made store the answer in an array
    public void submitButton(View view) {
        RadioButton answer1 = (RadioButton) findViewById(R.id.Answer1);
        boolean select1 = answer1.isChecked();
        RadioButton answer2 = (RadioButton) findViewById(Answer2);
        boolean select2 = answer2.isChecked();
        RadioButton answer3 = (RadioButton) findViewById(R.id.Answer3);
        boolean select3 = answer3.isChecked();
        RadioButton answer4 = (RadioButton) findViewById(R.id.Answer4);
        boolean select4 = answer4.isChecked();
        TextView question = (TextView) findViewById(R.id.Question);

        if (select1 || select2 || select3 || select4){

            if(count < 14) {
                count += 1;
                //record user answers
                if (select1) {
                    userAnswers[count - 1] = 1;
                } else if (select2) {
                    userAnswers[count - 1] = 2;
                } else if (select3) {
                    userAnswers[count - 1] = 3;
                } else {
                    userAnswers[count - 1] = 4;
                }

                //update the question and answers
                if (count == 1) {
                    question.setText(R.string.Q2);
                    answer1.setText(R.string.A2_1);
                    answer2.setText(R.string.A2_2);
                    answer3.setText(R.string.A2_3);
                    answer4.setText(R.string.A2_4);
                } else if (count == 2) {
                    question.setText(R.string.Q3);
                    answer1.setText(R.string.A3_1);
                    answer2.setText(R.string.A3_2);
                    answer3.setText(R.string.A3_3);
                    answer4.setText(R.string.A3_4);
                } else if (count == 3) {
                    question.setText(R.string.Q4);
                    answer1.setText(R.string.A4_1);
                    answer2.setText(R.string.A4_2);
                    answer3.setText(R.string.A4_3);
                    answer4.setText(R.string.A4_4);
                } else if (count == 4) {
                    question.setText(R.string.Q5);
                    answer1.setText(R.string.A5_1);
                    answer2.setText(R.string.A5_2);
                    answer3.setText(R.string.A5_3);
                    answer4.setText(R.string.A5_4);
                } else if (count == 5) {
                    question.setText(R.string.Q6);
                    answer1.setText(R.string.A6_1);
                    answer2.setText(R.string.A6_2);
                    answer3.setText(R.string.A6_3);
                    answer4.setText(R.string.A6_4);
                } else if (count == 6) {
                    question.setText(R.string.Q7);
                    answer1.setText(R.string.A7_1);
                    answer2.setText(R.string.A7_2);
                    answer3.setText(R.string.A7_3);
                    answer4.setText(R.string.A7_4);
                } else if (count == 7) {
                    question.setText(R.string.Q8);
                    answer1.setText(R.string.A8_1);
                    answer2.setText(R.string.A8_2);
                    answer3.setText(R.string.A8_3);
                    answer4.setText(R.string.A8_4);
                } else if (count == 8) {
                    question.setText(R.string.Q9);
                    answer1.setText(R.string.A9_1);
                    answer2.setText(R.string.A9_2);
                    answer3.setText(R.string.A9_3);
                    answer4.setText(R.string.A9_4);
                } else if (count == 9) {
                    question.setText(R.string.Q10);
                    answer1.setText(R.string.A10_1);
                    answer2.setText(R.string.A10_2);
                    answer3.setText(R.string.A10_3);
                    answer4.setText(R.string.A10_4);
                } else if (count == 10) {
                    question.setText(R.string.Q11);
                    answer1.setText(R.string.A11_1);
                    answer2.setText(R.string.A11_2);
                    answer3.setText(R.string.A11_3);
                    answer4.setText(R.string.A11_4);
                } else if (count == 11) {
                    question.setText(R.string.Q12);
                    answer1.setText(R.string.A12_1);
                    answer2.setText(R.string.A12_2);
                    answer3.setText(R.string.A12_3);
                    answer4.setText(R.string.A12_4);
                } else if (count == 12) {
                    question.setText(R.string.Q13);
                    answer1.setText(R.string.A13_1);
                    answer2.setText(R.string.A13_2);
                    answer3.setText(R.string.A13_3);
                    answer4.setText(R.string.A13_4);
                } else if (count == 13) {
                    question.setText(R.string.Q14);
                    answer1.setText(R.string.A14_1);
                    answer2.setText(R.string.A14_2);
                    answer3.setText(R.string.A14_3);
                    answer4.setText(R.string.A14_4);
                } else if (count == 14) {
                    question.setText(R.string.Q15);
                    answer1.setText(R.string.A15_1);
                    answer2.setText(R.string.A15_2);
                    answer3.setText(R.string.A15_3);
                    answer4.setText(R.string.A15_4);
                }

                RadioGroup rgroup = (RadioGroup) findViewById(R.id.radioGroup);
                rgroup.clearCheck();

                //update progress bar
                ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
                progressBar.setProgress((int)(count/15.0 * 100.0));

            } else {
                count += 1;

                if (select1) {
                    userAnswers[count - 1] = 1;
                } else if (select2) {
                    userAnswers[count - 1] = 2;
                } else if (select3) {
                    userAnswers[count - 1] = 3;
                } else {
                    userAnswers[count - 1] = 4;
                }

                //check answers
                int correct = 0;

                for (int i = 0; i <= 14; i++) {
                    if (correctAnswers[i] == userAnswers[i]) {
                        correct += 1;
                    }
                }

                int score = (int) (correct / 15.0 * 100.0);
                String scoreText = Integer.toString(score) + "%";

                //make all the buttons dissapear
                View button = findViewById(R.id.bottomButton);
                button.setVisibility(View.GONE);
                View pbar = findViewById(R.id.progressBar);
                pbar.setVisibility(View.GONE);
                answer1.setVisibility(View.GONE);
                answer2.setVisibility(View.GONE);
                answer3.setVisibility(View.GONE);
                answer4.setVisibility(View.GONE);

                question.setTextSize(30);
                question.setTextColor(Color.parseColor("#52add1"));

                if (score < 50.0) {
                    question.setText(getString(R.string.FinalBad, scoreText));
                    ImageView img= (ImageView) findViewById(R.id.background);
                    img.setImageResource(R.drawable.sadwaterdrop);
                } else if (score < 65.0) {
                    question.setText(getString(R.string.FinalOk, scoreText));
                    ImageView img= (ImageView) findViewById(R.id.background);
                    img.setImageResource(R.drawable.youcandobetter);
                } else if (score < 90.0) {
                    question.setText(getString(R.string.FinalGood, scoreText));
                    ImageView img= (ImageView) findViewById(R.id.background);
                    img.setImageResource(R.drawable.good);
                } else {
                    question.setText(getString(R.string.FinalGreat, scoreText));
                    ImageView img= (ImageView) findViewById(R.id.background);
                    img.setImageResource(R.drawable.excellentjob);
                }
            }
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Please select an answer";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }




}
