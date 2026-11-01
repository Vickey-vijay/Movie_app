package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdba {
    @Nullable
    public static final zzcce zza(Context context, VersionInfoParcel versionInfoParcel, zzfir zzfirVar, zzcca zzccaVar) {
        zzccb zzccbVar = zzfirVar.zzA;
        if (zzccbVar == null) {
            return null;
        }
        zzfiw zzfiwVar = zzfirVar.zzs;
        return new zzcbz(context, versionInfoParcel, zzccbVar, zzfiwVar == null ? null : zzfiwVar.zzb, zzccaVar);
    }
}
