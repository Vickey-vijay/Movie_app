package yads;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f83984a;

    public static IBinder a(Bundle bundle, String str) {
        if (ib3.f78556a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f83984a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f83984a = method2;
                method2.setAccessible(true);
                method = f83984a;
            } catch (NoSuchMethodException e10) {
                ih1.c("BundleUtil", ih1.a("Failed to retrieve getIBinder method", e10));
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            ih1.c("BundleUtil", ih1.a("Failed to invoke getIBinder via reflection", e11));
            return null;
        }
    }
}
