package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdss implements zzbkf {
    public final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    public final /* synthetic */ zzdst zzb;

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final JSONObject zzd() {
        return null;
    }

    public zzdss(zzdst zzdstVar, String str) {
        Objects.requireNonNull(zzdstVar);
        this.zzb = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final void zza() {
        zzdst zzdstVar = this.zzb;
        if (zzdstVar.zzc() != null) {
            zzdstVar.zzc().zza(this.zza);
        }
    }
}
