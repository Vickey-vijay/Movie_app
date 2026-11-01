package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes2.dex */
public final class Dj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f55146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55147b;

    public Dj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f55146a = pluginErrorDetails;
        this.f55147b = str;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.getPluginExtension().reportError(this.f55146a, this.f55147b);
    }
}
