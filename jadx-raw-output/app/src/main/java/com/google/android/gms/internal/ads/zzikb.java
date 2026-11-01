package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzikb {
    public final LinkedHashMap zza;

    public final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, C3426d4.i.W);
        zziko.zza(zzikpVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzikpVar);
        return this;
    }

    public zzikb(int i10) {
        this.zza = zzikd.zzc(i10);
    }
}
