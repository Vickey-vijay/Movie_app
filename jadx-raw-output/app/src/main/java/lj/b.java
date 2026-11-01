package lj;

import java.util.Enumeration;
import javax.servlet.http.Cookie;
import kj.s;

/* JADX INFO: compiled from: HttpServletRequestWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends s implements a {
    public b(a aVar) {
        super(aVar);
    }

    @Override // lj.a
    public String f() {
        return x().f();
    }

    @Override // lj.a
    public String getMethod() {
        return x().getMethod();
    }

    @Override // lj.a
    public String i() {
        return x().i();
    }

    @Override // lj.a
    public Cookie[] j() {
        return x().j();
    }

    @Override // lj.a
    public Enumeration<String> k() {
        return x().k();
    }

    @Override // lj.a
    public String l() {
        return x().l();
    }

    @Override // lj.a
    public String m(String str) {
        return x().m(str);
    }

    @Override // lj.a
    public String n() {
        return x().n();
    }

    @Override // lj.a
    public Enumeration<String> o(String str) {
        return x().o(str);
    }

    @Override // lj.a
    public e p(boolean z10) {
        return x().p(z10);
    }

    @Override // lj.a
    public StringBuffer r() {
        return x().r();
    }

    @Override // lj.a
    public String t() {
        return x().t();
    }

    @Override // lj.a
    public long u(String str) {
        return x().u(str);
    }

    @Override // lj.a
    public String v() {
        return x().v();
    }

    public final a x() {
        return (a) super.w();
    }
}
