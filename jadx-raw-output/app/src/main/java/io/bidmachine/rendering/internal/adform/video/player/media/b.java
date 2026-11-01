package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.adform.video.player.e;

/* JADX INFO: loaded from: classes6.dex */
public class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.view.a f60065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.bidmachine.rendering.internal.adform.video.player.media.c f60066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f60067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f60068d;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.video.player.media.b$b, reason: collision with other inner class name */
    public class C0521b implements MediaPlayer.OnVideoSizeChangedListener {
        private C0521b() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            b.this.setVideoAspectRatio(i10 / i11);
        }
    }

    public class c implements e {
        private c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.this.f60068d = new Surface(surfaceTexture);
            b bVar = b.this;
            bVar.setMediaPlayerSurface(bVar.f60068d);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (b.this.f60066b == null) {
                return false;
            }
            b.this.f60066b.a();
            return false;
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.e, android.view.TextureView.SurfaceTextureListener
        public /* bridge */ /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            super.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.e, android.view.TextureView.SurfaceTextureListener
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            super.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public b(Context context) {
        super(context);
        io.bidmachine.rendering.internal.view.a aVar = new io.bidmachine.rendering.internal.view.a(context);
        this.f60065a = aVar;
        aVar.setSurfaceTextureListener(new c());
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayerSurface(@Nullable Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.f60067c;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setListener(@Nullable io.bidmachine.rendering.internal.adform.video.player.media.c cVar) {
        this.f60066b = cVar;
    }

    public void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        this.f60067c = mediaPlayer;
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new C0521b());
        }
    }

    public void setVideoAspectRatio(float f10) {
        this.f60065a.setVideoAspectRatio(f10);
    }

    private void b() {
        Surface surface = this.f60068d;
        if (surface != null) {
            surface.release();
        }
        this.f60068d = null;
    }

    public void a() {
        setMediaPlayerSurface(null);
        b();
        this.f60067c = null;
        this.f60065a.setSurfaceTextureListener(null);
    }
}
