package com.tres.pantsparty;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video1 extends Activity implements SurfaceHolder.Callback, OnCompletionListener {

	private VideoView mVideoView;
	private MediaController mMedia;

	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);

		mVideoView = (VideoView) findViewById(R.id.videoView1);
        mVideoView.setOnCompletionListener(this);
		
		mMedia = new MediaController(this, true);
		
		 mMedia.setMediaPlayer(mVideoView);
		 mMedia.setAnchorView(mVideoView);
		 mVideoView.setMediaController(mMedia);

		 mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.video1)); 

		 mVideoView.requestFocus();
		 mVideoView.start(); 
		// Put the media file into the res/raw folder of your application
		//MediaPlayer mp = MediaPlayer.create(this, R.raw);
		//mp.start();
	}

	/**
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		super.onStart();

		// TODO Put your code here
	}

	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCompletion(MediaPlayer arg0) {
		// return the success? Number of vid played?
		finish();
	}
}
