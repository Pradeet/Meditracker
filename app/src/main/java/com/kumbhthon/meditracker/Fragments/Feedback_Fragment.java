package com.kumbhthon.meditracker.Fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kumbhthon.meditracker.R;

@SuppressLint("NewApi")
public class Feedback_Fragment extends Fragment {

    private WebView myWebView;
    final static String myBlogAddr = "http://android-er.blogspot.com";
    String myUrl;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.feedback_fragment, container, false);
        myWebView = (WebView) view.findViewById(R.id.mywebview);

        myWebView.getSettings().setJavaScriptEnabled(true);
        startWebView("http://meditracker.weebly.com/contact.html");


        return view;

    }


    private void startWebView(String url) {

        //Create new above Client to show progress dialog
        //When opening a url or click on link

        myWebView.setWebViewClient(new WebViewClient() {
            ProgressDialog progressDialog;

            //If you will not use this method url links are opeen in new brower not in webview
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            //Show loader on url load
            public void onLoadResource(WebView view, String url) {
                if (progressDialog == null) {
                    // in standard case YourActivity.this
                    progressDialog = new ProgressDialog(getActivity());
                    progressDialog.setMessage("Loading...");
                    progressDialog.show();
                }
            }

            public void onPageFinished(WebView view, String url) {
                try {
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        progressDialog = null;
                    }
                } catch (Exception exception) {

                }
            }

        });

        // Javascript inabled on webview
        myWebView.getSettings().setJavaScriptEnabled(true);

        // Javascript inabled on webview
        myWebView.getSettings().setJavaScriptEnabled(true);

        // Other webview options

        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        myWebView.setScrollbarFadingEnabled(false);
        myWebView.getSettings().setBuiltInZoomControls(true);


        String summary = "<html><body>You scored <b>192</b> points.</body></html>";
        myWebView.loadData(summary, "text/html", null);


        //Load url in webview
        myWebView.loadUrl(url);


    }

    // Open previous opened link from history on webview when back button pressed


}