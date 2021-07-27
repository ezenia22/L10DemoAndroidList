package sg.edu.rp.c346.id20011155.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersion;
    ArrayList<AndroidVersion> alAndroidVersion;
    //ArrayAdapter<AndroidVersion> aaAndroidVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersion = findViewById(R.id.lv);

        alAndroidVersion = new ArrayList<>();
        alAndroidVersion.add(new AndroidVersion("Pie", "9.0"));
        alAndroidVersion.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAndroidVersion.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

//        aaAndroidVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersion);
//        lvAndroidVersion.setAdapter(aaAndroidVersion);

        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersion);
        lvAndroidVersion.setAdapter(adapter);
    }
}