package em;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: StatusBarUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class l {
    public static void d(Activity activity, boolean z10, int i10) {
        if (!z10) {
            c(activity, i10);
            return;
        }
        c(activity, i10);
        if (i.b()) {
            b(activity, z10);
            return;
        }
        if (i.a()) {
            a(activity, z10);
            return;
        }
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.getDecorView().setSystemUiVisibility(8192);
    }

    public static boolean a(Activity activity, boolean z10) {
        int i10;
        Window window = activity.getWindow();
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i11 = declaredField.getInt(null);
                int i12 = declaredField2.getInt(attributes);
                if (z10) {
                    i10 = i12 | i11;
                } else {
                    i10 = (~i11) & i12;
                }
                declaredField2.setInt(attributes, i10);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(Activity activity, boolean z10) {
        Window window = activity.getWindow();
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
                        activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                    } else {
                        activity.getWindow().getDecorView().setSystemUiVisibility(0);
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

    public static void c(Activity activity, int i10) {
        activity.getWindow().setStatusBarColor(activity.getResources().getColor(i10));
    }
}
