package sg.edu.rp.c346.id18037611.demoboxlistdemoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);
        alBoxList = new ArrayList<>();
        Box item1 = new Box("blue");
        alBoxList.add(item1);
        Box item2 = new Box("brown");
        alBoxList.add(item2);
        Box item3 = new Box("orange");
        alBoxList.add(item3);

        caBox = new CustomAdapter(this, R.layout.row, alBoxList);
        lvBox.setAdapter(caBox);
    }
}
