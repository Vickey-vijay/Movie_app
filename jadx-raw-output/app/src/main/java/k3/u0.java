package k3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: SimpleExoPlayer.java */
/* JADX INFO: loaded from: classes11.dex */
public class u0 extends d implements n0.d, n0.c {
    public int A;

    @Nullable
    public o3.d B;

    @Nullable
    public o3.d C;
    public int D;
    public m3.c E;
    public float F;

    @Nullable
    public k4.r G;
    public List<t4.b> H;
    public boolean I;

    @Nullable
    public g5.w J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0[] f62288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f62289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f62290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f62291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<h5.i> f62292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet<m3.e> f62293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet<t4.j> f62294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<c4.d> f62295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet<h5.q> f62296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet<com.google.android.exoplayer2.audio.a> f62297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e5.c f62298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l3.a f62299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3.a f62300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k3.c f62301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0 f62302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f62303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Format f62304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Format f62305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public h5.e f62306t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Surface f62307u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62308v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public SurfaceHolder f62310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public TextureView f62311y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f62312z;

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f62313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s0 f62314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g5.c f62315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c5.d f62316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g0 f62317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e5.c f62318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public l3.a f62319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Looper f62320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f62321i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f62322j;

        public b(Context context, s0 s0Var) {
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            h hVar = new h();
            e5.k kVarK = e5.k.k(context);
            Looper looperN = g5.k0.N();
            g5.c cVar = g5.c.f53058a;
            this(context, s0Var, defaultTrackSelector, hVar, kVarK, looperN, new l3.a(cVar), true, cVar);
        }

        public u0 a() {
            g5.a.f(!this.f62322j);
            this.f62322j = true;
            return new u0(this.f62313a, this.f62314b, this.f62316d, this.f62317e, this.f62318f, this.f62319g, this.f62315c, this.f62320h);
        }

        public b b(c5.d dVar) {
            g5.a.f(!this.f62322j);
            this.f62316d = dVar;
            return this;
        }

