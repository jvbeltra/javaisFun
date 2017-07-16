package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Variaveis9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variaveis9);

        findViewById(R.id.imageView5).setVisibility(View.GONE);
        findViewById(R.id.textView25).setVisibility(View.GONE);
        findViewById(R.id.textView26).setVisibility(View.GONE);
        findViewById(R.id.textView27).setVisibility(View.GONE);
        findViewById(R.id.imageButton2).setVisibility(View.GONE);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Variaveis9.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
    public void next2(View view){
        Intent intent = new Intent(this, Variaveis10.class);
        startActivity(intent);
    }
    public void onClickString(View view){
        findViewById(R.id.imageView5).setVisibility(View.GONE);
        findViewById(R.id.textView25).setVisibility(View.GONE);
        findViewById(R.id.textView27).setVisibility(View.GONE);
        findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
        findViewById(R.id.textView26).setVisibility(View.VISIBLE);
        findViewById(R.id.button18).setVisibility(View.GONE);
    }
    public void onClickChar(View view){
        findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
        findViewById(R.id.textView25).setVisibility(View.VISIBLE);
        findViewById(R.id.textView27).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
        findViewById(R.id.textView26).setVisibility(View.GONE);
        findViewById(R.id.button2).setVisibility(View.GONE);

    }
}