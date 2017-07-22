package com.example.tushar.listviewimplementation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.tushar.listviewimplementation.R;
import com.example.tushar.listviewimplementation.adapter.CustomMarvelAdapter;

/**
 * This is the main activity which gives data and views to adapter class for listview creation
 */
public class ListViewActivity extends AppCompatActivity {

    String characterNames[] = {"Beast", "Blask Panther", "Dr Strange", "Hulk",
            "Iron Man", "Silver Surfer" ,"SpiderMan","Storm","Thor","Wolworine"};
    int characterImages[] = {R.drawable.beast,R.drawable.black_panther,R.drawable.dr_strange,
            R.drawable.hulk,R.drawable.iron_man,R.drawable.silver_surfer, R.drawable.spiderman,
            R.drawable.storm,R.drawable.thor,R.drawable.wolworine,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView marvelCharacterListView = (ListView) findViewById(R.id.simpleListView);
        CustomMarvelAdapter customMarvelAdapter = new CustomMarvelAdapter(getApplicationContext(), characterNames, characterImages);
        marvelCharacterListView.setAdapter(customMarvelAdapter);

        marvelCharacterListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, characterNames[position]+" ciicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
