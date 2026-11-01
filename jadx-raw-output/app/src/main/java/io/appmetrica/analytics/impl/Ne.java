package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes4.dex */
public final class Ne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f55631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pe f55633c;

    public Ne(Pe pe2, PluginErrorDetails pluginErrorDetails, String str) {
        this.f55633c = pe2;
        this.f55631a = pluginErrorDetails;
        this.f55632b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f55633c.f55736d.get()).getPluginExtension().reportError(this.f55631a, this.f55632b);
    }
}
