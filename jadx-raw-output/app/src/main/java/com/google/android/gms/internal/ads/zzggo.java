package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzggo extends zzghb {
    private final zzgbf zza;

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzb());
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzb((String) objArr[0]);
            zzawgVar.zzaa((String) objArr[1]);
        }
    }

    public zzggo(zzawg zzawgVar, zzgfx zzgfxVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", zzawgVar, zzgfxVar, zzgoeVar.zza(116));
        this.zza = zzgbfVar;
    }
}
