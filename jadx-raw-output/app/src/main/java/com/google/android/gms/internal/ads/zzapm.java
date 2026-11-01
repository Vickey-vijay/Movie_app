package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapm implements zzaeu {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;

    @Nullable
    private zzapi zzi;
    private zzaex zzj;
    private boolean zzk;
    private final zzfg zza = new zzfg(0);
    private final zzer zzc = new zzer(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzapj zzd = new zzapj();

    static {
        int i10 = zzapl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzj = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        byte[] bArr = new byte[14];
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaelVar.zzj(bArr[13] & 7, false);
        zzaelVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzaon zzaopVar;
        zzaex zzaexVar = this.zzj;
        zzaexVar.getClass();
        long jZzo = zzaevVar.zzo();
        if (jZzo != -1) {
            zzapj zzapjVar = this.zzd;
            if (!zzapjVar.zza()) {
                return zzapjVar.zzc(zzaevVar, zzafvVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzapj zzapjVar2 = this.zzd;
            if (zzapjVar2.zzd() != -9223372036854775807L) {
                zzapi zzapiVar = new zzapi(zzapjVar2.zzb(), zzapjVar2.zzd(), jZzo);
                this.zzi = zzapiVar;
                this.zzj.zzw(zzapiVar.zza());
            } else {
                zzaexVar.zzw(new zzafx(zzapjVar2.zzd(), 0L));
            }
        }
        zzapi zzapiVar2 = this.zzi;
        if (zzapiVar2 != null && zzapiVar2.zzc()) {
            return zzapiVar2.zzd(zzaevVar, zzafvVar);
        }
        zzaevVar.zzl();
        long jZzm = jZzo != -1 ? jZzo - zzaevVar.zzm() : -1L;
        if (jZzm != -1 && jZzm < 4) {
            return -1;
        }
        zzer zzerVar = this.zzc;
        if (!zzaevVar.zzh(zzerVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        if (iZzB == 441) {
            return -1;
        }
        if (iZzB == 442) {
            zzaevVar.zzi(zzerVar.zzi(), 0, 10);
            zzerVar.zzh(9);
            zzaevVar.zzf((zzerVar.zzs() & 7) + 14);
            return 0;
        }
        if (iZzB == 443) {
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            zzerVar.zzh(0);
            zzaevVar.zzf(zzerVar.zzt() + 6);
            return 0;
        }
        if ((iZzB >> 8) != 1) {
            zzaevVar.zzf(1);
            return 0;
        }
        int i10 = iZzB & 255;
        SparseArray sparseArray = this.zzb;
        zzapk zzapkVar = (zzapk) sparseArray.get(i10);
        if (!this.zze) {
            if (zzapkVar == null) {
                zzaon zzaonVar = null;
                if (i10 == 189) {
                    zzaopVar = new zzaod(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzaevVar.zzn();
                } else if ((i10 & 224) == 192) {
                    zzaopVar = new zzaoz(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzaevVar.zzn();
                } else if ((i10 & 240) == 224) {
                    zzaopVar = new zzaop(null, "video/mp2p");
                    this.zzg = true;
                    this.zzh = zzaevVar.zzn();
                } else if (zzaonVar != null) {
                    zzaonVar.zzb(this.zzj, new zzaqb(Integer.MIN_VALUE, i10, 256));
                    zzapk zzapkVar2 = new zzapk(zzaonVar, this.zza);
                    sparseArray.put(i10, zzapkVar2);
                    zzapkVar = zzapkVar2;
                }
                zzaonVar = zzaopVar;
                if (zzaonVar != null) {
                    zzaonVar.zzb(this.zzj, new zzaqb(Integer.MIN_VALUE, i10, 256));
                    zzapk zzapkVar3 = new zzapk(zzaonVar, this.zza);
                    sparseArray.put(i10, zzapkVar3);
                    zzapkVar = zzapkVar3;
                }
            }
            boolean z10 = this.zzf;
            long j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z10 && this.zzg) {
                j10 = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzh;
            }
            if (zzaevVar.zzn() > j10) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzaevVar.zzi(zzerVar.zzi(), 0, 2);
        zzerVar.zzh(0);
        int iZzt = zzerVar.zzt() + 6;
        if (zzapkVar == null) {
            zzaevVar.zzf(iZzt);
        } else {
            zzerVar.zza(iZzt);
            zzaevVar.zzc(zzerVar.zzi(), 0, iZzt);
            zzerVar.zzh(6);
            zzapkVar.zzb(zzerVar);
            zzerVar.zzf(zzerVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        zzfg zzfgVar = this.zza;
        if (zzfgVar.zzc() != -9223372036854775807L) {
            long jZza = zzfgVar.zza();
            if (jZza != -9223372036854775807L && jZza != 0 && jZza != j11) {
                zzfgVar.zzd(j11);
            }
        } else {
            zzfgVar.zzd(j11);
        }
        zzapi zzapiVar = this.zzi;
        int i10 = 0;
        if (zzapiVar != null) {
            zzapiVar.zzb(j11);
        }
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((zzapk) sparseArray.valueAt(i10)).zza();
            i10++;
        }
    }
}
