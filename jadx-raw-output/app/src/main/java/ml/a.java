package ml;

import ml.c;

/* JADX INFO: compiled from: FinitePool.java */
/* JADX INFO: loaded from: classes8.dex */
public class a<T extends c<T>> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<T> f64576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f64579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64580e;

    @Override // ml.b
    public T acquire() {
        T t10 = this.f64579d;
        if (t10 != null) {
            this.f64579d = (T) t10.b();
            this.f64580e--;
        } else {
            t10 = (T) this.f64576a.newInstance();
        }
        if (t10 != null) {
            t10.d(null);
            t10.e(false);
            this.f64576a.a(t10);
        }
        return t10;
    }

    public a(d<T> dVar, int i10) {
        if (i10 > 0) {
            this.f64576a = dVar;
            this.f64577b = i10;
            this.f64578c = false;
            return;
        }
        throw new IllegalArgumentException("The pool limit must be > 0");
    }

    @Override // ml.b
    public void a(T t10) {
        if (!t10.f()) {
            if (this.f64578c || this.f64580e < this.f64577b) {
                this.f64580e++;
                t10.d(this.f64579d);
                t10.e(true);
                this.f64579d = t10;
            }
            this.f64576a.b(t10);
            return;
        }
        System.out.print("[FinitePool] Element is already in pool: " + t10);
    }
}
