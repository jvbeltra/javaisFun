package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class OQueEJava2 extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, OQueEJava.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oque_ejava2);
        setTitle("O que é Java");
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
                Intent intent = new Intent(this, OQueEJava3.class);
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
                                Intent intent = new Intent(OQueEJava2.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, OQueEJava.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void imageDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.jvm);
        builder.setTitle("Como funciona o JVM")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}
