package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakw implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private int zzA;

    @Nullable
    private zzahv zzB;
    private final zzamd zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzala zzi;
    private final List zzj;
    private zzguf zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;

    @Nullable
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaex zzx;
    private zzakv[] zzy;

    @Nullable
    private long[][] zzz;

    static {
        int i10 = zzaks.zza;
    }

    @Deprecated
    public zzakw() {
        this(zzamd.zza, 16);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private static int zzm(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzakw(zzamd zzamdVar, int i10) {
        this.zzb = zzamdVar;
        this.zzc = i10;
        this.zzk = zzguf.zzi();
        this.zzl = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzala();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaex.zza;
        this.zzy = new zzakv[0];
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206  */
    /* JADX WARN: Code duplicated, block: B:90:0x020d  */
    private final void zzk(long j10) throws zzat {
        zzap zzapVar;
        long j11;
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        zzagh zzaghVar;
        int i12;
        long j12;
        int i13;
        long j13;
        zzap zzapVar2;
        List list;
        zzap zzapVar3;
        char c10;
        int size;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfu) arrayDeque2.peek()).zza != j10) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque2.pop();
            if (zzfuVar.zzd == 1836019574) {
                zzfu zzfuVarZzd = zzfuVar.zzd(1835365473);
                new ArrayList();
                zzap zzapVarZze = zzfuVarZzd != null ? zzakh.zze(zzfuVarZzd) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.zzA == 1;
                zzafn zzafnVar = new zzafn();
                zzfv zzfvVarZzc = zzfuVar.zzc(1969517665);
                if (zzfvVarZzc != null) {
                    zzap zzapVarZzc = zzakh.zzc(zzfvVarZzc);
                    zzafnVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfv zzfvVarZzc2 = zzfuVar.zzc(1836476516);
                zzfvVarZzc2.getClass();
                zzap zzapVar4 = new zzap(-9223372036854775807L, zzakh.zzd(zzfvVarZzc2.zza));
                int i14 = this.zzc;
                ArrayList arrayList3 = arrayList2;
                long j14 = -9223372036854775807L;
                zzafn zzafnVar2 = zzafnVar;
                List listZzb = zzakh.zzb(zzfuVar, zzafnVar, -9223372036854775807L, null, 1 == (i14 & 1), z10, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzakt
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        zzalc zzalcVar = (zzalc) obj;
                        int i15 = zzakw.zza;
                        return zzalcVar;
                    }
                }, false);
                String strZza = zzakr.zza(listZzb);
                long j15 = -9223372036854775807L;
                int i15 = 0;
                int i16 = 0;
                int i17 = -1;
                while (true) {
                    j11 = 0;
                    if (i15 >= listZzb.size()) {
                        break;
                    }
                    zzalf zzalfVar = (zzalf) listZzb.get(i15);
                    int i18 = zzalfVar.zzb;
                    if (i18 == 0) {
                        arrayDeque = arrayDeque2;
                        i11 = i15;
                        i10 = i16;
                        size = i17;
                        j13 = j14;
                        arrayList = arrayList3;
                        zzafnVar2 = zzafnVar2;
                    } else {
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = this.zzx;
                        int i19 = i16 + 1;
                        int i20 = zzalcVar.zzb;
                        zzakv zzakvVar = new zzakv(zzalcVar, zzalfVar, zzaexVar.zzu(i16, i20));
                        long j16 = zzalcVar.zze;
                        if (j16 == -9223372036854775807L) {
                            j16 = zzalfVar.zzi;
                        }
                        i10 = i19;
                        zzagh zzaghVar2 = zzakvVar.zzc;
                        zzaghVar2.zzN(j16);
                        long jMax = Math.max(j15, j16);
                        zzv zzvVar = zzalcVar.zzg;
                        String str = zzvVar.zzo;
                        int i21 = "audio/true-hd".equals(str) ? zzalfVar.zze * 16 : zzalfVar.zze + 30;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(i21);
                        if (i20 == 2) {
                            int i22 = zzvVar.zzf;
                            if ((i14 & 8) != 0) {
                                i22 |= i17 == -1 ? 1 : 2;
                            }
                            zztVarZza.zzg(i22);
                            i20 = 2;
                        }
                        if (zzas.zzb(str)) {
                            boolean z11 = zzalfVar.zzj;
                            arrayDeque = arrayDeque2;
                            i11 = i15;
                            int iMin = Math.min(!z11 ? zzalfVar.zzh.length : i18, 20);
                            zzgrc.zzi(j16 != -9223372036854775807L);
                            zzaghVar = zzaghVar2;
                            long jMin = Math.min(j16, 10000000L);
                            i12 = i17;
                            int i23 = 0;
                            int i24 = -1;
                            int i25 = 0;
                            while (i25 < iMin) {
                                int i26 = z11 ? i25 : zzalfVar.zzh[i25];
                                long j17 = zzalfVar.zzf[i26];
                                if (j17 > jMin) {
                                    break;
                                }
                                if (j17 >= 0 && (i13 = zzalfVar.zzd[i26]) > i23) {
                                    i24 = i26;
                                    i23 = i13;
                                }
                                i25++;
                                iMin = iMin;
                                z11 = z11;
                            }
                            if (i24 != -1) {
                                j12 = zzalfVar.zzf[i24];
                            }
                            j13 = -9223372036854775807L;
                            if (j12 != -9223372036854775807L) {
                                zzapVar2 = new zzap(-9223372036854775807L, new zzahx(j12));
                            } else {
                                zzapVar2 = null;
                            }
                            zzakq.zzb(i20, zzafnVar2, zztVarZza);
                            zzap zzapVar5 = zzvVar.zzl;
                            list = this.zzj;
                            zzap[] zzapVarArr = new zzap[4];
                            if (list.isEmpty()) {
                                c10 = 0;
                                zzapVar3 = null;
                            } else {
                                zzapVar3 = new zzap(list);
                                c10 = 0;
                            }
                            zzapVarArr[c10] = zzapVar3;
                            zzapVarArr[1] = zzapVar;
                            zzapVarArr[2] = zzapVar4;
                            zzapVarArr[3] = zzapVar2;
                            zzakq.zza(i20, zzapVarZze, zztVarZza, zzapVar5, zzapVarArr);
                            zztVarZza.zzl(strZza);
                            if (Objects.equals(str, "audio/mpeg")) {
                                zzakvVar.zzf = zztVarZza.zzM();
                            } else {
                                zzaghVar.zzz(zztVarZza.zzM());
                            }
                            int i27 = i12;
                            size = (i20 == 2 || i27 != -1) ? i27 : arrayList3.size();
                            arrayList = arrayList3;
                            arrayList.add(zzakvVar);
                            j15 = jMax;
                        } else {
                            arrayDeque = arrayDeque2;
                            i11 = i15;
                            zzaghVar = zzaghVar2;
                            i12 = i17;
                        }
                        j12 = -9223372036854775807L;
                        j13 = -9223372036854775807L;
                        if (j12 != -9223372036854775807L) {
                            zzapVar2 = new zzap(-9223372036854775807L, new zzahx(j12));
                        } else {
                            zzapVar2 = null;
                        }
                        zzakq.zzb(i20, zzafnVar2, zztVarZza);
                        zzap zzapVar6 = zzvVar.zzl;
                        list = this.zzj;
                        zzap[] zzapVarArr2 = new zzap[4];
                        if (list.isEmpty()) {
                            c10 = 0;
                            zzapVar3 = null;
                        } else {
                            zzapVar3 = new zzap(list);
                            c10 = 0;
                        }
                        zzapVarArr2[c10] = zzapVar3;
                        zzapVarArr2[1] = zzapVar;
                        zzapVarArr2[2] = zzapVar4;
                        zzapVarArr2[3] = zzapVar2;
                        zzakq.zza(i20, zzapVarZze, zztVarZza, zzapVar6, zzapVarArr2);
                        zztVarZza.zzl(strZza);
                        if (Objects.equals(str, "audio/mpeg")) {
                            zzakvVar.zzf = zztVarZza.zzM();
                        } else {
                            zzaghVar.zzz(zztVarZza.zzM());
                        }
                        int i28 = i12;
                        if (i20 == 2) {
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzakvVar);
                        j15 = jMax;
                    }
                    zzafnVar2 = zzafnVar2;
                    j14 = j13;
                    arrayList3 = arrayList;
                    i16 = i10;
                    arrayDeque2 = arrayDeque;
                    i15 = i11 + 1;
                    i17 = size;
                    listZzb = listZzb;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i29 = i17;
                int i30 = -1;
                zzakv[] zzakvVarArr = (zzakv[]) arrayList3.toArray(new zzakv[0]);
                this.zzy = zzakvVarArr;
                int length = zzakvVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i31 = 0; i31 < zzakvVarArr.length; i31++) {
                    jArr[i31] = new long[zzakvVarArr[i31].zzb.zzb];
                    jArr2[i31] = zzakvVarArr[i31].zzb.zzf[0];
                }
                int i32 = 0;
                int i33 = 0;
                while (i33 < zzakvVarArr.length) {
                    long j18 = Long.MAX_VALUE;
                    int i34 = i30;
                    for (int i35 = i32; i35 < zzakvVarArr.length; i35++) {
                        if (!zArr[i35]) {
                            long j19 = jArr2[i35];
                            if (j19 <= j18) {
                                i34 = i35;
                                j18 = j19;
                            }
                        }
                    }
                    int i36 = iArr[i34];
                    long[] jArr3 = jArr[i34];
                    jArr3[i36] = j11;
                    zzalf zzalfVar2 = zzakvVarArr[i34].zzb;
                    int i37 = i34;
                    j11 += (long) zzalfVar2.zzd[i36];
                    int i38 = i36 + 1;
                    iArr[i37] = i38;
                    if (i38 < jArr3.length) {
                        jArr2[i37] = zzalfVar2.zzf[i38];
                    } else {
                        zArr[i37] = true;
                        i33++;
                    }
                    i30 = -1;
                    i32 = 0;
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(new zzaku(j15, this.zzy, i29));
                arrayDeque3.clear();
                this.zzl = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfu) arrayDeque2.peek()).zzb(zzfuVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzagcVarZzb = zzalb.zzb(zzaevVar, (this.zzc & 2) != 0);
        this.zzk = zzagcVarZzb != null ? zzguf.zzj(zzagcVarZzb) : zzguf.zzi();
        return zzagcVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if ((this.zzc & 16) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzb);
        }
        this.zzx = zzaexVar;
    }

    /* JADX WARN: Code duplicated, block: B:312:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i10;
        int iZzc;
        boolean z10;
        boolean z11;
        while (true) {
            int i11 = this.zzl;
            if (i11 == 0) {
                if (this.zzo == 0) {
                    zzer zzerVar = this.zzg;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzagh zzaghVarZzu = this.zzx.zzu(0, 4);
                        zzahv zzahvVar = this.zzB;
                        zzap zzapVar = zzahvVar == null ? null : new zzap(-9223372036854775807L, zzahvVar);
                        zzt zztVar = new zzt();
                        zztVar.zzk(zzapVar);
                        zzaghVarZzu.zzz(zztVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzafx(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzerVar.zzh(0);
                    this.zzn = zzerVar.zzz();
                    this.zzm = zzerVar.zzB();
                }
                long j10 = this.zzn;
                if (j10 == 1) {
                    zzer zzerVar2 = this.zzg;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzerVar2.zzJ();
                } else if (j10 == 0) {
                    long jZzo = zzaevVar.zzo();
                    if (jZzo == -1) {
                        zzfu zzfuVar = (zzfu) this.zzh.peek();
                        jZzo = zzfuVar != null ? zzfuVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzn = (jZzo - zzaevVar.zzn()) + ((long) this.zzo);
                    }
                }
                long j11 = this.zzn;
                int i12 = this.zzo;
                long j12 = i12;
                if (j11 < j12) {
                    if (this.zzm != 1718773093 || i12 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzn = j12;
                    i12 = 8;
                }
                int i13 = this.zzm;
                if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069) {
                    long jZzn = zzaevVar.zzn();
                    long j13 = this.zzn;
                    long j14 = jZzn + j13;
                    long j15 = this.zzo;
                    if (j13 != j15 && this.zzm == 1835365473) {
                        zzer zzerVar3 = this.zzf;
                        zzerVar3.zza(8);
                        zzaevVar.zzi(zzerVar3.zzi(), 0, 8);
                        zzakh.zzf(zzerVar3);
                        zzaevVar.zzf(zzerVar3.zzg());
                        zzaevVar.zzl();
                    }
                    long j16 = j14 - j15;
                    this.zzh.push(new zzfu(this.zzm, j16));
                    if (this.zzn == this.zzo) {
                        zzk(j16);
                    } else {
                        zzj();
                    }
                } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                    zzgrc.zzi(i12 == 8);
                    zzgrc.zzi(this.zzn <= 2147483647L);
                    zzer zzerVar4 = new zzer((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzerVar4.zzi(), 0, 8);
                    this.zzp = zzerVar4;
                    this.zzl = 1;
                } else {
                    long jZzn2 = zzaevVar.zzn();
                    long j17 = this.zzo;
                    long j18 = jZzn2 - j17;
                    if (this.zzm == 1836086884) {
                        this.zzB = new zzahv(0L, j18, -9223372036854775807L, j18 + j17, this.zzn - j17);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        this.zzi.zzb(zzaevVar, zzafvVar, this.zzj);
                        if (zzafvVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long jZzn3 = zzaevVar.zzn();
                    int i14 = this.zzq;
                    if (i14 == -1) {
                        int i15 = -1;
                        int i16 = -1;
                        boolean z12 = true;
                        boolean z13 = true;
                        long j19 = Long.MAX_VALUE;
                        long j20 = Long.MAX_VALUE;
                        long j21 = Long.MAX_VALUE;
                        int i17 = 0;
                        while (true) {
                            zzakv[] zzakvVarArr = this.zzy;
                            if (i17 >= zzakvVarArr.length) {
                                break;
                            }
                            zzakv zzakvVar = zzakvVarArr[i17];
                            int i18 = zzakvVar.zze;
                            zzalf zzalfVar = zzakvVar.zzb;
                            if (i18 != zzalfVar.zzb) {
                                long j22 = zzalfVar.zzc[i18];
                                long[][] jArr = this.zzz;
                                jArr.getClass();
                                long j23 = jArr[i17][i18];
                                long j24 = j22 - jZzn3;
                                boolean z14 = j24 < 0 || j24 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z14) {
                                    z10 = z13;
                                } else {
                                    if (z13) {
                                        z13 = z14;
                                        i16 = i17;
                                        j21 = j24;
                                        j20 = j23;
                                    } else {
                                        z10 = false;
                                    }
                                    if (j23 < j19) {
                                        z12 = z14;
                                        i15 = i17;
                                        j19 = j23;
                                    }
                                }
                                if (z14 != z10 || j24 >= j21) {
                                    z13 = z10;
                                } else {
                                    z13 = z14;
                                    i16 = i17;
                                    j21 = j24;
                                    j20 = j23;
                                }
                                if (j23 < j19) {
                                    z12 = z14;
                                    i15 = i17;
                                    j19 = j23;
                                }
                            }
                            i17++;
                        }
                        i14 = (j19 == Long.MAX_VALUE || !z12 || j20 < j19 + 10485760) ? i16 : i15;
                        this.zzq = i14;
                        if (i14 == -1) {
                            return -1;
                        }
                    }
                    zzakv zzakvVar2 = this.zzy[i14];
                    zzagh zzaghVar = zzakvVar2.zzc;
                    int i19 = zzakvVar2.zze;
                    zzalf zzalfVar2 = zzakvVar2.zzb;
                    long j25 = zzalfVar2.zzc[i19] + this.zzw;
                    int[] iArr = zzalfVar2.zzd;
                    int i20 = iArr[i19];
                    zzagi zzagiVar = zzakvVar2.zzd;
                    long j26 = (j25 - jZzn3) + ((long) this.zzr);
                    if (j26 < 0 || j26 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzafvVar.zza = j25;
                        return 1;
                    }
                    zzalc zzalcVar = zzakvVar2.zza;
                    if (zzalcVar.zzh == 1) {
                        j26 += 8;
                        i20 -= 8;
                    }
                    int i21 = i20;
                    zzaevVar.zzf((int) j26);
                    zzv zzvVar = zzalcVar.zzg;
                    String str = zzvVar.zzo;
                    if (!Objects.equals(str, "video/avc")) {
                        Objects.equals(str, "video/hevc");
                    }
                    this.zzu = true;
                    int i22 = zzalcVar.zzk;
                    if (i22 == 0) {
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                zzer zzerVar5 = this.zzf;
                                zzady.zzc(i21, zzerVar5);
                                zzaghVar.zzc(zzerVar5, 7);
                                this.zzs += 7;
                            }
                            i21 += 7;
                        } else if (zzakvVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVarZzM = zzakvVar2.zzf;
                            zzer zzerVar6 = this.zzf;
                            zzerVar6.zza(4);
                            zzaevVar.zzi(zzerVar6.zzi(), 0, 4);
                            zzaevVar.zzl();
                            zzafr zzafrVar = new zzafr();
                            if (zzafrVar.zza(zzerVar6.zzB()) && !Objects.equals(zzvVarZzM.zzo, zzafrVar.zzb)) {
                                zzt zztVarZza = zzvVarZzM.zza();
                                String str2 = zzafrVar.zzb;
                                str2.getClass();
                                zztVarZza.zzm(str2);
                                zzvVarZzM = zztVarZza.zzM();
                            }
                            zzaghVar.zzz(zzvVarZzM);
                            zzakvVar2.zzf = null;
                        } else if (zzagiVar != null) {
                            zzagiVar.zzb(zzaevVar);
                        }
                        while (true) {
                            int i23 = this.zzs;
                            if (i23 >= i21) {
                                break;
                            }
                            int iZza = zzaghVar.zza(zzaevVar, i21 - i23, false);
                            this.zzr += iZza;
                            this.zzs += iZza;
                            this.zzt -= iZza;
                        }
                    } else {
                        zzer zzerVar7 = this.zze;
                        byte[] bArrZzi = zzerVar7.zzi();
                        bArrZzi[0] = 0;
                        bArrZzi[1] = 0;
                        bArrZzi[2] = 0;
                        int i24 = 4 - i22;
                        i21 += i24;
                        while (this.zzs < i21) {
                            int i25 = this.zzt;
                            if (i25 == 0) {
                                if (this.zzu || zzgm.zzc(zzvVar) + i22 > iArr[i19] - this.zzr) {
                                    i10 = i22;
                                    iZzc = 0;
                                } else {
                                    iZzc = zzgm.zzc(zzvVar);
                                    i10 = i22 + iZzc;
                                }
                                zzaevVar.zzc(bArrZzi, i24, i10);
                                int i26 = i22;
                                this.zzr += i10;
                                zzerVar7.zzh(0);
                                int iZzB = zzerVar7.zzB();
                                if (iZzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = iZzB - iZzc;
                                zzer zzerVar8 = this.zzd;
                                zzerVar8.zzh(0);
                                zzaghVar.zzc(zzerVar8, 4);
                                this.zzs += 4;
                                if (iZzc > 0) {
                                    zzaghVar.zzc(zzerVar7, iZzc);
                                    this.zzs += iZzc;
                                    if (zzgm.zzd(bArrZzi, 4, iZzc, zzvVar)) {
                                        this.zzu = true;
                                    }
                                }
                                i22 = i26;
                            } else {
                                int iZza2 = zzaghVar.zza(zzaevVar, i25, false);
                                this.zzr += iZza2;
                                this.zzs += iZza2;
                                this.zzt -= iZza2;
                            }
                        }
                    }
                    long j27 = zzalfVar2.zzf[i19];
                    int i27 = zzalfVar2.zzg[i19];
                    if (!this.zzu) {
                        i27 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if (zzagiVar != null) {
                        zzagiVar.zzc(zzaghVar, j27, i27, i21, 0, null);
                        if (i19 + 1 == zzalfVar2.zzb) {
                            zzagiVar.zzd(zzaghVar, null);
                        }
                    } else {
                        zzaghVar.zze(j27, i27, i21, 0, null);
                    }
                    zzakvVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j28 = this.zzn - ((long) this.zzo);
                long jZzn4 = zzaevVar.zzn() + j28;
                zzer zzerVar9 = this.zzp;
                if (zzerVar9 != null) {
                    zzaevVar.zzc(zzerVar9.zzi(), this.zzo, (int) j28);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzerVar9.zzh(8);
                        int iZzm = zzm(zzerVar9.zzB());
                        if (iZzm == 0) {
                            zzerVar9.zzk(4);
                            do {
                                if (zzerVar9.zzd() <= 0) {
                                    iZzm = 0;
                                    break;
                                }
                                iZzm = zzm(zzerVar9.zzB());
                            } while (iZzm == 0);
                        }
                        this.zzA = iZzm;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfu) arrayDeque.peek()).zza(new zzfv(this.zzm, zzerVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j28 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzaevVar.zzf((int) j28);
                    } else {
                        zzafvVar.zza = zzaevVar.zzn() + j28;
                        z11 = true;
                    }
                    zzk(jZzn4);
                    if (z11 && this.zzl != 2) {
                        return 1;
                    }
                }
                z11 = false;
                zzk(jZzn4);
                if (z11) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j10 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzakv zzakvVar : this.zzy) {
            zzalf zzalfVar = zzakvVar.zzb;
            int iZza = zzalfVar.zza(j11);
            if (iZza == -1) {
                iZza = zzalfVar.zzb(j11);
            }
            zzakvVar.zze = iZza;
            zzagi zzagiVar = zzakvVar.zzd;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
        }
    }

    public static /* synthetic */ long zzh(zzalf zzalfVar, long j10, long j11) {
        int iZzl = zzl(zzalfVar, j10);
        if (iZzl == -1) {
            return j11;
        }
        return Math.min(zzalfVar.zzc[iZzl], j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzalf zzalfVar, long j10) {
        int iZza = zzalfVar.zza(j10);
        if (iZza == -1) {
            return zzalfVar.zzb(j10);
        }
        return iZza;
    }
}
