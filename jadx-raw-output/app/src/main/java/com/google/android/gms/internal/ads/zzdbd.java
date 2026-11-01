package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbd extends zzdhd implements com.google.android.gms.ads.internal.client.zza {
    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdbc
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }

    public zzdbd(Set set) {
        super(set);
    }
}
