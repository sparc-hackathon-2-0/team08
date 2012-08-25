package com.tres.pantsparty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Video5Info extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video_five_layout);
		
		ImageButton b = (ImageButton) findViewById(R.id.imageButton1);
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Video5Info.this, Video5.class);
				startActivity(intent);
				
			}
			
		});
 	}
}
