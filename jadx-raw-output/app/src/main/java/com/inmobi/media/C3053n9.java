package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3053n9 implements InterfaceC3028m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gh f24879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mj f24880b;

    public C3053n9(Context context, double d10, Ab ab2, boolean z10, int i10, long j10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(ab2, "logLevel");
        this.f24880b = new Mj();
        if (z10) {
            return;
        }
        Gh gh2 = new Gh(context, d10, ab2, j10, i10);
        this.f24879a = gh2;
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
        ck.p.g(gh2);
        Lb.b(gh2);
    }

    public final void a(String str, String str2) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.a(Ab.DEBUG, str, str2);
        }
        if (this.f24880b != null) {
            ck.p.j(str, "tag");
            ck.p.j(str2, "message");
        }
    }

    public final void b(String str, String str2) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.a(Ab.ERROR, str, str2);
        }
        if (this.f24880b != null) {
            ck.p.j(str, "tag");
            ck.p.j(str2, "message");
        }
    }

    public final void c(String str, String str2) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.a(Ab.INFO, str, str2);
        }
        if (this.f24880b != null) {
            ck.p.j(str, "tag");
            ck.p.j(str2, "message");
        }
    }

    public final void d(String str, String str2) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.a(Ab.STATE, str, str2);
        }
        if (this.f24880b != null) {
            ck.p.j(str, "tag");
            ck.p.j("STATE_CHANGE: " + str2, "message");
        }
    }

    public final void a(String str, String str2, Exception exc) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "message");
        ck.p.j(exc, "error");
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.a(Ab.ERROR, str, str2 + "\nError: " + mj.d.b(exc));
        }
        if (this.f24880b != null) {
            ck.p.j(str, "tag");
            ck.p.j(str2, "message");
            ck.p.j(exc, "error");
        }
    }

    public final void a(boolean z10) {
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.b(z10);
        }
        if (z10) {
            return;
        }
        Gh gh3 = this.f24879a;
        if (gh3 == null || !gh3.f22741f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
            Lb.a(this.f24879a);
            this.f24879a = null;
        }
    }

    public final void a() {
        Gh gh2 = this.f24879a;
        if (gh2 != null) {
            gh2.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
        Lb.a(this.f24879a);
    }
}
