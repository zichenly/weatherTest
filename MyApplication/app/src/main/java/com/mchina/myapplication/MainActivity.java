package com.mchina.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mchina.myapplication.ui.FileSelceActivity;

import static com.mchina.myapplication.ui.FileSelceActivity.RESULTCODE;
import static com.mchina.myapplication.ui.FileSelceActivity.SELECTPATH;

public class MainActivity extends AppCompatActivity {

    private Button main_btn_login;
    private EditText main_edit_user, main_edit_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_btn_login = findViewById(R.id.main_btn_login);
        main_edit_user = findViewById(R.id.main_edit_user);
        main_edit_password = findViewById(R.id.main_edit_password);
        main_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FileSelceActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULTCODE){
            Log.e("====",data.getStringArrayListExtra(SELECTPATH).get(0));
        }
    }
}
