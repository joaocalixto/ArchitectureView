package br.com.simplelife.architectureview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        String html = "<iframe src=\"https://3dwarehouse.sketchup.com/embed.html?mid=u92768d3e-458d-445b-9d98-9ca74e0174ab&width=580&height=326\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" width=\"580\" height=\"326\" allowfullscreen></iframe>";
        myWebView.loadUrl("https://3dwarehouse.sketchup.com/embed.html?mid=u66fba62e-7346-4412-878b-15afb0926dd4&width=580&height=326");

    }
}
