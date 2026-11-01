package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class e01 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f76869e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f76870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f76873d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f76870a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f76873d;
            int length = bArr2.length;
            int i13 = this.f76871b + i12;
            if (length < i13) {
                this.f76873d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f76873d, this.f76871b, i12);
            this.f76871b += i12;
        }
    }
}
