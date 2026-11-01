package androidx.core.util;

import bk.l;
import ck.n;
import ck.p;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import mj.r;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AtomicFileKt {
    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lk.c.f63591b;
        }
        return readText(atomicFile, charset);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lk.c.f63591b;
        }
        writeText(atomicFile, str, charset);
    }

    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static final void tryWrite(android.util.AtomicFile atomicFile, l<? super FileOutputStream, r> lVar) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            lVar.invoke(fileOutputStreamStartWrite);
            n.b(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } finally {
            n.b(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            n.a(1);
        }
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th2) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th2;
        }
    }

    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        p.i(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }
}
