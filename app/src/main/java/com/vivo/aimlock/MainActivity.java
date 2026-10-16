
package com.vivo.aimlock;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        TextView title = new TextView(this);
        title.setText("AimLock - Aim Trainer");
        title.setTextSize(26);
        layout.addView(title);

        TextView info = new TextView(this);
        info.setText(
            "Vivo V2120 | Android 12\n" +
            "Cong cu ho tro luyen keo tam"
        );
        info.setTextSize(16);
        layout.addView(info);

        Button launch = new Button(this);
        launch.setText("Mo Free Fire");
        layout.addView(launch);

        launch.setOnClickListener(v -> {
            String pkg = "com.dts.freefireth";
            Intent intent = getPackageManager()
                .getLaunchIntentForPackage(pkg);

            if (intent != null) {
                startActivity(intent);
            } else {
                Toast.makeText(
                    this,
                    "Khong tim thay Free Fire TH",
                    Toast.LENGTH_LONG
                ).show();
            }
        });

        setContentView(layout);
    }
    }
      
