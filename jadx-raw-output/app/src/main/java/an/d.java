package an;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import xm.j;

/* JADX INFO: compiled from: JarResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zm.c f3692j = zm.b.a(d.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JarURLConnection f3693i;

    /* JADX INFO: compiled from: JarResource.java */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ((FilterInputStream) this).in = j.f();
        }
    }

    public d(URL url, boolean z10) {
        super(url, null, z10);
    }

    @Override // an.f, an.e
    public File b() throws IOException {
        return null;
    }

    @Override // an.f, an.e
    public synchronized void i() {
        this.f3693i = null;
        super.i();
    }

    @Override // an.f
    public synchronized boolean k() {
        super.k();
        try {
            if (this.f3693i != this.f3700e) {
                m();
            }
        } catch (IOException e10) {
            f3692j.h(e10);
            this.f3693i = null;
        }
        return this.f3693i != null;
    }

    @Override // an.f, an.e
    public boolean a() {
        return this.f3699d.endsWith("!/") ? k() : super.a();
    }

    public void m() throws IOException {
        this.f3693i = (JarURLConnection) this.f3700e;
    }

    @Override // an.f, an.e
    public InputStream c() throws IOException {
        k();
        if (!this.f3699d.endsWith("!/")) {
            return new a(super.c());
        }
        String str = this.f3699d;
        return new URL(str.substring(4, str.length() - 2)).openStream();
    }
}
