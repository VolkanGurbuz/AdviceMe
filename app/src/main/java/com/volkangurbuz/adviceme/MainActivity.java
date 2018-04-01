package com.volkangurbuz.adviceme;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rootLayout;
    private Button signInBtn, registerBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.rootLayout);
        signInBtn = findViewById(R.id.btnSignIn);
        registerBtn = findViewById(R.id.btnRegister);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });


    }

    private void login() {


        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Login");
        alertDialog.setMessage("please enter your mail and password to login");

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View loginLayout = layoutInflater.inflate(R.layout.layout_login, null);

        final MaterialEditText edtMail = loginLayout.findViewById(R.id.edtEmailRegister);
        final MaterialEditText edtPassword = loginLayout.findViewById(R.id.edtPassRegister);

        alertDialog.setView(loginLayout);

        alertDialog.setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                finish();

            }
        });



        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();


            }
        });

        alertDialog.show();

    }

    private void register() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Register");
        alertDialog.setMessage("please fill all the fields to register!");

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View registerLayout = layoutInflater.inflate(R.layout.layout_register,null);

        final MaterialEditText edtMail = registerLayout.findViewById(R.id.edtEmailRegister);
        final MaterialEditText edtPassword = registerLayout.findViewById(R.id.edtPassRegister);
        final MaterialEditText edtName = registerLayout.findViewById(R.id.edtNameRegister);
        final MaterialEditText edtPhone = registerLayout.findViewById(R.id.edtPhoneRegister);


        alertDialog.setView(registerLayout);

        alertDialog.setPositiveButton("Register", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();



                //check validation
                if(TextUtils.isEmpty(edtMail.getText().toString())){

                    Snackbar.make(rootLayout, "please enter mail adress", Snackbar.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(edtPhone.getText().toString())){

                    Snackbar.make(rootLayout, "please enter phone number", Snackbar.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(edtPassword.getText().toString())){

                    Snackbar.make(rootLayout, "please enter password", Snackbar.LENGTH_SHORT).show();
                    return;
                }

                if(edtPassword.getText().length() < 6 ){

                    Snackbar.make(rootLayout, "password too short", Snackbar.LENGTH_SHORT).show();
                    return;
                }


            }
        });


        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();

            }
        });
        alertDialog.show();

    }
}
