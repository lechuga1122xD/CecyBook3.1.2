package com.example.cecybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Agregar Animaciones

        Animation animacion1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView deTextView =findViewById(R.id.deTextView);
        TextView cecytevTextView =findViewById(R.id.cecytevTextView);
        ImageView logoimageView =findViewById(R.id.logoimageView);

        deTextView.setAnimation(animacion2);
        cecytevTextView.setAnimation(animacion2);
        logoimageView.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Intent =new Intent(MainActivity.this, LoginActivity.class);
                startActivity(Intent);
                finish();

            }
        }, 4000);

    }

}