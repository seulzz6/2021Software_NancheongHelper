package com.example.nancheonghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SingupActivity extends AppCompatActivity {
    private EditText mEmailText, mPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        mEmailText = findViewById(R.id.sign_email);
        mPasswordText = findViewById(R.id.sign_password);

        findViewById(R.id.sign_success).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}