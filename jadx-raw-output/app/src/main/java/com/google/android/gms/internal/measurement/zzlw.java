package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlw {
    private static final Class zza;
    private static final zzml zzb;
    private static final zzml zzc;
    private static final zzml zzd;

    public static zzml zzA() {
        return zzc;
    }

    public static zzml zzB() {
        return zzd;
    }

    public static boolean zzZ(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static zzml zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzml) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static zzml zzz() {
        return zzb;
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmn();
    }

    public static Object zzC(int i10, List list, zzkg zzkgVar, Object obj, zzml zzmlVar) {
        if (zzkgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzkgVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, iIntValue, obj, zzmlVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzkgVar.zza(iIntValue2)) {
                    obj = zzD(i10, iIntValue2, obj, zzmlVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i10, int i11, Object obj, zzml zzmlVar) {
        if (obj == null) {
            obj = zzmlVar.zze();
        }
        zzmlVar.zzf(obj, i10, i11);
        return obj;
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzc(i10, list, z10);
    }

    public static void zzI(int i10, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zze(i10, list);
    }

    public static void zzJ(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzg(i10, list, z10);
    }

    public static void zzK(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzj(i10, list, z10);
    }

    public static void zzL(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzl(i10, list, z10);
    }

    public static void zzM(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzn(i10, list, z10);
    }

    public static void zzN(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzp(i10, list, z10);
    }

    public static void zzO(int i10, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjk) zzndVar).zzq(i10, list.get(i11), zzluVar);
        }
    }

    public static void zzP(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzs(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzu(i10, list, z10);
    }

    public static void zzR(int i10, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjk) zzndVar).zzv(i10, list.get(i11), zzluVar);
        }
    }

    public static void zzS(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzx(i10, list, z10);
    }

    public static void zzT(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzz(i10, list, z10);
    }

    public static void zzU(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzB(i10, list, z10);
    }

    public static void zzV(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzD(i10, list, z10);
    }

    public static void zzW(int i10, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzG(i10, list);
    }

    public static void zzX(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzI(i10, list, z10);
    }

    public static void zzY(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzK(i10, list, z10);
    }

    public static int zzo(int i10, Object obj, zzlu zzluVar) {
        if (!(obj instanceof zzkp)) {
            return zzjj.zzA(i10 << 3) + zzjj.zzx((zzlj) obj, zzluVar);
        }
        int iZzA = zzjj.zzA(i10 << 3);
        int iZza = ((zzkp) obj).zza();
        return iZzA + zzjj.zzA(iZza) + iZza;
    }

    public static void zzE(zzjp zzjpVar, Object obj, Object obj2) {
        zzjpVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzml zzmlVar, Object obj, Object obj2) {
        zzmlVar.zzh(obj, zzmlVar.zzd(zzmlVar.zzc(obj), zzmlVar.zzc(obj2)));
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i10 << 3) + 1);
    }

    public static void zzaa(zzle zzleVar, Object obj, Object obj2, long j10) {
        zzmv.zzs(obj, j10, zzle.zzb(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10)));
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = size * zzjj.zzz(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzz += zzjj.zzt((zzjb) list.get(i11));
        }
        return iZzz;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjj.zzz(i10));
    }

    public static int zze(List list) {
        int iZzv;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjj.zzv(zzkdVar.zze(i10));
                i10++;
            }
        } else {
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjj.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzv;
    }

    public static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i10 << 3) + 4);
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i10 << 3) + 8);
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i10, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZzu += zzjj.zzu(i10, (zzlj) list.get(i11), zzluVar);
        }
        return iZzu;
    }

    public static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzjj.zzz(i10));
    }

    public static int zzl(List list) {
        int iZzv;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjj.zzv(zzkdVar.zze(i10));
                i10++;
            }
        } else {
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjj.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzv;
    }

    public static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzjj.zzz(i10));
    }

    public static int zzn(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjj.zzB(zzkyVar.zza(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjj.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzp(int i10, List list, zzlu zzluVar) {
        int iZzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjj.zzz(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzkp) {
                iZzx = zzjj.zzw((zzkp) obj);
            } else {
                iZzx = zzjj.zzx((zzlj) obj, zzluVar);
            }
            iZzz += iZzx;
        }
        return iZzz;
    }

    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzjj.zzz(i10));
    }

    public static int zzr(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            iZzA = 0;
            while (i10 < size) {
                int iZze = zzkdVar.zze(i10);
                iZzA += zzjj.zzA((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzA += zzjj.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzjj.zzz(i10));
    }

    public static int zzt(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            iZzB = 0;
            while (i10 < size) {
                long jZza = zzkyVar.zza(i10);
                iZzB += zzjj.zzB((jZza >> 63) ^ (jZza + jZza));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzB += zzjj.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzu(int i10, List list) {
        int iZzy;
        int iZzy2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjj.zzz(i10) * size;
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            while (i11 < size) {
                Object objZzf = zzkrVar.zzf(i11);
                if (objZzf instanceof zzjb) {
                    iZzy2 = zzjj.zzt((zzjb) objZzf);
                } else {
                    iZzy2 = zzjj.zzy((String) objZzf);
                }
                iZzz += iZzy2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzjb) {
                    iZzy = zzjj.zzt((zzjb) obj);
                } else {
                    iZzy = zzjj.zzy((String) obj);
                }
                iZzz += iZzy;
                i11++;
            }
        }
        return iZzz;
    }

    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzjj.zzz(i10));
    }

    public static int zzw(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzjj.zzA(zzkdVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzjj.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzjj.zzz(i10));
    }

    public static int zzy(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjj.zzB(zzkyVar.zza(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjj.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }
}
