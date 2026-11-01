package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler L = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a F;
    private VideoNativePlayer G;
    private h H;
    private AdSession I;
    private MediaEvents J;
    private boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f36242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextureView f36245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f36246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Surface f36247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ProgressBar f36248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MyImageView f36249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f36250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f36251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f36252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f36253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f36254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AnimationDrawable f36255y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AlphaAnimation f36256z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (MediaViewPlayerView.this.f36241k) {
                    MediaViewPlayerView.this.closeSound();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.b();
                    }
                } else {
                    MediaViewPlayerView.this.openSound();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.a();
                    }
                }
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage());
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MediaViewPlayerView.this.pause();
                MediaViewPlayerView.this.f36250t.setVisibility(0);
                MediaViewPlayerView.this.n();
                MediaViewPlayerView.this.c();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.c();
                }
                MediaViewPlayerView.this.f36235e = true;
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaViewPlayerView.this.onClickPlayButton();
        }
    }

    public class d implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MediaViewPlayerView.this.f36251u.setVisibility(0);
            MediaViewPlayerView.this.p();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.c();
                MediaViewPlayerView.this.f();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    public class f implements com.mbridge.msdk.foundation.same.image.c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MediaViewPlayerView.this.f36249s == null || bitmap == null) {
                return;
            }
            MediaViewPlayerView.this.f36249s.setImageUrl(str);
            MediaViewPlayerView.this.f36249s.setImageBitmap(bitmap);
        }
    }

    public class g extends TimerTask {
        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.gonePauseView();
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaViewPlayerView f36264a;

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f36264a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.f36240j) {
                    return;
                }
                q0.c("MediaViewPlayerView", "play end and display endcardView");
                this.f36264a.m();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }

        public h(MediaViewPlayerView mediaViewPlayerView) {
            this.f36264a = mediaViewPlayerView;
        }
    }

    public class i implements TextureView.SurfaceTextureListener {
        private i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.G != null && MediaViewPlayerView.this.G.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f36233c = true;
                MediaViewPlayerView.this.f36237g = false;
            } catch (Throwable th2) {
                q0.b("MediaViewPlayerView", th2.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public /* synthetic */ i(MediaViewPlayerView mediaViewPlayerView, a aVar) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            try {
                MediaViewPlayerView.this.f36247q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f36237g = true;
                MediaViewPlayerView.this.f36239i = true;
                if (MediaViewPlayerView.this.f36234d) {
                    if (MediaViewPlayerView.this.f36238h) {
                        MediaViewPlayerView.this.f36233c = false;
                        MediaViewPlayerView.this.f36238h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f36235e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.m();
                    return;
                }
                if (MediaViewPlayerView.this.f36232b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.m();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.m();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            q0.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f36231a = false;
        this.f36232b = false;
        this.f36233c = false;
        this.f36234d = false;
        this.f36235e = false;
        this.f36236f = false;
        this.f36237g = false;
        this.f36238h = true;
        this.f36239i = false;
        this.f36240j = true;
        this.f36241k = false;
        this.f36242l = -1;
        this.f36243m = true;
        this.f36244n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    public void closeSound() {
        this.f36241k = false;
        try {
            if (this.G != null) {
                this.f36252v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.G.closeSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                }
            } catch (IllegalArgumentException e10) {
                q0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z10, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
            if (TextUtils.isEmpty(str) || campaignEx == null) {
                return false;
            }
            this.B = str;
            this.f36232b = z10;
            this.C = campaignEx;
            this.F = aVar;
            this.A = str2;
            this.G.initParameter(campaignEx.getVideoUrlEncode(), true, this.f36240j, this.f36249s, videoPlayerStatusListener);
            h();
            this.f36231a = true;
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
            this.f36231a = false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f36233c = true;
            m();
            if (this.K) {
                return;
            }
            this.G.play(getContext(), this.B, this.f36247q);
            this.K = true;
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f36233c = true;
            b();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        this.f36241k = true;
        try {
            if (this.G != null) {
                this.f36252v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.G.openSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e10) {
                q0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setExitFullScreen() {
        try {
            this.f36234d = false;
            this.f36233c = false;
            this.f36252v.setVisibility(8);
            l();
            e();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f36250t.getVisibility() != 0) {
            this.f36254x.setVisibility(8);
        }
    }

    private void g() {
        try {
            j();
            i();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    private String getPlayUrl() {
        String str;
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return null;
            }
            try {
                if (this.F == null) {
                    if (campaignEx.getAdType() == 287 || this.C.getAdType() == 94) {
                        str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                    } else {
                        str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                    }
                    this.F = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
                }
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
            com.mbridge.msdk.videocommon.download.a aVar = this.F;
            if (aVar != null && aVar.o() == 5) {
                String strP = this.F.p();
                if (new File(strP).exists()) {
                    return strP;
                }
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                return videoUrlEncode;
            }
        } catch (Exception e11) {
            q0.b("MediaViewPlayerView", e11.getMessage());
        }
        return null;
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (a1.a(imageUrl) || getContext() == null) {
                return;
            }
            if (com.mbridge.msdk.foundation.same.image.b.a(getContext()).c(imageUrl)) {
                Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(imageUrl);
                MyImageView myImageView = this.f36249s;
                if (myImageView != null && bitmapB != null) {
                    myImageView.setImageUrl(imageUrl);
                    this.f36249s.setImageBitmap(bitmapB);
                    this.f36249s.setVisibility(0);
                }
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(getContext()).a(imageUrl, new f());
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void i() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.G = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void j() {
        try {
            a aVar = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_playerview", "layout"), (ViewGroup) null);
            if (viewInflate != null) {
                this.f36246p = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) viewInflate.findViewById(i0.a(getContext(), "mbridge_textureview", "id"));
                this.f36245o = textureView;
                textureView.setKeepScreenOn(true);
                this.f36245o.setSurfaceTextureListener(new i(this, aVar));
                this.f36248r = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_progress", "id"));
                this.f36249s = (MyImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f36250t = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_play", "id"));
                this.f36251u = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_pause", "id"));
                this.f36252v = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_sound", "id"));
                this.f36254x = viewInflate.findViewById(i0.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f36253w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f36255y = animationDrawable;
                animationDrawable.start();
                k();
                addView(viewInflate, -1, -1);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void k() {
        this.f36252v.setOnClickListener(new a());
        this.f36251u.setOnClickListener(new b());
        this.f36250t.setOnClickListener(new c());
    }

    private void l() {
        ImageView imageView;
        if (this.f36234d || (imageView = this.f36253w) == null || imageView.getVisibility() == 0 || !this.f36243m) {
            return;
        }
        this.f36253w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.f36249s.setVisibility(0);
            this.f36250t.setVisibility(0);
            n();
            c();
            this.f36248r.setVisibility(8);
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f36254x.setVisibility(0);
    }

    private void o() {
        MediaEvents mediaEvents;
        try {
            if (this.G == null) {
                return;
            }
            e();
            if (this.f36239i) {
                this.G.start(this.f36247q);
                this.f36239i = false;
            } else {
                this.G.start();
            }
            if ((this.f36236f || this.f36235e) && (mediaEvents = this.J) != null) {
                this.f36236f = false;
                mediaEvents.resume();
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a();
        this.E = new Timer();
        this.E.schedule(new g(), 2000L);
    }

    public boolean curIsFullScreen() {
        return this.f36234d;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public boolean getIsActiviePause() {
        return this.f36235e;
    }

    public void gonePauseView() {
        Handler handler = L;
        if (handler != null) {
            handler.post(new e());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            return videoNativePlayer != null && videoNativePlayer.loadingViewIsVisible();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            e();
            f();
            setIsComplete(false);
            if (this.f36236f) {
                this.G.play();
            } else if (!hasPrepare() || this.f36233c) {
                q0.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.G.replaySameSource(getContext(), this.B, this.f36247q);
            } else {
                q0.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f36233c);
                startOrPlayVideo();
            }
            if (this.f36235e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.f36235e = false;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f36249s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.f36251u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    a();
                    return;
                }
                AlphaAnimation alphaAnimation = this.f36256z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.f36256z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.f36256z.setInterpolator(new DecelerateInterpolator());
                this.f36256z.setAnimationListener(new d());
                n();
                this.f36254x.startAnimation(this.f36256z);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.a(this.B);
        }
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            return;
        }
        try {
            if (this.f36240j) {
                return;
            }
            this.f36233c = true;
            m();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        if (this.D == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.b(this.B);
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f36236f = true;
            }
            if (this.J != null) {
                q0.b("omsdk", "mediaviewplayerview pause");
                this.J.pause();
            }
            d();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void playVideo() {
        MediaEvents mediaEvents;
        try {
            if (this.f36231a && this.G != null) {
                if (!this.f36237g) {
                    m();
                    return;
                }
                if ((!TextUtils.isEmpty(this.B) && this.B.startsWith("http")) || this.B.startsWith("https")) {
                    this.B = getPlayUrl();
                }
                e();
                this.G.play(getContext(), this.B, this.f36247q);
                if ((this.f36236f || this.f36235e) && (mediaEvents = this.J) != null) {
                    this.f36236f = false;
                    mediaEvents.resume();
                }
                if (this.f36241k) {
                    this.G.openSound();
                } else {
                    this.G.closeSound();
                }
                this.f36233c = false;
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void registerView(AdSession adSession) {
        this.I = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            LinearLayout linearLayout = this.f36246p;
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            adSession.addFriendlyObstruction(linearLayout, friendlyObstructionPurpose, null);
            adSession.addFriendlyObstruction(this.f36248r, friendlyObstructionPurpose, null);
            MyImageView myImageView = this.f36249s;
            FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            adSession.addFriendlyObstruction(myImageView, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f36250t, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f36251u, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f36252v, friendlyObstructionPurpose, null);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.G = null;
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f36240j = z10;
    }

    public void setEnterFullScreen() {
        try {
            q0.c("MediaViewPlayerView", "setEnterFullScreen");
            this.f36234d = true;
            this.f36238h = true;
            this.f36252v.setVisibility(0);
            d();
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setIsActivePause(boolean z10) {
        this.f36235e = z10;
    }

    public void setIsComplete(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z10);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z10);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setMediaViewPlayListener(h hVar) {
        this.H = hVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.J = mediaEvents;
    }

    public void showPlayView() {
        this.f36250t.setVisibility(0);
    }

    public void showProgressView(boolean z10) {
        this.f36244n = z10;
        ProgressBar progressBar = this.f36248r;
        if (progressBar != null) {
            progressBar.setVisibility(z10 ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z10) {
        this.f36243m = z10;
        if (z10) {
            l();
        } else {
            d();
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f36237g) {
                m();
            } else if (hasPrepare()) {
                o();
            } else {
                playVideo();
            }
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            d();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void unregisterView() {
        AdSession adSession = this.I;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    private void b() {
        try {
            if (URLUtil.isNetworkUrl(this.B)) {
                return;
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                this.B = videoUrlEncode;
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f36251u.setVisibility(8);
    }

    private void d() {
        if (this.f36253w.getVisibility() == 0) {
            this.f36253w.setVisibility(8);
        }
    }

    private void e() {
        try {
            this.f36249s.setVisibility(8);
            this.f36250t.setVisibility(8);
            f();
            showProgressView(this.f36244n);
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        try {
            e();
            l();
            this.f36235e = false;
            this.f36233c = false;
            this.f36242l = i10;
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        a(i10, i11);
    }

    private void a(int i10, int i11) {
        try {
            ProgressBar progressBar = this.f36248r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i11 > 0) {
                this.f36248r.setMax(i11);
            }
            if (i10 >= 0) {
                this.f36248r.setProgress(i10 + 1);
            }
        } catch (Throwable th2) {
            q0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void a() {
        try {
            Handler handler = L;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36231a = false;
        this.f36232b = false;
        this.f36233c = false;
        this.f36234d = false;
        this.f36235e = false;
        this.f36236f = false;
        this.f36237g = false;
        this.f36238h = true;
        this.f36239i = false;
        this.f36240j = true;
        this.f36241k = false;
        this.f36242l = -1;
        this.f36243m = true;
        this.f36244n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }
}
