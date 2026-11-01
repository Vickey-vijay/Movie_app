package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzico {
    public static final List zza(Object obj, long j10) {
        int i10;
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j10);
        if (!zzicdVar.zza()) {
            int size = zzicdVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzicd zzicdVarZzh = zzicdVar.zzh(i10);
            zziem.zzo(obj, j10, zzicdVarZzh);
            return zzicdVarZzh;
        }
        return zzicdVar;
    }
}
