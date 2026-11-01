package e8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: LightStatusBarUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {
    public static boolean c(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        if (activity == null) {
            return false;
        }
        a(activity, z10, z11);
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i10 = declaredField.getInt(null);
            int i11 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z13 ? i10 | i11 : (~i10) & i11);
            activity.getWindow().setAttributes(attributes);
            try {
                if (c.b() < 7) {
                    return true;
                }
                b(activity, z10, z11, z12, z13);
                return true;
            } catch (Exception unused) {
                b(activity, z10, z11, z12, z13);
                return z14;
            }
        } catch (Exception unused2) {
            z14 = false;
        }
    }

    public static void a(Activity activity, boolean z10, boolean z11) {
        if (z10 && z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(256);
            return;
        }
        if (!z10 && !z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            if (z10 || !z11) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @TargetApi(11)
    public static void b(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        try {
            if (z12) {
                Window window = activity.getWindow();
                if (z10 && z11) {
                    if (z13) {
                        window.getDecorView().setSystemUiVisibility(8448);
                    } else {
                        window.getDecorView().setSystemUiVisibility(256);
                    }
                } else if (z10 || z11) {
                    if (z10 || !z11) {
                        return;
                    }
                    if (z13) {
                        window.getDecorView().setSystemUiVisibility(9472);
                    } else {
                        window.getDecorView().setSystemUiVisibility(1280);
                    }
                } else if (z13) {
                    window.getDecorView().setSystemUiVisibility(9472);
                } else {
                    window.getDecorView().setSystemUiVisibility(1280);
                }
            } else {
                View decorView = activity.getWindow().getDecorView();
                if (z13) {
                    decorView.setSystemUiVisibility(8192);
                } else {
                    decorView.setSystemUiVisibility(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void d(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        int iC = c.c();
        if (iC != 1) {
            if (iC != 2) {
                if (iC == 3) {
                    b(activity, z10, z11, z12, z13);
                    return;
                }
                return;
            }
            c(activity, z10, z11, z12, z13);
            return;
        }
        if (c.d() >= 7) {
            b(activity, z10, z11, z12, z13);
        } else {
            e(activity, z10, z11, z12, z13);
        }
    }

    public static boolean e(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i10;
        a(activity, z10, z11);
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i11 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            if (z13) {
                i10 = i11;
            } else {
                i10 = 0;
            }
            objArr[0] = Integer.valueOf(i10);
            objArr[1] = Integer.valueOf(i11);
            method.invoke(window, objArr);
            return true;
        } catch (Exception unused) {
            b(activity, z10, z11, z12, z13);
            return false;
        }
    }
}
