package com.example.akirachix;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login extends Activity implements OnClickListener{
	//declare variables.
	Button btnsubmit;
	Button btncancel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.login);
		//initialize variables.
		//btnsubmit=(Button) findViewById(R.id.bsubmit);
		btnsubmit.setOnClickListener(this);
		
		
		//btncancel=(Button) findViewById(R.id.bCancel);
		btncancel.setOnClickListener(this);
		
			
		
	}/*
	@Override
	public void onClick(View v) {
		//switch (v.getId()) {
		//case R.id.bsubmit:
			//startActivity(new Intent(getApplicationContext(),Calculator.class));
			
			break;
			
		case R.id.bCancel:
				startActivity(new Intent(getApplicationContext(),Login.class));
				
				break;

		default:
			break;
		}
	}*/
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}

