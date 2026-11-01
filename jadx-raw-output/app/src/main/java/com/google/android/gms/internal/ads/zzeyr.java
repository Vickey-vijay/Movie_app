package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeyr implements zzfav {
    public final Bundle zza;

    public zzeyr(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Bundle bundleZza = zzfjz.zza(bundle, C3426d4.i.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(C3426d4.i.G, bundleZza);
    }
}
