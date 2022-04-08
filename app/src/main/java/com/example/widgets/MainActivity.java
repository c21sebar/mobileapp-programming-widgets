package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button shrekButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shrekButton = findViewById(R.id.ButtonID);
        shrekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("KLICK", "onClick: HALLO");
                if (findViewById(R.id.ImageViewID).getVisibility()== View.VISIBLE){
                    Log.d("KLICK", "onClick: INVISIBLE");
                     findViewById(R.id.ImageViewID).setVisibility(View.INVISIBLE);
                }
                else if (findViewById(R.id.ImageViewID).getVisibility()== View.INVISIBLE){
                    Log.d("KLICK", "onClick: VISIBLE");
                    findViewById(R.id.ImageViewID).setVisibility(View.VISIBLE);

                }
            }
        });
    }


}
