package com.example.week4;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener ,
        Fragment2.OnFragmentInteractionListener, Fragment3.OnFragmentInteractionListener {

    public static int number = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ib_1 = findViewById(R.id.imageButton4);

        Fragment1 fragment1 = new Fragment1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, fragment1);
        fragmentTransaction.commit();

        ib_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                    Fragment1 fragment1 = new Fragment1();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment, fragment1);
                    fragmentTransaction.commit();
            }
        });

        ImageButton ib_2 = findViewById(R.id.imageButton5);
        ImageButton ib_3 = findViewById(R.id.imageButton6);
        ib_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Fragment3 fragment3 = new Fragment3();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment3);
                fragmentTransaction.commit();
            }
        });
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
