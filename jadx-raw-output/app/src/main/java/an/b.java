package an;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import xm.q;

/* JADX INFO: compiled from: FileResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final zm.c f3678l = zm.b.a(b.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f3679m = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f3680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient URL f3681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient boolean f3682k;

    public b(URL url) throws URISyntaxException, IOException {
        super(url, null);
        this.f3681j = null;
        this.f3682k = false;
        try {
            this.f3680i = new File(new URI(url.toString()));
        } catch (URISyntaxException e10) {
            throw e10;
        } catch (Exception e11) {
            f3678l.h(e11);
            try {
                URI uri = new URI("file:" + q.f(url.toString().substring(5)));
                if (uri.getAuthority() == null) {
                    this.f3680i = new File(uri);
                } else {
                    this.f3680i = new File("//" + uri.getAuthority() + q.d(url.getFile()));
                }
            } catch (Exception e12) {
                f3678l.h(e12);
                k();
                Permission permission = this.f3700e.getPermission();
                this.f3680i = new File(permission == null ? url.getFile() : permission.getName());
            }
        }
        if (!this.f3680i.isDirectory()) {
            if (this.f3699d.endsWith("/")) {
                String str = this.f3699d;
                this.f3699d = str.substring(0, str.length() - 1);
                return;
            }
            return;
        }
        if (this.f3699d.endsWith("/")) {
            return;
        }
        this.f3699d += "/";
    }

    @Override // an.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f3680i;
        File file = this.f3680i;
        if (obj2 != file) {
            return file != null && file.equals(obj2);
        }
        return true;
    }

    @Override // an.f, an.e
    public boolean a() {
        return this.f3680i.exists();
    }

    @Override // an.f, an.e
    public File b() {
        return this.f3680i;
    }

    @Override // an.f, an.e
    public InputStream c() throws IOException {
        return new FileInputStream(this.f3680i);
    }

    @Override // an.f, an.e
    public long d() {
        return this.f3680i.lastModified();
    }

    @Override // an.f, an.e
    public boolean delete() throws SecurityException {
        return this.f3680i.delete();
    }

    @Override // an.f
    public int hashCode() {
        File file = this.f3680i;
        return file == null ? super.hashCode() : file.hashCode();
    }

    public b(URL url, URLConnection uRLConnection, File file) {
        super(url, uRLConnection);
        this.f3681j = null;
        this.f3682k = false;
        this.f3680i = file;
        if (!file.isDirectory() || this.f3699d.endsWith("/")) {
            return;
        }
        this.f3699d += "/";
    }
}
