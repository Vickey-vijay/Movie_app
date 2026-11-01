package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/PackageManagerUtils;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "getAppVersionCodeString", "", "getAppVersionCodeInt", "getAppVersionName", "Ljava/lang/Class;", "clazz", "Landroid/content/pm/ServiceInfo;", "getServiceInfo", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "authority", "", "hasContentProvider", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class PackageManagerUtils {
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SafePackageManager f54752a = new SafePackageManager();

    public static final PackageInfo getPackageInfo(Context context) {
        return f54752a.getPackageInfo(context, context.getPackageName());
    }

    public static final ServiceInfo getServiceInfo(Context context, Class<?> clazz) {
        return f54752a.getServiceInfo(context, new ComponentName(context, clazz), 4);
    }

    public static final ProviderInfo resolveContentProvider(Context context, String authority) {
        return f54752a.resolveContentProvider(context, authority);
    }

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static final String getAppVersionCodeString(Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    public static final String getAppVersionName(Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            return "0.0";
        }
        return str;
    }

    public static final boolean hasContentProvider(Context context, String authority) {
        if (resolveContentProvider(context, authority) != null) {
            return true;
        }
        return false;
    }
}
