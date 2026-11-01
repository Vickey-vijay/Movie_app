package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbbx {
    private final zzbak zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    private final String zzc(byte[] bArr, String str) throws zzazo, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final /* synthetic */ void zzb() {
        try {
            zzbak zzbakVar = this.zza;
            Class<?> clsLoadClass = zzbakVar.zze().loadClass(zzc(zzbakVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzbakVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzazo | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            this.zzf.countDown();
        }
    }

    public zzbbx(zzbak zzbakVar, String str, String str2, Class... clsArr) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbakVar.zzd().submit(new zzbbw(this));
    }
}
