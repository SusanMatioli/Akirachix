package com.example.exams;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity  implements OnClickListener{
	Button btback,btverify;
	TextView etusername,etpassword;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
		 btverify = (Button) findViewById(R.id.btverify);
	     btverify.setOnClickListener(this);
	        btback = (Button) findViewById(R.id.btback);
	        btback.setOnClickListener(this);
       
	    }

		 public void onClick(View v) {
		        String showText ="True";
		        Intent intent = new Intent(this,welcome.class);
		        etusername=etusername.getText().toString();
		// TODO Auto-generated method stub
		
	}

	

}})
