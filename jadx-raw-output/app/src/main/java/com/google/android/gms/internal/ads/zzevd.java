package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevd implements zzfav {
    private final double zza;
    private final boolean zzb;

    public zzevd(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Bundle bundleZza = zzfjz.zza(bundle, C3426d4.i.G);
        bundle.putBundle(C3426d4.i.G, bundleZza);
        Bundle bundleZza2 = zzfjz.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
