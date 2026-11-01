package y5;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: Binarizer.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f75272a;

    public abstract a a(d dVar);

    public abstract c6.b b() throws NotFoundException;

    public abstract c6.a c(int i10, c6.a aVar) throws NotFoundException;

    public final int d() {
        return this.f75272a.a();
    }

    public final d e() {
        return this.f75272a;
    }

    public final int f() {
        return this.f75272a.d();
    }

    public a(d dVar) {
        this.f75272a = dVar;
    }
}
