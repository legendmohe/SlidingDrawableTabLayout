# SlidingDrawableTabLayout

TabLayout with drawable indicator

![demo.gif](https://raw.githubusercontent.com/legendmohe/SlidingDrawableTabLayout/master/ezgif-973342673.gif)

# Usage

## gradle

    compile 'com.legendmohe.maven:slidingdrawabletablayout:0.1'

## code

Just use it as TabLayout:
    
    // Create the adapter that will return a fragment for each of the three
    // primary sections of the activity.
    mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

    // Set up the ViewPager with the sections adapter.
    mViewPager = (ViewPager) findViewById(R.id.container);
    mViewPager.setAdapter(mSectionsPagerAdapter);

    SlidingDrawableTabLayout tabLayout = (SlidingDrawableTabLayout) findViewById(R.id.tabs);
    tabLayout.setupWithViewPager(mViewPager);    

    <com.legendmohe.slidingdrawabletablayout.SlidingDrawableTabLayout
        android:id="@+id/tabs"
        android:layout_margin="10dp"
        app:tabTextColor="@color/colorPrimary"
        app:tabSelectedTextColor="@android:color/white"
        app:tabBackground="@android:color/transparent"
        app:slidingBackground="@drawable/auto_main_tablayout_sliding_bg"
        android:background="@drawable/auto_main_tablayout_bg"
        android:layout_width="250dp"
        android:layout_gravity="center_horizontal"
        android:layout_height="wrap_content"/>
