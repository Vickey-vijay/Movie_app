package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: DigestPrintWriter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Charset f6580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f6581c;

    /* JADX INFO: compiled from: DigestPrintWriter.java */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f6579a;
        if (messageDigest != null) {
            messageDigest.update(this.f6580b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    public e(@NonNull OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f6580b = null;
        this.f6579a = messageDigest;
        this.f6581c = aVar;
        if (messageDigest != null) {
            this.f6580b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f6579a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f6579a != null) {
            a aVar = this.f6581c;
            if (aVar == null || aVar.a(str)) {
                this.f6579a.update(this.f6580b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }
}
