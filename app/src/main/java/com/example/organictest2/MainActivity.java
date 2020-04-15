package com.example.organictest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Sign;

   // private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sign=(TextView)findViewById(R.id.tvsign);
        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {openActivity2();}
            @Override
            public void onClick(View v) {
                if (Name.getText().toString().equals("admin") && Password.getText().toString().equals("123")) {
                    openActivity2();
                }else{

                }
            }

        });


    }
    public void openActivity2(){
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }



}
