package n7;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FileDownloadUrlConnection.java */
/* JADX INFO: loaded from: classes8.dex */
public class c implements n7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URLConnection f64701a;

    /* JADX INFO: compiled from: FileDownloadUrlConnection.java */
    public static class a {
    }

    /* JADX INFO: compiled from: FileDownloadUrlConnection.java */
    public static class b implements w7.c.b {
        public b() {
            this(null);
        }

        public b(a aVar) {
        }

        @Override // w7.c.b
        public n7.b create(String str) throws IOException {
            return new c(str, (a) null);
        }
    }

    public c(String str, a aVar) throws IOException {
        this(new URL(str), aVar);
    }

    @Override // n7.b
    public boolean f(String str, long j10) {
        return false;
    }

    public c(URL url, a aVar) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        this.f64701a = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
        }
    }

    @Override // n7.b
    public void a() {
        try {
            this.f64701a.getInputStream().close();
        } catch (IOException unused) {
        }
    }

    @Override // n7.b
    public InputStream b() throws IOException {
        return this.f64701a.getInputStream();
    }

    @Override // n7.b
    public void c(String str, String str2) {
        this.f64701a.addRequestProperty(str, str2);
    }

    @Override // n7.b
    public Map<String, List<String>> d() {
        return this.f64701a.getRequestProperties();
    }

    @Override // n7.b
    public Map<String, List<String>> e() {
        return this.f64701a.getHeaderFields();
    }

    @Override // n7.b
    public void execute() throws IOException {
        this.f64701a.connect();
    }

    @Override // n7.b
    public String g(String str) {
        return this.f64701a.getHeaderField(str);
    }

    @Override // n7.b
    public int getResponseCode() throws IOException {
        URLConnection uRLConnection = this.f64701a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // n7.b
    public boolean h(String str) throws ProtocolException {
        URLConnection uRLConnection = this.f64701a;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }
}
