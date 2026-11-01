package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4374mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f57281a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4424og f57282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xo f57284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f57285e;

    public final void a() {
        if (this.f57283c) {
            return;
        }
        Context context = this.f57285e;
        Pa paA = C4623wg.a(context, C4418oa.I.f57406d.a());
        InterfaceC4548tg interfaceC4548tg = (InterfaceC4548tg) new C4194fg(this, new C4623wg(paA), new Aa(context), new C4648xg(context)).f56770f.getValue();
        try {
            paA.a(interfaceC4548tg);
        } catch (Throwable th2) {
            interfaceC4548tg.a(th2);
        }
    }

    public C4374mg(Context context, xo xoVar) {
        this.f57285e = context;
        this.f57284d = xoVar;
        this.f57282b = xoVar.b();
        this.f57283c = xoVar.c();
    }

    public final synchronized void a(C4474qg c4474qg) {
        this.f57281a.add(c4474qg);
        if (this.f57283c) {
            c4474qg.a(this.f57282b);
        }
    }

    public final synchronized void a(C4424og c4424og) {
        Iterator it = this.f57281a.iterator();
        while (it.hasNext()) {
            ((C4474qg) it.next()).a(c4424og);
        }
    }
}
