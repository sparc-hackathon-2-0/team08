package com.tres.pantsparty;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button mStartParty;
	private Button mDoucheMode;
	private Button mLearnToParty;
	private Button mExit;
	private Button mPantsParty;
	private Button mRealUltimateParty;

	private MediaPlayer mp;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

		mStartParty = (Button) findViewById(R.id.btnStartParty);
		mDoucheMode = (Button) findViewById(R.id.btnDoucheMode);
		mLearnToParty = (Button) findViewById(R.id.btnLearnToParty);
		mPantsParty = (Button) findViewById(R.id.btnPantsParty);
		mRealUltimateParty = (Button) findViewById(R.id.btnRealUltimateParty);
		mExit = (Button) findViewById(R.id.btnExit);

		mStartParty.setOnClickListener(this);
		mDoucheMode.setOnClickListener(this);
		mLearnToParty.setOnClickListener(this);
		mPantsParty.setOnClickListener(this);
		mRealUltimateParty.setOnClickListener(this);
		mExit.setOnClickListener(this);

		// Put the media file into the res/raw folder of your application
		mp = MediaPlayer.create(this, R.raw.party_hard_clip);

	}

	private void playSong(String songPath) {
		try {

			mp.reset();
			mp.setDataSource(songPath);
			mp.prepare();
			mp.start();

			// Setup listener so next song starts automatically
			mp.setOnCompletionListener(new OnCompletionListener() {

				public void onCompletion(MediaPlayer arg0) {
					// nextSong();
				}

			});

		} catch (IOException e) {
			Log.v(getString(R.string.app_name), e.getMessage());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnDoucheMode:
			startDoucheMode();
			break;
		case R.id.btnLearnToParty:
			startLearnToParty();
			break;
		case R.id.btnStartParty:
			startStartParty();
			break;
		case R.id.btnPantsParty:
			startPantsParty();
			break;
		case R.id.btnRealUltimateParty:
			startRealUltimateParty();
			break;
		case R.id.btnExit:
			startExit();
			break;
		}
	}

	private void startExit() {
		Intent i = new Intent(this, Exit.class);
		startActivity(i);
	}

	private void startPantsParty() {
		Intent i = new Intent(this, PantsParty.class);
		startActivity(i);
	}

	@Override
	protected void onPause() {
		mp.stop();
		mp.reset();
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	private void startRealUltimateParty() {
		Intent i = new Intent(this, RealUltimateParty.class);
		startActivity(i);
	}

	private void startStartParty() {
		// int myInt = 0;
		// Intent i = new Intent(this, StartParty.class);
		// startActivityForResult(i, myInt);
		Intent i = new Intent(this, Video1.class);
		startActivityForResult(i, Globals.VIDEO1);
	}

	private void startLearnToParty() {
		Intent i = new Intent(this, LearnToParty.class);
		startActivity(i);
	}

	private void startDoucheMode() {
		Intent i = new Intent(this, DoucheMode.class);
		startActivity(i);
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		//if (requestCode == Globals.MOREVIDEO) {
			switch (resultCode) {
			case Globals.VIDEO1:
				Intent i = new Intent(this, Video2.class);
				//i.putExtra(Globals.VIDEO, Globals.VIDEO1);
				startActivityForResult(i, Globals.MOREVIDEO);
				break;
			case Globals.VIDEO2:
				Intent i2 = new Intent(this, Video3.class);
				startActivityForResult(i2, Globals.MOREVIDEO);
				break;
			case Globals.VIDEO3:
				Intent i3 = new Intent(this, Video4.class);
				startActivityForResult(i3, Globals.MOREVIDEO);
				break;
			case Globals.VIDEO4:
				Intent i4 = new Intent(this, Video5.class);
				startActivityForResult(i4, Globals.MOREVIDEO);
				break;
			case Globals.VIDEO5:
				Intent i5 = new Intent(this, Video6.class);
				startActivityForResult(i5, Globals.MOREVIDEO);
				break;
			case Globals.VIDEO6:
				Intent i6 = new Intent(this, Video1.class);
				startActivityForResult(i6, Globals.MOREVIDEO);
				break;
			}
		//}
	}
}
