package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class g01 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f77574f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f77575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f77579e = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f77575a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f77579e;
            int length = bArr2.length;
            int i13 = this.f77577c + i12;
            if (length < i13) {
                this.f77579e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f77579e, this.f77577c, i12);
            this.f77577c += i12;
        }
    }
}
