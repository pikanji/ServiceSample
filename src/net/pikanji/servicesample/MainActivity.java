
package net.pikanji.servicesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button buttonStart = (Button) findViewById(R.id.button_start);
        buttonStart.setOnClickListener(this);
        Button buttonStop = (Button) findViewById(R.id.button_stop);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start:
                startService(new Intent(this, SampleService.class));
                break;
            case R.id.button_stop:
                stopService(new Intent(this, SampleService.class));
                break;
        }
    }
}
