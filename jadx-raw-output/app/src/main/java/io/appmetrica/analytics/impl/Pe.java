package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class Pe implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Se f55733a = new Se();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Te f55734b = new Te();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f55735c = C4105c4.l().g().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f55736d;

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        Se se2 = this.f55733a;
        se2.f55862a.a(pluginErrorDetails);
        if (se2.f55864c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f57616a) {
            this.f55734b.getClass();
            this.f55735c.execute(new Ne(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f55733a.f55862a.a(pluginErrorDetails);
        this.f55734b.getClass();
        this.f55735c.execute(new Me(this, pluginErrorDetails));
    }

    public Pe(@NonNull Provider<Sa> provider) {
        this.f55736d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f55733a.f55863b.a(str);
        this.f55734b.getClass();
        this.f55735c.execute(new Oe(this, str, str2, pluginErrorDetails));
    }
}
