package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0006H&¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceModule;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceConfig;", "config", "Lmj/r;", C3426d4.a.f28413f, "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashHandler;", "handler", "setDefaultCrashHandler", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "getAllCrashes", "", CommonUrlParts.UUID, "markCrashCompleted", "deleteCompletedCrashes", "<init>", "()V", "ndkcrashes-api_release"}, k = 1, mv = {1, 6, 0})
public abstract class NativeCrashServiceModule {
    public abstract void deleteCompletedCrashes();

    public abstract List<NativeCrash> getAllCrashes();

    public abstract void init(Context context, NativeCrashServiceConfig nativeCrashServiceConfig);

    public abstract void markCrashCompleted(String str);

    public abstract void setDefaultCrashHandler(NativeCrashHandler nativeCrashHandler);
}
