package com.tres.pantsparty;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoInfoGeneric extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView vidTitle = (TextView) findViewById(R.id.VideoTitle);
		ImageView vidThumb = (ImageView) findViewById(R.id.videoThumb);
		EditText vidDes = (EditText) findViewById(R.id.vidDescription);
		
		
		
		
		
	}
}
