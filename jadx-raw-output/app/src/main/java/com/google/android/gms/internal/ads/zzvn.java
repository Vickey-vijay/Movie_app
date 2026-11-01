package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzvn implements zzyc {
    public final zzyc zza;
    public final /* synthetic */ zzvo zzb;
    private boolean zzc;

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i10) {
        zzvo zzvoVar = this.zzb;
        if (zzvoVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzihVar.zzg(4);
            return -4;
        }
        long jZzi = zzvoVar.zzi();
        int iZzd = this.zza.zzd(zzlhVar, zzihVar, i10);
        if (iZzd != -5) {
            long j10 = zzvoVar.zzb;
            if (j10 == Long.MIN_VALUE || ((iZzd != -4 || zzihVar.zze < j10) && !(iZzd == -3 && jZzi == Long.MIN_VALUE && !zzihVar.zzd))) {
                return iZzd;
            }
            zzihVar.zza();
            zzihVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        int i11 = zzvVar.zzJ;
        if (i11 != 0) {
            int i12 = zzvoVar.zzb == Long.MIN_VALUE ? zzvVar.zzK : 0;
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzH(i11);
            zztVarZza.zzI(i12);
            zzlhVar.zzb = zztVarZza.zzM();
        } else if (zzvVar.zzK != 0) {
            i11 = 0;
            if (zzvoVar.zzb == Long.MIN_VALUE) {
            }
            zzt zztVarZza2 = zzvVar.zza();
            zztVarZza2.zzH(i11);
            zztVarZza2.zzI(i12);
            zzlhVar.zzb = zztVarZza2.zzM();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j10) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j10);
    }

    public zzvn(zzvo zzvoVar, zzyc zzycVar) {
        Objects.requireNonNull(zzvoVar);
        this.zzb = zzvoVar;
        this.zza = zzycVar;
    }
}
