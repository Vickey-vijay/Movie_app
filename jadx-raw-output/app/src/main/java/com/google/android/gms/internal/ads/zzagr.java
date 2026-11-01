package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzagr implements zzafy {
    public final /* synthetic */ zzagt zza;
    private final long zzb;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzagt zzagtVar = this.zza;
        zzafw zzafwVarZzg = zzagtVar.zzh()[0].zzg(j10);
        for (int i10 = 1; i10 < zzagtVar.zzh().length; i10++) {
            zzafw zzafwVarZzg2 = zzagtVar.zzh()[i10].zzg(j10);
            if (zzafwVarZzg2.zza.zzc < zzafwVarZzg.zza.zzc) {
                zzafwVarZzg = zzafwVarZzg2;
            }
        }
        return zzafwVarZzg;
    }

    public zzagr(zzagt zzagtVar, long j10) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j10;
    }
}
