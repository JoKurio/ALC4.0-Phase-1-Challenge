package io.github.jokurio.alc40;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        WebView webView = findViewById(R.id.alc_webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new alcWebViewClient());
        webView.getSettings().setDomStorageEnabled(true);

        String url = "http://www.andela.com/alc/";
         CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
         CustomTabsIntent customTabsIntent = builder.build();
         customTabsIntent.launchUrl(this, Uri.parse(url));
         builder.setToolbarColor(Color.BLUE);


    }

    private class alcWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url); 
            return true;
        }

    }


}


