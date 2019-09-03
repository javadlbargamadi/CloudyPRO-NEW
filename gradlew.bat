<?xml version="1.0" encoding="utf-8"?>
<androidx.drawerlayout.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/backgroudwallpaper"
    android:orientation="vertical"
    android:fitsSystemWindows="true"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <androidx.cardview.widget.CardView
                android:layout_margin="5dp"
                app:cardCornerRadius="5dp"
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <LinearLayout
                    android:layout_width="fill_parent"
                    android:layout_height="60dp"
                    android:orientation="horizontal">

                    <ImageView
                        android:layout_gravity="center"
                        android:id="@+id/imgDrawerLayout"
                        android:layout_width="0dp"
                        android:layout_height="20dp"
                        android:layout_weight="1.1"
                        android:background="@drawable/toolbar_selector"
                        android:scaleType="centerCrop"
                        android:src="@drawable/hamburgericon" />

                    <TextView
                        android:layout_marginBottom="2dp"
                        android:layout_width="0dp"
                        android:layout_height="match_parent"
                        android:layout_weight="8"
                        android:gravity="center_vertical"
                        android:text="Cloudy PRO"
                        android:textColor="#000"
                        android:textSize="25dp"
                        android:textStyle="bold" />

                