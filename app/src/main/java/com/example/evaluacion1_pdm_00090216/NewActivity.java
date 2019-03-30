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
    String aux_1, aux_2, aux_3, aux_4, aux_5, aux_6, aux_7, aux_8, aux_9;
    TextView mProduct1, mProduct2, mProduct3, mProduct4, mProduct5;
    TextView mProduct6, mProduct7, mProduct8, mProduct9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        BindView();
        Intent capture_intent = getIntent();
        Bundle extras = capture_intent.getExtras();

        if (extras != null){
            aux_user = extras.getString("EXTRA_USERNAME");
            aux_email = extras.getString("EXTRA_EMAIL");
            aux_1 = extras.getString("EXTRA_1");
            aux_2 = extras.getString("EXTRA_2");
            aux_3 = extras.getString("EXTRA_3");
            aux_4 = extras.getString("EXTRA_4");
            aux_5 = extras.getString("EXTRA_5");
            aux_6 = extras.getString("EXTRA_6");
            aux_7 = extras.getString("EXTRA_7");
            aux_8 = extras.getString("EXTRA_8");
            aux_9 = extras.getString("EXTRA_9");
        }

        mUser.setText(aux_user);
        mEmail.setText(aux_email);
        mProduct1.setText(aux_1);
        mProduct2.setText(aux_2);
        mProduct3.setText(aux_3);
        mProduct4.setText(aux_4);
        mProduct5.setText(aux_5);
        mProduct6.setText(aux_6);
        mProduct7.setText(aux_7);
        mProduct8.setText(aux_8);
        mProduct9.setText(aux_9);


        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");
                m_intent2.putExtra(Intent.EXTRA_TEXT, "Usuario: " + aux_user +  "\n" + "Correo: " + aux_email + "\n" + "Cantidad de Producto: " +
                        "\n" + "Producto 1: " + aux_1 + "\n" + "Producto 2: " + aux_2 + "\n" + "Producto 3: " + aux_3 + "\n" + "Producto 4: " + aux_4 +
                        "\n" + "Producto 5: " + aux_5 + "\n" + "Producto 6: " + aux_6 + "\n" + "Producto 7: " + aux_7 + "\n" + "Producto 8: " + aux_8 +
                        "\n" + "Producto 9: " + aux_9);
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
        mEmail = findViewById(R.id.tv_show_email);
        mUser = findViewById(R.id.tv_show_username);
    }
}
