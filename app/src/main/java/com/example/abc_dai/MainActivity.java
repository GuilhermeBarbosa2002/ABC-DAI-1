package com.example.abc_dai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonOnclick(View v){
        TextView text = (TextView) findViewById(R.id.LOGIN_text);
        EditText username= (EditText) findViewById(R.id.editTextTextPersonName);
        EditText password= (EditText) findViewById(R.id.editTextTextPassword);


        if(username.getText().toString().isEmpty() ){
            text.setText("Insira o nome!!");
            username.requestFocus();

        }else if(password.getText().toString().isEmpty() ){
            text.setText("Insira a password!!");
            password.requestFocus();

        }else{

            text.setText("LOGIN EFETUADO");
        }

    }

    public void fecharApp(View v){
        TextView text = (TextView) findViewById(R.id.LOGIN_text);
        text.setText("DESLIGADO");
    }
}