package com.example.taschenrechner;

import android.R.color;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	private final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void beende(View view) {

		finish();

	}

	public void loadWebViewActivity() {
		Intent intent = new Intent(context, WebViewActivity.class);
		startActivity(intent);
	}

	 public void setActivityBackgroundColor(int color) {
	 View view = this.getWindow().getDecorView();
	 view.setBackgroundColor(color);
	 }



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_end:
			View view = null;
			beende(view);
			return true;
		case R.id.action_help:
			loadWebViewActivity();
			return true;
		case R.id.action_settings:
			setActivityBackgroundColor(0xfff00000);;
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}