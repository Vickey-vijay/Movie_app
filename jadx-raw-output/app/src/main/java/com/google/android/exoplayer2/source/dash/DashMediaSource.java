package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.datepicker.UtcDates;
import e5.m;
import e5.n;
import e5.q;
import g5.k0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.e0;
import k3.k;
import k3.v0;
import k4.b0;
import k4.j;
import k4.r;

/* JADX INFO: loaded from: classes7.dex */
public final class DashMediaSource extends k4.b {

    @Nullable
    public q A;
    public IOException B;
    public Handler C;
    public Uri D;
    public Uri E;
    public o4.b F;
    public boolean G;
    public long H;
    public long I;
    public long J;
    public int K;
    public long L;
    public int M;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f19439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.dash.a.InterfaceC0180a f19440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k4.g f19441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f19442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f19443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f19444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f19445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.a f19446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.g.a<? extends o4.b> f19447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f19448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f19449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray<com.google.android.exoplayer2.source.dash.b> f19450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f19451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f19452u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.dash.d.b f19453v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f19454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final Object f19455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.google.android.exoplayer2.upstream.a f19456y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Loader f19457z;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.dash.a.InterfaceC0180a f19458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f19459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.a<?> f19460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public com.google.android.exoplayer2.upstream.g.a<? extends o4.b> f19461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f19462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public k4.g f19463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public m f19464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f19465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19466i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19467j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Object f19468k;

        public Factory(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this(new com.google.android.exoplayer2.source.dash.c.a(interfaceC0188a), interfaceC0188a);
        }

        public Factory(com.google.android.exoplayer2.source.dash.a.InterfaceC0180a interfaceC0180a, @Nullable com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this.f19458a = (com.google.android.exoplayer2.source.dash.a.InterfaceC0180a) g5.a.e(interfaceC0180a);
            this.f19459b = interfaceC0188a;
            this.f19460c = com.google.android.exoplayer2.drm.a.a();
            this.f19464g = new com.google.android.exoplayer2.upstream.f();
            this.f19465h = 30000L;
            this.f19463f = new j();
        }

        public DashMediaSource a(Uri uri) {
            this.f19467j = true;
            if (this.f19461d == null) {
                this.f19461d = new o4.c();
            }
            List<StreamKey> list = this.f19462e;
            if (list != null) {
                this.f19461d = new h4.e(this.f19461d, list);
            }
            return new DashMediaSource(null, (Uri) g5.a.e(uri), this.f19459b, this.f19461d, this.f19458a, this.f19463f, this.f19460c, this.f19464g, this.f19465h, this.f19466i, this.f19468k);
        }

        @Deprecated
        public Factory b(long j10) {
            return j10 == -1 ? c(30000L, false) : c(j10, true);
        }

        public Factory c(long j10, boolean z10) {
            g5.a.f(!this.f19467j);
            this.f19465h = j10;
            this.f19466i = z10;
            return this;
        }

        public Factory d(m mVar) {
            g5.a.f(!this.f19467j);
            this.f19464g = mVar;
            return this;
        }

