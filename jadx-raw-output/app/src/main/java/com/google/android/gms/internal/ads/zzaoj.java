package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaoj implements zzaon {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzagh zzi;
    private zzagh zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzagh zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzagh zzaghVar, long j10, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzaghVar;
        this.zzx = j10;
        this.zzu = i11;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzv = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
    }

    /* JADX WARN: Code duplicated, block: B:105:0x026f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x0277  */
    /* JADX WARN: Code duplicated, block: B:111:0x027b  */
    /* JADX WARN: Code duplicated, block: B:140:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0200  */
    /* JADX WARN: Code duplicated, block: B:73:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0216  */
    /* JADX WARN: Code duplicated, block: B:77:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x021e  */
    /* JADX WARN: Code duplicated, block: B:84:0x022d  */
    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i10;
        int i11;
        int i12;
        char c10;
        boolean z10;
        int i13;
        int iZzj;
        byte[] bArrZzi;
        int iZze;
        int i14;
        byte b10;
        int i15;
        int i16;
        int i17;
        byte b11;
        this.zzi.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int i18 = this.zzk;
            int i19 = 2;
            if (i18 == 0) {
                byte[] bArrZzi2 = zzerVar.zzi();
                int iZzg = zzerVar.zzg();
                int iZze2 = zzerVar.zze();
                while (true) {
                    if (iZzg < iZze2) {
                        int i20 = iZzg + 1;
                        int i21 = bArrZzi2[iZzg] & 255;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i21)) {
                            if (!this.zzo) {
                                int i22 = i20 - 2;
                                zzerVar.zzh(i22 + 1);
                                zzeq zzeqVar = this.zzc;
                                if (zzm(zzerVar, zzeqVar.zza, 1)) {
                                    zzeqVar.zzf(4);
                                    int iZzj2 = zzeqVar.zzj(1);
                                    int i23 = this.zzp;
                                    if (i23 == -1 || iZzj2 == i23) {
                                        if (this.zzq == -1) {
                                            if (zzm(zzerVar, zzeqVar.zza, 4)) {
                                                zzeqVar.zzf(14);
                                                iZzj = zzeqVar.zzj(13);
                                                if (iZzj >= 7) {
                                                    bArrZzi = zzerVar.zzi();
                                                    iZze = zzerVar.zze();
                                                    i14 = i22 + iZzj;
                                                    if (i14 >= iZze) {
                                                        b10 = bArrZzi[i14];
                                                        if (b10 == -1) {
                                                            i17 = i14 + 1;
                                                            if (i17 != iZze) {
                                                                b11 = bArrZzi[i17];
                                                                if (zzl((byte) -1, b11) || ((b11 & 8) >> 3) != iZzj2) {
                                                                }
                                                            }
                                                        } else if (b10 == 73 || ((i15 = i14 + 1) != iZze && (bArrZzi[i15] != 68 || ((i16 = i14 + 2) != iZze && bArrZzi[i16] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (zzm(zzerVar, zzeqVar.zza, 1)) {
                                            zzeqVar.zzf(i19);
                                            if (zzeqVar.zzj(4) == this.zzq) {
                                                zzerVar.zzh(i22 + 2);
                                                if (zzm(zzerVar, zzeqVar.zza, 4)) {
                                                    zzeqVar.zzf(14);
                                                    iZzj = zzeqVar.zzj(13);
                                                    if (iZzj >= 7) {
                                                        bArrZzi = zzerVar.zzi();
                                                        iZze = zzerVar.zze();
                                                        i14 = i22 + iZzj;
                                                        if (i14 >= iZze) {
                                                            b10 = bArrZzi[i14];
                                                            if (b10 == -1) {
                                                                i17 = i14 + 1;
                                                                if (i17 != iZze) {
                                                                    b11 = bArrZzi[i17];
                                                                    if (zzl((byte) -1, b11)) {
                                                                    }
                                                                }
                                                            } else if (b10 == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = this.zzm;
                                i11 = i10 | i21;
                                if (i11 != 329) {
                                    i12 = 2;
                                    c10 = 3;
                                    z10 = false;
                                    i13 = 768;
                                } else if (i11 != 511) {
                                    i12 = 2;
                                    c10 = 3;
                                    z10 = false;
                                    i13 = 512;
                                } else if (i11 != 836) {
                                    i12 = 2;
                                    c10 = 3;
                                    z10 = false;
                                    i13 = 1024;
                                } else if (i11 != 1075) {
                                    this.zzk = 2;
                                    this.zzl = 3;
                                    this.zzu = 0;
                                    this.zzd.zzh(0);
                                    zzerVar.zzh(i20);
                                } else if (i10 != 256) {
                                    this.zzm = 256;
                                    iZzg = i20 - 1;
                                    i19 = 2;
                                } else {
                                    i12 = 2;
                                    c10 = 3;
                                    z10 = false;
                                    iZzg = i20;
                                    i19 = i12;
                                }
                                this.zzm = i13;
                                iZzg = i20;
                                i19 = i12;
                            }
                            this.zzr = (i21 & 8) >> 3;
                            this.zzn = 1 == ((i21 & 1) ^ 1);
                            if (this.zzo) {
                                zzk();
                            } else {
                                this.zzk = 1;
                                this.zzl = 0;
                            }
                            zzerVar.zzh(i20);
                        } else {
                            i10 = this.zzm;
                            i11 = i10 | i21;
                            if (i11 != 329) {
                                i12 = 2;
                                c10 = 3;
                                z10 = false;
                                i13 = 768;
                            } else if (i11 != 511) {
                                i12 = 2;
                                c10 = 3;
                                z10 = false;
                                i13 = 512;
                            } else if (i11 != 836) {
                                i12 = 2;
                                c10 = 3;
                                z10 = false;
                                i13 = 1024;
                            } else if (i11 != 1075) {
                                this.zzk = 2;
                                this.zzl = 3;
                                this.zzu = 0;
                                this.zzd.zzh(0);
                                zzerVar.zzh(i20);
                            } else if (i10 != 256) {
                                this.zzm = 256;
                                iZzg = i20 - 1;
                                i19 = 2;
                            } else {
                                i12 = 2;
                                c10 = 3;
                                z10 = false;
                                iZzg = i20;
                                i19 = i12;
                            }
                            this.zzm = i13;
                            iZzg = i20;
                            i19 = i12;
                        }
                    } else {
                        zzerVar.zzh(iZzg);
                    }
                }
            } else if (i18 != 1) {
                if (i18 == 2) {
                    zzer zzerVar2 = this.zzd;
                    if (zzh(zzerVar, zzerVar2.zzi(), 10)) {
                        this.zzj.zzc(zzerVar2, 10);
                        zzerVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, 10 + zzerVar2.zzG());
                    }
                } else if (i18 != 3) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzerVar, iMin);
                    int i24 = this.zzl + iMin;
                    this.zzl = i24;
                    if (i24 == this.zzu) {
                        zzgrc.zzi(this.zzv != -9223372036854775807L);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i25 = true != this.zzn ? 5 : 7;
                    zzeq zzeqVar2 = this.zzc;
                    if (zzh(zzerVar, zzeqVar2.zza, i25)) {
                        zzeqVar2.zzf(0);
                        if (this.zzs) {
                            zzeqVar2.zzh(10);
                        } else {
                            int iZzj3 = zzeqVar2.zzj(2) + 1;
                            if (iZzj3 != 2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 50);
                                sb2.append("Detected audio object type: ");
                                sb2.append(iZzj3);
                                sb2.append(", but assuming AAC LC.");
                                zzee.zzc("AdtsReader", sb2.toString());
                            }
                            zzeqVar2.zzh(5);
                            int iZzj4 = zzeqVar2.zzj(3);
                            int i26 = this.zzq;
                            byte[] bArr = {(byte) (((i26 >> 1) & 7) | 16), (byte) (((iZzj4 << 3) & 120) | ((i26 << 7) & 128))};
                            zzads zzadsVarZza = zzadt.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzl(this.zzg);
                            zztVar.zzm("audio/mp4a-latm");
                            zztVar.zzj(zzadsVarZza.zzc);
                            zztVar.zzE(zzadsVarZza.zzb);
                            zztVar.zzF(zzadsVarZza.zza);
                            zztVar.zzp(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzvVarZzM = zztVar.zzM();
                            this.zzt = 1024000000 / ((long) zzvVarZzM.zzH);
                            this.zzi.zzz(zzvVarZzM);
                            this.zzs = true;
                        }
                        zzeqVar2.zzh(4);
                        int iZzj5 = zzeqVar2.zzj(13) - 7;
                        if (this.zzn) {
                            iZzj5 -= 2;
                        }
                        zzj(this.zzi, this.zzt, 0, iZzj5);
                    }
                }
            } else if (zzerVar.zzd() != 0) {
                zzeq zzeqVar3 = this.zzc;
                zzeqVar3.zza[0] = zzerVar.zzi()[zzerVar.zzg()];
                zzeqVar3.zzf(2);
                int iZzj6 = zzeqVar3.zzj(4);
                int i27 = this.zzq;
                if (i27 == -1 || iZzj6 == i27) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    public zzaoj(boolean z10, @Nullable String str, int i10, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzerVar.zzd(), i10 - this.zzl);
        zzerVar.zzm(bArr, this.zzl, iMin);
        int i11 = this.zzl + iMin;
        this.zzl = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i10) {
        if (zzerVar.zzd() < i10) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzi = zzaghVarZzu;
        this.zzw = zzaghVarZzu;
        if (this.zzb) {
            zzaqbVar.zza();
            zzagh zzaghVarZzu2 = zzaexVar.zzu(zzaqbVar.zzb(), 5);
            this.zzj = zzaghVarZzu2;
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzg);
            zztVar.zzm("application/id3");
            zzaghVarZzu2.zzz(zztVar.zzM());
            return;
        }
        this.zzj = new zzaer();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }
}
