package com.jim.atm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v){
        EditText id = (EditText)findViewById(R.id.edituserid);
        EditText pw = (EditText)findViewById(R.id.editpw);
        String UserId = id.getText().toString();
        String Userpw = pw.getText().toString();
        if("jack".equals(UserId) && "123".equals(Userpw)){
            Toast.makeText(this,"Success!",Toast.LENGTH_LONG).show();
            finish();
        }
        else{
            new AlertDialog.Builder(this).setMessage("SORRY!").setTitle("Atm").setPositiveButton("OK!",null).show();
        }

    }
}
