package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");

        TextView tvMaterials = findViewById(R.id.tvMaterial);
        TextView tvArrive = findViewById(R.id.tvArrive);
        TextView tvAttempt = findViewById(R.id.tvAttempt);
        TextView tvReflection = findViewById(R.id.tvReflection);

        tvMaterials.setText(info[0]);
        tvArrive.setText(info[1]);
        tvAttempt.setText(info[2]);
        tvReflection.setText(info[3]);
    }
}
