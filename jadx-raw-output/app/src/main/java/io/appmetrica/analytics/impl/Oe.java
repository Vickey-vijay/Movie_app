package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes.dex */
public final class Oe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f55696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pe f55697d;

    public Oe(Pe pe2, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f55697d = pe2;
        this.f55694a = str;
        this.f55695b = str2;
        this.f55696c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f55697d.f55736d.get()).getPluginExtension().reportError(this.f55694a, this.f55695b, this.f55696c);
    }
}
