package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class M5 extends BaseRequestConfig.DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C4226gm f55547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SdkEnvironmentProvider f55548b;

    public M5(@NonNull C4226gm c4226gm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c4226gm.c(), c4226gm.a(), c4226gm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f55547a = c4226gm;
        this.f55548b = sdkEnvironmentProvider;
    }
}
