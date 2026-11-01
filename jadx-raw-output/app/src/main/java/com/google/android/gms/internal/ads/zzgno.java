package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgno implements zzgnb, zzgdd {
    private final Context zza;
    private final ExecutorService zzb;
    private NetworkCapabilities zzc = null;

    public zzgno(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[Catch: all -> 0x0040, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:13:0x0019, B:15:0x0022, B:17:0x0026, B:19:0x002f, B:21:0x0033), top: B:31:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        NetworkCapabilities networkCapabilities;
        long j10;
        synchronized (this) {
            networkCapabilities = this.zzc;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            NetworkCapabilities networkCapabilities2 = this.zzc;
            if (networkCapabilities2 != null) {
                if (networkCapabilities2.hasTransport(4)) {
                    j10 = 2;
                } else if (this.zzc.hasTransport(1)) {
                    j10 = 1;
                } else {
                    j10 = this.zzc.hasTransport(0) ? 0L : -1L;
                }
            }
        }
        map.put("nt", Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
    }

    public final /* synthetic */ void zzf(NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final q5.i zza() {
        return zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        }, this.zzb);
    }

    public final /* synthetic */ void zze() {
        zzgnm zzgnmVar = new zzgnm(this);
        try {
            Object systemService = this.zza.getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgnmVar);
        } catch (Throwable unused) {
        }
    }
}
