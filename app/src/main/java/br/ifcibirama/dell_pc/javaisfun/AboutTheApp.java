package br.ifcibirama.dell_pc.javaisfun;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import br.ifcibirama.dell_pc.javaisfun.R;

public class AboutTheApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_app);
        TextView link = (TextView) findViewById(R.id.linkGithub);
        String linkText = "<a href='https://github.com/jvbeltra/JavaIsFun'>Repositório Github</a>";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link2 = (TextView) findViewById(R.id.linkSiteIF);
        String linkText2 = "<a href='http://ibirama.ifc.edu.br/'>IFC - Ibirama</a>";
        link2.setText(Html.fromHtml(linkText2));
        link2.setMovementMethod(LinkMovementMethod.getInstance());


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finishAffinity();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }




}