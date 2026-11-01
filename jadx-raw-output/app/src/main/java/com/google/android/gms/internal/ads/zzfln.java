package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfln {
    private final HashMap zza = new HashMap();

    public final zzflm zza(zzfld zzfldVar, Context context, zzfkv zzfkvVar, zzfls zzflsVar) {
        HashMap map = this.zza;
        zzflm zzflmVar = (zzflm) map.get(zzfldVar);
        if (zzflmVar != null) {
            return zzflmVar;
        }
        zzfla zzflaVar = new zzfla(zzflg.zza(zzfldVar, context));
        zzflm zzflmVar2 = new zzflm(zzflaVar, new zzflv(zzflaVar, zzfkvVar, zzflsVar));
        map.put(zzfldVar, zzflmVar2);
        return zzflmVar2;
    }
}
