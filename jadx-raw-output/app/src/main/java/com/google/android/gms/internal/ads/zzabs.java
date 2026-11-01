package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzabs {
    public final /* synthetic */ zzabt zza;
    private zzv zzb;

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzt(zzbvVar.zzb);
        zztVar.zzu(zzbvVar.zzc);
        zztVar.zzm("video/raw");
        this.zzb = zztVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzabt zzabtVar = this.zza;
            if (zzabtVar.zzA() != null) {
                zzabtVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzM = this.zzb;
        if (zzvVarZzM == null) {
            zzvVarZzM = new zzt().zzM();
        }
        zzv zzvVar = zzvVarZzM;
        zzabt zzabtVar2 = this.zza;
        zzabtVar2.zzD().zzcS(j11, j10, zzvVar, null);
        ((zzadp) zzabtVar2.zzz().remove()).zza(j10);
    }

    public /* synthetic */ zzabs(zzabt zzabtVar, byte[] bArr) {
        Objects.requireNonNull(zzabtVar);
        this.zza = zzabtVar;
    }
}
