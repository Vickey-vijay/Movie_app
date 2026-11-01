package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;

    @Nullable
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    static {
        int i10 = zzajn.zza;
    }

    public zzajp() {
        throw null;
    }

    private static boolean zzn(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzk(zzaevVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        zzajr zzajrVar = this.zzq;
        if (zzajrVar instanceof zzajl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    private final int zzi(zzaev zzaevVar) throws IOException {
        int iZza;
        int i10;
        int iZzB;
        zzajt zzajtVarZza;
        zzafn zzafnVar;
        long jZzn;
        long jZzo;
        long jZzb;
        long j10;
        int i11;
        zzajr zzajkVar;
        long j11;
        long j12;
        int i12;
        int i13;
        zzaiq zzaiqVar;
        zzajm zzajmVarZzd;
        zzajr zzajkVar2;
        if (this.zzj == 0) {
            try {
                zzk(zzaevVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzafr zzafrVar = this.zzc;
            zzer zzerVar = new zzer(zzafrVar.zzc);
            zzaevVar.zzi(zzerVar.zzi(), 0, zzafrVar.zzc);
            int i14 = 21;
            if ((zzafrVar.zza & 1) != 0) {
                if (zzafrVar.zze != 1) {
                    i14 = 36;
                }
            } else if (zzafrVar.zze == 1) {
                i14 = 13;
            }
            if (zzerVar.zze() >= i14 + 4) {
                zzerVar.zzh(i14);
                iZzB = zzerVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzerVar.zze() >= 40) {
                        zzerVar.zzh(36);
                        if (zzerVar.zzB() == 1447187017) {
                            iZzB = 1447187017;
                        } else {
                            iZzB = 0;
                        }
                    } else {
                        iZzB = 0;
                    }
                }
            } else if (zzerVar.zze() >= 40) {
                zzerVar.zzh(36);
                if (zzerVar.zzB() == 1447187017) {
                    iZzB = 1447187017;
                } else {
                    iZzB = 0;
                }
            } else {
                iZzB = 0;
            }
            if (iZzB == 1231971951) {
                zzajtVarZza = zzajt.zza(zzafrVar, zzerVar);
                zzafnVar = this.zzd;
                if (!zzafnVar.zzb() && (i12 = zzajtVarZza.zzd) != -1 && (i13 = zzajtVarZza.zze) != -1) {
                    zzafnVar.zza = i12;
                    zzafnVar.zzb = i13;
                }
                jZzn = zzaevVar.zzn();
                if (zzaevVar.zzo() != -1) {
                    j11 = zzajtVarZza.zzc;
                    if (j11 != -1) {
                        j12 = j11 + jZzn;
                        if (zzaevVar.zzo() != j12) {
                            long jZzo2 = zzaevVar.zzo();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jZzo2).length() + 53 + String.valueOf(j12).length() + 20);
                            sb2.append("Data size mismatch between stream (");
                            sb2.append(jZzo2);
                            sb2.append(") and Xing frame (");
                            sb2.append(j12);
                            sb2.append("), using Xing value.");
                            zzee.zzb("Mp3Extractor", sb2.toString());
                        }
                    }
                }
                zzaevVar.zzf(zzafrVar.zzc);
                if (iZzB == 1483304551) {
                    zzajkVar = zzaju.zzd(zzajtVarZza, jZzn);
                } else {
                    jZzo = zzaevVar.zzo();
                    jZzb = zzajtVarZza.zzb();
                    if (jZzb != -9223372036854775807L) {
                        zzajkVar = null;
                    } else {
                        j10 = zzajtVarZza.zzc;
                        if (j10 != -1) {
                            jZzo = jZzn + j10;
                            i11 = zzajtVarZza.zza.zzc;
                        } else if (jZzo != -1) {
                            j10 = jZzo - jZzn;
                            i11 = zzajtVarZza.zza.zzc;
                        } else {
                            zzajkVar = null;
                        }
                        long j13 = j10 - ((long) i11);
                        zzajkVar = new zzajk(jZzo, jZzn + ((long) zzajtVarZza.zza.zzc), zzgxz.zza(zzfj.zzt(j13, 8000000L, jZzb, RoundingMode.HALF_UP)), zzgxz.zza(zzgxu.zza(j13, zzajtVarZza.zzb, RoundingMode.HALF_UP)), false);
                    }
                }
            } else if (iZzB != 1447187017) {
                if (iZzB != 1483304551) {
                    zzaevVar.zzl();
                } else {
                    zzajtVarZza = zzajt.zza(zzafrVar, zzerVar);
                    zzafnVar = this.zzd;
                    if (!zzafnVar.zzb()) {
                        zzafnVar.zza = i12;
                        zzafnVar.zzb = i13;
                    }
                    jZzn = zzaevVar.zzn();
                    if (zzaevVar.zzo() != -1) {
                        j11 = zzajtVarZza.zzc;
                        if (j11 != -1) {
                            j12 = j11 + jZzn;
                            if (zzaevVar.zzo() != j12) {
                                long jZzo3 = zzaevVar.zzo();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(jZzo3).length() + 53 + String.valueOf(j12).length() + 20);
                                sb3.append("Data size mismatch between stream (");
                                sb3.append(jZzo3);
                                sb3.append(") and Xing frame (");
                                sb3.append(j12);
                                sb3.append("), using Xing value.");
                                zzee.zzb("Mp3Extractor", sb3.toString());
                            }
                        }
                    }
                    zzaevVar.zzf(zzafrVar.zzc);
                    if (iZzB == 1483304551) {
                        zzajkVar = zzaju.zzd(zzajtVarZza, jZzn);
                    } else {
                        jZzo = zzaevVar.zzo();
                        jZzb = zzajtVarZza.zzb();
                        if (jZzb != -9223372036854775807L) {
                            j10 = zzajtVarZza.zzc;
                            if (j10 != -1) {
                                jZzo = jZzn + j10;
                                i11 = zzajtVarZza.zza.zzc;
                            } else if (jZzo != -1) {
                                j10 = jZzo - jZzn;
                                i11 = zzajtVarZza.zza.zzc;
                            }
                            long j14 = j10 - ((long) i11);
                            zzajkVar = new zzajk(jZzo, jZzn + ((long) zzajtVarZza.zza.zzc), zzgxz.zza(zzfj.zzt(j14, 8000000L, jZzb, RoundingMode.HALF_UP)), zzgxz.zza(zzgxu.zza(j14, zzajtVarZza.zzb, RoundingMode.HALF_UP)), false);
                        }
                    }
                }
                zzajkVar = null;
            } else {
                zzajkVar = zzajs.zzd(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar, zzerVar);
                zzaevVar.zzf(zzafrVar.zzc);
            }
            zzap zzapVar = this.zzk;
            long jZzn2 = zzaevVar.zzn();
            if (zzapVar == null || (zzaiqVar = (zzaiq) zzapVar.zzc(zzaiq.class, zzgrg.zza())) == null) {
                zzajmVarZzd = null;
            } else {
                zzais zzaisVar = (zzais) zzapVar.zzc(zzais.class, new zzgrd() { // from class: com.google.android.gms.internal.ads.zzajo
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        int i15 = zzajp.zza;
                        return ((zzais) obj).zzf.equals("TLEN");
                    }
                });
                zzajmVarZzd = zzajm.zzd(jZzn2, zzaiqVar, zzaisVar == null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar.zzb.get(0))));
            }
            if (this.zzr) {
                zzajkVar2 = new zzajq();
            } else {
                if (zzajmVarZzd != null) {
                    zzajkVar = zzajmVarZzd;
                } else if (zzajkVar == null) {
                    zzajkVar = null;
                }
                if (zzajkVar == null) {
                    zzer zzerVar2 = this.zzb;
                    zzaevVar.zzi(zzerVar2.zzi(), 0, 4);
                    zzerVar2.zzh(0);
                    zzafrVar.zza(zzerVar2.zzB());
                    zzajkVar2 = new zzajk(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar.zzf, zzafrVar.zzc, false);
                } else {
                    zzajkVar2 = zzajkVar;
                }
                this.zzh.zzN(zzajkVar2.zza());
            }
            this.zzq = zzajkVar2;
            this.zzg.zzw(zzajkVar2);
            zzt zztVar = new zzt();
            zztVar.zzl("audio/mpeg");
            zztVar.zzm(zzafrVar.zzb);
            zztVar.zzn(4096);
            zztVar.zzE(zzafrVar.zze);
            zztVar.zzF(zzafrVar.zzd);
            zzafn zzafnVar2 = this.zzd;
            zztVar.zzH(zzafnVar2.zza);
            zztVar.zzI(zzafnVar2.zzb);
            zztVar.zzk(this.zzk);
            if (this.zzq.zzg() != -2147483647) {
                zztVar.zzh(this.zzq.zzg());
            }
            this.zzi.zzz(zztVar.zzM());
            this.zzn = zzaevVar.zzn();
        } else {
            long j15 = this.zzn;
            if (j15 != 0) {
                long jZzn3 = zzaevVar.zzn();
                if (jZzn3 < j15) {
                    zzaevVar.zzf((int) (j15 - jZzn3));
                }
            }
        }
        int i15 = this.zzp;
        if (i15 == 0) {
            zzaevVar.zzl();
            if (zzl(zzaevVar)) {
                return -1;
            }
            zzer zzerVar3 = this.zzb;
            zzerVar3.zzh(0);
            int iZzB2 = zzerVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzafs.zza(iZzB2) == -1) {
                zzaevVar.zzf(1);
                this.zzj = 0;
            } else {
                zzafr zzafrVar2 = this.zzc;
                zzafrVar2.zza(iZzB2);
                if (this.zzl == -9223372036854775807L) {
                    this.zzl = this.zzq.zze(zzaevVar.zzn());
                }
                i15 = zzafrVar2.zzc;
                this.zzp = i15;
                this.zzo = zzaevVar.zzn() + ((long) i15);
                zzajr zzajrVar = this.zzq;
                if (zzajrVar instanceof zzajl) {
                    zzj(this.zzm + ((long) zzafrVar2.zzg));
                    throw null;
                }
                iZza = this.zzi.zza(zzaevVar, i15, true);
                if (iZza == -1) {
                    return -1;
                }
                i10 = this.zzp - iZza;
                this.zzp = i10;
                if (i10 <= 0) {
                    zzagh zzaghVar = this.zzi;
                    long jZzj = zzj(this.zzm);
                    zzafr zzafrVar3 = this.zzc;
                    zzaghVar.zze(jZzj, 1, zzafrVar3.zzc, 0, null);
                    this.zzm += (long) zzafrVar3.zzg;
                    this.zzp = 0;
                    return 0;
                }
            }
        } else {
            iZza = this.zzi.zza(zzaevVar, i15, true);
            if (iZza == -1) {
                return -1;
            }
            i10 = this.zzp - iZza;
            this.zzp = i10;
            if (i10 <= 0) {
                zzagh zzaghVar2 = this.zzi;
                long jZzj2 = zzj(this.zzm);
                zzafr zzafrVar4 = this.zzc;
                zzaghVar2.zze(jZzj2, 1, zzafrVar4.zzc, 0, null);
                this.zzm += (long) zzafrVar4.zzg;
                this.zzp = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long zzj(long j10) {
        return this.zzl + ((j10 * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzl(zzaev zzaevVar) throws IOException {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long jZzf = zzajrVar.zzf();
            if (jZzf != -1 && zzaevVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j10 = this.zzo;
            if (j10 == -1 || j10 == this.zzq.zzf()) {
                return;
            }
            zzajk zzajkVarZzh = ((zzajk) this.zzq).zzh(this.zzo);
            this.zzq = zzajkVarZzh;
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(zzajkVarZzh);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(0, 1);
        this.zzh = zzaghVarZzu;
        this.zzi = zzaghVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zzh.getClass();
        String str = zzfj.zza;
        int iZzi = zzi(zzaevVar);
        if (iZzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return iZzi;
    }

    public zzajp(int i10) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }

    private final boolean zzk(zzaev zzaevVar, boolean z10) throws IOException {
        int iZzm;
        int i10;
        int iZza;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzaevVar.zzm();
            if (!z10) {
                zzaevVar.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (zzl(zzaevVar)) {
                if (i11 > 0) {
                    break;
                }
                zzm();
                throw new EOFException();
            }
            zzer zzerVar = this.zzb;
            zzerVar.zzh(0);
            int iZzB = zzerVar.zzB();
            if ((i10 != 0 && !zzn(iZzB, i10)) || (iZza = zzafs.zza(iZzB)) == -1) {
                int i13 = i12 + 1;
                if (i12 == 131072) {
                    if (z10) {
                        return false;
                    }
                    zzm();
                    throw new EOFException();
                }
                if (z10) {
                    zzaevVar.zzl();
                    zzaevVar.zzk(iZzm + i13);
                } else {
                    zzaevVar.zzf(1);
                }
                i11 = 0;
                i12 = i13;
                i10 = 0;
            } else {
                i11++;
                if (i11 == 1) {
                    this.zzc.zza(iZzB);
                    i10 = iZzB;
                } else if (i11 == 4) {
                    break;
                }
                zzaevVar.zzk(iZza - 4);
            }
        }
        if (z10) {
            zzaevVar.zzf(iZzm + i12);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i10;
        return true;
    }
}
