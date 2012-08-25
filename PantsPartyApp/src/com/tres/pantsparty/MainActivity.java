package com.tres.pantsparty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mStartParty = (Button) findViewById(R.id.btnStartParty);
        mDoucheMode = (Button) findViewById(R.id.btnDoucheMode);
        mLearnToParty = (Button) findViewById(R.id.btnLearnToParty);
        mPantsParty = (Button) findViewById(R.id.btnPantsParty);
        mRealUltimateParty = (Button) findViewById(R.id.btnRealUltimateParty);

        mStartParty.setOnClickListener(this);
        mDoucheMode.setOnClickListener(this);
        mLearnToParty.setOnClickListener(this);
        mPantsParty.setOnClickListener(this);
        mRealUltimateParty.setOnClickListener(this);
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
		}
	}

	private void startPantsParty() {
		Intent i = new Intent(this, PantsParty.class);
		startActivity(i);
	}

	private void startRealUltimateParty() {
		Intent i = new Intent(this, RealUltimateParty.class);
		startActivity(i);
	}

	private void startStartParty() {
		//int myInt = 0;
		//Intent i = new Intent(this, StartParty.class);
		//startActivityForResult(i, myInt);
	}

	private void startLearnToParty() {
		Intent i = new Intent(this, LearnToParty.class);
		startActivity(i);
	}

	private void startDoucheMode() {
		Intent i = new Intent(this, DoucheMode.class);
		startActivity(i);
	}
}
