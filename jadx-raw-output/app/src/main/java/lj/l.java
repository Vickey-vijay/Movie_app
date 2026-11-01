package lj;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import kj.n;

/* JADX INFO: compiled from: HttpServlet.java */
/* JADX INFO: loaded from: classes2.dex */
public class l extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ResourceBundle f63584f = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f63585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PrintWriter f63586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63588e;

    @Override // kj.u, kj.t
    public n e() throws IOException {
        if (this.f63586c != null) {
            throw new IllegalStateException(f63584f.getString("err.ise.getOutputStream"));
        }
        this.f63588e = true;
        return this.f63585b;
    }

    @Override // kj.u, kj.t
    public PrintWriter h() throws UnsupportedEncodingException {
        if (this.f63588e) {
            throw new IllegalStateException(f63584f.getString("err.ise.getWriter"));
        }
        if (this.f63586c == null) {
            this.f63586c = new PrintWriter(new OutputStreamWriter(this.f63585b, f()));
        }
        return this.f63586c;
    }

    public final void s(String str) {
        if ("content-length".equalsIgnoreCase(str)) {
            this.f63587d = true;
        }
    }

    public void t() {
        if (this.f63587d) {
            return;
        }
        PrintWriter printWriter = this.f63586c;
        if (printWriter != null) {
            printWriter.flush();
        }
        p(this.f63585b.d());
    }

    public l(c cVar) {
        super(cVar);
        this.f63585b = new k();
    }

    @Override // lj.d, lj.c
    public void c(String str, String str2) {
        super.c(str, str2);
        s(str);
    }

    @Override // lj.d, lj.c
    public void j(String str, String str2) {
        super.j(str, str2);
        s(str);
    }

    @Override // kj.u, kj.t
    public void p(int i10) {
        super.p(i10);
        this.f63587d = true;
    }
}
