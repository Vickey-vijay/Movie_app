package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class e extends FileOutputStream implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f44825a = "SafeDKFileOutputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f44826b;

    public e(String str, String str2, FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(str2);
        this.f44826b = new g(str, str2, fileOutputStream);
        this.f44826b.a(this);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f44826b.write(i10);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] b10) throws IOException {
        this.f44826b.write(b10);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] b10, int off, int len) throws IOException {
        this.f44826b.write(b10, off, len);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44826b.close();
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f44825a, "onStreamClose " + this + " sdkPackageName: " + str + ", url: " + str2);
        CreativeInfoManager.b(str, str2, str3);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f44826b.flush();
    }
}
