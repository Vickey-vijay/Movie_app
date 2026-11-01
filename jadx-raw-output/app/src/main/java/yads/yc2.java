package yads;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yc2 {
    public static final String a(Context context) {
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            ck.p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Point b(Context context) {
        Object systemService = context.getSystemService("window");
        ck.p.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final Boolean c(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            ck.p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            boolean z10 = true;
            if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable unused) {
            return null;
        }
    }
}
