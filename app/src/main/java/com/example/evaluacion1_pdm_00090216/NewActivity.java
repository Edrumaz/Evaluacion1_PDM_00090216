package com.example.evaluacion1_pdm_00090216;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.Intent.EXTRA_USER;

public class NewActivity extends AppCompatActivity {

    TextView mUser, mEmail;
    Button mSubmitAction;
    String aux_user = "Texto quemado";
    String aux_email = "Texto quemado";
    String aux_1, aux_2;
    TextView mProduct1, mProduct2, mProduct3, mProduct4, mProduct5;
    TextView mProduct6, mProduct7, mProduct8, mProduct9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        BindView();

        mUser = findViewById(R.id.tv_show_user);
        mEmail = findViewById(R.id.tv_show_email);
        mSubmitAction = findViewById(R.id.btn_share);

        Intent capture_intent = getIntent();
        Bundle extras = capture_intent.getExtras();

        if (extras != null){
            aux_user = extras.getString("EXTRA_USERNAME");
            aux_email = extras.getString("EXTRA_EMAIL");
        }

        mUser.setText(aux_user);
        mEmail.setText(aux_email);

        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");
                m_intent2.putExtra(Intent.EXTRA_TEXT, "Usuario: " + aux_user +  "\n" + "Correo: " + aux_email);
                startActivity(m_intent2);
            }
        });
    }

    private void BindView() {

        mSubmitAction = findViewById(R.id.btn_share);
        mProduct1 = findViewById(R.id.tv_show_product1);
        mProduct2 = findViewById(R.id.tv_show_product2);
        mProduct3 = findViewById(R.id.tv_show_product3);
        mProduct4 = findViewById(R.id.tv_show_product4);
        mProduct5 = findViewById(R.id.tv_show_product5);
        mProduct6 = findViewById(R.id.tv_show_product6);
        mProduct7 = findViewById(R.id.tv_show_product7);
        mProduct8 = findViewById(R.id.tv_show_product8);
        mProduct9 = findViewById(R.id.tv_show_product9);
        mEmail = findViewById(R.id.et_email);
        mUser = findViewById(R.id.et_user);
    }
}
