package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzxq implements zzwi, zzaex, zzaax, zzabc, zzya {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzxp zzB;
    private zzafy zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhb zze;
    private final zzto zzf;
    private final zzwu zzg;
    private final zztj zzh;
    private final zzxi zzi;
    private final zzaan zzj;
    private final long zzk;
    private final long zzl;
    private final zzxd zzn;

    @Nullable
    private zzwh zzs;

    @Nullable
    private zzaic zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabf zzm = new zzabf("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfj.zzc(null);
    private zzxo[] zzw = new zzxo[0];
    private zzyb[] zzv = new zzyb[0];
    private zzxg[] zzu = new zzxg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    public zzxq(Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzto zztoVar, zztj zztjVar, zzaaw zzaawVar, zzwu zzwuVar, zzxi zzxiVar, zzaan zzaanVar, @Nullable String str, int i10, boolean z10, int i11, @Nullable zzv zzvVar, long j10, @Nullable zzabl zzablVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztoVar;
        this.zzh = zztjVar;
        this.zzg = zzwuVar;
        this.zzi = zzxiVar;
        this.zzj = zzaanVar;
        this.zzk = i10;
        this.zzn = zzxdVar;
        this.zzl = j10;
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzY(boolean z10) {
        int i10 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzyb[] zzybVarArr = this.zzv;
            if (i10 >= zzybVarArr.length) {
                return jMax;
            }
            if (z10) {
                jMax = Math.max(jMax, zzybVarArr[i10].zzo());
            } else {
                zzxp zzxpVar = this.zzB;
                zzxpVar.getClass();
                if (zzxpVar.zzc[i10]) {
                    jMax = Math.max(jMax, zzybVarArr[i10].zzo());
                }
            }
            i10++;
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    public final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    public final /* synthetic */ long zzI(boolean z10) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzk;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    public final /* synthetic */ zzaic zzO() {
        return this.zzt;
    }

    public final /* synthetic */ void zzP(zzaic zzaicVar) {
        this.zzt = zzaicVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    private final zzagh zzU(zzxo zzxoVar) {
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzxoVar.equals(this.zzw[i10])) {
                return this.zzv[i10];
            }
        }
        if (this.zzx) {
            int i11 = zzxoVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i11);
            sb2.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb2.toString());
            return new zzaer();
        }
        zzyb zzybVar = new zzyb(this.zzj, this.zzf, this.zzh);
        zzxg zzxgVar = new zzxg(zzybVar);
        zzybVar.zzy(this);
        int i12 = length + 1;
        zzxo[] zzxoVarArr = (zzxo[]) Arrays.copyOf(this.zzw, i12);
        zzxoVarArr[length] = zzxoVar;
        String str = zzfj.zza;
        this.zzw = zzxoVarArr;
        zzyb[] zzybVarArr = (zzyb[]) Arrays.copyOf(this.zzv, i12);
        zzybVarArr[length] = zzybVar;
        this.zzv = zzybVarArr;
        zzxg[] zzxgVarArr = (zzxg[]) Arrays.copyOf(this.zzu, i12);
        zzxgVarArr[length] = zzxgVar;
        this.zzu = zzxgVarArr;
        return zzxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i10;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            if (zzybVar.zzn() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzv zzvVarZzn = this.zzv[i11].zzn();
            zzvVarZzn.getClass();
            String str = zzvVarZzn.zzo;
            boolean zZza = zzas.zza(str);
            boolean z10 = zZza || zzas.zzb(str);
            zArr[i11] = z10;
            this.zzz = z10 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaic zzaicVar = this.zzt;
            if (zzaicVar != null) {
                if (zZza || this.zzw[i11].zzb) {
                    zzap zzapVar = zzvVarZzn.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaicVar) : zzapVar.zzg(zzaicVar);
                    zzt zztVarZza = zzvVarZzn.zza();
                    zztVarZza.zzk(zzapVar2);
                    zzvVarZzn = zztVarZza.zzM();
                }
                if (zZza && zzvVarZzn.zzh == -1 && zzvVarZzn.zzi == -1 && (i10 = zzaicVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzn.zza();
                    zztVarZza2.zzh(i10);
                    zzvVarZzn = zztVarZza2.zzM();
                }
            }
            zzv zzvVarZzb = zzvVarZzn.zzb(this.zzf.zzb(zzvVarZzn));
            zzbgVarArr[i11] = new zzbg(Integer.toString(i11), zzvVarZzb);
            this.zzI = zzvVarZzb.zzu | this.zzI;
        }
        this.zzB = new zzxp(new zzyn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxe(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    private final void zzW() {
        zzxh zzxhVar = new zzxh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgrc.zzi(zzZ());
            long j10 = this.zzD;
            if (j10 != -9223372036854775807L && this.zzM > j10) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzafy zzafyVar = this.zzC;
            zzafyVar.getClass();
            zzxhVar.zzd(zzafyVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxhVar, this, zzaaw.zza(this.zzF));
    }

    private final int zzX() {
        int iZzi = 0;
        for (zzyb zzybVar : this.zzv) {
            iZzi += zzybVar.zzi();
        }
        return iZzi;
    }

    private final void zzaa() {
        zzgrc.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzA(zzabb zzabbVar, long j10, long j11, boolean z10) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        zzxhVar.zze();
        this.zzg.zzf(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        if (z10) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwh zzwhVar = this.zzs;
            zzwhVar.getClass();
            zzwhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzB(zzabb zzabbVar, long j10, long j11) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j12 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j12;
            this.zzi.zzb(j12, this.zzC, this.zzE);
        }
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        zzxhVar.zze();
        this.zzg.zze(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        this.zzP = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzC(zzabb zzabbVar, long j10, long j11, int i10) {
        zzwb zzwbVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        if (i10 == 0) {
            long jZze = zzxhVar.zze();
            zzhf zzhfVarZzh = zzxhVar.zzh();
            zzwbVar = new zzwb(jZze, zzhfVarZzh, zzhfVarZzh.zza, Collections.emptyMap(), j10, 0L, 0L);
        } else {
            zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        }
        this.zzg.zzd(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), i10);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzafy zzafyVar) {
        this.zzC = this.zzt == null ? zzafyVar : new zzafx(-9223372036854775807L, 0L);
        this.zzD = zzafyVar.zza();
        boolean z10 = false;
        if (!this.zzK && zzafyVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzE = z10;
        this.zzF = true == z10 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzafyVar, z10);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzj();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j10) {
        this.zzs = zzwhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j10, boolean z10) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzv[i10].zzw(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j10, zzmt zzmtVar) {
        long j11;
        boolean z10;
        long j12;
        boolean z11;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzafw zzafwVarZzc = this.zzC.zzc(j10);
        zzafz zzafzVar = zzafwVarZzc.zza;
        zzafz zzafzVar2 = zzafwVarZzc.zzb;
        long j13 = zzmtVar.zzd;
        if (j13 == 0) {
            if (zzmtVar.zze == 0) {
                return j10;
            }
            j13 = 0;
        }
        String str = zzfj.zza;
        long j14 = j10 - j13;
        long j15 = Long.MAX_VALUE;
        long j16 = (((j13 ^ j10) > 0L ? 1 : ((j13 ^ j10) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j14) > 0L ? 1 : ((j10 ^ j14) == 0L ? 0 : -1)) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j17 = Long.MIN_VALUE;
        if (j16 != Long.MIN_VALUE) {
            if (j16 == Long.MAX_VALUE) {
                if (j14 != Long.MAX_VALUE) {
                    j16 = Long.MIN_VALUE;
                } else {
                    j16 = Long.MAX_VALUE;
                }
            }
        } else if (j14 == Long.MIN_VALUE) {
            j14 = Long.MIN_VALUE;
            if (j16 == Long.MAX_VALUE) {
                if (j14 != Long.MAX_VALUE) {
                    j16 = Long.MIN_VALUE;
                } else {
                    j16 = Long.MAX_VALUE;
                }
            }
        } else {
            j16 = Long.MIN_VALUE;
        }
        long j18 = zzmtVar.zze;
        long j19 = j10 + j18;
        long j20 = (((j10 ^ j19) > 0L ? 1 : ((j10 ^ j19) == 0L ? 0 : -1)) >= 0) | (((j18 ^ j10) > 0L ? 1 : ((j18 ^ j10) == 0L ? 0 : -1)) < 0) ? j19 : ((j19 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j20 == Long.MIN_VALUE) {
            if (j19 == Long.MIN_VALUE) {
            }
            j11 = zzafzVar.zzb;
            if (j16 <= j11 || j11 > j15) {
                z10 = false;
            } else {
                z10 = true;
            }
            j12 = zzafzVar2.zzb;
            z11 = j16 > j12 && j12 <= j15;
            if (z10 || !z11) {
                if (!z10) {
                    if (z11) {
                        return j12;
                    }
                    return j16;
                }
            } else if (Math.abs(j11 - j10) > Math.abs(j12 - j10)) {
                return j12;
            }
            return j11;
        }
        j17 = j19;
        if (j20 == Long.MAX_VALUE) {
            int i10 = (j17 > Long.MAX_VALUE ? 1 : (j17 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j15 = j20;
        }
        j11 = zzafzVar.zzb;
        if (j16 <= j11) {
            z10 = false;
        } else {
            z10 = false;
        }
        j12 = zzafzVar2.zzb;
        if (j16 > j12) {
        }
        if (z10) {
            if (!z10) {
                if (z11) {
                    return j12;
                }
                return j16;
            }
        } else if (!z10) {
            if (z11) {
                return j12;
            }
            return j16;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        if (this.zzP) {
            return false;
        }
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzabfVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzf();
        }
        this.zzn.zzb();
    }

    public final void zzq(int i10) throws IOException {
        this.zzv[i10].zzk();
        zzr();
    }

    public final void zzr() throws IOException {
        this.zzm.zzh(zzaaw.zza(this.zzF));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i10, int i11) {
        return zzU(new zzxo(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(final zzafy zzafyVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzafyVar);
            }
        });
    }

    public final zzagh zzx() {
        return zzU(new zzxo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ zzaaz zzz(zzabb zzabbVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zzaaz zzaazVarZza;
        zzafy zzafyVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        zzxhVar.zzg();
        String str = zzfj.zza;
        if ((iOException instanceof zzat) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzhp) || (iOException instanceof zzabe)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzhc) && ((zzhc) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzaazVarZza = zzabf.zzb;
        } else {
            int iZzX = zzX();
            boolean z10 = iZzX > this.zzO;
            if (this.zzK || !((zzafyVar = this.zzC) == null || zzafyVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z11 = this.zzy;
                if (!z11 || zzT()) {
                    this.zzH = z11;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzyb zzybVar : this.zzv) {
                        zzybVar.zzg(false);
                    }
                    zzxhVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzaazVarZza = zzabf.zza;
                }
            }
            zzaazVarZza = zzabf.zza(z10, jMin);
        }
        boolean z12 = !zzaazVarZza.zza();
        this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, z12);
        if (z12) {
            zzxhVar.zze();
        }
        return zzaazVarZza;
    }

    private final void zzR(int i10) {
        zzaa();
        zzxp zzxpVar = this.zzB;
        boolean[] zArr = zzxpVar.zzd;
        if (!zArr[i10]) {
            zzv zzvVarZza = zzxpVar.zza.zza(i10).zza(0);
            this.zzg.zzh(new zzwg(1, zzas.zzf(zzvVarZza.zzo), zzvVarZza, 0, null, zzfj.zzp(this.zzL), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    private final void zzS(int i10) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i10]) && !this.zzv[i10].zzq(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyb zzybVar : this.zzv) {
                    zzybVar.zzg(false);
                }
                zzwh zzwhVar = this.zzs;
                zzwhVar.getClass();
                zzwhVar.zzs(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j10) {
        boolean z10;
        zzaac zzaacVar;
        boolean z11;
        boolean z12;
        zzaa();
        zzxp zzxpVar = this.zzB;
        zzyn zzynVar = zzxpVar.zza;
        boolean[] zArr3 = zzxpVar.zzc;
        int i10 = this.zzJ;
        int i11 = 0;
        for (int i12 = 0; i12 < zzaacVarArr.length; i12++) {
            zzyc zzycVar = zzycVarArr[i12];
            if (zzycVar != null && (zzaacVarArr[i12] == null || !zArr[i12])) {
                int iZza = ((zzxn) zzycVar).zza();
                zzgrc.zzi(zArr3[iZza]);
                this.zzJ--;
                zArr3[iZza] = false;
                zzycVarArr[i12] = null;
            }
        }
        if (!this.zzG ? !(j10 == 0 || this.zzA) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < zzaacVarArr.length; i13++) {
            if (zzycVarArr[i13] == null && (zzaacVar = zzaacVarArr[i13]) != null) {
                if (zzaacVar.zze() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzgrc.zzi(z11);
                if (zzaacVar.zzf(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zzgrc.zzi(z12);
                int iZzb = zzynVar.zzb(zzaacVar.zza());
                zzgrc.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzaacVar.zzc().zzu | this.zzI;
                zzycVarArr[i13] = new zzxn(this, iZzb);
                zArr2[i13] = true;
                if (!z10) {
                    zzyb zzybVar = this.zzv[iZzb];
                    if (zzybVar.zzm() != 0 && !zzybVar.zzt(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabf zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                zzyb[] zzybVarArr = this.zzv;
                int length = zzybVarArr.length;
                while (i11 < length) {
                    zzybVarArr[i11].zzx();
                    i11++;
                }
                zzabfVar.zzf();
            } else {
                this.zzP = false;
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzg(false);
                }
            }
        } else if (z10) {
            j10 = zzj(j10);
            while (i11 < zzycVarArr.length) {
                if (zzycVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.zzG = true;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzxp zzxpVar = this.zzB;
                if (zzxpVar.zzb[i10] && zzxpVar.zzc[i10] && !this.zzv[i10].zzp()) {
                    jZzY = Math.min(jZzY, this.zzv[i10].zzo());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        if (jZzY == Long.MIN_VALUE) {
            return this.zzL;
        }
        return jZzY;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[LOOP:1: B:38:0x0086->B:39:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[LOOP:2: B:42:0x009b->B:43:0x009d, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0083, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0094, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j10) {
        zzabf zzabfVar;
        int i10;
        boolean zZzt;
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j10 = 0;
        }
        this.zzH = false;
        long j11 = this.zzL;
        this.zzL = j10;
        if (zzZ()) {
            this.zzM = j10;
            return j10;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i11 = 0; i11 < length; i11++) {
                zzyb zzybVar = this.zzv[i11];
                if (this.zzu[i11].zzf() && (zzybVar.zzm() != 0 || j11 != j10)) {
                    if (this.zzA) {
                        zZzt = zzybVar.zzs(zzybVar.zzl());
                    } else {
                        zZzt = zzybVar.zzt(j10, this.zzP);
                    }
                    if (!zZzt && (zArr[i11] || !this.zzz)) {
                        this.zzN = false;
                        this.zzM = j10;
                        this.zzP = false;
                        this.zzI = false;
                        zzabfVar = this.zzm;
                        if (zzabfVar.zze()) {
                            for (zzyb zzybVar2 : this.zzv) {
                                zzybVar2.zzx();
                            }
                            zzabfVar.zzf();
                            break;
                        }
                        zzabfVar.zzc();
                        for (zzyb zzybVar3 : this.zzv) {
                            zzybVar3.zzg(false);
                        }
                        break;
                        break;
                    }
                }
            }
        } else {
            this.zzN = false;
            this.zzM = j10;
            this.zzP = false;
            this.zzI = false;
            zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                while (i < r3) {
                    zzybVar2.zzx();
                }
                zzabfVar.zzf();
                break;
            }
            zzabfVar.zzc();
            while (i10 < r2) {
                zzybVar3.zzg(false);
            }
            break;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return zzi();
    }

    public final boolean zzp(int i10) {
        if (!zzT() && this.zzv[i10].zzq(this.zzP)) {
            return true;
        }
        return false;
    }

    public final int zzs(int i10, zzlh zzlhVar, zzih zzihVar, int i11) {
        if (zzT()) {
            return -3;
        }
        zzR(i10);
        int iZzr = this.zzv[i10].zzr(zzlhVar, zzihVar, i11, this.zzP);
        if (iZzr == -3) {
            zzS(i10);
        }
        return iZzr;
    }

    public final int zzt(int i10, long j10) {
        if (zzT()) {
            return 0;
        }
        zzR(i10);
        zzyb zzybVar = this.zzv[i10];
        int iZzu = zzybVar.zzu(j10, this.zzP);
        zzybVar.zzv(iZzu);
        if (iZzu == 0) {
            zzS(i10);
            return 0;
        }
        return iZzu;
    }
}
