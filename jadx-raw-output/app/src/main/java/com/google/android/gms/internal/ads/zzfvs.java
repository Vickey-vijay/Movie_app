package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfvs implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final zzfwj zza;
    private final zzfwd zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }

    private final void zzb() {
        synchronized (this.zzc) {
            zzfwj zzfwjVar = this.zza;
            if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                zzfwjVar.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            this.zze = true;
            try {
                this.zza.zzp().zzf(new zzfwh(this.zzb.zzaN()));
            } catch (Exception unused) {
            } finally {
                zzb();
            }
        }
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzd = true;
                this.zza.checkAvailabilityAndConnect();
            }
        }
    }

    public zzfvs(@NonNull Context context, @NonNull Looper looper, @NonNull zzfwd zzfwdVar) {
        this.zzb = zzfwdVar;
        this.zza = new zzfwj(context, looper, this, this, 12800000);
    }
}
