package an;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: compiled from: JarFileResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f3683s = zm.b.a(c.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JarFile f3684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public File f3685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f3686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JarEntry f3687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f3689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3691r;

    @Override // an.d, an.f, an.e
    public synchronized void i() {
        this.f3686m = null;
        this.f3687n = null;
        this.f3685l = null;
        if (!l() && this.f3684k != null) {
            try {
                f3683s.i("Closing JarFile " + this.f3684k.getName(), new Object[0]);
                this.f3684k.close();
            } catch (IOException e10) {
                f3683s.h(e10);
            }
        }
        this.f3684k = null;
        super.i();
    }

    @Override // an.d, an.f
    public boolean k() {
        try {
            super.k();
            if (this.f3693i == null) {
                this.f3687n = null;
                this.f3685l = null;
                this.f3684k = null;
                this.f3686m = null;
            }
            return this.f3684k != null;
        } catch (Throwable th2) {
            if (this.f3693i == null) {
                this.f3687n = null;
                this.f3685l = null;
                this.f3684k = null;
                this.f3686m = null;
            }
            throw th2;
        }
    }

    @Override // an.d
    public synchronized void m() throws IOException {
        super.m();
        this.f3687n = null;
        this.f3685l = null;
        this.f3684k = null;
        this.f3686m = null;
        int iIndexOf = this.f3699d.indexOf("!/") + 2;
        this.f3689p = this.f3699d.substring(0, iIndexOf);
        String strSubstring = this.f3699d.substring(iIndexOf);
        this.f3690q = strSubstring;
        if (strSubstring.length() == 0) {
            this.f3690q = null;
        }
        this.f3684k = this.f3693i.getJarFile();
        this.f3685l = new File(this.f3684k.getName());
    }

    @Override // an.d, an.f, an.e
    public boolean a() {
        boolean z10 = true;
        if (this.f3691r) {
            return true;
        }
        if (this.f3699d.endsWith("!/")) {
            String str = this.f3699d;
            try {
                return e.e(str.substring(4, str.length() - 2)).a();
            } catch (Exception e10) {
                f3683s.h(e10);
                return false;
            }
        }
        boolean zK = k();
        if (this.f3689p != null && this.f3690q == null) {
            this.f3688o = zK;
            return true;
        }
        JarFile jarFile = null;
        if (zK) {
            jarFile = this.f3684k;
        } else {
            try {
                JarURLConnection jarURLConnection = (JarURLConnection) new URL(this.f3689p).openConnection();
                jarURLConnection.setUseCaches(l());
                jarFile = jarURLConnection.getJarFile();
            } catch (Exception e11) {
                f3683s.h(e11);
            }
        }
        if (jarFile != null && this.f3687n == null && !this.f3688o) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String strReplace = jarEntryNextElement.getName().replace('\\', '/');
                if (!strReplace.equals(this.f3690q)) {
                    if (!this.f3690q.endsWith("/")) {
                        if (strReplace.startsWith(this.f3690q) && strReplace.length() > this.f3690q.length() && strReplace.charAt(this.f3690q.length()) == '/') {
                            this.f3688o = true;
                            break;
                        }
                    } else if (strReplace.startsWith(this.f3690q)) {
                        this.f3688o = true;
                        break;
                    }
                } else {
                    this.f3687n = jarEntryNextElement;
                    this.f3688o = this.f3690q.endsWith("/");
                    break;
                }
            }
            if (this.f3688o && !this.f3699d.endsWith("/")) {
                this.f3699d += "/";
                try {
                    this.f3698c = new URL(this.f3699d);
                } catch (MalformedURLException e12) {
                    f3683s.e(e12);
                }
            }
        }
        if (!this.f3688o && this.f3687n == null) {
            z10 = false;
        }
        this.f3691r = z10;
        return z10;
    }

    public c(URL url, boolean z10) {
        super(url, z10);
    }

    @Override // an.f, an.e
    public long d() {
        JarEntry jarEntry;
        if (k() && this.f3685l != null) {
            if (a() && (jarEntry = this.f3687n) != null) {
                return jarEntry.getTime();
            }
            return this.f3685l.lastModified();
        }
        return -1L;
    }
}