        @Deprecated
        public Factory e(int i10) {
            return d(new com.google.android.exoplayer2.upstream.f(i10));
        }
    }

    public static final class b extends v0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f19473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f19474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final o4.b f19475h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Object f19476i;

        @Override // k3.v0
        public int p() {
            return 1;
        }

        public static boolean t(o4.b bVar) {
            return bVar.f64997d && bVar.f64998e != -9223372036854775807L && bVar.f64995b == -9223372036854775807L;
        }

        @Override // k3.v0
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f19471d) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // k3.v0
        public int i() {
            return this.f19475h.d();
        }

        @Override // k3.v0
        public v0.c o(int i10, v0.c cVar, long j10) {
            g5.a.c(i10, 0, 1);
            long jS = s(j10);
            Object obj = v0.c.f62332n;
            Object obj2 = this.f19476i;
            o4.b bVar = this.f19475h;
            return cVar.e(obj, obj2, bVar, this.f19469b, this.f19470c, true, t(bVar), this.f19475h.f64997d, jS, this.f19473f, 0, i() - 1, this.f19472e);
        }

        public final long s(long j10) {
            n4.c cVarB;
            long j11 = this.f19474g;
            if (!t(this.f19475h)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f19473f) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f19472e + j11;
            long jF = this.f19475h.f(0);
            int i10 = 0;
            while (i10 < this.f19475h.d() - 1 && j12 >= jF) {
                j12 -= jF;
                i10++;
                jF = this.f19475h.f(i10);
            }
            o4.f fVarC = this.f19475h.c(i10);
            int iA = fVarC.a(2);
            return (iA == -1 || (cVarB = fVarC.f65027c.get(iA).f64990c.get(0).b()) == null || cVarB.getSegmentCount(jF) == 0) ? j11 : (j11 + cVarB.getTimeUs(cVarB.getSegmentNum(j12, jF))) - j12;
        }

        public b(long j10, long j11, int i10, long j12, long j13, long j14, o4.b bVar, @Nullable Object obj) {
            this.f19469b = j10;
            this.f19470c = j11;
            this.f19471d = i10;
            this.f19472e = j12;
            this.f19473f = j13;
            this.f19474g = j14;
            this.f19475h = bVar;
            this.f19476i = obj;
        }

        @Override // k3.v0
        public v0.b g(int i10, v0.b bVar, boolean z10) {
            String str;
            g5.a.c(i10, 0, i());
            Integer numValueOf = null;
            if (z10) {
                str = this.f19475h.c(i10).f65025a;
            } else {
                str = null;
            }
            if (z10) {
                numValueOf = Integer.valueOf(this.f19471d + i10);
            }
            return bVar.p(str, numValueOf, 0, this.f19475h.f(i10), k.a(this.f19475h.c(i10).f65026b - this.f19475h.c(0).f65026b) - this.f19472e);
        }

        @Override // k3.v0
        public Object m(int i10) {
            g5.a.c(i10, 0, i());
            return Integer.valueOf(this.f19471d + i10);
        }
    }

    public final class c implements com.google.android.exoplayer2.source.dash.d.b {
        public c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void onDashManifestPublishTimeExpired(long j10) {
            DashMediaSource.this.C(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.D();
        }
    }

    public static final class d implements com.google.android.exoplayer2.upstream.g.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f19478a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = f19478a.matcher(line);
                if (!matcher.matches()) {
                    throw new ParserException("Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * ((((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw new ParserException(e10);
            }
        }
    }

    public final class e implements Loader.b<com.google.android.exoplayer2.upstream.g<o4.b>> {
        public e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(com.google.android.exoplayer2.upstream.g<o4.b> gVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.E(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void h(com.google.android.exoplayer2.upstream.g<o4.b> gVar, long j10, long j11) {
            DashMediaSource.this.F(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c k(com.google.android.exoplayer2.upstream.g<o4.b> gVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.G(gVar, j10, j11, iOException, i10);
        }
    }

    public final class f implements n {
        public f() {
        }

        public final void a() throws IOException {
            if (DashMediaSource.this.B != null) {
                throw DashMediaSource.this.B;
            }
        }

        @Override // e5.n
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.f19457z.maybeThrowError();
            a();
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f19481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19483c;

        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[PHI: r12
  0x0040: PHI (r12v4 boolean) = (r12v2 boolean), (r12v1 boolean) binds: [B:27:0x0071, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        public static g a(o4.f fVar, long j10) {
            boolean z10;
            boolean z11;
            long jMin;
            int size = fVar.f65027c.size();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = false;
                    break;
                }
                int i12 = fVar.f65027c.get(i11).f64989b;
                if (i12 == 1 || i12 == 2) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            long j11 = Long.MAX_VALUE;
            int i13 = 0;
            boolean zIsExplicit = false;
            boolean z12 = false;
            long jMax = 0;
            while (i13 < size) {
                o4.a aVar = fVar.f65027c.get(i13);
                if (z10 && aVar.f64989b == 3) {
                    z11 = z10;
                    jMin = j11;
                } else {
                    n4.c cVarB = aVar.f64990c.get(i10).b();
                    if (cVarB == null) {
                        return new g(true, 0L, j10);
                    }
                    zIsExplicit |= cVarB.isExplicit();
                    int segmentCount = cVarB.getSegmentCount(j10);
                    if (segmentCount == 0) {
                        z11 = z10;
                        jMin = 0;
                        jMax = 0;
                        z12 = true;
                    } else if (z12) {
                        z11 = z10;
                        jMin = j11;
                    } else {
                        z11 = z10;
                        long firstSegmentNum = cVarB.getFirstSegmentNum();
                        long j12 = j11;
                        jMax = Math.max(jMax, cVarB.getTimeUs(firstSegmentNum));
                        if (segmentCount != -1) {
                            long j13 = (firstSegmentNum + ((long) segmentCount)) - 1;
                            jMin = Math.min(j12, cVarB.getTimeUs(j13) + cVarB.getDurationUs(j13, j10));
                        } else {
                            jMin = j12;
                        }
                    }
                }
                i13++;
                j11 = jMin;
                z10 = z11;
                i10 = 0;
            }
            return new g(zIsExplicit, jMax, j11);
        }

        public g(boolean z10, long j10, long j11) {
            this.f19481a = z10;
            this.f19482b = j10;
            this.f19483c = j11;
        }
    }

    public final class h implements Loader.b<com.google.android.exoplayer2.upstream.g<Long>> {
        public h() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(com.google.android.exoplayer2.upstream.g<Long> gVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.E(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void h(com.google.android.exoplayer2.upstream.g<Long> gVar, long j10, long j11) {
            DashMediaSource.this.H(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c k(com.google.android.exoplayer2.upstream.g<Long> gVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.I(gVar, j10, j11, iOException);
        }
    }

    public static final class i implements com.google.android.exoplayer2.upstream.g.a<Long> {
        public i() {
        }

        @Override // com.google.android.exoplayer2.upstream.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(k0.s0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        L(false);
    }

    public void E(com.google.android.exoplayer2.upstream.g<?> gVar, long j10, long j11) {
        this.f19446o.x(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a());
    }

    public void H(com.google.android.exoplayer2.upstream.g<Long> gVar, long j10, long j11) {
        this.f19446o.A(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a());
        K(gVar.c().longValue() - j10);
    }

    public Loader.c I(com.google.android.exoplayer2.upstream.g<Long> gVar, long j10, long j11, IOException iOException) {
        this.f19446o.D(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a(), iOException, true);
        J(iOException);
        return Loader.f20061f;
    }

    @Override // k4.b
    public void u() {
        this.G = false;
        this.f19456y = null;
        Loader loader = this.f19457z;
        if (loader != null) {
            loader.k();
            this.f19457z = null;
        }
        this.H = 0L;
        this.I = 0L;
        this.F = this.f19438g ? this.F : null;
        this.E = this.D;
        this.B = null;
        Handler handler = this.C;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.C = null;
        }
        this.J = 0L;
        this.K = 0;
        this.L = -9223372036854775807L;
        this.M = 0;
        this.f19450s.clear();
        this.f19442k.release();
    }

    static {
        e0.a("goog.exo.dash");
    }

    public DashMediaSource(@Nullable o4.b bVar, @Nullable Uri uri, @Nullable com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, @Nullable com.google.android.exoplayer2.upstream.g.a<? extends o4.b> aVar, com.google.android.exoplayer2.source.dash.a.InterfaceC0180a interfaceC0180a, k4.g gVar, com.google.android.exoplayer2.drm.a<?> aVar2, m mVar, long j10, boolean z10, @Nullable Object obj) {
        this.D = uri;
        this.F = bVar;
        this.E = uri;
        this.f19439h = interfaceC0188a;
        this.f19447p = aVar;
        this.f19440i = interfaceC0180a;
        this.f19442k = aVar2;
        this.f19443l = mVar;
        this.f19444m = j10;
        this.f19445n = z10;
        this.f19441j = gVar;
        this.f19455x = obj;
        boolean z11 = bVar != null;
        this.f19438g = z11;
        this.f19446o = n(null);
        this.f19449r = new Object();
        this.f19450s = new SparseArray<>();
        this.f19453v = new c();
        this.L = -9223372036854775807L;
        if (!z11) {
            this.f19448q = new e();
            this.f19454w = new f();
            this.f19451t = new Runnable() { // from class: n4.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64672b.R();
                }
            };
            this.f19452u = new Runnable() { // from class: n4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64673b.B();
                }
            };
            return;
        }
        g5.a.f(!bVar.f64997d);
        this.f19448q = null;
        this.f19451t = null;
        this.f19452u = null;
        this.f19454w = new n.a();
    }

    public final long A() {
        return this.J != 0 ? k.a(SystemClock.elapsedRealtime() + this.J) : k.a(System.currentTimeMillis());
    }

    public void C(long j10) {
        long j11 = this.L;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.L = j10;
        }
    }

    public void D() {
        this.C.removeCallbacks(this.f19452u);
        R();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    public void F(com.google.android.exoplayer2.upstream.g<o4.b> gVar, long j10, long j11) {
        o4.m mVar;
        boolean z10;
        int i10;
        this.f19446o.A(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a());
        o4.b bVarC = gVar.c();
        o4.b bVar = this.F;
        int iD = bVar == null ? 0 : bVar.d();
        long j12 = bVarC.c(0).f65026b;
        int i11 = 0;
        while (i11 < iD && this.F.c(i11).f65026b < j12) {
            i11++;
        }
        if (bVarC.f64997d) {
            if (iD - i11 > bVarC.d()) {
                g5.m.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.L;
                if (j13 == -9223372036854775807L || bVarC.f65001h * 1000 > j13) {
                    z10 = false;
                } else {
                    g5.m.h("DashMediaSource", "Loaded stale dynamic manifest: " + bVarC.f65001h + ", " + this.L);
                }
                if (z10) {
                    i10 = this.K;
                    this.K = i10 + 1;
                    if (i10 < this.f19443l.getMinimumLoadableRetryCount(gVar.f20194b)) {
                        P(z());
                        return;
                    } else {
                        this.B = new DashManifestStaleException();
                        return;
                    }
                }
                this.K = 0;
            }
            z10 = true;
            if (z10) {
                i10 = this.K;
                this.K = i10 + 1;
                if (i10 < this.f19443l.getMinimumLoadableRetryCount(gVar.f20194b)) {
                    P(z());
                    return;
                } else {
                    this.B = new DashManifestStaleException();
                    return;
                }
            }
            this.K = 0;
        }
        this.F = bVarC;
        this.G = bVarC.f64997d & this.G;
        this.H = j10 - j11;
        this.I = j10;
        synchronized (this.f19449r) {
            if (gVar.f20193a.f52374a == this.E) {
                Uri uriD = this.F.f65003j;
                if (uriD == null) {
                    uriD = gVar.d();
                }
                this.E = uriD;
            }
        }
        if (iD != 0) {
            this.M += i11;
            L(true);
            return;
        }
        o4.b bVar2 = this.F;
        if (!bVar2.f64997d || (mVar = bVar2.f65002i) == null) {
            L(true);
        } else {
            M(mVar);
        }
    }

    public Loader.c G(com.google.android.exoplayer2.upstream.g<o4.b> gVar, long j10, long j11, IOException iOException, int i10) {
        long jB = this.f19443l.b(4, j11, iOException, i10);
        Loader.c cVarG = jB == -9223372036854775807L ? Loader.f20062g : Loader.g(false, jB);
        this.f19446o.D(gVar.f20193a, gVar.d(), gVar.b(), gVar.f20194b, j10, j11, gVar.a(), iOException, !cVarG.c());
        return cVarG;
    }

    public final void J(IOException iOException) {
        g5.m.d("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        L(true);
    }

    public final void K(long j10) {
        this.J = j10;
        L(true);
    }

    public final void L(boolean z10) {
        boolean z11;
        long j10;
        for (int i10 = 0; i10 < this.f19450s.size(); i10++) {
            int iKeyAt = this.f19450s.keyAt(i10);
            if (iKeyAt >= this.M) {
                this.f19450s.valueAt(i10).B(this.F, iKeyAt - this.M);
            }
        }
        int iD = this.F.d() - 1;
        g gVarA = g.a(this.F.c(0), this.F.f(0));
        g gVarA2 = g.a(this.F.c(iD), this.F.f(iD));
        long jMax = gVarA.f19482b;
        long jMin = gVarA2.f19483c;
        if (!this.F.f64997d || gVarA2.f19481a) {
            z11 = false;
        } else {
            jMin = Math.min((A() - k.a(this.F.f64994a)) - k.a(this.F.c(iD).f65026b), jMin);
            long j11 = this.F.f64999f;
            if (j11 != -9223372036854775807L) {
                long jA = jMin - k.a(j11);
                while (jA < 0 && iD > 0) {
                    iD--;
                    jA += this.F.f(iD);
                }
                jMax = iD == 0 ? Math.max(jMax, jA) : this.F.f(0);
            }
            z11 = true;
        }
        long j12 = jMax;
        long jF = jMin - j12;
        for (int i11 = 0; i11 < this.F.d() - 1; i11++) {
            jF += this.F.f(i11);
        }
        o4.b bVar = this.F;
        if (bVar.f64997d) {
            long j13 = this.f19444m;
            if (!this.f19445n) {
                long j14 = bVar.f65000g;
                if (j14 != -9223372036854775807L) {
                    j13 = j14;
                }
            }
            long jA2 = jF - k.a(j13);
            if (jA2 < 5000000) {
                jA2 = Math.min(5000000L, jF / 2);
            }
            j10 = jA2;
        } else {
            j10 = 0;
        }
        o4.b bVar2 = this.F;
        long j15 = bVar2.f64994a;
        long jB = j15 != -9223372036854775807L ? j15 + bVar2.c(0).f65026b + k.b(j12) : -9223372036854775807L;
        o4.b bVar3 = this.F;
        t(new b(bVar3.f64994a, jB, this.M, j12, jF, j10, bVar3, this.f19455x));
        if (this.f19438g) {
            return;
        }
        this.C.removeCallbacks(this.f19452u);
        if (z11) {
            this.C.postDelayed(this.f19452u, 5000L);
        }
        if (this.G) {
            R();
            return;
        }
        if (z10) {
            o4.b bVar4 = this.F;
            if (bVar4.f64997d) {
                long j16 = bVar4.f64998e;
                if (j16 != -9223372036854775807L) {
                    P(Math.max(0L, (this.H + (j16 != 0 ? j16 : 5000L)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void M(o4.m mVar) {
        String str = mVar.f65070a;
        if (k0.c(str, "urn:mpeg:dash:utc:direct:2014") || k0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            N(mVar);
            return;
        }
        if (k0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || k0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            O(mVar, new d());
        } else if (k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            O(mVar, new i());
        } else {
            J(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void N(o4.m mVar) {
        try {
            K(k0.s0(mVar.f65071b) - this.I);
        } catch (ParserException e10) {
            J(e10);
        }
    }

    public final void O(o4.m mVar, com.google.android.exoplayer2.upstream.g.a<Long> aVar) {
        Q(new com.google.android.exoplayer2.upstream.g(this.f19456y, Uri.parse(mVar.f65071b), 5, aVar), new h(), 1);
    }

    public final void P(long j10) {
        this.C.postDelayed(this.f19451t, j10);
    }

    public final <T> void Q(com.google.android.exoplayer2.upstream.g<T> gVar, Loader.b<com.google.android.exoplayer2.upstream.g<T>> bVar, int i10) {
        this.f19446o.G(gVar.f20193a, gVar.f20194b, this.f19457z.m(gVar, bVar, i10));
    }

    public final void R() {
        Uri uri;
        this.C.removeCallbacks(this.f19451t);
        if (this.f19457z.h()) {
            return;
        }
        if (this.f19457z.i()) {
            this.G = true;
            return;
        }
        synchronized (this.f19449r) {
            uri = this.E;
        }
        this.G = false;
        Q(new com.google.android.exoplayer2.upstream.g(this.f19456y, uri, 4, this.f19447p), this.f19448q, this.f19443l.getMinimumLoadableRetryCount(4));
    }

    @Override // k4.r
    public void c(k4.q qVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) qVar;
        bVar.x();
        this.f19450s.remove(bVar.f19486b);
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return this.f19455x;
    }

    @Override // k4.r
    public k4.q j(r.a aVar, e5.b bVar, long j10) {
        int iIntValue = ((Integer) aVar.f62602a).intValue() - this.M;
        com.google.android.exoplayer2.source.dash.b bVar2 = new com.google.android.exoplayer2.source.dash.b(this.M + iIntValue, this.F, iIntValue, this.f19440i, this.A, this.f19442k, this.f19443l, o(aVar, this.F.c(iIntValue).f65026b), this.J, this.f19454w, bVar, this.f19441j, this.f19453v);
        this.f19450s.put(bVar2.f19486b, bVar2);
        return bVar2;
    }

    @Override // k4.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f19454w.maybeThrowError();
    }

    @Override // k4.b
    public void s(@Nullable q qVar) {
        this.A = qVar;
        this.f19442k.prepare();
        if (this.f19438g) {
            L(false);
            return;
        }
        this.f19456y = this.f19439h.createDataSource();
        this.f19457z = new Loader("Loader:DashMediaSource");
        this.C = new Handler();
        R();
    }

    public final long z() {
        return Math.min((this.K - 1) * 1000, 5000);
    }
}
