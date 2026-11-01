package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class kh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f79413b;

    public kh1() {
        this(0);
    }

    public final void a(long j10) {
        int i10 = this.f79412a;
        long[] jArr = this.f79413b;
        if (i10 == jArr.length) {
            this.f79413b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f79413b;
        int i11 = this.f79412a;
        this.f79412a = i11 + 1;
        jArr2[i11] = j10;
    }

    public kh1(int i10) {
        this.f79413b = new long[32];
    }

    public final long a(int i10) {
        if (i10 >= 0 && i10 < this.f79412a) {
            return this.f79413b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f79412a);
    }

    public final long[] a() {
        return Arrays.copyOf(this.f79413b, this.f79412a);
    }
}
