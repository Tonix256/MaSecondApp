package com.example.passmans.masecondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText uf;
    EditText pf;
    TextView rslt;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login=(Button)findViewById(R.id.login);
       uf=(EditText)findViewById(R.id.uf);
       pf =(EditText)findViewById(R.id.pf);
       rslt =(TextView)findViewById(R.id.rslt);
        im =(ImageView)findViewById(R.id.im);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String un=uf.getText().toString();
                String pd=pf.getText().toString();
                if(un.equals("tonny")&&pd.equals("1234")){
                    rslt.setText("LOGIN SUCCESSFUL");
                }
                else{
                    rslt.setText("TRY AGAIN");
                }
            }
        });
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rslt.setText("WELCOME");

            }
        });
    }
}
