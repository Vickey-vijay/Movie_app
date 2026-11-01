package s;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import g5.k0;

/* JADX INFO: compiled from: VideoPlayUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static double c(long j10) {
        return j10 / 1024.0d;
    }

    @Nullable
    public static AppCompatActivity b(@NonNull Context context) {
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return b(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean j(@NonNull ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException.type != 0) {
            return false;
        }
        for (Throwable sourceException = exoPlaybackException.getSourceException(); sourceException != null; sourceException = sourceException.getCause()) {
            if (sourceException instanceof BehindLiveWindowException) {
                return true;
            }
        }
        return false;
    }

    public static Activity n(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return n(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int a(@NonNull Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static long e(@NonNull Context context) {
        if (TrafficStats.getUidRxBytes(context.getApplicationInfo().uid) == -1) {
            return 0L;
        }
        return TrafficStats.getTotalRxBytes() / 1024;
    }

    public static int f(@NonNull Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        Log.d("getUiMode", uiModeManager.getCurrentModeType() + "");
        return uiModeManager.getCurrentModeType();
    }

    public static void g(@NonNull Context context) {
        ActionBar supportActionBar;
        AppCompatActivity appCompatActivityB = b(context);
        if (appCompatActivityB != null && (supportActionBar = appCompatActivityB.getSupportActionBar()) != null) {
            supportActionBar.hide();
        }
        n(context).getWindow().setFlags(1024, 1024);
    }

    public static int h(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return i(path);
    }

    public static int i(String str) {
        String strK0 = k0.K0(str);
        if (strK0.matches(".*m3u8.*")) {
            return 2;
        }
        if (strK0.matches(".*mpd.*")) {
            return 0;
        }
        if (strK0.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
            return 1;
        }
        return 3;
    }

    public static boolean k(@NonNull Context context) {
        boolean z10;
        Resources resources = context.getResources();
        if (resources.getConfiguration() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.f(z10);
        if (resources.getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public static boolean l(@NonNull Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null && allNetworkInfo.length > 0) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(@NonNull Context context) {
        if (f(context) == 4) {
            return true;
        }
        return false;
    }

    public static void o(@NonNull Context context) {
        ActionBar supportActionBar;
        AppCompatActivity appCompatActivityB = b(context);
        if (appCompatActivityB != null && (supportActionBar = appCompatActivityB.getSupportActionBar()) != null) {
            supportActionBar.show();
        }
        n(context).getWindow().clearFlags(1024);
    }
}
