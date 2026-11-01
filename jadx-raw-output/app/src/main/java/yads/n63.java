package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class n63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f80575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f80576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80578d;

    public n63() {
        this(0);
    }

    public static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j10) {
        int i10 = this.f80578d;
        if (i10 > 0) {
            if (j10 <= this.f80575a[((this.f80577c + i10) - 1) % this.f80576b.length]) {
                a();
            }
        }
        int length = this.f80576b.length;
        if (this.f80578d >= length) {
            int i11 = length * 2;
            long[] jArr = new long[i11];
            Object[] objArr = new Object[i11];
            int i12 = this.f80577c;
            int i13 = length - i12;
            System.arraycopy(this.f80575a, i12, jArr, 0, i13);
            System.arraycopy(this.f80576b, this.f80577c, objArr, 0, i13);
            int i14 = this.f80577c;
            if (i14 > 0) {
                System.arraycopy(this.f80575a, 0, jArr, i13, i14);
                System.arraycopy(this.f80576b, 0, objArr, i13, this.f80577c);
            }
            this.f80575a = jArr;
            this.f80576b = objArr;
            this.f80577c = 0;
        }
        int i15 = this.f80577c;
        int i16 = this.f80578d;
        Object[] objArr2 = this.f80576b;
        int length2 = (i15 + i16) % objArr2.length;
        this.f80575a[length2] = j10;
        objArr2[length2] = obj;
        this.f80578d = i16 + 1;
    }

    public final synchronized Object c() {
        Object obj;
        int i10 = this.f80578d;
        obj = null;
        if (i10 != 0) {
            if (i10 <= 0) {
                throw new IllegalStateException();
            }
            Object[] objArr = this.f80576b;
            int i11 = this.f80577c;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            this.f80577c = (i11 + 1) % objArr.length;
            this.f80578d = i10 - 1;
            obj = obj2;
        }
        return obj;
    }

    public n63(int i10) {
        this.f80575a = new long[10];
        this.f80576b = b();
    }

    public final synchronized void a() {
        this.f80577c = 0;
        this.f80578d = 0;
        Arrays.fill(this.f80576b, (Object) null);
    }

    public final Object a(long j10, boolean z10) {
        long j11 = Long.MAX_VALUE;
        Object obj = null;
        while (true) {
            int i10 = this.f80578d;
            if (i10 <= 0) {
                break;
            }
            long[] jArr = this.f80575a;
            int i11 = this.f80577c;
            long j12 = j10 - jArr[i11];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            if (i10 > 0) {
                Object[] objArr = this.f80576b;
                obj = objArr[i11];
                objArr[i11] = null;
                this.f80577c = (i11 + 1) % objArr.length;
                this.f80578d = i10 - 1;
                j11 = j12;
            } else {
                throw new IllegalStateException();
            }
        }
        return obj;
    }

    public final synchronized Object a(long j10) {
        return a(j10, true);
    }
}
