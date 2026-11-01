package rm;

import java.io.IOException;
import java.io.Writer;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: HttpOutput.java */
/* JADX INFO: loaded from: classes2.dex */
public class l extends kj.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f66892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm.a f66893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mm.h f66895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f66896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Writer f66897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char[] f66898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xm.g f66899j;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f66894e = true;
    }

    public void h() {
        this.f66894e = false;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        i(new mm.h(bArr, i10, i11));
    }

    public int d() {
        return this.f66892c.s();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f66893d.e(d());
    }

    public final void i(mm.d dVar) throws IOException {
        if (this.f66894e) {
            throw new IOException("Closed");
        }
        if (!this.f66893d.i()) {
            throw new EofException();
        }
        while (this.f66893d.h()) {
            this.f66893d.c(d());
            if (this.f66894e) {
                throw new IOException("Closed");
            }
            if (!this.f66893d.i()) {
                throw new EofException();
            }
        }
        this.f66893d.t(dVar, false);
        if (this.f66893d.y()) {
            flush();
            close();
        } else if (this.f66893d.h()) {
            this.f66892c.i(false);
        }
        while (dVar.length() > 0 && this.f66893d.i()) {
            this.f66893d.c(d());
        }
    }

    public boolean isClosed() {
        return this.f66894e;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        i(new mm.h(bArr));
    }

    public l(b bVar) {
        this.f66892c = bVar;
        this.f66893d = (lm.a) bVar.q();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        mm.h hVar = this.f66895f;
        if (hVar == null) {
            this.f66895f = new mm.h(1);
        } else {
            hVar.clear();
        }
        this.f66895f.put((byte) i10);
        i(this.f66895f);
    }
}
