package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzggs extends zzghb {
    private final Map zza;

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzf(((Long) objArr[0]).longValue());
            long jLongValue = ((Long) objArr[1]).longValue();
            if (jLongValue >= 0) {
                zzawgVar.zzW(jLongValue);
            }
            long jLongValue2 = ((Long) objArr[2]).longValue();
            if (jLongValue2 >= 0) {
                zzawgVar.zzX(jLongValue2);
            }
        }
    }

    public zzggs(zzawg zzawgVar, zzgfx zzgfxVar, Map map, zzgoe zzgoeVar) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", zzawgVar, zzgfxVar, zzgoeVar.zza(118));
        this.zza = map;
    }
}
