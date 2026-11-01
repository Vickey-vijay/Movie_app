package mm;

import java.io.IOException;

/* JADX INFO: compiled from: AbstractConnection.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zm.c f64593d = zm.b.a(b.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f64595c;

    public b(k kVar) {
        this.f64595c = kVar;
        this.f64594b = System.currentTimeMillis();
    }

    public String toString() {
        return String.format("%s@%x", getClass().getSimpleName(), Integer.valueOf(hashCode()));
    }

    @Override // mm.j
    public void a(long j10) {
        try {
            f64593d.i("onIdleExpired {}ms {} {}", Long.valueOf(j10), this, this.f64595c);
            if (this.f64595c.x() || this.f64595c.s()) {
                this.f64595c.close();
            } else {
                this.f64595c.l();
            }
        } catch (IOException e10) {
            f64593d.h(e10);
            try {
                this.f64595c.close();
            } catch (IOException e11) {
                f64593d.h(e11);
            }
        }
    }

    @Override // mm.j
    public long d() {
        return this.f64594b;
    }

    public k f() {
        return this.f64595c;
    }

    public b(k kVar, long j10) {
        this.f64595c = kVar;
        this.f64594b = j10;
    }
}
