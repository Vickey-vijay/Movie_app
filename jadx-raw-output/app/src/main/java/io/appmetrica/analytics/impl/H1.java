package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: loaded from: classes5.dex */
public final class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f55290a = new SafePackageManager();

    public final Intent a(Context context) {
        Bundle bundle;
        C4120cj c4120cj;
        String strA;
        C4105c4.l().f56456u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(H7.f55295b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Cf.f55102c).build());
        ApplicationInfo applicationInfo = this.f55290a.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = data.putExtras(bundle);
        C4105c4 c4105c4L = C4105c4.l();
        synchronized (c4105c4L) {
            if (c4105c4L.f56450o == null) {
                C4120cj c4120cj2 = new C4120cj();
                c4105c4L.f56450o = c4120cj2;
                c4105c4L.f56443h.a(c4120cj2);
            }
            c4120cj = c4105c4L.f56450o;
        }
        ScreenInfo screenInfoB = c4120cj.b(context);
        if (screenInfoB != null) {
            strA = AbstractC4241hb.a(screenInfoB);
        } else {
            strA = null;
        }
        return intentPutExtras.putExtra("screen_size", strA);
    }
}
