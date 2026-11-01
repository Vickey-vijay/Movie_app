package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzijo extends zzijr implements zzatj {
    public final String zza = "moov";

    @Override // com.google.android.gms.internal.ads.zzatj
    public final String zza() {
        return this.zza;
    }

    public zzijo(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final void zzb(zzijs zzijsVar, ByteBuffer byteBuffer, long j10, zzatg zzatgVar) throws IOException {
        zzijsVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzijsVar;
        this.zze = zzijsVar.zzc();
        zzijsVar.zzd(zzijsVar.zzc() + j10);
        this.zzf = zzijsVar.zzc();
        this.zzb = zzatgVar;
    }
}
