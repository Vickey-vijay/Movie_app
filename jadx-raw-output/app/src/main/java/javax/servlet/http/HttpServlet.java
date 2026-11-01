package javax.servlet.http;

import com.ironsource.Z7;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.ResourceBundle;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import kj.p;
import kj.t;
import lj.a;
import lj.c;
import lj.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HttpServlet extends GenericServlet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ResourceBundle f61733d = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    public final Method[] a(Class<? extends HttpServlet> cls) {
        Method[] methodArr = null;
        while (!cls.equals(HttpServlet.class)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            if (methodArr == null || methodArr.length <= 0) {
                methodArr = declaredMethods;
            } else {
                Method[] methodArr2 = new Method[declaredMethods.length + methodArr.length];
                System.arraycopy(declaredMethods, 0, methodArr2, 0, declaredMethods.length);
                System.arraycopy(methodArr, 0, methodArr2, declaredMethods.length, methodArr.length);
                methodArr = methodArr2;
            }
            cls = cls.getSuperclass();
        }
        return methodArr != null ? methodArr : new Method[0];
    }

    public long getLastModified(a aVar) {
        return -1L;
    }

    public void service(a aVar, c cVar) throws ServletException, IOException {
        String method = aVar.getMethod();
        if (method.equals("GET")) {
            long lastModified = getLastModified(aVar);
            if (lastModified == -1) {
                doGet(aVar, cVar);
                return;
            } else if (aVar.u("If-Modified-Since") >= lastModified) {
                cVar.k(304);
                return;
            } else {
                b(cVar, lastModified);
                doGet(aVar, cVar);
                return;
            }
        }
        if (method.equals("HEAD")) {
            b(cVar, getLastModified(aVar));
            doHead(aVar, cVar);
            return;
        }
        if (method.equals("POST")) {
            doPost(aVar, cVar);
            return;
        }
        if (method.equals("PUT")) {
            doPut(aVar, cVar);
            return;
        }
        if (method.equals("DELETE")) {
            doDelete(aVar, cVar);
            return;
        }
        if (method.equals("OPTIONS")) {
            doOptions(aVar, cVar);
        } else if (method.equals("TRACE")) {
            doTrace(aVar, cVar);
        } else {
            cVar.m(501, MessageFormat.format(f61733d.getString("http.method_not_implemented"), method));
        }
    }

    public final void b(c cVar, long j10) {
        if (!cVar.i("Last-Modified") && j10 >= 0) {
            cVar.d("Last-Modified", j10);
        }
    }

    public void doHead(a aVar, c cVar) throws ServletException, IOException {
        l lVar = new l(cVar);
        doGet(aVar, lVar);
        lVar.t();
    }

    public void doTrace(a aVar, c cVar) throws ServletException, IOException {
        StringBuilder sb2 = new StringBuilder("TRACE ");
        sb2.append(aVar.v());
        sb2.append(Z7.f27998r);
        sb2.append(aVar.getProtocol());
        Enumeration<String> enumerationK = aVar.k();
        while (enumerationK.hasMoreElements()) {
            String strNextElement = enumerationK.nextElement();
            sb2.append("\r\n");
            sb2.append(strNextElement);
            sb2.append(": ");
            sb2.append(aVar.m(strNextElement));
        }
        sb2.append("\r\n");
        int length = sb2.length();
        cVar.l("message/http");
        cVar.p(length);
        cVar.e().b(sb2.toString());
    }

    public void doDelete(a aVar, c cVar) throws ServletException, IOException {
        String protocol = aVar.getProtocol();
        String string = f61733d.getString("http.method_delete_not_supported");
        if (protocol.endsWith("1.1")) {
            cVar.m(405, string);
        } else {
            cVar.m(400, string);
        }
    }

    public void doGet(a aVar, c cVar) throws ServletException, IOException {
        String protocol = aVar.getProtocol();
        String string = f61733d.getString("http.method_get_not_supported");
        if (protocol.endsWith("1.1")) {
            cVar.m(405, string);
        } else {
            cVar.m(400, string);
        }
    }

    public void doOptions(a aVar, c cVar) throws ServletException, IOException {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        for (Method method : a(getClass())) {
            String name = method.getName();
            if (name.equals("doGet")) {
                z10 = true;
                z11 = true;
            } else if (name.equals("doPost")) {
                z12 = true;
            } else if (name.equals("doPut")) {
                z13 = true;
            } else if (name.equals("doDelete")) {
                z14 = true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("GET");
        }
        if (z11) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append("HEAD");
        }
        if (z12) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append("POST");
        }
        if (z13) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append("PUT");
        }
        if (z14) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append("DELETE");
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("TRACE");
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append("OPTIONS");
        cVar.j("Allow", sb2.toString());
    }

    public void doPost(a aVar, c cVar) throws ServletException, IOException {
        String protocol = aVar.getProtocol();
        String string = f61733d.getString("http.method_post_not_supported");
        if (protocol.endsWith("1.1")) {
            cVar.m(405, string);
        } else {
            cVar.m(400, string);
        }
    }

    public void doPut(a aVar, c cVar) throws ServletException, IOException {
        String protocol = aVar.getProtocol();
        String string = f61733d.getString("http.method_put_not_supported");
        if (protocol.endsWith("1.1")) {
            cVar.m(405, string);
        } else {
            cVar.m(400, string);
        }
    }

    @Override // javax.servlet.GenericServlet, kj.i
    public void service(p pVar, t tVar) throws ServletException, IOException {
        if ((pVar instanceof a) && (tVar instanceof c)) {
            service((a) pVar, (c) tVar);
            return;
        }
        throw new ServletException("non-HTTP request or response");
    }
}
