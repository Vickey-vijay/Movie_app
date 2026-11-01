package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzddy extends zzdhd {
    private boolean zzb;

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzddx
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdea) obj).zzk();
            }
        });
        this.zzb = true;
    }

    @VisibleForTesting
    public zzddy(Set set) {
        super(set);
        this.zzb = false;
    }
}
