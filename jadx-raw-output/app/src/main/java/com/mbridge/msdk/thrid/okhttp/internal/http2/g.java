package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Http2Connection.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements Closeable {
    public static final /* synthetic */ boolean A = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ExecutorService f37700z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f37702b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f37708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExecutorService f37709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.http2.l f37710j;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f37719s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f37721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Socket f37722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.http2.j f37723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f37724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Set<Integer> f37725y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> f37703c = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37711k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37712l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37713m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f37714n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f37715o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f37716p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f37717q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f37718r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f37720t = new m();

    /* JADX INFO: compiled from: Http2Connection.java */
    public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f37727c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f37726b = i10;
            this.f37727c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.f37726b, this.f37727c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f37730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f37729b = i10;
            this.f37730c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.f37723w.a(this.f37729b, this.f37730c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class d extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f37734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f37733b = i10;
            this.f37734c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.f37710j.a(this.f37733b, this.f37734c)) {
                try {
                    g.this.f37723w.a(this.f37733b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        try {
                            g.this.f37725y.remove(Integer.valueOf(this.f37733b));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class e extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f37737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f37738d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f37736b = i10;
            this.f37737c = list;
            this.f37738d = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean zA = g.this.f37710j.a(this.f37736b, this.f37737c, this.f37738d);
            if (zA) {
                try {
                    g.this.f37723w.a(this.f37736b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.f37738d) {
                synchronized (g.this) {
                    try {
                        g.this.f37725y.remove(Integer.valueOf(this.f37736b));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class f extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okio.c f37741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f37742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f37743e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f37740b = i10;
            this.f37741c = cVar;
            this.f37742d = i11;
            this.f37743e = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean zA = g.this.f37710j.a(this.f37740b, this.f37741c, this.f37742d, this.f37743e);
                if (zA) {
                    g.this.f37723w.a(this.f37740b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (zA || this.f37743e) {
                    synchronized (g.this) {
                        g.this.f37725y.remove(Integer.valueOf(this.f37740b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http2Connection.java */
    public class C0390g extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f37746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0390g(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f37745b = i10;
            this.f37746c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.f37710j.a(this.f37745b, this.f37746c);
            synchronized (g.this) {
                g.this.f37725y.remove(Integer.valueOf(this.f37745b));
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public i() {
            super("OkHttp %s ping", g.this.f37704d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f37712l < g.this.f37711k) {
                    z10 = true;
                } else {
                    g.e(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.h();
            } else {
                g.this.a(false, 1, 0);
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f37757a = new a();

        /* JADX INFO: compiled from: Http2Connection.java */
        public static class a extends j {
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f37758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f37760d;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f37704d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f37758b = z10;
            this.f37759c = i10;
            this.f37760d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.f37758b, this.f37759c, this.f37760d);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements com.mbridge.msdk.thrid.okhttp.internal.http2.h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.mbridge.msdk.thrid.okhttp.internal.http2.h f37762b;

        /* JADX INFO: compiled from: Http2Connection.java */
        public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i f37764b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.f37764b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.f37702b.a(this.f37764b);
                } catch (IOException e10) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.f37704d, e10);
                    try {
                        this.f37764b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: compiled from: Http2Connection.java */
        public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f37766b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f37767c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f37766b = z10;
                this.f37767c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.f37766b, this.f37767c);
            }
        }

        /* JADX INFO: compiled from: Http2Connection.java */
        public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.f37702b.a(gVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, int i12, boolean z10) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException {
            if (g.this.b(i10)) {
                g.this.a(i10, eVar, i11, z10);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA == null) {
                g.this.c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.g(j10);
                eVar.skip(j10);
                return;
            }
            iVarA.a(eVar, i11);
            if (z10) {
                iVarA.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() throws Throwable {
            Throwable th2;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.f37762b.a(this);
                    while (this.f37762b.a(false, (com.mbridge.msdk.thrid.okhttp.internal.http2.h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                        } catch (IOException unused) {
                            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                            g.this.a(bVar3, bVar3);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            g.this.a(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37762b);
                        throw th2;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                bVar = bVar2;
            } catch (Throwable th4) {
                th2 = th4;
                bVar = bVar2;
                g.this.a(bVar, bVar2);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37762b);
                throw th2;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37762b);
        }

        public l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.f37704d);
            this.f37762b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            if (g.this.b(i10)) {
                g.this.b(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
                if (iVarA == null) {
                    if (g.this.f37707g) {
                        return;
                    }
                    g gVar = g.this;
                    if (i10 <= gVar.f37705e) {
                        return;
                    }
                    if (i10 % 2 == gVar.f37706f % 2) {
                        return;
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i10, g.this, false, z10, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                    g gVar2 = g.this;
                    gVar2.f37705e = i10;
                    gVar2.f37703c.put(Integer.valueOf(i10), iVar);
                    g.f37700z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f37704d, Integer.valueOf(i10)}, iVar));
                    return;
                }
                iVarA.a(list);
                if (z10) {
                    iVarA.i();
                }
            }
        }

        public void b(boolean z10, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j10;
            synchronized (g.this.f37723w) {
                synchronized (g.this) {
                    int iC = g.this.f37721u.c();
                    if (z10) {
                        g.this.f37721u.a();
                    }
                    g.this.f37721u.a(mVar);
                    int iC2 = g.this.f37721u.c();
                    iVarArr = null;
                    if (iC2 == -1 || iC2 == iC) {
                        j10 = 0;
                    } else {
                        j10 = iC2 - iC;
                        if (!g.this.f37703c.isEmpty()) {
                            iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f37703c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f37703c.size()]);
                        }
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f37723w.a(gVar.f37721u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            g.f37700z.execute(new c("OkHttp %s settings", g.this.f37704d));
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            if (g.this.b(i10)) {
                g.this.a(i10, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarC = g.this.c(i10);
            if (iVarC != null) {
                iVarC.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, m mVar) {
            try {
                g.this.f37708h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f37704d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    g.this.f37708h.execute(g.this.new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i10 == 1) {
                        g.c(g.this);
                    } else if (i10 == 2) {
                        g.h(g.this);
                    } else if (i10 == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.j();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f37703c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f37703c.size()]);
                g.this.f37707g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i10 && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f37719s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA != null) {
                synchronized (iVarA) {
                    iVarA.a(j10);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            g.this.a(i11, list);
        }
    }

    public static /* synthetic */ long c(g gVar) {
        long j10 = gVar.f37712l;
        gVar.f37712l = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long h(g gVar) {
        long j10 = gVar.f37714n;
        gVar.f37714n = 1 + j10;
        return j10;
    }

    public boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public synchronized int k() {
        return this.f37721u.b(Integer.MAX_VALUE);
    }

    public void l() {
        synchronized (this) {
            long j10 = this.f37714n;
            long j11 = this.f37713m;
            if (j10 < j11) {
                return;
            }
            this.f37713m = j11 + 1;
            this.f37717q = System.nanoTime() + 1000000000;
            try {
                this.f37708h.execute(new c("OkHttp %s ping", this.f37704d));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }

    /* JADX INFO: compiled from: Http2Connection.java */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f37748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f37749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okio.e f37750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okio.d f37751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f37752e = j.f37757a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.internal.http2.l f37753f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.f37820a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f37754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f37755h;

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.f37748a = socket;
            this.f37749b = str;
            this.f37750c = eVar;
            this.f37751d = dVar;
            return this;
        }

        public h(boolean z10) {
            this.f37754g = z10;
        }

        public h a(j jVar) {
            this.f37752e = jVar;
            return this;
        }

        public h a(int i10) {
            this.f37755h = i10;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public g(h hVar) {
        m mVar = new m();
        this.f37721u = mVar;
        this.f37725y = new LinkedHashSet();
        this.f37710j = hVar.f37753f;
        boolean z10 = hVar.f37754g;
        this.f37701a = z10;
        this.f37702b = hVar.f37752e;
        int i10 = z10 ? 1 : 2;
        this.f37706f = i10;
        if (z10) {
            this.f37706f = i10 + 2;
        }
        if (z10) {
            this.f37720t.a(7, 16777216);
        }
        String str = hVar.f37749b;
        this.f37704d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.f37708h = scheduledThreadPoolExecutor;
        if (hVar.f37755h != 0) {
            i iVar = new i();
            long j10 = hVar.f37755h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f37709i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, 65535);
        mVar.a(5, 16384);
        this.f37719s = mVar.c();
        this.f37722v = hVar.f37748a;
        this.f37723w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.f37751d, z10);
        this.f37724x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.f37750c, z10));
    }

    public static /* synthetic */ long e(g gVar) {
        long j10 = gVar.f37711k;
        gVar.f37711k = 1 + j10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ long i(g gVar) {
        long j10 = gVar.f37716p;
        gVar.f37716p = 1 + j10;
        return j10;
    }

    public void b(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.f37723w.a(i10, bVar);
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i10) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarRemove;
        iVarRemove = this.f37703c.remove(Integer.valueOf(i10));
        notifyAll();
        return iVarRemove;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public synchronized boolean f(long j10) {
        if (this.f37707g) {
            return false;
        }
        return this.f37714n >= this.f37713m || j10 < this.f37717q;
    }

    public void flush() throws IOException {
        this.f37723w.flush();
    }

    public synchronized void g(long j10) {
        long j11 = this.f37718r + j10;
        this.f37718r = j11;
        if (j11 >= this.f37720t.c() / 2) {
            a(0, this.f37718r);
            this.f37718r = 0L;
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10) {
        return this.f37703c.get(Integer.valueOf(i10));
    }

    public void b(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) {
        try {
            a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f37704d, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        return a(0, list, z10);
    }

    public void c(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.f37708h.execute(new a("OkHttp %s stream %d", new Object[]{this.f37704d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        int i11;
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f37723w) {
            synchronized (this) {
                if (this.f37706f > 1073741823) {
                    a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                }
                if (!this.f37707g) {
                    i11 = this.f37706f;
                    this.f37706f = i11 + 2;
                    iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i11, this, z12, false, null);
                    z11 = !z10 || this.f37719s == 0 || iVar.f37783b == 0;
                    if (iVar.g()) {
                        this.f37703c.put(Integer.valueOf(i11), iVar);
                    }
                } else {
                    throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                }
            }
            if (i10 == 0) {
                this.f37723w.a(z12, i11, i10, list);
            } else if (!this.f37701a) {
                this.f37723w.a(i10, i11, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (z11) {
            this.f37723w.flush();
        }
        return iVar;
    }

    public void a(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
        long j11;
        int iMin;
        long j12;
        if (j10 == 0) {
            this.f37723w.a(z10, i10, cVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j11 = this.f37719s;
                        if (j11 <= 0) {
                            if (this.f37703c.containsKey(Integer.valueOf(i10))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j10, j11), this.f37723w.h());
                j12 = iMin;
                this.f37719s -= j12;
            }
            j10 -= j12;
            this.f37723w.a(z10 && j10 == 0, i10, cVar, iMin);
        }
    }

    public void a(int i10, long j10) {
        try {
            this.f37708h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f37704d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(boolean z10, int i10, int i11) {
        try {
            this.f37723w.a(z10, i10, i11);
        } catch (IOException unused) {
            h();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.f37723w) {
            synchronized (this) {
                if (this.f37707g) {
                    return;
                }
                this.f37707g = true;
                this.f37723w.a(this.f37705e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.f37505a);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            if (!this.f37703c.isEmpty()) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.f37703c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.f37703c.size()]);
                this.f37703c.clear();
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f37723w.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f37722v.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f37708h.shutdown();
        this.f37709i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void a(boolean z10) throws IOException {
        if (z10) {
            this.f37723w.d();
            this.f37723w.b(this.f37720t);
            int iC = this.f37720t.c();
            if (iC != 65535) {
                this.f37723w.a(0, iC - 65535);
            }
        }
        new Thread(this.f37724x).start();
    }

    public void a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        synchronized (this) {
            if (this.f37725y.contains(Integer.valueOf(i10))) {
                c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                return;
            }
            this.f37725y.add(Integer.valueOf(i10));
            try {
                a(new d("OkHttp %s Push Request[%s]", new Object[]{this.f37704d, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j10 = i11;
        eVar.e(j10);
        eVar.b(cVar, j10);
        if (cVar.size() == j10) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f37704d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C0390g("OkHttp %s Push Reset[%s]", new Object[]{this.f37704d, Integer.valueOf(i10)}, i10, bVar));
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.f37707g) {
            this.f37709i.execute(bVar);
        }
    }
}
