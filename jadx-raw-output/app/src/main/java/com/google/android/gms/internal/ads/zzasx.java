package com.google.android.gms.internal.ads;

import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzasx extends FilterInputStream {
    private final HttpURLConnection zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzasx(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.zza = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        AdMobNetworkBridge.httpUrlConnectionDisconnect(this.zza);
    }
}
