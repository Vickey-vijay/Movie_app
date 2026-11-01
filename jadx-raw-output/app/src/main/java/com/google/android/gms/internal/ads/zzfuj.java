package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfuj {
    private final zzftk zza;
    private final ArrayList zzb;

    public final zzftk zzb() {
        return this.zza;
    }

    public final ArrayList zzc() {
        return this.zzb;
    }

    public final void zza(String str) {
        this.zzb.add(str);
    }

    public zzfuj(zzftk zzftkVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzftkVar;
        arrayList.add(str);
    }
}
