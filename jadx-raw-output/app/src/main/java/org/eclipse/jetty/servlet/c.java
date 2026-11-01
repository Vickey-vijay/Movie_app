package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import kj.d;
import kj.e;
import kj.i;
import kj.p;
import kj.t;
import org.eclipse.jetty.continuation.ContinuationThrowable;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.io.EofException;
import org.eclipse.jetty.io.RuntimeIOException;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import pm.f;
import pm.k;
import rm.n;
import rm.r;
import rm.v;
import tm.h;
import xm.q;

/* JADX INFO: compiled from: ServletHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends h {
    public static final zm.c M;
    public static final zm.c N;
    public f C;
    public wm.b[] E;
    public List<wm.a> G;
    public MultiMap<String> H;
    public PathMap J;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public org.eclipse.jetty.servlet.b f65715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public tm.c.d f65716u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wm.a[] f65718w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public org.eclipse.jetty.servlet.a[] f65717v = new org.eclipse.jetty.servlet.a[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f65719x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f65720y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f65721z = true;
    public int A = 512;
    public boolean B = false;
    public ServletHolder[] D = new ServletHolder[0];
    public final Map<String, org.eclipse.jetty.servlet.a> F = new HashMap();
    public final Map<String, ServletHolder> I = new HashMap();
    public final ConcurrentMap<String, e>[] K = new ConcurrentMap[31];
    public final Queue<String>[] L = new Queue[31];

    /* JADX INFO: compiled from: ServletHandler.java */
    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public org.eclipse.jetty.servlet.a f65722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f65723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ServletHolder f65724c;

        public a(Object obj, ServletHolder servletHolder) {
            if (LazyList.size(obj) <= 0) {
                this.f65724c = servletHolder;
            } else {
                this.f65722a = (org.eclipse.jetty.servlet.a) LazyList.get(obj, 0);
                this.f65723b = c.this.V0(LazyList.remove(obj, 0), servletHolder);
            }
        }

        @Override // kj.e
        public void a(p pVar, t tVar) throws ServletException, IOException {
            n nVarW = pVar instanceof n ? (n) pVar : rm.b.o().w();
            if (this.f65722a == null) {
                lj.a aVar = (lj.a) pVar;
                if (this.f65724c == null) {
                    if (c.this.A0() == null) {
                        c.this.W0(aVar, (lj.c) tVar);
                        return;
                    } else {
                        c.this.F0(q.a(aVar.t(), aVar.l()), nVarW, aVar, (lj.c) tVar);
                        return;
                    }
                }
                if (c.M.f()) {
                    c.M.i("call servlet " + this.f65724c, new Object[0]);
                }
                this.f65724c.E0(nVarW, pVar, tVar);
                return;
            }
            if (c.M.f()) {
                c.M.i("call filter " + this.f65722a, new Object[0]);
            }
            d dVarY0 = this.f65722a.y0();
            if (this.f65722a.r0()) {
                dVarY0.a(pVar, tVar, this.f65723b);
                return;
            }
            if (!nVarW.W()) {
                dVarY0.a(pVar, tVar, this.f65723b);
                return;
            }
            try {
                nVarW.e0(false);
                dVarY0.a(pVar, tVar, this.f65723b);
            } finally {
                nVarW.e0(true);
            }
        }

        public String toString() {
            if (this.f65722a == null) {
                ServletHolder servletHolder = this.f65724c;
                return servletHolder != null ? servletHolder.toString() : "null";
            }
            return this.f65722a + "->" + this.f65723b.toString();
        }
    }

    /* JADX INFO: compiled from: ServletHandler.java */
    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f65726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f65727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ServletHolder f65728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f65729d = 0;

        public b(n nVar, Object obj, ServletHolder servletHolder) {
            this.f65726a = nVar;
            this.f65727b = obj;
            this.f65728c = servletHolder;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < LazyList.size(this.f65727b); i10++) {
                sb2.append(LazyList.get(this.f65727b, i10).toString());
                sb2.append("->");
            }
            sb2.append(this.f65728c);
            return sb2.toString();
        }

        @Override // kj.e
        public void a(p pVar, t tVar) throws ServletException, IOException {
            n nVarW;
            if (c.M.f()) {
                c.M.i("doFilter " + this.f65729d, new Object[0]);
            }
            if (this.f65729d < LazyList.size(this.f65727b)) {
                Object obj = this.f65727b;
                int i10 = this.f65729d;
                this.f65729d = i10 + 1;
                org.eclipse.jetty.servlet.a aVar = (org.eclipse.jetty.servlet.a) LazyList.get(obj, i10);
                if (c.M.f()) {
                    c.M.i("call filter " + aVar, new Object[0]);
                }
                d dVarY0 = aVar.y0();
                if (!aVar.r0() && this.f65726a.W()) {
                    try {
                        this.f65726a.e0(false);
                        dVarY0.a(pVar, tVar, this);
                        return;
                    } finally {
                        this.f65726a.e0(true);
                    }
                }
                dVarY0.a(pVar, tVar, this);
                return;
            }
            lj.a aVar2 = (lj.a) pVar;
            if (this.f65728c != null) {
                if (c.M.f()) {
                    c.M.i("call servlet " + this.f65728c, new Object[0]);
                }
                this.f65728c.E0(this.f65726a, pVar, tVar);
                return;
            }
            if (c.this.A0() == null) {
                c.this.W0(aVar2, (lj.c) tVar);
                return;
            }
            if (pVar instanceof n) {
                nVarW = (n) pVar;
            } else {
                nVarW = rm.b.o().w();
            }
            c.this.F0(q.a(aVar2.t(), aVar2.l()), nVarW, aVar2, (lj.c) tVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019a A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01b1 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b5 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01be A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c4 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01ca A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ce A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f0 A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f4 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f8 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0207  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0145 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0149 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0151 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0162 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x01ce, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // tm.h
    public void C0(String str, n nVar, lj.a aVar, lj.c cVar) throws Throwable {
        wm.a[] aVarArr;
        e eVarL0;
        Throwable th2;
        zm.c cVar2;
        wm.a[] aVarArr2;
        DispatcherType dispatcherTypeF = nVar.F();
        ServletHolder servletHolder = (ServletHolder) nVar.V();
        e eVar = null;
        if (str.startsWith("/")) {
            if (servletHolder == null || (aVarArr2 = this.f65718w) == null || aVarArr2.length <= 0) {
                eVarL0 = null;
            } else {
                eVarL0 = L0(nVar, str, servletHolder);
            }
        } else if (servletHolder == null || (aVarArr = this.f65718w) == null || aVarArr.length <= 0) {
            eVarL0 = null;
        } else {
            eVarL0 = L0(nVar, null, servletHolder);
        }
        M.i("chain={}", eVarL0);
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (servletHolder != null) {
                                    p pVarW = aVar instanceof rm.q ? ((rm.q) aVar).w() : aVar;
                                    t tVarQ = cVar instanceof r ? ((r) cVar).q() : cVar;
                                    if (eVarL0 != null) {
                                        eVarL0.a(pVarW, tVarQ);
                                    } else {
                                        servletHolder.E0(nVar, pVarW, tVarQ);
                                    }
                                } else if (A0() == null) {
                                    W0(aVar, cVar);
                                } else {
                                    F0(str, nVar, aVar, cVar);
                                }
                                if (servletHolder != null) {
                                    nVar.m0(true);
                                }
                            } catch (Exception e10) {
                                if (!DispatcherType.REQUEST.equals(dispatcherTypeF) && !DispatcherType.ASYNC.equals(dispatcherTypeF)) {
                                    if (e10 instanceof IOException) {
                                        throw ((IOException) e10);
                                    }
                                    if (e10 instanceof RuntimeException) {
                                        throw ((RuntimeException) e10);
                                    }
                                    if (e10 instanceof ServletException) {
                                        throw ((ServletException) e10);
                                    }
                                }
                                if (!(e10 instanceof UnavailableException)) {
                                    if (e10 instanceof ServletException) {
                                        M.e(e10);
                                        Throwable rootCause = ((ServletException) e10).getRootCause();
                                        if (rootCause != null) {
                                            th2 = rootCause;
                                        }
                                    }
                                    if (!(th2 instanceof HttpException)) {
                                        throw ((HttpException) th2);
                                    }
                                    if (!(th2 instanceof RuntimeIOException)) {
                                        throw ((RuntimeIOException) th2);
                                    }
                                    if (!(th2 instanceof EofException)) {
                                        throw ((EofException) th2);
                                    }
                                    cVar2 = M;
                                    if (cVar2.f()) {
                                        cVar2.c(aVar.v(), th2);
                                        cVar2.i(aVar.toString(), new Object[0]);
                                    } else if (!(th2 instanceof IOException) || (th2 instanceof UnavailableException)) {
                                        cVar2.d(aVar.v(), th2);
                                    } else {
                                        cVar2.g("Error Processing URI: {} - ({}) {}", aVar.v(), th2.getClass().getName(), th2.getMessage());
                                        zm.c cVar3 = N;
                                        if (cVar3.f()) {
                                            cVar3.d(aVar.v(), th2);
                                        }
                                    }
                                    aVar.a("javax.servlet.error.exception_type", th2.getClass());
                                    aVar.a("javax.servlet.error.exception", th2);
                                    if (!cVar.a()) {
                                        cVar2.i("Response already committed for handling " + th2, new Object[0]);
                                    } else if (th2 instanceof UnavailableException) {
                                        cVar.o(500);
                                    } else if (((UnavailableException) th2).isPermanent()) {
                                        cVar.o(404);
                                    } else {
                                        cVar.o(503);
                                    }
                                    if (servletHolder != null) {
                                        nVar.m0(true);
                                    }
                                    if (!aVar.g()) {
                                        return;
                                    }
                                    ((rm.c) aVar.h()).h();
                                }
                                M.a(e10);
                                th2 = e10;
                                if (!(th2 instanceof HttpException)) {
                                    throw ((HttpException) th2);
                                }
                                if (!(th2 instanceof RuntimeIOException)) {
                                    throw ((RuntimeIOException) th2);
                                }
                                if (!(th2 instanceof EofException)) {
                                    throw ((EofException) th2);
                                }
                                cVar2 = M;
                                if (cVar2.f()) {
                                    cVar2.c(aVar.v(), th2);
                                    cVar2.i(aVar.toString(), new Object[0]);
                                } else if (th2 instanceof IOException) {
                                    cVar2.d(aVar.v(), th2);
                                } else {
                                    cVar2.d(aVar.v(), th2);
                                }
                                aVar.a("javax.servlet.error.exception_type", th2.getClass());
                                aVar.a("javax.servlet.error.exception", th2);
                                if (!cVar.a()) {
                                    cVar2.i("Response already committed for handling " + th2, new Object[0]);
                                } else if (th2 instanceof UnavailableException) {
                                    cVar.o(500);
                                } else if (((UnavailableException) th2).isPermanent()) {
                                    cVar.o(404);
                                } else {
                                    cVar.o(503);
                                }
                                if (servletHolder != null) {
                                    nVar.m0(true);
                                }
                                if (!aVar.g()) {
                                    return;
                                }
                                ((rm.c) aVar.h()).h();
                            }
                        } catch (EofException e11) {
                            throw e11;
                        }
                    } catch (RuntimeIOException e12) {
                        throw e12;
                    }
                } catch (ContinuationThrowable e13) {
                    throw e13;
                } catch (Error e14) {
                    if (!DispatcherType.REQUEST.equals(dispatcherTypeF) && !DispatcherType.ASYNC.equals(dispatcherTypeF)) {
                        throw e14;
                    }
                    zm.c cVar4 = M;
                    cVar4.c("Error for " + aVar.v(), e14);
                    if (cVar4.f()) {
                        cVar4.i(aVar.toString(), new Object[0]);
                    }
                    aVar.a("javax.servlet.error.exception_type", e14.getClass());
                    aVar.a("javax.servlet.error.exception", e14);
                    if (cVar.a()) {
                        cVar4.d("Response already committed for handling ", e14);
                    } else {
                        cVar.o(500);
                    }
                    if (servletHolder != null) {
                        nVar.m0(true);
                    }
                    if (!aVar.g()) {
                        return;
                    }
                    ((rm.c) aVar.h()).h();
                }
            } catch (Throwable th3) {
                th = th3;
                if (servletHolder != null) {
                    nVar.m0(true);
                }
                if (eVar != null && aVar.g()) {
                    ((rm.c) aVar.h()).h();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            eVar = eVarL0;
            if (servletHolder != null) {
                nVar.m0(true);
            }
            if (eVar != null) {
                ((rm.c) aVar.h()).h();
            }
            throw th;
        }
    }

    public synchronized void Y0(ServletHolder[] servletHolderArr) {
        if (b() != null) {
            b().E0().update((Object) this, (Object[]) this.D, (Object[]) servletHolderArr, "servlet", true);
        }
        this.D = servletHolderArr;
        a1();
        T0();
    }

    public synchronized void Z0() {
        if (this.f65718w != null) {
            this.G = new ArrayList();
            this.H = new MultiMap<>();
            int i10 = 0;
            while (true) {
                wm.a[] aVarArr = this.f65718w;
                if (i10 >= aVarArr.length) {
                    break;
                }
                org.eclipse.jetty.servlet.a aVar = this.F.get(aVarArr[i10].e());
                if (aVar == null) {
                    throw new IllegalStateException("No filter named " + this.f65718w[i10].e());
                }
                this.f65718w[i10].h(aVar);
                if (this.f65718w[i10].f() != null) {
                    this.G.add(this.f65718w[i10]);
                }
                if (this.f65718w[i10].g() != null) {
                    for (String str : this.f65718w[i10].g()) {
                        if (str != null) {
                            this.H.add(str, this.f65718w[i10]);
                        }
                    }
                }
                i10++;
            }
        } else {
            this.G = null;
            this.H = null;
        }
        if (this.E == null || this.I == null) {
            this.J = null;
        } else {
            PathMap pathMap = new PathMap();
            int i11 = 0;
            while (true) {
                wm.b[] bVarArr = this.E;
                if (i11 >= bVarArr.length) {
                    this.J = pathMap;
                    break;
                }
                ServletHolder servletHolder = this.I.get(bVarArr[i11].b());
                if (servletHolder == null) {
                    throw new IllegalStateException("No such servlet: " + this.E[i11].b());
                }
                if (servletHolder.I0() && this.E[i11].a() != null) {
                    for (String str2 : this.E[i11].a()) {
                        if (str2 != null) {
                            pathMap.put(str2, servletHolder);
                        }
                    }
                }
                i11++;
            }
        }
        ConcurrentMap<String, e>[] concurrentMapArr = this.K;
        if (concurrentMapArr != null) {
            int length = concurrentMapArr.length;
            while (true) {
                int i12 = length - 1;
                if (length <= 0) {
                    break;
                }
                ConcurrentMap<String, e> concurrentMap = this.K[i12];
                if (concurrentMap != null) {
                    concurrentMap.clear();
                }
                length = i12;
            }
        }
        zm.c cVar = M;
        if (cVar.f()) {
            cVar.i("filterNameMap=" + this.F, new Object[0]);
            cVar.i("pathFilters=" + this.G, new Object[0]);
            cVar.i("servletFilterMap=" + this.H, new Object[0]);
            cVar.i("servletPathMap=" + this.J, new Object[0]);
            cVar.i("servletNameMap=" + this.I, new Object[0]);
        }
        try {
            org.eclipse.jetty.servlet.b bVar = this.f65715t;
            if ((bVar != null && bVar.isStarted()) || (this.f65715t == null && isStarted())) {
                S0();
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public synchronized void a1() {
        this.F.clear();
        int i10 = 0;
        if (this.f65717v != null) {
            int i11 = 0;
            while (true) {
                org.eclipse.jetty.servlet.a[] aVarArr = this.f65717v;
                if (i11 >= aVarArr.length) {
                    break;
                }
                this.F.put(aVarArr[i11].getName(), this.f65717v[i11]);
                this.f65717v[i11].w0(this);
                i11++;
            }
        }
        this.I.clear();
        if (this.D != null) {
            while (true) {
                ServletHolder[] servletHolderArr = this.D;
                if (i10 >= servletHolderArr.length) {
                    break;
                }
                this.I.put(servletHolderArr[i10].getName(), this.D[i10]);
                this.D[i10].w0(this);
                i10++;
            }
        }
    }

    @Override // tm.h, tm.g, tm.a, ym.b, ym.a
    public synchronized void d0() throws Exception {
        k kVar;
        tm.c.d dVarV0 = tm.c.V0();
        this.f65716u = dVarV0;
        org.eclipse.jetty.servlet.b bVar = (org.eclipse.jetty.servlet.b) (dVarV0 == null ? null : dVarV0.b());
        this.f65715t = bVar;
        if (bVar != null && (kVar = (k) bVar.z0(k.class)) != null) {
            this.C = kVar.e();
        }
        a1();
        Z0();
        if (this.f65721z) {
            this.K[1] = new ConcurrentHashMap();
            this.K[2] = new ConcurrentHashMap();
            this.K[4] = new ConcurrentHashMap();
            this.K[8] = new ConcurrentHashMap();
            this.K[16] = new ConcurrentHashMap();
            this.L[1] = new ConcurrentLinkedQueue();
            this.L[2] = new ConcurrentLinkedQueue();
            this.L[4] = new ConcurrentLinkedQueue();
            this.L[8] = new ConcurrentLinkedQueue();
            this.L[16] = new ConcurrentLinkedQueue();
        }
        super.d0();
        org.eclipse.jetty.servlet.b bVar2 = this.f65715t;
        if (bVar2 == null || !(bVar2 instanceof org.eclipse.jetty.servlet.b)) {
            S0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:8:0x0018, B:12:0x0028, B:14:0x0034, B:15:0x0045, B:17:0x004b, B:19:0x0063, B:20:0x0067, B:11:0x0021, B:22:0x0070, B:24:0x0087, B:27:0x008b, B:29:0x0090, B:31:0x00a3, B:34:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00d5, B:43:0x00db, B:45:0x00f3, B:46:0x00f7, B:37:0x00b1, B:48:0x0100), top: B:58:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[Catch: all -> 0x011d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:8:0x0018, B:12:0x0028, B:14:0x0034, B:15:0x0045, B:17:0x004b, B:19:0x0063, B:20:0x0067, B:11:0x0021, B:22:0x0070, B:24:0x0087, B:27:0x008b, B:29:0x0090, B:31:0x00a3, B:34:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00d5, B:43:0x00db, B:45:0x00f3, B:46:0x00f7, B:37:0x00b1, B:48:0x0100), top: B:58:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x011d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:8:0x0018, B:12:0x0028, B:14:0x0034, B:15:0x0045, B:17:0x004b, B:19:0x0063, B:20:0x0067, B:11:0x0021, B:22:0x0070, B:24:0x0087, B:27:0x008b, B:29:0x0090, B:31:0x00a3, B:34:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00d5, B:43:0x00db, B:45:0x00f3, B:46:0x00f7, B:37:0x00b1, B:48:0x0100), top: B:58:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7 A[Catch: all -> 0x011d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:8:0x0018, B:12:0x0028, B:14:0x0034, B:15:0x0045, B:17:0x004b, B:19:0x0063, B:20:0x0067, B:11:0x0021, B:22:0x0070, B:24:0x0087, B:27:0x008b, B:29:0x0090, B:31:0x00a3, B:34:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00d5, B:43:0x00db, B:45:0x00f3, B:46:0x00f7, B:37:0x00b1, B:48:0x0100), top: B:58:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0100 A[EDGE_INSN: B:67:0x0100->B:48:0x0100 BREAK  A[LOOP:2: B:32:0x00a4->B:47:0x00fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5 A[SYNTHETIC] */
    @Override // tm.g, tm.a, ym.b, ym.a
    public synchronized void e0() throws Exception {
        wm.a[] aVarArr;
        int length;
        ArrayList arrayList;
        List listArray2List;
        ServletHolder[] servletHolderArr;
        int length2;
        int i10;
        ListIterator listIterator;
        super.e0();
        ArrayList arrayList2 = new ArrayList();
        List listArray2List2 = LazyList.array2List(this.f65718w);
        org.eclipse.jetty.servlet.a[] aVarArr2 = this.f65717v;
        if (aVarArr2 != null) {
            int length3 = aVarArr2.length;
            while (true) {
                int i11 = length3 - 1;
                if (length3 <= 0) {
                    break;
                }
                try {
                    this.f65717v[i11].stop();
                } catch (Exception e10) {
                    M.c("EXCEPTION ", e10);
                }
                if (this.f65717v[i11].q0() != Holder.Source.EMBEDDED) {
                    this.F.remove(this.f65717v[i11].getName());
                    ListIterator listIterator2 = listArray2List2.listIterator();
                    while (listIterator2.hasNext()) {
                        if (((wm.a) listIterator2.next()).e().equals(this.f65717v[i11].getName())) {
                            listIterator2.remove();
                        }
                    }
                } else {
                    arrayList2.add(this.f65717v[i11]);
                }
                length3 = i11;
            }
            this.f65717v = (org.eclipse.jetty.servlet.a[]) LazyList.toArray(arrayList2, org.eclipse.jetty.servlet.a.class);
            aVarArr = (wm.a[]) LazyList.toArray(listArray2List2, wm.a.class);
            this.f65718w = aVarArr;
            if (aVarArr != null || aVarArr.length == 0) {
                length = -1;
            } else {
                length = aVarArr.length - 1;
            }
            this.f65720y = length;
            this.f65719x = -1;
            arrayList = new ArrayList();
            listArray2List = LazyList.array2List(this.E);
            servletHolderArr = this.D;
            if (servletHolderArr != null) {
                length2 = servletHolderArr.length;
                while (true) {
                    i10 = length2 - 1;
                    if (length2 > 0) {
                        break;
                    }
                    try {
                        this.D[i10].stop();
                    } catch (Exception e11) {
                        M.c("EXCEPTION ", e11);
                    }
                    if (this.D[i10].q0() != Holder.Source.EMBEDDED) {
                        this.I.remove(this.D[i10].getName());
                        listIterator = listArray2List.listIterator();
                        while (listIterator.hasNext()) {
                            if (((wm.b) listIterator.next()).b().equals(this.D[i10].getName())) {
                                listIterator.remove();
                            }
                        }
                    } else {
                        arrayList.add(this.D[i10]);
                    }
                    length2 = i10;
                }
            }
            this.D = (ServletHolder[]) LazyList.toArray(arrayList, ServletHolder.class);
            this.E = (wm.b[]) LazyList.toArray(listArray2List, wm.b.class);
            this.G = null;
            this.H = null;
            this.J = null;
        } else {
            this.f65717v = (org.eclipse.jetty.servlet.a[]) LazyList.toArray(arrayList2, org.eclipse.jetty.servlet.a.class);
            aVarArr = (wm.a[]) LazyList.toArray(listArray2List2, wm.a.class);
            this.f65718w = aVarArr;
            if (aVarArr != null) {
                length = -1;
            } else {
                length = -1;
            }
            this.f65720y = length;
            this.f65719x = -1;
            arrayList = new ArrayList();
            listArray2List = LazyList.array2List(this.E);
            servletHolderArr = this.D;
            if (servletHolderArr != null) {
                length2 = servletHolderArr.length;
                while (true) {
                    i10 = length2 - 1;
                    if (length2 > 0) {
                        break;
                        break;
                    }
                    this.D[i10].stop();
                    if (this.D[i10].q0() != Holder.Source.EMBEDDED) {
                        this.I.remove(this.D[i10].getName());
                        listIterator = listArray2List.listIterator();
                        while (listIterator.hasNext()) {
                            if (((wm.b) listIterator.next()).b().equals(this.D[i10].getName())) {
                                listIterator.remove();
                            }
                        }
                    } else {
                        arrayList.add(this.D[i10]);
                    }
                    length2 = i10;
                }
            }
            this.D = (ServletHolder[]) LazyList.toArray(arrayList, ServletHolder.class);
            this.E = (wm.b[]) LazyList.toArray(listArray2List, wm.b.class);
            this.G = null;
            this.H = null;
            this.J = null;
        }
        throw th;
    }

    static {
        zm.c cVarA = zm.b.a(c.class);
        M = cVarA;
        N = cVarA.j("unhandled");
    }

    public void J0(d dVar) {
        org.eclipse.jetty.servlet.b bVar = this.f65715t;
        if (bVar != null) {
            bVar.n1(dVar);
        }
    }

    public void K0(i iVar) {
        org.eclipse.jetty.servlet.b bVar = this.f65715t;
        if (bVar != null) {
            bVar.o1(iVar);
        }
    }

    public e L0(n nVar, String str, ServletHolder servletHolder) {
        Object objAdd;
        MultiMap<String> multiMap;
        ConcurrentMap<String, e>[] concurrentMapArr;
        e eVar;
        String name = str == null ? servletHolder.getName() : str;
        int iC = wm.a.c(nVar.F());
        if (this.f65721z && (concurrentMapArr = this.K) != null && (eVar = concurrentMapArr[iC].get(name)) != null) {
            return eVar;
        }
        if (str == null || this.G == null) {
            objAdd = null;
        } else {
            objAdd = null;
            for (int i10 = 0; i10 < this.G.size(); i10++) {
                wm.a aVar = this.G.get(i10);
                if (aVar.b(str, iC)) {
                    objAdd = LazyList.add(objAdd, aVar.d());
                }
            }
        }
        if (servletHolder != null && (multiMap = this.H) != null && multiMap.size() > 0 && this.H.size() > 0) {
            Object obj = this.H.get(servletHolder.getName());
            for (int i11 = 0; i11 < LazyList.size(obj); i11++) {
                wm.a aVar2 = (wm.a) LazyList.get(obj, i11);
                if (aVar2.a(iC)) {
                    objAdd = LazyList.add(objAdd, aVar2.d());
                }
            }
            Object obj2 = this.H.get("*");
            for (int i12 = 0; i12 < LazyList.size(obj2); i12++) {
                wm.a aVar3 = (wm.a) LazyList.get(obj2, i12);
                if (aVar3.a(iC)) {
                    objAdd = LazyList.add(objAdd, aVar3.d());
                }
            }
        }
        if (objAdd == null) {
            return null;
        }
        if (!this.f65721z) {
            if (LazyList.size(objAdd) > 0) {
                return new b(nVar, objAdd, servletHolder);
            }
            return null;
        }
        a aVarV0 = LazyList.size(objAdd) > 0 ? V0(objAdd, servletHolder) : null;
        ConcurrentMap<String, e> concurrentMap = this.K[iC];
        Queue<String> queue = this.L[iC];
        while (this.A > 0 && concurrentMap.size() >= this.A) {
            String strPoll = queue.poll();
            if (strPoll == null) {
                concurrentMap.clear();
                break;
            }
            concurrentMap.remove(strPoll);
        }
        concurrentMap.put(name, aVarV0);
        queue.add(name);
        return aVarV0;
    }

    public wm.a[] M0() {
        return this.f65718w;
    }

    public org.eclipse.jetty.servlet.a[] N0() {
        return this.f65717v;
    }

    public PathMap.a O0(String str) {
        PathMap pathMap = this.J;
        if (pathMap == null) {
            return null;
        }
        return pathMap.getMatch(str);
    }

    public kj.k P0() {
        return this.f65716u;
    }

    public wm.b[] Q0() {
        return this.E;
    }

    public ServletHolder[] R0() {
        return this.D;
    }

    public void S0() throws Exception {
        MultiException multiException = new MultiException();
        if (this.f65717v != null) {
            int i10 = 0;
            while (true) {
                org.eclipse.jetty.servlet.a[] aVarArr = this.f65717v;
                if (i10 >= aVarArr.length) {
                    break;
                }
                aVarArr[i10].start();
                i10++;
            }
        }
        ServletHolder[] servletHolderArr = this.D;
        if (servletHolderArr != null) {
            ServletHolder[] servletHolderArr2 = (ServletHolder[]) servletHolderArr.clone();
            Arrays.sort(servletHolderArr2);
            for (int i11 = 0; i11 < servletHolderArr2.length; i11++) {
                try {
                    if (servletHolderArr2[i11].m0() != null || servletHolderArr2[i11].B0() == null) {
                        servletHolderArr2[i11].start();
                    } else {
                        ServletHolder servletHolder = (ServletHolder) this.J.match(servletHolderArr2[i11].B0());
                        if (servletHolder == null || servletHolder.m0() == null) {
                            multiException.add(new IllegalStateException("No forced path servlet for " + servletHolderArr2[i11].B0()));
                        } else {
                            servletHolderArr2[i11].s0(servletHolder.m0());
                            servletHolderArr2[i11].start();
                        }
                    }
                } catch (Throwable th2) {
                    M.d("EXCEPTION ", th2);
                    multiException.add(th2);
                }
            }
            multiException.ifExceptionThrow();
        }
    }

    public void T0() {
        Queue<String> queue = this.L[1];
        if (queue != null) {
            queue.clear();
            this.L[2].clear();
            this.L[4].clear();
            this.L[8].clear();
            this.L[16].clear();
            this.K[1].clear();
            this.K[2].clear();
            this.K[4].clear();
            this.K[8].clear();
            this.K[16].clear();
        }
    }

    public boolean U0() {
        return this.B;
    }

    public a V0(Object obj, ServletHolder servletHolder) {
        return new a(obj, servletHolder);
    }

    public void W0(lj.a aVar, lj.c cVar) throws IOException {
        zm.c cVar2 = M;
        if (cVar2.f()) {
            cVar2.i("Not Found " + aVar.v(), new Object[0]);
        }
    }

    public f e() {
        return this.C;
    }

    @Override // tm.h
    public void D0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        ServletHolder servletHolder;
        String strPathMatch;
        String strT = nVar.t();
        String strL = nVar.l();
        DispatcherType dispatcherTypeF = nVar.F();
        if (str.startsWith("/")) {
            PathMap.a aVarO0 = O0(str);
            if (aVarO0 != null) {
                servletHolder = (ServletHolder) aVarO0.getValue();
                String str2 = (String) aVarO0.getKey();
                if (aVarO0.a() != null) {
                    strPathMatch = aVarO0.a();
                } else {
                    strPathMatch = PathMap.pathMatch(str2, str);
                }
                String strPathInfo = PathMap.pathInfo(str2, str);
                if (DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                    nVar.a("javax.servlet.include.servlet_path", strPathMatch);
                    nVar.a("javax.servlet.include.path_info", strPathInfo);
                } else {
                    nVar.B0(strPathMatch);
                    nVar.p0(strPathInfo);
                }
            } else {
                servletHolder = null;
            }
        } else {
            servletHolder = this.I.get(str);
        }
        zm.c cVar2 = M;
        if (cVar2.f()) {
            cVar2.i("servlet {}|{}|{} -> {}", nVar.f(), nVar.t(), nVar.l(), servletHolder);
        }
        try {
            v.a aVarV = nVar.V();
            nVar.G0(servletHolder);
            if (E0()) {
                G0(str, nVar, aVar, cVar);
            } else {
                h hVar = this.f72465r;
                if (hVar != null) {
                    hVar.D0(str, nVar, aVar, cVar);
                } else {
                    h hVar2 = this.f72464q;
                    if (hVar2 != null) {
                        hVar2.C0(str, nVar, aVar, cVar);
                    } else {
                        C0(str, nVar, aVar, cVar);
                    }
                }
            }
            if (aVarV != null) {
                nVar.G0(aVarV);
            }
        } finally {
            if (0 != 0) {
                nVar.G0(null);
            }
            if (!DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                nVar.B0(strT);
                nVar.p0(strL);
            }
        }
    }

    public void I0(ServletHolder servletHolder, String str) {
        ServletHolder[] servletHolderArrR0 = R0();
        if (servletHolderArrR0 != null) {
            servletHolderArrR0 = (ServletHolder[]) servletHolderArrR0.clone();
        }
        try {
            Y0((ServletHolder[]) LazyList.addToArray(servletHolderArrR0, servletHolder, ServletHolder.class));
            wm.b bVar = new wm.b();
            bVar.d(servletHolder.getName());
            bVar.c(str);
            X0((wm.b[]) LazyList.addToArray(Q0(), bVar, wm.b.class));
        } catch (Exception e10) {
            Y0(servletHolderArrR0);
            if (e10 instanceof RuntimeException) {
                throw ((RuntimeException) e10);
            }
            throw new RuntimeException(e10);
        }
    }

    public void X0(wm.b[] bVarArr) {
        if (b() != null) {
            b().E0().update((Object) this, (Object[]) this.E, (Object[]) bVarArr, "servletMapping", true);
        }
        this.E = bVarArr;
        Z0();
        T0();
    }

    @Override // tm.g, tm.a, rm.i
    public void f(rm.p pVar) {
        rm.p pVarB = b();
        if (pVarB != null && pVarB != pVar) {
            b().E0().update((Object) this, (Object[]) this.f65717v, (Object[]) null, "filter", true);
            b().E0().update((Object) this, (Object[]) this.f65718w, (Object[]) null, "filterMapping", true);
            b().E0().update((Object) this, (Object[]) this.D, (Object[]) null, "servlet", true);
            b().E0().update((Object) this, (Object[]) this.E, (Object[]) null, "servletMapping", true);
        }
        super.f(pVar);
        if (pVar != null && pVarB != pVar) {
            pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.f65717v, "filter", true);
            pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.f65718w, "filterMapping", true);
            pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.D, "servlet", true);
            pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.E, "servletMapping", true);
        }
    }

    @Override // tm.b, ym.b, ym.e
    public void z(Appendable appendable, String str) throws IOException {
        super.s0(appendable);
        ym.b.p0(appendable, str, xm.p.a(P()), u0(), xm.p.a(M0()), xm.p.a(N0()), xm.p.a(Q0()), xm.p.a(R0()));
    }
}
