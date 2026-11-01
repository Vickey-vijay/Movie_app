package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzazm extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzazn zza;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzazn.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzazn.class) {
            this.zza.zzd(null);
        }
    }

    public zzazm(zzazn zzaznVar) {
        Objects.requireNonNull(zzaznVar);
        this.zza = zzaznVar;
    }
}
