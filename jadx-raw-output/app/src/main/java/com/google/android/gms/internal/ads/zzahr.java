package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzahr implements zzaeu {
    private zzaex zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzahv zzg;
    private zzaev zzh;
    private zzagd zzi;

    @Nullable
    private zzakw zzj;
    private final zzer zza = new zzer(2);
    private long zzf = -1;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    private final int zzh(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 2, false);
        return zzerVar.zzt();
    }

    private final int zzi(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        zzaevVar.zzi(zzerVar.zzi(), 0, 2);
        return zzerVar.zzt() - 2;
    }

    private final void zzj() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i10;
        String strZzM;
        zzaht zzahtVarZza;
        zzahv zzahvVar;
        long j10;
        int i11 = this.zzc;
        boolean z10 = true;
        boolean z11 = false;
        if (i11 == 0) {
            zzer zzerVar = this.zza;
            zzerVar.zza(2);
            zzaevVar.zzc(zzerVar.zzi(), 0, 2);
            int iZzt = zzerVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzj();
                return 0;
            }
            if ((iZzt >= 65488 && iZzt <= 65497) || iZzt == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i11 == 1) {
            this.zze = zzi(zzaevVar);
            zzaevVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzaevVar != this.zzh) {
                    this.zzh = zzaevVar;
                    this.zzi = new zzagd(zzaevVar, this.zzf);
                }
                zzakw zzakwVar = this.zzj;
                zzakwVar.getClass();
                int iZzd = zzakwVar.zzd(this.zzi, zzafvVar);
                if (iZzd == 1) {
                    zzafvVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzaevVar.zzn();
            long j11 = this.zzf;
            if (jZzn != j11) {
                zzafvVar.zza = j11;
                return 1;
            }
            if (zzaevVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzaevVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzf);
                this.zzi = zzagdVar;
                if (this.zzj.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzj;
                    long j12 = this.zzf;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzakwVar2.zzc(new zzagf(j12, zzaexVar));
                    zzahv zzahvVar2 = this.zzg;
                    zzahvVar2.getClass();
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzagh zzaghVarZzu = zzaexVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/jpeg");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar2));
                    zzaghVarZzu.zzz(zztVar.zzM());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzer zzerVar2 = new zzer(this.zze);
            zzaevVar.zzc(zzerVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzerVar2.zzM((char) 0)) && (strZzM = zzerVar2.zzM((char) 0)) != null) {
                long jZzo = zzaevVar.zzo();
                if (jZzo == -1 || (zzahtVarZza = zzahu.zza(strZzM)) == null) {
                    zzahvVar = null;
                } else {
                    List list = zzahtVarZza.zzb;
                    if (list.size() < 2) {
                        zzahvVar = null;
                    } else {
                        int size = list.size() - 1;
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        while (size >= 0) {
                            zzahs zzahsVar = (zzahs) list.get(size);
                            String str = zzahsVar.zza;
                            boolean z12 = (str.equals("video/mp4") || str.equals("video/quicktime")) ? z10 : z11;
                            if (size == 0) {
                                jZzo -= zzahsVar.zzc;
                                j10 = 0;
                            } else {
                                j10 = jZzo - zzahsVar.zzb;
                            }
                            long j17 = jZzo;
                            jZzo = j10;
                            if (z12 && jZzo != j17) {
                                j16 = j17 - jZzo;
                                j15 = jZzo;
                            }
                            if (size == 0) {
                                j14 = j17;
                            }
                            if (size == 0) {
                                j13 = jZzo;
                            }
                            size--;
                            z10 = true;
                            z11 = false;
                        }
                        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
                            zzahvVar = null;
                        } else {
                            zzahvVar = new zzahv(j13, j14, zzahtVarZza.zza, j15, j16);
                        }
                    }
                }
                this.zzg = zzahvVar;
                if (zzahvVar != null) {
                    this.zzf = zzahvVar.zzd;
                }
            } else {
                i10 = 0;
            }
            this.zzc = i10;
            return i10;
        }
        zzaevVar.zzf(this.zze);
        i10 = 0;
        this.zzc = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakw zzakwVar = this.zzj;
            zzakwVar.getClass();
            zzakwVar.zze(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        int iZzi;
        if (zzh(zzaevVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzaevVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzaevVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzael) zzaevVar).zzj(iZzi, false);
                } else {
                    zzer zzerVar = this.zza;
                    zzerVar.zza(iZzi);
                    ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, iZzi, false);
                    if (Objects.equals(zzerVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && zzahu.zzb(zzerVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
