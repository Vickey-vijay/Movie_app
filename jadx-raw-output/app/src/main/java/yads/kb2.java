package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f79358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79361d;

    public final void a() {
        int i10 = this.f79360c;
        if (i10 >= 0) {
            int i11 = this.f79359b;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f79361d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i10 = this.f79360c;
        int i11 = this.f79361d;
        int i12 = 0;
        while (this.f79360c < this.f79359b && !c()) {
            i12++;
        }
        boolean z10 = this.f79360c == this.f79359b;
        this.f79360c = i10;
        this.f79361d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final boolean c() {
        boolean z10 = (this.f79358a[this.f79360c] & (128 >> this.f79361d)) != 0;
        f();
        return z10;
    }

    public final int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public final void f() {
        int i10 = this.f79361d + 1;
        this.f79361d = i10;
        if (i10 == 8) {
            this.f79361d = 0;
            int i11 = this.f79360c;
            this.f79360c = i11 + (c(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public kb2(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    public final boolean a(int i10) {
        int i11 = this.f79360c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f79361d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f79359b) {
                break;
            }
            if (c(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f79359b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean c(int i10) {
        if (2 <= i10 && i10 < this.f79359b) {
            byte[] bArr = this.f79358a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10) {
        int i11 = this.f79360c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f79360c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f79361d;
        this.f79361d = i14;
        if (i14 > 7) {
            this.f79360c = i13 + 1;
            this.f79361d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.f79360c) {
                if (c(i11)) {
                    this.f79360c++;
                    i11 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public final int e() {
        int i10;
        int iD = d();
        if (iD % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((iD + 1) / 2) * i10;
    }

    public final int b(int i10) {
        int i11;
        this.f79361d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f79361d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f79361d = i14;
            byte[] bArr = this.f79358a;
            int i15 = this.f79360c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!c(i15 + 1)) {
                i13 = 1;
            }
            this.f79360c = i15 + i13;
        }
        byte[] bArr2 = this.f79358a;
        int i16 = this.f79360c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f79361d = 0;
            this.f79360c = i16 + (c(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f79358a = bArr;
        this.f79360c = i10;
        this.f79359b = i11;
        this.f79361d = 0;
        a();
    }
}
