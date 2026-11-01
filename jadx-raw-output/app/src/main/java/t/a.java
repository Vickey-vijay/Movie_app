package t;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k3.l0;
import k3.n0;
import k3.u0;
import k3.v0;
import k4.i;
import p3.j;
import q.k;
import q.l;
import q.m;

/* JADX INFO: compiled from: ExoUserPlayer.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static final String C = "t.a";
    public n0.b A;
    public d5.b B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f72020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f72021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f72022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f72023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f72025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f72026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f72027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f72028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f72029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ScheduledExecutorService f72030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f72031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t.d f72032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet<k> f72033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet<m> f72034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArraySet<l> f72035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArraySet<q.a> f72036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet<q.d> f72037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u0 f72038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t.c f72039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l0 f72040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.google.android.exoplayer2.drm.a<j> f72041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VideoPlayerView f72042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f72043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f72044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Runnable f72045z;

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public class RunnableC0747a implements Runnable {
        public RunnableC0747a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<q.d> it = a.this.E().iterator();
            while (it.hasNext()) {
                it.next().u(a.this.C());
            }
        }
    }

    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public class b extends n0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f72047b;

        public b() {
        }

        @Override // k3.n0.b
        public void c(TrackGroupArray trackGroupArray, c5.c cVar) {
            boolean z10 = true;
            if (a.this.G() > 1) {
                if (this.f72047b) {
                    this.f72047b = false;
                    a.this.f72039t.g(a.this.f72024e);
                    return;
                }
                if (!a.this.f72035p.isEmpty()) {
                    Iterator it = a.this.f72035p.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).a(a.this.f72038s.getCurrentWindowIndex(), a.this.G());
                    }
                }
                if (a.this.f72039t.c() < 0) {
                    return;
                }
                if (a.this.f72039t.c() == a.this.f72038s.getCurrentWindowIndex() && a.this.f72039t.c() > 0) {
                    z10 = false;
                }
                Iterator<q.d> it2 = a.this.E().iterator();
                while (it2.hasNext()) {
                    it2.next().k(z10);
                }
            }
        }

        @Override // k3.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            Iterator it = a.this.f72033n.iterator();
            while (it.hasNext()) {
                ((k) it.next()).e(a.this.f72038s.getPlayWhenReady());
            }
            Log.d(a.C, "onPlayerStateChanged:" + i10 + "+playWhenReady:" + z10);
            if (i10 == 1) {
                Log.d(a.C, "onPlayerStateChanged::网络状态差，请检查网络。。。");
                Iterator<q.d> it2 = a.this.E().iterator();
                while (it2.hasNext()) {
                    it2.next().t(0);
                }
                return;
            }
            if (i10 == 2) {
                if (z10) {
                    Iterator<q.d> it3 = a.this.E().iterator();
                    while (it3.hasNext()) {
                        it3.next().g(0);
                    }
                }
                Iterator it4 = a.this.f72033n.iterator();
                while (it4.hasNext()) {
                    ((k) it4.next()).c();
                }
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                Log.d(a.C, "onPlayerStateChanged:ended。。。");
                a.this.f72026g = true;
                a.this.x();
                Iterator<q.d> it5 = a.this.E().iterator();
                while (it5.hasNext()) {
                    it5.next().i(0);
                }
                Iterator it6 = a.this.f72033n.iterator();
                while (it6.hasNext()) {
                    ((k) it6.next()).d();
                }
                return;
            }
            for (q.d dVar : a.this.E()) {
                dVar.m(8, false);
                dVar.g(8);
                dVar.o(8);
            }
            if (z10) {
                a.this.f72042w.z(false);
                Log.d(a.C, "onPlayerStateChanged:准备播放");
                a.this.f72028i = false;
                Iterator it7 = a.this.f72033n.iterator();
                while (it7.hasNext()) {
                    ((k) it7.next()).a(a.this.z());
                }
            }
        }

        @Override // k3.n0.a, k3.n0.b
        public void t(v0 v0Var, Object obj, int i10) {
            if (a.this.f72027h) {
                a.this.f72027h = false;
                this.f72047b = true;
                a.this.f72038s.seekTo(a.this.f72038s.getNextWindowIndex(), a.this.f72021b.longValue());
            }
        }

        @Override // k3.n0.b
        public void b(ExoPlaybackException exoPlaybackException) {
            Log.e(a.C, "onPlayerError:" + exoPlaybackException.getMessage());
            a.this.k0();
            if (s.e.j(exoPlaybackException)) {
                a.this.x();
                a.this.i0();
                return;
            }
            Iterator<q.d> it = a.this.E().iterator();
            while (it.hasNext()) {
                it.next().t(0);
            }
            Iterator it2 = a.this.f72033n.iterator();
            while (it2.hasNext()) {
                ((k) it2.next()).b(a.this.f72038s.O());
            }
        }
    }

    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public class c implements d5.b {
        public c() {
        }

        @Override // d5.b
        public void a(long j10) {
            if (j10 > a.this.f72044y * 1000) {
                a.this.f72042w.F(0);
                a.this.f0(false);
            } else {
                a.this.f72042w.F(8);
            }
            Log.e(a.C, "onScrubMove" + j10);
        }
    }

    public a(@NonNull Context context, @NonNull t.c cVar, @NonNull VideoPlayerView videoPlayerView) {
        this.f72021b = 0L;
        this.f72022c = 0L;
        this.f72023d = 0L;
        this.f72024e = 0;
        this.f72043x = false;
        this.f72044y = 360L;
        this.f72045z = new RunnableC0747a();
        this.A = new b();
        this.B = new c();
        this.f72020a = context.getApplicationContext();
        this.f72042w = videoPlayerView;
        this.f72039t = cVar;
        this.f72033n = new CopyOnWriteArraySet<>();
        this.f72034o = new CopyOnWriteArraySet<>();
        this.f72035p = new CopyOnWriteArraySet<>();
        this.f72036q = new CopyOnWriteArraySet<>();
        this.f72037r = new CopyOnWriteArraySet<>();
        t.d dVar = new t.d(this);
        this.f72032m = dVar;
        videoPlayerView.setExoPlayerListener(dVar);
        t(videoPlayerView.getComponentListener());
        Iterator<q.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().d(true);
        }
    }

    @CallSuper
    public void L() {
        this.f72028i = true;
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            this.f72025f = true ^ u0Var.getPlayWhenReady();
            this.f72038s.setPlayWhenReady(false);
        }
    }

    @CallSuper
    public void O() {
        this.f72028i = true;
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            this.f72025f = true ^ u0Var.getPlayWhenReady();
            R();
        }
    }

    public void a0(@Size(min = 0) float f10, @Size(min = 0) float f11) {
        this.f72040u = null;
        l0 l0Var = new l0(f10, f11);
        this.f72040u = l0Var;
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            u0Var.X(l0Var);
        }
    }

    public void g0(@NonNull String str) {
        this.f72025f = false;
        k0();
        if (!(this.f72039t.d() instanceof i)) {
            this.f72039t.h(Uri.parse(str));
            P();
        } else {
            i iVar = (i) this.f72039t.d();
            iVar.T(iVar.X() - 1).b(null);
            iVar.I(this.f72039t.f(Uri.parse(str)));
            this.f72027h = true;
        }
    }

    public void l0(int i10) {
        this.f72044y = i10;
    }

    public void x() {
        this.f72024e = -1;
        this.f72021b = -9223372036854775807L;
    }

    /* JADX INFO: compiled from: ExoUserPlayer.java */
    public final class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f72050a;

        public d() {
            this.f72050a = 0L;
        }

        public /* synthetic */ d(a aVar, RunnableC0747a runnableC0747a) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE") && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() == 0) {
                    if (System.currentTimeMillis() - this.f72050a > 500) {
                        this.f72050a = System.currentTimeMillis();
                        if (!e.a().c() && !a.this.f72028i) {
                            Iterator<q.d> it = a.this.E().iterator();
                            while (it.hasNext()) {
                                it.next().q(a.this.f72043x);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (activeNetworkInfo.getType() == 1) {
                    boolean unused = a.this.f72028i;
                }
            }
        }
    }

    public long A() {
        u0 u0Var = this.f72038s;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getDuration();
    }

    public t.c B() {
        return this.f72039t;
    }

    public final String C() {
        Context context = this.f72020a;
        if (context == null) {
            return "";
        }
        long jE = s.e.e(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = jCurrentTimeMillis - this.f72023d.longValue();
        if (jLongValue == 0) {
            return "1 kb/s";
        }
        long jLongValue2 = ((jE - this.f72022c.longValue()) * 1000) / jLongValue;
        this.f72023d = Long.valueOf(jCurrentTimeMillis);
        this.f72022c = Long.valueOf(jE);
        if (jLongValue2 <= 1024) {
            return jLongValue2 + " kb/s";
        }
        return new DecimalFormat("######0.0").format(s.e.c(jLongValue2)) + " MB/s";
    }

    public u0 D() {
        return this.f72038s;
    }

    public CopyOnWriteArraySet<q.d> E() {
        return this.f72037r;
    }

    public VideoPlayerView F() {
        return this.f72042w;
    }

    public int G() {
        u0 u0Var = this.f72038s;
        if (u0Var == null) {
            return 0;
        }
        if (u0Var.getCurrentTimeline().q()) {
            return 1;
        }
        return this.f72038s.getCurrentTimeline().p();
    }

    public boolean H() {
        int playbackState;
        u0 u0Var = this.f72038s;
        return (u0Var == null || (playbackState = u0Var.getPlaybackState()) == 1 || playbackState == 4 || !this.f72038s.getPlayWhenReady()) ? false : true;
    }

    public boolean I() {
        if (s.e.m(this.f72020a) || this.f72020a.getResources().getConfiguration().orientation != 2) {
            return true;
        }
        Iterator<q.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().n();
        }
        return false;
    }

    public void M() {
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            u0Var.setPlayWhenReady(true);
        }
    }

    public void N() {
        VideoPlayerView videoPlayerView = this.f72042w;
        if (videoPlayerView != null) {
            videoPlayerView.p(this.B);
        }
    }

    public void P() {
        if (this.f72038s == null) {
            y();
        }
        boolean z10 = this.f72024e != -1;
        if (this.f72025f) {
            this.f72038s.setPlayWhenReady(false);
        } else {
            this.f72038s.setPlayWhenReady(true);
        }
        this.f72038s.X(this.f72040u);
        for (q.d dVar : E()) {
            dVar.m(8, true);
            dVar.e(false, false);
            dVar.v(true);
            dVar.d(false);
            dVar.o(0);
        }
        if (z10) {
            this.f72038s.seekTo(this.f72024e, this.f72021b.longValue());
        }
        this.f72038s.f(this.A);
        this.f72038s.d(this.A);
        this.f72038s.T(this.f72039t.d(), !z10, false);
        this.f72026g = false;
        this.f72029j = true;
        for (q.d dVar2 : E()) {
            dVar2.onPrepared();
            dVar2.o(0);
        }
    }

    public final void Q() {
        if (this.f72031l == null) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            d dVar = new d(this, null);
            this.f72031l = dVar;
            this.f72020a.registerReceiver(dVar, intentFilter);
        }
    }

    public void S() {
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            u0Var.f(this.A);
            this.f72038s.m();
            this.f72038s.U();
            this.f72038s = null;
        }
    }

    public void T() {
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            u0Var.m();
            this.f72038s.f(this.A);
            for (q.d dVar : E()) {
                dVar.d(true);
                dVar.reset();
            }
            this.f72038s.U();
            this.f72038s = null;
        }
    }

    public void V(long j10) {
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            u0Var.k(j10);
        }
    }

    public final void W() {
        if (this.f72030k == null) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            this.f72030k = scheduledExecutorServiceNewScheduledThreadPool;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this.f72045z, 1000L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public void X(com.google.android.exoplayer2.drm.a<j> aVar) {
        this.f72041v = aVar;
    }

    public void Y(@NonNull Uri uri) {
        this.f72039t.h(uri);
    }

    public void a() {
        Iterator<m> it = this.f72034o.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void b() {
        Iterator<m> it = this.f72034o.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void b0(int i10, long j10) {
        this.f72024e = i10;
        this.f72021b = Long.valueOf(j10);
    }

    public void d0(boolean z10) {
        this.f72043x = z10;
    }

    public void f0(boolean z10) {
        if (this.f72038s != null) {
            if (z10) {
                Iterator<q.d> it = E().iterator();
                while (it.hasNext()) {
                    it.next().m(8, false);
                }
            }
            this.f72038s.setPlayWhenReady(z10);
        }
    }

    public final void j0() {
        d dVar = this.f72031l;
        if (dVar != null) {
            this.f72020a.unregisterReceiver(dVar);
        }
        this.f72031l = null;
    }

    public void k0() {
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            this.f72024e = u0Var.getCurrentWindowIndex();
            this.f72021b = Long.valueOf(Math.max(0L, this.f72038s.getContentPosition()));
        }
    }

    public void s(@NonNull q.a aVar) {
        this.f72036q.add(aVar);
    }

    public void t(@NonNull q.d dVar) {
        this.f72037r.add(dVar);
    }

    public void u(@NonNull l lVar) {
        this.f72035p.add(lVar);
    }

    public void v(@NonNull k kVar) {
        this.f72033n.add(kVar);
    }

    public void w(@NonNull m mVar) {
        this.f72034o.add(mVar);
    }

    public void y() {
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(new com.google.android.exoplayer2.trackselection.a.d());
        W();
        this.f72038s = k3.l.a(this.f72020a, new k3.j(this.f72020a, 1), defaultTrackSelector, new p.b(), this.f72041v);
        Iterator<q.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().h(this.f72038s);
        }
        Iterator<q.a> it2 = this.f72036q.iterator();
        while (it2.hasNext()) {
            it2.next().h(this.f72038s);
        }
    }

    public long z() {
        u0 u0Var = this.f72038s;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getCurrentPosition();
    }

    public void J(Configuration configuration) {
        boolean z10;
        if (E() != null && E().size() > 0) {
            for (q.d dVar : E()) {
                if (configuration.orientation == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.s(z10);
            }
        }
    }

    @CallSuper
    public void K() {
        R();
        Iterator<q.a> it = this.f72036q.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        t.c cVar = this.f72039t;
        if (cVar != null) {
            cVar.a();
        }
        this.f72022c = 0L;
        this.f72023d = 0L;
        this.f72021b = 0L;
        this.f72024e = 0;
        this.f72033n.clear();
        this.f72034o.clear();
        this.f72035p.clear();
        this.f72036q.clear();
        this.f72037r.clear();
        this.f72026g = false;
        this.f72028i = false;
        this.f72025f = false;
        this.f72030k = null;
        this.f72039t = null;
        this.A = null;
        this.f72032m = null;
        this.f72042w.p(null);
    }

    public void R() {
        k0();
        j0();
        u0 u0Var = this.f72038s;
        if (u0Var != null) {
            u0Var.f(this.A);
            this.f72038s.m();
            this.f72038s.U();
            this.f72038s = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f72030k;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f72030k.shutdown();
        }
    }

    public void U() {
        i0();
    }

    public void Z(@NonNull String str) {
        Y(Uri.parse(str));
    }

    public void c0(long j10) {
        this.f72021b = Long.valueOf(j10);
    }

    public void e0(boolean z10) {
        Iterator<q.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().f(z10);
        }
    }

    public a h0() {
        e.a().f(this);
        this.f72025f = false;
        for (q.d dVar : E()) {
            dVar.c(this);
            dVar.d(false);
            dVar.o(0);
        }
        i0();
        Q();
        return this;
    }

    public void i0() {
        P();
    }

    public a(@NonNull Context context, @NonNull t.c cVar) {
        this.f72021b = 0L;
        this.f72022c = 0L;
        this.f72023d = 0L;
        this.f72024e = 0;
        this.f72043x = false;
        this.f72044y = 360L;
        this.f72045z = new RunnableC0747a();
        this.A = new b();
        this.B = new c();
        this.f72020a = context.getApplicationContext();
        this.f72033n = new CopyOnWriteArraySet<>();
        this.f72034o = new CopyOnWriteArraySet<>();
        this.f72035p = new CopyOnWriteArraySet<>();
        this.f72036q = new CopyOnWriteArraySet<>();
        this.f72037r = new CopyOnWriteArraySet<>();
        this.f72032m = new t.d(this);
        this.f72039t = cVar;
        Iterator<q.d> it = E().iterator();
        while (it.hasNext()) {
            it.next().d(true);
        }
    }
}
