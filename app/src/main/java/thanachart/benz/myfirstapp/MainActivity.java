package thanachart.benz.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    } // Main method

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.dog);

                mediaPlayer.start();

                //webview
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=uzSKvYbd1XQ"));
                startActivity(intent);
            } //onClick
        });

    } //buttonController

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }
} // Main Class นี่คือคลาสหลัก
