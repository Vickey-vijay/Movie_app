package an;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;

/* JADX INFO: compiled from: URLResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zm.c f3697h = zm.b.a(f.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URL f3698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public URLConnection f3700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputStream f3701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient boolean f3702g;

    public f(URL url, URLConnection uRLConnection) {
        this.f3701f = null;
        this.f3702g = e.f3696b;
        this.f3698c = url;
        this.f3699d = url.toString();
        this.f3700e = uRLConnection;
    }

    @Override // an.e
    public boolean a() {
        try {
            synchronized (this) {
                if (k() && this.f3701f == null) {
                    this.f3701f = this.f3700e.getInputStream();
                }
            }
        } catch (IOException e10) {
            f3697h.h(e10);
        }
        return this.f3701f != null;
    }

    @Override // an.e
    public synchronized InputStream c() throws IOException {
        if (!k()) {
            throw new IOException("Invalid resource");
        }
        try {
            InputStream inputStream = this.f3701f;
            if (inputStream != null) {
                this.f3701f = null;
                this.f3700e = null;
                return inputStream;
            }
            InputStream inputStream2 = this.f3700e.getInputStream();
            this.f3700e = null;
            return inputStream2;
        } catch (Throwable th2) {
            this.f3700e = null;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:10:0x0010, B:11:0x0012, B:13:0x0016, B:9:0x000b), top: B:21:0x0001, inners: #0 }] */
    @Override // an.e
    public synchronized void i() {
        InputStream inputStream = this.f3701f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                f3697h.h(e10);
            }
            this.f3701f = null;
            if (this.f3700e != null) {
                this.f3700e = null;
            }
        } else if (this.f3700e != null) {
            this.f3700e = null;
        }
        throw th;
    }

    public synchronized boolean k() {
        if (this.f3700e == null) {
            try {
                URLConnection uRLConnectionOpenConnection = this.f3698c.openConnection();
                this.f3700e = uRLConnectionOpenConnection;
                uRLConnectionOpenConnection.setUseCaches(this.f3702g);
            } catch (IOException e10) {
                f3697h.h(e10);
            }
        }
        return this.f3700e != null;
    }

    @Override // an.e
    public boolean delete() throws SecurityException {
        throw new SecurityException("Delete not supported");
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f3699d.equals(((f) obj).f3699d);
    }

    public int hashCode() {
        return this.f3699d.hashCode();
    }

    public boolean l() {
        return this.f3702g;
    }

    public String toString() {
        return this.f3699d;
    }

    @Override // an.e
    public File b() throws IOException {
        if (k()) {
            Permission permission = this.f3700e.getPermission();
            if (permission instanceof FilePermission) {
                return new File(permission.getName());
            }
        }
        try {
            return new File(this.f3698c.getFile());
        } catch (Exception e10) {
            f3697h.h(e10);
            return null;
        }
    }

    @Override // an.e
    public long d() {
        if (k()) {
            return this.f3700e.getLastModified();
        }
        return -1L;
    }

    public f(URL url, URLConnection uRLConnection, boolean z10) {
        this(url, uRLConnection);
        this.f3702g = z10;
    }
}
