package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f16423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f16424b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static void a(a aVar) {
        aVar.f16424b.set(0, 0);
        aVar.f16423a.setPattern(aVar.f16424b);
    }

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f16423a = cryptoInfo;
    }
}
