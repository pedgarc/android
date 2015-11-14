package com.estimadoradwords;

import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
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
		/*if (id == R.id.seccion3) {
			setContentView(R.layout.seccion_tres);
			return true;
		}*/
		
		return super.onOptionsItemSelected(item);
	}
	
	private boolean isEmpty(EditText etText) {
	    if (etText.getText().toString().trim().length() > 0) {
	        return false;
	    } else {
	        return true;
	    }
	}
	
	public void seccion1(View v) {
		
		TextView flashmessage = (TextView)findViewById(R.id.textView23);
		flashmessage.setText( "" );
		
		EditText _clicks_totales = (EditText)findViewById(R.id.editText1);
		if ( TextUtils.isEmpty(_clicks_totales.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_clicks_totales.setError("Es requerido");
			return;
		}
		float clicks_totales = Float.parseFloat(_clicks_totales.getText().toString());
		

		
		EditText _inversion = (EditText)findViewById(R.id.editText2);
		if ( TextUtils.isEmpty(_inversion.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_inversion.setError("Es requerido");
			return;
		}
		float inversion = Float.parseFloat(_inversion.getText().toString());
		
		
		EditText _cpc = (EditText)findViewById(R.id.editText3);
		if ( TextUtils.isEmpty(_cpc.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_cpc.setError("Es requerido");
			return;
		}
		float cpc = Float.parseFloat(_cpc.getText().toString());
		
		
		
		EditText _ganancia_conversion = (EditText)findViewById(R.id.editText4);
		if ( TextUtils.isEmpty(_ganancia_conversion.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_ganancia_conversion.setError("Es requerido");
			return;
		}
		float ganancia_conversion = Float.parseFloat(_ganancia_conversion.getText().toString());
		
		
		
		EditText _porcentaje_conversion_adwords = (EditText)findViewById(R.id.editText5);
		if ( TextUtils.isEmpty(_porcentaje_conversion_adwords.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_porcentaje_conversion_adwords.setError("Es requerido");
			return;
		}
		float porcentaje_conversion_adwords = Float.parseFloat(_porcentaje_conversion_adwords.getText().toString());
		
		
		
		
		
		
		float clicks = inversion / cpc;
		float tco = cpc / ganancia_conversion * 100;
		float conversiones = clicks * porcentaje_conversion_adwords/100;
		ganancia_conversion = conversiones * ganancia_conversion;
		float costo_mensual = clicks * cpc;
		float ganancia_campana = ganancia_conversion - costo_mensual;
		float roi = ganancia_campana / costo_mensual * 100;
		
		if(clicks > clicks_totales) {
			clicks = clicks_totales;
			flashmessage.setText("La inversión máxima debe ser menor o igual a $" + Float.toString(clicks_totales*cpc));
		}
			
		
		TextView tmp = (TextView)findViewById(R.id.textView8);
		tmp.setText( Float.toString(clicks_totales) );
		
		tmp = (TextView)findViewById(R.id.textView9);
		tmp.setText( Float.toString(cpc) );
		
		tmp = (TextView)findViewById(R.id.textView15);
		tmp.setText( Float.toString(inversion) );
		
		tmp = (TextView)findViewById(R.id.textView19);
		tmp.setText( Float.toString(tco) );
		
		tmp = (TextView)findViewById(R.id.textView12);
		tmp.setText( Float.toString(roi) );
		
		tmp = (TextView)findViewById(R.id.textView13);
		tmp.setText( Float.toString(conversiones) );
		
		tmp = (TextView)findViewById(R.id.textView17);
		tmp.setText( Float.toString(ganancia_conversion) );
		
		tmp = (TextView)findViewById(R.id.textView21);
		tmp.setText( Float.toString(ganancia_campana) );
		
		
	}
	
	public void seccion2(View v) {
		
		TextView flashmessage = (TextView)findViewById(R.id.textView23);
		flashmessage.setText( "" );
		
		EditText _clicks_totales = (EditText)findViewById(R.id.editText1);
		if ( TextUtils.isEmpty(_clicks_totales.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_clicks_totales.setError("Es requerido");
			return;
		}
		float clicks_totales = Float.parseFloat(_clicks_totales.getText().toString());
		
		EditText _inversion = (EditText)findViewById(R.id.editText2);
		if ( TextUtils.isEmpty(_inversion.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_inversion.setError("Es requerido");
			return;
		}
		float inversion = Float.parseFloat(_inversion.getText().toString());
		
		EditText _cpc = (EditText)findViewById(R.id.editText3);
		if ( TextUtils.isEmpty(_cpc.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_cpc.setError("Es requerido");
			return;
		}
		float cpc = Float.parseFloat(_cpc.getText().toString());
		
		EditText _ganancia_conversion = (EditText)findViewById(R.id.editText4);
		if ( TextUtils.isEmpty(_ganancia_conversion.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_ganancia_conversion.setError("Es requerido");
			return;
		}
		float ganancia_conversion = Float.parseFloat(_ganancia_conversion.getText().toString());
		
		EditText _porcentaje_conversion_adwords = (EditText)findViewById(R.id.editText5);
		if ( TextUtils.isEmpty(_porcentaje_conversion_adwords.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_porcentaje_conversion_adwords.setError("Es requerido");
			return;
		}
		float porcentaje_conversion_adwords = Float.parseFloat(_porcentaje_conversion_adwords.getText().toString());
		
		
		EditText _porcentaje_conversion_empresa = (EditText)findViewById(R.id.edit_empresa);
		if ( TextUtils.isEmpty(_porcentaje_conversion_empresa.getText().toString()) ) {
			
			flashmessage.setText( "Por favor completa todos los campos" );
			_porcentaje_conversion_empresa.setError("Es requerido");
			return;
		}
		float porcentaje_conversion_empresa = Float.parseFloat(_porcentaje_conversion_empresa.getText().toString());
		
		float clicks = inversion / cpc;
		float tco = cpc / ganancia_conversion * 100;
		float conversiones = clicks * porcentaje_conversion_adwords/100;
		float conversiones_empresa = conversiones * porcentaje_conversion_empresa / 100;
		ganancia_conversion = conversiones_empresa * ganancia_conversion;
		float costo_mensual = clicks * cpc;
		float ganancia_campana = ganancia_conversion - costo_mensual;
		float roi = ganancia_campana / costo_mensual * 100;
		
		
		if(clicks > clicks_totales) {
			clicks = clicks_totales;
			flashmessage.setText("La inversión máxima debe ser menor o igual a $" + Float.toString(clicks_totales*cpc));
		}
			
		
		TextView tmp = (TextView)findViewById(R.id.textView8);
		tmp.setText( Float.toString(clicks_totales) );
		
		tmp = (TextView)findViewById(R.id.textView9);
		tmp.setText( Float.toString(cpc) );
		
		tmp = (TextView)findViewById(R.id.textView15);
		tmp.setText( Float.toString(inversion) );
		
		tmp = (TextView)findViewById(R.id.textView19);
		tmp.setText( Float.toString(tco) );
		
		tmp = (TextView)findViewById(R.id.textView12);
		tmp.setText( Float.toString(roi) );
		
		tmp = (TextView)findViewById(R.id.textView13);
		tmp.setText( Float.toString(conversiones_empresa) );
		
		tmp = (TextView)findViewById(R.id.textView17);
		tmp.setText( Float.toString(ganancia_conversion) );
		
		tmp = (TextView)findViewById(R.id.textView21);
		tmp.setText( Float.toString(ganancia_campana) );
			
	}
	
	public void seccion3(View v) {
		//TextView txtCambiado = (TextView)findViewById(R.id.textView8);
		//double valor = 8.993;
		//txtCambiado.setText(valor).toSting();
			
	}
	
	
}