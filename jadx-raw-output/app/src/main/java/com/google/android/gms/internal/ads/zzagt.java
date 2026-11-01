package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagt implements zzaeu {
    private final zzer zza;
    private final zzags zzb;
    private final boolean zzc;
    private final zzamd zzd;
    private int zze;
    private zzaex zzf;
    private zzagu zzg;
    private long zzh;
    private zzagw[] zzi;
    private long zzj;

    @Nullable
    private zzagw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzagt() {
        this(1, zzamd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = 0;
        if (this.zzc) {
            zzaexVar = new zzamg(zzaexVar, this.zzd);
        }
        this.zzf = zzaexVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final /* synthetic */ zzagw[] zzh() {
        return this.zzi;
    }

    public zzagt(int i10, zzamd zzamdVar) {
        this.zzd = zzamdVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzer(12);
        this.zzb = new zzags(null);
        this.zzf = new zzaft();
        this.zzi = new zzagw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    @Nullable
    private final zzagw zzi(int i10) {
        for (zzagw zzagwVar : this.zzi) {
            if (zzagwVar.zzc(i10)) {
                return zzagwVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzaevVar.zzi(zzerVar.zzi(), 0, 12);
        zzerVar.zzh(0);
        if (zzerVar.zzC() != 1179011410) {
            return false;
        }
        zzerVar.zzk(4);
        return zzerVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean z10;
        long j10;
        long j11 = this.zzj;
        if (j11 != -1) {
            long jZzn = zzaevVar.zzn();
            if (j11 < jZzn || j11 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzn) {
                zzafvVar.zza = j11;
                z10 = true;
            } else {
                zzaevVar.zzf((int) (j11 - jZzn));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzj = -1L;
        if (z10) {
            return 1;
        }
        int i10 = this.zze;
        zzagw zzagwVar = null;
        if (i10 == 0) {
            if (!zza(zzaevVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzaevVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i10 == 1) {
            zzer zzerVar = this.zza;
            zzaevVar.zzc(zzerVar.zzi(), 0, 12);
            zzerVar.zzh(0);
            zzags zzagsVar = this.zzb;
            zzagsVar.zza(zzerVar);
            int i11 = zzagsVar.zza;
            if (i11 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
                sb2.append("LIST expected, found: ");
                sb2.append(i11);
                throw zzat.zzb(sb2.toString(), null);
            }
            int iZzC = zzerVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzagsVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzC).length() + 22);
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i10 == 2) {
            int i12 = this.zzl - 4;
            zzer zzerVar2 = new zzer(i12);
            zzaevVar.zzc(zzerVar2.zzi(), 0, i12);
            zzagx zzagxVarZzb = zzagx.zzb(1819436136, zzerVar2);
            if (zzagxVarZzb.zza() != 1819436136) {
                int iZza = zzagxVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzat.zzb(sb4.toString(), null);
            }
            zzagu zzaguVar = (zzagu) zzagxVarZzb.zzc(zzagu.class);
            if (zzaguVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzaguVar;
            this.zzh = ((long) zzaguVar.zzc) * ((long) zzaguVar.zza);
            ArrayList arrayList = new ArrayList();
            zzguf zzgufVar = zzagxVarZzb.zza;
            int size = zzgufVar.size();
            int i13 = 0;
            int i14 = 0;
            while (i13 < size) {
                zzagq zzagqVar = (zzagq) zzgufVar.get(i13);
                if (zzagqVar.zza() == 1819440243) {
                    zzagx zzagxVar = (zzagx) zzagqVar;
                    int i15 = i14 + 1;
                    zzagv zzagvVar = (zzagv) zzagxVar.zzc(zzagv.class);
                    zzagy zzagyVar = (zzagy) zzagxVar.zzc(zzagy.class);
                    if (zzagvVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzagyVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzagvVar.zzd();
                        zzv zzvVar = zzagyVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i14);
                        int i16 = zzagvVar.zze;
                        if (i16 != 0) {
                            zztVarZza.zzn(i16);
                        }
                        zzagz zzagzVar = (zzagz) zzagxVar.zzc(zzagz.class);
                        if (zzagzVar != null) {
                            zztVarZza.zzc(zzagzVar.zza);
                        }
                        int iZzf = zzas.zzf(zzvVar.zzo);
                        if (iZzf == 1) {
                            zzagh zzaghVarZzu = this.zzf.zzu(i14, iZzf);
                            zzaghVarZzu.zzz(zztVarZza.zzM());
                            zzaghVarZzu.zzN(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzagwVar = new zzagw(i14, zzagvVar, zzaghVarZzu);
                        } else if (iZzf == 2) {
                            iZzf = 2;
                            zzagh zzaghVarZzu2 = this.zzf.zzu(i14, iZzf);
                            zzaghVarZzu2.zzz(zztVarZza.zzM());
                            zzaghVarZzu2.zzN(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzagwVar = new zzagw(i14, zzagvVar, zzaghVarZzu2);
                        } else {
                            zzagwVar = null;
                        }
                    }
                    if (zzagwVar != null) {
                        arrayList.add(zzagwVar);
                    }
                    i14 = i15;
                }
                i13++;
                zzagwVar = null;
            }
            this.zzi = (zzagw[]) arrayList.toArray(new zzagw[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i10 == 3) {
            long j12 = this.zzm;
            if (j12 != -1 && zzaevVar.zzn() != j12) {
                this.zzj = j12;
                return 0;
            }
            zzer zzerVar3 = this.zza;
            zzaevVar.zzi(zzerVar3.zzi(), 0, 12);
            zzaevVar.zzl();
            zzerVar3.zzh(0);
            zzags zzagsVar2 = this.zzb;
            zzagsVar2.zza(zzerVar3);
            int iZzC2 = zzerVar3.zzC();
            int i17 = zzagsVar2.zza;
            if (i17 == 1179011410) {
                zzaevVar.zzf(12);
                return 0;
            }
            if (i17 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzaevVar.zzn() + ((long) zzagsVar2.zzb) + 8;
                return 0;
            }
            long jZzn2 = zzaevVar.zzn();
            this.zzm = jZzn2;
            long j13 = jZzn2 + ((long) zzagsVar2.zzb) + 8;
            this.zzn = j13;
            if (!this.zzp) {
                zzagu zzaguVar2 = this.zzg;
                zzaguVar2.getClass();
                if ((zzaguVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j13;
                    return 0;
                }
                this.zzf.zzw(new zzafx(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzaevVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i10 == 4) {
            zzer zzerVar4 = this.zza;
            zzaevVar.zzc(zzerVar4.zzi(), 0, 8);
            zzerVar4.zzh(0);
            int iZzC3 = zzerVar4.zzC();
            int iZzC4 = zzerVar4.zzC();
            if (iZzC3 == 829973609) {
                this.zze = 5;
                this.zzo = iZzC4;
            } else {
                this.zzj = zzaevVar.zzn() + ((long) iZzC4);
            }
            return 0;
        }
        if (i10 == 5) {
            zzer zzerVar5 = new zzer(this.zzo);
            zzaevVar.zzc(zzerVar5.zzi(), 0, this.zzo);
            if (zzerVar5.zzd() < 16) {
                j10 = 0;
            } else {
                int iZzg = zzerVar5.zzg();
                zzerVar5.zzk(8);
                long jZzC = zzerVar5.zzC();
                long j14 = this.zzm;
                j10 = jZzC > j14 ? 0L : j14 + 8;
                zzerVar5.zzh(iZzg);
            }
            while (zzerVar5.zzd() >= 16) {
                int iZzC5 = zzerVar5.zzC();
                int iZzC6 = zzerVar5.zzC();
                long jZzC2 = ((long) zzerVar5.zzC()) + j10;
                zzerVar5.zzk(4);
                zzagw zzagwVarZzi = zzi(iZzC5);
                if (zzagwVarZzi != null) {
                    zzagwVarZzi.zza(jZzC2, (iZzC6 & 16) == 16);
                }
            }
            for (zzagw zzagwVar2 : this.zzi) {
                zzagwVar2.zzb();
            }
            this.zzp = true;
            if (this.zzi.length == 0) {
                this.zzf.zzw(new zzafx(this.zzh, 0L));
            } else {
                this.zzf.zzw(new zzagr(this, this.zzh));
            }
            this.zze = 6;
            this.zzj = this.zzm;
            return 0;
        }
        if (zzaevVar.zzn() >= this.zzn) {
            return -1;
        }
        zzagw zzagwVar3 = this.zzk;
        if (zzagwVar3 != null) {
            if (!zzagwVar3.zze(zzaevVar)) {
                return 0;
            }
            this.zzk = null;
            return 0;
        }
        if ((zzaevVar.zzn() & 1) == 1) {
            zzaevVar.zzf(1);
        }
        zzer zzerVar6 = this.zza;
        zzaevVar.zzi(zzerVar6.zzi(), 0, 12);
        zzerVar6.zzh(0);
        int iZzC7 = zzerVar6.zzC();
        if (iZzC7 == 1414744396) {
            zzerVar6.zzh(8);
            zzaevVar.zzf(zzerVar6.zzC() != 1769369453 ? 8 : 12);
            zzaevVar.zzl();
            return 0;
        }
        int iZzC8 = zzerVar6.zzC();
        if (iZzC7 == 1263424842) {
            this.zzj = zzaevVar.zzn() + ((long) iZzC8) + 8;
            return 0;
        }
        zzaevVar.zzf(8);
        zzaevVar.zzl();
        zzagw zzagwVarZzi2 = zzi(iZzC7);
        if (zzagwVarZzi2 == null) {
            this.zzj = zzaevVar.zzn() + ((long) iZzC8);
            return 0;
        }
        zzagwVarZzi2.zzd(iZzC8);
        this.zzk = zzagwVarZzi2;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzagw zzagwVar : this.zzi) {
            zzagwVar.zzf(j10);
        }
        if (j10 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }
}
