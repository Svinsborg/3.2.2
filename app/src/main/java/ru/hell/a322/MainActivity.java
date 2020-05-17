package ru.hell.a322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int parm = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView calc = findViewById(R.id.imageView);
        final ImageView calcEng = findViewById(R.id.imageView2);
        final Button swView = findViewById(R.id.swbtn);


        calc.setVisibility(View.GONE);
        calcEng.setVisibility(View.VISIBLE);

        swView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (parm == 0){
                    calc.setVisibility(View.VISIBLE);
                    calcEng.setVisibility(View.GONE);
                    parm = 1;
                } else {
                    calc.setVisibility(View.GONE);
                    calcEng.setVisibility(View.VISIBLE);
                    parm = 0;
                }
            }
        });

    }
}
