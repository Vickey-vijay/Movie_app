package org.eclipse.jetty.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import kj.d;
import kj.i;
import kj.l;
import org.eclipse.jetty.util.LazyList;
import pm.k;
import rm.j;
import tm.e;
import tm.f;
import vm.g;

/* JADX INFO: compiled from: ServletContextHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends tm.c {
    public final List<InterfaceC0611b> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Class<? extends k> f65706a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public g f65707b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public k f65708c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c f65709d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public tm.g f65710e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f65711f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Object f65712g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f65713h0;

    /* JADX INFO: compiled from: ServletContextHandler.java */
    public class a extends tm.c.d {
        public a() {
            super();
        }

        public <T extends d> T j(Class<T> cls) throws ServletException {
            try {
                T tNewInstance = cls.newInstance();
                for (int size = b.this.Z.size() - 1; size >= 0; size--) {
                    tNewInstance = (T) b.this.Z.get(size).b(tNewInstance);
                }
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new ServletException(e10);
            } catch (InstantiationException e11) {
                throw new ServletException(e11);
            }
        }

        public <T extends i> T k(Class<T> cls) throws ServletException {
            try {
                T tNewInstance = cls.newInstance();
                for (int size = b.this.Z.size() - 1; size >= 0; size--) {
                    tNewInstance = (T) b.this.Z.get(size).a(tNewInstance);
                }
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new ServletException(e10);
            } catch (InstantiationException e11) {
                throw new ServletException(e11);
            }
        }
    }

    /* JADX INFO: renamed from: org.eclipse.jetty.servlet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ServletContextHandler.java */
    public interface InterfaceC0611b {
        <T extends i> T a(T t10) throws ServletException;

        <T extends d> T b(T t10) throws ServletException;

        void c(d dVar);

        void d(org.eclipse.jetty.servlet.a aVar) throws ServletException;

        void e(i iVar);

        void f(ServletHolder servletHolder) throws ServletException;
    }

    public b() {
        this(null, null, null, null, null);
    }

    @Override // tm.c
    public void O0(l lVar, ServletContextEvent servletContextEvent) {
        try {
            if (LazyList.contains(this.f65712g0, lVar)) {
                c1().i(false);
            }
            super.O0(lVar, servletContextEvent);
        } finally {
            c1().i(true);
        }
    }

    public b(int i10) {
        this(null, null, i10);
    }

    public void n1(d dVar) {
        Iterator<InterfaceC0611b> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().c(dVar);
        }
    }

    public void o1(i iVar) {
        Iterator<InterfaceC0611b> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().e(iVar);
        }
    }

    public k p1() {
        if (this.f65708c0 == null && (this.f65711f0 & 2) != 0 && !isStarted()) {
            this.f65708c0 = s1();
        }
        return this.f65708c0;
    }

    public c q1() {
        if (this.f65709d0 == null && !isStarted()) {
            this.f65709d0 = t1();
        }
        return this.f65709d0;
    }

    public g r1() {
        if (this.f65707b0 == null && (this.f65711f0 & 1) != 0 && !isStarted()) {
            this.f65707b0 = u1();
        }
        return this.f65707b0;
    }

    public k s1() {
        try {
            return this.f65706a0.newInstance();
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public c t1() {
        return new c();
    }

    public g u1() {
        return new g();
    }

    public b(j jVar, String str, int i10) {
        this(jVar, str, null, null, null, null);
        this.f65711f0 = i10;
    }

    @Override // tm.c, tm.g, tm.a, ym.b, ym.a
    public void e0() throws Exception {
        super.e0();
        List<InterfaceC0611b> list = this.Z;
        if (list != null) {
            list.clear();
        }
        tm.g gVar = this.f65710e0;
        if (gVar != null) {
            gVar.B0(null);
        }
    }

    @Override // tm.c
    public void l1() throws Exception {
        r1();
        p1();
        q1();
        tm.g gVar = this.f65709d0;
        k kVar = this.f65708c0;
        if (kVar != null) {
            kVar.B0(gVar);
            gVar = this.f65708c0;
        }
        g gVar2 = this.f65707b0;
        if (gVar2 != null) {
            gVar2.B0(gVar);
            gVar = this.f65707b0;
        }
        this.f65710e0 = this;
        while (true) {
            tm.g gVar3 = this.f65710e0;
            if (gVar3 == gVar || !(gVar3.A0() instanceof tm.g)) {
                break;
            } else {
                this.f65710e0 = (tm.g) this.f65710e0.A0();
            }
        }
        tm.g gVar4 = this.f65710e0;
        if (gVar4 != gVar) {
            if (gVar4.A0() == null) {
                this.f65710e0.B0(gVar);
            } else {
                throw new IllegalStateException("!ScopedHandler");
            }
        }
        super.l1();
        c cVar = this.f65709d0;
        if (cVar != null && cVar.isStarted()) {
            for (int size = this.Z.size() - 1; size >= 0; size--) {
                InterfaceC0611b interfaceC0611b = this.Z.get(size);
                if (this.f65709d0.N0() != null) {
                    for (org.eclipse.jetty.servlet.a aVar : this.f65709d0.N0()) {
                        interfaceC0611b.d(aVar);
                    }
                }
                if (this.f65709d0.R0() != null) {
                    for (ServletHolder servletHolder : this.f65709d0.R0()) {
                        interfaceC0611b.f(servletHolder);
                    }
                }
            }
            this.f65709d0.S0();
        }
    }

    public void m1(ServletHolder servletHolder, String str) {
        q1().I0(servletHolder, str);
    }

    public b(j jVar, g gVar, k kVar, c cVar, e eVar) {
        this(jVar, null, gVar, kVar, cVar, eVar);
    }

    public b(j jVar, String str, g gVar, k kVar, c cVar, e eVar) {
        super(null);
        this.Z = new ArrayList();
        this.f65706a0 = pm.c.class;
        this.f65713h0 = true;
        this.f72435t = new a();
        this.f65707b0 = gVar;
        this.f65708c0 = kVar;
        this.f65709d0 = cVar;
        if (eVar != null) {
            i1(eVar);
        }
        if (str != null) {
            h1(str);
        }
        if (jVar instanceof tm.g) {
            ((tm.g) jVar).B0(this);
        } else if (jVar instanceof f) {
            ((f) jVar).B0(this);
        }
    }
}
