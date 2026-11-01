package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbow implements zzbox {
    public final /* synthetic */ zzcen zza;

    public zzbow(zzboy zzboyVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzboyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(@Nullable String str) {
        this.zza.zzd(new zzbso(str));
    }
}
