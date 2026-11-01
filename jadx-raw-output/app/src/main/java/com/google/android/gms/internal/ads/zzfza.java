package com.google.android.gms.internal.ads;

import ck.p;
import com.ironsource.C3426d4;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfza {
    private final zzfyw zza;

    public final /* synthetic */ zzfyy zza() {
        zzibr zzibrVarZzbu = this.zza.zzbu();
        p.i(zzibrVarZzbu, "build(...)");
        return (zzfyy) zzibrVarZzbu;
    }

    public final /* synthetic */ zziev zzb() {
        Map mapZzb = this.zza.zzb();
        p.i(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(mapZzb);
    }

    public final void zzc(zziev zzievVar, String str, zzfyu zzfyuVar) {
        p.j(zzievVar, "<this>");
        p.j(str, C3426d4.i.W);
        p.j(zzfyuVar, "value");
        this.zza.zzc(str, zzfyuVar);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String str) {
        p.j(zzievVar, "<this>");
        p.j(str, C3426d4.i.W);
        this.zza.zza(str);
    }
}
