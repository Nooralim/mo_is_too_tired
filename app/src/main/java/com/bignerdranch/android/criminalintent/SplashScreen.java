package com.bignerdranch.android.criminalintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Nazo on 12/1/2016.
 */

public class SplashScreen extends AppCompatActivity{


    private void startUp(){
        CrimeLab.get(SplashScreen.this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        startUp();
        setContentView(R.layout.splash);

        Thread countDown_Timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this, CrimeListActivity.class);
                    startActivity(intent);
                }//end of try,catch,finally block
            }//end of run
        }; //end of timer
            countDown_Timer.start();
    }//onCreate
    @Override
    protected  void onPause(){
        super.onPause();
        finish();
    }
}//end of SplashScreen
