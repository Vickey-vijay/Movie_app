package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezb implements zzfax {

    @Nullable
    private static String zzc;
    private final zzgzy zza;
    private final Context zzb;

    public zzezb(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeza
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzezc zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            return new zzezc(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgs)).booleanValue()) {
            return new zzezc(com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb);
        }
        return new zzezc(zzc);
    }
}
