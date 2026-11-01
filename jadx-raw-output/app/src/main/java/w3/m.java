package w3;

import androidx.annotation.Nullable;
import q3.u;

/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f73464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.a f73465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f73467e;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                g5.m.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }

    public m(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        boolean z11;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        g5.a.a((bArr2 == null) ^ z11);
        this.f73463a = z10;
        this.f73464b = str;
        this.f73466d = i10;
        this.f73467e = bArr2;
        this.f73465c = new u.a(a(str), bArr, i11, i12);
    }
}
