package com.example.subscipher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    EditText edt1 ;
    TextView txtv2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edt1 = (EditText) findViewById(R.id.edt1) ;
        txtv2 = (TextView) findViewById(R.id.txtv2) ;
    }

    public void actionBtn3(View view) {
        String plain = edt1.getText().toString();
        String result = SubsCipher.encrypt(plain);
        txtv2.setText("Encrypted to: " + result);
        edt1.setText("");
        Toast.makeText(this, "If you want to decrypt press Back button :)", Toast.LENGTH_LONG).show();
    }

    public void actionBtn4(View view) {
        finish();
    }
}
