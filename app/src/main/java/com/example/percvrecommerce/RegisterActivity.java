package com.example.percvrecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.app.ProgressDialog;
import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.text.TextUtils;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    EditText name,num,Email,Pass;
    Button Reg;
    TextView lbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name =  findViewById(R.id.name);
        num = findViewById(R.id.num);
        Email = findViewById(R.id.Email);
        Pass = findViewById(R.id.Pass);

        Reg = findViewById(R.id.Reg);
        lbtn = findViewById(R.id.lbtn);


        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String na, nu, ea, pa;

                na = name.getText().toString();
                nu = num.getText().toString();
                ea = Email.getText().toString();
                pa = Pass.getText().toString();


                if (na.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Name is Blank", Toast.LENGTH_LONG).show();
                }
                else if (nu.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Number is Blank", Toast.LENGTH_LONG).show();
                }
                else if (ea.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Email is Blank", Toast.LENGTH_LONG).show();
                }
                else if (pa.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Password is Blank", Toast.LENGTH_LONG).show();
                }
                else {
                    //Authenticaion
                }


            }
        });
        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}