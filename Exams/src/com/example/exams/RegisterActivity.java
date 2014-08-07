package com.example.exams;



import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegisterActivity extends Activity implements OnClickListener {
	Button btnRegister,btnlogin;
	
	;
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		findViewById(R.id.btnRegister);
	
	}

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	    btnRegister = (Button) findViewById(R.id.btnRegister);
	    btnRegister.setOnClickListener(this);
	  
	   btnlogin = (Button) findViewById(R.id.btnlogin);
	   btnlogin.setOnClickListener(this);
	  
	  
	}


	
}
