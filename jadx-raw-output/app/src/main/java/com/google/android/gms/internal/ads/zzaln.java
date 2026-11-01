package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaln {
    private final zzalo zza = new zzalo();
    private final zzer zzb = new zzer(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzalo zzaloVar = this.zza;
            if (i14 >= zzaloVar.zzc) {
                break;
            }
            this.zzd = i13 + 1;
            i11 = zzaloVar.zzf[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final zzalo zzc() {
        return this.zza;
    }

    public final zzer zzd() {
        return this.zzb;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final boolean zzb(zzaev zzaevVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i10 = this.zzc;
            if (i10 < 0) {
                zzalo zzaloVar = this.zza;
                if (!zzaloVar.zzb(zzaevVar, -1L) || !zzaloVar.zzc(zzaevVar, true)) {
                    return false;
                }
                int iZzf = zzaloVar.zzd;
                if ((zzaloVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i10 = this.zzd;
                } else {
                    i10 = 0;
                }
                if (!zzaey.zzd(zzaevVar, iZzf)) {
                    return false;
                }
                this.zzc = i10;
            }
            int iZzf2 = zzf(i10);
            int i11 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzer zzerVar = this.zzb;
                zzerVar.zzc(zzerVar.zze() + iZzf2);
                if (!zzaey.zzc(zzaevVar, zzerVar.zzi(), zzerVar.zze(), iZzf2)) {
                    return false;
                }
                zzerVar.zzf(zzerVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i11 + (-1)] != 255;
            }
            if (i11 == this.zza.zzc) {
                i11 = -1;
            }
            this.zzc = i11;
        }
    }

    public final void zze() {
        zzer zzerVar = this.zzb;
        if (zzerVar.zzi().length == 65025) {
            return;
        }
        zzerVar.zzb(Arrays.copyOf(zzerVar.zzi(), Math.max(65025, zzerVar.zze())), zzerVar.zze());
    }
}
