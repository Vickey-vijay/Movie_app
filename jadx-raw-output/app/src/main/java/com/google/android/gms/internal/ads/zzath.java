package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzath extends zzijr {
    @Override // com.google.android.gms.internal.ads.zzijr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    static {
        zzijy.zzb(zzath.class);
    }

    @Override // com.google.android.gms.internal.ads.zzijr
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    public zzath(zzijs zzijsVar, zzatg zzatgVar) throws IOException {
        zzd(zzijsVar, zzijsVar.zzb(), zzatgVar);
    }
}
