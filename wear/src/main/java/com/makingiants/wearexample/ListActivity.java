package com.makingiants.wearexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WearableListView;
import android.widget.Toast;

public class ListActivity extends Activity implements WearableListView.ClickListener {

    // Sample dataset for the list
    String[] elements = {"List Item 1", "List Item 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Get the list component from the layout of the activity
        WearableListView listView =
                (WearableListView) findViewById(R.id.list);

        // Assign an adapter to the list
        listView.setAdapter(new Adapter(this, elements));

        // Set a click listener
        listView.setClickListener(this);
    }

    // WearableListView click listener
    @Override
    public void onClick(WearableListView.ViewHolder v) {
        Integer tag = (Integer) v.itemView.getTag();
        Toast.makeText(this, tag + "", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onTopEmptyRegionClick() {
    }


}
