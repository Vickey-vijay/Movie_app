package o3;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import g5.k0;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f64947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f64948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f64950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f64951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f64954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f64955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0596b f64956j;

    /* JADX INFO: renamed from: o3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CryptoInfo.java */
    @TargetApi(24)
    public static final class C0596b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f64957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f64958b;

        public C0596b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f64957a = cryptoInfo;
            this.f64958b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public final void b(int i10, int i11) {
            this.f64958b.set(i10, i11);
            this.f64957a.setPattern(this.f64958b);
        }
    }

    public MediaCodec.CryptoInfo a() {
        return this.f64955i;
    }

    public void b(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f64952f = i10;
        this.f64950d = iArr;
        this.f64951e = iArr2;
        this.f64948b = bArr;
        this.f64947a = bArr2;
        this.f64949c = i11;
        this.f64953g = i12;
        this.f64954h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f64955i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (k0.f53108a >= 24) {
            this.f64956j.b(i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f64955i = cryptoInfo;
        this.f64956j = k0.f53108a >= 24 ? new C0596b(cryptoInfo) : null;
    }
}
