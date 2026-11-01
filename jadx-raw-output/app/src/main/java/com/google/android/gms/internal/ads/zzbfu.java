package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbfu extends PushbackInputStream {
    public final /* synthetic */ zzbfx zza;

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbfu(zzbfx zzbfxVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbfxVar);
        this.zza = zzbfxVar;
    }
}
