package g5;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f53125b;

    public n() {
        this(32);
    }

    public n(int i10) {
        this.f53125b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f53124a;
        long[] jArr = this.f53125b;
        if (i10 == jArr.length) {
            this.f53125b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f53125b;
        int i11 = this.f53124a;
        this.f53124a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f53124a) {
            return this.f53125b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f53124a);
    }

    public int c() {
        return this.f53124a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f53125b, this.f53124a);
    }
}
