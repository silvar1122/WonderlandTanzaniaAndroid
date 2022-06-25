package com.example.wonderlandtanzania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsRoomActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView click_menu,img_nature;
    TextView home,news_room,photo_repotage,about_us,library,column;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_room);
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

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redirect_Activity(NewsRoomActivity.this,MainActivity.class);
            }
        });

        news_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redirect_Activity(NewsRoomActivity.this,NewsRoomActivity.class);
            }
        });column.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redirect_Activity(NewsRoomActivity.this,ColumnActivity.class);
            }
        });
        photo_repotage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redirect_Activity(NewsRoomActivity.this,PhotoRepotageActivity.class);
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redirect_Activity(NewsRoomActivity.this,LibraryActivity.class);
            }
        });
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Redirect_Activity(NewsRoomActivity.this,AboutUsActivity.class);
            }
        });
    }
    public void init(){
        drawerLayout=findViewById(R.id.drawer_layout);
        click_menu=findViewById(R.id.click_menu);
        img_nature=(ImageView) findViewById(R.id.img_nature);
        home=(TextView) findViewById(R.id.tv_home);
        news_room=(TextView) findViewById(R.id.tv_newsroom);
        library=(TextView) findViewById(R.id.tv_library);
        about_us=(TextView) findViewById(R.id.tv_about_us);
        photo_repotage=(TextView) findViewById(R.id.tv_photo_repotage);
        column=(TextView) findViewById(R.id.tv_column);



    }

    private static void OpenDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);

    }
    public static void CloseDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){

            drawerLayout.closeDrawer(GravityCompat.START);

        }

    }

    public static void Redirect_Activity(Activity activity, Class mclass){
        Intent intent=new Intent(activity,mclass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);

    }

}