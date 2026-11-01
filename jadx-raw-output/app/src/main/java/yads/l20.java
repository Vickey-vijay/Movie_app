package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes9.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f79690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f79691b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public final void a(int i10, int i11) {
        this.f79691b.set(i10, i11);
        this.f79690a.setPattern(this.f79691b);
    }

    public l20(MediaCodec.CryptoInfo cryptoInfo) {
        this.f79690a = cryptoInfo;
    }
}
