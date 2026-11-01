package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends InputStream {
    public InputStream ouw;
    public HttpURLConnection vt;

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            inputStream.close();
            this.ouw = null;
        }
        HttpURLConnection httpURLConnection = this.vt;
        if (httpURLConnection != null) {
            PangleNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            this.vt = null;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.skip(j10);
        }
        return 0L;
    }

    public ra(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.ouw = inputStream;
        this.vt = httpURLConnection;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}
