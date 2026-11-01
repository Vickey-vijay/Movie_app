package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17077d;

    public final boolean a() {
        boolean z10 = (((this.f17074a[this.f17076c] & 255) >> this.f17077d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f17076c + i11;
        this.f17076c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f17077d;
        this.f17077d = i13;
        if (i13 > 7) {
            this.f17076c = i12 + 1;
            this.f17077d = i13 - 8;
        }
        int i14 = this.f17076c;
        if (i14 >= 0) {
            int i15 = this.f17075b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f17077d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public m(byte[] bArr) {
        this.f17074a = bArr;
        this.f17075b = bArr.length;
    }

    public final int a(int i10) {
        int i11 = this.f17076c;
        int iMin = Math.min(i10, 8 - this.f17077d);
        int i12 = i11 + 1;
        int i13 = ((this.f17074a[i11] & 255) >> this.f17077d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f17074a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
