package gabriel.ignacio.com.ignaciogabrielexam2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/place/Institute+of+Information+and+Computing+Sciences+(IICS)/@14.610057,120.9897273,17z/data=!3m1!4b1!4m5!3m4!1s0x3397b601e826827b:0x47e5c15cb002baff!8m2!3d14.610057!4d120.991916"));
            chooser = Intent.createChooser(i, "Choose a Map APP");
            startActivity(chooser);

        }
    }
}