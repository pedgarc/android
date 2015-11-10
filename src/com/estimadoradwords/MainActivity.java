package com.estimadoradwords;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	
	EditText busquedas;
	EditText inversion;
	EditText cp_max;
	EditText ganancia;
	EditText promedio;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		int id = item.getItemId();
		if (id == R.id.seccion1) {
			setContentView(R.layout.activity_main);
			return true;
		}
		if (id == R.id.seccion2) {
			setContentView(R.layout.seccion_dos);
			return true;
		}
		if (id == R.id.seccion3) {
			setContentView(R.layout.seccion_tres);
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	public void seccion1(View v) {
	//	busquedas   = (EditText)findViewById(R.id.editText1);
		
		TextView res1 = (TextView)findViewById(R.id.textView8);
		res1.setText("PRUEBA");
		
		
	}
	
	public void seccion2(View v) {
		
			
	}
	
	public void seccion3(View v) {
		//TextView txtCambiado = (TextView)findViewById(R.id.textView8);
		//double valor = 8.993;
		//txtCambiado.setText(valor).toSting();
			
	}
	
	
}