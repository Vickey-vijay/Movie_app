package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzayf implements Runnable {
    private zzayf() {
        throw null;
    }

    public /* synthetic */ zzayf(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzayg.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzayg.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzayg.zzb;
        } catch (Throwable th2) {
            zzayg.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
