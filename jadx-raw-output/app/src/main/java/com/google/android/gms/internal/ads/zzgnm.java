package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgnm extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzgno zza;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgno zzgnoVar = this.zza;
        synchronized (zzgnoVar) {
            zzgnoVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgno zzgnoVar = this.zza;
        synchronized (zzgnoVar) {
            zzgnoVar.zzf(null);
        }
    }

    public zzgnm(zzgno zzgnoVar) {
        Objects.requireNonNull(zzgnoVar);
        this.zza = zzgnoVar;
    }
}
