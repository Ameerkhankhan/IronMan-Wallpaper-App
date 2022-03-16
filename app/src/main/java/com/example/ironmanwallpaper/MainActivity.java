package com.example.ironmanwallpaper;



import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private List<Custom_Items> list;
    public CustomAdapter adapter;
    private Toolbar toolbar;
    private TextView textView;
    NetworkInfo info;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        dialog = new ProgressDialog(this);


        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {


            Toast.makeText(MainActivity.this, "Loading..", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();

        }

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        list = new ArrayList<>();


        list.add(new Custom_Items("https://i.pinimg.com/originals/f3/29/54/f32954504522bdbdb048b2858cec1e3c.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapercave.com/wp/wp2604988.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/originals/22/6f/38/226f386f959760bcc9c515eb53ce786e.png?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/originals/7a/52/7d/7a527d095ec0078cc5276a263a921dd3.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapercave.com/wp/wp2663986.png?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/1183272.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapercave.com/wp/wp3703416.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapercave.com/wp/wp3703437.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapercave.com/wp/wp3703429.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/889061.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://www.hdwallpapers.in/download/iron_man_minimal_artwork_4k_8k-1440x2560.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i2.wp.com/traxzee.com/wp-content/uploads/2020/08/Traxzee.Com-026-Minimal-HD-1080X1920-Wallpapers.jpg?fit=768%2C1365&ssl=1"));
        list.add(new Custom_Items("https://www.enjpg.com/img/2020/iron-man-10.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/474x/b1/d7/7e/b1d77ea8d411e5fff0266f6b85d5bdd2.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/808660.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/originals/fd/e0/67/fde067e20b40d0137dd0f08ecbde7661.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://www.teahub.io/photos/full/6-69806_4k-wallpaper-mobile-ironman.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/467443.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/736x/15/be/5b/15be5b253aa588a7b5861fbf668245bc.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/1183307.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/originals/99/16/8d/99168d7e9795e2219e880adeb1fb1704.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/1183307.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapersflix.com/wp-content/uploads/2020/05/Iron-man-Wallpaper-For-Phone.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://www.hdwallpapers.in/download/captain_america_iron_man_in_avengers_endgame_4k-1080x1920.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://1.bp.blogspot.com/-KlwzC2FjgRQ/XWVTWlbC4dI/AAAAAAAAIhE/HKqfImp4b_EH7CSzMSe9tKIqRE5TqXI-wCLcBGAs/s1600/iron%2Bman%2Bwallpaper%2B4k%2B%252810%2529.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://assets.wallpapersin4k.org/uploads/2017/04/Iron-Man-HD-Mobile-Wallpapers-12.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/1183316.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://goldwallpapers.com/uploads/posts/iron-man-phone-wallpaper/iron_man_phone_wallpaper_017.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://cutewallpaper.org/21/iron-man-pictures-wallpaper/Avengers-Endgame-Iron-Man-8K-Wallpaper-148.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/originals/5d/48/2a/5d482a95a1b80b50cc1807ee8be6c075.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://img.wallpapersafari.com/phone/1080/1920/27/4/Io49Ag.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://cutewallpaper.org/21/black-iron-man-wallpaper/Jarvis-iron-man-Ringtones-and-Wallpapers-Free-by-ZEDGE_tm_.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/originals/59/4e/a8/594ea8defd9fc526d09ad3e72bad8d30.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpapertag.com/wallpaper/middle/2/8/8/743918-ironman-wallpaper-hd-1080x1920-ipad-pro.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.wallpapersden.com/image/download/marvel-iron-man-art_68122_2160x3840.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://swall.teahub.io/photos/small/58-582929_tony-stark-wallpaper-4k-for-mobile.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/736x/61/87/7e/61877e1d08b51748423a7c86f2f4451a.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i2.wp.com/i.pinimg.com/originals/73/f9/91/73f9915dffa7d5ed066cbc8b0c5b5c5e.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://cdn.wallpapersafari.com/11/54/pB47KD.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/7c/70/3f/7c703ff95934b0094c5be9994f1998c5.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/a2/78/b7/a278b79b3f14bfcadf6df7acfae9b1ed.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/e7/60/41/e760413ee3bb5813b983bd2f2da63886.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/ef/49/75/ef4975f820b214bedad1f825c654550b.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.hdqwalls.com/download/iron-man-ready-artwork-4k-tp-1440x2960.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/1e/c9/fa/1ec9fa34e64ea0a725b4abdd73667a1b.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/af/c4/1e/afc41ed53f36d836f1f79b3fa07bbc37.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i2.wp.com/i.pinimg.com/736x/e3/4f/95/e34f95fec7490b9f2c7d5ac29fbbcec1.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://wallpaperaccess.com/full/1497034.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/63/f6/cc/63f6ccfc25593cdfcaeb93ebe2d15d07.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/48/41/38/484138e1fc41168f339e968b3c21f791.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://i.pinimg.com/236x/da/06/6b/da066b4644ae68daefabd87fd097bc06.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items(""));


        getdata();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    private void getdata() {


        adapter = new CustomAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, SettingsActivity.class));

        }
        if (id == R.id.action_exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog d = builder.create();
            d.show();

        }

        if (id == R.id.action_search) {

            finish();
            startActivity(getIntent());
            if (info != null) {
                getdata();

            } else {


                Toast.makeText(this, "Internet Not Connected!", Toast.LENGTH_SHORT).show();
            }


        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.wallpaper) {

            getdata();


        } else if (id == R.id.favorites) {

            getdata();

        } else if (id == R.id.Settings) {

            startActivity(new Intent(MainActivity.this, SettingsActivity.class));


        } else if (id == R.id.rate_us) {
            //rateme();
        } else if (id == R.id.more_app) {

            //MoreApp();


        }


        //Shere


        else if (id == R.id.shere) {


            Intent myintent = new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plan");

            String shereBoday = "Your Boday Here";

            String shereSub = "\"http://play.google.com/store/apps/details?id=" + getPackageName();
            myintent.putExtra(Intent.EXTRA_SUBJECT, shereBoday);
            myintent.putExtra(Intent.EXTRA_TEXT, shereSub);
            startActivity(Intent.createChooser(myintent, "share Using"));

        }


        //Exit


        else if (id == R.id.exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog d = builder.create();
            d.show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void MoreApp() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://developer?id=" + "Account Name!")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/developer?id=" + "Account Name!")));


        }
    }




    public void rateme() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + "Your Package name!")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }


}