package com.example.akirachix;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Home extends Activity {

EditText et1, et2;
Button butadd, butsub,butdivide, butmultiply;
TextView etresult;

 
@Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.Home);
  
 
 et1 = (EditText) findViewById(R.id.et1);
 et2 = (EditText) findViewById(R.id.et2);
 etresult =  (TextView) findViewById(R.id.etresult);

 butadd = (Button) findViewById(R.id.butadd);
 
 butdivide =(Button) findViewById(R.id.butdivide);
 butmultiply=(Button)findViewById(R.id.butmultiply);
  butsub=(Button)findViewById(R.id.butsub);
 
 butadd.setOnClickListener(new OnClickListener() {
	 @Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String f = et1.getText().toString();
			   int Numberone = Integer.parseInt(f);
			   String s = et2.getText().toString();
			   int Numbertwo = Integer.parseInt(s);
			    
			   int result = operations.addition(Numberone, Numbertwo);
					   
			   String res = new Integer(result).toString();
			   etresult.setText(res);
			   
   
  }
 });
 butsub.setOnClickListener(new OnClickListener() {

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String f = et1.getText().toString();
		   int Numberone = Integer.parseInt(f);
		   String s = et2.getText().toString();
		   int Numbertwo = Integer.parseInt(s);
		    
		   int result = operations.sub(Numberone, Numbertwo);
		   String res = new Integer(result).toString();
		   etresult.setText(res);
		   

		    
		
	}
 });
 butdivide.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String f = et1.getText().toString();
			   int Numberone = Integer.parseInt(f);
			   String s = et2.getText().toString();
			   int Numbertwo = Integer.parseInt(s);
			   int result = operations.divide(Numberone, Numbertwo);
			   String res = new Integer(result).toString();
			   etresult.setText(res);
			   

			
		}
	 });
 butmultiply.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String f = et1.getText().toString();
			   int Numberone = Integer.parseInt(f);
			   String s = et2.getText().toString();
			   int Numbertwo = Integer.parseInt(s);
			    
			   int result = operations.multiply(Numberone, Numbertwo);
			   String res = new Integer(result).toString();
			   etresult.setText(res);
			   

			    
		}
	 });

	 butadd.setOnClickListener(new OnClickListener() {
	;
  @Override
  public void onClick(View v) {
  
   et1.setText("");
   et2.setText("");
   
  }
 });
  
}




}