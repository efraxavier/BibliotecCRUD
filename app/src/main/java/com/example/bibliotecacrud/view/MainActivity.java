package com.example.bibliotecacrud.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bibliotecacrud.R;

public class MainActivity extends AppCompatActivity {
    private MenuBar menuBar;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuBar = findViewById(R.id.menu_bar);
        menuBar.setOnMenuItemClickListener(menuItem -> {
            // Handle menu item clicks to display the corresponding fragment
            switch (menuItem.getItemId()) {
                case R.id.menu_insert:
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, new InsertFragment());
                    fragmentTransaction.commit();
                    return true;
                case R.id.menu_update:
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, new UpdateFragment());
                    fragmentTransaction.commit();
                    return true;
                case R.id.menu_delete:
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, new DeleteFragment());
                    fragmentTransaction.commit();
                    return true;
                case R.id.menu_find_one:
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, new FindOneFragment());
                    fragmentTransaction.commit();
                    return true;
                case R.id.menu_find_all:
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, new FindAllFragment());
                    fragmentTransaction.commit();
                    return true;
                default:
                    return false;
            }
        });
    }
}
