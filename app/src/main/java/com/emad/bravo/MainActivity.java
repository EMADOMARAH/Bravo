package com.emad.bravo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	
	TextView btn ;
	EditText reason ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		btn = findViewById(R.id.textView1);
		reason = findViewById(R.id.editTextTextPersonName);
		
		
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (reason.getText().length() > 0){
					startActivity(new Intent(getApplicationContext() , Video.class));
				}else {
					Toast.makeText(getApplicationContext(), "اكتب اى انجاز ياباندا", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
	}
}