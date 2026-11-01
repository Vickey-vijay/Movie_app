package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbbd implements Callable {
    private final zzbak zza;
    private final zzawg zzb;

    public zzbbd(zzbak zzbakVar, zzawg zzawgVar) {
        this.zza = zzbakVar;
        this.zzb = zzawgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbak zzbakVar = this.zza;
        if (zzbakVar.zzm() != null) {
            zzbakVar.zzm().get();
        }
        zzaxg zzaxgVarZzl = zzbakVar.zzl();
        if (zzaxgVarZzl == null) {
            return null;
        }
        try {
            zzawg zzawgVar = this.zzb;
            synchronized (zzawgVar) {
                try {
                    zzawgVar.zzaY(zzaxgVarZzl.zzaN(), zzibb.zza());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        } catch (zzicg | NullPointerException unused) {
            return null;
        }
    }
}
