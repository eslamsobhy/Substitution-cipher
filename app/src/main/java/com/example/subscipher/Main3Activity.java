package com.example.subscipher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText edt2 ;
    TextView txtv3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edt2 = (EditText) findViewById(R.id.edt2) ;
        txtv3 = (TextView) findViewById(R.id.txtv3) ;
    }

    public void actionBtn5(View view) {
        String cipher = edt2.getText().toString();
        String result = SubsCipher.decrypt(cipher);
        txtv3.setText("Decrypted to: " + result);
        edt2.setText("");
        Toast.makeText(this, "If you want to encrypt press Back button :)", Toast.LENGTH_LONG).show();
    }

    public void actionBtn6(View view) {
        finish();
    }
}
