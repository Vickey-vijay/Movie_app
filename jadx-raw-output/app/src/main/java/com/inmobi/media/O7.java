package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes6.dex */
public final class O7 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P7 f23275a;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ck.p.j(surfaceTexture, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ck.p.j(surfaceTexture, "surface");
    }

    public O7(P7 p10) {
        this.f23275a = p10;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ck.p.j(surfaceTexture, "surface");
        Hj hj2 = this.f23275a.f23319e;
        if (hj2 != null) {
            hj2.a(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ck.p.j(surfaceTexture, "surface");
        Hj hj2 = this.f23275a.f23319e;
        if (hj2 == null) {
            return true;
        }
        hj2.a();
        return true;
    }
}
