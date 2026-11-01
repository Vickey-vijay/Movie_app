package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzahj implements zzaeu {
    private zzaex zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzahh zzo;
    private zzahn zzp;
    private final zzer zza = new zzer(4);
    private final zzer zzb = new zzer(9);
    private final zzer zzc = new zzer(11);
    private final zzer zzd = new zzer();
    private final zzahk zze = new zzahk();
    private int zzg = 1;

    static {
        int i10 = zzahi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    private final zzer zzh(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zzd;
        if (this.zzl > zzerVar.zzj()) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzerVar.zzh(0);
        }
        zzerVar.zzf(this.zzl);
        zzaevVar.zzc(zzerVar.zzi(), 0, this.zzl);
        return zzerVar;
    }

    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 3, false);
        zzerVar.zzh(0);
        if (zzerVar.zzx() != 4607062) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 2, false);
        zzerVar.zzh(0);
        if ((zzerVar.zzt() & 250) != 0) {
            return false;
        }
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(iZzB, false);
        zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
        zzerVar.zzh(0);
        return zzerVar.zzB() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        long j10;
        boolean zZzf;
        boolean z10;
        long j11;
        this.zzf.getClass();
        while (true) {
            int i10 = this.zzg;
            int i11 = 8;
            if (i10 == 1) {
                zzer zzerVar = this.zzb;
                if (!zzaevVar.zzb(zzerVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzerVar.zzh(0);
                zzerVar.zzk(4);
                int iZzs = zzerVar.zzs();
                int i12 = iZzs & 4;
                int i13 = iZzs & 1;
                if (i12 != 0 && this.zzo == null) {
                    this.zzo = new zzahh(this.zzf.zzu(8, 1));
                }
                if (i13 != 0 && this.zzp == null) {
                    this.zzp = new zzahn(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzerVar.zzB() - 5;
                this.zzg = 2;
            } else if (i10 == 2) {
                zzaevVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i10 == 3) {
                zzer zzerVar2 = this.zzc;
                if (!zzaevVar.zzb(zzerVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzerVar2.zzh(0);
                this.zzk = zzerVar2.zzs();
                this.zzl = zzerVar2.zzx();
                this.zzm = zzerVar2.zzx();
                this.zzm = (((long) (zzerVar2.zzs() << 24)) | this.zzm) * 1000;
                zzerVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                if (this.zzh) {
                    j10 = this.zzi + this.zzm;
                } else {
                    j10 = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                }
                int i14 = this.zzk;
                if (i14 == 8) {
                    if (this.zzo != null) {
                        zzi();
                        zZzf = this.zzo.zzf(zzh(zzaevVar), j10);
                    }
                    z10 = true;
                    if (!this.zzh && zZzf) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j11 = -this.zzm;
                        } else {
                            j11 = 0;
                        }
                        this.zzi = j11;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z10) {
                        return 0;
                    }
                } else {
                    i11 = i14;
                }
                if (i11 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zZzf = this.zzp.zzf(zzh(zzaevVar), j10);
                        z10 = true;
                    } else {
                        zzaevVar.zzf(this.zzl);
                        zZzf = false;
                        z10 = false;
                    }
                } else if (i11 != 18 || this.zzn) {
                    zzaevVar.zzf(this.zzl);
                    zZzf = false;
                    z10 = false;
                } else {
                    zzahk zzahkVar = this.zze;
                    zZzf = zzahkVar.zzf(zzh(zzaevVar), j10);
                    long jZzc = zzahkVar.zzc();
                    if (jZzc != -9223372036854775807L) {
                        this.zzf.zzw(new zzafq(zzahkVar.zze(), zzahkVar.zzd(), jZzc));
                        this.zzn = true;
                    }
                    z10 = true;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    if (this.zze.zzc() == -9223372036854775807L) {
                        j11 = -this.zzm;
                    } else {
                        j11 = 0;
                    }
                    this.zzi = j11;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (z10) {
                    return 0;
                }
            }
        }
    }
}
