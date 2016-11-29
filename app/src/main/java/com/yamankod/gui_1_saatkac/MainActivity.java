package com.yamankod.gui_1_saatkac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {


     private Button saat;
        private Date tarih;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            saat = (Button) findViewById(R.id.btnSaat);

            saat.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    tarih = new Date();
                    saat.setText(tarih.toString());
                }
            });
        }


}
