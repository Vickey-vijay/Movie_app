package jl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import kl.j;
import kl.k;
import kl.m;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import tv.cjump.jni.NativeBitmapFactory;

/* JADX INFO: compiled from: CacheManagingDrawTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f61806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f61807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public kl.e f61808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f61809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f61810z;

    /* JADX INFO: renamed from: jl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheManagingDrawTask.java */
    public class RunnableC0549a implements Runnable {
        public RunnableC0549a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f61911e.e();
        }
    }

    /* JADX INFO: compiled from: CacheManagingDrawTask.java */
    public class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HandlerThread f61812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ll.e f61813b = new ll.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ll.h f61814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ml.b<ll.f> f61815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f61816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f61817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f61818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f f61819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f61820i;

        /* JADX INFO: renamed from: jl.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class C0550a extends k.c<kl.c> {
            public C0550a() {
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                b.this.t(true, cVar, null);
                return 0;
            }
        }

        /* JADX INFO: renamed from: jl.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class C0551b extends k.c<kl.c> {
            public C0551b() {
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                if (cVar.r()) {
                    b.this.t(true, cVar, null);
                    return 2;
                }
                return 0;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class c extends k.c<kl.c> {
            public c() {
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                if (!cVar.v()) {
                    return 1;
                }
                m<?> mVar = cVar.f62913x;
                if (a.this.f61907a.A.f63679c == -1 && mVar != null && !mVar.g() && mVar.size() / a.this.f61806v < a.this.f61907a.A.f63680d) {
                    return 0;
                }
                if (!b.this.f61820i) {
                    synchronized (a.this.f61809y) {
                        try {
                            try {
                                a.this.f61809y.wait(30L);
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                                return 1;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                b.this.t(false, cVar, null);
                return 2;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class d extends k.b<kl.c, kl.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f61825a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public kl.c f61826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f61827c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kl.c f61828d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f61829e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f61830f;

            public d(int i10, kl.c cVar, boolean z10, int i11) {
                this.f61827c = i10;
                this.f61828d = cVar;
                this.f61829e = z10;
                this.f61830f = i11;
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                int i10 = this.f61825a;
                this.f61825a = i10 + 1;
                if (i10 >= this.f61827c) {
                    return 1;
                }
                m<?> mVarE = cVar.e();
                if (mVarE != null && mVarE.get() != null) {
                    float f10 = cVar.f62904o;
                    kl.c cVar2 = this.f61828d;
                    if (f10 == cVar2.f62904o && cVar.f62905p == cVar2.f62905p && cVar.f62899j == cVar2.f62899j && cVar.f62901l == cVar2.f62901l && cVar.f62895f == cVar2.f62895f && cVar.f62892c.equals(cVar2.f62892c) && cVar.f62894e == this.f61828d.f62894e) {
                        this.f61826b = cVar;
                        return 1;
                    }
                    if (this.f61829e) {
                        return 0;
                    }
                    if (!cVar.v()) {
                        return 1;
                    }
                    if (mVarE.g()) {
                        return 0;
                    }
                    float fWidth = mVarE.width() - this.f61828d.f62904o;
                    float fA = mVarE.a() - this.f61828d.f62905p;
                    if (fWidth >= 0.0f) {
                        int i11 = this.f61830f;
                        if (fWidth <= i11 && fA >= 0.0f && fA <= i11) {
                            this.f61826b = cVar;
                            return 1;
                        }
                    }
                }
                return 0;
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public kl.c d() {
                return this.f61826b;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class e extends k.c<kl.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f61832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f61833b;

            public e(int i10, boolean z10) {
                this.f61832a = i10;
                this.f61833b = z10;
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                if (b.this.f61820i || b.this.f61817f + this.f61832a <= b.this.f61816e) {
                    return 1;
                }
                if (!cVar.v() && !cVar.n()) {
                    return this.f61833b ? 1 : 0;
                }
                b.this.t(false, cVar, null);
                return 2;
            }
        }

        /* JADX INFO: compiled from: CacheManagingDrawTask.java */
        public class f extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f61835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f61836b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f61837c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f61838d;

            /* JADX INFO: renamed from: jl.a$b$f$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CacheManagingDrawTask.java */
            public class C0552a extends k.c<kl.c> {
                public C0552a() {
                }

                @Override // kl.k.b
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int a(kl.c cVar) {
                    if (f.this.f61835a || f.this.f61838d) {
                        return 1;
                    }
                    if (!cVar.m()) {
                        DanmakuContext danmakuContext = a.this.f61907a;
                        danmakuContext.f64338y.b(cVar, 0, 0, null, true, danmakuContext);
                    }
                    if (cVar.n()) {
                        return 0;
                    }
                    if (!cVar.p()) {
                        cVar.y(a.this.f61908b, true);
                    }
                    if (!cVar.t()) {
                        cVar.z(a.this.f61908b, true);
                    }
                    return 0;
                }
            }

            /* JADX INFO: renamed from: jl.a$b$f$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CacheManagingDrawTask.java */
            public class C0553b extends k.c<kl.c> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f61841a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f61842b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kl.c f61843c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f61844d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f61845e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f61846f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f61847g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f61848h;

                public C0553b(kl.c cVar, boolean z10, int i10, long j10, long j11, long j12) {
                    this.f61843c = cVar;
                    this.f61844d = z10;
                    this.f61845e = i10;
                    this.f61846f = j10;
                    this.f61847g = j11;
                    this.f61848h = j12;
                }

                @Override // kl.k.b
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int a(kl.c cVar) {
                    if (f.this.f61835a || f.this.f61838d || this.f61843c.b() < a.this.f61913g.f62916a) {
                        return 1;
                    }
                    m<?> mVarE = cVar.e();
                    if (mVarE != null && mVarE.get() != null) {
                        return 0;
                    }
                    if (!this.f61844d && (cVar.v() || !cVar.r())) {
                        return 0;
                    }
                    if (!cVar.m()) {
                        DanmakuContext danmakuContext = a.this.f61907a;
                        danmakuContext.f64338y.b(cVar, this.f61841a, this.f61845e, null, true, danmakuContext);
                    }
                    if (cVar.f62903n == 0 && cVar.n()) {
                        return 0;
                    }
                    if (cVar.getType() == 1) {
                        int iB = (int) ((cVar.b() - this.f61846f) / a.this.f61907a.f64339z.f63689f);
                        if (this.f61842b == iB) {
                            this.f61841a++;
                        } else {
                            this.f61841a = 0;
                            this.f61842b = iB;
                        }
                    }
                    if (!this.f61844d && !f.this.f61836b) {
                        try {
                            synchronized (a.this.f61809y) {
                                a.this.f61809y.wait(this.f61847g);
                            }
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                            return 1;
                        }
                    }
                    f.this.g(cVar, false);
                    if (!this.f61844d) {
                        long jB = ql.b.b() - this.f61848h;
                        b bVar = b.this;
                        ll.d dVar = a.this.f61907a.f64339z;
                        if (jB >= ((long) bVar.f61818g) * 3800) {
                            return 1;
                        }
                    }
                    return 0;
                }
            }

            public void f() {
                sendEmptyMessage(1);
                sendEmptyMessageDelayed(4, a.this.f61907a.f64339z.f63689f);
            }

            public void k() {
                this.f61835a = true;
                sendEmptyMessage(6);
            }

            public void o(long j10) {
                removeMessages(3);
                this.f61837c = true;
                sendEmptyMessage(18);
                a.this.f61808x.update(a.this.f61913g.f62916a + j10);
                sendEmptyMessage(3);
            }

            public void p() {
                this.f61838d = true;
            }

            public f(Looper looper) {
                super(looper);
            }

            /* JADX WARN: Code duplicated, block: B:41:0x0127  */
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                switch (i10) {
                    case 1:
                        b.this.v();
                        for (int i11 = 0; i11 < 300; i11++) {
                            b.this.f61815d.a(new ll.f());
                        }
                        break;
                    case 2:
                        e((kl.c) message.obj);
                        return;
                    case 3:
                        removeMessages(3);
                        a aVar = a.this;
                        boolean z10 = !(aVar.f61911e == null || aVar.f61918l) || this.f61837c;
                        m(z10);
                        if (z10) {
                            this.f61837c = false;
                        }
                        a aVar2 = a.this;
                        h.a aVar3 = aVar2.f61911e;
                        if (aVar3 == null || aVar2.f61918l) {
                            return;
                        }
                        aVar3.b();
                        a.this.f61918l = true;
                        return;
                    case 4:
                        b.this.r();
                        return;
                    case 5:
                        Long l10 = (Long) message.obj;
                        if (l10 != null) {
                            long jLongValue = l10.longValue();
                            long j10 = a.this.f61808x.f62916a;
                            a.this.f61808x.update(jLongValue);
                            this.f61837c = true;
                            long jX = b.this.x();
                            if (jLongValue <= j10) {
                                long j11 = jX - jLongValue;
                                b bVar = b.this;
                                if (j11 > a.this.f61907a.f64339z.f63689f) {
                                    b.this.v();
                                } else {
                                    bVar.r();
                                }
                            } else {
                                b.this.v();
                            }
                            m(true);
                            q();
                            return;
                        }
                        return;
                    case 6:
                        removeCallbacksAndMessages(null);
                        this.f61835a = true;
                        b.this.u();
                        b.this.p();
                        getLooper().quit();
                        return;
                    case 7:
                        b.this.u();
                        kl.e eVar = a.this.f61808x;
                        a aVar4 = a.this;
                        eVar.update(aVar4.f61913g.f62916a - aVar4.f61907a.f64339z.f63689f);
                        this.f61837c = true;
                        return;
                    case 8:
                        b.this.v();
                        a.this.f61808x.update(a.this.f61913g.f62916a);
                        return;
                    case 9:
                        b.this.v();
                        a.this.f61808x.update(a.this.f61913g.f62916a);
                        a.this.f();
                        return;
                    default:
                        switch (i10) {
                            case 17:
                                kl.c cVar = (kl.c) message.obj;
                                if (cVar != null) {
                                    m<?> mVarE = cVar.e();
                                    if (!((cVar.I & 1) != 0) && mVarE != null && mVarE.get() != null && !mVarE.g()) {
                                        a aVar5 = a.this;
                                        cVar.f62913x = ql.a.a(cVar, aVar5.f61908b, (ll.f) cVar.f62913x, aVar5.f61907a.A.f63677a);
                                        b.this.B(cVar, 0, true);
                                    } else if (cVar.f62914y) {
                                        b.this.o(cVar);
                                        h(cVar);
                                    } else {
                                        if (mVarE != null && mVarE.g()) {
                                            mVarE.destroy();
                                        }
                                        b.this.t(true, cVar, null);
                                        e(cVar);
                                    }
                                }
                                break;
                            case 18:
                                this.f61838d = false;
                                break;
                        }
                        return;
                }
                long jI = i();
                if (jI <= 0) {
                    jI = a.this.f61907a.f64339z.f63689f / 2;
                }
                sendEmptyMessageDelayed(16, jI);
            }

            public final long i() {
                long j10 = a.this.f61808x.f62916a;
                b bVar = b.this;
                a aVar = a.this;
                long j11 = aVar.f61913g.f62916a;
                DanmakuContext danmakuContext = aVar.f61907a;
                if (j10 <= j11 - danmakuContext.f64339z.f63689f) {
                    if (danmakuContext.A.f63679c != -1) {
                        bVar.v();
                    }
                    a.this.f61808x.update(a.this.f61913g.f62916a);
                    sendEmptyMessage(3);
                    return 0L;
                }
                float fY = bVar.y();
                kl.c cVarFirst = b.this.f61813b.first();
                long jB = cVarFirst != null ? cVarFirst.b() - a.this.f61913g.f62916a : 0L;
                a aVar2 = a.this;
                long j12 = aVar2.f61907a.f64339z.f63689f;
                long j13 = 2 * j12;
                if (fY < 0.6f && jB > j12) {
                    aVar2.f61808x.update(a.this.f61913g.f62916a);
                    removeMessages(3);
                    sendEmptyMessage(3);
                    return 0L;
                }
                if (fY > 0.4f && jB < (-j13)) {
                    removeMessages(4);
                    sendEmptyMessage(4);
                    return 0L;
                }
                if (fY >= 0.9f) {
                    return 0L;
                }
                long j14 = aVar2.f61808x.f62916a - a.this.f61913g.f62916a;
                if (cVarFirst != null && cVarFirst.v()) {
                    a aVar3 = a.this;
                    if (j14 < (-aVar3.f61907a.f64339z.f63689f)) {
                        aVar3.f61808x.update(a.this.f61913g.f62916a);
                        sendEmptyMessage(8);
                        sendEmptyMessage(3);
                        return 0L;
                    }
                }
                if (j14 > j13) {
                    return 0L;
                }
                removeMessages(3);
                sendEmptyMessage(3);
                return 0L;
            }

            public void j(boolean z10) {
                this.f61836b = !z10;
            }

            public final void l() {
                k kVarE;
                try {
                    a aVar = a.this;
                    long j10 = aVar.f61913g.f62916a;
                    long j11 = aVar.f61907a.f64339z.f63689f;
                    kVarE = aVar.f61909c.e(j10 - j11, (2 * j11) + j10);
                } catch (Exception unused) {
                    kVarE = null;
                }
                if (kVarE == null || kVarE.isEmpty()) {
                    return;
                }
                kVarE.f(new C0552a());
            }

            public final long m(boolean z10) {
                k kVarE;
                boolean z11;
                l();
                long j10 = a.this.f61808x.f62916a - 30;
                b bVar = b.this;
                long j11 = j10 + (a.this.f61907a.f64339z.f63689f * ((long) bVar.f61818g));
                if (j11 < a.this.f61913g.f62916a) {
                    return 0L;
                }
                long jB = ql.b.b();
                k kVar = null;
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        boolean z13 = z12;
                        kVarE = a.this.f61909c.e(j10, j11);
                        z11 = z13;
                    } catch (Exception unused) {
                        ql.b.a(10L);
                        kVarE = kVar;
                        z11 = true;
                    }
                    i10++;
                    if (i10 >= 3 || kVarE != null || !z11) {
                        break;
                    }
                    k kVar2 = kVarE;
                    z12 = z11;
                    kVar = kVar2;
                }
                if (kVarE == null) {
                    a.this.f61808x.update(j11);
                    return 0L;
                }
                kl.c cVarFirst = kVarE.first();
                kl.c cVarLast = kVarE.last();
                if (cVarFirst == null || cVarLast == null) {
                    a.this.f61808x.update(j11);
                    return 0L;
                }
                long jB2 = cVarFirst.b();
                a aVar = a.this;
                long j12 = jB2 - aVar.f61913g.f62916a;
                kVarE.f(new C0553b(cVarLast, z10, kVarE.size(), j10, z10 ? 0L : Math.min(100L, j12 < 0 ? 30L : ((j12 * 10) / aVar.f61907a.f64339z.f63689f) + 30), jB));
                long jB3 = ql.b.b() - jB;
                a.this.f61808x.update(j11);
                return jB3;
            }

            public final void n(kl.c cVar, ll.f fVar) {
                if (fVar == null) {
                    fVar = (ll.f) cVar.f62913x;
                }
                cVar.f62913x = null;
                if (fVar == null) {
                    return;
                }
                fVar.destroy();
                b.this.f61815d.a(fVar);
            }

            public void q() {
                sendEmptyMessage(18);
                this.f61835a = false;
                removeMessages(16);
                sendEmptyMessage(16);
                sendEmptyMessageDelayed(4, a.this.f61907a.f64339z.f63689f);
            }

            public final void e(kl.c cVar) {
                if (!cVar.v()) {
                    if (cVar.b() <= a.this.f61808x.f62916a + a.this.f61907a.f64339z.f63689f || cVar.f62914y) {
                        if (cVar.f62903n == 0 && cVar.n()) {
                            return;
                        }
                        m<?> mVarE = cVar.e();
                        if (mVarE == null || mVarE.get() == null) {
                            g(cVar, true);
                        }
                    }
                }
            }

            public final byte g(kl.c cVar, boolean z10) {
                ll.f fVar;
                if (!cVar.p()) {
                    cVar.y(a.this.f61908b, true);
                }
                ll.f fVar2 = null;
                try {
                    b bVar = b.this;
                    kl.c cVarW = bVar.w(cVar, true, a.this.f61907a.A.f63682f);
                    if (cVarW != null) {
                        fVar = (ll.f) cVarW.f62913x;
                    } else {
                        fVar = null;
                    }
                    try {
                        if (fVar != null) {
                            fVar.k();
                            cVar.f62913x = fVar;
                            a.this.f61807w.B(cVar, 0, z10);
                            return (byte) 0;
                        }
                        b bVar2 = b.this;
                        kl.c cVarW2 = bVar2.w(cVar, false, a.this.f61907a.A.f63683g);
                        if (cVarW2 != null) {
                            fVar = (ll.f) cVarW2.f62913x;
                        }
                        if (fVar != null) {
                            cVarW2.f62913x = null;
                            a aVar = a.this;
                            cVar.f62913x = ql.a.a(cVar, aVar.f61908b, fVar, aVar.f61907a.A.f63677a);
                            a.this.f61807w.B(cVar, 0, z10);
                            return (byte) 0;
                        }
                        int iF = ql.a.f((int) cVar.f62904o, (int) cVar.f62905p, a.this.f61907a.A.f63677a / 8);
                        if (iF * 2 > a.this.f61806v) {
                            return (byte) 1;
                        }
                        if (!z10 && b.this.f61817f + iF > b.this.f61816e) {
                            a.this.f61807w.q(iF, false);
                            return (byte) 1;
                        }
                        ll.f fVar3 = (ll.f) b.this.f61815d.acquire();
                        a aVar2 = a.this;
                        ll.f fVarA = ql.a.a(cVar, aVar2.f61908b, fVar3, aVar2.f61907a.A.f63677a);
                        cVar.f62913x = fVarA;
                        boolean zB = a.this.f61807w.B(cVar, b.this.I(cVar), z10);
                        if (!zB) {
                            n(cVar, fVarA);
                        }
                        return !zB ? (byte) 1 : (byte) 0;
                    } catch (Exception unused) {
                        fVar2 = fVar;
                        n(cVar, fVar2);
                        return (byte) 1;
                    } catch (OutOfMemoryError unused2) {
                        fVar2 = fVar;
                        n(cVar, fVar2);
                        return (byte) 1;
                    }
                } catch (Exception unused3) {
                } catch (OutOfMemoryError unused4) {
                }
            }

            public boolean h(kl.c cVar) {
                ll.f fVarA;
                if (!cVar.p()) {
                    cVar.y(a.this.f61908b, true);
                }
                try {
                    fVarA = (ll.f) b.this.f61815d.acquire();
                    try {
                        a aVar = a.this;
                        fVarA = ql.a.a(cVar, aVar.f61908b, fVarA, aVar.f61907a.A.f63677a);
                        cVar.f62913x = fVarA;
                        return true;
                    } catch (Exception unused) {
                        if (fVarA != null) {
                            b.this.f61815d.a(fVarA);
                        }
                        cVar.f62913x = null;
                        return false;
                    } catch (OutOfMemoryError unused2) {
                        if (fVarA != null) {
                            b.this.f61815d.a(fVarA);
                        }
                        cVar.f62913x = null;
                        return false;
                    }
                } catch (Exception unused3) {
                    fVarA = null;
                } catch (OutOfMemoryError unused4) {
                    fVarA = null;
                }
            }
        }

        public void n() {
            this.f61820i = false;
            if (this.f61812a == null) {
                HandlerThread handlerThread = new HandlerThread("DFM Cache-Building Thread");
                this.f61812a = handlerThread;
                handlerThread.start();
            }
            if (this.f61819h == null) {
                this.f61819h = new f(this.f61812a.getLooper());
            }
            this.f61819h.f();
        }

        public void s() {
            this.f61820i = true;
            synchronized (a.this.f61809y) {
                a.this.f61809y.notifyAll();
            }
            f fVar = this.f61819h;
            if (fVar != null) {
                fVar.removeCallbacksAndMessages(null);
                this.f61819h.k();
                this.f61819h = null;
            }
            HandlerThread handlerThread = this.f61812a;
            if (handlerThread != null) {
                try {
                    handlerThread.join();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                this.f61812a.quit();
                this.f61812a = null;
            }
        }

        public b(int i10, int i11) {
            ll.h hVar = new ll.h();
            this.f61814c = hVar;
            this.f61815d = ml.e.a(hVar, 800);
            this.f61820i = false;
            this.f61817f = 0;
            this.f61816e = i10;
            this.f61818g = i11;
        }

        public void A(Runnable runnable) {
            f fVar = this.f61819h;
            if (fVar == null) {
                return;
            }
            fVar.post(runnable);
        }

        public final boolean B(kl.c cVar, int i10, boolean z10) {
            if (i10 > 0) {
                q(i10, z10);
            }
            this.f61813b.a(cVar);
            this.f61817f += i10;
            return true;
        }

        public void C(long j10) {
            f fVar = this.f61819h;
            if (fVar != null) {
                fVar.o(j10);
            }
        }

        public void D() {
            f fVar = this.f61819h;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(3);
            this.f61819h.removeMessages(18);
            this.f61819h.p();
            this.f61819h.removeMessages(7);
            this.f61819h.sendEmptyMessage(7);
        }

        public void E() {
            f fVar = this.f61819h;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(4);
            this.f61819h.sendEmptyMessage(4);
        }

        public void F() {
            f fVar = this.f61819h;
            if (fVar == null) {
                return;
            }
            fVar.removeMessages(9);
            this.f61819h.sendEmptyMessage(9);
        }

        public void G() {
            f fVar = this.f61819h;
            if (fVar != null) {
                fVar.q();
            } else {
                n();
            }
        }

        public void H(long j10) {
            f fVar = this.f61819h;
            if (fVar == null) {
                return;
            }
            fVar.p();
            this.f61819h.removeMessages(3);
            this.f61819h.obtainMessage(5, Long.valueOf(j10)).sendToTarget();
        }

        public int I(kl.c cVar) {
            m<?> mVar = cVar.f62913x;
            if (mVar == null || mVar.g()) {
                return 0;
            }
            return cVar.f62913x.size();
        }

        @Override // kl.j
        public void a(kl.c cVar) {
            f fVar = this.f61819h;
            if (fVar != null) {
                if (!cVar.f62914y || !cVar.f62915z) {
                    fVar.obtainMessage(2, cVar).sendToTarget();
                } else {
                    if (cVar.v()) {
                        return;
                    }
                    this.f61819h.h(cVar);
                }
            }
        }

        public final long o(kl.c cVar) {
            m<?> mVar = cVar.f62913x;
            if (mVar == null) {
                return 0L;
            }
            if (mVar.g()) {
                mVar.c();
                cVar.f62913x = null;
                return 0L;
            }
            long jI = I(cVar);
            mVar.destroy();
            cVar.f62913x = null;
            return jI;
        }

        public final void p() {
            while (true) {
                ll.f fVar = (ll.f) this.f61815d.acquire();
                if (fVar == null) {
                    return;
                } else {
                    fVar.destroy();
                }
            }
        }

        public final void q(int i10, boolean z10) {
            this.f61813b.f(new e(i10, z10));
        }

        public final void r() {
            this.f61813b.f(new c());
        }

        public final void u() {
            ll.e eVar = this.f61813b;
            if (eVar != null) {
                eVar.f(new C0550a());
                this.f61813b.clear();
            }
            this.f61817f = 0;
        }

        public final void v() {
            ll.e eVar = this.f61813b;
            if (eVar != null) {
                eVar.f(new C0551b());
            }
        }

        public final kl.c w(kl.c cVar, boolean z10, int i10) {
            d dVar = new d(i10, cVar, z10, (!z10 ? a.this.f61908b.m() * 2 : 0) + a.this.f61907a.A.f63681e);
            this.f61813b.f(dVar);
            return dVar.d();
        }

        public long x() {
            kl.c cVarFirst;
            ll.e eVar = this.f61813b;
            if (eVar == null || eVar.size() <= 0 || (cVarFirst = this.f61813b.first()) == null) {
                return 0L;
            }
            return cVarFirst.b();
        }

        public float y() {
            int i10 = this.f61816e;
            if (i10 == 0) {
                return 0.0f;
            }
            return this.f61817f / i10;
        }

        public void z(int i10) {
            f fVar = this.f61819h;
            if (fVar != null) {
                fVar.j(i10 == 1);
            }
        }

        public void t(boolean z10, kl.c cVar, kl.c cVar2) {
            m<?> mVarE = cVar.e();
            if (mVarE != null) {
                long jO = o(cVar);
                if (cVar.v()) {
                    a.this.f61907a.b().t().f(cVar);
                }
                if (jO <= 0) {
                    return;
                }
                this.f61817f = (int) (((long) this.f61817f) - jO);
                this.f61815d.a((ll.f) mVarE);
            }
        }
    }

    @Override // jl.e
    public void o(kl.e eVar) {
        this.f61913g = eVar;
        kl.e eVar2 = new kl.e();
        this.f61808x = eVar2;
        eVar2.update(eVar.f62916a);
    }

    @Override // jl.e, jl.h
    public void prepare() {
        nl.a aVar = this.f61910d;
        if (aVar == null) {
            return;
        }
        p(aVar);
        this.f61807w.n();
    }

    public a(kl.e eVar, DanmakuContext danmakuContext, h.a aVar) {
        super(eVar, danmakuContext, aVar);
        this.f61806v = 2;
        this.f61809y = new Object();
        NativeBitmapFactory.f();
        int iMax = (int) Math.max(4194304.0f, Runtime.getRuntime().maxMemory() * danmakuContext.A.f63678b);
        this.f61806v = iMax;
        b bVar = new b(iMax, 3);
        this.f61807w = bVar;
        this.f61912f.f(bVar);
    }

    @Override // jl.e, jl.h
    public void a(kl.c cVar) {
        super.a(cVar);
        b bVar = this.f61807w;
        if (bVar == null) {
            return;
        }
        bVar.a(cVar);
    }

    @Override // jl.e, jl.h
    public ol.a.b g(kl.a aVar) {
        b bVar;
        ol.a.b bVarG = super.g(aVar);
        synchronized (this.f61809y) {
            this.f61809y.notify();
        }
        if (bVarG != null && (bVar = this.f61807w) != null && bVarG.f65413k - bVarG.f65414l < -20) {
            bVar.E();
            this.f61807w.C(-this.f61907a.f64339z.f63689f);
        }
        return bVarG;
    }

    @Override // jl.e, jl.h
    public void i() {
        super.i();
        t();
        this.f61912f.f(null);
        b bVar = this.f61807w;
        if (bVar != null) {
            bVar.s();
            this.f61807w = null;
        }
        NativeBitmapFactory.g();
    }

    @Override // jl.e, jl.h
    public void onPlayStateChanged(int i10) {
        super.onPlayStateChanged(i10);
        b bVar = this.f61807w;
        if (bVar != null) {
            bVar.z(i10);
        }
    }

    @Override // jl.e
    public boolean q(DanmakuContext danmakuContext, DanmakuContext.DanmakuConfigTag danmakuConfigTag, Object... objArr) {
        b bVar;
        Object obj;
        b bVar2;
        if (!super.n(danmakuContext, danmakuConfigTag, objArr)) {
            if (DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR.equals(danmakuConfigTag)) {
                this.f61908b.a(this.f61907a.f64317d);
                f();
            } else if (danmakuConfigTag.isVisibilityRelatedTag()) {
                if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && ((!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (bVar2 = this.f61807w) != null)) {
                    bVar2.C(0L);
                }
                f();
            } else if (!DanmakuContext.DanmakuConfigTag.TRANSPARENCY.equals(danmakuConfigTag) && !DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE.equals(danmakuConfigTag) && !DanmakuContext.DanmakuConfigTag.DANMAKU_STYLE.equals(danmakuConfigTag)) {
                b bVar3 = this.f61807w;
                if (bVar3 != null) {
                    bVar3.F();
                    this.f61807w.C(0L);
                }
            } else {
                if (DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE.equals(danmakuConfigTag)) {
                    this.f61908b.a(this.f61907a.f64317d);
                }
                b bVar4 = this.f61807w;
                if (bVar4 != null) {
                    bVar4.D();
                    this.f61807w.C(-this.f61907a.f64339z.f63689f);
                }
            }
        }
        if (this.f61911e != null && (bVar = this.f61807w) != null) {
            bVar.A(new RunnableC0549a());
            return true;
        }
        return true;
    }

    @Override // jl.e
    public void r(kl.c cVar) {
        super.r(cVar);
        b bVar = this.f61807w;
        if (bVar != null) {
            int i10 = this.f61810z + 1;
            this.f61810z = i10;
            if (i10 > 5) {
                bVar.E();
                this.f61810z = 0;
                return;
            }
            return;
        }
        m<?> mVarE = cVar.e();
        if (mVarE != null) {
            if (mVarE.g()) {
                mVarE.c();
            } else {
                mVarE.destroy();
            }
            cVar.f62913x = null;
        }
    }

    @Override // jl.e, jl.h
    public void seek(long j10) {
        super.seek(j10);
        if (this.f61807w == null) {
            start();
        }
        this.f61807w.H(j10);
    }

    @Override // jl.e, jl.h
    public void start() {
        super.start();
        NativeBitmapFactory.f();
        b bVar = this.f61807w;
        if (bVar == null) {
            b bVar2 = new b(this.f61806v, 3);
            this.f61807w = bVar2;
            bVar2.n();
            this.f61912f.f(this.f61807w);
            return;
        }
        bVar.G();
    }
}
