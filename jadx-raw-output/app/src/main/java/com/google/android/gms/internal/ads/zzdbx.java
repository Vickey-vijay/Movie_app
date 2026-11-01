package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbx extends zzdhd {
    private boolean zzb;

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdbw
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdbz) obj).zzdr();
            }
        });
        this.zzb = true;
    }

    public zzdbx(Set set) {
        super(set);
        this.zzb = false;
    }
}
