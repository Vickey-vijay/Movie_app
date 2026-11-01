package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final /* synthetic */ int zzg() {
        return this.zzb;
    }

    public final /* synthetic */ int zzh() {
        return this.zzh;
    }

    public final /* synthetic */ int zzi() {
        return this.zzj;
    }

    public final /* synthetic */ int zzj() {
        return this.zzk;
    }

    public final /* synthetic */ int zzk() {
        return this.zzl;
    }

    public final /* synthetic */ int zzl() {
        return this.zzm;
    }

    public final /* synthetic */ int zzm() {
        return this.zzn;
    }

    public final /* synthetic */ int zzn() {
        return this.zzp;
    }

    private final void zzo(int i10, int i11) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i11);
        Object objZzr = zzcrVar.zzr();
        Object objZzq = zzcrVar.zzq();
        int i12 = this.zzk;
        int i13 = this.zzb;
        System.arraycopy(objZzr, i10 * i13, objZzq, i12 * i13, i11 * i13);
        this.zzk += i11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    private final void zzp() {
        zzcr zzcrVar;
        int i10;
        int i11;
        int iZze;
        int iZze2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        int i19;
        long j10;
        long j11;
        float f11 = this.zzc;
        float f12 = this.zzd;
        double d10 = f11 / f12;
        int i20 = this.zzk;
        int i21 = 0;
        int i22 = 1;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i23 = this.zzj;
            int i24 = this.zzh;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.zzo;
                    if (i26 > 0) {
                        int iMin = Math.min(i24, i26);
                        zzo(i25, iMin);
                        this.zzo -= iMin;
                        i25 += iMin;
                        d10 = d10;
                        i20 = i20;
                    } else {
                        int i27 = this.zza;
                        int i28 = i27 > 4000 ? i27 / 4000 : i22;
                        int i29 = this.zzb;
                        if (i29 != i22) {
                            zzcrVar = this.zzi;
                            zzcrVar.zzd(i25, i28);
                            i10 = this.zzf;
                            i11 = this.zzg;
                            iZze = zzcrVar.zze(i21, i10 / i28, i11 / i28);
                            if (i28 != i22) {
                                int i30 = iZze * i28;
                                int i31 = i28 * 4;
                                i13 = i30 - i31;
                                if (i13 >= i10) {
                                    i10 = i13;
                                }
                                i14 = i30 + i31;
                                if (i14 <= i11) {
                                    i11 = i14;
                                }
                                if (i29 == i22) {
                                    iZze2 = zzcrVar.zzf(i25, i10, i11);
                                } else {
                                    zzcrVar.zzd(i25, i22);
                                    iZze2 = zzcrVar.zze(i21, i10, i11);
                                }
                            } else {
                                iZze2 = iZze;
                            }
                            i12 = i29;
                        } else if (i28 == i22) {
                            iZze2 = this.zzi.zzf(i25, this.zzf, this.zzg);
                            i12 = i22;
                        } else {
                            i29 = i22;
                            zzcrVar = this.zzi;
                            zzcrVar.zzd(i25, i28);
                            i10 = this.zzf;
                            i11 = this.zzg;
                            iZze = zzcrVar.zze(i21, i10 / i28, i11 / i28);
                            if (i28 != i22) {
                                int i32 = iZze * i28;
                                int i33 = i28 * 4;
                                i13 = i32 - i33;
                                if (i13 >= i10) {
                                    i10 = i13;
                                }
                                i14 = i32 + i33;
                                if (i14 <= i11) {
                                    i11 = i14;
                                }
                                if (i29 == i22) {
                                    iZze2 = zzcrVar.zzf(i25, i10, i11);
                                } else {
                                    zzcrVar.zzd(i25, i22);
                                    iZze2 = zzcrVar.zze(i21, i10, i11);
                                }
                            } else {
                                iZze2 = iZze;
                            }
                            i12 = i29;
                        }
                        zzcr zzcrVar2 = this.zzi;
                        int i34 = zzcrVar2.zzc() ? this.zzp : iZze2;
                        int i35 = i25 + i34;
                        zzcrVar2.zzi();
                        this.zzp = iZze2;
                        double d11 = i34;
                        if (d10 > 1.0d) {
                            double d12 = d10 - 1.0d;
                            if (d10 >= 2.0d) {
                                double d13 = (d11 / d12) + this.zzq;
                                int iRound = (int) Math.round(d13);
                                this.zzq = d13 - ((double) iRound);
                                i16 = iRound;
                            } else {
                                double d14 = ((d11 * (2.0d - d10)) / d12) + this.zzq;
                                int iRound2 = (int) Math.round(d14);
                                this.zzo = iRound2;
                                this.zzq = d14 - ((double) iRound2);
                                i16 = i34;
                            }
                            zzcrVar2.zzk(i16);
                            zzcrVar2.zzh(i16, i12, this.zzk, i25, i35);
                            this.zzk += i16;
                            i25 += i34 + i16;
                            d10 = d10;
                        } else {
                            int i36 = i34;
                            double d15 = 1.0d - d10;
                            if (d10 < 0.5d) {
                                double d16 = ((d11 * d10) / d15) + this.zzq;
                                int iRound3 = (int) Math.round(d16);
                                this.zzq = d16 - ((double) iRound3);
                                i15 = iRound3;
                            } else {
                                double d17 = ((d11 * ((d10 + d10) - 1.0d)) / d15) + this.zzq;
                                int iRound4 = (int) Math.round(d17);
                                this.zzo = iRound4;
                                this.zzq = d17 - ((double) iRound4);
                                i15 = i36;
                            }
                            int i37 = i36 + i15;
                            zzcrVar2.zzk(i37);
                            System.arraycopy(zzcrVar2.zzr(), i25 * i12, zzcrVar2.zzq(), this.zzk * i12, i36 * i12);
                            zzcrVar2.zzh(i15, i12, this.zzk + i36, i35, i25);
                            this.zzk += i37;
                            i25 += i15;
                        }
                    }
                    if (i25 + i24 > i23) {
                        break;
                    }
                    i20 = i20;
                    d10 = d10;
                    i21 = 0;
                    i22 = 1;
                }
                int i38 = this.zzj - i25;
                zzcr zzcrVar3 = this.zzi;
                int i39 = this.zzb;
                System.arraycopy(zzcrVar3.zzr(), i25 * i39, zzcrVar3.zzr(), 0, i39 * i38);
                this.zzj = i38;
            }
            f10 = this.zze * f12;
            if (f10 != 1.0f || this.zzk == (i17 = i20)) {
            }
            int i40 = this.zza;
            float f13 = i40 / f10;
            long j12 = i40;
            long j13 = (long) f13;
            while (j13 != 0 && j12 != 0 && j13 % 2 == 0 && j12 % 2 == 0) {
                j13 /= 2;
                j12 /= 2;
            }
            int i41 = this.zzk - i17;
            zzcr zzcrVar4 = this.zzi;
            zzcrVar4.zzl(i41);
            int i42 = this.zzb;
            System.arraycopy(zzcrVar4.zzq(), i17 * i42, zzcrVar4.zzp(), this.zzl * i42, i41 * i42);
            this.zzk = i17;
            this.zzl += i41;
            int i43 = 0;
            while (true) {
                i18 = this.zzl - 1;
                if (i43 >= i18) {
                    break;
                }
                while (true) {
                    i19 = this.zzm + 1;
                    j10 = i19;
                    long j14 = j10 * j13;
                    j11 = this.zzn;
                    if (j14 <= j11 * j12) {
                        break;
                    }
                    zzcrVar4.zzk(1);
                    zzcrVar4.zzb(i43, j12, j13);
                    this.zzn++;
                    this.zzk++;
                }
                this.zzm = i19;
                if (j10 == j12) {
                    this.zzm = 0;
                    zzgrc.zzi(j11 == j13);
                    this.zzn = 0;
                }
                i43++;
            }
            if (i18 != 0) {
                System.arraycopy(zzcrVar4.zzp(), i18 * i42, zzcrVar4.zzp(), 0, (this.zzl - i18) * i42);
                this.zzl -= i18;
                return;
            }
            return;
        }
        zzo(0, this.zzj);
        this.zzj = 0;
        i20 = i20;
        f10 = this.zze * f12;
        if (f10 != 1.0f) {
        }
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(iZza);
        zzcrVar.zzn(byteBuffer, iRemaining);
        this.zzj += iZza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgrc.zzi(this.zzk >= 0);
        int i10 = this.zzb;
        int iRemaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int iMin = Math.min(iRemaining / (zzcrVar.zza() * i10), this.zzk);
        zzcrVar.zzo(byteBuffer, iMin);
        this.zzk -= iMin;
        System.arraycopy(zzcrVar.zzq(), iMin * i10, zzcrVar.zzq(), 0, this.zzk * i10);
    }

    public final void zzd() {
        int i10 = this.zzj;
        int i11 = this.zzo;
        int i12 = this.zzk;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f10 / f11))) + ((double) i11)) + this.zzq) + ((double) this.zzl)) / ((double) (this.zze * f11))) + 0.5d));
        this.zzq = 0.0d;
        int i14 = this.zzh;
        int i15 = i14 + i14;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i10 + i15);
        zzcrVar.zzm(i10 * this.zzb, i15);
        this.zzj += i15;
        zzp();
        if (this.zzk > i13) {
            this.zzk = Math.max(i13, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final int zzf() {
        zzgrc.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    public zzct(int i10, int i11, float f10, float f11, int i12, boolean z10) {
        zzcr zzcsVar;
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        this.zzh = i13 + i13;
        if (z10) {
            zzcsVar = new zzcq(this);
        } else {
            zzcsVar = new zzcs(this);
        }
        this.zzi = zzcsVar;
    }
}
