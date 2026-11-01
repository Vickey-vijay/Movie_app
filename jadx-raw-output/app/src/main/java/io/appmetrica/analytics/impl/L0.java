package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f55493a = C4105c4.l().g().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4682z0 f55494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Re f55495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ue f55496d;

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        Re re2 = this.f55495c;
        re2.f55820a.a(null);
        re2.f55821b.a(pluginErrorDetails);
        Ue ue2 = this.f55496d;
        ck.p.g(pluginErrorDetails);
        ue2.getClass();
        this.f55493a.execute(new Runnable() { // from class: af.m
            @Override // java.lang.Runnable
            public final void run() {
                L0.a(this.f3571b, pluginErrorDetails);
            }
        });
    }

    public L0() {
        C4682z0 c4682z0 = new C4682z0();
        this.f55494b = c4682z0;
        this.f55495c = new Re(c4682z0);
        this.f55496d = new Ue();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        Re re2 = this.f55495c;
        re2.f55820a.a(null);
        re2.f55821b.a(pluginErrorDetails);
        if (re2.f55823d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f57616a) {
            Ue ue2 = this.f55496d;
            ck.p.g(pluginErrorDetails);
            ue2.getClass();
            this.f55493a.execute(new Runnable() { // from class: af.l
                @Override // java.lang.Runnable
                public final void run() {
                    L0.a(this.f3568b, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        Re re2 = this.f55495c;
        re2.f55820a.a(null);
        re2.f55822c.a(str);
        Ue ue2 = this.f55496d;
        ck.p.g(str);
        ue2.getClass();
        this.f55493a.execute(new Runnable() { // from class: af.k
            @Override // java.lang.Runnable
            public final void run() {
                L0.a(this.f3564b, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(L0 l10, PluginErrorDetails pluginErrorDetails, String str) {
        l10.f55494b.getClass();
        C4657y0 c4657y0 = C4657y0.f57980e;
        ck.p.g(c4657y0);
        C4319kc c4319kcI = c4657y0.f().i();
        ck.p.g(c4319kcI);
        c4319kcI.f57104a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l10, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l10.f55494b.getClass();
        C4657y0 c4657y0 = C4657y0.f57980e;
        ck.p.g(c4657y0);
        C4319kc c4319kcI = c4657y0.f().i();
        ck.p.g(c4319kcI);
        c4319kcI.f57104a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l10, PluginErrorDetails pluginErrorDetails) {
        l10.f55494b.getClass();
        C4657y0 c4657y0 = C4657y0.f57980e;
        ck.p.g(c4657y0);
        C4319kc c4319kcI = c4657y0.f().i();
        ck.p.g(c4319kcI);
        c4319kcI.f57104a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
