package com.zensive.colorwhisper.ColorWhisperClient;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * TODO Put here a description of what this class does.
 *
 * @author boyusun.
 *         Created 2013-6-7.
 */
public class ColorWhisperClientActivity extends Activity {
    /** Called when the activity is first created. */
    
	private static final String TAG=ColorWhisperClientActivity.class.getSimpleName();
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    
    @Override
	protected void onDestroy(){
		Log.d(TAG,"Destroying...");
		super.onDestroy();
	}
	
	@Override
	protected void onStop(){
		Log.d(TAG,"Stopping...");
		super.onStop();
	}
    
}