package k8;

/* JADX INFO: compiled from: ObjectPools.java */
/* JADX INFO: loaded from: classes9.dex */
public class b<T> extends a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62650b = new Object();

    @Override // k8.a
    public T a() {
        T t10;
        synchronized (this.f62650b) {
            t10 = (T) super.a();
        }
        return t10;
    }

    @Override // k8.a
    public void b() {
        synchronized (this.f62650b) {
            super.b();
        }
    }

    @Override // k8.a
    public boolean d(T t10) {
        boolean zD;
        synchronized (this.f62650b) {
            zD = super.d(t10);
        }
        return zD;
    }
}
