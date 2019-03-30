package com.example.evaluacion1_pdm_00090216;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mSubmit;
    EditText mUser, mEmail;
    Button mProduct1, mProduct2, mProduct3, mProduct4, mProduct5;
    Button mProduct6, mProduct7, mProduct8, mProduct9;
    int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0;
    int counter6 = 0, counter7 = 0, counter8 = 0, counter9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindView();
        mProduct1.setOnClickListener(this);
        mProduct2.setOnClickListener(this);
        mProduct3.setOnClickListener(this);
        mProduct4.setOnClickListener(this);
        mProduct5.setOnClickListener(this);
        mProduct6.setOnClickListener(this);
        mProduct7.setOnClickListener(this);
        mProduct8.setOnClickListener(this);
        mProduct9.setOnClickListener(this);

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
    }

    private void BindView() {

        mSubmit = findViewById(R.id.btn_submit);
        mProduct1 = findViewById(R.id.btn_product1);
        mProduct2 = findViewById(R.id.btn_product2);
        mProduct3 = findViewById(R.id.btn_product3);
        mProduct4 = findViewById(R.id.btn_product4);
        mProduct5 = findViewById(R.id.btn_product5);
        mProduct6 = findViewById(R.id.btn_product6);
        mProduct7 = findViewById(R.id.btn_product7);
        mProduct8 = findViewById(R.id.btn_product8);
        mProduct9 = findViewById(R.id.btn_product9);
        mEmail = findViewById(R.id.et_email);
        mUser = findViewById(R.id.et_user);
    }

   @Override
    public void onClick(View v) {
       if (v.getId() == R.id.btn_product1) {
           counter1 ++;
           String aux_counter = String.valueOf(counter1);
           mProduct1.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product2) {
           counter2++;
           String aux_counter = String.valueOf(counter2);
           mProduct2.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product3) {
           counter3++;
           String aux_counter = String.valueOf(counter3);
           mProduct3.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product4) {
           counter4++;
           String aux_counter = String.valueOf(counter4);
           mProduct4.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product5) {
           counter5++;
           String aux_counter = String.valueOf(counter5);
           mProduct5.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product6) {
           counter6++;
           String aux_counter = String.valueOf(counter6);
           mProduct6.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product7) {
           counter7++;
           String aux_counter = String.valueOf(counter7);
           mProduct7.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product8) {
           counter8++;
           String aux_counter = String.valueOf(counter8);
           mProduct8.setText(aux_counter);

       } else if (v.getId() == R.id.btn_product9) {
           counter9++;
           String aux_counter = String.valueOf(counter9);
           mProduct9.setText(aux_counter);

       }
   }
}
