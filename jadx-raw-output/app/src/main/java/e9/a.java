package e9;

/* JADX INFO: compiled from: ClingControlPoint.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements e<ln.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f52459b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ln.b f52460a;

    public static a c() {
        if (f52459b == null) {
            f52459b = new a();
        }
        return f52459b;
    }

    @Override // e9.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ln.b b() {
        return this.f52460a;
    }

    public void d(ln.b bVar) {
        this.f52460a = bVar;
    }
}
