package com.digitalhouse.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;


public class MainActivity extends AppCompatActivity {

    LoginButton loginButton;
    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esto me avisa cuando se cambia el usuario
        ProfileTracker profileTracker = new ProfileTracker() {
            @Override
            protected void onCurrentProfileChanged(
                    Profile oldProfile,
                    Profile currentProfile) {

                Toast.makeText(MainActivity.this, "Change User", Toast.LENGTH_SHORT).show();
                if (currentProfile != null) {
                    String userId = currentProfile.getId();
                }

            }
        };


        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");

        // If using in a fragment
        //loginButton.setFragment(this);


        // Callback registration
        callbackManager = CallbackManager.Factory.create();
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Toast.makeText(MainActivity.this, loginResult.getAccessToken().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "DENIED: " + loginResult.getRecentlyDeniedPermissions().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "GRANTED" + loginResult.getRecentlyGrantedPermissions().toString(), Toast.LENGTH_SHORT).show();

                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                // App code
                Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });


        // Busco el boton
        ShareButton shareButton = (ShareButton) findViewById(R.id.share_button);

        // Creo el contenido
        ShareLinkContent content = new ShareLinkContent.Builder()
                .setContentUrl(Uri.parse("https://www.digitalhouse.com"))
                .build();

        // Seteo el contenido al boton
        shareButton.setShareContent(content);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
