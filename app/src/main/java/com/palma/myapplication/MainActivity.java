package com.palma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView register;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register  = (TextView) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Registration.class);
                startActivity(i);
            }
        });

        ib =(ImageButton) findViewById(R.id.imageButton2);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Home.class);
                startActivity(i);
            }
        });

    }
}
/*
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/bk16"
    tools:context="com.palma.myapplication.Registration">


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="13dp"
        app:srcCompat="@drawable/ajay1" />

    <TextView
        android:id="@+id/tvlogo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_marginStart="14dp"
        android:layout_marginTop="34dp"
        android:layout_toEndOf="@+id/imageView"
        android:gravity="center"
        android:text="On-Rent"
        android:textColor="#97158a"
        android:textSize="60dp"
        android:textStyle="italic" />

    <TextView
        android:id="@+id/tvlogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/imageView"
        android:layout_centerHorizontal="true"
        android:gravity="center"
        android:text="Sign Up"
        android:textColor="#fff"
        android:textSize="40dp"
        android:textStyle="italic" />

    <EditText
        android:id="@+id/name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tvlogin"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="11dp"
        android:ems="10"
        android:hint="User Name"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/email"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/name"
        android:layout_below="@+id/name"
        android:ems="10"
        android:hint="Email"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/password"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignEnd="@+id/email"
        android:layout_below="@+id/email"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Password" />

    <EditText
        android:id="@+id/mobile"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/password"
        android:layout_below="@+id/password"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Mobile No."
       />

    <EditText
        android:id="@+id/address"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/mobile"
        android:layout_below="@+id/mobile"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Address" />

    <EditText
        android:id="@+id/zip"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/address"
        android:layout_below="@+id/address"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Zip code" />


    <ImageButton
        android:id="@+id/imageButton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@+id/tv1login"
        android:layout_alignStart="@+id/tvlogin"
        android:layout_marginBottom="13dp"
        app:srcCompat="@drawable/key" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/imageView7"
        android:layout_alignTop="@+id/name"
        android:layout_marginTop="6dp"
        app:srcCompat="@drawable/name" />

    <ImageView
        android:id="@+id/imageView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/imageView8"
        android:layout_below="@+id/name"
        app:srcCompat="@drawable/emailsmall" />

    <ImageView
        android:id="@+id/imageView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/email"
        android:layout_marginEnd="14dp"
        android:layout_toStartOf="@+id/password"
        app:srcCompat="@drawable/passwordsmall" />

    <ImageView
        android:id="@+id/imageView10"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/imageView12"
        android:layout_below="@+id/mobile"
        app:srcCompat="@drawable/address" />

    <ImageView
        android:id="@+id/imageView11"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/imageView10"
        android:layout_below="@+id/address"
        app:srcCompat="@drawable/zip" />

    <ImageView
        android:id="@+id/imageView12"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignStart="@+id/imageView8"
        android:layout_below="@+id/password"
        app:srcCompat="@drawable/mobile" />

    <TextView
        android:id="@+id/tv1login"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_alignStart="@+id/imageView11"
        android:text="Already have an Account"
        android:textColor="#21debe"
        android:textSize="22dp" />

    <TextView
        android:id="@+id/tv2login"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/tv1login"
        android:layout_alignBottom="@+id/tv1login"
        android:layout_toEndOf="@+id/mobile"
        android:text="Log In"
        android:textColor="#0612f7"
        android:textSize="22dp" />

    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@+id/imageButton2"
        android:layout_alignStart="@+id/tv1login"
        android:text="I Agree to the "
        android:textSize="18dp"/>

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/checkBox"
        android:layout_alignBottom="@+id/checkBox"
        android:layout_toEndOf="@+id/checkBox"
        android:text="Terms of use"
        android:textSize="18dp"
        android:textColor="#214dde"/>

    <RadioGroup
        android:id="@+id/rggroup"
        android:layout_width="240dp"
        android:layout_height="50dp"
        android:layout_below="@+id/zip"
        android:layout_marginTop="6dp"
        android:layout_marginLeft="44dp"
        android:orientation="horizontal">

        <ImageView
            android:id="@+id/imageView3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignTop="@+id/rggroup"
            android:layout_weight="1"
            app:srcCompat="@drawable/mf" />

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/male"
            android:text="Male"
            android:textSize="20dp"
            android:textColor="#df0fea"
            android:checked="false"/>

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/female"
            android:layout_marginLeft="4dp"
            android:text="FeMale"
            android:textSize="20dp"
            android:textColor="#df0fea"
            android:checked="false"/>


    </RadioGroup>


</RelativeLayout>
 */