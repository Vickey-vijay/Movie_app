package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C4049a0;
import io.appmetrica.analytics.impl.C4075b0;
import io.appmetrica.analytics.impl.C4105c4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaLibraryAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static F0 f54351a = new F0();

    public static void activate(@NonNull Context context) {
        F0 f10 = f54351a;
        if (!f10.f55212a.f55086a.a(context).f57616a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Db db2 = f10.f55213b;
        Context applicationContext = context.getApplicationContext();
        db2.getClass();
        C4105c4.l().f56442g.a(applicationContext);
        C4105c4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        f54351a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        F0 f10 = f54351a;
        if (f10.f55212a.f55088c.a((Void) null).f57616a) {
            f10.f55213b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z10);
        }
    }

    @VisibleForTesting
    public static void setProxy(@NonNull F0 f10) {
        f54351a = f10;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        F0 f10 = f54351a;
        f10.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Cb cb2 = f10.f55212a;
        if (cb2.f55092g.a(str).f57616a && cb2.f55086a.a(context).f57616a) {
            f10.f55213b.getClass();
            C4105c4.l().f56442g.a(context);
            C4075b0 c4075b0B = C4105c4.l().b();
            c4075b0B.f56390c.a().executeDelayed(new C4049a0(c4075b0B, context), c4075b0B.f56391d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f10 = f54351a;
        Cb cb2 = f10.f55212a;
        if (cb2.f55086a.a(context).f57616a && cb2.f55087b.a(appMetricaLibraryAdapterConfig).f57616a) {
            Db db2 = f10.f55213b;
            Context applicationContext = context.getApplicationContext();
            db2.getClass();
            C4105c4.l().f56442g.a(applicationContext);
            C4105c4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
