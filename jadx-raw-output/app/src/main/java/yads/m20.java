package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes11.dex */
public final class m20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f80033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f80034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f80036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f80037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f80040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f80041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l20 f80042j;

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f80038f = i10;
        this.f80036d = iArr;
        this.f80037e = iArr2;
        this.f80034b = bArr;
        this.f80033a = bArr2;
        this.f80035c = i11;
        this.f80039g = i12;
        this.f80040h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f80041i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (ib3.f78556a >= 24) {
            l20 l20Var = this.f80042j;
            l20Var.getClass();
            l20Var.a(i12, i13);
        }
    }

    public m20() {
        l20 l20Var;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f80041i = cryptoInfo;
        if (ib3.f78556a >= 24) {
            l20Var = new l20(cryptoInfo);
        } else {
            l20Var = null;
        }
        this.f80042j = l20Var;
    }
}
