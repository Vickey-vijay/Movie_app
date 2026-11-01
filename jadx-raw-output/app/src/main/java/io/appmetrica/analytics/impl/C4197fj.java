package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4197fj implements SdkEnvironmentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb f56775b = new Jb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f56776c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SdkEnvironment f56777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f56778e;

    public final synchronized void a(ScreenInfo screenInfo) {
        float f10;
        if (screenInfo != null) {
            if (!ck.p.e(screenInfo, getSdkEnvironment().getScreenInfo())) {
                String str = this.f56778e;
                if (str == null) {
                    Context context = this.f56774a;
                    Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                    SafePackageManager safePackageManager = O7.f55672a;
                    try {
                        f10 = context.getResources().getDisplayMetrics().density;
                    } catch (Throwable unused) {
                        f10 = 0.0f;
                    }
                    if (Float.isNaN(f10) || f10 == 0.0f) {
                        str = "phone";
                    } else {
                        int i10 = point.x;
                        int i11 = point.y;
                        if (O7.a(context)) {
                            str = "tv";
                        } else {
                            float f11 = 160 * f10;
                            float f12 = i10;
                            float f13 = f12 / f11;
                            float f14 = i11;
                            float f15 = f14 / f11;
                            str = (Math.sqrt((double) ((f15 * f15) + (f13 * f13))) >= ((double) 7) || ik.k.f(f12 / f10, f14 / f10) >= ((float) 600)) ? "tablet" : "phone";
                        }
                    }
                }
                this.f56777d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                Iterator it = this.f56776c.iterator();
                while (it.hasNext()) {
                    ((AbstractC4438p5) ((InterfaceC4171ej) it.next())).d();
                }
            }
        }
    }

    public final void b(InterfaceC4171ej interfaceC4171ej) {
        this.f56776c.remove(interfaceC4171ej);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f56777d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        ck.p.B("sdkEnvironment");
        return null;
    }

    public C4197fj(Context context) {
        this.f56774a = context;
        this.f56777d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.14.0", "50145656", AbstractC4223gj.a()), "phone", Jb.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!ck.p.e(str, this.f56778e)) {
                this.f56778e = str;
                if (!ck.p.e(str, getSdkEnvironment().getDeviceType())) {
                    this.f56777d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f56776c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC4438p5) ((InterfaceC4171ej) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!ck.p.e(appVersionInfo.getAppVersionName(), str) || !ck.p.e(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f56777d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f56776c.iterator();
            while (it.hasNext()) {
                ((AbstractC4438p5) ((InterfaceC4171ej) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f56775b.getClass();
        List listA = Jb.a(configuration);
        if (!ck.p.e(getSdkEnvironment().getLocales(), listA)) {
            this.f56777d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listA, 31, null);
            Iterator it = this.f56776c.iterator();
            while (it.hasNext()) {
                ((AbstractC4438p5) ((InterfaceC4171ej) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC4171ej interfaceC4171ej) {
        this.f56776c.add(interfaceC4171ej);
    }
}
