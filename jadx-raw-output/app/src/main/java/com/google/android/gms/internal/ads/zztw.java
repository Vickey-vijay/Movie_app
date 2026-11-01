package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zztw extends Handler {
    public final /* synthetic */ zzty zza;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztw(zzty zztyVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zztyVar);
        this.zza = zztyVar;
    }
}
