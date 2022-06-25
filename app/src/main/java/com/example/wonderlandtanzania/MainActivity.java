package com.example.wonderlandtanzania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView click_menu,img_nature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        click_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenDrawer(drawerLayout);
            }
        });
        img_nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CloseDrawer(drawerLayout);
            }
        });
    }

    private static void OpenDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);

    }
    public static void CloseDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){

            drawerLayout.closeDrawer(GravityCompat.START);

        }

    }

    public static void Redirect_Activity(Activity activity,Class mclass){
        Intent intent=new Intent(activity,mclass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);

    }

    public void init(){
        drawerLayout=findViewById(R.id.drawer_layout);
        click_menu=findViewById(R.id.click_menu);
        img_nature=(ImageView) findViewById(R.id.img_nature);



    }
}