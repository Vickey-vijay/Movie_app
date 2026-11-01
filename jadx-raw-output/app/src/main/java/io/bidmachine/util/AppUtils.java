package io.bidmachine.util;

import android.content.Context;
import android.security.NetworkSecurityPolicy;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/AppUtils;", "", "()V", "canUseCleartextTraffic", "", "getAppName", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getAppVersion", "isDebuggable", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppUtils {
    public static final AppUtils INSTANCE = new AppUtils();

    private AppUtils() {
    }

    public static final String getAppName(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return AppUtilsKt.getAppName(context);
    }

    public static final String getAppVersion(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return AppUtilsKt.getAppVersion(context);
    }

    public static final boolean isDebuggable(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return AppUtilsKt.isDebuggable(context);
    }

    public static final boolean canUseCleartextTraffic() {
        boolean z10;
        Boolean bool = AppUtilsKt.isCleartextTrafficPermitted;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
            z10 = true;
        } else {
            z10 = false;
        }
        AppUtilsKt.isCleartextTrafficPermitted = Boolean.valueOf(z10);
        return z10;
    }
}
