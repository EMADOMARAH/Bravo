package com.emad.bravo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		
		VideoView videoView = (VideoView) findViewById(R.id.videoView);  //casting to VideoView is not Strictly required above API level 26
		videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bravo); //set the path of the video that we need to use in our VideoView
		MediaController mediaController = new MediaController(this);
		//link mediaController to videoView
		mediaController.setAnchorView(videoView);
		//allow mediaController to control our videoView
		videoView.setMediaController(mediaController);
		videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mediaPlayer) {
				onBackPressed();
			}
		});
		
		videoView.start();  //start() method of the VideoView class will start the video to play
	}
}