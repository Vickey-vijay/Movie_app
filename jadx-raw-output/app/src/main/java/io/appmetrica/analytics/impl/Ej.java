package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class Ej implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f55189c;

    public Ej(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f55187a = str;
        this.f55188b = str2;
        this.f55189c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.getPluginExtension().reportError(this.f55187a, this.f55188b, this.f55189c);
    }
}
