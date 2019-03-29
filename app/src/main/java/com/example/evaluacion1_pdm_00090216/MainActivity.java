package com.example.evaluacion1_pdm_00090216;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mSubmit;
    EditText mUser, mEmail;
    TextView mProduct1, mProduct2, mProduct3, mProduct4, mProduct5;
    TextView mProduct6, mProduct7, mProduct8, mProduct9;
    int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0;
    int counter6 = 0, counter7 = 0, counter8 = 0, counter9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindView();
        BindListeners();

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent  =new Intent(MainActivity.this, NewActivity.class);
                Bundle extras = new Bundle();
                extras.putString("EXTRA_USERNAME", mUser.getText().toString());
                extras.putString("EXTRA_EMAIL", mEmail.getText().toString());
                extras.putString("EXTRA_1", mProduct1.getText().toString());
                extras.putString("EXTRA_2", mProduct2.getText().toString());
                extras.putString("EXTRA_3", mProduct3.getText().toString());
                extras.putString("EXTRA_4", mProduct4.getText().toString());
                extras.putString("EXTRA_5", mProduct5.getText().toString());
                extras.putString("EXTRA_6", mProduct6.getText().toString());
                extras.putString("EXTRA_7", mProduct7.getText().toString());
                extras.putString("EXTRA_8", mProduct8.getText().toString());
                extras.putString("EXTRA_9", mProduct9.getText().toString());
                m_intent.putExtras(extras);

                startActivity(m_intent);
            }
        });

        mProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1 = counter1 + 1;
                mProduct1.setText(counter1);
            }
        });

        mProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2 = counter2 + 1;
                mProduct2.setText(counter2);

            }
        });

        mProduct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3 = counter3 + 1;
                mProduct3.setText(counter3);
            }
        });

        mProduct4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter4 = counter4 + 1;
                mProduct4.setText(counter4);
            }
        });

        mProduct5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter5 = counter5 + 1;
                mProduct5.setText(counter5);
            }
        });

        mProduct6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter6 = counter6 + 1;
                mProduct6.setText(counter6);
            }
        });

        mProduct7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter7 = counter7 + 1;
                mProduct7.setText(counter7);
            }
        });

        mProduct8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter8 = counter8 + 1;
                mProduct8.setText(counter8);
            }
        });

        mProduct9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter9 = counter9 + 1;
                mProduct9.setText(counter9);
            }
        });
    }

    private void BindListeners() {}


    private void BindView() {

        mSubmit = findViewById(R.id.btn_submit);
        mProduct1 = findViewById(R.id.tv_product1);
        mProduct2 = findViewById(R.id.tv_product2);
        mProduct3 = findViewById(R.id.tv_product3);
        mProduct4 = findViewById(R.id.tv_product4);
        mProduct5 = findViewById(R.id.tv_product5);
        mProduct6 = findViewById(R.id.tv_product6);
        mProduct7 = findViewById(R.id.tv_product7);
        mProduct8 = findViewById(R.id.tv_product8);
        mProduct9 = findViewById(R.id.tv_product9);
        mEmail = findViewById(R.id.et_email);
        mUser = findViewById(R.id.et_user);
    }
}
