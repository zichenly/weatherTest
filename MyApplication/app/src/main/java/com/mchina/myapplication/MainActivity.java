package com.mchina.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button main_btn_login;
    private EditText main_edit_user,main_edit_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_btn_login=findViewById(R.id.main_btn_login);
        main_edit_user=findViewById(R.id.main_edit_user);
        main_edit_password=findViewById(R.id.main_edit_password);
        main_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
