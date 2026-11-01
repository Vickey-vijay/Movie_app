package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class j33 implements zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv f78903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f78905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f78906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ee2 f78907f = ee2.f77039e;

    @Override // yads.zj1
    public final long a() {
        long j10 = this.f78905d;
        if (!this.f78904c) {
            return j10;
        }
        ((f53) this.f78903b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f78906e;
        ee2 ee2Var = this.f78907f;
        return j10 + (ee2Var.f77040b == 1.0f ? ib3.a(jElapsedRealtime) : jElapsedRealtime * ((long) ee2Var.f77042d));
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        return this.f78907f;
    }

    public j33(f53 f53Var) {
        this.f78903b = f53Var;
    }

    public final void a(long j10) {
        this.f78905d = j10;
        if (this.f78904c) {
            ((f53) this.f78903b).getClass();
            this.f78906e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        if (this.f78904c) {
            a(a());
        }
        this.f78907f = ee2Var;
    }
}
