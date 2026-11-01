package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzlq {
    private final zzmx zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjg zzh;

    @Nullable
    private zzln zzi;

    @Nullable
    private zzln zzj;

    @Nullable
    private zzln zzk;

    @Nullable
    private zzln zzl;

    @Nullable
    private zzln zzm;
    private int zzn;

    @Nullable
    private Object zzo;
    private long zzp;
    private final zzky zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    private static zzwk zzA(zzbf zzbfVar, Object obj, long j10, long j11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j10);
        return iZze == -1 ? new zzwk(obj, j11, zzbdVar.zzf(j10)) : new zzwk(obj, iZze, zzbdVar.zzd(iZze), j11);
    }

    private final long zzC(Object obj) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzln zzlnVar = (zzln) this.zzq.get(i10);
            if (zzlnVar.zzb.equals(obj)) {
                return zzlnVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzlo zzF(zzbf zzbfVar, zzwk zzwkVar, long j10, long j11) {
        Object obj = zzwkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwkVar.zzb() ? zzG(zzbfVar, obj, zzwkVar.zzb, zzwkVar.zzc, j10, zzwkVar.zzd, false) : zzH(zzbfVar, obj, j11, j10, zzwkVar.zzd, false);
    }

    private static final boolean zzL(zzwk zzwkVar) {
        return !zzwkVar.zzb() && zzwkVar.zze == -1;
    }

    public final boolean zzd(zzwi zzwiVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final boolean zze(zzwi zzwiVar) {
        zzln zzlnVar = this.zzm;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    @Nullable
    public final zzln zzk() {
        return this.zzl;
    }

    @Nullable
    public final zzln zzl() {
        return this.zzm;
    }

    @Nullable
    public final zzln zzm() {
        return this.zzi;
    }

    @Nullable
    public final zzln zzn() {
        return this.zzj;
    }

    @Nullable
    public final zzln zzo() {
        return this.zzk;
    }

    @Nullable
    public final zzln zzu(zzwi zzwiVar) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzln zzlnVar = (zzln) this.zzq.get(i10);
            if (zzlnVar.zza == zzwiVar) {
                return zzlnVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    public final int zzw(zzbf zzbfVar, long j10, long j11, long j12) {
        zzlo zzloVarZzx;
        boolean z10;
        zzln zzlnVarZzp = this.zzi;
        zzln zzlnVar = null;
        while (true) {
            int i10 = 0;
            if (zzlnVarZzp == null) {
                return 0;
            }
            zzlo zzloVar = zzlnVarZzp.zzg;
            if (zzlnVar == null) {
                zzloVarZzx = zzx(zzbfVar, zzloVar);
            } else {
                zzlo zzloVarZzE = zzE(zzbfVar, zzlnVar, j10);
                if (zzloVarZzE == null || zzloVar.zzb != zzloVarZzE.zzb || !zzloVar.zza.equals(zzloVarZzE.zza)) {
                    return zzs(zzlnVar);
                }
                zzloVarZzx = zzloVarZzE;
            }
            zzlnVarZzp.zzg = zzloVarZzx.zzb(zzloVar.zzc);
            long j13 = zzloVar.zze;
            long j14 = zzloVarZzx.zze;
            if (j13 != j14) {
                zzlnVarZzp.zzs();
                long jZza = j14 == -9223372036854775807L ? Long.MAX_VALUE : j14 + zzlnVarZzp.zza();
                if (zzlnVarZzp == this.zzj) {
                    boolean z11 = zzlnVarZzp.zzg.zzg;
                    if (j11 == Long.MIN_VALUE || j11 >= jZza) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                boolean z12 = zzlnVarZzp == this.zzk && (j12 == Long.MIN_VALUE || j12 >= jZza);
                int iZzs = zzs(zzlnVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                if (j13 == -9223372036854775807L) {
                    j13 = -9223372036854775807L;
                }
                if (z10 && j13 != -9223372036854775807L) {
                    i10 = 1;
                }
                return z12 ? i10 | 2 : i10;
            }
            zzlnVar = zzlnVarZzp;
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
    }

    private final void zzB() {
        int i10 = zzguf.zzd;
        final zzguc zzgucVar = new zzguc();
        for (zzln zzlnVarZzp = this.zzi; zzlnVarZzp != null; zzlnVarZzp = zzlnVarZzp.zzp()) {
            zzgucVar.zzf(zzlnVarZzp.zzg.zza);
        }
        zzln zzlnVar = this.zzj;
        final zzwk zzwkVar = zzlnVar == null ? null : zzlnVar.zzg.zza;
        this.zzd.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgucVar, zzwkVar);
            }
        });
    }

    private final int zzD(zzbf zzbfVar) {
        zzln zzlnVarZzp = this.zzi;
        if (zzlnVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzlnVarZzp.zzb);
        while (true) {
            iZze = zzbfVar.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlnVarZzp.getClass();
                if (zzlnVarZzp.zzp() == null || zzlnVarZzp.zzg.zzh) {
                    break;
                }
                zzlnVarZzp = zzlnVarZzp.zzp();
            }
            zzln zzlnVarZzp2 = zzlnVarZzp.zzp();
            if (iZze == -1 || zzlnVarZzp2 == null || zzbfVar.zze(zzlnVarZzp2.zzb) != iZze) {
                break;
            }
            zzlnVarZzp = zzlnVarZzp2;
        }
        int iZzs = zzs(zzlnVarZzp);
        zzlnVarZzp.zzg = zzx(zzbfVar, zzlnVarZzp.zzg);
        return iZzs;
    }

    @Nullable
    private final zzlo zzE(zzbf zzbfVar, zzln zzlnVar, long j10) {
        long j11;
        long j12;
        long j13;
        zzlo zzloVar = zzlnVar.zzg;
        long jZza = zzlnVar.zza();
        long j14 = zzloVar.zze;
        long j15 = (jZza + j14) - j10;
        if (zzloVar.zzh) {
            zzwk zzwkVar = zzloVar.zza;
            Object obj = zzwkVar.zza;
            int iZze = zzbfVar.zze(obj);
            int i10 = this.zzf;
            boolean z10 = this.zzg;
            zzbe zzbeVar = this.zzb;
            zzbd zzbdVar = this.zza;
            int iZzl = zzbfVar.zzl(iZze, zzbdVar, zzbeVar, i10, z10);
            if (iZzl != -1) {
                int i11 = zzbfVar.zzd(iZzl, zzbdVar, true).zzc;
                Object obj2 = zzbdVar.zzb;
                obj2.getClass();
                long jZzC = zzwkVar.zzd;
                if (zzbfVar.zzb(i11, zzbeVar, 0L).zzn == iZzl) {
                    Pair pairZzn = zzbfVar.zzn(zzbeVar, zzbdVar, i11, -9223372036854775807L, Math.max(0L, j15));
                    if (pairZzn != null) {
                        obj2 = pairZzn.first;
                        long jLongValue = ((Long) pairZzn.second).longValue();
                        zzln zzlnVarZzp = zzlnVar.zzp();
                        if (zzlnVarZzp == null || !zzlnVarZzp.zzb.equals(obj2)) {
                            jZzC = zzC(obj2);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                            }
                        } else {
                            jZzC = zzlnVarZzp.zzg.zza.zzd;
                        }
                        j13 = jLongValue;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    j12 = 0;
                    j13 = 0;
                }
                zzwk zzwkVarZzA = zzA(zzbfVar, obj2, j13, jZzC, zzbeVar, zzbdVar);
                if (j12 != -9223372036854775807L && zzloVar.zzc != -9223372036854775807L) {
                    zzbfVar.zzo(obj, zzbdVar).zzb();
                    int i12 = zzbdVar.zzg.zzd;
                }
                return zzF(zzbfVar, zzwkVarZzA, j12, j13);
            }
        } else {
            zzwk zzwkVar2 = zzloVar.zza;
            Object obj3 = zzwkVar2.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj3, zzbdVar2);
            if (!zzwkVar2.zzb()) {
                int i13 = zzwkVar2.zze;
                if (i13 != -1) {
                    zzbdVar2.zzi(i13);
                }
                int iZzd = zzbdVar2.zzd(i13);
                zzbdVar2.zzk(i13);
                if (iZzd != zzbdVar2.zzg(i13)) {
                    return zzG(zzbfVar, obj3, i13, iZzd, j14, zzwkVar2.zzd, false);
                }
                zzK(zzbfVar, obj3, i13);
                return zzH(zzbfVar, obj3, 0L, j14, zzwkVar2.zzd, false);
            }
            int i14 = zzwkVar2.zzb;
            if (zzbdVar2.zzg(i14) != -1) {
                int iZza = zzbdVar2.zzg.zza(i14).zza(zzwkVar2.zzc);
                if (iZza < 0) {
                    return zzG(zzbfVar, obj3, i14, iZza, zzloVar.zzc, zzwkVar2.zzd, false);
                }
                long jLongValue2 = zzloVar.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    Pair pairZzn2 = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, Math.max(0L, j15));
                    if (pairZzn2 != null) {
                        jLongValue2 = ((Long) pairZzn2.second).longValue();
                        j11 = -9223372036854775807L;
                    }
                } else {
                    j11 = jLongValue2;
                }
                zzK(zzbfVar, obj3, i14);
                return zzH(zzbfVar, obj3, Math.max(0L, jLongValue2), j11, zzwkVar2.zzd, false);
            }
        }
        return null;
    }

    private final zzlo zzG(zzbf zzbfVar, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        zzwk zzwkVar = new zzwk(obj, i10, i11, j11);
        Object obj2 = zzwkVar.zza;
        int i12 = zzwkVar.zzb;
        int i13 = zzwkVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i12, i13);
        if (i11 == zzbdVar.zzd(i10)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i12);
        return new zzlo(zzwkVar, (jZzh == -9223372036854775807L || jZzh > 0) ? 0L : Math.max(0L, (-1) + jZzh), j10, -9223372036854775807L, jZzh, false, false, false, false, false);
    }

    private final zzlo zzH(zzbf zzbfVar, Object obj, long j10, long j11, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzwk zzwkVar = new zzwk(obj, j12, iZzf);
        boolean zZzL = zzL(zzwkVar);
        boolean zZzI = zzI(zzbfVar, zzwkVar);
        boolean zZzJ = zzJ(zzbfVar, zzwkVar, zZzL);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j15 = j13;
            j14 = j15;
        } else {
            j14 = zzbdVar.zzd;
            j15 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && jMax >= j14) {
            jMax = Math.max(0L, j14 - 1);
        }
        return new zzlo(zzwkVar, jMax, j11, j15, j14, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwk zzwkVar, boolean z10) {
        int iZze = zzbfVar.zze(zzwkVar.zza);
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i10, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z10;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i10) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i10);
        long j10 = zzbdVar.zzg.zza(i10).zzi;
        return 0L;
    }

    public final int zza(zzbf zzbfVar, int i10) {
        this.zzf = i10;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z10) {
        this.zzg = z10;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjg zzjgVar) {
        this.zzh = zzjgVar;
        long j10 = zzjgVar.zzb;
        zzj();
    }

    public final void zzf(long j10) {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            zzlnVar.zzi(j10);
        }
    }

    public final boolean zzg() {
        zzln zzlnVar = this.zzl;
        if (zzlnVar == null) {
            return true;
        }
        if (zzlnVar.zzg.zzj || !zzlnVar.zzd() || this.zzl.zzg.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzn < 100;
    }

    @Nullable
    public final zzlo zzh(long j10, zzmd zzmdVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar == null ? zzF(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzs) : zzE(zzmdVar.zza, zzlnVar, j10);
    }

    public final zzln zzi(zzlo zzloVar) {
        zzln zzlnVarZza;
        zzln zzlnVar = this.zzl;
        long jZza = zzlnVar == null ? 1000000000000L : (zzlnVar.zza() + zzlnVar.zzg.zze) - zzloVar.zzb;
        int i10 = 0;
        while (true) {
            if (i10 >= this.zzq.size()) {
                zzlnVarZza = null;
                break;
            }
            zzlo zzloVar2 = ((zzln) this.zzq.get(i10)).zzg;
            long j10 = zzloVar2.zze;
            long j11 = zzloVar.zze;
            if ((j10 == -9223372036854775807L || j10 == j11) && zzloVar2.zzb == zzloVar.zzb && zzloVar2.zza.equals(zzloVar.zza)) {
                zzlnVarZza = (zzln) this.zzq.remove(i10);
                break;
            }
            i10++;
        }
        if (zzlnVarZza == null) {
            zzlnVarZza = this.zzr.zza(zzloVar, jZza);
        } else {
            zzlnVarZza.zzg = zzloVar;
            zzlnVarZza.zzb(jZza);
        }
        zzln zzlnVar2 = this.zzl;
        if (zzlnVar2 != null) {
            zzlnVar2.zzo(zzlnVarZza);
        } else {
            this.zzi = zzlnVarZza;
            this.zzj = zzlnVarZza;
            this.zzk = zzlnVarZza;
        }
        this.zzo = null;
        this.zzl = zzlnVarZza;
        this.zzn++;
        zzB();
        return zzlnVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            ((zzln) this.zzq.get(i10)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzln zzp() {
        zzln zzlnVar = this.zzk;
        zzln zzlnVar2 = this.zzj;
        if (zzlnVar == zzlnVar2) {
            zzlnVar2.getClass();
            this.zzk = zzlnVar2.zzp();
        }
        zzlnVar2.getClass();
        this.zzj = zzlnVar2.zzp();
        zzB();
        zzln zzlnVar3 = this.zzj;
        zzlnVar3.getClass();
        return zzlnVar3;
    }

    public final zzln zzq() {
        zzln zzlnVar = this.zzk;
        zzlnVar.getClass();
        this.zzk = zzlnVar.zzp();
        zzB();
        zzln zzlnVar2 = this.zzk;
        zzlnVar2.getClass();
        return zzlnVar2;
    }

    @Nullable
    public final zzln zzr() {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return null;
        }
        if (zzlnVar == this.zzj) {
            this.zzj = zzlnVar.zzp();
        }
        if (zzlnVar == this.zzk) {
            this.zzk = zzlnVar.zzp();
        }
        zzlnVar.zzn();
        int i10 = this.zzn - 1;
        this.zzn = i10;
        if (i10 == 0) {
            this.zzl = null;
            zzln zzlnVar2 = this.zzi;
            this.zzo = zzlnVar2.zzb;
            this.zzp = zzlnVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzln zzlnVar = this.zzm;
        if (zzlnVar == null || zzlnVar.zze()) {
            this.zzm = null;
            for (int i10 = 0; i10 < this.zzq.size(); i10++) {
                zzln zzlnVar2 = (zzln) this.zzq.get(i10);
                if (!zzlnVar2.zze()) {
                    this.zzm = zzlnVar2;
                    return;
                }
            }
        }
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzln zzlnVarZzp = this.zzi;
        zzlnVarZzp.getClass();
        this.zzo = zzlnVarZzp.zzb;
        this.zzp = zzlnVarZzp.zzg.zza.zzd;
        while (zzlnVarZzp != null) {
            zzlnVarZzp.zzn();
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    public final zzlo zzx(zzbf zzbfVar, zzlo zzloVar) {
        long j10;
        long jZzh;
        long j11;
        long j12;
        int i10;
        int i11;
        zzwk zzwkVar = zzloVar.zza;
        boolean zZzL = zzL(zzwkVar);
        boolean zZzI = zzI(zzbfVar, zzwkVar);
        boolean zZzJ = zzJ(zzbfVar, zzwkVar, zZzL);
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzwkVar.zzb() || (i11 = zzwkVar.zze) == -1) {
            j10 = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i11);
            j10 = 0;
        }
        if (!zzwkVar.zzb()) {
            if (j10 != -9223372036854775807L) {
                j11 = 0;
                j12 = 0;
            } else {
                jZzh = zzbdVar.zzd;
            }
            if (zzwkVar.zzb()) {
                zzbdVar.zzk(zzwkVar.zzb);
            } else {
                i10 = zzwkVar.zze;
                if (i10 != -1) {
                    zzbdVar.zzk(i10);
                }
            }
            return new zzlo(zzwkVar, zzloVar.zzb, zzloVar.zzc, j12, j11, false, false, zZzL, zZzI, zZzJ);
        }
        jZzh = zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc);
        j12 = j10;
        j11 = jZzh;
        if (zzwkVar.zzb()) {
            zzbdVar.zzk(zzwkVar.zzb);
        } else {
            i10 = zzwkVar.zze;
            if (i10 != -1) {
                zzbdVar.zzk(i10);
            }
        }
        return new zzlo(zzwkVar, zzloVar.zzb, zzloVar.zzc, j12, j11, false, false, zZzL, zZzI, zZzJ);
    }

    public final zzwk zzy(zzbf zzbfVar, Object obj, long j10) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i10) {
            zzln zzlnVarZzp = this.zzi;
            while (true) {
                if (zzlnVarZzp == null) {
                    zzln zzlnVarZzp2 = this.zzi;
                    while (true) {
                        if (zzlnVarZzp2 == null) {
                            jZzC = zzC(obj);
                            if (jZzC != -1) {
                                break;
                            }
                            jZzC = this.zze;
                            this.zze = 1 + jZzC;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzC;
                            break;
                        }
                        int iZze2 = zzbfVar.zze(zzlnVarZzp2.zzb);
                        if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i10) {
                            jZzC = zzlnVarZzp2.zzg.zza.zzd;
                            break;
                        }
                        zzlnVarZzp2 = zzlnVarZzp2.zzp();
                    }
                } else {
                    if (zzlnVarZzp.zzb.equals(obj)) {
                        jZzC = zzlnVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzlnVarZzp = zzlnVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j11 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i11 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i11, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j10, j11, zzbeVar, zzbdVar);
    }

    public final /* synthetic */ void zzz(zzguc zzgucVar, zzwk zzwkVar) {
        this.zzc.zzz(zzgucVar.zzi(), zzwkVar);
    }

    public zzlq(zzmx zzmxVar, zzdx zzdxVar, zzky zzkyVar, zzjg zzjgVar) {
        this.zzc = zzmxVar;
        this.zzd = zzdxVar;
        this.zzr = zzkyVar;
        this.zzh = zzjgVar;
    }

    private final boolean zzI(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzL(zzwkVar)) {
            return false;
        }
        Object obj = zzwkVar.zza;
        int i10 = zzbfVar.zzo(obj, this.zza).zzc;
        if (zzbfVar.zzb(i10, this.zzb, 0L).zzo != zzbfVar.zze(obj)) {
            return false;
        }
        return true;
    }

    public final int zzs(zzln zzlnVar) {
        zzlnVar.getClass();
        int i10 = 0;
        if (zzlnVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlnVar;
        while (zzlnVar.zzp() != null) {
            zzlnVar = zzlnVar.zzp();
            zzlnVar.getClass();
            if (zzlnVar == this.zzj) {
                zzln zzlnVar2 = this.zzi;
                this.zzj = zzlnVar2;
                this.zzk = zzlnVar2;
                i10 = 3;
            }
            if (zzlnVar == this.zzk) {
                this.zzk = this.zzj;
                i10 |= 2;
            }
            zzlnVar.zzn();
            this.zzn--;
        }
        zzln zzlnVar3 = this.zzl;
        zzlnVar3.getClass();
        zzlnVar3.zzo(null);
        zzB();
        return i10;
    }
}
