package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Operadores6 extends AppCompatActivity {
    private Spinner spinner3;
    private Button btnSubmit2;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadores6);
        setTitle("Operadores");
        findViewById(R.id.textView75).setVisibility(View.GONE);
        findViewById(R.id.textView73).setVisibility(View.GONE);
        findViewById(R.id.sad).setVisibility(View.GONE);
        findViewById(R.id.happy).setVisibility(View.GONE);
        verificarSpinner();
        addListenerOnSpinnerItemSelection();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, Operadores7.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finishAffinity();
                return true;

            case R.id.menu_home:
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(this);

                builder.setTitle("Home")
                        .setMessage("Você tem certeza que quer voltar ao menu principal?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Operadores6.this, MainActivity.class);
                                startActivity(intent);
                                finishAffinity();
                                overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .setIcon(R.drawable.warning)
                        .show();
                return true;
            case R.id.menu_back:
                Intent intent2 = new Intent(this, Operadores5.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }


    public void addListenerOnSpinnerItemSelection() {
        spinner3 = (Spinner) findViewById(R.id.spinner3);

    }
    public void verificarSpinner() {


        spinner3 = (Spinner) findViewById(R.id.spinner3);
        btnSubmit2 = (Button) findViewById(R.id.button3);

        btnSubmit2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner3.getSelectedItem()).equalsIgnoreCase("!=")){
                    findViewById(R.id.textView75).setVisibility(View.VISIBLE);
                    findViewById(R.id.textView73).setVisibility(View.GONE);
                    findViewById(R.id.sad).setVisibility(View.GONE);
                    findViewById(R.id.happy).setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.textView73).setVisibility(View.VISIBLE);
                    findViewById(R.id.textView75).setVisibility(View.GONE);
                    findViewById(R.id.sad).setVisibility(View.VISIBLE);
                    findViewById(R.id.happy).setVisibility(View.GONE);
                }

            }

        });
    }



}
