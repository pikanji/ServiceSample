
package net.pikanji.servicesample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class SampleService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service.onStartCommand invoked", Toast.LENGTH_SHORT).show();

        if ("stop".equals(intent.getAction())) {
            this.stopSelf(startId);
        }

        return Service.START_STICKY_COMPATIBILITY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service.onDestroy invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
