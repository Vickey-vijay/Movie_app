package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcab {
    private final WeakHashMap zza = new WeakHashMap();

    public final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }

    public final Future zza(Context context) {
        return zzcei.zza.submit(new zzbzz(this, context));
    }
}
