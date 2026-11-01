package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class J0 implements AppMetricaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0 f55374a;

    public J0(L0 l10) {
        this.f55374a = l10;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f55374a.a(pluginErrorDetails, str);
    }

    public J0() {
        this(new L0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f55374a.a(str, str2, pluginErrorDetails);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f55374a.a(pluginErrorDetails);
    }
}
