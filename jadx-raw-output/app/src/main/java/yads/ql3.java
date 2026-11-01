package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class ql3 implements qf3, sf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f81881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg3 f81882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yj3 f81883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final af3 f81884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk3 f81885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f81886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81887g;

    public ql3(je3 je3Var, jg3 jg3Var, zj3 zj3Var, af3 af3Var, gk3 gk3Var) {
        this.f81881a = je3Var;
        this.f81882b = jg3Var;
        this.f81883c = zj3Var;
        this.f81884d = af3Var;
        this.f81885e = gk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f81887g) {
            return;
        }
        mj.r rVar = null;
        if (!this.f81885e.a() || this.f81882b.a() != hg3.f78223e) {
            this.f81886f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.f81886f;
        if (l10 != null) {
            if (jElapsedRealtime - l10.longValue() >= 2000) {
                this.f81887g = true;
                this.f81884d.i(this.f81881a);
                this.f81883c.n();
            }
            rVar = mj.r.f64562a;
        }
        if (rVar == null) {
            this.f81886f = Long.valueOf(jElapsedRealtime);
            this.f81884d.a(this.f81881a);
        }
    }

    @Override // yads.sf3
    public final void b() {
        this.f81886f = null;
    }

    public /* synthetic */ ql3(je3 je3Var, ek3 ek3Var, jg3 jg3Var, zj3 zj3Var, af3 af3Var) {
        this(je3Var, jg3Var, zj3Var, af3Var, new gk3(ek3Var));
    }

    @Override // yads.sf3
    public final void a() {
        this.f81886f = null;
    }
}
