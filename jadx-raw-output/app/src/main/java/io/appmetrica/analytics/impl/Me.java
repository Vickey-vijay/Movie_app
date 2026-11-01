package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class Me implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f55580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pe f55581b;

    public Me(Pe pe2, PluginErrorDetails pluginErrorDetails) {
        this.f55581b = pe2;
        this.f55580a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f55581b.f55736d.get()).getPluginExtension().reportUnhandledException(this.f55580a);
    }
}
