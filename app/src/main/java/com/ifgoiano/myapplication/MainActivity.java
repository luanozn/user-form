package com.ifgoiano.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.gson.Gson;
import com.ifgoiano.myapplication.entities.AccessData;
import com.ifgoiano.myapplication.entities.Address;
import com.ifgoiano.myapplication.entities.Phone;
import com.ifgoiano.myapplication.entities.State;
import com.ifgoiano.myapplication.entities.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner stateSpinner = findViewById(R.id.stateSpinner);
        ImageView picture = findViewById(R.id.imageView);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.states, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        stateSpinner.setAdapter(adapter);
        picture.setImageResource(R.drawable.gokubase);
    }

    @Override
    protected void onStart() {
        super.onStart();

        EditText street = findViewById(R.id.streetField);
        EditText number = findViewById(R.id.numberField);
        EditText cep = findViewById(R.id.cepField);
        EditText complement = findViewById(R.id.complementField);
        EditText city = findViewById(R.id.cityField);
        EditText name = findViewById(R.id.nameField);
        EditText ddd = findViewById(R.id.ddd);
        EditText phone = findViewById(R.id.phoneField);
        EditText email = findViewById(R.id.emailField);
        EditText password = findViewById(R.id.passwordField);

        Spinner state = findViewById(R.id.stateSpinner);

        Button submit = findViewById(R.id.submitButton);

        submit.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, UserDataActivity.class);

                User user = new User(
                        "none",
                        name.getText().toString(),
                        new Phone(
                                ddd.getText().toString(),
                                phone.getText().toString()
                        ),
                        new Address(
                                street.getText().toString(),
                                number.getText().toString(),
                                cep.getText().toString(),
                                complement.getText().toString(),
                                city.getText().toString(),
                                State.from(state.getSelectedItem().toString())
                        ),
                        new AccessData(
                                email.getText().toString(),
                                password.getText().toString()
                        )
                );
                intent.putExtra("userData", new Gson().toJson(user));
                startActivity(intent);
        });
    }
}