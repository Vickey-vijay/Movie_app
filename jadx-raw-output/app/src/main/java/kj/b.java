package kj;

/* JADX INFO: compiled from: AsyncEvent.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f62818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f62819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f62820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f62821d;

    public b(a aVar, p pVar, t tVar) {
        this(aVar, pVar, tVar, null);
    }

    public b(a aVar, p pVar, t tVar, Throwable th2) {
        this.f62818a = aVar;
        this.f62819b = pVar;
        this.f62820c = tVar;
        this.f62821d = th2;
    }

    public p a() {
        return this.f62819b;
    }

    public t b() {
        return this.f62820c;
    }

    public Throwable c() {
        return this.f62821d;
    }
}
