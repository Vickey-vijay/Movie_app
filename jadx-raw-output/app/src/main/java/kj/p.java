package kj;

import java.io.IOException;

/* JADX INFO: compiled from: ServletRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public interface p {
    void a(String str, Object obj);

    m b() throws IOException;

    boolean c();

    h d(String str);

    String e();

    boolean g();

    Object getAttribute(String str);

    String getContentType();

    String getParameter(String str);

    String getProtocol();

    k getServletContext();

    a h();

    a q() throws IllegalStateException;

    String s();
}
