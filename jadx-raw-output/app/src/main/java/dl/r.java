package dl;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f52190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52191b;

    public void b() {
        this.f52191b = true;
    }

    public void c() {
        this.f52191b = false;
    }

    public void o() {
    }

    public void p() {
    }

    public r(r0 r0Var) {
        ck.p.j(r0Var, "writer");
        this.f52190a = r0Var;
        this.f52191b = true;
    }

    public final boolean a() {
        return this.f52191b;
    }

    public void d(byte b10) {
        this.f52190a.writeLong(b10);
    }

    public final void e(char c10) {
        this.f52190a.a(c10);
    }

    public void f(double d10) {
        this.f52190a.c(String.valueOf(d10));
    }

    public void g(float f10) {
        this.f52190a.c(String.valueOf(f10));
    }

    public void h(int i10) {
        this.f52190a.writeLong(i10);
    }

    public void i(long j10) {
        this.f52190a.writeLong(j10);
    }

    public final void j(String str) {
        ck.p.j(str, "v");
        this.f52190a.c(str);
    }

    public void k(short s10) {
        this.f52190a.writeLong(s10);
    }

    public void l(boolean z10) {
        this.f52190a.c(String.valueOf(z10));
    }

    public void m(String str) {
        ck.p.j(str, "value");
        this.f52190a.b(str);
    }

    public final void n(boolean z10) {
        this.f52191b = z10;
    }
}
