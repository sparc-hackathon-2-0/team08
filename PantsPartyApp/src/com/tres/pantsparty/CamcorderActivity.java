package com.tres.pantsparty;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class CamcorderActivity extends Activity implements OnInfoListener,
		OnTouchListener
{
	private CamcorderPreview camcorderPreview;
	private boolean recording = false;
	private MediaRecorder mRecorder;
	public static String fname, fpath;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();

		setTitle("Touch Screen to start/stop recording. Max video duration is "
				+ (10000 / 1000) + " seconds.");
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		setContentView(R.layout.camcorder_preview);
		camcorderPreview = (CamcorderPreview) findViewById(R.id.camcorder_preview);
		mRecorder = camcorderPreview.getRecorder();
		mRecorder.setOnInfoListener(this);
		camcorderPreview.setOnTouchListener(this);
	}

	@Override
	public void onInfo(MediaRecorder mr, int what, int extra)
	{
		switch (what)
		{
		case MediaRecorder.MEDIA_RECORDER_INFO_MAX_DURATION_REACHED:
			stopRecording();
			break;
		}
	}

	private void stopRecording()
	{
		if (recording)
		{
			mRecorder.stop();
			mRecorder.release();
			finish();
		}
	}

	@Override
	public boolean onTouch(View view, MotionEvent event)
	{
		if (event.getAction() == MotionEvent.ACTION_DOWN)
		{
			if (recording)
			{
			}
			else
			{
			}
			return true;
		}
		return false;
	}
}
