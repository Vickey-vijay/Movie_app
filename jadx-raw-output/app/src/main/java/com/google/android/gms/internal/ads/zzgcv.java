package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgcv implements zzgda {
    private final byte[] zza;

    public zzgcv(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgxf.zza(inputStream);
        } catch (IOException e10) {
            throw new zzgcw("Cannot read bytes.", e10);
        }
    }
}
