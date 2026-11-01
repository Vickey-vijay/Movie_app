package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f16425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f16428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16429e;

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f16426b = iArr;
        this.f16427c = iArr2;
        this.f16425a = bArr2;
        int i11 = z.f17873a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f16428d;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i11 >= 24) {
                a.a(this.f16429e);
            }
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i10 = z.f17873a;
        if (i10 >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.f16428d = cryptoInfo;
        this.f16429e = i10 >= 24 ? new a(cryptoInfo) : null;
    }
}
