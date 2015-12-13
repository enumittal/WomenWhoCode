package com.example.womenwhocode.womenwhocode.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.womenwhocode.womenwhocode.R;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.givIntro);
        GifDrawable gifDrawable = (GifDrawable) gifImageView.getBackground();
        gifDrawable.setLoopCount(0);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }

    public void JoinApp(View view) {
        // Puja, you can use this to get the questionnaire data.
        Intent i = new Intent(this, PersonalizationActivity.class);
        i.putExtra("type", "Join");
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    public void LogInToApp(View view) {
        Intent i = new Intent(this, PersonalizationActivity.class);
        i.putExtra("type", "Login");
        startActivity(i);

    }
}
