package com.palma.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class Registration extends AppCompatActivity implements View.OnClickListener {

    TextView tv2login;
   private EditText etuname,etemail,etpassword,etmobileno,etaddress,etzipcode;
   private ImageButton register;
   private ProgressDialog progressDialog;
   RadioGroup rg;
   RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


       tv2login = (TextView) findViewById(R.id.tv2login);
        tv2login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registration.this,MainActivity.class);
                startActivity(i);
            }
        });


        etuname = (EditText) findViewById(R.id.name);
        etemail = (EditText) findViewById(R.id.email);
        etpassword =(EditText) findViewById(R.id.password);
        etmobileno = (EditText) findViewById(R.id.mobile);
        etaddress = (EditText) findViewById(R.id.address);
        etzipcode = (EditText) findViewById(R.id.zip);
        rg =(RadioGroup) findViewById(R.id.rggroup);
        register = (ImageButton) findViewById(R.id.imageButton2);


        progressDialog =new ProgressDialog(this);
    }

        private void registerUser()
        {
            String uname = etuname.getText().toString().trim();
            String email = etemail.getText().toString().trim();
            String password = etpassword.getText().toString().trim();
            String mobileno = etmobileno.getText().toString().trim();
            String address = etaddress.getText().toString().trim();

            StringRequest stringRequest =new StringRequest(Request.Method.POST, Constants.URL_REGISTER, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    return super.getParams();
                }
            };
        }


    @Override
    public void onClick(View v) {
        if(v == register)
            registerUser();

    }
}

