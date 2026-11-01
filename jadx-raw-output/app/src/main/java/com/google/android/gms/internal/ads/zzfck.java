package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfck implements zzfax {
    public final zzgzy zza;

    public zzfck(zzbfs zzbfsVar, zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcl(new JSONObject());
            }
        });
    }
}
