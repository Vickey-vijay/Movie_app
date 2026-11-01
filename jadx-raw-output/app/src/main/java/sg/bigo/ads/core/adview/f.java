package sg.bigo.ads.core.adview;

import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends c implements MediaView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.f f71107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdImageView f71108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f71109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f71110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VideoController f71111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f71112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f71113h;

    public static class a implements VideoController {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.core.player.b.f f71114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private VideoController.VideoLifeCallback f71115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private VideoController.d f71116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private VideoController.c f71117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private VideoController.a f71118e;

        public a(@NonNull sg.bigo.ads.core.player.b.f fVar) {
            this.f71114a = fVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.a getBackupLoadCallback() {
            return this.f71118e;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.c getLoadHTMLCallback() {
            return this.f71117d;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.d getProgressChangeListener() {
            return this.f71116c;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.VideoLifeCallback getVideoLifeCallback() {
            return this.f71115b;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isMuted() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            return this.f71114a.c();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPaused() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            return this.f71114a.getPlayStatus() == 3;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPlaying() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            return this.f71114a.t();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void mute(boolean z10) {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            this.f71114a.setMute(z10);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyBackupResourceReady() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            sg.bigo.ads.core.player.b.f fVar = this.f71114a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).l();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyPlayViewRegister() {
            sg.bigo.ads.core.player.d.a.f71905a.a(this.f71114a);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyResourceReady() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            sg.bigo.ads.core.player.b.f fVar = this.f71114a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).m();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void pause() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            this.f71114a.u();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void play() {
            sg.bigo.ads.core.player.d unused = sg.bigo.ads.core.player.d.a.f71905a;
            this.f71114a.e(true);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setBackupLoadCallback(VideoController.a aVar) {
            this.f71118e = aVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setLoadHTMLCallback(VideoController.c cVar) {
            this.f71117d = cVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setNeedPauseWhenVisiblePercentEqual(boolean z10) {
            sg.bigo.ads.core.player.b.f fVar = this.f71114a;
            if (fVar != null) {
                fVar.setNeedPauseWhenVisiblePercentEqual(z10);
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setProgressChangeListener(VideoController.d dVar) {
            this.f71116c = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setVideoLifeCallback(VideoController.VideoLifeCallback videoLifeCallback) {
            this.f71115b = videoLifeCallback;
        }
    }

    public f(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
        this.f71107b = null;
        this.f71108c = null;
        Boolean bool = Boolean.TRUE;
        this.f71109d = bool;
        this.f71110e = bool;
        this.f71113h = true;
        this.f71112g = true;
    }

    private boolean b(int i10, int i11) {
        AdImageView adImageView = this.f71108c;
        if (adImageView != null) {
            return u.a(i10, i11, adImageView);
        }
        sg.bigo.ads.core.player.b.f fVar = this.f71107b;
        if (fVar != null) {
            return u.a(i10, i11, fVar);
        }
        return false;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        }
        u.a(view, this.f71088a, null, -1);
    }

    public final void a(String str) {
        sg.bigo.ads.core.player.b.e eVar = new sg.bigo.ads.core.player.b.e(this.f71088a.getContext(), 0, 0, sg.bigo.ads.api.c.b.b(1), null);
        eVar.setClickable(this.f71113h);
        a(eVar);
        eVar.setPlayInfo$505cff1c(str);
        this.f71111f = new a(eVar);
        this.f71107b = eVar;
    }

    public final void a(@NonNull n nVar, @Nullable sg.bigo.ads.common.p.g gVar) {
        AdImageView adImageView;
        ImageView.ScaleType scaleType;
        AdImageView adImageView2;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(nVar.x());
        if (this.f71108c == null) {
            this.f71108c = new AdImageView(this.f71088a.getContext());
        }
        int i10 = bVarB.f69348a;
        if (i10 == 1) {
            adImageView = this.f71108c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else if (i10 != 2) {
            if (i10 == 3) {
                adImageView2 = this.f71108c;
                layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            } else if (i10 == 4) {
                adImageView2 = this.f71108c;
                layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            }
            adImageView2.setLayoutParams(layoutParams);
            adImageView = this.f71108c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else {
            adImageView = this.f71108c;
            scaleType = ImageView.ScaleType.CENTER_CROP;
            adImageView.setScaleType(scaleType);
        }
        String strAT = nVar.aT();
        a(this.f71108c);
        this.f71108c.setBlurBorder(this.f71112g);
        this.f71108c.a(gVar);
        if (i.f69318a.n().a(9) && URLUtil.isHttpUrl(strAT) && gVar != null) {
            gVar.a(1305, "Invalid http url", "");
        } else {
            this.f71108c.a(strAT, nVar.al());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[PHI: r1
  0x0025: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v4 int) binds: [B:3:0x0010, B:5:0x0018, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(@NonNull sg.bigo.ads.core.a.a aVar, @NonNull p pVar, sg.bigo.ads.core.g.c cVar) {
        int i10;
        sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(aVar.x());
        m mVarAV = aVar.aV();
        int i11 = pVar.f71483x;
        int i12 = pVar.f71482w;
        if (mVarAV == null || mVarAV.f69411c <= 0) {
            i10 = i12;
        } else {
            int i13 = mVarAV.f69409a;
            if (i13 > 0) {
                i11 = i13;
            }
            int i14 = mVarAV.f69410b;
            if (i14 > 0) {
                i10 = i14;
            } else {
                i10 = i12;
            }
        }
        sg.bigo.ads.core.player.b.e eVar = new sg.bigo.ads.core.player.b.e(this.f71088a.getContext(), i11, i10, bVarB, aVar);
        eVar.setClickable(this.f71113h);
        a(eVar);
        eVar.setPlayInfo$505cff1c(aVar.c(this.f71088a.getContext()));
        eVar.setOnEventListener(cVar);
        this.f71111f = new a(eVar);
        this.f71107b = eVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(sg.bigo.ads.core.player.b.b bVar) {
        sg.bigo.ads.core.player.b.f fVar = this.f71107b;
        if (fVar instanceof sg.bigo.ads.core.player.b.e) {
            ((sg.bigo.ads.core.player.b.e) fVar).setIVideoPlayerViewListener(bVar);
        }
    }

    public final void a(@NonNull sg.bigo.ads.core.player.b.d dVar) {
        dVar.setVPAIDClickable(this.f71113h);
        a((View) dVar);
        this.f71111f = new a(dVar);
        this.f71107b = dVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(boolean z10) {
        sg.bigo.ads.core.player.b.f fVar = this.f71107b;
        if (fVar != null) {
            fVar.setClickable(z10);
        } else {
            this.f71113h = z10;
        }
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final boolean a() {
        sg.bigo.ads.core.player.b.f fVar = this.f71107b;
        return fVar != null ? fVar.isClickable() : this.f71113h;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final boolean a(int i10, int i11) {
        int i12;
        boolean zB = b(i10, i11);
        if ((super.a(i10, i11) && (b(i10, i11) ^ true)) && this.f71109d.booleanValue()) {
            i12 = 9;
        } else {
            if (!zB || !this.f71110e.booleanValue()) {
                return false;
            }
            i12 = 5;
        }
        a(i12);
        return true;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void b() {
        sg.bigo.ads.core.player.b.f fVar = this.f71107b;
        if (fVar != null) {
            fVar.performClick();
        }
    }

    public final int c() {
        AdImageView adImageView = this.f71108c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f71108c.getDrawable().getIntrinsicHeight();
    }

    public final int d() {
        AdImageView adImageView = this.f71108c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f71108c.getDrawable().getIntrinsicWidth();
    }
}
