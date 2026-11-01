package yads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f85644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85645e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f85642b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f85644d;
            int length = bArr2.length;
            int i13 = this.f85645e + i12;
            if (length < i13) {
                this.f85644d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f85644d, this.f85645e, i12);
            this.f85645e += i12;
        }
    }

    public final void b(int i10) {
        if (!(!this.f85642b)) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f85641a;
        this.f85642b = z10;
        if (z10) {
            this.f85645e = 3;
            this.f85643c = false;
        }
    }

    public zx1(int i10) {
        this.f85641a = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f85644d = bArr;
        bArr[2] = 1;
    }

    public final boolean a(int i10) {
        if (!this.f85642b) {
            return false;
        }
        this.f85645e -= i10;
        this.f85642b = false;
        this.f85643c = true;
        return true;
    }
}
