package com.rickyhr.ibadah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton jadwal;
ImageButton kajian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jadwal = findViewById(R.id.imsak);
        kajian = findViewById(R.id.ngaji);
        kajian.setOnClickListener(this);
        jadwal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imsak:
            Intent Idokter = new Intent(MainActivity.this, waktu_imsak.class);
            startActivity(Idokter);
            break;
            case R.id.ngaji:
                Intent ngaji = new Intent(MainActivity.this, kajiian_activity.class);
                startActivity(ngaji);
                break;
        }
    }
}
