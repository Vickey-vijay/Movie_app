package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import com.ironsource.Y1;

/* JADX INFO: loaded from: classes4.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> cls) {
        return isComponentExplicitlyEnabled(context, cls.getName());
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            Logger logger = Logger.get();
            String str = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : Y1.f27893e;
            logger.debug(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            Logger logger2 = Logger.get();
            String str2 = TAG;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z10 ? "enabled" : Y1.f27893e;
            logger2.debug(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }

    private PackageManagerHelper() {
    }
}
