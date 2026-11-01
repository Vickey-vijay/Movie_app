package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidf<T> implements zzidu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziem.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzidc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzief zzm;
    private final zzibc zzn;

    private zzidf(int[] iArr, Object[] objArr, int i10, int i11, zzidc zzidcVar, boolean z10, int[] iArr2, int i12, int i13, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzidcVar instanceof zzibr;
        boolean z11 = false;
        if (zzibcVar != null && (zzidcVar instanceof zzibn)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zziefVar;
        this.zzn = zzibcVar;
        this.zzg = zzidcVar;
    }

    private static int zzC(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean zzD(int i10) {
        return (i10 & 536870912) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            long j10 = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zziem.zzl(obj, j10)) != Double.doubleToLongBits(zziem.zzl(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zziem.zzj(obj, j10)) != Float.floatToIntBits(zziem.zzj(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zziem.zzh(obj, j10) != zziem.zzh(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzG = zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10));
                    break;
                case 50:
                    zZzG = zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzB = zzB(i10) & 1048575;
                    if (zziem.zzd(obj, jZzB) != zziem.zzd(obj2, jZzB) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzibr) obj).zzt.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i12);
            int i14 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zziem.zzl(obj, j10));
                    Charset charset = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zziem.zzj(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset2 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset3 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset4 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzice.zzb(zziem.zzh(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zziem.zzn(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzn = zziem.zzn(obj, j10);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset5 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset6 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzn2 = zziem.zzn(obj, j10);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j10));
                        Charset charset7 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset8 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset9 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset10 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzice.zzb(zzK(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zziem.zzn(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset11 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset12 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x051c  */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzg(Object obj, zzidp zzidpVar, zzibb zzibbVar) throws IOException {
        Object objZzx;
        zzibbVar.getClass();
        zzF(obj);
        zzief zziefVar = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzidpVar.zzb();
                int iZzR = zzR(iZzb);
                if (iZzR >= 0) {
                    int iZzA = zzA(iZzR);
                    try {
                        switch (zzC(iZzA)) {
                            case 0:
                                zziem.zzm(obj, iZzA & 1048575, zzidpVar.zze());
                                zzO(obj, iZzR);
                                continue;
                            case 1:
                                zziem.zzk(obj, iZzA & 1048575, zzidpVar.zzf());
                                zzO(obj, iZzR);
                                continue;
                            case 2:
                                zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzh());
                                zzO(obj, iZzR);
                                continue;
                            case 3:
                                zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzg());
                                zzO(obj, iZzR);
                                continue;
                            case 4:
                                zziem.zze(obj, iZzA & 1048575, zzidpVar.zzi());
                                zzO(obj, iZzR);
                                continue;
                            case 5:
                                zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzj());
                                zzO(obj, iZzR);
                                continue;
                            case 6:
                                zziem.zze(obj, iZzA & 1048575, zzidpVar.zzk());
                                zzO(obj, iZzR);
                                continue;
                            case 7:
                                zziem.zzi(obj, iZzA & 1048575, zzidpVar.zzl());
                                zzO(obj, iZzR);
                                continue;
                            case 8:
                                zzz(obj, iZzA, zzidpVar);
                                zzO(obj, iZzR);
                                continue;
                            case 9:
                                zzidc zzidcVar = (zzidc) zzt(obj, iZzR);
                                zzidpVar.zzo(zzidcVar, zzq(iZzR), zzibbVar);
                                zzu(obj, iZzR, zzidcVar);
                                continue;
                            case 10:
                                zziem.zzo(obj, iZzA & 1048575, zzidpVar.zzq());
                                zzO(obj, iZzR);
                                continue;
                            case 11:
                                zziem.zze(obj, iZzA & 1048575, zzidpVar.zzr());
                                zzO(obj, iZzR);
                                continue;
                            case 12:
                                int iZzs = zzidpVar.zzs();
                                zzibx zzibxVarZzs = zzs(iZzR);
                                if (zzibxVarZzs == null || zzibxVarZzs.zza(iZzs)) {
                                    zziem.zze(obj, iZzA & 1048575, iZzs);
                                    zzO(obj, iZzR);
                                    continue;
                                } else {
                                    objZzh = zzidw.zzK(obj, iZzb, iZzs, objZzh, zziefVar);
                                }
                                break;
                            case 13:
                                zziem.zze(obj, iZzA & 1048575, zzidpVar.zzt());
                                zzO(obj, iZzR);
                                continue;
                            case 14:
                                zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzu());
                                zzO(obj, iZzR);
                                continue;
                            case 15:
                                zziem.zze(obj, iZzA & 1048575, zzidpVar.zzv());
                                zzO(obj, iZzR);
                                continue;
                            case 16:
                                zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzw());
                                zzO(obj, iZzR);
                                continue;
                            case 17:
                                zzidc zzidcVar2 = (zzidc) zzt(obj, iZzR);
                                zzidpVar.zzp(zzidcVar2, zzq(iZzR), zzibbVar);
                                zzu(obj, iZzR, zzidcVar2);
                                continue;
                            case 18:
                                zzidpVar.zzx(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 19:
                                zzidpVar.zzy(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 20:
                                zzidpVar.zzA(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 21:
                                zzidpVar.zzz(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 22:
                                zzidpVar.zzB(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 23:
                                zzidpVar.zzC(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 24:
                                zzidpVar.zzD(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 25:
                                zzidpVar.zzE(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 26:
                                if (zzD(iZzA)) {
                                    ((zziar) zzidpVar).zzF(zzico.zza(obj, iZzA & 1048575), true);
                                } else {
                                    ((zziar) zzidpVar).zzF(zzico.zza(obj, iZzA & 1048575), false);
                                    continue;
                                }
                                break;
                            case 27:
                                zzidpVar.zzG(zzico.zza(obj, iZzA & 1048575), zzq(iZzR), zzibbVar);
                                continue;
                            case 28:
                                zzidpVar.zzI(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 29:
                                zzidpVar.zzJ(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 30:
                                List listZza = zzico.zza(obj, iZzA & 1048575);
                                zzidpVar.zzK(listZza);
                                objZzh = zzidw.zzJ(obj, iZzb, listZza, zzs(iZzR), objZzh, zziefVar);
                                continue;
                            case 31:
                                zzidpVar.zzL(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 32:
                                zzidpVar.zzM(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 33:
                                zzidpVar.zzN(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 34:
                                zzidpVar.zzO(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 35:
                                zzidpVar.zzx(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 36:
                                zzidpVar.zzy(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 37:
                                zzidpVar.zzA(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 38:
                                zzidpVar.zzz(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 39:
                                zzidpVar.zzB(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 40:
                                zzidpVar.zzC(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 41:
                                zzidpVar.zzD(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 42:
                                zzidpVar.zzE(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 43:
                                zzidpVar.zzJ(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 44:
                                List listZza2 = zzico.zza(obj, iZzA & 1048575);
                                zzidpVar.zzK(listZza2);
                                objZzh = zzidw.zzJ(obj, iZzb, listZza2, zzs(iZzR), objZzh, zziefVar);
                                continue;
                            case 45:
                                zzidpVar.zzL(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 46:
                                zzidpVar.zzM(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 47:
                                zzidpVar.zzN(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 48:
                                zzidpVar.zzO(zzico.zza(obj, iZzA & 1048575));
                                continue;
                            case 49:
                                zzidpVar.zzH(zzico.zza(obj, iZzA & 1048575), zzq(iZzR), zzibbVar);
                                continue;
                            case 50:
                                Object objZzr = zzr(iZzR);
                                long jZzA = zzA(iZzR) & 1048575;
                                Object objZzn = zziem.zzn(obj, jZzA);
                                if (objZzn == null) {
                                    objZzn = zzicw.zza().zzc();
                                    zziem.zzo(obj, jZzA, objZzn);
                                } else if (zzicx.zza(objZzn)) {
                                    Object objZzc = zzicw.zza().zzc();
                                    zzicx.zzb(objZzc, objZzn);
                                    zziem.zzo(obj, jZzA, objZzc);
                                    objZzn = objZzc;
                                }
                                zzidpVar.zzP((zzicw) objZzn, ((zzicv) objZzr).zze(), zzibbVar);
                                continue;
                            case 51:
                                zziem.zzo(obj, iZzA & 1048575, Double.valueOf(zzidpVar.zze()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 52:
                                zziem.zzo(obj, iZzA & 1048575, Float.valueOf(zzidpVar.zzf()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 53:
                                zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzh()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 54:
                                zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzg()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 55:
                                zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzi()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 56:
                                zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzj()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 57:
                                zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzk()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 58:
                                zziem.zzo(obj, iZzA & 1048575, Boolean.valueOf(zzidpVar.zzl()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 59:
                                zzz(obj, iZzA, zzidpVar);
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 60:
                                zzidc zzidcVar3 = (zzidc) zzv(obj, iZzb, iZzR);
                                zzidpVar.zzo(zzidcVar3, zzq(iZzR), zzibbVar);
                                zzw(obj, iZzb, iZzR, zzidcVar3);
                                continue;
                            case 61:
                                zziem.zzo(obj, iZzA & 1048575, zzidpVar.zzq());
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 62:
                                zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzr()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 63:
                                int iZzs2 = zzidpVar.zzs();
                                zzibx zzibxVarZzs2 = zzs(iZzR);
                                if (zzibxVarZzs2 == null || zzibxVarZzs2.zza(iZzs2)) {
                                    zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(iZzs2));
                                    zzQ(obj, iZzb, iZzR);
                                    continue;
                                } else {
                                    objZzh = zzidw.zzK(obj, iZzb, iZzs2, objZzh, zziefVar);
                                }
                                break;
                            case 64:
                                zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzt()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 65:
                                zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzu()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 66:
                                zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzv()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 67:
                                zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzw()));
                                zzQ(obj, iZzb, iZzR);
                                continue;
                            case 68:
                                zzidc zzidcVar4 = (zzidc) zzv(obj, iZzb, iZzR);
                                zzidpVar.zzp(zzidcVar4, zzq(iZzR), zzibbVar);
                                zzw(obj, iZzb, iZzR, zzidcVar4);
                                continue;
                            default:
                                if (objZzh == null) {
                                    objZzh = zziefVar.zzh(obj);
                                }
                                if (!zziefVar.zzk(objZzh, zzidpVar, 0)) {
                                    objZzx = objZzh;
                                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                        objZzx = zzx(obj, this.zzj[i10], objZzx, zziefVar, obj);
                                    }
                                }
                                break;
                        }
                    } catch (zzicf unused) {
                        if (objZzh == null) {
                            objZzh = zziefVar.zzh(obj);
                        }
                        if (!zziefVar.zzk(objZzh, zzidpVar, 0)) {
                            objZzx = objZzh;
                            for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                                objZzx = zzx(obj, this.zzj[i11], objZzx, zziefVar, obj);
                            }
                            if (objZzx != null) {
                                zziefVar.zzi(obj, objZzx);
                            }
                        }
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx = objZzh;
                    for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                        objZzx = zzx(obj, this.zzj[i12], objZzx, zziefVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzibbVar.zzc(this.zzg, iZzb)) != null) {
                        throw null;
                    }
                    if (objZzh == null) {
                        objZzh = zziefVar.zzh(obj);
                    }
                    if (!zziefVar.zzk(objZzh, zzidpVar, 0)) {
                        objZzx = objZzh;
                        for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                            objZzx = zzx(obj, this.zzj[i13], objZzx, zziefVar, obj);
                        }
                    }
                }
            } catch (Throwable th2) {
                Object objZzx2 = objZzh;
                for (int i14 = this.zzk; i14 < this.zzl; i14++) {
                    objZzx2 = zzx(obj, this.zzj[i14], objZzx2, zziefVar, obj);
                }
                if (objZzx2 != null) {
                    zziefVar.zzi(obj, objZzx2);
                }
                throw th2;
            }
        }
        if (objZzx != null) {
            zziefVar.zzi(obj, objZzx);
        }
    }

    /* JADX WARN: Code duplicated, block: B:526:0x0db3 A[PHI: r0 r8 r10 r11 r14 r20 r21 r31
  0x0db3: PHI (r0v211 int) = 
  (r0v178 int)
  (r0v179 int)
  (r0v180 int)
  (r0v181 int)
  (r0v182 int)
  (r0v183 int)
  (r0v184 int)
  (r0v185 int)
  (r0v188 int)
  (r0v198 int)
  (r0v212 int)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r8v112 int) = 
  (r8v90 int)
  (r8v91 int)
  (r8v92 int)
  (r8v93 int)
  (r8v94 int)
  (r8v95 int)
  (r8v96 int)
  (r8v97 int)
  (r8v98 int)
  (r8v103 int)
  (r8v113 int)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r10v60 sun.misc.Unsafe) = 
  (r10v37 sun.misc.Unsafe)
  (r10v38 sun.misc.Unsafe)
  (r10v39 sun.misc.Unsafe)
  (r10v40 sun.misc.Unsafe)
  (r10v41 sun.misc.Unsafe)
  (r10v42 sun.misc.Unsafe)
  (r10v43 sun.misc.Unsafe)
  (r10v44 sun.misc.Unsafe)
  (r10v45 sun.misc.Unsafe)
  (r10v50 sun.misc.Unsafe)
  (r10v61 sun.misc.Unsafe)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r11v84 java.lang.Object) = 
  (r11v61 java.lang.Object)
  (r11v62 java.lang.Object)
  (r11v63 java.lang.Object)
  (r11v64 java.lang.Object)
  (r11v65 java.lang.Object)
  (r11v66 java.lang.Object)
  (r11v67 java.lang.Object)
  (r11v68 java.lang.Object)
  (r11v70 java.lang.Object)
  (r11v79 java.lang.Object)
  (r11v85 java.lang.Object)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r14v90 'this' com.google.android.gms.internal.ads.zzidf<T>) = 
  (r14v70 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v71 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v72 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v73 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v74 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v75 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v76 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v77 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v78 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v82 'this' com.google.android.gms.internal.ads.zzidf<T>)
  (r14v91 'this' com.google.android.gms.internal.ads.zzidf<T>)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r20v38 java.lang.String) = 
  (r20v16 java.lang.String)
  (r20v17 java.lang.String)
  (r20v18 java.lang.String)
  (r20v19 java.lang.String)
  (r20v20 java.lang.String)
  (r20v21 java.lang.String)
  (r20v22 java.lang.String)
  (r20v23 java.lang.String)
  (r20v24 java.lang.String)
  (r20v29 java.lang.String)
  (r20v39 java.lang.String)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r21v38 int) = 
  (r21v30 int)
  (r21v30 int)
  (r21v30 int)
  (r21v30 int)
  (r21v30 int)
  (r21v30 int)
  (r21v30 int)
  (r21v30 int)
  (r21v31 int)
  (r21v35 int)
  (r21v30 int)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
  0x0db3: PHI (r31v44 int) = 
  (r31v26 int)
  (r31v27 int)
  (r31v28 int)
  (r31v29 int)
  (r31v30 int)
  (r31v31 int)
  (r31v32 int)
  (r31v33 int)
  (r31v34 int)
  (r31v38 int)
  (r31v45 int)
 binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:528:0x0db6  */
    /* JADX WARN: Code duplicated, block: B:529:0x0dc9  */
    /* JADX WARN: Code duplicated, block: B:542:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:606:0x09a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int zzi(Object obj, byte[] bArr, int i10, int i11, int i12, zziab zziabVar) throws IOException {
        String str;
        Unsafe unsafe;
        int i13;
        Object obj2;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzb;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zziab zziabVar2;
        byte b10;
        zzidf<T> zzidfVar;
        int i23;
        int i24;
        int i25;
        int iZzc;
        int i26;
        byte b11;
        zziab zziabVar3;
        int i27;
        int i28;
        Unsafe unsafe2;
        String str2;
        int i29;
        zzidf<T> zzidfVar2;
        int i30;
        int i31;
        String str3;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int iZzl;
        int iZza;
        int i40;
        int iZzc2;
        zzidf<T> zzidfVar3;
        Object obj3;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        Unsafe unsafe3;
        Object obj4;
        int i46;
        int i47;
        zzidf<T> zzidfVar4 = this;
        Object obj5 = obj;
        i11 = i11;
        i12 = i12;
        zziab zziabVar4 = zziabVar;
        zzF(obj);
        Unsafe unsafe4 = zzb;
        int iZzo = i10;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = -1;
        int i52 = 1048575;
        while (true) {
            if (iZzo < i11) {
                int i53 = iZzo + 1;
                int i54 = bArr[iZzo];
                if (i54 < 0) {
                    iZzb = zziac.zzb(i54, bArr, i53, zziabVar4);
                    i17 = zziabVar4.zza;
                } else {
                    i17 = i54;
                    iZzb = i53;
                }
                int i55 = i17 >>> 3;
                int iZzS = i55 > i51 ? (i55 < zzidfVar4.zze || i55 > zzidfVar4.zzf) ? -1 : zzidfVar4.zzS(i55, i48 / 3) : zzidfVar4.zzR(i55);
                if (iZzS != -1) {
                    int i56 = i17 & 7;
                    int[] iArr = zzidfVar4.zzc;
                    int i57 = i17;
                    int i58 = iArr[iZzS + 1];
                    str = "Failed to parse the message.";
                    int iZzC = zzC(i58);
                    long j10 = i58 & 1048575;
                    if (iZzC <= 17) {
                        int i59 = iArr[iZzS + 2];
                        int i60 = 1 << (i59 >>> 20);
                        char c10 = 65535;
                        int i61 = i59 & 1048575;
                        if (i61 != i52) {
                            if (i52 != 1048575) {
                                unsafe4.putInt(obj5, i52, i50);
                            }
                            i50 = i61 == 1048575 ? 0 : unsafe4.getInt(obj5, i61);
                            i20 = i61;
                        } else {
                            i20 = i52;
                        }
                        switch (iZzC) {
                            case 0:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 1) {
                                    iZzo = iZzb + 8;
                                    i50 |= i60;
                                    zziem.zzm(obj5, j10, Double.longBitsToDouble(zziac.zze(bArr, iZzb)));
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 1:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 5) {
                                    iZzo = iZzb + 4;
                                    i50 |= i60;
                                    zziem.zzk(obj5, j10, Float.intBitsToFloat(zziac.zzd(bArr, iZzb)));
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 2:
                            case 3:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 0) {
                                    i25 = i60 | i50;
                                    iZzc = zziac.zzc(bArr, iZzb, zziabVar4);
                                    unsafe4.putLong(obj, j10, zziabVar4.zzb);
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i50 = i25;
                                    iZzo = iZzc;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 4:
                            case 11:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 0) {
                                    i50 |= i60;
                                    iZzo = zziac.zza(bArr, iZzb, zziabVar4);
                                    unsafe4.putInt(obj5, j10, zziabVar4.zza);
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 5:
                            case 14:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 1) {
                                    iZzc = iZzb + 8;
                                    i25 = i60 | i50;
                                    unsafe4.putLong(obj, j10, zziac.zze(bArr, iZzb));
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i50 = i25;
                                    iZzo = iZzc;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 6:
                            case 13:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 5) {
                                    iZzo = iZzb + 4;
                                    i50 |= i60;
                                    unsafe4.putInt(obj5, j10, zziac.zzd(bArr, iZzb));
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 7:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 0) {
                                    i50 |= i60;
                                    iZzo = zziac.zzc(bArr, iZzb, zziabVar4);
                                    zziem.zzi(obj5, j10, zziabVar4.zzb != 0);
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 8:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 2) {
                                    i50 |= i60;
                                    if (zzD(i58)) {
                                        iZzo = zziac.zzf(bArr, iZzb, zziabVar4);
                                    } else {
                                        iZzo = zziac.zza(bArr, iZzb, zziabVar4);
                                        int i62 = zziabVar4.zza;
                                        if (i62 < 0) {
                                            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i62 == 0) {
                                            zziabVar4.zzc = "";
                                        } else {
                                            zziabVar4.zzc = new String(bArr, iZzo, i62, zzice.zza);
                                            iZzo += i62;
                                        }
                                    }
                                    unsafe4.putObject(obj5, j10, zziabVar4.zzc);
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 9:
                                b10 = -1;
                                zzidfVar = this;
                                i23 = iZzS;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 2) {
                                    Object objZzt = zzidfVar.zzt(obj5, i23);
                                    iZzo = zziac.zzj(objZzt, zzidfVar.zzq(i23), bArr, iZzb, i11, zziabVar);
                                    zzidfVar.zzu(obj5, i23, objZzt);
                                    i49 = i24 == true ? 1 : 0;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i50 = i60 | i50;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    iZzb = iZzb;
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 10:
                                b10 = -1;
                                zzidfVar = this;
                                i23 = iZzS;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 2) {
                                    i50 |= i60;
                                    iZzo = zziac.zzg(bArr, iZzb, zziabVar4);
                                    unsafe4.putObject(obj5, j10, zziabVar4.zzc);
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    iZzb = iZzb;
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 12:
                                i23 = iZzS;
                                i24 = i57 == true ? 1 : 0;
                                b11 = -1;
                                if (i56 == 0) {
                                    iZzo = zziac.zza(bArr, iZzb, zziabVar4);
                                    int i63 = zziabVar4.zza;
                                    zzidfVar = this;
                                    zzibx zzibxVarZzs = zzidfVar.zzs(i23);
                                    if ((i58 & Integer.MIN_VALUE) == 0 || zzibxVarZzs == null || zzibxVarZzs.zza(i63)) {
                                        i50 |= i60;
                                        unsafe4.putInt(obj5, j10, i63);
                                    } else {
                                        zzh(obj).zzk(i24 == true ? 1 : 0, Long.valueOf(i63));
                                    }
                                    i49 = i24;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = this;
                                    iZzb = iZzb;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 15:
                                i24 = i57 == true ? 1 : 0;
                                b11 = -1;
                                if (i56 == 0) {
                                    i50 |= i60;
                                    iZzo = zziac.zza(bArr, iZzb, zziabVar4);
                                    unsafe4.putInt(obj5, j10, zziaq.zzK(zziabVar4.zza));
                                    i49 = i24 == true ? 1 : 0;
                                    i48 = iZzS;
                                    i51 = i55;
                                    i52 = i20;
                                    zzidfVar4 = this;
                                } else {
                                    i26 = iZzS;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            case 16:
                                if (i56 == 0) {
                                    int iZzc3 = zziac.zzc(bArr, iZzb, zziabVar4);
                                    unsafe4.putLong(obj, j10, zziaq.zzL(zziabVar4.zzb));
                                    i49 = i57 == true ? 1 : 0;
                                    i50 |= i60;
                                    iZzo = iZzc3;
                                    i48 = iZzS;
                                    i51 = i55;
                                    i52 = i20;
                                    zzidfVar4 = this;
                                } else {
                                    i24 = i57 == true ? 1 : 0;
                                    b11 = -1;
                                    i26 = iZzS;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                            default:
                                b10 = -1;
                                zzidfVar = this;
                                iZzb = iZzb;
                                i23 = iZzS;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 3) {
                                    Object objZzt2 = zzidfVar.zzt(obj5, i23);
                                    int iZzk = zziac.zzk(objZzt2, zzidfVar.zzq(i23), bArr, iZzb, i11, (i55 << 3) | 4, zziabVar);
                                    zzidfVar.zzu(obj5, i23, objZzt2);
                                    i11 = i11;
                                    i12 = i12;
                                    zziabVar4 = zziabVar4;
                                    unsafe4 = unsafe4;
                                    i49 = i24 == true ? 1 : 0;
                                    iZzo = iZzk;
                                    i51 = i55;
                                    i52 = i20;
                                    zzidfVar4 = zzidfVar;
                                    i48 = i23;
                                    i50 |= i60;
                                } else {
                                    this = zzidfVar;
                                    unsafe4 = unsafe4;
                                    zziabVar4 = zziabVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zziabVar2 = zziabVar4;
                                }
                                break;
                        }
                    } else {
                        i19 = i50;
                        i20 = i52;
                        Unsafe unsafe5 = unsafe4;
                        int i64 = iZzb;
                        zziab zziabVar5 = zziabVar4;
                        zzidf<T> zzidfVar5 = zzidfVar4;
                        i16 = i57 == true ? 1 : 0;
                        if (iZzC != 27) {
                            if (iZzC <= 49) {
                                int i65 = i55;
                                long j11 = i58;
                                zzicd zzicdVarZzh = (zzicd) unsafe5.getObject(obj5, j10);
                                if (!zzicdVarZzh.zza()) {
                                    int size = zzicdVarZzh.size();
                                    zzicdVarZzh = zzicdVarZzh.zzh(size + size);
                                    unsafe5.putObject(obj5, j10, zzicdVarZzh);
                                }
                                zzicd zzicdVar = zzicdVarZzh;
                                switch (iZzC) {
                                    case 18:
                                    case 35:
                                        zzidfVar2 = this;
                                        i30 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzS;
                                        if (i56 != 2) {
                                            if (i56 == 1) {
                                                iZzo = i31 + 8;
                                                int i66 = zziac.zza;
                                                zziay zziayVar = (zziay) zzicdVar;
                                                zziayVar.zzg(Double.longBitsToDouble(zziac.zze(bArr, i31)));
                                                while (iZzo < i30) {
                                                    int iZza2 = zziac.zza(bArr, iZzo, zziabVar2);
                                                    if (i16 == zziabVar2.zza) {
                                                        zziayVar.zzg(Double.longBitsToDouble(zziac.zze(bArr, iZza2)));
                                                        iZzo = iZza2 + 8;
                                                    }
                                                }
                                            }
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i67 = zziac.zza;
                                            zziay zziayVar2 = (zziay) zzicdVar;
                                            iZzo = zziac.zza(bArr, i31, zziabVar2);
                                            int i68 = zziabVar2.zza;
                                            int i69 = iZzo + i68;
                                            if (i69 > bArr.length) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zziayVar2.zzi(zziayVar2.size() + (i68 / 8));
                                            while (iZzo < i69) {
                                                zziayVar2.zzg(Double.longBitsToDouble(zziac.zze(bArr, iZzo)));
                                                iZzo += 8;
                                            }
                                            if (iZzo != i69) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        zzidfVar2 = this;
                                        i30 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzS;
                                        if (i56 != 2) {
                                            if (i56 == 5) {
                                                iZzo = i31 + 4;
                                                int i70 = zziac.zza;
                                                zzibi zzibiVar = (zzibi) zzicdVar;
                                                zzibiVar.zzg(Float.intBitsToFloat(zziac.zzd(bArr, i31)));
                                                while (iZzo < i30) {
                                                    int iZza3 = zziac.zza(bArr, iZzo, zziabVar2);
                                                    if (i16 == zziabVar2.zza) {
                                                        zzibiVar.zzg(Float.intBitsToFloat(zziac.zzd(bArr, iZza3)));
                                                        iZzo = iZza3 + 4;
                                                    }
                                                }
                                            }
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i71 = zziac.zza;
                                            zzibi zzibiVar2 = (zzibi) zzicdVar;
                                            iZzo = zziac.zza(bArr, i31, zziabVar2);
                                            int i72 = zziabVar2.zza;
                                            int i73 = iZzo + i72;
                                            if (i73 > bArr.length) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzibiVar2.zzi(zzibiVar2.size() + (i72 / 4));
                                            while (iZzo < i73) {
                                                zzibiVar2.zzg(Float.intBitsToFloat(zziac.zzd(bArr, iZzo)));
                                                iZzo += 4;
                                            }
                                            if (iZzo != i73) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzidfVar2 = this;
                                        i30 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzS;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                int i74 = zziac.zza;
                                                zzicq zzicqVar = (zzicq) zzicdVar;
                                                iZzo = zziac.zzc(bArr, i31, zziabVar2);
                                                zzicqVar.zzd(zziabVar2.zzb);
                                                while (iZzo < i30) {
                                                    int iZza4 = zziac.zza(bArr, iZzo, zziabVar2);
                                                    if (i16 == zziabVar2.zza) {
                                                        iZzo = zziac.zzc(bArr, iZza4, zziabVar2);
                                                        zzicqVar.zzd(zziabVar2.zzb);
                                                    }
                                                }
                                            }
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i75 = zziac.zza;
                                            zzicq zzicqVar2 = (zzicq) zzicdVar;
                                            iZzo = zziac.zza(bArr, i31, zziabVar2);
                                            int i76 = zziabVar2.zza + iZzo;
                                            while (iZzo < i76) {
                                                iZzo = zziac.zzc(bArr, iZzo, zziabVar2);
                                                zzicqVar2.zzd(zziabVar2.zzb);
                                            }
                                            if (iZzo != i76) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i33 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        i32 = iZzS;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                zzidfVar2 = this;
                                                str3 = str;
                                                i30 = i33;
                                                unsafe5 = unsafe5;
                                                iZzo = zziac.zzl(i16 == true ? 1 : 0, bArr, i31, i11, zzicdVar, zziabVar);
                                                str = str3;
                                                i34 = i32;
                                                if (iZzo != i31) {
                                                    i12 = i12;
                                                    i49 = i16 == true ? 1 : 0;
                                                    i48 = i34;
                                                    zzidfVar4 = zzidfVar2;
                                                    unsafe4 = unsafe5;
                                                    i50 = i19;
                                                    i51 = i65;
                                                    i52 = i20;
                                                    zziabVar4 = zziabVar2;
                                                    i11 = i30;
                                                    obj5 = obj;
                                                } else {
                                                    i18 = iZzo;
                                                    i16 = i16 == true ? 1 : 0;
                                                    i22 = i34;
                                                    unsafe = unsafe5;
                                                    str = str;
                                                    i21 = i65;
                                                    obj2 = obj;
                                                    i14 = i12;
                                                    this = zzidfVar2;
                                                }
                                            }
                                            zzidfVar2 = this;
                                            i30 = i33;
                                            unsafe5 = unsafe5;
                                            str = str;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                            break;
                                        } else {
                                            iZzo = zziac.zzm(bArr, i31, zzicdVar, zziabVar2);
                                            zzidfVar2 = this;
                                            i30 = i33;
                                            unsafe5 = unsafe5;
                                            str = str;
                                            i34 = i32;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i33 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        i32 = iZzS;
                                        int i77 = i65;
                                        if (i56 != 2) {
                                            i65 = i77;
                                            if (i56 == 1) {
                                                iZzo = i31 + 8;
                                                int i78 = zziac.zza;
                                                zzicq zzicqVar3 = (zzicq) zzicdVar;
                                                zzicqVar3.zzd(zziac.zze(bArr, i31));
                                                while (iZzo < i33) {
                                                    int iZza5 = zziac.zza(bArr, iZzo, zziabVar2);
                                                    if (i16 == zziabVar2.zza) {
                                                        zzicqVar3.zzd(zziac.zze(bArr, iZza5));
                                                        iZzo = iZza5 + 8;
                                                    }
                                                }
                                            }
                                            zzidfVar2 = this;
                                            i30 = i33;
                                            unsafe5 = unsafe5;
                                            str = str;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i79 = zziac.zza;
                                            zzicq zzicqVar4 = (zzicq) zzicdVar;
                                            iZzo = zziac.zza(bArr, i31, zziabVar2);
                                            int i80 = zziabVar2.zza;
                                            int i81 = iZzo + i80;
                                            if (i81 > bArr.length) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzicqVar4.zzi(zzicqVar4.size() + (i80 / 8));
                                            while (iZzo < i81) {
                                                zzicqVar4.zzd(zziac.zze(bArr, iZzo));
                                                iZzo += 8;
                                                i77 = i77;
                                            }
                                            i65 = i77;
                                            if (iZzo != i81) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzidfVar2 = this;
                                        i30 = i33;
                                        unsafe5 = unsafe5;
                                        str = str;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i35 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        i36 = iZzS;
                                        i37 = i65;
                                        if (i56 != 2) {
                                            if (i56 == 5) {
                                                iZzo = i31 + 4;
                                                int i82 = zziac.zza;
                                                zzibs zzibsVar = (zzibs) zzicdVar;
                                                zzibsVar.zzi(zziac.zzd(bArr, i31));
                                                while (iZzo < i35) {
                                                    int iZza6 = zziac.zza(bArr, iZzo, zziabVar2);
                                                    if (i16 == zziabVar2.zza) {
                                                        zzibsVar.zzi(zziac.zzd(bArr, iZza6));
                                                        iZzo = iZza6 + 4;
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i65 = i37;
                                            str = str;
                                            i34 = i36;
                                            zzidfVar2 = this;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i83 = zziac.zza;
                                            zzibs zzibsVar2 = (zzibs) zzicdVar;
                                            iZzo = zziac.zza(bArr, i31, zziabVar2);
                                            int i84 = zziabVar2.zza;
                                            int i85 = iZzo + i84;
                                            if (i85 > bArr.length) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzibsVar2.zzj(zzibsVar2.size() + (i84 / 4));
                                            while (iZzo < i85) {
                                                zzibsVar2.zzi(zziac.zzd(bArr, iZzo));
                                                iZzo += 4;
                                            }
                                            if (iZzo != i85) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i30 = i35;
                                        i65 = i37;
                                        str = str;
                                        i34 = i36;
                                        zzidfVar2 = this;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i35 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        String str4 = str;
                                        i36 = iZzS;
                                        i37 = i65;
                                        if (i56 != 2) {
                                            str = str4;
                                            if (i56 == 0) {
                                                int i86 = zziac.zza;
                                                zziad zziadVar = (zziad) zzicdVar;
                                                iZzo = zziac.zzc(bArr, i31, zziabVar2);
                                                zziadVar.zzg(zziabVar2.zzb != 0);
                                                while (iZzo < i35) {
                                                    int iZza7 = zziac.zza(bArr, iZzo, zziabVar2);
                                                    if (i16 == zziabVar2.zza) {
                                                        iZzo = zziac.zzc(bArr, iZza7, zziabVar2);
                                                        zziadVar.zzg(zziabVar2.zzb != 0);
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i65 = i37;
                                            str = str;
                                            i34 = i36;
                                            zzidfVar2 = this;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i87 = zziac.zza;
                                            zziad zziadVar2 = (zziad) zzicdVar;
                                            iZzo = zziac.zza(bArr, i31, zziabVar2);
                                            int i88 = zziabVar2.zza + iZzo;
                                            while (iZzo < i88) {
                                                iZzo = zziac.zzc(bArr, iZzo, zziabVar2);
                                                String str5 = str4;
                                                zziadVar2.zzg(zziabVar2.zzb != 0);
                                                str4 = str5;
                                            }
                                            str = str4;
                                            if (iZzo != i88) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i30 = i35;
                                        i65 = i37;
                                        str = str;
                                        i34 = i36;
                                        zzidfVar2 = this;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 26:
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        i36 = iZzS;
                                        if (i56 != 2) {
                                            str = str;
                                            i30 = i11;
                                            i65 = i65;
                                            i34 = i36;
                                            zzidfVar2 = this;
                                            iZzo = i31;
                                        } else if ((j11 & 536870912) == 0) {
                                            int iZza8 = zziac.zza(bArr, i31, zziabVar2);
                                            int i89 = zziabVar2.zza;
                                            if (i89 < 0) {
                                                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i89 == 0) {
                                                zzicdVar.add("");
                                            } else {
                                                zzicdVar.add(new String(bArr, iZza8, i89, zzice.zza));
                                                iZza8 += i89;
                                            }
                                            while (iZza8 < i11) {
                                                int iZza9 = zziac.zza(bArr, iZza8, zziabVar2);
                                                if (i16 == zziabVar2.zza) {
                                                    iZza8 = zziac.zza(bArr, iZza9, zziabVar2);
                                                    int i90 = zziabVar2.zza;
                                                    if (i90 < 0) {
                                                        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i90 == 0) {
                                                        zzicdVar.add("");
                                                    } else {
                                                        zzicdVar.add(new String(bArr, iZza8, i90, zzice.zza));
                                                        iZza8 += i90;
                                                    }
                                                } else {
                                                    str = str;
                                                    i30 = i11;
                                                    unsafe5 = unsafe5;
                                                    i65 = i65;
                                                    i34 = i36;
                                                    zzidfVar2 = this;
                                                    iZzo = iZza8;
                                                }
                                            }
                                            str = str;
                                            i30 = i11;
                                            unsafe5 = unsafe5;
                                            i65 = i65;
                                            i34 = i36;
                                            zzidfVar2 = this;
                                            iZzo = iZza8;
                                        } else {
                                            int iZza10 = zziac.zza(bArr, i31, zziabVar2);
                                            int i91 = zziabVar2.zza;
                                            if (i91 < 0) {
                                                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i91 == 0) {
                                                zzicdVar.add("");
                                            } else {
                                                int i92 = iZza10 + i91;
                                                if (!zzier.zzb(bArr, iZza10, i92)) {
                                                    throw new zzicg("Protocol message had invalid UTF-8.");
                                                }
                                                zzicdVar.add(new String(bArr, iZza10, i91, zzice.zza));
                                                iZza10 = i92;
                                            }
                                            while (iZza10 < i11) {
                                                int iZza11 = zziac.zza(bArr, iZza10, zziabVar2);
                                                if (i16 == zziabVar2.zza) {
                                                    iZza10 = zziac.zza(bArr, iZza11, zziabVar2);
                                                    int i93 = zziabVar2.zza;
                                                    if (i93 < 0) {
                                                        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i93 == 0) {
                                                        zzicdVar.add("");
                                                    } else {
                                                        int i94 = iZza10 + i93;
                                                        if (!zzier.zzb(bArr, iZza10, i94)) {
                                                            throw new zzicg("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzicdVar.add(new String(bArr, iZza10, i93, zzice.zza));
                                                        iZza10 = i94;
                                                    }
                                                } else {
                                                    iZzo = iZza10;
                                                    str = str;
                                                    i30 = i11;
                                                    i65 = i65;
                                                    i34 = i36;
                                                    zzidfVar2 = this;
                                                }
                                            }
                                            iZzo = iZza10;
                                            str = str;
                                            i30 = i11;
                                            i65 = i65;
                                            i34 = i36;
                                            zzidfVar2 = this;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 27:
                                        i38 = iZzS;
                                        if (i56 == 2) {
                                            zziabVar2 = zziabVar5;
                                            int iZzn = zziac.zzn(zzq(i38), i16 == true ? 1 : 0, bArr, i64, i11, zzicdVar, zziabVar);
                                            zzidfVar2 = this;
                                            str = str;
                                            i30 = i11;
                                            unsafe5 = unsafe5;
                                            iZzo = iZzn;
                                            i34 = i38;
                                            i31 = i64;
                                        } else {
                                            zziabVar2 = zziabVar5;
                                            zzidfVar2 = this;
                                            i30 = i11;
                                            i31 = i64;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 28:
                                        if (i56 == 2) {
                                            int iZza12 = zziac.zza(bArr, i64, zziabVar5);
                                            int i95 = zziabVar5.zza;
                                            if (i95 < 0) {
                                                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i95 > bArr.length - iZza12) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i95 == 0) {
                                                zzicdVar.add(zzian.zza);
                                            } else {
                                                zzicdVar.add(zzian.zzs(bArr, iZza12, i95));
                                                iZza12 += i95;
                                            }
                                            while (iZza12 < i11) {
                                                int iZza13 = zziac.zza(bArr, iZza12, zziabVar5);
                                                if (i16 != zziabVar5.zza) {
                                                    i30 = i11;
                                                    i31 = i64;
                                                    zziabVar2 = zziabVar5;
                                                    i34 = iZzS;
                                                    zzidfVar2 = this;
                                                    iZzo = iZza12;
                                                    unsafe5 = unsafe5;
                                                    if (iZzo != i31) {
                                                        i12 = i12;
                                                        i49 = i16 == true ? 1 : 0;
                                                        i48 = i34;
                                                        zzidfVar4 = zzidfVar2;
                                                        unsafe4 = unsafe5;
                                                        i50 = i19;
                                                        i51 = i65;
                                                        i52 = i20;
                                                        zziabVar4 = zziabVar2;
                                                        i11 = i30;
                                                        obj5 = obj;
                                                    } else {
                                                        i18 = iZzo;
                                                        i16 = i16 == true ? 1 : 0;
                                                        i22 = i34;
                                                        unsafe = unsafe5;
                                                        str = str;
                                                        i21 = i65;
                                                        obj2 = obj;
                                                        i14 = i12;
                                                        this = zzidfVar2;
                                                    }
                                                    break;
                                                } else {
                                                    iZza12 = zziac.zza(bArr, iZza13, zziabVar5);
                                                    int i96 = zziabVar5.zza;
                                                    if (i96 < 0) {
                                                        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i96 > bArr.length - iZza12) {
                                                        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i96 == 0) {
                                                        zzicdVar.add(zzian.zza);
                                                    } else {
                                                        zzicdVar.add(zzian.zzs(bArr, iZza12, i96));
                                                        iZza12 += i96;
                                                    }
                                                }
                                            }
                                            i30 = i11;
                                            i31 = i64;
                                            zziabVar2 = zziabVar5;
                                            i34 = iZzS;
                                            zzidfVar2 = this;
                                            iZzo = iZza12;
                                            unsafe5 = unsafe5;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            i30 = i11;
                                            i31 = i64;
                                            zziabVar2 = zziabVar5;
                                            i34 = iZzS;
                                            zzidfVar2 = this;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i39 = i11;
                                        i38 = iZzS;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                iZzl = zziac.zzl(i16 == true ? 1 : 0, bArr, i64, i11, zzicdVar, zziabVar);
                                            }
                                            zzidfVar2 = this;
                                            zziabVar2 = zziabVar5;
                                            i31 = i64;
                                            i30 = i39;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            iZzl = zziac.zzm(bArr, i64, zzicdVar, zziabVar5);
                                        }
                                        zzidw.zzJ(obj, i65, zzicdVar, zzs(i38), null, this.zzm);
                                        iZzo = iZzl;
                                        zziabVar2 = zziabVar5;
                                        zzidfVar2 = this;
                                        str = str;
                                        i30 = i39;
                                        i31 = i64;
                                        i34 = i38;
                                        unsafe5 = unsafe5;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i39 = i11;
                                        i38 = iZzS;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                int i97 = zziac.zza;
                                                zzibs zzibsVar3 = (zzibs) zzicdVar;
                                                iZza = zziac.zza(bArr, i64, zziabVar5);
                                                zzibsVar3.zzi(zziaq.zzK(zziabVar5.zza));
                                                while (iZza < i39) {
                                                    int iZza14 = zziac.zza(bArr, iZza, zziabVar5);
                                                    if (i16 == zziabVar5.zza) {
                                                        iZza = zziac.zza(bArr, iZza14, zziabVar5);
                                                        zzibsVar3.zzi(zziaq.zzK(zziabVar5.zza));
                                                    }
                                                }
                                            }
                                            zzidfVar2 = this;
                                            zziabVar2 = zziabVar5;
                                            i31 = i64;
                                            i30 = i39;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzidfVar4 = zzidfVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zziabVar4 = zziabVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzidfVar2;
                                            }
                                        } else {
                                            int i98 = zziac.zza;
                                            zzibs zzibsVar4 = (zzibs) zzicdVar;
                                            iZza = zziac.zza(bArr, i64, zziabVar5);
                                            int i99 = zziabVar5.zza + iZza;
                                            while (iZza < i99) {
                                                iZza = zziac.zza(bArr, iZza, zziabVar5);
                                                zzibsVar4.zzi(zziaq.zzK(zziabVar5.zza));
                                            }
                                            if (iZza != i99) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzidfVar2 = this;
                                        zziabVar2 = zziabVar5;
                                        iZzo = iZza;
                                        i31 = i64;
                                        i30 = i39;
                                        i34 = i38;
                                        unsafe5 = unsafe5;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i56 == 2) {
                                            int i100 = zziac.zza;
                                            zzicq zzicqVar5 = (zzicq) zzicdVar;
                                            int iZza15 = zziac.zza(bArr, i64, zziabVar5);
                                            int i101 = zziabVar5.zza + iZza15;
                                            while (iZza15 < i101) {
                                                iZza15 = zziac.zzc(bArr, iZza15, zziabVar5);
                                                zzicqVar5.zzd(zziaq.zzL(zziabVar5.zzb));
                                            }
                                            if (iZza15 != i101) {
                                                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzidfVar2 = this;
                                            i30 = i11;
                                            zziabVar2 = zziabVar5;
                                            iZzo = iZza15;
                                            i31 = i64;
                                            unsafe5 = unsafe5;
                                            i34 = iZzS;
                                            str = str;
                                        } else if (i56 == 0) {
                                            int i102 = zziac.zza;
                                            zzicq zzicqVar6 = (zzicq) zzicdVar;
                                            iZza = zziac.zzc(bArr, i64, zziabVar5);
                                            zzicqVar6.zzd(zziaq.zzL(zziabVar5.zzb));
                                            i39 = i11;
                                            i38 = iZzS;
                                            while (iZza < i39) {
                                                int iZza16 = zziac.zza(bArr, iZza, zziabVar5);
                                                if (i16 == zziabVar5.zza) {
                                                    iZza = zziac.zzc(bArr, iZza16, zziabVar5);
                                                    zzicqVar6.zzd(zziaq.zzL(zziabVar5.zzb));
                                                } else {
                                                    zzidfVar2 = this;
                                                    zziabVar2 = zziabVar5;
                                                    iZzo = iZza;
                                                    i31 = i64;
                                                    i30 = i39;
                                                    i34 = i38;
                                                    unsafe5 = unsafe5;
                                                }
                                            }
                                            zzidfVar2 = this;
                                            zziabVar2 = zziabVar5;
                                            iZzo = iZza;
                                            i31 = i64;
                                            i30 = i39;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                        } else {
                                            zzidfVar2 = this;
                                            i30 = i11;
                                            zziabVar2 = zziabVar5;
                                            i31 = i64;
                                            unsafe5 = unsafe5;
                                            i34 = iZzS;
                                            str = str;
                                            iZzo = i31;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                    default:
                                        zzidfVar2 = this;
                                        i30 = i11;
                                        zziabVar2 = zziabVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzS;
                                        if (i56 == 3) {
                                            int i103 = ((i16 == true ? 1 : 0) & (-8)) | 4;
                                            zzidu zziduVarZzq = zzidfVar2.zzq(i32);
                                            str = str3;
                                            i34 = i32;
                                            iZzo = zziac.zzi(zziduVarZzq, bArr, i31, i11, i103, zziabVar);
                                            zzicdVar.add(zziabVar2.zzc);
                                            while (iZzo < i30) {
                                                int iZza17 = zziac.zza(bArr, iZzo, zziabVar2);
                                                if (i16 == zziabVar2.zza) {
                                                    iZzo = zziac.zzi(zziduVarZzq, bArr, iZza17, i11, i103, zziabVar);
                                                    zzicdVar.add(zziabVar2.zzc);
                                                }
                                            }
                                        } else {
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzidfVar4 = zzidfVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zziabVar4 = zziabVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzidfVar2;
                                        }
                                        break;
                                }
                            } else {
                                int i104 = i64;
                                Unsafe unsafe6 = unsafe5;
                                int i105 = i11;
                                i29 = i55;
                                i28 = iZzS;
                                if (iZzC != 50) {
                                    zziabVar2 = zziabVar;
                                    int i106 = iArr[i28 + 2] & 1048575;
                                    int i107 = i16 == true ? 1 : 0;
                                    long j12 = i106;
                                    switch (iZzC) {
                                        case 51:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 1) {
                                                iZzc2 = i40 + 8;
                                                unsafe.putObject(obj2, j10, Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i40))));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 52:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 5) {
                                                iZzc2 = i40 + 4;
                                                unsafe.putObject(obj2, j10, Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i40))));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 53:
                                        case 54:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                iZzc2 = zziac.zzc(bArr, i40, zziabVar2);
                                                unsafe.putObject(obj2, j10, Long.valueOf(zziabVar2.zzb));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 55:
                                        case 62:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                iZzc2 = zziac.zza(bArr, i40, zziabVar2);
                                                unsafe.putObject(obj2, j10, Integer.valueOf(zziabVar2.zza));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 56:
                                        case 65:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 1) {
                                                iZzc2 = i40 + 8;
                                                unsafe.putObject(obj2, j10, Long.valueOf(zziac.zze(bArr, i40)));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 57:
                                        case 64:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 5) {
                                                iZzc2 = i40 + 4;
                                                unsafe.putObject(obj2, j10, Integer.valueOf(zziac.zzd(bArr, i40)));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 58:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                iZzc2 = zziac.zzc(bArr, i40, zziabVar2);
                                                unsafe.putObject(obj2, j10, Boolean.valueOf(zziabVar2.zzb != 0));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 59:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 2) {
                                                iZzc2 = zziac.zza(bArr, i40, zziabVar2);
                                                int i108 = zziabVar2.zza;
                                                if (i108 == 0) {
                                                    unsafe.putObject(obj2, j10, "");
                                                } else {
                                                    int i109 = iZzc2 + i108;
                                                    if ((i58 & 536870912) != 0 && !zzier.zzb(bArr, iZzc2, i109)) {
                                                        throw new zzicg("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j10, new String(bArr, iZzc2, i108, zzice.zza));
                                                    iZzc2 = i109;
                                                }
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 60:
                                            str = str;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 2) {
                                                Object objZzv = zzv(obj, i21, i28);
                                                zzidu zziduVarZzq2 = zzq(i28);
                                                this = this;
                                                i47 = i107 == true ? 1 : 0;
                                                obj2 = obj;
                                                int iZzj = zziac.zzj(objZzv, zziduVarZzq2, bArr, i104, i11, zziabVar);
                                                this.zzw(obj2, i21, i28, objZzv);
                                                iZzc2 = iZzj;
                                                i22 = i28;
                                            } else {
                                                this = this;
                                                i107 = i107 == true ? 1 : 0;
                                                obj2 = obj;
                                                i40 = i104;
                                                i22 = i28;
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 61:
                                            zzidfVar3 = this;
                                            obj3 = obj;
                                            str = str;
                                            i41 = i28;
                                            i42 = i104;
                                            i43 = i107 == true ? 1 : 0;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 2) {
                                                iZzc2 = zziac.zzg(bArr, i42, zziabVar2);
                                                unsafe.putObject(obj3, j10, zziabVar2.zzc);
                                                unsafe.putInt(obj3, j12, i21);
                                                this = zzidfVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                i107 = i43;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zziabVar4 = zziabVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzidfVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            } else {
                                                this = zzidfVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                i107 = i43 == true ? 1 : 0;
                                                obj2 = obj3;
                                                iZzc2 = i40;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zziabVar4 = zziabVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzidfVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            break;
                                        case 63:
                                            zzidfVar3 = this;
                                            obj3 = obj;
                                            str = str;
                                            i41 = i28;
                                            i42 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 0) {
                                                iZzc2 = zziac.zza(bArr, i42, zziabVar2);
                                                int i110 = zziabVar2.zza;
                                                zzibx zzibxVarZzs2 = zzidfVar3.zzs(i41);
                                                if (zzibxVarZzs2 == null || zzibxVarZzs2.zza(i110)) {
                                                    i43 = i107 == true ? 1 : 0;
                                                    unsafe.putObject(obj3, j10, Integer.valueOf(i110));
                                                    unsafe.putInt(obj3, j12, i21);
                                                } else {
                                                    zzieg zziegVarZzh = zzh(obj);
                                                    Long lValueOf = Long.valueOf(i110);
                                                    i43 = i107 == true ? 1 : 0;
                                                    zziegVarZzh.zzk(i43 == true ? 1 : 0, lValueOf);
                                                }
                                                this = zzidfVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                i107 = i43;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zziabVar4 = zziabVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzidfVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            this = zzidfVar3;
                                            i40 = i42;
                                            i22 = i41;
                                            obj2 = obj3;
                                            iZzc2 = i40;
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 66:
                                            zzidfVar3 = this;
                                            obj3 = obj;
                                            str = str;
                                            i41 = i28;
                                            i42 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 0) {
                                                iZzc2 = zziac.zza(bArr, i42, zziabVar2);
                                                unsafe.putObject(obj3, j10, Integer.valueOf(zziaq.zzK(zziabVar2.zza)));
                                                unsafe.putInt(obj3, j12, i21);
                                                this = zzidfVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zziabVar4 = zziabVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzidfVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            this = zzidfVar3;
                                            i40 = i42;
                                            i22 = i41;
                                            obj2 = obj3;
                                            iZzc2 = i40;
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 67:
                                            zzidfVar3 = this;
                                            obj3 = obj;
                                            i41 = i28;
                                            i42 = i104;
                                            i21 = i29;
                                            if (i56 == 0) {
                                                iZzc2 = zziac.zzc(bArr, i42, zziabVar2);
                                                str = str;
                                                unsafe = unsafe6;
                                                unsafe.putObject(obj3, j10, Long.valueOf(zziaq.zzL(zziabVar2.zzb)));
                                                unsafe.putInt(obj3, j12, i21);
                                                this = zzidfVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zziabVar4 = zziabVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzidfVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            } else {
                                                str = str;
                                                unsafe = unsafe6;
                                                this = zzidfVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                obj2 = obj3;
                                                iZzc2 = i40;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zziabVar4 = zziabVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzidfVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                int i111 = ((i107 == true ? 1 : 0) & (-8)) | 4;
                                                Object objZzv2 = zzv(obj, i29, i28);
                                                int iZzk2 = zziac.zzk(objZzv2, zzq(i28), bArr, i104, i11, i111, zziabVar);
                                                zzw(obj, i29, i28, objZzv2);
                                                this = this;
                                                i22 = i28;
                                                obj2 = obj;
                                                unsafe = unsafe6;
                                                i21 = i29;
                                                iZzc2 = iZzk2;
                                            } else {
                                                str = str;
                                                i22 = i28;
                                                i40 = i104;
                                                i21 = i29;
                                                unsafe = unsafe6;
                                                this = this;
                                                obj2 = obj;
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        default:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            iZzc2 = i40;
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zziabVar4 = zziabVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzidfVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                    }
                                } else if (i56 == 2) {
                                    Object objZzr = zzidfVar5.zzr(i28);
                                    Object object = unsafe6.getObject(obj, j10);
                                    if (zzicx.zza(object)) {
                                        zzicw zzicwVarZzc = zzicw.zza().zzc();
                                        zzicx.zzb(zzicwVarZzc, object);
                                        unsafe6.putObject(obj, j10, zzicwVarZzc);
                                        object = zzicwVarZzc;
                                    }
                                    zzicu zzicuVarZze = ((zzicv) objZzr).zze();
                                    zzicw zzicwVar = (zzicw) object;
                                    int iZza18 = zziac.zza(bArr, i104, zziabVar);
                                    int i112 = zziabVar.zza;
                                    if (i112 < 0 || i112 > i105 - iZza18) {
                                        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    }
                                    int i113 = iZza18 + i112;
                                    Object obj6 = zzicuVarZze.zzb;
                                    Object obj7 = zzicuVarZze.zzd;
                                    Object obj8 = obj6;
                                    Object obj9 = obj7;
                                    while (iZza18 < i113) {
                                        int i114 = i104;
                                        int iZzb2 = iZza18 + 1;
                                        int i115 = bArr[iZza18];
                                        if (i115 < 0) {
                                            iZzb2 = zziac.zzb(i115, bArr, iZzb2, zziabVar);
                                            i115 = zziabVar.zza;
                                        }
                                        int i116 = iZzb2;
                                        int i117 = i115 >>> 3;
                                        obj9 = obj9;
                                        int i118 = i115 & 7;
                                        Unsafe unsafe7 = unsafe6;
                                        if (i117 != 1) {
                                            if (i117 != 2) {
                                                i44 = i116;
                                                obj8 = obj8;
                                                i45 = i105;
                                                unsafe3 = unsafe7;
                                                obj4 = obj7;
                                                i46 = i114;
                                                iZza18 = zziac.zzp(i115, bArr, i44, i45, zziabVar);
                                            } else {
                                                zzies zziesVar = zzicuVarZze.zzc;
                                                if (i118 == zziesVar.zzb()) {
                                                    Class<?> cls = obj7.getClass();
                                                    obj4 = obj7;
                                                    i46 = i114;
                                                    unsafe3 = unsafe7;
                                                    obj8 = obj8;
                                                    i45 = i105;
                                                    iZza18 = zzT(bArr, i116, i11, zziesVar, cls, zziabVar);
                                                    obj9 = zziabVar.zzc;
                                                } else {
                                                    i44 = i116;
                                                    i45 = i105;
                                                    unsafe3 = unsafe7;
                                                    obj4 = obj7;
                                                    i46 = i114;
                                                }
                                            }
                                            obj8 = obj8;
                                            i105 = i45;
                                            i104 = i46;
                                            obj7 = obj4;
                                            unsafe6 = unsafe3;
                                        } else {
                                            i44 = i116;
                                            i45 = i105;
                                            unsafe3 = unsafe7;
                                            obj4 = obj7;
                                            i46 = i114;
                                            zzies zziesVar2 = zzicuVarZze.zza;
                                            if (i118 == zziesVar2.zzb()) {
                                                iZza18 = zzT(bArr, i44, i11, zziesVar2, null, zziabVar);
                                                obj8 = zziabVar.zzc;
                                                obj9 = obj9;
                                            }
                                            i105 = i45;
                                            i104 = i46;
                                            obj7 = obj4;
                                            unsafe6 = unsafe3;
                                        }
                                        iZza18 = zziac.zzp(i115, bArr, i44, i45, zziabVar);
                                        obj8 = obj8;
                                        i105 = i45;
                                        i104 = i46;
                                        obj7 = obj4;
                                        unsafe6 = unsafe3;
                                    }
                                    int i119 = i104;
                                    Unsafe unsafe8 = unsafe6;
                                    Object obj10 = obj8;
                                    int i120 = i105;
                                    if (iZza18 != i113) {
                                        throw new zzicg(str);
                                    }
                                    zzicwVar.put(obj10, obj9);
                                    if (i113 != i119) {
                                        obj5 = obj;
                                        i12 = i12;
                                        i49 = i16 == true ? 1 : 0;
                                        iZzo = i113;
                                        i48 = i28;
                                        i11 = i120;
                                        i50 = i19;
                                        i51 = i29;
                                        i52 = i20;
                                        unsafe4 = unsafe8;
                                        zzidfVar4 = this;
                                        zziabVar4 = zziabVar;
                                    } else {
                                        zziabVar2 = zziabVar;
                                        i18 = i113;
                                        i22 = i28;
                                        str = str;
                                        i21 = i29;
                                        unsafe = unsafe8;
                                        obj2 = obj;
                                        i14 = i12;
                                    }
                                } else {
                                    zziabVar3 = zziabVar;
                                    i27 = i104;
                                    unsafe2 = unsafe6;
                                    str2 = str;
                                    str = str2;
                                    zziabVar2 = zziabVar3;
                                    i22 = i28;
                                    i18 = i27;
                                    i21 = i29;
                                    unsafe = unsafe2;
                                    obj2 = obj;
                                    i14 = i12;
                                }
                            }
                        } else if (i56 == 2) {
                            zzicd zzicdVarZzh2 = (zzicd) unsafe5.getObject(obj5, j10);
                            if (!zzicdVarZzh2.zza()) {
                                int size2 = zzicdVarZzh2.size();
                                zzicdVarZzh2 = zzicdVarZzh2.zzh(size2 == 0 ? 10 : size2 + size2);
                                unsafe5.putObject(obj5, j10, zzicdVarZzh2);
                            }
                            zzicd zzicdVar2 = zzicdVarZzh2;
                            i51 = i55;
                            int iZzn2 = zziac.zzn(zzidfVar5.zzq(iZzS), i16 == true ? 1 : 0, bArr, i64, i11, zzicdVar2, zziabVar);
                            i11 = i11;
                            i12 = i12;
                            zziabVar4 = zziabVar5;
                            iZzo = iZzn2;
                            unsafe4 = unsafe5;
                            i49 = i16 == true ? 1 : 0;
                            i52 = i20;
                            zzidfVar4 = zzidfVar5;
                            i48 = iZzS;
                            i50 = i19;
                        } else {
                            zziabVar3 = zziabVar5;
                            i27 = i64;
                            i28 = iZzS;
                            unsafe2 = unsafe5;
                            str2 = str;
                            i29 = i55;
                            str = str2;
                            zziabVar2 = zziabVar3;
                            i22 = i28;
                            i18 = i27;
                            i21 = i29;
                            unsafe = unsafe2;
                            obj2 = obj;
                            i14 = i12;
                        }
                    }
                } else {
                    i18 = iZzb;
                    i19 = i50;
                    i20 = i52;
                    this = zzidfVar4;
                    str = "Failed to parse the message.";
                    i21 = i55;
                    unsafe = unsafe4;
                    i14 = i12;
                    i22 = 0;
                    i16 = i17;
                    obj2 = obj5;
                    zziabVar2 = zziabVar4;
                }
                if (i16 != i14 || i14 == 0) {
                    if (this.zzh) {
                        zzibb zzibbVar = zziabVar2.zzd;
                        zzibb zzibbVar2 = zzibb.zza;
                        int i121 = zziaa.zza;
                        if (zzibbVar != zzibb.zza) {
                            zzidc zzidcVar = this.zzg;
                            int i122 = zziac.zza;
                            if (zzibbVar.zzc(zzidcVar, i21) != null) {
                                throw null;
                            }
                            iZzo = zziac.zzo((i16 == true ? 1 : 0) == true ? 1 : 0, bArr, i18, i11, zzh(obj), zziabVar);
                        } else {
                            iZzo = zziac.zzo((i16 == true ? 1 : 0) == true ? 1 : 0, bArr, i18, i11, zzh(obj), zziabVar);
                        }
                    } else {
                        iZzo = zziac.zzo((i16 == true ? 1 : 0) == true ? 1 : 0, bArr, i18, i11, zzh(obj), zziabVar);
                    }
                    i12 = i14;
                    i51 = i21;
                    i49 = i16 == true ? 1 : 0;
                    zzidfVar4 = this;
                    i50 = i19;
                    i52 = i20;
                    i48 = i22;
                    zziabVar4 = zziabVar2;
                    obj5 = obj2;
                    unsafe4 = unsafe;
                } else {
                    i13 = i11;
                    i15 = i18;
                    i50 = i19;
                    i52 = i20;
                }
            } else {
                str = "Failed to parse the message.";
                unsafe = unsafe4;
                i13 = i11;
                this = zzidfVar4;
                obj2 = obj5;
                i14 = i12;
                i15 = iZzo;
                i16 = i49;
            }
        }
        if (i52 != 1048575) {
            unsafe.putInt(obj2, i52, i50);
        }
        zzieg zziegVar = null;
        for (int i123 = this.zzk; i123 < this.zzl; i123++) {
            zziegVar = (zzieg) zzx(obj, this.zzj[i123], zziegVar, this.zzm, obj);
        }
        if (zziegVar != null) {
            this.zzm.zzi(obj2, zziegVar);
        }
        if (i14 != 0) {
            String str6 = str;
            if (i15 > i13 || i16 != i14) {
                throw new zzicg(str6);
            }
        } else if (i15 != i13) {
            throw new zzicg(str);
        }
        return i15;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zziab zziabVar) throws IOException {
        zzi(obj, bArr, i10, i11, 0, zziabVar);
    }

    private final int zzA(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 2];
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzibr) {
            return ((zzibr) obj).zzaX();
        }
        return true;
    }

    private final int zzR(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzS(i10, 0);
    }

    private final int zzS(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static final int zzT(byte[] bArr, int i10, int i11, zzies zziesVar, Class cls, zziab zziabVar) throws IOException {
        int i12;
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                i12 = i10 + 8;
                zziabVar.zzc = Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                zziabVar.zzc = Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i10)));
                break;
            case 2:
            case 3:
                int iZzc = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Long.valueOf(zziabVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zziac.zza(bArr, i10, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziabVar.zza);
                return iZza;
            case 5:
            case 15:
                i12 = i10 + 8;
                zziabVar.zzc = Long.valueOf(zziac.zze(bArr, i10));
                break;
            case 6:
            case 14:
                i12 = i10 + 4;
                zziabVar.zzc = Integer.valueOf(zziac.zzd(bArr, i10));
                break;
            case 7:
                int iZzc2 = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Boolean.valueOf(zziabVar.zzb != 0);
                return iZzc2;
            case 8:
                return zziac.zzf(bArr, i10, zziabVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zziac.zzh(zzidm.zza().zzb(cls), bArr, i10, i11, zziabVar);
            case 11:
                return zziac.zzg(bArr, i10, zziabVar);
            case 16:
                int iZza2 = zziac.zza(bArr, i10, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziaq.zzK(zziabVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Long.valueOf(zziaq.zzL(zziabVar.zzb));
                return iZzc3;
        }
        return i12;
    }

    private static final void zzU(int i10, Object obj, zzieu zzieuVar) throws IOException {
        if (obj instanceof String) {
            zzieuVar.zzm(i10, (String) obj);
        } else {
            zzieuVar.zzn(i10, (zzian) obj);
        }
    }

    public static zzieg zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zziegVarZzb = zzieg.zzb();
        zzibrVar.zzt = zziegVarZzb;
        return zziegVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:129:0x027f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0282  */
    /* JADX WARN: Code duplicated, block: B:184:0x0398  */
    public static zzidf zzm(Class cls, zzicz zziczVar, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldZzn;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldZzn2;
        int i35;
        Object obj2;
        Field fieldZzn3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        if (!(zziczVar instanceof zzido)) {
            throw null;
        }
        zzido zzidoVar = (zzido) zziczVar;
        String strZzd = zzidoVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strZzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i42 = iCharAt3 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strZzd.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt3 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt3 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i14 = 0;
            i12 = 0;
            iArr = zza;
            i15 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt4 = strZzd.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    cCharAt8 = strZzd.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                iCharAt4 = i45 | (cCharAt8 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int iCharAt5 = strZzd.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt7 = strZzd.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt5 = i48 | (cCharAt7 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt6 = strZzd.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt6 = strZzd.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt6 = i51 | (cCharAt6 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int iCharAt7 = strZzd.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt5 = strZzd.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt7 = i54 | (cCharAt5 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            iCharAt = strZzd.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            iCharAt2 = strZzd.charAt(i56);
            if (iCharAt2 >= 55296) {
                int i60 = iCharAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt2 = i60 | (cCharAt3 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strZzd.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt2 = strZzd.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strZzd.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    cCharAt = strZzd.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i16;
            }
            int i68 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i11 = iCharAt6;
            i12 = iCharAt9;
            i13 = i68;
            iArr = iArr2;
            i14 = iCharAt7;
            i15 = iCharAt4;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzidoVar.zze();
        Class<?> cls2 = zzidoVar.zzb().getClass();
        int i69 = i12 + iCharAt2;
        int i70 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = i12;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int iCharAt10 = strZzd.charAt(i41);
            if (iCharAt10 >= c10) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    cCharAt12 = strZzd.charAt(i77);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i24 = i38;
            } else {
                i24 = i75;
            }
            int i79 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c10) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    cCharAt11 = strZzd.charAt(i81);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i25 = i37;
            } else {
                i25 = i79;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int i83 = iCharAt11 & 255;
            int i84 = length;
            int i85 = iCharAt11 & 2048;
            int i86 = i14;
            if (i83 >= 51) {
                int i87 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i36 = i89 + 1;
                        cCharAt10 = strZzd.charAt(i89);
                        i26 = i11;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i89 = i36;
                        i11 = i26;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i90);
                    i32 = i36;
                } else {
                    i26 = i11;
                    i32 = i87;
                }
                int i91 = i83 - 51;
                int i92 = i32;
                if (i91 == 9 || i91 == 17) {
                    i33 = i13 + 1;
                    int i93 = i74 / 3;
                    objArr[i93 + i93 + 1] = objArrZze[i13];
                } else {
                    if (i91 == 12) {
                        if (zzidoVar.zzc() == 1 || i85 != 0) {
                            i33 = i13 + 1;
                            int i94 = i74 / 3;
                            objArr[i94 + i94 + 1] = objArrZze[i13];
                        } else {
                            i85 = 0;
                        }
                    }
                    i34 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i34];
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i34] = fieldZzn2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i35 = i34 + 1;
                    obj2 = objArrZze[i35];
                    int i95 = i85;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i35] = fieldZzn3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i27 = i13;
                    i28 = i92;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i29 = 0;
                    zzidoVar = zzidoVar;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i30 = i95;
                }
                i13 = i33;
                i34 = iCharAt12 + iCharAt12;
                obj = objArrZze[i34];
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i34] = fieldZzn2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzn2);
                i35 = i34 + 1;
                obj2 = objArrZze[i35];
                int i96 = i85;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i35] = fieldZzn3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i27 = i13;
                i28 = i92;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i29 = 0;
                zzidoVar = zzidoVar;
                iObjectFieldOffset = iObjectFieldOffset5;
                i30 = i96;
            } else {
                i26 = i11;
                i27 = i13 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i13]);
                if (i83 == 9 || i83 == 17) {
                    zzidoVar = zzidoVar;
                    int i97 = i74 / 3;
                    objArr[i97 + i97 + 1] = fieldZzn4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i31 = i27 + 1;
                        int i98 = i74 / 3;
                        objArr[i98 + i98 + 1] = objArrZze[i27];
                        i27 = i31;
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        zzidoVar = zzidoVar;
                        if (zzidoVar.zzc() == 1 || i85 != 0) {
                            i31 = i27 + 1;
                            int i99 = i74 / 3;
                            objArr[i99 + i99 + 1] = objArrZze[i27];
                            i27 = i31;
                        } else {
                            i85 = 0;
                        }
                    } else if (i83 == 50) {
                        int i100 = i27 + 1;
                        int i101 = i71 + 1;
                        iArr[i71] = i74;
                        int i102 = i74 / 3;
                        int i103 = i102 + i102;
                        objArr[i103] = objArrZze[i27];
                        if (i85 != 0) {
                            i27 = i100 + 1;
                            objArr[i103 + 1] = objArrZze[i100];
                            i71 = i101;
                            zzidoVar = zzidoVar;
                        } else {
                            i27 = i100;
                            i71 = i101;
                            i85 = 0;
                            zzidoVar = zzidoVar;
                        }
                    } else {
                        zzidoVar = zzidoVar;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                        i28 = i25;
                        i29 = 0;
                    } else {
                        int i104 = i25 + 1;
                        int iCharAt13 = strZzd.charAt(i25);
                        if (iCharAt13 >= 55296) {
                            int i105 = iCharAt13 & 8191;
                            int i106 = 13;
                            while (true) {
                                i28 = i104 + 1;
                                cCharAt9 = strZzd.charAt(i104);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i105 |= (cCharAt9 & 8191) << i106;
                                i106 += 13;
                                i104 = i28;
                            }
                            iCharAt13 = i105 | (cCharAt9 << i106);
                        } else {
                            i28 = i104;
                        }
                        int i107 = i15 + i15 + (iCharAt13 / 32);
                        Object obj3 = objArrZze[i107];
                        if (obj3 instanceof Field) {
                            fieldZzn = (Field) obj3;
                        } else {
                            fieldZzn = zzn(cls2, (String) obj3);
                            objArrZze[i107] = fieldZzn;
                        }
                        i29 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
                    }
                    if (i83 >= 18 && i83 <= 49) {
                        iArr[i72] = iObjectFieldOffset;
                        i72++;
                    }
                    i30 = i85;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i28 = i25;
                    i29 = 0;
                } else {
                    i28 = i25;
                    i29 = 0;
                }
                if (i83 >= 18) {
                    iArr[i72] = iObjectFieldOffset;
                    i72++;
                }
                i30 = i85;
            }
            int i108 = i74 + 1;
            iArr3[i74] = iCharAt10;
            int i109 = i108 + 1;
            iArr3[i108] = iObjectFieldOffset | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i30 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20);
            iArr3[i109] = (i29 << 20) | iObjectFieldOffset2;
            i74 = i109 + 1;
            i13 = i27;
            strZzd = strZzd;
            length = i84;
            i14 = i86;
            zzidoVar = zzidoVar;
            i41 = i28;
            i11 = i26;
            c10 = 55296;
        }
        return new zzidf(iArr3, objArr, i11, i14, zzidoVar.zzb(), false, iArr, i12, i69, zzidiVar, zzicoVar, zziefVar, zzibcVar, zzicxVar);
    }

    private final void zzp(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzP(obj2, i11, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzidu zziduVarZzq = zzq(i10);
            if (!zzP(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzQ(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final zzidu zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzidu zziduVar = (zzidu) objArr[i12];
        if (zziduVar != null) {
            return zziduVar;
        }
        zzidu zziduVarZzb = zzidm.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zziduVarZzb;
        return zziduVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzibx zzs(int i10) {
        int i11 = i10 / 3;
        return (zzibx) this.zzd[i11 + i11 + 1];
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzO(obj, i10);
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzQ(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzief zziefVar, Object obj3) {
        zzibx zzibxVarZzs;
        int i11 = this.zzc[i10];
        Object objZzn = zziem.zzn(obj, zzA(i10) & 1048575);
        if (objZzn == null || (zzibxVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzicu zzicuVarZze = ((zzicv) zzr(i10)).zze();
        Iterator it = ((zzicw) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzibxVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziefVar.zzh(obj3);
                }
                int iZzc = zzicv.zzc(zzicuVarZze, entry.getKey(), entry.getValue());
                zzian zzianVar = zzian.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zziaw.zzf;
                zziat zziatVar = new zziat(bArr, 0, iZzc);
                try {
                    zzicv.zzb(zziatVar, zzicuVarZze, entry.getKey(), entry.getValue());
                    zziefVar.zzd(obj2, i11, zziaj.zza(zziatVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final Object zza() {
        return ((zzibr) this.zzg).zzbg();
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0396  */
    /* JADX WARN: Code duplicated, block: B:207:0x0560  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v261 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v116, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zze(Object obj) {
        int i10;
        ?? r16;
        ?? r10;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzA5;
        int iZzc;
        int iZzA6;
        ?? Zzs;
        int size;
        int iZzA7;
        int iZzc2;
        int iZzA8;
        int iZzc3;
        int iZzA9;
        ?? r11;
        int iZzaT;
        int iZzA10;
        ?? ZzA;
        ?? ZzD;
        int iZzB2;
        int iZzA11;
        int iZzA12;
        ?? r12;
        ?? r13;
        ?? r14;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        boolean z10 = false;
        int i12 = 1048575;
        ?? r15 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i13 >= iArr.length) {
                int iZzi = i14 + ((zzibr) obj).zzt.zzi();
                if (!this.zzh) {
                    return iZzi;
                }
                zzieb zziebVar = ((zzibn) obj).zza.zza;
                int iZzc4 = zziebVar.zzc();
                int iZzj = 0;
                for (int i15 = 0; i15 < iZzc4; i15++) {
                    Map.Entry entryZzd = zziebVar.zzd(i15);
                    iZzj += zzibg.zzj((zzibf) ((zzidy) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zziebVar.zze()) {
                    iZzj += zzibg.zzj((zzibf) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA13 = zzA(i13);
            int iZzC = zzC(iZzA13);
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & i11;
            if (iZzC <= 17) {
                if (i18 != i12) {
                    r14 = i18 == i11 ? z10 : unsafe.getInt(obj, i18);
                    i12 = i18;
                }
                i10 = i12;
                r16 = r14;
                r10 = 1 << (i17 >>> 20);
            } else {
                r14 = r15;
                i10 = i12;
                r16 = r15 == true ? 1 : 0;
                r10 = z10;
            }
            int i19 = iZzA13 & i11;
            if (iZzC >= zzibh.zzJ.zza()) {
                zzibh.zzW.zza();
            }
            long j10 = i19;
            switch (iZzC) {
                case 0:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA = zziaw.zzA(i16 << 3);
                        ZzD = iZzA + 8;
                        i14 += ZzD;
                    }
                    break;
                case 1:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA2 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA2 + 4;
                        i14 += ZzD;
                    }
                    break;
                case 2:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(j11);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 3:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(j12);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 4:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(j13);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 5:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA = zziaw.zzA(i16 << 3);
                        ZzD = iZzA + 8;
                        i14 += ZzD;
                    }
                    break;
                case 6:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA2 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA2 + 4;
                        i14 += ZzD;
                    }
                    break;
                case 7:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA4 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA4 + 1;
                        i14 += ZzD;
                    }
                    break;
                case 8:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzian) {
                            iZzA5 = zziaw.zzA(i20);
                            iZzc = ((zzian) object).zzc();
                            iZzA6 = zziaw.zzA(iZzc);
                        } else {
                            iZzA5 = zziaw.zzA(i20);
                            iZzc = zzier.zzc((String) object);
                            iZzA6 = zziaw.zzA(iZzc);
                        }
                        ZzD = iZzA5 + iZzA6 + iZzc;
                        i14 += ZzD;
                    }
                    break;
                case 9:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        ZzD = zzidw.zzD(i16, unsafe.getObject(obj, j10), zzq(i13));
                        i14 += ZzD;
                    }
                    break;
                case 10:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        zzian zzianVar = (zzian) unsafe.getObject(obj, j10);
                        iZzA5 = zziaw.zzA(i16 << 3);
                        iZzc = zzianVar.zzc();
                        iZzA6 = zziaw.zzA(iZzc);
                        ZzD = iZzA5 + iZzA6 + iZzc;
                        i14 += ZzD;
                    }
                    break;
                case 11:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzA(i21);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 12:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(j14);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 13:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA2 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA2 + 4;
                        i14 += ZzD;
                    }
                    break;
                case 14:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        iZzA = zziaw.zzA(i16 << 3);
                        ZzD = iZzA + 8;
                        i14 += ZzD;
                    }
                    break;
                case 15:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzA((i22 >> 31) ^ (i22 + i22));
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 16:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB((j15 >> 63) ^ (j15 + j15));
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 17:
                    if (zzM(obj, i13, i10, r16 == true ? 1 : 0, r10)) {
                        ZzD = zzidw.zzE(i16, (zzidc) unsafe.getObject(obj, j10), zzq(i13));
                        i14 += ZzD;
                    }
                    break;
                case 18:
                    ZzD = zzidw.zzC(i16, (List) unsafe.getObject(obj, j10), z10);
                    i14 += ZzD;
                    break;
                case 19:
                    ZzD = zzidw.zzA(i16, (List) unsafe.getObject(obj, j10), z10);
                    i14 += ZzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i23 = zzidw.zza;
                    if (list.size() == 0) {
                        Zzs = z10;
                    } else {
                        Zzs = zzidw.zzs(list) + (list.size() * zziaw.zzA(i16 << 3));
                    }
                    i14 += Zzs;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzidw.zza;
                    size = list2.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzA3 = zzidw.zzt(list2);
                        iZzA7 = zziaw.zzA(i16 << 3);
                        iZzB = size * iZzA7;
                        ZzD = iZzA3 + iZzB;
                    }
                    i14 += ZzD;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzidw.zza;
                    size = list3.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzA3 = zzidw.zzw(list3);
                        iZzA7 = zziaw.zzA(i16 << 3);
                        iZzB = size * iZzA7;
                        ZzD = iZzA3 + iZzB;
                    }
                    i14 += ZzD;
                    break;
                case 23:
                    ZzD = zzidw.zzC(i16, (List) unsafe.getObject(obj, j10), z10);
                    i14 += ZzD;
                    break;
                case 24:
                    ZzD = zzidw.zzA(i16, (List) unsafe.getObject(obj, j10), z10);
                    i14 += ZzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzidw.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        ZzD = z10;
                    } else {
                        ZzD = size2 * (zziaw.zzA(i16 << 3) + 1);
                    }
                    i14 += ZzD;
                    break;
                case 26:
                    ?? r17 = (List) unsafe.getObject(obj, j10);
                    int i27 = zzidw.zza;
                    int size3 = r17.size();
                    if (size3 == 0) {
                        Zzs = z10;
                    } else {
                        int iZzA14 = zziaw.zzA(i16 << 3) * size3;
                        if (r17 instanceof zzicn) {
                            zzicn zzicnVar = (zzicn) r17;
                            for (?? r18 = z10; r18 < size3; r18++) {
                                Object objZzc = zzicnVar.zzc();
                                if (objZzc instanceof zzian) {
                                    Zzs = iZzA14;
                                    iZzc3 = ((zzian) objZzc).zzc();
                                    iZzA9 = zziaw.zzA(iZzc3);
                                } else {
                                    Zzs = iZzA14;
                                    iZzc3 = zzier.zzc((String) objZzc);
                                    iZzA9 = zziaw.zzA(iZzc3);
                                }
                                Zzs += iZzA9 + iZzc3;
                            }
                            Zzs = iZzA14;
                        } else {
                            for (?? r19 = z10; r19 < size3; r19++) {
                                Object obj2 = r17.get(r19);
                                if (obj2 instanceof zzian) {
                                    Zzs = iZzA14;
                                    iZzc2 = ((zzian) obj2).zzc();
                                    iZzA8 = zziaw.zzA(iZzc2);
                                } else {
                                    Zzs = iZzA14;
                                    iZzc2 = zzier.zzc((String) obj2);
                                    iZzA8 = zziaw.zzA(iZzc2);
                                }
                                Zzs += iZzA8 + iZzc2;
                            }
                            Zzs = iZzA14;
                        }
                    }
                    i14 += Zzs;
                    break;
                case 27:
                    ?? r20 = (List) unsafe.getObject(obj, j10);
                    zzidu zziduVarZzq = zzq(i13);
                    int i28 = zzidw.zza;
                    int size4 = r20.size();
                    if (size4 == 0) {
                        r11 = z10;
                    } else {
                        int iZzA15 = zziaw.zzA(i16 << 3) * size4;
                        for (?? r21 = z10; r21 < size4; r21++) {
                            Object obj3 = r20.get(r21);
                            if (obj3 instanceof zzicm) {
                                r11 = iZzA15;
                                iZzaT = ((zzicm) obj3).zzb();
                                iZzA10 = zziaw.zzA(iZzaT);
                            } else {
                                r11 = iZzA15;
                                iZzaT = ((zzhzw) obj3).zzaT(zziduVarZzq);
                                iZzA10 = zziaw.zzA(iZzaT);
                            }
                            r11 = (r11 == true ? 1 : 0) + iZzA10 + iZzaT;
                        }
                        r11 = iZzA15;
                    }
                    i14 += r11;
                    break;
                case 28:
                    ?? r22 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzidw.zza;
                    int size5 = r22.size();
                    if (size5 == 0) {
                        ZzA = z10;
                    } else {
                        ZzA = size5 * zziaw.zzA(i16 << 3);
                        for (?? r23 = z10; r23 < r22.size(); r23++) {
                            int iZzc5 = ((zzian) r22.get(r23)).zzc();
                            ZzA += zziaw.zzA(iZzc5) + iZzc5;
                        }
                    }
                    i14 += ZzA;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i30 = zzidw.zza;
                    size = list5.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzA3 = zzidw.zzx(list5);
                        iZzA7 = zziaw.zzA(i16 << 3);
                        iZzB = size * iZzA7;
                        ZzD = iZzA3 + iZzB;
                    }
                    i14 += ZzD;
                    break;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzidw.zza;
                    size = list6.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzA3 = zzidw.zzv(list6);
                        iZzA7 = zziaw.zzA(i16 << 3);
                        iZzB = size * iZzA7;
                        ZzD = iZzA3 + iZzB;
                    }
                    i14 += ZzD;
                    break;
                case 31:
                    ZzD = zzidw.zzA(i16, (List) unsafe.getObject(obj, j10), z10);
                    i14 += ZzD;
                    break;
                case 32:
                    ZzD = zzidw.zzC(i16, (List) unsafe.getObject(obj, j10), z10);
                    i14 += ZzD;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i32 = zzidw.zza;
                    size = list7.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzA3 = zzidw.zzy(list7);
                        iZzA7 = zziaw.zzA(i16 << 3);
                        iZzB = size * iZzA7;
                        ZzD = iZzA3 + iZzB;
                    }
                    i14 += ZzD;
                    break;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzidw.zza;
                    size = list8.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzA3 = zzidw.zzu(list8);
                        iZzA7 = zziaw.zzA(i16 << 3);
                        iZzB = size * iZzA7;
                        ZzD = iZzA3 + iZzB;
                    }
                    i14 += ZzD;
                    break;
                case 35:
                    iZzB2 = zzidw.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 36:
                    iZzB2 = zzidw.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 37:
                    iZzB2 = zzidw.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 38:
                    iZzB2 = zzidw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 39:
                    iZzB2 = zzidw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 40:
                    iZzB2 = zzidw.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 41:
                    iZzB2 = zzidw.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzidw.zza;
                    iZzB2 = list9.size();
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 43:
                    iZzB2 = zzidw.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 44:
                    iZzB2 = zzidw.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 45:
                    iZzB2 = zzidw.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 46:
                    iZzB2 = zzidw.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 47:
                    iZzB2 = zzidw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 48:
                    iZzB2 = zzidw.zzu((List) unsafe.getObject(obj, j10));
                    if (iZzB2 > 0) {
                        iZzA11 = zziaw.zzA(i16 << 3);
                        iZzA12 = zziaw.zzA(iZzB2);
                        ZzA = iZzA11 + iZzA12 + iZzB2;
                        i14 += ZzA;
                    }
                    break;
                case 49:
                    ?? r24 = (List) unsafe.getObject(obj, j10);
                    zzidu zziduVarZzq2 = zzq(i13);
                    int i35 = zzidw.zza;
                    int size6 = r24.size();
                    if (size6 == 0) {
                        r12 = z10;
                    } else {
                        boolean z11 = z10;
                        r12 = z11;
                        while (r13 < size6) {
                            r13 = z11;
                            int iZzE = zzidw.zzE(i16, (zzidc) r24.get(r13), zziduVarZzq2);
                            r13++;
                            r12 = (r12 == true ? 1 : 0) + iZzE;
                        }
                        r13 = z11;
                    }
                    i14 += r12;
                    break;
                case 50:
                    zzicw zzicwVar = (zzicw) unsafe.getObject(obj, j10);
                    zzicv zzicvVar = (zzicv) zzr(i13);
                    if (zzicwVar.isEmpty()) {
                        Zzs = z10;
                    } else {
                        Zzs = z10;
                        for (Map.Entry entry2 : zzicwVar.entrySet()) {
                            Zzs += zzicvVar.zzd(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i14 += Zzs;
                    break;
                case 51:
                    if (zzP(obj, i16, i13)) {
                        iZzA = zziaw.zzA(i16 << 3);
                        ZzD = iZzA + 8;
                        i14 += ZzD;
                    }
                    break;
                case 52:
                    if (zzP(obj, i16, i13)) {
                        iZzA2 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA2 + 4;
                        i14 += ZzD;
                    }
                    break;
                case 53:
                    if (zzP(obj, i16, i13)) {
                        long jZzJ = zzJ(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(jZzJ);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 54:
                    if (zzP(obj, i16, i13)) {
                        long jZzJ2 = zzJ(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(jZzJ2);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 55:
                    if (zzP(obj, i16, i13)) {
                        long jZzI = zzI(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(jZzI);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 56:
                    if (zzP(obj, i16, i13)) {
                        iZzA = zziaw.zzA(i16 << 3);
                        ZzD = iZzA + 8;
                        i14 += ZzD;
                    }
                    break;
                case 57:
                    if (zzP(obj, i16, i13)) {
                        iZzA2 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA2 + 4;
                        i14 += ZzD;
                    }
                    break;
                case 58:
                    if (zzP(obj, i16, i13)) {
                        iZzA4 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA4 + 1;
                        i14 += ZzD;
                    }
                    break;
                case 59:
                    if (zzP(obj, i16, i13)) {
                        int i36 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzian) {
                            iZzA5 = zziaw.zzA(i36);
                            iZzc = ((zzian) object2).zzc();
                            iZzA6 = zziaw.zzA(iZzc);
                        } else {
                            iZzA5 = zziaw.zzA(i36);
                            iZzc = zzier.zzc((String) object2);
                            iZzA6 = zziaw.zzA(iZzc);
                        }
                        ZzD = iZzA5 + iZzA6 + iZzc;
                        i14 += ZzD;
                    }
                    break;
                case 60:
                    if (zzP(obj, i16, i13)) {
                        ZzD = zzidw.zzD(i16, unsafe.getObject(obj, j10), zzq(i13));
                        i14 += ZzD;
                    }
                    break;
                case 61:
                    if (zzP(obj, i16, i13)) {
                        zzian zzianVar2 = (zzian) unsafe.getObject(obj, j10);
                        iZzA5 = zziaw.zzA(i16 << 3);
                        iZzc = zzianVar2.zzc();
                        iZzA6 = zziaw.zzA(iZzc);
                        ZzD = iZzA5 + iZzA6 + iZzc;
                        i14 += ZzD;
                    }
                    break;
                case 62:
                    if (zzP(obj, i16, i13)) {
                        int iZzI = zzI(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzA(iZzI);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 63:
                    if (zzP(obj, i16, i13)) {
                        long jZzI2 = zzI(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB(jZzI2);
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 64:
                    if (zzP(obj, i16, i13)) {
                        iZzA2 = zziaw.zzA(i16 << 3);
                        ZzD = iZzA2 + 4;
                        i14 += ZzD;
                    }
                    break;
                case 65:
                    if (zzP(obj, i16, i13)) {
                        iZzA = zziaw.zzA(i16 << 3);
                        ZzD = iZzA + 8;
                        i14 += ZzD;
                    }
                    break;
                case 66:
                    if (zzP(obj, i16, i13)) {
                        int iZzI2 = zzI(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzA((iZzI2 >> 31) ^ (iZzI2 + iZzI2));
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 67:
                    if (zzP(obj, i16, i13)) {
                        long jZzJ3 = zzJ(obj, j10);
                        iZzA3 = zziaw.zzA(i16 << 3);
                        iZzB = zziaw.zzB((jZzJ3 >> 63) ^ (jZzJ3 + jZzJ3));
                        ZzD = iZzA3 + iZzB;
                        i14 += ZzD;
                    }
                    break;
                case 68:
                    if (zzP(obj, i16, i13)) {
                        ZzD = zzidw.zzE(i16, (zzidc) unsafe.getObject(obj, j10), zzq(i13));
                        i14 += ZzD;
                    }
                    break;
            }
            i13 += 3;
            i12 = i10;
            r15 = r16;
            i11 = 1048575;
            z10 = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0253  */
    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:102:0x026f  */
    /* JADX WARN: Code duplicated, block: B:103:0x027d  */
    /* JADX WARN: Code duplicated, block: B:104:0x028b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02df  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:113:0x030b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0318  */
    /* JADX WARN: Code duplicated, block: B:115:0x0325  */
    /* JADX WARN: Code duplicated, block: B:116:0x0332  */
    /* JADX WARN: Code duplicated, block: B:117:0x033f  */
    /* JADX WARN: Code duplicated, block: B:118:0x034c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0359  */
    /* JADX WARN: Code duplicated, block: B:120:0x0366  */
    /* JADX WARN: Code duplicated, block: B:121:0x0373  */
    /* JADX WARN: Code duplicated, block: B:123:0x0387  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:128:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:134:0x0407  */
    /* JADX WARN: Code duplicated, block: B:135:0x0410  */
    /* JADX WARN: Code duplicated, block: B:137:0x0428  */
    /* JADX WARN: Code duplicated, block: B:138:0x0431  */
    /* JADX WARN: Code duplicated, block: B:140:0x0449  */
    /* JADX WARN: Code duplicated, block: B:141:0x0452  */
    /* JADX WARN: Code duplicated, block: B:143:0x046a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0473  */
    /* JADX WARN: Code duplicated, block: B:146:0x048b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0496  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:156:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0515  */
    /* JADX WARN: Code duplicated, block: B:159:0x051e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0536  */
    /* JADX WARN: Code duplicated, block: B:162:0x053f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0557  */
    /* JADX WARN: Code duplicated, block: B:165:0x0560  */
    /* JADX WARN: Code duplicated, block: B:167:0x0578  */
    /* JADX WARN: Code duplicated, block: B:168:0x0581  */
    /* JADX WARN: Code duplicated, block: B:170:0x0599  */
    /* JADX WARN: Code duplicated, block: B:171:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:173:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:174:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:190:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:84:0x019e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    /* JADX WARN: Code duplicated, block: B:96:0x021b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0229  */
    /* JADX WARN: Code duplicated, block: B:98:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzf(Object obj, zzieu zzieuVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i10;
        Map.Entry entry2;
        int i11;
        long j10;
        int[] iArr;
        Map.Entry entry3;
        boolean z10;
        Object object;
        if (this.zzh) {
            zzibg zzibgVar = ((zzibn) obj).zza;
            if (zzibgVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zzibgVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < iArr2.length) {
            int iZzA = zzA(i15);
            int iZzC = zzC(iZzA);
            int i16 = iArr2[i15];
            if (iZzC <= 17) {
                int i17 = iArr2[i15 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                } else {
                    entry = entry;
                }
                int i19 = 1 << (i17 >>> 20);
                i10 = i13;
                i11 = i19;
                entry2 = entry;
            } else {
                i10 = i13;
                entry2 = entry;
                i11 = 0;
            }
            int i20 = i14;
            while (entry2 != null) {
                zzibc zzibcVar = this.zzn;
                if (((zzibo) entry2.getKey()).zza <= i16) {
                    zzibcVar.zzb(zzieuVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    j10 = iZzA & i12;
                    switch (iZzC) {
                        case 0:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzf(i16, zziem.zzl(obj, j10));
                            }
                            break;
                        case 1:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zze(i16, zziem.zzj(obj, j10));
                            }
                            break;
                        case 2:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzc(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 3:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzh(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 4:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzi(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 5:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzj(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 6:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzk(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 7:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzl(i16, zziem.zzh(obj, j10));
                            }
                            break;
                        case 8:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzU(i16, unsafe.getObject(obj, j10), zzieuVar);
                            }
                            break;
                        case 9:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            break;
                        case 10:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzn(i16, (zzian) unsafe.getObject(obj, j10));
                            }
                            break;
                        case 11:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzo(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 12:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzg(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 13:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzb(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 14:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzd(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 15:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzp(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 16:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzq(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 17:
                            entry3 = entry2;
                            iArr = iArr2;
                            if (zzM(obj, i15, i10, i20, i11)) {
                                zzieuVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            break;
                        case 18:
                            z10 = false;
                            zzidw.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 19:
                            z10 = false;
                            zzidw.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 20:
                            z10 = false;
                            zzidw.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 21:
                            z10 = false;
                            zzidw.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 22:
                            z10 = false;
                            zzidw.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 23:
                            z10 = false;
                            zzidw.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 24:
                            z10 = false;
                            zzidw.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 25:
                            z10 = false;
                            zzidw.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 26:
                            zzidw.zzo(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 27:
                            zzidw.zzq(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, zzq(i15));
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 28:
                            zzidw.zzp(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 29:
                            z10 = false;
                            zzidw.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 30:
                            z10 = false;
                            zzidw.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 31:
                            z10 = false;
                            zzidw.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 32:
                            z10 = false;
                            zzidw.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 33:
                            z10 = false;
                            zzidw.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 34:
                            z10 = false;
                            zzidw.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 35:
                            zzidw.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 36:
                            zzidw.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 37:
                            zzidw.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 38:
                            zzidw.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 39:
                            zzidw.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 40:
                            zzidw.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 41:
                            zzidw.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 42:
                            zzidw.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 43:
                            zzidw.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 44:
                            zzidw.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 45:
                            zzidw.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 46:
                            zzidw.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 47:
                            zzidw.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 48:
                            zzidw.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 49:
                            zzidw.zzr(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, zzq(i15));
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 50:
                            object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                zzieuVar.zzM(i16, ((zzicv) zzr(i15)).zze(), (zzicw) object);
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzf(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zze(i16, zzH(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzc(i16, zzJ(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzh(i16, zzJ(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzi(i16, zzI(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzj(i16, zzJ(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzk(i16, zzI(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzl(i16, zzK(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (zzP(obj, i16, i15)) {
                                zzU(i16, unsafe.getObject(obj, j10), zzieuVar);
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 60:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzn(i16, (zzian) unsafe.getObject(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzo(i16, zzI(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzg(i16, zzI(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzb(i16, zzI(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzd(i16, zzJ(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzp(i16, zzI(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzq(i16, zzJ(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (zzP(obj, i16, i15)) {
                                zzieuVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        default:
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                    }
                    i15 += 3;
                    i13 = i10;
                    entry = entry3;
                    i14 = i20;
                    iArr2 = iArr;
                    i12 = 1048575;
                }
            }
            j10 = iZzA & i12;
            switch (iZzC) {
                case 0:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzf(i16, zziem.zzl(obj, j10));
                    }
                    break;
                case 1:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zze(i16, zziem.zzj(obj, j10));
                    }
                    break;
                case 2:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzc(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzh(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzi(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzj(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzk(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzl(i16, zziem.zzh(obj, j10));
                    }
                    break;
                case 8:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzU(i16, unsafe.getObject(obj, j10), zzieuVar);
                    }
                    break;
                case 9:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    break;
                case 10:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzn(i16, (zzian) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzo(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzg(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzb(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzd(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzp(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzq(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    entry3 = entry2;
                    iArr = iArr2;
                    if (zzM(obj, i15, i10, i20, i11)) {
                        zzieuVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    break;
                case 18:
                    z10 = false;
                    zzidw.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 19:
                    z10 = false;
                    zzidw.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 20:
                    z10 = false;
                    zzidw.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 21:
                    z10 = false;
                    zzidw.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 22:
                    z10 = false;
                    zzidw.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 23:
                    z10 = false;
                    zzidw.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 24:
                    z10 = false;
                    zzidw.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 25:
                    z10 = false;
                    zzidw.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 26:
                    zzidw.zzo(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 27:
                    zzidw.zzq(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, zzq(i15));
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 28:
                    zzidw.zzp(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 29:
                    z10 = false;
                    zzidw.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 30:
                    z10 = false;
                    zzidw.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 31:
                    z10 = false;
                    zzidw.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 32:
                    z10 = false;
                    zzidw.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 33:
                    z10 = false;
                    zzidw.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 34:
                    z10 = false;
                    zzidw.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 35:
                    zzidw.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 36:
                    zzidw.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 37:
                    zzidw.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 38:
                    zzidw.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 39:
                    zzidw.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 40:
                    zzidw.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 41:
                    zzidw.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 42:
                    zzidw.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 43:
                    zzidw.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 44:
                    zzidw.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 45:
                    zzidw.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 46:
                    zzidw.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 47:
                    zzidw.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 48:
                    zzidw.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 49:
                    zzidw.zzr(iArr2[i15], (List) unsafe.getObject(obj, j10), zzieuVar, zzq(i15));
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 50:
                    object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzieuVar.zzM(i16, ((zzicv) zzr(i15)).zze(), (zzicw) object);
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 51:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzf(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 52:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zze(i16, zzH(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 53:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzc(i16, zzJ(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 54:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzh(i16, zzJ(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 55:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzi(i16, zzI(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 56:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzj(i16, zzJ(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 57:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzk(i16, zzI(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 58:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzl(i16, zzK(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 59:
                    if (zzP(obj, i16, i15)) {
                        zzU(i16, unsafe.getObject(obj, j10), zzieuVar);
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 60:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 61:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzn(i16, (zzian) unsafe.getObject(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 62:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzo(i16, zzI(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 63:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzg(i16, zzI(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 64:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzb(i16, zzI(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 65:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzd(i16, zzJ(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 66:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzp(i16, zzI(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 67:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzq(i16, zzJ(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 68:
                    if (zzP(obj, i16, i15)) {
                        zzieuVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                default:
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
            }
            i15 += 3;
            i13 = i10;
            entry = entry3;
            i14 = i20;
            iArr2 = iArr;
            i12 = 1048575;
        }
        while (entry != null) {
            this.zzn.zzb(zzieuVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzibr) obj).zzt.zzg(zzieuVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1 A[LOOP:2: B:53:0x00e0->B:58:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x010e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        List list;
        zzidu zziduVarZzq;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i15];
            int i17 = iArr2[i16];
            int iZzA = zzA(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i13;
                i11 = i14;
            }
            if ((268435456 & iZzA) != 0 && !zzM(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzM(obj, i16, i10, i11, i20) && !zzy(obj, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zziem.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zziduVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zziduVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzP(obj, i17, i16) && !zzy(obj, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zziem.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    zziduVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zziduVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzicw zzicwVar = (zzicw) zziem.zzn(obj, iZzA & 1048575);
                if (!zzicwVar.isEmpty() && ((zzicv) zzr(i16)).zze().zzc.zza() == zziet.MESSAGE) {
                    zzidu zziduVarZzb = null;
                    for (Object obj2 : zzicwVar.values()) {
                        if (zziduVarZzb == null) {
                            zziduVarZzb = zzidm.zza().zzb(obj2.getClass());
                        }
                        if (!zziduVarZzb.zzl(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        return !this.zzh || ((zzibn) obj).zza.zze();
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j10) {
        return ((Double) zziem.zzn(obj, j10)).doubleValue();
    }

    private static float zzH(Object obj, long j10) {
        return ((Float) zziem.zzn(obj, j10)).floatValue();
    }

    private static int zzI(Object obj, long j10) {
        return ((Integer) zziem.zzn(obj, j10)).intValue();
    }

    private static long zzJ(Object obj, long j10) {
        return ((Long) zziem.zzn(obj, j10)).longValue();
    }

    private static boolean zzK(Object obj, long j10) {
        return ((Boolean) zziem.zzn(obj, j10)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        if (zzN(obj, i10) == zzN(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzM(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = iZzB & 1048575;
        if (j10 == 1048575) {
            int iZzA = zzA(i10);
            long j11 = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (Double.doubleToRawLongBits(zziem.zzl(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zziem.zzj(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zziem.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zziem.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zziem.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zziem.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zziem.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zziem.zzh(obj, j11);
                case 8:
                    Object objZzn = zziem.zzn(obj, j11);
                    if (objZzn instanceof String) {
                        if (((String) objZzn).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objZzn instanceof zzian) {
                        if (zzian.zza.equals(objZzn)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zziem.zzn(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzian.zza.equals(zziem.zzn(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zziem.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zziem.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zziem.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zziem.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zziem.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zziem.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zziem.zzn(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zziem.zzd(obj, j10) & (1 << (iZzB >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final void zzO(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zziem.zze(obj, j10, (1 << (iZzB >>> 20)) | zziem.zzd(obj, j10));
    }

    private final boolean zzP(Object obj, int i10, int i11) {
        if (zziem.zzd(obj, zzB(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private final void zzQ(Object obj, int i10, int i11) {
        zziem.zze(obj, zzB(i11) & 1048575, i10);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        if (!zzN(obj2, i10)) {
            return;
        }
        int iZzA = zzA(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = iZzA;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzidu zziduVarZzq = zzq(i10);
            if (!zzN(obj, i10)) {
                if (!zzE(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                }
                zzO(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
            return;
        }
        int i11 = this.zzc[i10];
        String string = obj2.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
        sb2.append("Source subfield ");
        sb2.append(i11);
        sb2.append(" is present but null: ");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString());
    }

    private final Object zzt(Object obj, int i10) {
        zzidu zziduVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzidu zziduVarZzq = zzq(i11);
        if (!zzP(obj, i10, i11)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private static boolean zzy(Object obj, int i10, zzidu zziduVar) {
        return zziduVar.zzl(zziem.zzn(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzidp zzidpVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zziem.zzo(obj, j10, zzidpVar.zzn());
        } else if (this.zzi) {
            zziem.zzo(obj, j10, zzidpVar.zzm());
        } else {
            zziem.zzo(obj, j10, zzidpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 < iArr.length) {
                int iZzA = zzA(i10);
                int i11 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                int i12 = iArr[i10];
                long j10 = i11;
                switch (iZzC) {
                    case 0:
                        if (zzN(obj2, i10)) {
                            zziem.zzm(obj, j10, zziem.zzl(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 1:
                        if (zzN(obj2, i10)) {
                            zziem.zzk(obj, j10, zziem.zzj(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 2:
                        if (zzN(obj2, i10)) {
                            zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 3:
                        if (zzN(obj2, i10)) {
                            zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 4:
                        if (zzN(obj2, i10)) {
                            zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 5:
                        if (zzN(obj2, i10)) {
                            zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 6:
                        if (zzN(obj2, i10)) {
                            zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 7:
                        if (zzN(obj2, i10)) {
                            zziem.zzi(obj, j10, zziem.zzh(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 8:
                        if (zzN(obj2, i10)) {
                            zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 9:
                        zzo(obj, obj2, i10);
                        break;
                    case 10:
                        if (zzN(obj2, i10)) {
                            zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 11:
                        if (zzN(obj2, i10)) {
                            zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 12:
                        if (zzN(obj2, i10)) {
                            zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 13:
                        if (zzN(obj2, i10)) {
                            zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 14:
                        if (zzN(obj2, i10)) {
                            zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 15:
                        if (zzN(obj2, i10)) {
                            zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 16:
                        if (zzN(obj2, i10)) {
                            zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                            zzO(obj, i10);
                        }
                        break;
                    case 17:
                        zzo(obj, obj2, i10);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zzicd zzicdVarZzh = (zzicd) zziem.zzn(obj, j10);
                        zzicd zzicdVar = (zzicd) zziem.zzn(obj2, j10);
                        int size = zzicdVarZzh.size();
                        int size2 = zzicdVar.size();
                        if (size > 0 && size2 > 0) {
                            if (!zzicdVarZzh.zza()) {
                                zzicdVarZzh = zzicdVarZzh.zzh(size2 + size);
                            }
                            zzicdVarZzh.addAll(zzicdVar);
                        }
                        if (size > 0) {
                            zzicdVar = zzicdVarZzh;
                        }
                        zziem.zzo(obj, j10, zzicdVar);
                        break;
                    case 50:
                        int i13 = zzidw.zza;
                        zziem.zzo(obj, j10, zzicx.zzb(zziem.zzn(obj, j10), zziem.zzn(obj2, j10)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (zzP(obj2, i12, i10)) {
                            zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                            zzQ(obj, i12, i10);
                        }
                        break;
                    case 60:
                        zzp(obj, obj2, i10);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (zzP(obj2, i12, i10)) {
                            zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                            zzQ(obj, i12, i10);
                        }
                        break;
                    case 68:
                        zzp(obj, obj2, i10);
                        break;
                }
                i10 += 3;
            } else {
                zzidw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzidw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzibr) {
                zzibr zzibrVar = (zzibr) obj;
                zzibrVar.zzbq();
                zzibrVar.zzbb();
                zzibrVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzA = zzA(i10);
                int i11 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j10 = i11;
                if (iZzC != 9) {
                    if (iZzC == 60 || iZzC == 68) {
                        if (zzP(obj, iArr[i10], i10)) {
                            zzq(i10).zzk(zzb.getObject(obj, j10));
                        }
                    } else {
                        switch (iZzC) {
                            case 17:
                                if (zzN(obj, i10)) {
                                    zzq(i10).zzk(zzb.getObject(obj, j10));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzicd) zziem.zzn(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzicw) object).zzd();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    }
                } else if (zzN(obj, i10)) {
                    zzq(i10).zzk(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }
}
