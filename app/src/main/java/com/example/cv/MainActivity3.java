package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView myname1=findViewById(R.id.myname);
        TextView myage1=findViewById(R.id.myage);
        TextView myjob1=findViewById(R.id.myjob);
        TextView mygmail1=findViewById(R.id.mygmail);
        ImageView photo2=findViewById(R.id.imageView2);

        Bundle F=getIntent().getExtras();

        int myage=F.getInt("age");
        String myname=F.getString("name");
        String myjob=F.getString("job");
        String mygmail=F.getString("gmail");

        myname1.setText(" "+myname);
        myage1.setText(" "+myage);
        myjob1.setText(" "+myjob);
        mygmail1.setText(" "+mygmail);

    }
}