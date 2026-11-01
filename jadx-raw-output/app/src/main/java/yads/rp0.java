package yads;

import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class rp0 implements p52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExoPlayer f82374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kn1 f82375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qi3 f82376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o52 f82377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ej3 f82378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pp0 f82379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oo0 f82380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n62 f82381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n62 f82382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cf3 f82383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kf3 f82384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f82385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f82386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f82387n;

    public final void a(cf3 cf3Var) {
        if (this.f82386m) {
            return;
        }
        this.f82383j = cf3Var;
        kn1 kn1Var = this.f82375b;
        kn1Var.getClass();
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(kn1Var.f79485b, new mu2(((l53) ne.a().f77342a).a(), cs2.a().a(kn1Var.f79485b)));
        Object obj = cp0.f76378c;
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(new CacheDataSource.Factory().setCache(ap0.a().a(kn1Var.f79485b)).setUpstreamDataSourceFactory(factory));
        kn1Var.f79484a.getClass();
        MediaSource mediaSourceCreateMediaSource = defaultMediaSourceFactory.createMediaSource(MediaItem.fromUri(cf3Var.getUrl()));
        this.f82374a.setPlayWhenReady(false);
        this.f82374a.setMediaSource(mediaSourceCreateMediaSource);
        this.f82374a.prepare();
        oo0 oo0Var = this.f82380g;
        oo0Var.getClass();
        mo0 mo0Var = new mo0(oo0Var);
        ((zb2) oo0Var.f81115b).a(oo0.f81113c, mo0Var);
    }

    @Override // yads.kx0
    public final void g() {
        this.f82387n = true;
        pauseAd();
    }

    @Override // yads.p52
    public final long b() {
        return this.f82374a.getDuration();
    }

    @Override // yads.p52
    public final void c() {
        if (!this.f82386m) {
            this.f82374a.setPlayWhenReady(true);
        }
        if (this.f82387n) {
            pauseAd();
        }
    }

    @Override // yads.p52
    public final void e() {
        if (this.f82386m) {
            return;
        }
        this.f82386m = true;
        this.f82387n = false;
        ((zb2) this.f82380g.f81115b).a();
        this.f82374a.setVideoTextureView(null);
        ej3 ej3Var = this.f82378e;
        ej3Var.f77099c = null;
        ej3Var.b();
        this.f82374a.removeListener(this.f82379f);
        this.f82374a.removeListener(this.f82378e);
        this.f82374a.release();
    }

    @Override // yads.p52
    public final boolean f() {
        return this.f82386m;
    }

    @Override // yads.p52
    public final long getAdPosition() {
        return this.f82374a.getCurrentPosition();
    }

    @Override // yads.p52
    public final float getVolume() {
        return this.f82374a.getVolume();
    }

    @Override // yads.p52
    public final boolean isPlayingAd() {
        return this.f82374a.isPlaying();
    }

    @Override // yads.p52
    public final void pauseAd() {
        if (this.f82386m) {
            return;
        }
        this.f82374a.setPlayWhenReady(false);
    }

    @Override // yads.p52
    public final void resumeAd() {
        if (this.f82386m || this.f82387n) {
            return;
        }
        this.f82374a.setPlayWhenReady(true);
    }

    @Override // yads.p52
    public final void setVolume(float f10) {
        if (this.f82386m) {
            return;
        }
        this.f82374a.setVolume(f10);
        kf3 kf3Var = this.f82384k;
        cf3 cf3Var = this.f82383j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        kf3Var.onVolumeChanged(f10);
    }

    public rp0(ExoPlayer exoPlayer, kn1 kn1Var, qi3 qi3Var, o52 o52Var, ej3 ej3Var) {
        this.f82374a = exoPlayer;
        this.f82375b = kn1Var;
        this.f82376c = qi3Var;
        this.f82377d = o52Var;
        this.f82378e = ej3Var;
        pp0 pp0Var = new pp0(this);
        this.f82379f = pp0Var;
        this.f82380g = new oo0(pp0Var);
        this.f82385l = new HashSet();
        exoPlayer.addListener(pp0Var);
        exoPlayer.addListener(ej3Var);
        z6.a(this);
    }

    @Override // yads.p52
    public final void a(n62 n62Var, n62 n62Var2) {
        this.f82381h = n62Var;
        this.f82382i = n62Var2;
        Pair pairA = n62Var2 != null ? mj.h.a(n62Var, n62Var2) : null;
        if (pairA != null && this.f82385l.contains(pairA)) {
            a(n62Var2);
        } else {
            a(n62Var);
        }
    }

    @Override // yads.p52
    public final void a(kf3 kf3Var) {
        this.f82384k = kf3Var;
    }

    @Override // yads.p52
    public final void a(TextureView textureView) {
        if (this.f82386m) {
            return;
        }
        ej3 ej3Var = this.f82378e;
        ej3Var.f77099c = textureView;
        ej3Var.b();
        this.f82374a.setVideoTextureView(textureView);
    }

    @Override // yads.p52
    public final void a(kj3 kj3Var) {
        if (this.f82386m) {
            return;
        }
        ej3 ej3Var = this.f82378e;
        ej3Var.f77100d = kj3Var;
        ej3Var.b();
    }

    @Override // yads.p52
    public final void a() {
        if (this.f82386m) {
            return;
        }
        kf3 kf3Var = this.f82384k;
        cf3 cf3Var = this.f82383j;
        if (kf3Var != null && cf3Var != null) {
            kf3Var.e();
        }
        this.f82386m = true;
        this.f82387n = false;
        ((zb2) this.f82380g.f81115b).a();
        this.f82374a.setVideoTextureView(null);
        ej3 ej3Var = this.f82378e;
        ej3Var.f77099c = null;
        ej3Var.b();
        this.f82374a.removeListener(this.f82379f);
        this.f82374a.removeListener(this.f82378e);
        this.f82374a.release();
    }
}
