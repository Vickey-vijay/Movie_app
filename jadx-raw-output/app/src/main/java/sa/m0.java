package sa;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: compiled from: UIUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m0 f67176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f67177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f67178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f67179d;

    public int b(int i10) {
        return Math.round((i10 * f67178c) / (1920.0f - f67179d));
    }

    public int f(int i10) {
        return Math.round((i10 * f67177b) / 1080.0f);
    }

    public static m0 c(Context context) {
        if (f67176a == null) {
            f67176a = new m0(context);
        }
        return f67176a;
    }

    public final int d(Context context) {
        return e(context, "com.android.internal.R$dimen", "system_bar_height", 48);
    }

    public m0(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (f67177b == 0.0f || f67178c == 0.0f) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            float fD = d(context);
            f67179d = fD;
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            if (i10 > i11) {
                f67177b = i11;
                f67178c = i10 - fD;
            } else {
                f67177b = i10;
                f67178c = i11 - fD;
            }
        }
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int e(Context context, String str, String str2, int i10) {
        try {
            Class<?> cls = Class.forName(str);
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField(str2).get(cls.newInstance()).toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }
}
