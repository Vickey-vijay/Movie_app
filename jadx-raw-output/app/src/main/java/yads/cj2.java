package yads;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public final class cj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f76295a = new s1();

    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        this.f76295a.getClass();
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, tu1.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            ck.p.h(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }
}
