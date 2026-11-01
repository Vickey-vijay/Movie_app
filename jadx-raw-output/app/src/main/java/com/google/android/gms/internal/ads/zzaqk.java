package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaqk implements zzaeu {
    private zzaex zza;
    private zzagh zzb;
    private zzaqh zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i10 = zzaqj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
        this.zzb = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i10;
        this.zzb.getClass();
        String str = zzfj.zza;
        int i11 = this.zzc;
        int iZzz = 4;
        if (i11 == 0) {
            zzgrc.zzi(zzaevVar.zzn() == 0);
            int i12 = this.zzf;
            if (i12 != -1) {
                zzaevVar.zzf(i12);
                this.zzc = 4;
            } else {
                if (!zzaqn.zza(zzaevVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzE = -1;
        if (i11 == 1) {
            int i13 = zzaqn.zza;
            zzer zzerVar = new zzer(8);
            zzaqm zzaqmVarZza = zzaqm.zza(zzaevVar, zzerVar);
            if (zzaqmVarZza.zza != 1685272116) {
                zzaevVar.zzl();
            } else {
                zzaevVar.zzk(8);
                zzerVar.zzh(0);
                zzaevVar.zzi(zzerVar.zzi(), 0, 8);
                jZzE = zzerVar.zzE();
                zzaevVar.zzf(((int) zzaqmVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i11 == 2) {
            zzaql zzaqlVarZzb = zzaqn.zzb(zzaevVar);
            int i14 = zzaqlVarZzb.zza;
            if (i14 == 17) {
                this.zze = new zzaqg(this.zza, this.zzb, zzaqlVarZzb);
            } else if (i14 == 6) {
                this.zze = new zzaqi(this.zza, this.zzb, zzaqlVarZzb, "audio/g711-alaw", -1);
            } else if (i14 == 7) {
                this.zze = new zzaqi(this.zza, this.zzb, zzaqlVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i15 = zzaqlVarZzb.zze;
                if (i14 == 1) {
                    iZzz = zzfj.zzz(i15, ByteOrder.LITTLE_ENDIAN);
                    i10 = iZzz;
                } else {
                    if (i14 != 3) {
                        if (i14 == 65534) {
                            iZzz = zzfj.zzz(i15, ByteOrder.LITTLE_ENDIAN);
                            i10 = iZzz;
                        }
                    } else if (i15 == 32) {
                        i10 = iZzz;
                    }
                    i10 = 0;
                }
                if (i10 == 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 29);
                    sb2.append("Unsupported WAV format type: ");
                    sb2.append(i14);
                    throw zzat.zzc(sb2.toString());
                }
                this.zze = new zzaqi(this.zza, this.zzb, zzaqlVarZzb, "audio/raw", i10);
            }
            this.zzc = 3;
            return 0;
        }
        if (i11 != 3) {
            zzgrc.zzi(this.zzg != -1);
            long jZzn = this.zzg - zzaevVar.zzn();
            zzaqh zzaqhVar = this.zze;
            zzaqhVar.getClass();
            return zzaqhVar.zzc(zzaevVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzaqn.zzc(zzaevVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j10 = this.zzd;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        long j11 = ((long) this.zzf) + jLongValue;
        this.zzg = j11;
        long jZzo = zzaevVar.zzo();
        if (jZzo != -1 && j11 > jZzo) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 29 + String.valueOf(jZzo).length());
            sb3.append("Data exceeds input length: ");
            sb3.append(j11);
            sb3.append(", ");
            sb3.append(jZzo);
            zzee.zzc("WavExtractor", sb3.toString());
            this.zzg = jZzo;
            j11 = jZzo;
        }
        zzaqh zzaqhVar2 = this.zze;
        zzaqhVar2.getClass();
        zzaqhVar2.zzb(this.zzf, j11);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzc = j10 == 0 ? 0 : 4;
        zzaqh zzaqhVar = this.zze;
        if (zzaqhVar != null) {
            zzaqhVar.zza(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzaqn.zza(zzaevVar);
    }
}
