package mj;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static final void a(Throwable th2, Throwable th3) {
        ck.p.j(th2, "<this>");
        ck.p.j(th3, "exception");
        if (th2 != th3) {
            vj.b.f73176a.a(th2, th3);
        }
    }

    public static final String b(Throwable th2) {
        ck.p.j(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }
}
