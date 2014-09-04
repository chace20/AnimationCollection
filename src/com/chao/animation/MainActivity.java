package com.chao.animation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {

	private ListView listview;
	private String data[] = { "alph", "head", "push_left", "push_right",
			"push_top","slide_bottom","tv_off","zoom" };
	private ArrayAdapter<String> arr_adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listview = (ListView) findViewById(R.id.listView_anim);

		arr_adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, data);
		
		listview.setAdapter(arr_adapter);

		listview.setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

		Intent intent = new Intent(this, SecondActivity.class);

		startActivity(intent);
		
		switch (arg2) {
		case 0:
			overridePendingTransition(R.anim.alph_in, R.anim.alph_in);
			break;

		case 1:
			overridePendingTransition(R.anim.head_in, R.anim.head_out);
			break;
			
		case 2:
			overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
			break;
			
		case 3:
			overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
			break;
			
		case 4:
			overridePendingTransition(R.anim.push_top_in, R.anim.push_top_out);
			break;
			
		case 5:
			overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
			break;
			
		case 6:
			overridePendingTransition(R.anim.tv_off, R.anim.tv_off);
			break;
			
		case 7:
			overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
			break;
		}

	}

}
