package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f17987c;

    public a(p pVar, int i10, int i11) {
        this.f17987c = pVar;
        this.f17985a = i10;
        this.f17986b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17987c.f18012i != null) {
            Locale locale = Locale.ENGLISH;
            String str = "Player Error: " + this.f17985a + ", " + this.f17986b;
            n nVar = this.f17987c.f18012i;
            o oVar = new o(str);
            q qVar = (q) nVar;
            qVar.a(com.fyber.inneractive.sdk.player.enums.b.Error);
            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(qVar), oVar);
            qVar.f16241i.post(new com.fyber.inneractive.sdk.player.controller.j(qVar, oVar));
            qVar.k();
        }
    }
}
