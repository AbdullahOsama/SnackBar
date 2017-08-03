package com.example.gamer.snackbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    Button btn;
    TextView txv;
    protected Button txtbtn;
    String mystring = "Snack Bar here";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        txv = (TextView)findViewById(R.id.tx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount++;
                txv.setText(Integer.toString(mCount));
                Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_SHORT).show();
            }
        });


    }


}
