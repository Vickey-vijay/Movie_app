package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public final class sh1 {
    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
                applicationInfo = null;
            }
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str) || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj;
        } catch (Throwable unused2) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }

    public static Boolean b(Context context) {
        return (Boolean) a(context, th1.f83038e.f83045b);
    }

    public static boolean c(Context context) {
        Boolean bool = (Boolean) a(context, th1.f83043j.f83045b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Boolean a(Context context) {
        return (Boolean) a(context, th1.f83037d.f83045b);
    }
}
