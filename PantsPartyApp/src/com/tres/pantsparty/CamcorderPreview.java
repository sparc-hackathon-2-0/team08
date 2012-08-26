package com.tres.pantsparty;

import java.io.IOException;

import android.content.Context;
import android.media.MediaRecorder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CamcorderPreview extends SurfaceView implements
		SurfaceHolder.Callback

{
	MediaRecorder recorder;
	SurfaceHolder holder;

	public CamcorderPreview(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		holder = getHolder();
		holder.addCallback(this);
		holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
		recorder = new MediaRecorder();
		recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
		recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
		recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
		recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
		recorder.setVideoEncoder(MediaRecorder.VideoEncoder.MPEG_4_SP);
		recorder.setMaxDuration(10000);	

		// recorder.setVideoSize(480, 320);
		// recorder.setVideoFrameRate(15);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height)
	{
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder)
	{

		recorder.setPreviewDisplay(holder.getSurface());

		if (recorder != null)
		{
			try
			{
				recorder.prepare();
			}
			catch (IllegalStateException e)
			{
				Log.e("IllegalStateException", e.toString());
			}
			catch (IOException e)
			{
				Log.e("IOException", e.toString());
			}
		}
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder)
	{
	}

	public MediaRecorder getRecorder()
	{
		return recorder;
	}
}