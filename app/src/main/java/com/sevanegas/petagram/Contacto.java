package com.sevanegas.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class Contacto extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextEmail;
    private EditText editTextSubject;
    private EditText editTextMessage;

    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextSubject = (EditText) findViewById(R.id.editTextSubject);
        editTextMessage = (EditText) findViewById(R.id.editTextMessage);

        buttonSend = (Button) findViewById(R.id.btn_enviar);

        buttonSend.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        sendEmail();

    }
    private void sendEmail(){
        String email=editTextEmail.getText().toString().trim();
        String subject = editTextSubject.getText().toString().trim();
        String message = editTextMessage.getText().toString().trim();

        JavaMailAPI sm = new JavaMailAPI(this,email,subject,message);

        sm.execute();
    }
}