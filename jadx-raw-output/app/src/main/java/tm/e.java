package tm;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import javax.servlet.ServletException;
import org.eclipse.jetty.http.HttpStatus;
import rm.n;

/* JADX INFO: compiled from: ErrorHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends tm.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f72450s = zm.b.a(e.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f72451p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f72452q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f72453r = "must-revalidate,no-cache,no-store";

    /* JADX INFO: compiled from: ErrorHandler.java */
    public interface a {
        String a(lj.a aVar);
    }

    public void B0(lj.a aVar, Writer writer, int i10, String str) throws IOException {
        writer.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"/>\n");
        writer.write("<title>Error ");
        writer.write(Integer.toString(i10));
        if (this.f72452q) {
            writer.write(32);
            y0(writer, str);
        }
        writer.write("</title>\n");
    }

    public void C0(lj.a aVar, Writer writer, int i10, String str, String str2) throws IOException {
        writer.write("<h2>HTTP ERROR ");
        writer.write(Integer.toString(i10));
        writer.write("</h2>\n<p>Problem accessing ");
        y0(writer, str2);
        writer.write(". Reason:\n<pre>    ");
        y0(writer, str);
        writer.write("</pre></p>");
    }

    public void D0(lj.a aVar, Writer writer) throws IOException {
        for (Throwable cause = (Throwable) aVar.getAttribute("javax.servlet.error.exception"); cause != null; cause = cause.getCause()) {
            writer.write("<h3>Caused by:</h3><pre>");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            cause.printStackTrace(printWriter);
            printWriter.flush();
            y0(writer, stringWriter.getBuffer().toString());
            writer.write("</pre>\n");
        }
    }

    public void x0(lj.a aVar, Writer writer, int i10, String str) throws IOException {
        z0(aVar, writer, i10, str, this.f72451p);
    }

    public void y0(Writer writer, String str) throws IOException {
        if (str == null) {
            return;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '&') {
                writer.write("&amp;");
            } else if (cCharAt == '<') {
                writer.write("&lt;");
            } else if (cCharAt == '>') {
                writer.write("&gt;");
            } else if (!Character.isISOControl(cCharAt) || Character.isWhitespace(cCharAt)) {
                writer.write(cCharAt);
            } else {
                writer.write(63);
            }
        }
    }

    public void z0(lj.a aVar, Writer writer, int i10, String str, boolean z10) throws IOException {
        if (str == null) {
            str = HttpStatus.b(i10);
        }
        String str2 = str;
        writer.write("<html>\n<head>\n");
        B0(aVar, writer, i10, str2);
        writer.write("</head>\n<body>");
        A0(aVar, writer, i10, str2, z10);
        writer.write("\n</body>\n</html>\n");
    }

    public void A0(lj.a aVar, Writer writer, int i10, String str, boolean z10) throws IOException {
        C0(aVar, writer, i10, str, aVar.v());
        if (z10) {
            D0(aVar, writer);
        }
        writer.write("<hr /><i><small>Powered by Jetty://</small></i>");
        for (int i11 = 0; i11 < 20; i11++) {
            writer.write("<br/>                                                \n");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rm.i
    public void v(String str, n nVar, lj.a aVar, lj.c cVar) throws IOException {
        String strA;
        String str2;
        rm.b bVarO = rm.b.o();
        String method = aVar.getMethod();
        if (!method.equals("GET") && !method.equals("POST") && !method.equals("HEAD")) {
            bVarO.w().m0(true);
            return;
        }
        if ((this instanceof a) && (strA = ((a) this).a(aVar)) != null && aVar.getServletContext() != null && ((str2 = (String) aVar.getAttribute("org.eclipse.jetty.server.error_page")) == null || !str2.equals(strA))) {
            aVar.a("org.eclipse.jetty.server.error_page", strA);
            rm.h hVar = (rm.h) aVar.getServletContext().d(strA);
            try {
                if (hVar != null) {
                    hVar.d(aVar, cVar);
                    return;
                }
                f72450s.g("No error page " + strA, new Object[0]);
            } catch (ServletException e10) {
                f72450s.c("EXCEPTION ", e10);
                return;
            }
        }
        bVarO.w().m0(true);
        cVar.l("text/html;charset=ISO-8859-1");
        String str3 = this.f72453r;
        if (str3 != null) {
            cVar.j("Cache-Control", str3);
        }
        xm.f fVar = new xm.f(4096);
        x0(aVar, fVar, bVarO.B().w(), bVarO.B().u());
        fVar.flush();
        cVar.p(fVar.h());
        fVar.k(cVar.e());
        fVar.d();
    }
}
