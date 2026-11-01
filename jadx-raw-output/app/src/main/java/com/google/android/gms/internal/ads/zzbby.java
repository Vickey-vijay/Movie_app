package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzbby implements Callable {
    public final zzbak zza;
    public final String zzb;
    public final String zzc;
    public final zzawg zzd;
    public Method zze;
    public final int zzf;
    public final int zzg;

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public zzbby(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawgVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            zzbak zzbakVar = this.zza;
            Method methodZzo = zzbakVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo != null) {
                zza();
                zzazb zzazbVarZzh = zzbakVar.zzh();
                if (zzazbVarZzh != null && (i10 = this.zzf) != Integer.MIN_VALUE) {
                    zzazbVarZzh.zza(this.zzg, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
