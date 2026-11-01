package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbfk implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzbfl zza;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            zzbflVar.zzk(null);
            if (zzbflVar.zzi() != null) {
                zzbflVar.zzj(null);
            }
            zzbflVar.zzh().notifyAll();
        }
    }

    public zzbfk(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }
}
