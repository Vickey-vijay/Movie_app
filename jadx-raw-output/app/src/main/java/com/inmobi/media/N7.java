package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class N7 {
    public final L7 A;
    public final F7 B;
    public final qk.k C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f23196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f23197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.l0 f23198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nk.l0 f23199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f23200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f23201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f23202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f23203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f23204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f23205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f23206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f23207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qk.k f23208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G1 f23209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f23210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExoPlayer f23211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f23212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f23213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f23214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EnumC3184sg f23215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f23216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.g f23217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K2 f23218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C3224u6 f23219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S7 f23220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3077o8 f23221z;

    public final void a(Rl rl2) {
        nk.j.d(this.f23198c, null, null, new G7(this, rl2, null), 3, null);
    }

    public N7(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, nk.l0 l0Var, HtmlVideoPlayerRequest htmlVideoPlayerRequest, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(hybridNativeConfig, "hybridNativeConfig");
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.f23196a = htmlVideoPlayerRequest;
        this.f23197b = interfaceC3028m9;
        this.f23198c = P4.a(l0Var, new K7(nk.i0.F8, this));
        nk.l0 l0VarA = P4.a(l0Var);
        this.f23199d = l0VarA;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.f23200e = config;
        this.f23201f = new AtomicBoolean(false);
        this.f23202g = new AtomicBoolean(false);
        this.f23203h = new AtomicBoolean(false);
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        ck.p.i(listSynchronizedList, "synchronizedList(...)");
        this.f23206k = listSynchronizedList;
        EnumC3184sg enumC3184sg = EnumC3184sg.STATE_INITIALIZED;
        this.f23207l = new AtomicReference(enumC3184sg);
        qk.k kVarB = qk.q.b(0, 0, null, 7, null);
        this.f23208m = kVarB;
        G1 g10 = new G1(context);
        this.f23209n = g10;
        this.f23210o = new ProgressBar(context);
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        ck.p.i(exoPlayerBuild, "build(...)");
        this.f23211p = exoPlayerBuild;
        List listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
        ck.p.i(listSynchronizedList2, "synchronizedList(...)");
        this.f23214s = listSynchronizedList2;
        this.f23215t = enumC3184sg;
        K2 k10 = (K2) K2.f22978h.getValue();
        k10.f22984f.incrementAndGet();
        this.f23218w = k10;
        this.f23219x = new C3224u6(exoPlayerBuild, hybridNativeConfig, l0VarA, config.getPlaybackInterval(), kVarB, config.getTrackPercentages());
        Context context2 = g10.getContext();
        ck.p.i(context2, "getContext(...)");
        this.f23220y = new S7(context2, l0VarA, exoPlayerBuild, config.getMuted(), kVarB);
        this.f23221z = new C3077o8(l0VarA, exoPlayerBuild, g10, interfaceC3028m9);
        this.A = new L7(this);
        this.B = new F7(this);
        this.C = kVarB;
    }

    public final void a(RelativeLayout relativeLayout) {
        InterfaceC3028m9 interfaceC3028m9;
        ck.p.j(relativeLayout, "parentView");
        if (this.f23203h.get()) {
            return;
        }
        this.f23213r = new WeakReference(relativeLayout);
        C3077o8 c3077o8 = this.f23221z;
        L7 l10 = this.A;
        c3077o8.getClass();
        ck.p.j(l10, "surfaceViewabilityListener");
        P4.a(c3077o8.f24963a, new C3027m8(c3077o8, l10, null));
        G1 g10 = this.f23209n;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.f23200e.getVideoViewPosition();
        if (this.f23200e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? videoViewPosition2.getX() : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? videoViewPosition2.getY() : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (J5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (J5.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.f23200e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g10.setLayoutParams(layoutParams);
        this.f23209n.setOnPositionChangeListener(new B7(this));
        ViewParent parent = this.f23210o.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f23210o);
        }
        ProgressBar progressBar = this.f23210o;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
            this.f23209n.addView(this.f23210o, 0);
        } else {
            nk.j.d(this.f23198c, null, null, new J7(null, this), 3, null);
        }
        G1 g11 = this.f23209n;
        if (ViewCompat.isAttachedToWindow(g11)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23197b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(C3127q8.f25156a);
        } else {
            g11.addOnAttachStateChangeListener(new A7(g11, this));
        }
        relativeLayout.addView(this.f23209n, 0);
        if (b() == EnumC3184sg.STATE_PREPARED || (interfaceC3028m9 = this.f23197b) == null) {
            return;
        }
        ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final EnumC3184sg b() {
        Object obj = this.f23207l.get();
        ck.p.i(obj, "get(...)");
        return (EnumC3184sg) obj;
    }

    public final void c() {
        if (!this.f23203h.get() && b() == EnumC3184sg.STATE_PLAYING) {
            if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                nk.j.d(this.f23198c, null, null, new D7(null, this), 3, null);
                return;
            }
            this.f23211p.pause();
            this.f23219x.a();
            S7 s10 = this.f23220y;
            s10.f23490b.setVolume(0.0f);
            s10.f23492d.a();
            this.f23207l.set(EnumC3184sg.STATE_PAUSED);
            a(new Om(this.f23211p.getCurrentPosition()));
        }
    }

    public final void d() {
        if (this.f23203h.get()) {
            return;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f23197b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != EnumC3184sg.STATE_PAUSED && b() != EnumC3184sg.STATE_PREPARED && b() != EnumC3184sg.STATE_PLAYBACK_COMPLETED) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23197b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
            nk.j.d(this.f23198c, null, null, new E7(null, this), 3, null);
            return;
        }
        if (b() == EnumC3184sg.STATE_PLAYBACK_COMPLETED) {
            this.f23211p.seekTo(0L);
            this.f23207l.set(EnumC3184sg.STATE_PREPARED);
        }
        S7 s10 = this.f23220y;
        if (s10.f23493e) {
            s10.a();
            s10.f23492d.a();
        } else {
            P4.a(s10.f23489a, new R7(s10, null));
        }
        C3224u6 c3224u6 = this.f23219x;
        if (!c3224u6.f25435d.getAndSet(true)) {
            nk.l0 l0Var = c3224u6.f25433b;
            long j10 = c3224u6.f25442k;
            C3174s6 c3174s6 = new C3174s6(c3224u6, null);
            ck.p.j(l0Var, "<this>");
            ck.p.j(c3174s6, "action");
            c3224u6.f25436e = nk.j.d(l0Var, nk.w0.c().n(), null, new C3(j10, null, c3174s6), 2, null);
            nk.l0 l0Var2 = c3224u6.f25433b;
            long j11 = c3224u6.f25443l;
            C3199t6 c3199t6 = new C3199t6(c3224u6, null);
            ck.p.j(l0Var2, "<this>");
            ck.p.j(c3199t6, "action");
            c3224u6.f25437f = nk.j.d(l0Var2, nk.w0.c().n(), null, new C3(j11, null, c3199t6), 2, null);
        }
        this.f23211p.play();
        this.f23207l.set(EnumC3184sg.STATE_PLAYING);
        a(new C2918hn(this.f23211p.getCurrentPosition()));
    }

    public final void e() {
        HtmlVideoFile htmlVideoFile;
        if (this.f23203h.get()) {
            return;
        }
        String str = this.f23212q;
        if (str == null) {
            htmlVideoFile = null;
            break;
        }
        Iterator it = this.f23214s.iterator();
        do {
            if (!it.hasNext()) {
                htmlVideoFile = null;
                break;
            }
            htmlVideoFile = (HtmlVideoFile) it.next();
        } while (!ck.p.e(htmlVideoFile.getUrl(), str));
        if (htmlVideoFile == null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f23197b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.f23202g.get()) {
            this.f23202g.set(true);
            kotlinx.coroutines.g gVarD = nk.j.d(this.f23198c, null, null, new C3225u7(new C3300x7(this.C), null, this), 3, null);
            List list = this.f23206k;
            ck.p.j(gVarD, "<this>");
            ck.p.j(list, "activeJobs");
            list.add(gVarD);
        }
        if (!this.f23201f.get()) {
            this.f23201f.set(true);
            if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                this.f23211p.addListener(this.B);
            } else {
                nk.j.d(this.f23198c, null, null, new C3175s7(null, this), 3, null);
            }
        }
        if (this.f23200e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.f23203h.get()) {
            return;
        }
        if (b() == EnumC3184sg.STATE_PLAYING) {
            c();
        }
        if (this.f23201f.get()) {
            this.f23201f.set(false);
            if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                this.f23211p.removeListener(this.B);
            } else {
                nk.j.d(this.f23198c, null, null, new I7(null, this), 3, null);
            }
        }
        this.f23219x.a();
        this.f23202g.set(false);
        P4.a(this.f23206k);
    }

    public final HtmlVideoPlaybackState a() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int iOrdinal = b().ordinal();
        if (iOrdinal == 2) {
            EnumC2952j8[] enumC2952j8Arr = EnumC2952j8.f24596a;
            str = C3426d4.i.f28564s;
        } else if (iOrdinal == 3) {
            EnumC2952j8[] enumC2952j8Arr2 = EnumC2952j8.f24596a;
            str = "playing";
        } else if (iOrdinal == 4) {
            EnumC2952j8[] enumC2952j8Arr3 = EnumC2952j8.f24596a;
            str = "paused";
        } else if (iOrdinal == 5) {
            EnumC2952j8[] enumC2952j8Arr4 = EnumC2952j8.f24596a;
            str = C3426d4.i.f28543h0;
        } else if (iOrdinal != 6) {
            EnumC2952j8[] enumC2952j8Arr5 = EnumC2952j8.f24596a;
            str = "loading";
        } else {
            EnumC2952j8[] enumC2952j8Arr6 = EnumC2952j8.f24596a;
            str = C3426d4.i.f28566t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.f23211p.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.f23211p.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.f23220y.f23493e);
        return htmlVideoPlaybackState;
    }

    public final void a(VideoViewPosition videoViewPosition) {
        ck.p.j(videoViewPosition, "newVideoViewPosition");
        if (this.f23203h.get()) {
            return;
        }
        if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
            nk.j.d(this.f23198c, null, null, new M7(null, this, videoViewPosition), 3, null);
            return;
        }
        TransitionManager.beginDelayedTransition(this.f23209n);
        this.f23200e.setVideoViewPosition(videoViewPosition);
        int iB = (int) (J5.b() * videoViewPosition.getWidth());
        int iB2 = (int) (J5.b() * videoViewPosition.getHeight());
        G1 g10 = this.f23209n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f23200e.getVideoViewPosition() != null) {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g10.setLayoutParams(layoutParams);
        if (this.f23204i > 0 && this.f23205j > 0) {
            G1 g11 = this.f23209n;
            int i10 = this.f23204i;
            int i11 = this.f23205j;
            g11.getClass();
            if (i10 > 0 && i11 > 0) {
                g11.f22709a = i10 / i11;
                g11.requestLayout();
            }
        }
        this.f23209n.requestLayout();
    }

    public final void a(AbstractC2826e8 abstractC2826e8) {
        Surface surface;
        if (abstractC2826e8 instanceof C2852f8) {
            C2852f8 c2852f8 = (C2852f8) abstractC2826e8;
            this.f23212q = c2852f8.f24355a;
            this.f23217v = null;
            if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                nk.j.d(this.f23198c, null, null, new C3350z7(null, this, c2852f8), 3, null);
                return;
            }
            this.f23207l.set(EnumC3184sg.STATE_PREPARED);
            this.f23211p.seekTo(0L);
            C3077o8 c3077o8 = this.f23221z;
            if (!c3077o8.f24969g && (surface = c3077o8.f24967e) != null) {
                c3077o8.f24969g = true;
                c3077o8.f24964b.setVideoSurface(surface);
            }
            HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
            htmlVideoPlaybackState.setDuration(c2852f8.f24356b / 1000.0f);
            htmlVideoPlaybackState.setVideoUrl(c2852f8.f24355a);
            htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.f23216u));
            htmlVideoPlaybackState.setMuted(this.f23220y.f23493e);
            EnumC2952j8[] enumC2952j8Arr = EnumC2952j8.f24596a;
            htmlVideoPlaybackState.setState(C3426d4.i.f28564s);
            htmlVideoPlaybackState.setTime(this.f23211p.getCurrentPosition() / 1000.0f);
            a(new C2878g8(htmlVideoPlaybackState, c2852f8.f24357c));
            return;
        }
        if (abstractC2826e8 instanceof C2775c8) {
            this.f23207l.set(EnumC3184sg.STATE_ERROR);
            this.f23217v = null;
            a(new C2749b8(this.f23196a, ((C2775c8) abstractC2826e8).f24125a.f22388a.f23827a));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
