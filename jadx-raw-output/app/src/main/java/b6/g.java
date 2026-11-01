package b6;

/* JADX INFO: compiled from: Token.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f4833b = new e(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4834a;

    public abstract void c(c6.a aVar, byte[] bArr);

    public final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    public final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    public final g d() {
        return this.f4834a;
    }

    public g(g gVar) {
        this.f4834a = gVar;
    }
}
