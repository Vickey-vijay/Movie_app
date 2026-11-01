package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import c5.c;
import chuangyuan.ycj.videolibrary.R$color;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.render.RenderSurfaceView;
import com.google.android.exoplayer2.render.RenderTextureView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import g5.k0;
import h5.i;
import java.util.List;
import k3.f;
import k3.m0;
import k3.n0;
import t4.j;

/* JADX INFO: loaded from: classes6.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f19998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f19999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.render.a f20000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f20001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SubtitleView f20002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PlayerControlView f20003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f20004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FrameLayout f20005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n0 f20006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f20014r;

    public final class b extends n0.a implements j, i {
        public b() {
        }

        @Override // k3.n0.b
        public void c(TrackGroupArray trackGroupArray, c cVar) {
            PlayerView.this.s(false);
        }

        @Override // t4.j
        public void onCues(List<t4.b> list) {
            SubtitleView subtitleView = PlayerView.this.f20002f;
            if (subtitleView != null) {
                subtitleView.onCues(list);
            }
        }

        @Override // k3.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            if (PlayerView.this.l() && PlayerView.this.f20012p) {
                PlayerView.this.j();
            } else {
                PlayerView.this.m(false);
            }
        }

        @Override // k3.n0.b
        public void onPositionDiscontinuity(int i10) {
            if (PlayerView.this.l() && PlayerView.this.f20012p) {
                PlayerView.this.j();
            }
        }

        @Override // h5.i
        public void onRenderedFirstFrame() {
            if (PlayerView.this.f19999c != null) {
                PlayerView.this.f19999c.setVisibility(4);
            }
        }

        @Override // h5.i
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            com.google.android.exoplayer2.render.a aVar;
            if (PlayerView.this.f19998b == null || (aVar = PlayerView.this.f20000d) == null) {
                return;
            }
            aVar.setPixelWidthHeightRatio(f10);
            PlayerView.this.f20000d.a(i10, i11);
            PlayerView.this.f20000d.b(0, 0);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @SuppressLint({"InlinedApi"})
    public final boolean k(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    public final boolean n(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                this.f20001e.setImageBitmap(bitmap);
                this.f20001e.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean o(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof ApicFrame) {
                byte[] bArr = ((ApicFrame) entryC).f19302f;
                return n(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        int color;
        boolean zHasValue;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        int i12;
        super(context, attributeSet, i10);
        this.f20013q = false;
        if (isInEditMode()) {
            this.f19998b = null;
            this.f19999c = null;
            this.f20000d = null;
            this.f20001e = null;
            this.f20002f = null;
            this.f20003g = null;
            this.f20004h = null;
            this.f20005i = null;
            ImageView imageView = new ImageView(context);
            if (k0.f53108a >= 23) {
                g(getResources(), imageView);
            } else {
                f(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int resourceId = R$layout.simple_exo_view;
        int i13 = 4;
        int i14 = 5000;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PlayerView, 0, 0);
            try {
                int i15 = R$styleable.PlayerView_shutter_background_color;
                zHasValue = typedArrayObtainStyledAttributes.hasValue(i15);
                color = typedArrayObtainStyledAttributes.getColor(i15, 0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerView_player_layout_id, resourceId);
                z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_use_artwork, true);
                z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_use_controller, true);
                i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_surface_type, 1);
                i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_resize_mode, 4);
                i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_show_timeout, 5000);
                z14 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_hide_on_touch, true);
                z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_auto_show, true);
                this.f20009m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_keep_content_on_player_reset, this.f20009m);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z16;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = true;
            z11 = true;
            color = 0;
            zHasValue = false;
            z12 = true;
            z13 = true;
            i11 = 1;
            z14 = true;
        }
        this.f20014r = (FrameLayout) LayoutInflater.from(context).inflate(resourceId, this);
        this.f20004h = new b();
        setDescendantFocusability(262144);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.exo_content_frame);
        this.f19998b = frameLayout;
        View viewFindViewById = findViewById(R$id.exo_shutter);
        this.f19999c = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (frameLayout == null || i11 == 0) {
            z15 = true;
            this.f20000d = null;
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            com.google.android.exoplayer2.render.a renderTextureView = i11 == 2 ? new RenderTextureView(context) : new RenderSurfaceView(context);
            this.f20000d = renderTextureView;
            if (i11 == 2) {
                z15 = true;
                ((RenderTextureView) renderTextureView).setTakeOverSurfaceTexture(true);
            } else {
                z15 = true;
            }
            renderTextureView.getRenderView().setLayoutParams(layoutParams);
            frameLayout.addView(renderTextureView.getRenderView(), 0);
            renderTextureView.c(i13);
        }
        this.f20005i = (FrameLayout) findViewById(R$id.exo_overlay);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R$id.exo_artwork);
        this.f20001e = appCompatImageView;
        this.f20008l = (!z12 || appCompatImageView == null) ? false : z15;
        SubtitleView subtitleView = (SubtitleView) findViewById(R$id.exo_subtitles);
        this.f20002f = subtitleView;
        if (subtitleView != null) {
            subtitleView.f();
            subtitleView.g();
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R$id.exo_controller);
        View viewFindViewById2 = findViewById(R$id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f20003g = playerControlView;
            i12 = 0;
        } else if (viewFindViewById2 != null) {
            i12 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f20003g = playerControlView2;
            playerControlView2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i12 = 0;
            this.f20003g = null;
        }
        PlayerControlView playerControlView3 = this.f20003g;
        this.f20010n = playerControlView3 == null ? i12 : i14;
        this.f20013q = z14;
        this.f20011o = z10;
        this.f20012p = z11;
        this.f20007k = (!z13 || playerControlView3 == null) ? i12 : z15;
        j();
    }

    public static void f(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color));
    }

    @TargetApi(23)
    public static void g(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n0 n0Var = this.f20006j;
        if (n0Var != null && n0Var.isPlayingAd()) {
            this.f20005i.requestFocus();
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean z10 = k(keyEvent.getKeyCode()) && this.f20007k && !this.f20003g.J();
        m(true);
        return z10 || h(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        View view = this.f19999c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean getControllerAutoShow() {
        return this.f20011o;
    }

    public boolean getControllerHideOnTouch() {
        return this.f20013q;
    }

    public int getControllerShowTimeoutMs() {
        return this.f20010n;
    }

    public n0 getPlayer() {
        return this.f20006j;
    }

    public int getResizeMode() {
        g5.a.f(this.f19998b != null);
        return this.f20000d.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f20002f;
    }

    public boolean getUseController() {
        return this.f20007k;
    }

    public com.google.android.exoplayer2.render.a getVideoSurfaceView() {
        return this.f20000d;
    }

    public boolean h(KeyEvent keyEvent) {
        return this.f20007k && this.f20003g.B(keyEvent);
    }

    public void i() {
        AppCompatImageView appCompatImageView = this.f20001e;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(R.color.transparent);
            this.f20001e.setVisibility(4);
        }
    }

    public void j() {
        PlayerControlView playerControlView = this.f20003g;
        if (playerControlView != null) {
            playerControlView.E();
        }
    }

    public final boolean l() {
        n0 n0Var = this.f20006j;
        return n0Var != null && n0Var.isPlayingAd() && this.f20006j.getPlayWhenReady();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20007k || this.f20006j == null || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (!this.f20003g.J()) {
            m(true);
        } else if (this.f20013q) {
            this.f20003g.E();
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f20007k || this.f20006j == null) {
            return false;
        }
        m(true);
        return true;
    }

    public boolean p() {
        n0 n0Var = this.f20006j;
        if (n0Var == null) {
            return true;
        }
        int playbackState = n0Var.getPlaybackState();
        return this.f20011o && (playbackState == 1 || playbackState == 4 || !this.f20006j.getPlayWhenReady());
    }

    public final void r(boolean z10) {
        if (this.f20007k) {
            this.f20003g.setShowTimeoutMs(z10 ? 0 : this.f20010n);
            this.f20003g.U();
        }
    }

    public void s(boolean z10) {
        n0 n0Var = this.f20006j;
        if (n0Var == null || n0Var.getCurrentTrackGroups().c()) {
            if (this.f20009m) {
                return;
            }
            i();
            e();
            return;
        }
        if (z10 && !this.f20009m) {
            e();
        }
        c currentTrackSelections = this.f20006j.getCurrentTrackSelections();
        for (int i10 = 0; i10 < currentTrackSelections.f5645a; i10++) {
            if (this.f20006j.getRendererType(i10) == 2 && currentTrackSelections.a(i10) != null) {
                i();
                return;
            }
        }
        e();
        this.f20008l = true;
        for (int i11 = 0; i11 < currentTrackSelections.f5645a; i11++) {
            com.google.android.exoplayer2.trackselection.c cVarA = currentTrackSelections.a(i11);
            if (cVarA != null) {
                for (int i12 = 0; i12 < cVarA.length(); i12++) {
                    Metadata metadata = cVarA.getFormat(i12).f18968h;
                    if (metadata != null && o(metadata)) {
                        return;
                    }
                }
            }
        }
        i();
    }

    public void setControlDispatcher(@Nullable f fVar) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setControlDispatcher(fVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f20011o = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f20012p = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        g5.a.f(this.f20003g != null);
        this.f20013q = z10;
    }

    public void setControllerShowTimeoutMs(int i10) {
        g5.a.f(this.f20003g != null);
        this.f20010n = i10;
        if (this.f20003g.J()) {
            q();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.f fVar) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setVisibilityListener(fVar);
    }

    public void setFastForwardIncrementMs(int i10) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setFastForwardIncrementMs(i10);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f20009m != z10) {
            this.f20009m = z10;
            s(false);
        }
    }

    public void setPlaybackPreparer(@Nullable m0 m0Var) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setPlaybackPreparer(m0Var);
    }

    public void setPlayer(n0 n0Var) {
        n0 n0Var2 = this.f20006j;
        if (n0Var2 == n0Var) {
            return;
        }
        if (n0Var2 != null) {
            n0Var2.f(this.f20004h);
            n0.d videoComponent = this.f20006j.getVideoComponent();
            if (videoComponent != null) {
                videoComponent.e(this.f20004h);
                Object obj = this.f20000d;
                if (obj instanceof TextureView) {
                    videoComponent.clearVideoTextureView((TextureView) obj);
                } else if (obj instanceof SurfaceView) {
                    videoComponent.clearVideoSurfaceView((SurfaceView) obj);
                }
            }
            n0.c textComponent = this.f20006j.getTextComponent();
            if (textComponent != null) {
                textComponent.a(this.f20004h);
            }
        }
        this.f20006j = n0Var;
        if (this.f20007k) {
            this.f20003g.setPlayer(n0Var);
        }
        SubtitleView subtitleView = this.f20002f;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        s(true);
        if (n0Var == null) {
            j();
            i();
            return;
        }
        n0.d videoComponent2 = n0Var.getVideoComponent();
        if (videoComponent2 != null) {
            Object obj2 = this.f20000d;
            if (obj2 instanceof TextureView) {
                videoComponent2.setVideoTextureView((TextureView) obj2);
            } else if (obj2 instanceof SurfaceView) {
                videoComponent2.setVideoSurfaceView((SurfaceView) obj2);
            }
            videoComponent2.b(this.f20004h);
        }
        n0.c textComponent2 = n0Var.getTextComponent();
        if (textComponent2 != null) {
            textComponent2.c(this.f20004h);
        }
        n0Var.d(this.f20004h);
        m(false);
        s(false);
    }

    public void setRepeatToggleModes(int i10) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        g5.a.f(this.f19998b != null);
        this.f20000d.c(i10);
    }

    public void setRewindIncrementMs(int i10) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setRewindIncrementMs(i10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setShowMultiWindowTimeBar(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        g5.a.f(this.f20003g != null);
        this.f20003g.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f19999c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseController(boolean z10) {
        g5.a.f((z10 && this.f20003g == null) ? false : true);
        if (this.f20007k == z10) {
            return;
        }
        this.f20007k = z10;
        if (z10) {
            this.f20003g.setPlayer(this.f20006j);
            return;
        }
        PlayerControlView playerControlView = this.f20003g;
        if (playerControlView != null) {
            playerControlView.E();
            this.f20003g.setPlayer(null);
        }
    }

    public void m(boolean z10) {
        boolean z11;
        if ((!l() || !this.f20012p) && this.f20007k) {
            if (this.f20003g.J() && this.f20003g.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zP = p();
            if (z10 || z11 || zP) {
                r(zP);
            }
        }
    }

    public void q() {
        r(p());
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        com.google.android.exoplayer2.render.a aVar = this.f20000d;
        if (aVar instanceof SurfaceView) {
            aVar.getRenderView().setVisibility(i10);
        }
    }
}
