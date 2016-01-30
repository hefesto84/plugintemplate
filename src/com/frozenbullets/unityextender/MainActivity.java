package com.frozenbullets.unityextender;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends UnityPlayerActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		
	}

	public void shareText(String subject, String body) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, body);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
	
	public void setupViewStatic() { 
        Log.d("setupViewStatic","setupViewStatic"); 
         
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { 
            public void run() { 
                 
                // And this is the same, but done programmatically 
                RelativeLayout layout = new RelativeLayout(UnityPlayer.currentActivity.getApplicationContext()); 
                
                layout.setGravity(Gravity.CENTER); 
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(500, 500);
                lp.addRule(RelativeLayout.CENTER_IN_PARENT);
                
                //layout.setX(100);
                //layout.setY(100);
                //RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(1000, 500);
                //lp.setMargins(100, 100, 100, 100);
             
                //LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams)layout.getLayoutParams();
                //lp.setMargins(100, 100, 100, 100);
                //lp.height = 800;
                //lp.width  = 300;
                //layout.setLayoutParams(lp);
                // SET HERE IF YOU WANT THE BANNER TO BE DISPLAYED AT THE TOP OR BOTTOM OF THE SCREEN 
                
                
                UnityPlayer.currentActivity.addContentView(layout, lp); 
                 
                //FIRST positive test 
                /* 
                TextView text = new TextView(UnityPlayer.currentActivity); 
                text.setText("This is an example for the Bright Hub!");  
                 
                layout.addView(text); 
                */ 
                 
                 
                 
                WebView myWebView = new WebView(UnityPlayer.currentActivity); 
                myWebView.getSettings().setJavaScriptEnabled(true); 
                myWebView.loadUrl("http://www.asteam.de/game_news_iphone3.php"); 
                 
                myWebView.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this if ROM supports Multi-Touch      
                myWebView.getSettings().setBuiltInZoomControls(true); //Enable Multitouch if supported by ROM 
                myWebView.getSettings().setLoadWithOverviewMode(true); 
                myWebView.getSettings().setUseWideViewPort(true); 
                 
                layout.addView(myWebView); 
                 
                //AdView adView = new AdView(UnityPlayer.currentActivity); 
                //layout.addView(myWebView, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT)); 

                //adView.setBackgroundColor(0xff000000); 
                //adView.setPrimaryTextColor(0xffffffff); 
                //adView.setSecondaryTextColor(0xffcccccc); 
                 
                 
            }; 
        }); 
         
    } 
	
	public void setupViewStaticWeb() { 
        Log.d("setupViewStatic","setupViewStatic"); 
         
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { 
            public void run() { 
                 
            	LinearLayout ll = new LinearLayout(UnityPlayer.currentActivity.getApplicationContext()); 
            	ll.setOrientation(LinearLayout.VERTICAL);

            	LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
            	     LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            	layoutParams.setMargins(30, 20, 30, 0);

            	//Button okButton=new Button(UnityPlayer.currentActivity.getApplicationContext());
            	//okButton.setText("some text");
            	//ll.addView(okButton, layoutParams);
            	
            	//UnityPlayer.currentActivity.addContentView(ll, lp); 
                // And this is the same, but done programmatically 
                //LinearLayout layout = new LinearLayout(UnityPlayer.currentActivity.getApplicationContext()); 
                //layout.setOrientation(LinearLayout.HORIZONTAL); 
                 
                // SET HERE IF YOU WANT THE BANNER TO BE DISPLAYED AT THE TOP OR BOTTOM OF THE SCREEN 
                //layout.setGravity(Gravity.CENTER); 
                
                //LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(600, 600);
                //lp.setMargins(200, 200, 200, 200);
                UnityPlayer.currentActivity.addContentView(ll, layoutParams); 
                 
                //FIRST positive test 
                /* 
                TextView text = new TextView(UnityPlayer.currentActivity); 
                text.setText("This is an example for the Bright Hub!");  
                 
                layout.addView(text); 
                */ 
                 
                 
                
                WebView myWebView = new WebView(UnityPlayer.currentActivity); 
                myWebView.getSettings().setJavaScriptEnabled(true); 
                myWebView.loadUrl("http://www.asteam.de/game_news_iphone3.php"); 
                 
                myWebView.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this if ROM supports Multi-Touch      
                myWebView.getSettings().setBuiltInZoomControls(true); //Enable Multitouch if supported by ROM 
                myWebView.getSettings().setLoadWithOverviewMode(true); 
                myWebView.getSettings().setUseWideViewPort(true); 
                 
                ll.addView(myWebView); 
               
                //AdView adView = new AdView(UnityPlayer.currentActivity); 
                //layout.addView(myWebView, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT)); 

                //adView.setBackgroundColor(0xff000000); 
                //adView.setPrimaryTextColor(0xffffffff); 
                //adView.setSecondaryTextColor(0xffcccccc); 
                 
                 
            }; 
        }); 
         
    } 
}
