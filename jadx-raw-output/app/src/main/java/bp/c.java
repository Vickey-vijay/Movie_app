package bp;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PlayerUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static Activity l(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return l(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String b() {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
    }

    public static int e(Context context, boolean z10) {
        return z10 ? context.getResources().getDisplayMetrics().heightPixels + c(context) : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int f(Context context, boolean z10) {
        return z10 ? context.getResources().getDisplayMetrics().widthPixels + c(context) : context.getResources().getDisplayMetrics().widthPixels;
    }

    @NonNull
    public static <T> List<T> g(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static WindowManager i(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static boolean k(Context context, MotionEvent motionEvent) {
        int iA = a(context, 40.0f);
        float f10 = iA;
        return motionEvent.getRawX() < f10 || motionEvent.getRawX() > ((float) (f(context, true) - iA)) || motionEvent.getRawY() < f10 || motionEvent.getRawY() > ((float) (e(context, true) - iA));
    }

    public static String m(int i10) {
        int i11 = i10 / 1000;
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        return i14 > 0 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12)) : String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12));
    }

    public static int a(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static int c(Context context) {
        if (!j(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static int d(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        if (!activeNetworkInfo.isConnected()) {
            return 1;
        }
        if (activeNetworkInfo.getType() == 9) {
            return 2;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 3;
        }
        if (activeNetworkInfo.getType() == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 20) {
                switch (subtype) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return 4;
                    default:
                        return -1;
                }
            }
            return 4;
        }
        return -1;
    }

    public static double h(Context context) {
        int dimensionPixelSize;
        int identifier = context.getResources().getIdentifier("status_bar_height_portrait", "dimen", "android");
        if (identifier > 0) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        } else {
            dimensionPixelSize = 0;
        }
        return dimensionPixelSize;
    }

    public static boolean j(Context context) {
        Display defaultDisplay = i(context).getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        if (point2.x == point.x && point2.y == point.y) {
            return false;
        }
        return true;
    }
}
