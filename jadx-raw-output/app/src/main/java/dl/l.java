package dl;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj.i<byte[]> f52162a = new nj.i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52163b;

    public final byte[] b(int i10) {
        byte[] bArrS;
        synchronized (this) {
            bArrS = this.f52162a.s();
            if (bArrS != null) {
                this.f52163b -= bArrS.length / 2;
            } else {
                bArrS = null;
            }
        }
        return bArrS == null ? new byte[i10] : bArrS;
    }

    public final void a(byte[] bArr) {
        ck.p.j(bArr, "array");
        synchronized (this) {
            if (this.f52163b + bArr.length < i.f52154a) {
                this.f52163b += bArr.length / 2;
                this.f52162a.addLast(bArr);
            }
            mj.r rVar = mj.r.f64562a;
        }
    }
}
