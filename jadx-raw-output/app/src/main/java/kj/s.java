package kj;

import java.io.IOException;

/* JADX INFO: compiled from: ServletRequestWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class s implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f62827a;

    @Override // kj.p
    public void a(String str, Object obj) {
        this.f62827a.a(str, obj);
    }

    @Override // kj.p
    public m b() throws IOException {
        return this.f62827a.b();
    }

    @Override // kj.p
    public boolean c() {
        return this.f62827a.c();
    }

    @Override // kj.p
    public h d(String str) {
        return this.f62827a.d(str);
    }

    @Override // kj.p
    public String e() {
        return this.f62827a.e();
    }

    @Override // kj.p
    public boolean g() {
        return this.f62827a.g();
    }

    @Override // kj.p
    public Object getAttribute(String str) {
        return this.f62827a.getAttribute(str);
    }

    @Override // kj.p
    public String getContentType() {
        return this.f62827a.getContentType();
    }

    @Override // kj.p
    public String getParameter(String str) {
        return this.f62827a.getParameter(str);
    }

    @Override // kj.p
    public String getProtocol() {
        return this.f62827a.getProtocol();
    }

    @Override // kj.p
    public k getServletContext() {
        return this.f62827a.getServletContext();
    }

    @Override // kj.p
    public a h() {
        return this.f62827a.h();
    }

    @Override // kj.p
    public a q() throws IllegalStateException {
        return this.f62827a.q();
    }

    @Override // kj.p
    public String s() {
        return this.f62827a.s();
    }

    public p w() {
        return this.f62827a;
    }

    public s(p pVar) {
        if (pVar != null) {
            this.f62827a = pVar;
            return;
        }
        throw new IllegalArgumentException("Request cannot be null");
    }
}
