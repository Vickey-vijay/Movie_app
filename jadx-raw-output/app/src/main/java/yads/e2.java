package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f76886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76887c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f76888a = new v1();

    static {
        String str = com.safedk.android.utils.g.f44979y + ".common.AdActivity";
        f76886b = str;
        f76887c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f76886b), 0);
            this.f76888a.getClass();
            v1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f76887c;
            throw new ub1(str, str);
        }
    }
}
