package yads;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class iq2 extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f78772a;

    public iq2(FileOutputStream fileOutputStream, int i10) {
        super(fileOutputStream, i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f78772a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i10 = ib3.f78556a;
        throw th;
    }

    public iq2(fk fkVar) {
        super(fkVar);
    }

    public final void a(OutputStream outputStream) {
        if (!this.f78772a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f78772a = false;
    }
}
