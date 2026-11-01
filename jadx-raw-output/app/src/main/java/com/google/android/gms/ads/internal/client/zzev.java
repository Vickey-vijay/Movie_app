package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzev extends zzdm {
    private zzev() {
        throw null;
    }

    public /* synthetic */ zzev(byte[] bArr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(@Nullable zze zzeVar) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener onAdInspectorClosedListenerZzA = zzex.zzb().zzA();
        if (onAdInspectorClosedListenerZzA != null) {
            if (zzeVar == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
            }
            onAdInspectorClosedListenerZzA.onAdInspectorClosed(adInspectorError);
        }
    }
}
