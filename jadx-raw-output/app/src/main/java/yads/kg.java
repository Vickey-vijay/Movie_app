package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes10.dex */
public final class kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f79405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg0 f79406b;

    public final m50 a() {
        PackageManager packageManager = this.f79405a.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i10 >= 33 ? packageManager.getPackageInfo(this.f79405a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(this.f79405a.getPackageName(), 0);
        this.f79406b.getClass();
        String strB = jg0.b();
        if (strB == null) {
            strB = "Undefined";
        }
        String str = "Android " + strB;
        String str2 = "API " + i10;
        String str3 = packageInfo.packageName;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = "";
        }
        return new m50(str3, str4, str, str2);
    }

    public kg(Context context, jg0 jg0Var) {
        this.f79405a = context;
        this.f79406b = jg0Var;
    }
}
