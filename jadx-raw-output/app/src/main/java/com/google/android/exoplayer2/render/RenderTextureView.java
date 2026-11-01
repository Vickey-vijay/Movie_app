package com.google.android.exoplayer2.render;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import k3.u0;

/* JADX INFO: loaded from: classes10.dex */
public class RenderTextureView extends TextureView implements com.google.android.exoplayer2.render.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.exoplayer2.render.a.InterfaceC0179a f19422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i4.a f19423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceTexture f19424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f19426g;

    public static final class b implements com.google.android.exoplayer2.render.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<Surface> f19427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<RenderTextureView> f19428b;

        public RenderTextureView b() {
            WeakReference<RenderTextureView> weakReference = this.f19428b;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public b(RenderTextureView renderTextureView, SurfaceTexture surfaceTexture) {
            this.f19428b = new WeakReference<>(renderTextureView);
            this.f19427a = new WeakReference<>(new Surface(surfaceTexture));
        }

        @Override // com.google.android.exoplayer2.render.a.b
        public void a(u0 u0Var) {
            boolean zIsReleased;
            RenderTextureView renderTextureViewB = b();
            if (u0Var != null && this.f19427a != null && renderTextureViewB != null) {
                SurfaceTexture ownSurfaceTexture = renderTextureViewB.getOwnSurfaceTexture();
                SurfaceTexture surfaceTexture = renderTextureViewB.getSurfaceTexture();
                boolean z10 = false;
                if (ownSurfaceTexture != null && Build.VERSION.SDK_INT >= 26) {
                    zIsReleased = ownSurfaceTexture.isReleased();
                } else {
                    zIsReleased = false;
                }
                if (ownSurfaceTexture != null && !zIsReleased) {
                    z10 = true;
                }
                if (renderTextureViewB.g() && z10) {
                    if (!ownSurfaceTexture.equals(surfaceTexture)) {
                        renderTextureViewB.setSurfaceTexture(ownSurfaceTexture);
                        Log.d("RenderTextureView", "****setSurfaceTexture****");
                        return;
                    }
                    Surface surface = renderTextureViewB.getSurface();
                    if (surface != null) {
                        surface.release();
                    }
                    Surface surface2 = new Surface(ownSurfaceTexture);
                    u0Var.Z(surface2);
                    renderTextureViewB.setSurface(surface2);
                    Log.d("RenderTextureView", "****bindSurface****");
                    return;
                }
                Surface surface3 = this.f19427a.get();
                if (surface3 != null) {
                    u0Var.Z(surface3);
                    renderTextureViewB.setSurface(surface3);
                    Log.d("RenderTextureView", "****bindSurface****");
                }
            }
        }
    }

    public class c implements TextureView.SurfaceTextureListener {
        public c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            Log.d("RenderTextureView", "<---onSurfaceTextureAvailable---> : width = " + i10 + " height = " + i11);
            if (RenderTextureView.this.f19422c != null) {
                RenderTextureView.this.f19422c.a(new b(RenderTextureView.this, surfaceTexture), i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Log.d("RenderTextureView", "***onSurfaceTextureDestroyed***");
            if (RenderTextureView.this.f19422c != null) {
                RenderTextureView.this.f19422c.c(new b(RenderTextureView.this, surfaceTexture));
            }
            return !RenderTextureView.this.f19425f;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            Log.d("RenderTextureView", "onSurfaceTextureSizeChanged : width = " + i10 + " height = " + i11);
            if (RenderTextureView.this.f19422c != null) {
                RenderTextureView.this.f19422c.b(new b(RenderTextureView.this, surfaceTexture), 0, i10, i11);
            }
        }
    }

    public RenderTextureView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.google.android.exoplayer2.render.a
    public View getRenderView() {
        return this;
    }

    public RenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19421b = "RenderTextureView";
        this.f19423d = new i4.a();
        setSurfaceTextureListener(new c());
        a(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.google.android.exoplayer2.render.a
    public void a(int i10, int i11) {
        Log.d("RenderTextureView", "onUpdateVideoSize : videoWidth = " + i10 + " videoHeight = " + i11);
        this.f19423d.j(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer2.render.a
    public void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f19423d.i(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer2.render.a
    public void c(int i10) {
        this.f19423d.f(i10);
        requestLayout();
    }

    @Override // com.google.android.exoplayer2.render.a
    public void d(int i10) {
        this.f19423d.b(i10, this);
    }

    public boolean g() {
        return this.f19425f;
    }

    public SurfaceTexture getOwnSurfaceTexture() {
        return this.f19424e;
    }

    @Override // com.google.android.exoplayer2.render.a
    public int getResizeMode() {
        return this.f19423d.e();
    }

    public Surface getSurface() {
        return this.f19426g;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f19423d.a(i10, i11);
        setMeasuredDimension(this.f19423d.d(), this.f19423d.c());
    }

    @Override // com.google.android.exoplayer2.render.a
    public void setPixelWidthHeightRatio(float f10) {
        this.f19423d.g(f10);
    }

    @Override // com.google.android.exoplayer2.render.a
    public void setRenderCallback(com.google.android.exoplayer2.render.a.InterfaceC0179a interfaceC0179a) {
        this.f19422c = interfaceC0179a;
    }

    public void setSurface(Surface surface) {
        this.f19426g = surface;
    }

    public void setTakeOverSurfaceTexture(boolean z10) {
        this.f19425f = z10;
    }

    public void setVideoRotation(int i10) {
        this.f19423d.h(i10);
        setRotation(i10);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("RenderTextureView", "onTextureViewAttachedToWindow");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("RenderTextureView", "onTextureViewDetachedFromWindow");
    }
}
