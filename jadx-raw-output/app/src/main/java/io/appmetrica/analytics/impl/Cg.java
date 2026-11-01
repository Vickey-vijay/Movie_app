package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class Cg implements Rl, Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f55106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S4 f55107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bm f55108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Qa f55109e;

    public Cg(Context context, R4 r10, C4462q4 c4462q4, Z4 z10, S4 s10, Il il2) {
        this.f55105a = context;
        this.f55106b = r10;
        this.f55107c = s10;
        Bm bmA = il2.a(context, r10, c4462q4.f57544a);
        this.f55108d = bmA;
        this.f55109e = z10.a(context, r10, c4462q4.f57545b, bmA);
        il2.a(r10, this);
    }

    @VisibleForTesting
    public final R4 a() {
        return this.f55106b;
    }

    @VisibleForTesting
    public final Context b() {
        return this.f55105a;
    }

    public final void a(InterfaceC4208g4 interfaceC4208g4) {
        this.f55107c.f55849a.add(interfaceC4208g4);
    }

    public final void b(InterfaceC4208g4 interfaceC4208g4) {
        this.f55107c.f55849a.remove(interfaceC4208g4);
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(C4226gm c4226gm) {
        ((Y4) this.f55109e).a(c4226gm);
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(Kl kl2, C4226gm c4226gm) {
        ((Y4) this.f55109e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(C4462q4 c4462q4) {
        this.f55108d.a(c4462q4.f57544a);
        this.f55109e.a(c4462q4.f57545b);
    }

    public Cg(Context context, R4 r10, C4462q4 c4462q4, Z4 z10) {
        this(context, r10, c4462q4, z10, new S4(), Il.a());
    }

    public final void a(Q5 q10, C4462q4 c4462q4) {
        if (!AbstractC4641x9.f57920c.contains(EnumC4112cb.a(q10.f55776d))) {
            this.f55109e.a(c4462q4.f57545b);
        }
        ((Y4) this.f55109e).a(q10);
    }
}
