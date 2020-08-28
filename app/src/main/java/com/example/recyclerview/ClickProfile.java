package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickProfile extends AppCompatActivity {

    TextView tvName, tvDetail;
    ImageView imgProfile;

    String[] dataString;
    int dataPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_profile);

        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvName = findViewById(R.id.textName);
        tvDetail = findViewById(R.id.textDetail);
        imgProfile = findViewById(R.id.contentImage);

        Intent intent = getIntent();
        this.dataString = intent.getStringArrayExtra("dataString");
        this.dataPicture = intent.getIntExtra("dataPhoto", R.drawable.ic_launcher_background);

        tvName.setText(dataString[0]);
        tvDetail.setText(dataString[1]);
        imgProfile.setImageDrawable(getResources().getDrawable(dataPicture));

    }
}