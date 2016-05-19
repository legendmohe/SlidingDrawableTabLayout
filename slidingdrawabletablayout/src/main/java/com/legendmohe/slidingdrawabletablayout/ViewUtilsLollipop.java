package com.legendmohe.slidingdrawabletablayout;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/**
 * Created by legendmohe on 16/5/12.
 */
class ViewUtilsLollipop {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    static void setBoundsViewOutlineProvider(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

}