        public b(Context context, s0 s0Var, c5.d dVar, g0 g0Var, e5.c cVar, Looper looper, l3.a aVar, boolean z10, g5.c cVar2) {
            this.f62313a = context;
            this.f62314b = s0Var;
            this.f62316d = dVar;
            this.f62317e = g0Var;
            this.f62318f = cVar;
            this.f62320h = looper;
            this.f62319g = aVar;
            this.f62321i = z10;
            this.f62315c = cVar2;
        }
    }

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    public final class c implements h5.q, com.google.android.exoplayer2.audio.a, t4.j, c4.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, k3.c.b, k3.a.b, n0.b {
        public c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // k3.c.b
        public void executePlayerCommand(int i10) {
            u0 u0Var = u0.this;
            u0Var.d0(u0Var.getPlayWhenReady(), i10);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void m(o3.d dVar) {
            Iterator it = u0.this.f62297k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.audio.a) it.next()).m(dVar);
            }
            u0.this.f62305s = null;
            u0.this.C = null;
            u0.this.D = 0;
        }

        @Override // c4.d
        public void o(Metadata metadata) {
            Iterator it = u0.this.f62295i.iterator();
            while (it.hasNext()) {
                ((c4.d) it.next()).o(metadata);
            }
        }

        @Override // k3.a.b
        public void onAudioBecomingNoisy() {
            u0.this.setPlayWhenReady(false);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            Iterator it = u0.this.f62297k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.audio.a) it.next()).onAudioDecoderInitialized(str, j10, j11);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void onAudioSessionId(int i10) {
            if (u0.this.D == i10) {
                return;
            }
            u0.this.D = i10;
            for (m3.e eVar : u0.this.f62293g) {
                if (!u0.this.f62297k.contains(eVar)) {
                    eVar.onAudioSessionId(i10);
                }
            }
            Iterator it = u0.this.f62297k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.audio.a) it.next()).onAudioSessionId(i10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void onAudioSinkUnderrun(int i10, long j10, long j11) {
            Iterator it = u0.this.f62297k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.audio.a) it.next()).onAudioSinkUnderrun(i10, j10, j11);
            }
        }

        @Override // t4.j
        public void onCues(List<t4.b> list) {
            u0.this.H = list;
            Iterator it = u0.this.f62294h.iterator();
            while (it.hasNext()) {
                ((t4.j) it.next()).onCues(list);
            }
        }

        @Override // h5.q
        public void onDroppedFrames(int i10, long j10) {
            Iterator it = u0.this.f62296j.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).onDroppedFrames(i10, j10);
            }
        }

        @Override // k3.n0.b
        public void onLoadingChanged(boolean z10) {
            if (u0.this.J != null) {
                if (z10 && !u0.this.K) {
                    u0.this.J.a(0);
                    u0.this.K = true;
                } else {
                    if (z10 || !u0.this.K) {
                        return;
                    }
                    u0.this.J.b(0);
                    u0.this.K = false;
                }
            }
        }

        @Override // k3.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            u0.this.e0();
        }

        @Override // h5.q
        public void onRenderedFirstFrame(Surface surface) {
            if (u0.this.f62307u == surface) {
                Iterator it = u0.this.f62292f.iterator();
                while (it.hasNext()) {
                    ((h5.i) it.next()).onRenderedFirstFrame();
                }
            }
            Iterator it2 = u0.this.f62296j.iterator();
            while (it2.hasNext()) {
                ((h5.q) it2.next()).onRenderedFirstFrame(surface);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.b0(new Surface(surfaceTexture), true);
            u0.this.R(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            u0.this.b0(null, true);
            u0.this.R(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.R(i10, i11);
        }

        @Override // h5.q
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            Iterator it = u0.this.f62296j.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).onVideoDecoderInitialized(str, j10, j11);
            }
        }

        @Override // h5.q
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            for (h5.i iVar : u0.this.f62292f) {
                if (!u0.this.f62296j.contains(iVar)) {
                    iVar.onVideoSizeChanged(i10, i11, i12, f10);
                }
            }
            Iterator it = u0.this.f62296j.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).onVideoSizeChanged(i10, i11, i12, f10);
            }
        }

        @Override // h5.q
        public void p(o3.d dVar) {
            Iterator it = u0.this.f62296j.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).p(dVar);
            }
            u0.this.f62304r = null;
            u0.this.B = null;
        }

        @Override // h5.q
        public void q(o3.d dVar) {
            u0.this.B = dVar;
            Iterator it = u0.this.f62296j.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).q(dVar);
            }
        }

        @Override // h5.q
        public void r(Format format) {
            u0.this.f62304r = format;
            Iterator it = u0.this.f62296j.iterator();
            while (it.hasNext()) {
                ((h5.q) it.next()).r(format);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void s(o3.d dVar) {
            u0.this.C = dVar;
            Iterator it = u0.this.f62297k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.audio.a) it.next()).s(dVar);
            }
        }

        @Override // k3.c.b
        public void setVolumeMultiplier(float f10) {
            u0.this.W();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            u0.this.R(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            u0.this.b0(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            u0.this.b0(null, false);
            u0.this.R(0, 0);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public void v(Format format) {
            u0.this.f62305s = format;
            Iterator it = u0.this.f62297k.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.audio.a) it.next()).v(format);
            }
        }
    }

    public u0(Context context, s0 s0Var, c5.d dVar, g0 g0Var, e5.c cVar, l3.a aVar, g5.c cVar2, Looper looper) {
        this(context, s0Var, dVar, g0Var, com.google.android.exoplayer2.drm.a.a(), cVar, aVar, cVar2, looper);
    }

    public void S(k4.r rVar) {
        T(rVar, true, true);
    }

    public final void d0(boolean z10, int i10) {
        int i11 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i11 = 1;
        }
        this.f62289c.T(z11, i11);
    }

    @Override // k3.n0
    @Nullable
    public n0.c getTextComponent() {
        return this;
    }

    @Override // k3.n0
    @Nullable
    public n0.d getVideoComponent() {
        return this;
    }

    public void K(c4.d dVar) {
        this.f62295i.add(dVar);
    }

    public Looper N() {
        return this.f62289c.w();
    }

    public c5.d Q() {
        return this.f62289c.C();
    }

    public final void R(int i10, int i11) {
        if (i10 == this.f62312z && i11 == this.A) {
            return;
        }
        this.f62312z = i10;
        this.A = i11;
        Iterator<h5.i> it = this.f62292f.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceSizeChanged(i10, i11);
        }
    }

    public final void V() {
        TextureView textureView = this.f62311y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f62291e) {
                g5.m.h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f62311y.setSurfaceTextureListener(null);
            }
            this.f62311y = null;
        }
        SurfaceHolder surfaceHolder = this.f62310x;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f62291e);
            this.f62310x = null;
        }
    }

    public final void W() {
        float f10 = this.F * this.f62301o.f();
        for (p0 p0Var : this.f62288b) {
            if (p0Var.getTrackType() == 1) {
                this.f62289c.v(p0Var).m(2).l(Float.valueOf(f10)).k();
            }
        }
    }

    public final void Y(@Nullable h5.e eVar) {
        for (p0 p0Var : this.f62288b) {
            if (p0Var.getTrackType() == 2) {
                this.f62289c.v(p0Var).m(8).l(eVar).k();
            }
        }
        this.f62306t = eVar;
    }

    @Override // k3.n0.c
    public void a(t4.j jVar) {
        this.f62294h.remove(jVar);
    }

    @Override // k3.n0.d
    public void b(h5.i iVar) {
        this.f62292f.add(iVar);
    }

    public final void b0(@Nullable Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : this.f62288b) {
            if (p0Var.getTrackType() == 2) {
                arrayList.add(this.f62289c.v(p0Var).m(1).l(surface).k());
            }
        }
        Surface surface2 = this.f62307u;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o0) it.next()).a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f62308v) {
                this.f62307u.release();
            }
        }
        this.f62307u = surface;
        this.f62308v = z10;
    }

    @Override // k3.n0.c
    public void c(t4.j jVar) {
        if (!this.H.isEmpty()) {
            jVar.onCues(this.H);
        }
        this.f62294h.add(jVar);
    }

    @Override // k3.n0.d
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        M(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // k3.n0.d
    public void e(h5.i iVar) {
        this.f62292f.remove(iVar);
    }

    @Override // k3.n0.d
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        a0(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Deprecated
    public u0(Context context, s0 s0Var, c5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, e5.c cVar, l3.a aVar2, g5.c cVar2, Looper looper) {
        this.f62298l = cVar;
        this.f62299m = aVar2;
        c cVar3 = new c();
        this.f62291e = cVar3;
        CopyOnWriteArraySet<h5.i> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f62292f = copyOnWriteArraySet;
        CopyOnWriteArraySet<m3.e> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f62293g = copyOnWriteArraySet2;
        this.f62294h = new CopyOnWriteArraySet<>();
        this.f62295i = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<h5.q> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.f62296j = copyOnWriteArraySet3;
        CopyOnWriteArraySet<com.google.android.exoplayer2.audio.a> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.f62297k = copyOnWriteArraySet4;
        Handler handler = new Handler(looper);
        this.f62290d = handler;
        p0[] p0VarArrA = s0Var.a(handler, cVar3, cVar3, cVar3, cVar3, aVar);
        this.f62288b = p0VarArrA;
        this.F = 1.0f;
        this.D = 0;
        this.E = m3.c.f63964f;
        this.f62309w = 1;
        this.H = Collections.emptyList();
        t tVar = new t(p0VarArrA, dVar, g0Var, cVar, cVar2, looper);
        this.f62289c = tVar;
        aVar2.H(tVar);
        tVar.d(aVar2);
        tVar.d(cVar3);
        copyOnWriteArraySet3.add(aVar2);
        copyOnWriteArraySet.add(aVar2);
        copyOnWriteArraySet4.add(aVar2);
        copyOnWriteArraySet2.add(aVar2);
        K(aVar2);
        cVar.e(handler, aVar2);
        if (aVar instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) aVar).i(handler, aVar2);
        }
        this.f62300n = new k3.a(context, handler, cVar3);
        this.f62301o = new k3.c(context, handler, cVar3);
        this.f62302p = new w0(context);
        this.f62303q = new x0(context);
    }

    public void J(l3.b bVar) {
        f0();
        this.f62299m.x(bVar);
    }

    public void L() {
        f0();
        Y(null);
    }

    public void M(@Nullable SurfaceHolder surfaceHolder) {
        f0();
        if (surfaceHolder != null && surfaceHolder == this.f62310x) {
            a0(null);
        }
    }

    @Nullable
    public ExoPlaybackException O() {
        f0();
        return this.f62289c.z();
    }

    public l0 P() {
        f0();
        return this.f62289c.A();
    }

    public void T(k4.r rVar, boolean z10, boolean z11) {
        f0();
        k4.r rVar2 = this.G;
        if (rVar2 != null) {
            rVar2.d(this.f62299m);
            this.f62299m.G();
        }
        this.G = rVar;
        rVar.i(this.f62290d, this.f62299m);
        boolean playWhenReady = getPlayWhenReady();
        d0(playWhenReady, this.f62301o.n(playWhenReady, 2));
        this.f62289c.R(rVar, z10, z11);
    }

    public void U() {
        f0();
        this.f62300n.b(false);
        this.f62302p.a(false);
        this.f62303q.a(false);
        this.f62301o.h();
        this.f62289c.S();
        V();
        Surface surface = this.f62307u;
        if (surface != null) {
            if (this.f62308v) {
                surface.release();
            }
            this.f62307u = null;
        }
        k4.r rVar = this.G;
        if (rVar != null) {
            rVar.d(this.f62299m);
            this.G = null;
        }
        if (this.K) {
            ((g5.w) g5.a.e(this.J)).b(0);
            this.K = false;
        }
        this.f62298l.b(this.f62299m);
        this.H = Collections.emptyList();
        this.L = true;
    }

    public void X(@Nullable l0 l0Var) {
        f0();
        this.f62289c.U(l0Var);
    }

    public void Z(@Nullable Surface surface) {
        f0();
        V();
        if (surface != null) {
            L();
        }
        int i10 = 0;
        b0(surface, false);
        if (surface != null) {
            i10 = -1;
        }
        R(i10, i10);
    }

    public void a0(@Nullable SurfaceHolder surfaceHolder) {
        f0();
        V();
        if (surfaceHolder != null) {
            L();
        }
        this.f62310x = surfaceHolder;
        if (surfaceHolder == null) {
            b0(null, false);
            R(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f62291e);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            b0(surface, false);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            R(surfaceFrame.width(), surfaceFrame.height());
        } else {
            b0(null, false);
            R(0, 0);
        }
    }

    public void c0(float f10) {
        f0();
        float fP = g5.k0.p(f10, 0.0f, 1.0f);
        if (this.F == fP) {
            return;
        }
        this.F = fP;
        W();
        Iterator<m3.e> it = this.f62293g.iterator();
        while (it.hasNext()) {
            it.next().onVolumeChanged(fP);
        }
    }

    @Override // k3.n0.d
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        f0();
        if (textureView != null && textureView == this.f62311y) {
            setVideoTextureView(null);
        }
    }

    @Override // k3.n0
    public void d(n0.b bVar) {
        f0();
        this.f62289c.d(bVar);
    }

    public final void e0() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState != 2 && playbackState != 3) {
                if (playbackState != 4) {
                    throw new IllegalStateException();
                }
            } else {
                this.f62302p.a(getPlayWhenReady());
                this.f62303q.a(getPlayWhenReady());
                return;
            }
        }
        this.f62302p.a(false);
        this.f62303q.a(false);
    }

    @Override // k3.n0
    public void f(n0.b bVar) {
        f0();
        this.f62289c.f(bVar);
    }

    public final void f0() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() != N()) {
            if (this.I) {
                illegalStateException = null;
            } else {
                illegalStateException = new IllegalStateException();
            }
            g5.m.i("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
            this.I = true;
        }
    }

    @Override // k3.n0
    public long getBufferedPosition() {
        f0();
        return this.f62289c.getBufferedPosition();
    }

    @Override // k3.n0
    public long getContentPosition() {
        f0();
        return this.f62289c.getContentPosition();
    }

    @Override // k3.n0
    public int getCurrentAdGroupIndex() {
        f0();
        return this.f62289c.getCurrentAdGroupIndex();
    }

    @Override // k3.n0
    public int getCurrentAdIndexInAdGroup() {
        f0();
        return this.f62289c.getCurrentAdIndexInAdGroup();
    }

    @Override // k3.n0
    public long getCurrentPosition() {
        f0();
        return this.f62289c.getCurrentPosition();
    }

    @Override // k3.n0
    public v0 getCurrentTimeline() {
        f0();
        return this.f62289c.getCurrentTimeline();
    }

    @Override // k3.n0
    public TrackGroupArray getCurrentTrackGroups() {
        f0();
        return this.f62289c.getCurrentTrackGroups();
    }

    @Override // k3.n0
    public c5.c getCurrentTrackSelections() {
        f0();
        return this.f62289c.getCurrentTrackSelections();
    }

    @Override // k3.n0
    public int getCurrentWindowIndex() {
        f0();
        return this.f62289c.getCurrentWindowIndex();
    }

    @Override // k3.n0
    public long getDuration() {
        f0();
        return this.f62289c.getDuration();
    }

    @Override // k3.n0
    public boolean getPlayWhenReady() {
        f0();
        return this.f62289c.getPlayWhenReady();
    }

    @Override // k3.n0
    public int getPlaybackState() {
        f0();
        return this.f62289c.getPlaybackState();
    }

    @Override // k3.n0
    public int getPlaybackSuppressionReason() {
        f0();
        return this.f62289c.getPlaybackSuppressionReason();
    }

    @Override // k3.n0
    public int getRendererType(int i10) {
        f0();
        return this.f62289c.getRendererType(i10);
    }

    @Override // k3.n0
    public int getRepeatMode() {
        f0();
        return this.f62289c.getRepeatMode();
    }

    @Override // k3.n0
    public boolean getShuffleModeEnabled() {
        f0();
        return this.f62289c.getShuffleModeEnabled();
    }

    @Override // k3.n0
    public long getTotalBufferedDuration() {
        f0();
        return this.f62289c.getTotalBufferedDuration();
    }

    @Override // k3.n0
    public boolean isPlayingAd() {
        f0();
        return this.f62289c.isPlayingAd();
    }

    @Override // k3.n0
    public void seekTo(int i10, long j10) {
        f0();
        this.f62299m.F();
        this.f62289c.seekTo(i10, j10);
    }

    @Override // k3.n0
    public void setPlayWhenReady(boolean z10) {
        f0();
        d0(z10, this.f62301o.n(z10, getPlaybackState()));
    }

    @Override // k3.n0
    public void setRepeatMode(int i10) {
        f0();
        this.f62289c.setRepeatMode(i10);
    }

    @Override // k3.n0
    public void setShuffleModeEnabled(boolean z10) {
        f0();
        this.f62289c.setShuffleModeEnabled(z10);
    }

    @Override // k3.n0.d
    public void setVideoTextureView(@Nullable TextureView textureView) {
        SurfaceTexture surfaceTexture;
        f0();
        V();
        if (textureView != null) {
            L();
        }
        this.f62311y = textureView;
        if (textureView == null) {
            b0(null, true);
            R(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            g5.m.h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f62291e);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            b0(null, true);
            R(0, 0);
        } else {
            b0(new Surface(surfaceTexture), true);
            R(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // k3.n0
    public void stop(boolean z10) {
        f0();
        this.f62301o.n(getPlayWhenReady(), 1);
        this.f62289c.stop(z10);
        k4.r rVar = this.G;
        if (rVar != null) {
            rVar.d(this.f62299m);
            this.f62299m.G();
            if (z10) {
                this.G = null;
            }
        }
        this.H = Collections.emptyList();
    }
}
