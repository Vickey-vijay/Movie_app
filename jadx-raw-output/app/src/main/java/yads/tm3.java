package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class tm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f83100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83103d;

    public final boolean a() {
        boolean z10 = (((this.f83100a[this.f83102c] & 255) >> this.f83103d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f83102c + i11;
        this.f83102c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f83103d;
        this.f83103d = i13;
        if (i13 > 7) {
            this.f83102c = i12 + 1;
            this.f83103d = i13 - 8;
        }
        int i14 = this.f83102c;
        if (i14 >= 0) {
            int i15 = this.f83101b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f83103d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public tm3(byte[] bArr) {
        this.f83100a = bArr;
        this.f83101b = bArr.length;
    }

    public final int a(int i10) {
        int i11 = this.f83102c;
        int iMin = Math.min(i10, 8 - this.f83103d);
        int i12 = i11 + 1;
        int i13 = ((this.f83100a[i11] & 255) >> this.f83103d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f83100a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
