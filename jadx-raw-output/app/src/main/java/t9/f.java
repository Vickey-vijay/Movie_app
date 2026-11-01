package t9;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: StatusBarNewUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static boolean a(Window window, boolean z10) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i10 = declaredField.getInt(null);
                int i11 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z10 ? i11 | i10 : (~i10) & i11);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(Window window, boolean z10) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i10 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z10) {
                    method.invoke(window, Integer.valueOf(i10), Integer.valueOf(i10));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i10));
                }
                try {
                    if (z10) {
                        window.getDecorView().setSystemUiVisibility(9216);
                    } else {
                        window.getDecorView().setSystemUiVisibility(0);
                    }
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public static int c(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (b(activity.getWindow(), true)) {
            return 1;
        }
        if (a(activity.getWindow(), true)) {
            return 2;
        }
        if (i10 < 26) {
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
            activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            return 3;
        }
        if (i10 < 26) {
            return 0;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(9232);
        activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        return 4;
    }

    public static void d(View view) {
        view.setSystemUiVisibility(5894);
    }
}
