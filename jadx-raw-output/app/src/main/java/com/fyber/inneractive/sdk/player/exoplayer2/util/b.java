package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f17811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17812b = false;

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f17811a.write(i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17812b) {
            return;
        }
        this.f17812b = true;
        this.f17811a.flush();
        try {
            this.f17811a.getFD().sync();
        } catch (IOException e10) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        this.f17811a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f17811a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f17811a.write(bArr);
    }

    public b(File file) {
        this.f17811a = DTExchangeFilesBridge.fileOutputStreamCtor(file);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f17811a.write(bArr, i10, i11);
    }
}
