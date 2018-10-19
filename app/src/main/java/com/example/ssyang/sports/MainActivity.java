package com.example.ssyang.sports;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointA =0;
    int pointB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

     public void incrementA(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.ascore);
        int value = Integer.parseInt((String)(quantityTextView + " "));
        quantityTextView.setText(pointA+1+"");
        pointA+=1;
    }

    public void incrementB(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.bscore);
        int value = Integer.parseInt((String)(quantityTextView + " "));
        quantityTextView.setText(pointB+1+"");
        pointB+=1;
    }

    public void decrementA(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.ascore);
        int value = Integer.parseInt((String)(quantityTextView + " "));
        quantityTextView.setText(pointA-1+"");
        pointA-=1;
    }
    public void decrementB(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.ascore);
        int value = Integer.parseInt((String)(quantityTextView + " "));
        quantityTextView.setText(pointB-1+"");
        pointB-=1;
    }
}
