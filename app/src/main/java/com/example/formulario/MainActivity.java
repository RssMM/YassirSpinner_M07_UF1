package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image;
        image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.clipart3127234);

        ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton) ;
        toggleButton.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton toggleButton, boolean isChecked) {
                if(toggleButton.isChecked()){
                    image.setImageResource(R.drawable.ic_launcher_background);
                }else{
                    image.setImageResource(R.drawable.clipart3127234);
                }
            }
        });




            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Form.class);
                    startActivity(intent);
                }
            });





    }
}