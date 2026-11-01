package an;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: Resource.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zm.c f3695a = zm.b.a(e.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3696b = true;

    public static e h(URL url, boolean z10) {
        if (url == null) {
            return null;
        }
        String externalForm = url.toExternalForm();
        if (!externalForm.startsWith("file:")) {
            if (externalForm.startsWith("jar:file:")) {
                return new c(url, z10);
            }
            return externalForm.startsWith("jar:") ? new d(url, z10) : new f(url, null, z10);
        }
        try {
            return new b(url);
        } catch (Exception e10) {
            f3695a.d("EXCEPTION ", e10);
            return new a(url, e10.toString());
        }
    }

    public abstract boolean a();

    public abstract File b() throws IOException;

    public abstract InputStream c() throws IOException;

    public abstract long d();

    public abstract boolean delete() throws SecurityException;

    public abstract void i();

    public static e e(String str) throws IOException {
        return f(str, f3696b);
    }

    public static e f(String str, boolean z10) throws IOException {
        try {
            return g(new URL(str));
        } catch (MalformedURLException e10) {
            if (str.startsWith("ftp:") || str.startsWith("file:") || str.startsWith("jar:")) {
                f3695a.g("Bad Resource: " + str, new Object[0]);
                throw e10;
            }
            try {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                File canonicalFile = new File(str).getCanonicalFile();
                URL urlJ = j(canonicalFile);
                URLConnection uRLConnectionOpenConnection = urlJ.openConnection();
                uRLConnectionOpenConnection.setUseCaches(z10);
                return new b(urlJ, uRLConnectionOpenConnection, canonicalFile);
            } catch (Exception e11) {
                f3695a.d("EXCEPTION ", e11);
                throw e10;
            }
        }
    }

    public static e g(URL url) throws IOException {
        return h(url, f3696b);
    }

    public static URL j(File file) throws MalformedURLException {
        return file.toURI().toURL();
    }

    public void finalize() {
        i();
    }
}
