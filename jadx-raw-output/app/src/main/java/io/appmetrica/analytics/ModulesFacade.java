package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.AbstractC4426oi;
import io.appmetrica.analytics.impl.C4217gd;
import io.appmetrica.analytics.impl.C4269id;
import io.appmetrica.analytics.impl.C4294jd;
import io.appmetrica.analytics.impl.C4320kd;
import io.appmetrica.analytics.impl.C4346ld;
import io.appmetrica.analytics.impl.C4371md;
import io.appmetrica.analytics.impl.C4396nd;
import io.appmetrica.analytics.impl.C4421od;
import io.appmetrica.analytics.impl.C4682z0;

/* JADX INFO: loaded from: classes8.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C4421od f54374a = new C4421od();

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C4421od c4421od = f54374a;
        C4217gd c4217gd = c4421od.f57430b;
        c4217gd.f56809b.a(context);
        c4217gd.f56811d.a(str);
        c4421od.f57431c.f57819a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC4426oi.f57449a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C4421od c4421od = f54374a;
        c4421od.f57430b.getClass();
        c4421od.f57431c.getClass();
        c4421od.f57429a.getClass();
        return C4682z0.a();
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C4421od c4421od = f54374a;
        boolean zBooleanValue = bool.booleanValue();
        c4421od.f57430b.getClass();
        c4421od.f57431c.getClass();
        c4421od.f57432d.execute(new C4269id(c4421od, adRevenue, zBooleanValue));
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C4421od c4421od = f54374a;
        c4421od.f57430b.f56808a.a(null);
        c4421od.f57431c.getClass();
        c4421od.f57432d.execute(new C4294jd(c4421od, moduleEvent));
    }

    public static void reportExternalAttribution(int i10, @NonNull String str) {
        C4421od c4421od = f54374a;
        c4421od.f57430b.getClass();
        c4421od.f57431c.getClass();
        c4421od.f57432d.execute(new C4320kd(c4421od, i10, str));
    }

    public static void sendEventsBuffer() {
        C4421od c4421od = f54374a;
        c4421od.f57430b.getClass();
        c4421od.f57431c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        C4421od c4421od = f54374a;
        c4421od.f57430b.getClass();
        c4421od.f57431c.getClass();
        c4421od.f57432d.execute(new C4346ld(c4421od, z10));
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C4421od c4421od) {
        f54374a = c4421od;
    }

    public static void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C4421od c4421od = f54374a;
        c4421od.f57430b.f56810c.a(str);
        c4421od.f57431c.getClass();
        c4421od.f57432d.execute(new C4371md(c4421od, str, bArr));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        C4421od c4421od = f54374a;
        C4217gd c4217gd = c4421od.f57430b;
        c4217gd.f56809b.a(context);
        c4217gd.f56811d.a(str);
        c4421od.f57431c.f57819a.a(context.getApplicationContext());
        c4421od.f57432d.execute(new C4396nd(str));
    }
}
