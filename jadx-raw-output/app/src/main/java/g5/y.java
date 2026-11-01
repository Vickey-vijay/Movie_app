package g5;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ReusableBufferedOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y extends BufferedOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53164b;

    public y(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f53164b = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            k0.B0(th);
        }
    }

    public y(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public void a(OutputStream outputStream) {
        a.f(this.f53164b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f53164b = false;
    }
}
