package com.example.gamer.snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    Button dissnackbar;
    TextView txv;
    protected Button counti;
    static int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dissnackbar = (Button) findViewById(R.id.Snack_bar);
        counti = (Button) findViewById(R.id.count);
        txv = (TextView)findViewById(R.id.tx);
        dissnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This  is a Toast message",Toast.LENGTH_SHORT).show();
                Snackbar.make(view,"Snack bar message", Snackbar.LENGTH_SHORT).show();
            }
        });

        counti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                counter++;
                if(txv != null)
                {
                    txv.setText(Integer.toString(counter));
                }
            }
        });

    }


}
