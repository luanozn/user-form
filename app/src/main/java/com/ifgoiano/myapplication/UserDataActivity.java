package com.ifgoiano.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ifgoiano.myapplication.entities.Address;
import com.ifgoiano.myapplication.entities.User;

public class UserDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        Bundle bundle = getIntent().getExtras();

        User user = new Gson().fromJson(bundle.getString("userData"), User.class);

        TextView name = findViewById(R.id.completeName);
        TextView phone = findViewById(R.id.phoneView);
        TextView address = findViewById(R.id.addressView);

        ImageView imageView = findViewById(R.id.imageView2);

        imageView.setImageResource(R.drawable.gokubase);

        Address addressUser = user.getAddress();

        name.setText(user.getName());
        phone.setText(String.format("(%s) %s", user.getPhone().getDdd(), user.getPhone().getPhone()));
        address.setText((String.format(" Cidade: %s \n Estado: %s\n Rua: %s\n Numero: %s \n Complemento: %s\n CEP: %s ", addressUser.getCity(), addressUser.getState().getShortcut(), addressUser.getStreet(), addressUser.getNumber(), addressUser.getComplement(), addressUser.getCep())));
    }
}