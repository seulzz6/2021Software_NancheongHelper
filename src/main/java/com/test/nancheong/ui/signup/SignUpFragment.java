/*
package com.test.nancheong.ui.signup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;
import com.test.nancheong.R;


public class SignUpFragment extends Fragment {
    private EditText signup_id, signup_password, signup_name, signup_age;
   private View viewSignUp;
 private Button register
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }*/
/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewSignUp = inflater.inflate(R.layout.fragment_sign_up, container, false);

        signup_id = viewSignUp.findViewById(R.id.signup_id);
        signup_password = viewSignUp.findViewById(R.id.signup_password);
        signup_name = viewSignUp.findViewById(R.id.signup_name);
        signup_age = viewSignUp.findViewById(R.id.signup_age);
        register = viewSignUp.findViewById(R.id.button_register);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = signup_id.getText().toString();
                String userPassword = signup_password.getText().toString();
                String userName = signup_name.getText().toString();
                int userAge = Integer.parseInt(signup_age.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }
            }
        })

        return viewSignUp;
    }

}*/