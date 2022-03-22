package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next=findViewById(R.id.next);
        EditText name=findViewById(R.id.name);
        EditText age=findViewById(R.id.age);
        EditText job=findViewById(R.id.job);
        EditText gmail=findViewById(R.id.gmail);
        ImageView photo=findViewById(R.id.imageView);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,MainActivity3.class);
                int a=Integer.parseInt(age.getText().toString());
                String b=name.getText().toString();
                String c=job.getText().toString();
                String d=gmail.getText().toString();

                i.putExtra("age",a);
                i.putExtra("name",b);
                i.putExtra("job",c);
                i.putExtra("gmail",d);
                startActivity(i);
            }
        });

    }
}