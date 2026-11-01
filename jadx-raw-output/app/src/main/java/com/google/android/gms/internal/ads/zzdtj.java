package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdtj implements zzboh {
    public final /* synthetic */ zzdtk zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzboh zzd;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }

    public /* synthetic */ zzdtj(zzdtk zzdtkVar, WeakReference weakReference, String str, zzboh zzbohVar, byte[] bArr) {
        Objects.requireNonNull(zzdtkVar);
        this.zza = zzdtkVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbohVar;
    }
}
