package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class g extends OutputStream implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44838a = "SafeDKOutputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f44840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f44841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteArrayOutputStream f44842e = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f44843f = this;

    public g(String str, String str2, OutputStream outputStream) {
        this.f44839b = str;
        this.f44841d = str2;
        this.f44840c = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f44840c.write(i10);
        if (i10 >= 0) {
            try {
                this.f44842e.write(i10);
            } catch (Throwable th2) {
                try {
                    Logger.e(f44838a, th2.getMessage());
                } catch (Throwable th3) {
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] b10) throws IOException {
        this.f44840c.write(b10);
        a(b10, 0, b10.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] b10, int off, int len) throws IOException {
        this.f44840c.write(b10, off, len);
        a(b10, off, len);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44840c.close();
        String string = this.f44842e.toString();
        Logger.d(f44838a, "closing output stream");
        this.f44843f.a(this.f44839b, this.f44841d, string);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f44840c.flush();
    }

    private void a(byte[] bArr, int i10, int i11) {
        if (i11 > 0) {
            try {
                this.f44842e.write(bArr, i10, i11);
            } catch (Throwable th2) {
                try {
                    Logger.e(f44838a, th2.getMessage());
                } catch (Throwable th3) {
                }
            }
        }
    }

    public void a(c cVar) {
        this.f44843f = cVar;
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f44838a, "onStreamClose " + this + " sdkPackageName: " + str);
        CreativeInfoManager.c(str, str2, str3);
    }
}
