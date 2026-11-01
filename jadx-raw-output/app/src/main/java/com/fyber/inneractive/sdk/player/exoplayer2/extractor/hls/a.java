package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f16518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f16521d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f16519b, "AES"), new IvParameterSpec(this.f16520c));
                this.f16521d = new CipherInputStream(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(this.f16518a, kVar), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f16521d = null;
        this.f16518a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        CipherInputStream cipherInputStream = this.f16521d;
        if (cipherInputStream == null) {
            throw new IllegalStateException();
        }
        int i12 = cipherInputStream.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, byte[] bArr, byte[] bArr2) {
        this.f16518a = hVar;
        this.f16519b = bArr;
        this.f16520c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f16518a.a();
    }
}
