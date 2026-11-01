package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes6.dex */
public abstract class N5 extends BaseRequestConfig.ComponentLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f55608a;

    public N5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    public N5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f55608a = safePackageManager;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: a */
    public O5 load(@NonNull M5 m10) {
        String str;
        String str2;
        O5 o10 = (O5) super.load(m10);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f55608a.getApplicationInfo(getContext(), getPackageName(), 0);
        String str3 = "1";
        if (applicationInfo != null) {
            int i10 = applicationInfo.flags;
            if ((i10 & 2) != 0) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            o10.f55669a = str2;
            if ((i10 & 1) == 0) {
                str3 = "0";
            }
            o10.f55670b = str3;
        } else if (TextUtils.equals(packageName, getPackageName())) {
            if ((getContext().getApplicationInfo().flags & 2) != 0) {
                str = "1";
            } else {
                str = "0";
            }
            o10.f55669a = str;
            if ((getContext().getApplicationInfo().flags & 1) == 0) {
                str3 = "0";
            }
            o10.f55670b = str3;
        } else {
            o10.f55669a = "0";
            o10.f55670b = "0";
        }
        C4226gm c4226gm = m10.f55547a;
        o10.f55671c = c4226gm;
        o10.setRetryPolicyConfig(c4226gm.f56850t);
        return o10;
    }
}
