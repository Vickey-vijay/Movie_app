package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public abstract class og {
    public static final String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }

    public static final String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }
}
