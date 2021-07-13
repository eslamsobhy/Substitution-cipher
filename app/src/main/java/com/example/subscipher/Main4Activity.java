package com.example.subscipher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    EditText edt3 ;
    EditText edt4 ;

    TextView txtv4 ;
    TextView txtv5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edt3 = (EditText) findViewById(R.id.edt3);
        edt4 = (EditText) findViewById(R.id.edt4);

        txtv4 = (TextView) findViewById(R.id.txtv4);
        txtv5 = (TextView) findViewById(R.id.txtv5);

        txtv4.setVisibility(View.INVISIBLE);
    }

    public void actionBtn7(View view) {
        txtv4.setText("");

        String subTable = edt3.getText().toString() ;
        String plain = edt4.getText().toString() ;
        String result = SubsCipher.encrypt(subTable, plain);

        if(SubsCipher.isRepeated(subTable)){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: Duplicate characters found which is unacceptable.");
        }else if(subTable.contains(" ")){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: Spaces found which is unacceptable.");
        }else if(subTable.length()>26){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: More than 26 characters entered.");
        }else if(subTable.length()<26){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: Less than 26 characters entered.");
        }else if(SubsCipher.isNotAlphabetic(subTable)){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: You have entered non-alphabetic character(s).");
        }else{
            txtv4.setVisibility(View.INVISIBLE);
            txtv5.setText("Encrypted to: " + result);
            edt4.setText("");
        }
    }

    public void actionBtn8(View view) {
        txtv4.setText("");

        String subTable = edt3.getText().toString() ;
        String cipher = edt4.getText().toString() ;
        String result = SubsCipher.decrypt(subTable, cipher);

        if(SubsCipher.isRepeated(subTable)){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: Duplicate characters found which is unacceptable.");
        }else if(subTable.contains(" ")){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: Spaces found which is unacceptable.");
        }else if(subTable.length()>26){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: More than 26 characters entered.");
        }else if(subTable.length()<26){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: Less than 26 characters entered.");
        }else if(SubsCipher.isNotAlphabetic(subTable)){
            txtv4.setVisibility(View.VISIBLE);
            txtv4.setText("ERROR: You have entered non-alphabetic character(s).");
        }else{
            txtv4.setVisibility(View.INVISIBLE);
            txtv5.setText("Decrypted to: " + result);
            edt4.setText("");
        }
    }

    public void actionBtn9(View view) {
        finish();
    }
}
