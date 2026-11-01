package sa;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PackageUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class y {
    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
