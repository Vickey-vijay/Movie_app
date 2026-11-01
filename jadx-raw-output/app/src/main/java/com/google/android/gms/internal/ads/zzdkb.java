package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdkb extends zzdhd {
    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjy) obj).zzd(zzbjVar);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjy) obj).zze(str);
            }
        });
    }

    public zzdkb(Set set) {
        super(set);
    }
}
