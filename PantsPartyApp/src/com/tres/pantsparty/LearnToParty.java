/*
 ******************************************************************************
 * Parts of this code sample are licensed under Apache License, Version 2.0   *
 * Copyright (c) 2009, Android Open Handset Alliance. All rights reserved.    *
 *                                                                            *                                                                         *
 * Except as noted, this code sample is offered under a modified BSD license. *
 * Copyright (C) 2010, Motorola Mobility, Inc. All rights reserved.           *
 *                                                                            *
 * For more details, see MOTODEV_Studio_for_Android_LicenseNotices.pdf        * 
 * in your installation folder.                                               *
 ******************************************************************************
 */

package com.tres.pantsparty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class LearnToParty extends Activity {

	private ViewGroup feature_1;
	private ViewGroup feature_2;
	private ViewGroup feature_3;
	private ViewGroup feature_4;
	private ViewGroup feature_5;
	private ViewGroup feature_6;

	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);

		this.feature_1 = (ViewGroup) findViewById(R.id.feature_1);
		this.feature_2 = (ViewGroup) findViewById(R.id.feature_2);
		this.feature_3 = (ViewGroup) findViewById(R.id.feature_3);
		this.feature_4 = (ViewGroup) findViewById(R.id.feature_4);
		this.feature_5 = (ViewGroup) findViewById(R.id.feature_5);
		this.feature_6 = (ViewGroup) findViewById(R.id.feature_6);

		View.OnClickListener onClickListener = new DashboardClickListener();

		this.feature_1.setOnClickListener(onClickListener);
		this.feature_2.setOnClickListener(onClickListener);
		this.feature_3.setOnClickListener(onClickListener);
		this.feature_4.setOnClickListener(onClickListener);
		this.feature_5.setOnClickListener(onClickListener);
		this.feature_6.setOnClickListener(onClickListener);

	}

	private class DashboardClickListener implements View.OnClickListener {

		public void onClick(View v) {

			/*
			 * TODO: Replace the code below with your business logic
			 * 
			 * You will probably open an activity, which can be done using a
			 * code like below: startActivity(new Intent(v.getContext(),
			 * YourActivity.class));
			 */

			String msg = "You selected Feature ";

			switch (v.getId()) {
			case R.id.feature_1:
				msg += "1";
				startVideoInfoGeneric();
				break;
			case R.id.feature_2:
				msg += "2";
				break;
			case R.id.feature_3:
				msg += "3";
				break;
			case R.id.feature_4:
				msg += "4";
				break;
			case R.id.feature_5:
				msg += "5";
				break;
			case R.id.feature_6:
				msg += "6";
				break;
			default:
				// none
			}

			Toast.makeText(v.getContext(), msg, Toast.LENGTH_SHORT).show();
		}

		private void startVideoInfoGeneric() {
			//Intent i = new Intent(this, VideoInfoGeneric.class);
			//startActivity(i);
		}

	}

}