package dl;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj.i<char[]> f52168a = new nj.i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52169b;

    public final char[] b(int i10) {
        char[] cArrS;
        synchronized (this) {
            cArrS = this.f52168a.s();
            if (cArrS != null) {
                this.f52169b -= cArrS.length;
            } else {
                cArrS = null;
            }
        }
        return cArrS == null ? new char[i10] : cArrS;
    }

    public final void a(char[] cArr) {
        ck.p.j(cArr, "array");
        synchronized (this) {
            if (this.f52169b + cArr.length < i.f52154a) {
                this.f52169b += cArr.length;
                this.f52168a.addLast(cArr);
            }
            mj.r rVar = mj.r.f64562a;
        }
    }
}
