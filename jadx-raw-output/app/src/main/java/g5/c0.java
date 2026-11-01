package g5;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f53059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f53062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k3.l0 f53063f = k3.l0.f62208e;

    public void a(long j10) {
        this.f53061d = j10;
        if (this.f53060c) {
            this.f53062e = this.f53059b.elapsedRealtime();
        }
    }

    @Override // g5.o
    public void b(k3.l0 l0Var) {
        if (this.f53060c) {
            a(getPositionUs());
        }
        this.f53063f = l0Var;
    }

    public void c() {
        if (this.f53060c) {
            return;
        }
        this.f53062e = this.f53059b.elapsedRealtime();
        this.f53060c = true;
    }

    public void d() {
        if (this.f53060c) {
            a(getPositionUs());
            this.f53060c = false;
        }
    }

    @Override // g5.o
    public k3.l0 getPlaybackParameters() {
        return this.f53063f;
    }

    @Override // g5.o
    public long getPositionUs() {
        long j10 = this.f53061d;
        if (!this.f53060c) {
            return j10;
        }
        long jElapsedRealtime = this.f53059b.elapsedRealtime() - this.f53062e;
        k3.l0 l0Var = this.f53063f;
        return j10 + (l0Var.f62209a == 1.0f ? k3.k.a(jElapsedRealtime) : l0Var.a(jElapsedRealtime));
    }

    public c0(c cVar) {
        this.f53059b = cVar;
    }
}
