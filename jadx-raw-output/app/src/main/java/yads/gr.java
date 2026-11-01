package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class gr {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fr f77907e = new fr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f77908a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f77909b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77910c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77911d = 4096;

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f77909b.size(); i11++) {
            byte[] bArr = (byte[]) this.f77909b.get(i11);
            if (bArr.length >= i10) {
                this.f77910c -= bArr.length;
                this.f77909b.remove(i11);
                this.f77908a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f77911d) {
                this.f77908a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f77909b, bArr, f77907e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f77909b.add(iBinarySearch, bArr);
                this.f77910c += bArr.length;
                a();
            }
        }
    }

    public final synchronized void a() {
        while (this.f77910c > this.f77911d) {
            byte[] bArr = (byte[]) this.f77908a.remove(0);
            this.f77909b.remove(bArr);
            this.f77910c -= bArr.length;
        }
    }
}
