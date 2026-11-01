package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfcc implements zzfax {
    private final Executor zza;
    private final String zzb;

    public zzfcc(zzcdm zzcdmVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        q5.i iVarZza = zzgzo.zza(this.zzb);
        zzfcb zzfcbVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new zzfcd((String) obj);
            }
        };
        Executor executor = this.zza;
        return zzgzo.zzh(zzgzo.zzk(iVarZza, zzfcbVar, executor), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    public final /* synthetic */ q5.i zzc(Throwable th2) {
        return zzgzo.zza(new zzfcd(this.zzb));
    }
}
