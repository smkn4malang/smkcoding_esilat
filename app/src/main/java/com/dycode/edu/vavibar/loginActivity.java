package com.dycode.edu.vavibar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.signIn)
    Button btnsignIn;
    @BindView(R.id.signUp)
    Button btnsignUp;
    @BindView(R.id.forget)
    Button btnFgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


        findViewById(R.id.google_login).setOnClickListener(this);
    }
    @OnClick(R.id.signIn)
    public void onViewClicked1() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.signUp)
    public void onViewClicked() {
        Intent intent = new Intent(this,signupActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.forget)
    public void onViewClicked2() {
        Intent intent = new Intent(this,lupaActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
//    SignInButton signInButton = findViewById(R.id.google_login);
//     signInButton.setSize(SignInButton.SIZE_STANDARD);
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.google_login:
//                signIn();
//                break;
//
//        }


//    private void signIn() {
//        Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
//        startActivityForResult(intent, REQ_CODE);
//    }
//
//    private void handleResult(GoogleSignInResult result) {
//        if (result.isSuccess()) {
//            GoogleSignInAccount account = result.getSignInAccount();
//            AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(),
//                    null);
//            mAuth.signInWithCredential(credential)
//                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                FirebaseUser firebaseUser = mAuth.getCurrentUser();
//                                usernama.setText(firebaseUser.getDisplayName());
//                                useremail.setText(firebaseUser.getEmail());
//                                Glide.with(loginActivity.this).load(firebaseUser.getPhotoUrl().toString()).into(userpict);
//                                updateUI(true);
//                            } else {
//                                updateUI(false);
//                            }
//                        }
//                    });
//        } else {
//            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private void updateUI(boolean isLogin) {
//        if (isLogin) {
//            Intent intent = new Intent(this,MainActivity.class);
//            startActivity(intent);
//        } else {
//            Intent intent = new Intent(this,loginActivity.class);
//            startActivity(intent);
//        }
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode==REQ_CODE){
//            Intent intent = new Intent(this,MainActivity.class);
//            startActivity(intent);
//        }
//}
//    @OnClick(R.id.google_login)
//    public void onViewClicked5() {
//        signIn();
//    }
}
