package kj;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: compiled from: ServletResponseWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f62828a;

    @Override // kj.t
    public boolean a() {
        return this.f62828a.a();
    }

    @Override // kj.t
    public void b() {
        this.f62828a.b();
    }

    @Override // kj.t
    public n e() throws IOException {
        return this.f62828a.e();
    }

    @Override // kj.t
    public String f() {
        return this.f62828a.f();
    }

    @Override // kj.t
    public PrintWriter h() throws IOException {
        return this.f62828a.h();
    }

    @Override // kj.t
    public void l(String str) {
        this.f62828a.l(str);
    }

    @Override // kj.t
    public void p(int i10) {
        this.f62828a.p(i10);
    }

    public t q() {
        return this.f62828a;
    }

    public u(t tVar) {
        if (tVar != null) {
            this.f62828a = tVar;
            return;
        }
        throw new IllegalArgumentException("Response cannot be null");
    }
}
