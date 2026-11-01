package io.bidmachine.util;

import android.content.Context;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\b\u0010\u0007\u001a\u00020\u0006H\u0000\"\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "", "getAppName", "getAppVersion", "", "isDebuggable", "Lmj/r;", "resetAppUtils", "appName", "Ljava/lang/String;", "appVersion", "isCleartextTrafficPermitted", "Ljava/lang/Boolean;", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class AppUtilsKt {
    private static String appName;
    private static String appVersion;
    private static Boolean isCleartextTrafficPermitted;

    public static final void resetAppUtils() {
        appName = null;
        appVersion = null;
        isCleartextTrafficPermitted = null;
    }

    public static final String getAppName(Context context) {
        p.j(context, "<this>");
        String str = appName;
        if (str != null) {
            return str;
        }
        String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        appName = string;
        return string;
    }

    public static final String getAppVersion(Context context) {
        String str;
        p.j(context, "<this>");
        String str2 = appVersion;
        if (str2 != null) {
            return str2;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        appVersion = str;
        return str;
    }

    public static final boolean isDebuggable(Context context) {
        p.j(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
