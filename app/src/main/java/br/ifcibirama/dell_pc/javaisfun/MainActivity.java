package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int progresso=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Menu");



        findViewById(R.id.textView223).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Copyright - 2017");
                builder.setMessage("MIT License\n" +
                        "\n" +
                        "Copyright (c) 2017 Alfredo Vieira Neto & João Vitor Beltramini\n" +
                        "\n" +
                        "Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                        "of this software and associated documentation files (the \"Software\"), to deal\n" +
                        "in the Software without restriction, including without limitation the rights\n" +
                        "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                        "copies of the Software, and to permit persons to whom the Software is\n" +
                        "furnished to do so, subject to the following conditions:\n" +
                        "\n" +
                        "The above copyright notice and this permission notice shall be included in all\n" +
                        "copies or substantial portions of the Software.\n" +
                        "\n" +
                        "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                        "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                        "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                        "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                        "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                        "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
                        "SOFTWARE.")


                        .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();
            }
        });


    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_notificacoes:
                Intent intent = new Intent(this, Notificacoes.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finishAffinity();
                return true;
            case R.id.menu_warning:
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("AVISO");
                builder.setMessage(
                        "É possível que alguns objetos não fiquem  adequados ao tamanho da tela, podendo prejudicar parte do uso do app." +
                                "\n" +
                                "Isso ocorre porque os tamanhos de tela variam, exigindo uma configuração para cada tipo de tela. " +
                                "Mas caro usuário, fique atento que isso será corrigido em versões futuras! Bom aprendizado! ;)\n"
                )

                        .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }


    public void TelaBasica(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
        intent.putExtra("Progresso", progresso);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();
    }
    public void TelaIntermediaria(View view){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);
        intent.putExtra("Progresso", progresso);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finishAffinity();
    }
    public void TelaAvancada(View view){
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
        intent.putExtra("Progresso", progresso);
        overridePendingTransition(R.anim.up_in, R.anim.up_out);
        finishAffinity();
    }
    public void AboutTheApp(View view){
        Intent intent = new Intent(this, AboutTheApp.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);

        finishAffinity();
    }
    public void AboutUs(View view){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

        finishAffinity();
    }

}
