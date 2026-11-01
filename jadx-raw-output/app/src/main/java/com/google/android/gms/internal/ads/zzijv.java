package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzijv extends zzijy {
    public final Logger zza;

    @Override // com.google.android.gms.internal.ads.zzijy
    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }

    public zzijv(String str) {
        this.zza = Logger.getLogger(str);
    }
}
