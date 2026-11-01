package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.render.RenderTextureView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import k3.n0;
import k3.u0;

/* JADX INFO: loaded from: classes8.dex */
public class ExoPlayerView extends PlayerView {
    public static final String A = ExoPlayerView.class.getName();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.google.android.exoplayer2.render.a.b f19947s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19948t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MotionEvent f19949u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MotionEvent f19950v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f19952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f19953y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.android.exoplayer2.render.a.InterfaceC0179a f19954z;

    public class a implements com.google.android.exoplayer2.render.a.InterfaceC0179a {
        @Override // com.google.android.exoplayer2.render.a.InterfaceC0179a
        public void b(com.google.android.exoplayer2.render.a.b bVar, int i10, int i11, int i12) {
        }

        public a() {
        }

        @Override // com.google.android.exoplayer2.render.a.InterfaceC0179a
        public void a(com.google.android.exoplayer2.render.a.b bVar, int i10, int i11) {
            Log.d(ExoPlayerView.A, "onSurfaceCreated : width = " + i10 + ", height = " + i11);
            if (ExoPlayerView.this.f19947s == null) {
                ExoPlayerView.this.f19947s = bVar;
                ExoPlayerView exoPlayerView = ExoPlayerView.this;
                exoPlayerView.x(exoPlayerView.f19947s);
            }
        }

        @Override // com.google.android.exoplayer2.render.a.InterfaceC0179a
        public void c(com.google.android.exoplayer2.render.a.b bVar) {
            Log.d(ExoPlayerView.A, "onSurfaceDestroy..." + ExoPlayerView.this.f20000d.toString());
            ExoPlayerView.this.f19947s = null;
        }
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.google.android.exoplayer2.ui.PlayerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.google.android.exoplayer2.ui.PlayerView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19948t = 200;
        this.f19951w = true;
        this.f19954z = new a();
    }

    public FrameLayout getContentFrameLayout() {
        return this.f20014r;
    }

    public PlayerControlView getControllerView() {
        return this.f20003g;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        n0 n0Var;
        if (!this.f20013q) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19951w = true;
            MotionEvent motionEvent3 = this.f19950v;
            if (motionEvent3 != null && (motionEvent2 = this.f19949u) != null && y(motionEvent2, motionEvent3, motionEvent)) {
                this.f19951w = false;
                PlayerControlView playerControlView = this.f20003g;
                if (playerControlView != null && (n0Var = playerControlView.P) != null) {
                    if (n0Var.getPlayWhenReady()) {
                        PlayerControlView playerControlView2 = this.f20003g;
                        playerControlView2.Q.d(playerControlView2.P, false);
                        this.f20003g.z(1);
                    } else {
                        PlayerControlView playerControlView3 = this.f20003g;
                        playerControlView3.Q.d(playerControlView3.P, true);
                    }
                }
            }
            this.f19952x = motionEvent.getRawX();
            this.f19949u = MotionEvent.obtain(motionEvent);
        } else if (action == 1) {
            if (this.f19951w) {
                this.f19951w = false;
                if (!this.f20003g.J()) {
                    this.f20003g.S();
                    m(true);
                } else if (this.f20013q) {
                    this.f20003g.T();
                }
            }
            this.f19950v = MotionEvent.obtain(motionEvent);
        } else if (action != 2) {
            if (action == 3 && this.f19951w) {
                this.f19951w = false;
                if (!this.f20003g.J()) {
                    this.f20003g.S();
                    m(true);
                } else if (this.f20013q) {
                    this.f20003g.T();
                }
            }
        } else if (this.f19951w) {
            float rawX = motionEvent.getRawX();
            this.f19953y = rawX;
            if (Math.abs(rawX - this.f19952x) > 2.0f) {
                this.f19951w = false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerView
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
            videoComponent2.b(this.f20004h);
        }
        n0.c textComponent2 = n0Var.getTextComponent();
        if (textComponent2 != null) {
            textComponent2.c(this.f20004h);
        }
        n0Var.d(this.f20004h);
        m(false);
        s(false);
        if (this.f20000d.getRenderView() instanceof RenderTextureView) {
            ((RenderTextureView) this.f20000d).setTakeOverSurfaceTexture(true);
        }
        com.google.android.exoplayer2.render.a.b bVar = this.f19947s;
        if (bVar != null) {
            x(bVar);
        }
        this.f20000d.setRenderCallback(this.f19954z);
    }

    public final void x(com.google.android.exoplayer2.render.a.b bVar) {
        if (bVar != null) {
            bVar.a((u0) this.f20006j);
        }
    }

    public final boolean y(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (motionEvent3.getEventTime() - motionEvent2.getEventTime() > 200) {
            return false;
        }
        int x10 = ((int) motionEvent2.getX()) - ((int) motionEvent3.getX());
        int y10 = ((int) motionEvent2.getY()) - ((int) motionEvent3.getY());
        if ((x10 * x10) + (y10 * y10) >= 10000) {
            return false;
        }
        return true;
    }
}
