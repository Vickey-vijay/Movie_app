package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17844d;

    public m(byte[] bArr) {
        int length = bArr.length;
        this.f17841a = bArr;
        this.f17844d = length;
    }

    public final int a(int i10) {
        int i11;
        this.f17843c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f17843c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f17843c = i13;
            byte[] bArr = this.f17841a;
            int i14 = this.f17842b;
            this.f17842b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f17841a;
        int i15 = this.f17842b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f17843c = 0;
            this.f17842b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        this.f17842b = i11;
        this.f17843c = i10 - (i11 * 8);
        a();
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f17842b + i11;
        this.f17842b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f17843c;
        this.f17843c = i13;
        if (i13 > 7) {
            this.f17842b = i12 + 1;
            this.f17843c = i13 - 8;
        }
        a();
    }

    public final boolean b() {
        byte[] bArr = this.f17841a;
        int i10 = this.f17842b;
        byte b10 = bArr[i10];
        int i11 = this.f17843c;
        boolean z10 = (b10 & (128 >> i11)) != 0;
        int i12 = i11 + 1;
        this.f17843c = i12;
        if (i12 == 8) {
            this.f17843c = 0;
            this.f17842b = i10 + 1;
        }
        a();
        return z10;
    }

    public final void a() {
        int i10 = this.f17842b;
        if (i10 >= 0) {
            int i11 = this.f17844d;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f17843c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
