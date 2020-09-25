package com.aelinstudios.garadleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showtoast(View view){
        switch (view.getId()){
            case R.id.errorbutton:
                Toasty.error(this,"Failed broo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successbutton:
                Toasty.success(this,"Hurray",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.warningbutton:
                Toasty.warning(this,"stopp dudee",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.infobutton:
                Toasty.info(this,"Read this first",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.imagebutton:
//                Toasty.normal(this,"You cant see me", ContextCompat.getDrawable(this,R.drawable.ic_infinity),Toasty.LENGTH_SHORT).show();
                  Toasty.normal(this,"infinity",Toast.LENGTH_SHORT,ContextCompat.getDrawable(this,R.drawable.ic_infinity)).show();
                break;

        }


    }
}