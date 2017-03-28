package chuongnh.hcm.foody.View.Hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chuongnh.hcm.foody.R;
import chuongnh.hcm.foody.View.Main.MainActivity;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {

                } finally {
                    Intent intent = new Intent(HelloActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        thread.start();
    }
}
