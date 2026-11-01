package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.UnavailableException;
import kj.k;
import ym.e;

/* JADX INFO: loaded from: classes6.dex */
public class Holder<T> extends ym.a implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f65677s = zm.b.a(Holder.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Source f65678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient Class<? extends T> f65679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, String> f65680m = new HashMap(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f65681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f65682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f65683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f65684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public org.eclipse.jetty.servlet.c f65685r;

    public enum Source {
        EMBEDDED,
        JAVAX_API,
        DESCRIPTOR,
        ANNOTATION
    }

    public class b {
        public b() {
        }

        public String getInitParameter(String str) {
            return Holder.this.getInitParameter(str);
        }

        public Enumeration getInitParameterNames() {
            return Holder.this.o0();
        }

        public k getServletContext() {
            return Holder.this.f65685r.P0();
        }
    }

    public class c {
        public c() {
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65687a;

        static {
            int[] iArr = new int[Source.values().length];
            f65687a = iArr;
            try {
                iArr[Source.JAVAX_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65687a[Source.DESCRIPTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65687a[Source.ANNOTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // ym.a
    public void d0() throws Exception {
        String str;
        if (this.f65679l == null && ((str = this.f65681n) == null || str.equals(""))) {
            throw new UnavailableException("No class for Servlet or Filter for " + this.f65684q);
        }
        if (this.f65679l == null) {
            try {
                this.f65679l = xm.k.c(Holder.class, this.f65681n);
                zm.c cVar = f65677s;
                if (cVar.f()) {
                    cVar.i("Holding {}", this.f65679l);
                }
            } catch (Exception e10) {
                f65677s.e(e10);
                throw new UnavailableException(e10.getMessage());
            }
        }
    }

    @Override // ym.a
    public void e0() throws Exception {
        if (this.f65682o) {
            return;
        }
        this.f65679l = null;
    }

    public String getInitParameter(String str) {
        Map<String, String> map = this.f65680m;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getName() {
        return this.f65684q;
    }

    public String m0() {
        return this.f65681n;
    }

    public Class<? extends T> n0() {
        return this.f65679l;
    }

    public Enumeration o0() {
        Map<String, String> map = this.f65680m;
        return map == null ? Collections.enumeration(Collections.EMPTY_LIST) : Collections.enumeration(map.keySet());
    }

    public org.eclipse.jetty.servlet.c p0() {
        return this.f65685r;
    }

    public Source q0() {
        return this.f65678k;
    }

    public boolean r0() {
        return this.f65683p;
    }

    public void s0(String str) {
        this.f65681n = str;
        this.f65679l = null;
        if (this.f65684q == null) {
            this.f65684q = str + "-" + Integer.toHexString(hashCode());
        }
    }

    public void t0(Class<? extends T> cls) {
        this.f65679l = cls;
        if (cls != null) {
            this.f65681n = cls.getName();
            if (this.f65684q == null) {
                this.f65684q = cls.getName() + "-" + Integer.toHexString(hashCode());
            }
        }
    }

    public String toString() {
        return this.f65684q;
    }

    public void u0(String str, String str2) {
        this.f65680m.put(str, str2);
    }

    public void v0(String str) {
        this.f65684q = str;
    }

    public void w0(org.eclipse.jetty.servlet.c cVar) {
        this.f65685r = cVar;
    }

    @Override // ym.e
    public void z(Appendable appendable, String str) throws IOException {
        appendable.append(this.f65684q).append("==").append(this.f65681n).append(" - ").append(ym.a.g0(this)).append("\n");
        ym.b.p0(appendable, str, this.f65680m.entrySet());
    }

    public Holder(Source source) {
        this.f65678k = source;
        int i10 = a.f65687a[source.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            this.f65683p = true;
        } else {
            this.f65683p = false;
        }
    }
}
