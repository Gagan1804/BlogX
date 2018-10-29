package com.gstar.blogx;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {

    Button instagram;
    Button blog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        instagram = (Button)findViewById(R.id.insta);
        blog = (Button)findViewById(R.id.blog);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.instagram.com/sab_kucch_hai_yahan/?hl=en");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
                likeIng.setPackage("com.gstar.blogx");

                try
                {
                    startActivity(likeIng);
                }
                catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/sab_kucch_hai_yahan/?hl=en")));
                }
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://connaissancesmasher.blogspot.com/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
                likeIng.setPackage("com.gstar.blogx");

                try
                {
                    startActivity(likeIng);
                }
                catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://connaissancesmasher.blogspot.com/")));
                }

            }
        });

    }

    public void onBackPressed() {

        Intent i = new Intent(AboutUs.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
