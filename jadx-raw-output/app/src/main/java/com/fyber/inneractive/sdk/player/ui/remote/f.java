package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.player.ui.o;
import com.fyber.inneractive.sdk.player.ui.s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f18107a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18114h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18108b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18109c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18110d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18111e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18112f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18113g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18115i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18116j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f18117k = m.NONE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18118l = "";

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        s sVar = this.f18107a;
        if (sVar == null) {
            IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.f18108b);
        this.f18107a.d(this.f18115i);
        this.f18107a.f(this.f18112f);
        this.f18107a.a(this.f18111e, this.f18117k);
        this.f18107a.c(this.f18114h);
        this.f18107a.a(this.f18116j, this.f18118l);
        this.f18107a.b(this.f18113g);
        this.f18107a.e(this.f18109c);
        this.f18107a.a(this.f18110d);
    }

    public f(o oVar) {
        this.f18107a = null;
        this.f18114h = false;
        this.f18107a = oVar;
        this.f18114h = oVar.H;
    }
}
