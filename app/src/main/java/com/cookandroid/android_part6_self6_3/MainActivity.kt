package com.cookandroid.android_part6_self6_3


import android.app.TabActivity
import android.os.Bundle
import android.widget.TabHost
import android.widget.TabHost.TabSpec

@Suppress("deprecation")
class MainActivity : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("강아지")
        tabSpec1.setContent(R.id.imageView1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("고양이")
        tabSpec2.setContent(R.id.imageView2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("토끼")
        tabSpec3.setContent(R.id.imageView3)
        tabHost.addTab(tabSpec3)

        var tabSpec4 = tabHost.newTabSpec("TAG4").setIndicator("말")
        tabSpec4.setContent(R.id.imageView4)
        tabHost.addTab(tabSpec4)

        tabHost.currentTab = 0
    }
}