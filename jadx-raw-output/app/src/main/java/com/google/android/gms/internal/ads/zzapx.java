package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzapx implements zzaeu {
    private final int zza;
    private final List zzb;
    private final zzer zzc;
    private final SparseIntArray zzd;
    private final zzaqa zze;
    private final zzamd zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapt zzj;
    private zzaps zzk;
    private zzaex zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i10 = zzapw.zza;
    }

    @Deprecated
    public zzapx() {
        this(1, 1, zzamd.zza, new zzfg(0L), new zzaok(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final /* synthetic */ List zzh() {
        return this.zzb;
    }

    public final /* synthetic */ zzaqa zzi() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    public final /* synthetic */ zzaex zzm() {
        return this.zzl;
    }

    public final /* synthetic */ int zzn() {
        return this.zzm;
    }

    public final /* synthetic */ void zzo(int i10) {
        this.zzm = i10;
    }

    public final /* synthetic */ void zzp(boolean z10) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzq(int i10) {
        this.zzr = i10;
    }

    public zzapx(int i10, int i11, zzamd zzamdVar, zzfg zzfgVar, zzaqa zzaqaVar, int i12) {
        this.zze = zzaqaVar;
        this.zza = i11;
        this.zzf = zzamdVar;
        this.zzb = Collections.singletonList(zzfgVar);
        this.zzc = new zzer(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapt(112800);
        this.zzl = zzaex.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzaqaVar.zza();
        int size = sparseArrayZza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArrayZza.keyAt(i13), (zzaqc) sparseArrayZza.valueAt(i13));
        }
        this.zzg.put(0, new zzapo(new zzapu(this)));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(bArrZzi, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    zzaelVar.zze(i10, false);
                    return true;
                }
                if (bArrZzi[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zza == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzf);
        }
        this.zzl = zzaexVar;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x019f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.zzapg] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.gms.internal.ads.zzaqc] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        ?? r10;
        ?? r11;
        zzaqc zzaqcVar;
        long j10;
        boolean z10;
        long jZzo = zzaevVar.zzo();
        if (this.zzn) {
            if (jZzo != -1) {
                zzapt zzaptVar = this.zzj;
                if (!zzaptVar.zza()) {
                    return zzaptVar.zzb(zzaevVar, zzafvVar, this.zzr);
                }
            }
            if (this.zzo) {
                j10 = 0;
            } else {
                this.zzo = true;
                zzapt zzaptVar2 = this.zzj;
                if (zzaptVar2.zzc() != -9223372036854775807L) {
                    j10 = 0;
                    zzaps zzapsVar = new zzaps(zzaptVar2.zzd(), zzaptVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzapsVar;
                    this.zzl.zzw(zzapsVar.zza());
                } else {
                    j10 = 0;
                    this.zzl.zzw(new zzafx(zzaptVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                z10 = false;
                this.zzp = false;
                zze(j10, j10);
                if (zzaevVar.zzn() != j10) {
                    zzafvVar.zza = j10;
                    return 1;
                }
            } else {
                z10 = false;
            }
            zzaps zzapsVar2 = this.zzk;
            r10 = z10;
            if (zzapsVar2 != null && zzapsVar2.zzc()) {
                r10 = z10;
                return zzapsVar2.zzd(zzaevVar, zzafvVar);
            }
        } else {
            r10 = 0;
        }
        r10 = z10;
        zzer zzerVar = this.zzc;
        byte[] bArrZzi = zzerVar.zzi();
        if (9400 - zzerVar.zzg() < 188) {
            int iZzd = zzerVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzerVar.zzg(), bArrZzi, r10, iZzd);
            }
            zzerVar.zzb(bArrZzi, iZzd);
        }
        while (zzerVar.zzd() < 188) {
            int iZze = zzerVar.zze();
            int iZza = zzaevVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                ?? r12 = r10;
                while (true) {
                    ?? r13 = this.zzg;
                    if (r12 >= r13.size()) {
                        return -1;
                    }
                    zzaqc zzaqcVar2 = (zzaqc) r13.valueAt(r12);
                    if (zzaqcVar2 instanceof zzapg) {
                        ?? r14 = (zzapg) zzaqcVar2;
                        if (r14.zzd(r10)) {
                            r14.zzc(new zzer(), 1);
                        }
                    }
                    r12++;
                }
            } else {
                zzerVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzerVar.zzg();
        int iZze2 = zzerVar.zze();
        int iZza2 = zzaqd.zza(zzerVar.zzi(), iZzg, iZze2);
        zzerVar.zzh(iZza2);
        int i10 = iZza2 + 188;
        if (i10 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = r10;
        }
        int iZze3 = zzerVar.zze();
        if (i10 > iZze3) {
            return r10;
        }
        int iZzB = zzerVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzerVar.zzh(i10);
            return r10;
        }
        ?? r15 = (4194304 & iZzB) != 0 ? 1 : r10;
        int i11 = iZzB & 32;
        int i12 = (iZzB >> 8) & 8191;
        if ((iZzB & 16) != 0) {
            zzaqcVar = (zzaqc) this.zzg.get(i12);
        } else {
            r11 = 0;
        }
        if (r11 == 0) {
            r11 = zzaqcVar;
            zzerVar.zzh(i10);
            return r10;
        }
        int i13 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i14 = sparseIntArray.get(i12, i13 - 1);
        sparseIntArray.put(i12, i13);
        if (i14 == i13) {
            r11 = zzaqcVar;
            zzerVar.zzh(i10);
            return r10;
        }
        if (i13 != ((i14 + 1) & 15)) {
            r11 = zzaqcVar;
            r11.zzb();
        }
        if (i11 != 0) {
            int iZzs = zzerVar.zzs();
            r15 = (r15 == true ? 1 : 0) | ((zzerVar.zzs() & 64) != 0 ? 2 : r10);
            zzerVar.zzk(iZzs - 1);
        }
        boolean z11 = this.zzn;
        if (z11 || !this.zzi.get(i12, r10)) {
            zzerVar.zzf(i10);
            r11.zzc(zzerVar, r15);
            zzerVar.zzf(iZze3);
            if (!z11) {
                if (this.zzn && jZzo != -1) {
                    this.zzp = true;
                }
            }
        } else if (this.zzn) {
            this.zzp = true;
        }
        zzerVar.zzh(i10);
        return r10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        zzaps zzapsVar;
        List list = this.zzb;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfg zzfgVar = (zzfg) list.get(i10);
            if (zzfgVar.zzc() != -9223372036854775807L) {
                long jZza = zzfgVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j11) {
                    zzfgVar.zzd(j11);
                }
            } else {
                zzfgVar.zzd(j11);
            }
        }
        if (j11 != 0 && (zzapsVar = this.zzk) != null) {
            zzapsVar.zzb(j11);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i11 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzaqc) sparseArray.valueAt(i11)).zzb();
                i11++;
            }
        }
    }
}
