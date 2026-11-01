package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaou implements zzaon {
    private final zzapq zza;
    private long zzf;
    private String zzh;
    private zzagh zzi;
    private zzaot zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzape zzc = new zzape(7, 128);
    private final zzape zzd = new zzape(8, 128);
    private final zzape zze = new zzape(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    private final void zzh(long j10, int i10, int i11, long j11) {
        if (!this.zzk) {
            zzape zzapeVar = this.zzc;
            zzapeVar.zze(i11);
            zzape zzapeVar2 = this.zzd;
            zzapeVar2.zze(i11);
            if (this.zzk) {
                if (zzapeVar.zzb()) {
                    zzgl zzglVarZze = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                    this.zza.zzb(zzglVarZze.zzm);
                    this.zzj.zza(zzglVarZze);
                    zzapeVar.zza();
                } else if (zzapeVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb));
                    zzapeVar2.zza();
                }
            } else if (zzapeVar.zzb() && zzapeVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzapeVar.zza, zzapeVar.zzb));
                arrayList.add(Arrays.copyOf(zzapeVar2.zza, zzapeVar2.zzb));
                zzgl zzglVarZze2 = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                zzgk zzgkVarZzh = zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb);
                String strZza = zzdo.zza(zzglVarZze2.zza, zzglVarZze2.zzb, zzglVarZze2.zzc);
                zzagh zzaghVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(strZza);
                zztVar.zzt(zzglVarZze2.zze);
                zztVar.zzu(zzglVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzglVarZze2.zzj);
                zzhVar.zzb(zzglVarZze2.zzk);
                zzhVar.zzc(zzglVarZze2.zzl);
                zzhVar.zze(zzglVarZze2.zzh + 8);
                zzhVar.zzf(zzglVarZze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzglVarZze2.zzg);
                zztVar.zzp(arrayList);
                int i12 = zzglVarZze2.zzm;
                zztVar.zzo(i12);
                zzaghVar.zzz(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i12);
                this.zzj.zza(zzglVarZze2);
                this.zzj.zzb(zzgkVarZzh);
                zzapeVar.zza();
                zzapeVar2.zza();
            }
        }
        zzape zzapeVar3 = this.zze;
        if (zzapeVar3.zze(i11)) {
            int iZza = zzgm.zza(zzapeVar3.zza, zzapeVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar3.zza, iZza);
            zzerVar.zzh(4);
            this.zza.zzc(j11, zzerVar);
        }
        if (this.zzj.zze(j10, i10, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
        int i11 = i10 & 2;
        this.zzm = (i11 != 0) | this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        int i10;
        int i11;
        this.zzi.getClass();
        String str = zzfj.zza;
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzf += (long) zzerVar.zzd();
        this.zzi.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzi == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i12 = bArrZzi[iZzi + 3] & 31;
            if (iZzi > 0) {
                int i13 = iZzi - 1;
                if (bArrZzi[i13] == 0) {
                    i11 = 4;
                    i10 = i13;
                } else {
                    i10 = iZzi;
                    i11 = 3;
                }
            } else {
                i10 = iZzi;
                i11 = 3;
            }
            int i14 = i10 - iZzg;
            if (i14 > 0) {
                zzg(bArrZzi, iZzg, i10);
            }
            int i15 = iZze - i10;
            long j10 = this.zzf - ((long) i15);
            zzh(j10, i15, i14 < 0 ? -i14 : 0, this.zzl);
            zzf(j10, i12, this.zzl);
            iZzg = i10 + i11;
        }
    }

    private final void zzf(long j10, int i10, long j11) {
        if (!this.zzk) {
            this.zzc.zzc(i10);
            this.zzd.zzc(i10);
        }
        this.zze.zzc(i10);
        this.zzj.zzd(j10, i10, j11, this.zzm);
    }

    private final void zzg(byte[] bArr, int i10, int i11) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i10, i11);
            this.zzd.zzd(bArr, i10, i11);
        }
        this.zze.zzd(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaot zzaotVar = this.zzj;
        if (zzaotVar != null) {
            zzaotVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z10) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    public zzaou(zzapq zzapqVar, boolean z10, boolean z11, String str) {
        this.zza = zzapqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzi = zzaghVarZzu;
        this.zzj = new zzaot(zzaghVarZzu, false, false);
        this.zza.zza(zzaexVar, zzaqbVar);
    }
}
