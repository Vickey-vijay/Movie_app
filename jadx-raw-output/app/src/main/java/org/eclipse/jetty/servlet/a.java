package org.eclipse.jetty.servlet;

import javax.servlet.ServletException;
import kj.d;
import kj.f;

/* JADX INFO: compiled from: FilterHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends Holder<d> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final zm.c f65702v = zm.b.a(a.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient d f65703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient C0610a f65704u;

    /* JADX INFO: renamed from: org.eclipse.jetty.servlet.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FilterHolder.java */
    public class C0610a extends Holder<d>.b implements f {
        public C0610a() {
            super();
        }
    }

    public a() {
        this(Holder.Source.EMBEDDED);
    }

    public a(Holder.Source source) {
        super(source);
    }

    @Override // org.eclipse.jetty.servlet.Holder, ym.a
    public void e0() throws Exception {
        d dVar = this.f65703t;
        if (dVar != null) {
            try {
                x0(dVar);
            } catch (Exception e10) {
                f65702v.e(e10);
            }
        }
        if (!this.f65682o) {
            this.f65703t = null;
        }
        this.f65704u = null;
        super.e0();
    }

    public void x0(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        d dVar = (d) obj;
        dVar.destroy();
        p0().J0(dVar);
    }

    public d y0() {
        return this.f65703t;
    }

    @Override // org.eclipse.jetty.servlet.Holder, ym.a
    public void d0() throws Exception {
        super.d0();
        if (d.class.isAssignableFrom(this.f65679l)) {
            if (this.f65703t == null) {
                try {
                    this.f65703t = ((b.a) this.f65685r.P0()).j(n0());
                } catch (ServletException e10) {
                    Throwable rootCause = e10.getRootCause();
                    if (!(rootCause instanceof InstantiationException)) {
                        if (rootCause instanceof IllegalAccessException) {
                            throw ((IllegalAccessException) rootCause);
                        }
                        throw e10;
                    }
                    throw ((InstantiationException) rootCause);
                }
            }
            C0610a c0610a = new C0610a();
            this.f65704u = c0610a;
            this.f65703t.b(c0610a);
            return;
        }
        String str = this.f65679l + " is not a javax.servlet.Filter";
        super.stop();
        throw new IllegalStateException(str);
    }

    @Override // org.eclipse.jetty.servlet.Holder
    public String toString() {
        return getName();
    }
}
