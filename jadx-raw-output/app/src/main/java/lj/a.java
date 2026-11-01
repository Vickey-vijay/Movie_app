package lj;

import java.util.Enumeration;
import javax.servlet.http.Cookie;
import kj.p;

/* JADX INFO: compiled from: HttpServletRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends p {
    String f();

    String getMethod();

    String i();

    Cookie[] j();

    Enumeration<String> k();

    String l();

    String m(String str);

    String n();

    Enumeration<String> o(String str);

    e p(boolean z10);

    StringBuffer r();

    String t();

    long u(String str);

    String v();
}
