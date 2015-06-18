package me.abdulnasir.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void spotifyMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch 'Spotify Streamer' !";

        Toast toast = Toast.makeText(context, text, duration);
        //toast.setView(view);
        toast.show();
    }

    public void capstoneMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch my 'Capstone App' !";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void baconMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch 'Bacon Reader' !";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void buildMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch 'Build It Bigger' !";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void libraryMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch 'Library' !";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void scoresMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch 'Scores' !";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
