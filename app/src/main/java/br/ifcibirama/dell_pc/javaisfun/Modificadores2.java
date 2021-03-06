package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class Modificadores2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificadores2);
        setTitle("Modificadores");
        findViewById(R.id.textView37).setVisibility(View.GONE);
        findViewById(R.id.textView38).setVisibility(View.GONE);
        findViewById(R.id.textView39).setVisibility(View.GONE);
        findViewById(R.id.textView40).setVisibility(View.GONE);
        findViewById(R.id.textView41).setVisibility(View.GONE);
        findViewById(R.id.textView42).setVisibility(View.GONE);
        findViewById(R.id.textView43).setVisibility(View.GONE);
        findViewById(R.id.imageButton2).setVisibility(View.GONE);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, Modificadores3.class);
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
                                Intent intent = new Intent(Modificadores2.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Modificadores.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back, menu);


        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        findViewById(R.id.textView37).setVisibility(View.VISIBLE);
        findViewById(R.id.textView38).setVisibility(View.VISIBLE);
        findViewById(R.id.textView39).setVisibility(View.VISIBLE);
        findViewById(R.id.textView40).setVisibility(View.VISIBLE);
        findViewById(R.id.textView41).setVisibility(View.VISIBLE);
        findViewById(R.id.textView42).setVisibility(View.VISIBLE);
        findViewById(R.id.textView43).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
        return super.onTouchEvent(event);
    }
}
