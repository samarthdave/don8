package com.example.don8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RestaurantSignUpActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText password;
    private EditText phoneNumber;
    private EditText address;
    private EditText city;
    private EditText state;
    private EditText zipCode;
    private CheckBox veggies;
    private CheckBox fruit;
    private CheckBox grains;
    private CheckBox cans;
    private CheckBox meals;
    private RadioGroup dropOff;
    private RadioButton yes;
    private RadioButton no;
    private Button create;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        phoneNumber = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        zipCode = findViewById(R.id.zip_code);
        veggies = findViewById(R.id.veggies);
        fruit = findViewById(R.id.fruit);
        grains = findViewById(R.id.grains);
        cans = findViewById(R.id.canned_goods);
        meals = findViewById(R.id.meals);
        dropOff = findViewById(R.id.drop_off_radio);
        yes = findViewById(R.id.yes_button);
        no = findViewById(R.id.no_button);
        create = findViewById(R.id.create_profile);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
