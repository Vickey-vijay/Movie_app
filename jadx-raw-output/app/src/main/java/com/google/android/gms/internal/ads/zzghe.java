package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzghe extends zzghb {
    private final Map zza;
    private final zzgfx zzb;
    private final DisplayMetrics zzc;

    public zzghe(zzawg zzawgVar, zzgfx zzgfxVar, Map map, DisplayMetrics displayMetrics, zzgoe zzgoeVar) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", zzawgVar, zzgfxVar, zzgoeVar.zza(123));
        this.zzb = zzgfxVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
        objArr.getClass();
        zzaxc zzaxcVarZza = zzaxd.zza();
        Object obj = objArr[0];
        if (obj != null && objArr[1] != null) {
            zzaxcVarZza.zza(((Long) obj).longValue());
            zzaxcVarZza.zzb(((Long) objArr[1]).longValue());
        }
        Object obj2 = objArr[2];
        if (obj2 != null) {
            zzaxcVarZza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr[3];
        if (obj3 != null) {
            zzaxcVarZza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr[4];
        if (obj4 != null) {
            zzaxcVarZza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr[5];
        if (obj5 != null) {
            zzaxcVarZza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr[6];
        if (obj6 != null) {
            zzaxcVarZza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr[7];
        if (obj7 != null) {
            zzaxcVarZza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr[8];
        if (obj8 != null) {
            zzaxcVarZza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzawgVar) {
            Method methodZzc = this.zzb.zzc("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
            methodZzc.getClass();
            Object[] objArr2 = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
            objArr2.getClass();
            Object obj9 = objArr2[0];
            if (obj9 != null) {
                zzawgVar.zzh(((Long) obj9).longValue());
            }
            Object obj10 = objArr2[1];
            if (obj10 != null) {
                zzawgVar.zzi(((Long) obj10).longValue());
            }
            Object obj11 = objArr2[2];
            if (obj11 != null) {
                zzawgVar.zzj(((Long) obj11).longValue());
            }
            Object obj12 = objArr2[3];
            if (obj12 != null) {
                zzawgVar.zzv(((Long) obj12).longValue());
            }
            Object obj13 = objArr2[4];
            if (obj13 != null) {
                zzawgVar.zzw(((Long) obj13).longValue());
            }
            zzger zzgerVar = (zzger) map.get("oe");
            if (zzgerVar != null) {
                long j10 = zzgerVar.zza;
                if (j10 > 0) {
                    zzawgVar.zzz(j10);
                }
                long j11 = zzgerVar.zzb;
                if (j11 > 0) {
                    zzawgVar.zzy(j11);
                }
                long j12 = zzgerVar.zzc;
                if (j12 > 0) {
                    zzawgVar.zzx(j12);
                }
                long j13 = zzgerVar.zzd;
                if (j13 > 0) {
                    zzawgVar.zzA(j13);
                }
            }
            zzger zzgerVar2 = (zzger) map.get("oe");
            if (zzgerVar2 != null && zzgerVar2.zza != 0 && zzc(displayMetrics)) {
                double d10 = zzgerVar2.zze;
                displayMetrics.getClass();
                zzaxcVarZza.zzl(zzb(d10, displayMetrics));
                zzaxcVarZza.zzm(zzb(zzgerVar2.zzh - zzgerVar2.zzf, displayMetrics));
                zzaxcVarZza.zzn(zzb(zzgerVar2.zzi - zzgerVar2.zzg, displayMetrics));
                zzaxcVarZza.zzq(zzb(zzgerVar2.zzf, displayMetrics));
                zzaxcVarZza.zzr(zzb(zzgerVar2.zzg, displayMetrics));
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                if (motionEvent != null) {
                    long jZzb = zzb(((zzgerVar2.zzf - zzgerVar2.zzh) + motionEvent.getRawX()) - motionEvent.getX(), displayMetrics);
                    if (jZzb != 0) {
                        zzaxcVarZza.zzo(jZzb);
                    }
                    long jZzb2 = zzb(((zzgerVar2.zzg - zzgerVar2.zzi) + motionEvent.getRawY()) - motionEvent.getY(), displayMetrics);
                    if (jZzb2 != 0) {
                        zzaxcVarZza.zzp(jZzb2);
                    }
                }
            }
            zzawgVar.zzJ(zzaxcVarZza);
            zzges[] zzgesVarArr = (zzges[]) map.get("ro");
            if (zzgesVarArr != null && zzc(displayMetrics)) {
                for (int i10 = 0; i10 <= zzgesVarArr.length - 2; i10++) {
                    zzges zzgesVar = zzgesVarArr[i10];
                    zzaxc zzaxcVarZza2 = zzaxd.zza();
                    double d11 = zzgesVar.zza;
                    displayMetrics.getClass();
                    zzaxcVarZza2.zza(zzb(d11, displayMetrics));
                    zzaxcVarZza2.zzb(zzb(zzgesVar.zzb, displayMetrics));
                    zzawgVar.zzK((zzaxd) zzaxcVarZza2.zzbu());
                }
            }
        }
    }
}
