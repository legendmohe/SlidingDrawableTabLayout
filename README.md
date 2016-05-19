# SlidingDrawableTabLayout

TabLayout with drawable indicator

!(demo.gif)[https://raw.githubusercontent.com/legendmohe/SlidingDrawableTabLayout/master/ezgif-973342673.gif]

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
