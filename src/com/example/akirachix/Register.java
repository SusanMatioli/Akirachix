package com.example.akirachix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Register extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		Button bSubmit = (Button) findViewById(R.id.bSubmit);
		bSubmit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				

				Intent i=new Intent(getApplicationContext(),Login.class);
				startActivity(i);
				
				
			}
		} );
		
		Button bcancel = (Button) findViewById(R.id.bcancel);
		bSubmit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				

				Intent i=new Intent(getApplicationContext(),Welcome.class);
				startActivity(i);
				
				
			}
		} );
		
		
		
		
	}
	}
			