package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzyb implements zzagh {
    private boolean zzB;
    private final zzxw zza;

    @Nullable
    private final zzto zzd;

    @Nullable
    private final zztj zze;

    @Nullable
    private zzya zzf;

    @Nullable
    private zzv zzg;

    @Nullable
    private zzth zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;

    @Nullable
    private zzv zzz;
    private final zzxx zzb = new zzxx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzagg[] zzo = new zzagg[1000];
    private final zzyi zzc = new zzyi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzxy
        @Override // com.google.android.gms.internal.ads.zzdr
        public final /* synthetic */ void zza(Object obj) {
            zztn zztnVar = ((zzxz) obj).zzb;
        }
    });
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzlh zzlhVar, zzih zzihVar, boolean z10, boolean z11, zzxx zzxxVar) {
        zzihVar.zzd = false;
        if (!zzH()) {
            if (!z11 && !this.zzw) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null || (!z10 && zzvVar == this.zzg)) {
                    return -3;
                }
                zzI(zzvVar, zzlhVar);
                return -5;
            }
            zzihVar.zzg(4);
            zzihVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzv zzvVar2 = ((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza;
        if (!z10 && zzvVar2 == this.zzg) {
            int iZzM = zzM(this.zzs);
            if (!zzJ(iZzM)) {
                zzihVar.zzd = true;
                return -3;
            }
            zzihVar.zzg(this.zzm[iZzM]);
            if (this.zzs == this.zzp - 1 && (z11 || this.zzw)) {
                zzihVar.zzh(536870912);
            }
            zzihVar.zze = this.zzn[iZzM];
            zzxxVar.zza = this.zzl[iZzM];
            zzxxVar.zzb = this.zzk[iZzM];
            zzxxVar.zzc = this.zzo[iZzM];
            return -4;
        }
        zzI(zzvVar2, zzlhVar);
        return -5;
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        this.zzy = false;
        if (Objects.equals(zzvVar, this.zzz)) {
            return false;
        }
        zzyi zzyiVar = this.zzc;
        if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(zzvVar)) {
            this.zzz = zzvVar;
        } else {
            this.zzz = ((zzxz) zzyiVar.zzc()).zza;
        }
        boolean z10 = this.zzA;
        zzv zzvVar2 = this.zzz;
        this.zzA = z10 & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
        this.zzB = false;
        return true;
    }

    private final synchronized long zzD(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzp;
        if (i11 != 0) {
            long[] jArr = this.zzn;
            int i12 = this.zzr;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzs) != i11) {
                    i11 = i10 + 1;
                }
                int iZzK = zzK(i12, i11, j10, false);
                if (iZzK != -1) {
                    return zzL(iZzK);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzE() {
        int i10 = this.zzp;
        if (i10 == 0) {
            return -1L;
        }
        return zzL(i10);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j10, int i10, long j11, int i11, @Nullable zzagg zzaggVar) {
        int i12 = this.zzp;
        if (i12 > 0) {
            int iZzM = zzM(i12 - 1);
            zzgrc.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j11);
        }
        this.zzw = (536870912 & i10) != 0;
        this.zzv = Math.max(this.zzv, j10);
        int iZzM2 = zzM(this.zzp);
        this.zzn[iZzM2] = j10;
        this.zzk[iZzM2] = j11;
        this.zzl[iZzM2] = i11;
        this.zzm[iZzM2] = i10;
        this.zzo[iZzM2] = zzaggVar;
        this.zzj[iZzM2] = 0;
        zzyi zzyiVar = this.zzc;
        if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(this.zzz)) {
            zzv zzvVar = this.zzz;
            zzvVar.getClass();
            zzyiVar.zzb(this.zzq + this.zzp, new zzxz(zzvVar, zztn.zzb, null));
        }
        int i13 = this.zzp + 1;
        this.zzp = i13;
        int i14 = this.zzi;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzagg[] zzaggVarArr = new zzagg[i15];
            int i16 = this.zzr;
            int i17 = i14 - i16;
            System.arraycopy(this.zzk, i16, jArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzr, jArr3, 0, i17);
            System.arraycopy(this.zzm, this.zzr, iArr, 0, i17);
            System.arraycopy(this.zzl, this.zzr, iArr2, 0, i17);
            System.arraycopy(this.zzo, this.zzr, zzaggVarArr, 0, i17);
            System.arraycopy(this.zzj, this.zzr, jArr, 0, i17);
            int i18 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr2, i17, i18);
            System.arraycopy(this.zzn, 0, jArr3, i17, i18);
            System.arraycopy(this.zzm, 0, iArr, i17, i18);
            System.arraycopy(this.zzl, 0, iArr2, i17, i18);
            System.arraycopy(this.zzo, 0, zzaggVarArr, i17, i18);
            System.arraycopy(this.zzj, 0, jArr, i17, i18);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzaggVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i15;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final int zzK(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzn[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzm[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzi) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzM(int i10) {
        int i11 = this.zzr + i10;
        int i12 = this.zzi;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @CallSuper
    public final void zzf() {
        zzg(true);
        zzF();
    }

    public final void zzh(long j10) {
        this.zzt = j10;
    }

    public final int zzi() {
        return this.zzq + this.zzp;
    }

    public final int zzl() {
        return this.zzq;
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    @Nullable
    public final synchronized zzv zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    @CallSuper
    public final synchronized boolean zzq(boolean z10) {
        boolean z11 = true;
        if (zzH()) {
            if (((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z10 && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z11 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean zzs(int i10) {
        boolean z10;
        zzA();
        int i11 = this.zzq;
        if (i10 < i11 || i10 > this.zzp + i11) {
            z10 = false;
        } else {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i10 - i11;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[EDGE_INSN: B:23:0x0044->B:26:0x0052 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[EDGE_INSN: B:24:0x0045->B:26:0x0052 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:28:0x0055, B:25:0x0047), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x003d A[SYNTHETIC] */
    public final synchronized boolean zzt(long j10, boolean z10) {
        int iZzK;
        int i10;
        zzA();
        int i11 = this.zzs;
        int iZzM = zzM(i11);
        if (zzH() && j10 >= this.zzn[iZzM]) {
            if (j10 <= this.zzv) {
                if (this.zzA) {
                    iZzK = this.zzp - i11;
                    i10 = 0;
                    while (true) {
                        if (i10 < iZzK) {
                            if (z10) {
                                iZzK = -1;
                                break;
                            }
                            break;
                        }
                        if (this.zzn[iZzM] < j10) {
                            iZzK = i10;
                            break;
                        }
                        iZzM++;
                        if (iZzM == this.zzi) {
                            iZzM = 0;
                        }
                        i10++;
                    }
                } else {
                    iZzK = zzK(iZzM, this.zzp - i11, j10, true);
                }
                if (iZzK == -1) {
                    this.zzt = j10;
                    this.zzs += iZzK;
                    return true;
                }
            } else if (z10) {
                z10 = true;
                if (this.zzA) {
                    iZzK = this.zzp - i11;
                    i10 = 0;
                    while (true) {
                        if (i10 < iZzK) {
                            if (z10) {
                                iZzK = -1;
                                break;
                            }
                            break;
                            break;
                        }
                        if (this.zzn[iZzM] < j10) {
                            iZzK = i10;
                            break;
                        }
                        iZzM++;
                        if (iZzM == this.zzi) {
                            iZzM = 0;
                        }
                        i10++;
                    }
                } else {
                    iZzK = zzK(iZzM, this.zzp - i11, j10, true);
                }
                if (iZzK == -1) {
                    this.zzt = j10;
                    this.zzs += iZzK;
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized int zzu(long j10, boolean z10) {
        int i10 = this.zzs;
        int iZzM = zzM(i10);
        if (zzH() && j10 >= this.zzn[iZzM]) {
            if (j10 > this.zzv && z10) {
                return this.zzp - i10;
            }
            int iZzK = zzK(iZzM, this.zzp - i10, j10, true);
            if (iZzK == -1) {
                return 0;
            }
            return iZzK;
        }
        return 0;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzs + i10 <= this.zzp) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzgrc.zza(z10);
        this.zzs += i10;
    }

    public final void zzy(@Nullable zzya zzyaVar) {
        this.zzf = zzyaVar;
    }

    private final void zzI(zzv zzvVar, zzlh zzlhVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzto zztoVar = this.zzd;
        zzlhVar.zzb = zzvVar.zzb(zztoVar.zzb(zzvVar));
        zzlhVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzth zzthVarZza = zztoVar.zza(this.zze, zzvVar);
            this.zzh = zzthVarZza;
            zzlhVar.zza = zzthVarZza;
        }
    }

    private final boolean zzJ(int i10) {
        if (this.zzh != null) {
            return (this.zzm[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    @GuardedBy("this")
    private final long zzL(int i10) {
        long j10 = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzM = zzM(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j10, jMax);
        this.zzp -= i10;
        int i12 = this.zzq + i10;
        this.zzq = i12;
        int i13 = this.zzr + i10;
        this.zzr = i13;
        int i14 = this.zzi;
        if (i13 >= i14) {
            this.zzr = i13 - i14;
        }
        int i15 = this.zzs - i10;
        this.zzs = i15;
        if (i15 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i12);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i16 = this.zzr;
        if (i16 == 0) {
            i16 = this.zzi;
        }
        int i17 = i16 - 1;
        return this.zzk[i17] + ((long) this.zzl[i17]);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zzg(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i10, int i11) {
        this.zza.zzh(zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
        if (this.zzx) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j10 < this.zzt) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzB) {
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        zzG(j10, i10, (this.zza.zzf() - ((long) i11)) - ((long) i12), i11, zzaggVar);
    }

    @CallSuper
    public final void zzg(boolean z10) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z10) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    @CallSuper
    public final void zzk() throws IOException {
        zzth zzthVar = this.zzh;
        if (zzthVar != null) {
            throw zzthVar.zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r9 != 0) goto L19;
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzr(com.google.android.gms.internal.ads.zzlh r9, com.google.android.gms.internal.ads.zzih r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzxx r0 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r7 = r0
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3b
            boolean r9 = r10.zzb()
            if (r9 != 0) goto L3a
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L31
            if (r9 == 0) goto L2b
            com.google.android.gms.internal.ads.zzxw r9 = r8.zza
            r9.zzd(r10, r0)
            goto L3a
        L2b:
            com.google.android.gms.internal.ads.zzxw r9 = r8.zza
            r9.zzc(r10, r0)
            goto L34
        L31:
            if (r9 == 0) goto L34
            goto L3a
        L34:
            int r9 = r8.zzs
            int r9 = r9 + r1
            r8.zzs = r9
            return r12
        L3a:
            r9 = r12
        L3b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.zzr(com.google.android.gms.internal.ads.zzlh, com.google.android.gms.internal.ads.zzih, int, boolean):int");
    }

    public final void zzw(long j10, boolean z10, boolean z11) {
        this.zza.zze(zzD(j10, false, z11));
    }

    public final void zzx() {
        this.zza.zze(zzE());
    }

    public zzyb(zzaan zzaanVar, @Nullable zzto zztoVar, @Nullable zztj zztjVar) {
        this.zzd = zztoVar;
        this.zze = zztjVar;
        this.zza = new zzxw(zzaanVar);
    }

    @CallSuper
    public final void zzj() {
        zzx();
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        boolean zZzC = zzC(zzvVar);
        zzya zzyaVar = this.zzf;
        if (zzyaVar != null && zZzC) {
            zzyaVar.zzy(zzvVar);
        }
    }
}
