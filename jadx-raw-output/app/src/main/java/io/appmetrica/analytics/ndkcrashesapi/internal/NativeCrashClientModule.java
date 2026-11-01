package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientModule;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientConfig;", "config", "Lmj/r;", "initHandling", "", "metadata", "updateAppMetricaMetadata", "<init>", "()V", "ndkcrashes-api_release"}, k = 1, mv = {1, 6, 0})
public abstract class NativeCrashClientModule {
    public abstract void initHandling(Context context, NativeCrashClientConfig nativeCrashClientConfig);

    public abstract void updateAppMetricaMetadata(String str);
}
