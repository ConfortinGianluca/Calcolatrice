package com.example.studente.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calc;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elementi();


    }

    @Override
    public void onClick(View v) {

        if(b1.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"1");
        }
        if(b2.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"2");
        }
        if(b3.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"3");
        }
        if(b4.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"4");
        }
        if(b5.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"5");
        }
        if(b6.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"6");
        }
        if(b7.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"7");
        }
        if(b8.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"8");
        }
        if(b9.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"9");
        }
    }

    public void elementi(){
        calc=(TextView)findViewById(R.id.calc);
        calc.setOnClickListener(this);

        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5=(Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6=(Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7=(Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8=(Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9=(Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);


    }
}
