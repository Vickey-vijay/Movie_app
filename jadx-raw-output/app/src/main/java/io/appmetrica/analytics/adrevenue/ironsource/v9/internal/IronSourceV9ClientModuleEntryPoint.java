package io.appmetrica.analytics.adrevenue.ironsource.v9.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.adrevenue.ironsource.v9.impl.c;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class IronSourceV9ClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ClientContext f54420a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f54421b = new AtomicBoolean(false);

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NonNull
    public String getIdentifier() {
        return "ad-revenue-ironsource-v9";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @Nullable
    public AdRevenueCollector getAdRevenueCollector() {
        return new a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NonNull ClientContext clientContext) {
        this.f54420a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        ClientContext clientContext;
        if (!ReflectionUtils.detectClassExists("com.unity3d.mediation.LevelPlay") || (clientContext = this.f54420a) == null) {
            return;
        }
        LevelPlay.addImpressionDataListener(new c(clientContext));
        this.f54421b.set(true);
    }
}
