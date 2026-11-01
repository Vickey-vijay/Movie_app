package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzazn {
    private NetworkCapabilities zza;

    public final NetworkCapabilities zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(NetworkCapabilities networkCapabilities) {
        this.zza = networkCapabilities;
    }

    public static zzazn zza(Context context) {
        if (context != null) {
            return new zzazn((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zzc() {
        synchronized (zzazn.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public zzazn(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzazm(this));
            } catch (RuntimeException unused) {
                synchronized (zzazn.class) {
                    this.zza = null;
                }
            }
        }
    }
}
