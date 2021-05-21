package com.example.register;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);



		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				redirectTo();
			}
		}, 3000);
	}

	public void redirectTo(){
		Intent intent=new Intent(WelcomeActivity.this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
