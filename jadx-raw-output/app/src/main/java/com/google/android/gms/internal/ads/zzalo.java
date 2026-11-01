package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalo {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzer zzg = new zzer(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaev zzaevVar, long j10) throws IOException {
        boolean z10;
        if (zzaevVar.zzn() == zzaevVar.zzm()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        zzer zzerVar = this.zzg;
        zzerVar.zza(4);
        while (true) {
            if ((j10 != -1 && zzaevVar.zzn() + 4 >= j10) || !zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 4, true)) {
                break;
            }
            zzerVar.zzh(0);
            if (zzerVar.zzz() == 1332176723) {
                zzaevVar.zzl();
                return true;
            }
            zzaevVar.zzf(1);
        }
        do {
            if (j10 != -1 && zzaevVar.zzn() >= j10) {
                break;
            }
        } while (zzaevVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzaev zzaevVar, boolean z10) throws IOException {
        zza();
        zzer zzerVar = this.zzg;
        zzerVar.zza(27);
        if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 27, z10) && zzerVar.zzz() == 1332176723) {
            if (zzerVar.zzs() != 0) {
                if (z10) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzerVar.zzs();
            this.zzb = zzerVar.zzE();
            zzerVar.zzA();
            zzerVar.zzA();
            zzerVar.zzA();
            int iZzs = zzerVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzerVar.zza(iZzs);
            if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzerVar.zzs();
                    iArr[i10] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}
