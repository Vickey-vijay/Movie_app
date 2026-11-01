package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ce2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ym1 f76248s = new ym1(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s63 f76249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f76250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f76252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pn0 f76254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f76255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i73 f76256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t73 f76257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f76258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ym1 f76259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f76260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f76261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ee2 f76262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f76263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f76264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f76265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f76266r;

    public ce2(s63 s63Var, ym1 ym1Var, long j10, long j11, int i10, pn0 pn0Var, boolean z10, i73 i73Var, t73 t73Var, List list, ym1 ym1Var2, boolean z11, int i11, ee2 ee2Var, long j12, long j13, long j14, boolean z12) {
        this.f76249a = s63Var;
        this.f76250b = ym1Var;
        this.f76251c = j10;
        this.f76252d = j11;
        this.f76253e = i10;
        this.f76254f = pn0Var;
        this.f76255g = z10;
        this.f76256h = i73Var;
        this.f76257i = t73Var;
        this.f76258j = list;
        this.f76259k = ym1Var2;
        this.f76260l = z11;
        this.f76261m = i11;
        this.f76262n = ee2Var;
        this.f76264p = j12;
        this.f76265q = j13;
        this.f76266r = j14;
        this.f76263o = z12;
    }

    public static ce2 a(t73 t73Var) {
        o63 o63Var = s63.f82545b;
        ym1 ym1Var = f76248s;
        return new ce2(o63Var, ym1Var, -9223372036854775807L, 0L, 1, null, false, i73.f78512e, t73Var, sm2.f82697f, ym1Var, false, 0, ee2.f77039e, 0L, 0L, 0L, false);
    }

    public final ce2 a(ym1 ym1Var, long j10, long j11, long j12, long j13, i73 i73Var, t73 t73Var, List list) {
        return new ce2(this.f76249a, ym1Var, j11, j12, this.f76253e, this.f76254f, this.f76255g, i73Var, t73Var, list, this.f76259k, this.f76260l, this.f76261m, this.f76262n, this.f76264p, j13, j10, this.f76263o);
    }

    public final ce2 a(s63 s63Var) {
        return new ce2(s63Var, this.f76250b, this.f76251c, this.f76252d, this.f76253e, this.f76254f, this.f76255g, this.f76256h, this.f76257i, this.f76258j, this.f76259k, this.f76260l, this.f76261m, this.f76262n, this.f76264p, this.f76265q, this.f76266r, this.f76263o);
    }

    public final ce2 a(int i10) {
        return new ce2(this.f76249a, this.f76250b, this.f76251c, this.f76252d, i10, this.f76254f, this.f76255g, this.f76256h, this.f76257i, this.f76258j, this.f76259k, this.f76260l, this.f76261m, this.f76262n, this.f76264p, this.f76265q, this.f76266r, this.f76263o);
    }

    public final ce2 a(pn0 pn0Var) {
        return new ce2(this.f76249a, this.f76250b, this.f76251c, this.f76252d, this.f76253e, pn0Var, this.f76255g, this.f76256h, this.f76257i, this.f76258j, this.f76259k, this.f76260l, this.f76261m, this.f76262n, this.f76264p, this.f76265q, this.f76266r, this.f76263o);
    }

    public final ce2 a(ym1 ym1Var) {
        return new ce2(this.f76249a, this.f76250b, this.f76251c, this.f76252d, this.f76253e, this.f76254f, this.f76255g, this.f76256h, this.f76257i, this.f76258j, ym1Var, this.f76260l, this.f76261m, this.f76262n, this.f76264p, this.f76265q, this.f76266r, this.f76263o);
    }
}
