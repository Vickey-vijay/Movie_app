package ap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: TextureRenderView.java */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public class d extends TextureView implements a, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceTexture f4700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public xyz.doikki.videoplayer.player.a f4701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f4702e;

    @Override // ap.a
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ap.a
    public void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f4699b.d(i10, i11);
        requestLayout();
    }

    @Override // ap.a
    public void c(@NonNull xyz.doikki.videoplayer.player.a aVar) {
        this.f4701d = aVar;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int[] iArrA = this.f4699b.a(i10, i11);
        setMeasuredDimension(iArrA[0], iArrA[1]);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        SurfaceTexture surfaceTexture2 = this.f4700c;
        if (surfaceTexture2 != null) {
            setSurfaceTexture(surfaceTexture2);
            return;
        }
        this.f4700c = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.f4702e = surface;
        xyz.doikki.videoplayer.player.a aVar = this.f4701d;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    @Override // ap.a
    public void release() {
        Surface surface = this.f4702e;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f4700c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // ap.a
    public void setScaleType(int i10) {
        this.f4699b.b(i10);
        requestLayout();
    }

    @Override // ap.a
    public void setVideoRotation(int i10) {
        this.f4699b.c(i10);
        setRotation(i10);
    }

    public d(Context context) {
        super(context);
        this.f4699b = new b();
        setSurfaceTextureListener(this);
    }

    @Override // ap.a
    public Bitmap b() {
        return getBitmap();
    }
}
