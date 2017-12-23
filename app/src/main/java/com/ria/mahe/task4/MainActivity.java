package com.ria.mahe.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText Movie;
    public EditText Name;
    public Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie =(EditText)findViewById(R.id.text);
        Name =(EditText)findViewById(R.id.Text2);
        ok = (Button)findViewById(R.id.button);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movievalue=Movie.getText().toString();
                String namevalue=Name.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name",namevalue);
                intent.putExtra("movie",movievalue);
                startActivity(intent);
            }
        });
    }
}
