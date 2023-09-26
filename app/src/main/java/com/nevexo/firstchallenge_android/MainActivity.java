package com.nevexo.firstchallenge_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstName;
    private EditText etLastName;
    private EditText etEmail;

    private TextView tvFirstName;
    private TextView tvLastName;
    private TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.editTextFirstName);
        etLastName = findViewById(R.id.editTextLastName);
        etEmail = findViewById(R.id.editTextEmail);

        tvFirstName = findViewById(R.id.textViewFirstName);
        tvLastName = findViewById(R.id.textViewLastName);
        tvEmail = findViewById(R.id.textViewEmail);
    }

    public void onBtnClick(View view) {
        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();
        String email = etEmail.getText().toString();

        tvFirstName.setText(firstName);
        tvLastName.setText(lastName);
        tvEmail.setText(email);
    }
}