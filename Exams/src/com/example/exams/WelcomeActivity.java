package com.example.exams;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
	Button btback,btdisplay;
	TextView etusername,etpassword,etemail;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;

		 btdisplay= (Button) findViewById(R.id.btverify);
	        btdisplay.setOnClickListener(this);
	      
	        btback = (Button) findViewById(R.id.btback);
	        btback.setOnClickListener(this);
	        Intent intent = new Intent(this,welcome.class);
	    }
	}

}
