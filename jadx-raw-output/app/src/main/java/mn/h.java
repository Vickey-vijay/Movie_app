package mn;

import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: NetworkAddress.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InetAddress f64636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f64638c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f64637b == hVar.f64637b && this.f64636a.equals(hVar.f64636a) && Arrays.equals(this.f64638c, hVar.f64638c);
    }

    public InetAddress a() {
        return this.f64636a;
    }

    public byte[] b() {
        return this.f64638c;
    }

    public int c() {
        return this.f64637b;
    }

    public int hashCode() {
        int iHashCode = ((this.f64636a.hashCode() * 31) + this.f64637b) * 31;
        byte[] bArr = this.f64638c;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public h(InetAddress inetAddress, int i10, byte[] bArr) {
        this.f64636a = inetAddress;
        this.f64637b = i10;
        this.f64638c = bArr;
    }
}
