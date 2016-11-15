package com.rohan.user.mydynamicfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int displaymode = getResources().getConfiguration().orientation;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        if(displaymode == 1){
            Fragment1 f1 = new Fragment1();
            fragmentTransaction
                    .replace(android.R.id.content,f1);

        }
        else{
            Fragment2 f2 = new Fragment2();
            fragmentTransaction
                    .replace(android.R.id.content,f2);
        }
        fragmentTransaction.commit();
    }
}
