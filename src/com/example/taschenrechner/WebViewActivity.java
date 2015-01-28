package com.example.taschenrechner;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class WebViewActivity extends ActionBarActivity {

	private WebView webview;
	private final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);

		webview = (WebView) findViewById(R.id.webView1);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://www.compaso.de");

		// String customHtml =
		// "<html><body><h1>Hello, WebView</h1></body></html>";
		// webview.loadData(customHtml, "text/html", "UTF-8");

	}
	
	public void beende(View view) {

		finish();

	}
	public void setActivityBackgroundColor(int color) {
		 View view = this.getWindow().getDecorView();
		 view.setBackgroundColor(color);
		 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_view, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			//setActivityBackgroundColor(0xfff00000);
			beende(webview);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
