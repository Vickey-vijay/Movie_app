package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes8.dex */
public final class Td implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ud f23559a;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ck.p.j(surfaceTexture, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ck.p.j(surfaceTexture, "surface");
    }

    public Td(Ud ud2) {
        this.f23559a = ud2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ck.p.j(surfaceTexture, "surface");
        Hj hj2 = this.f23559a.f23645e;
        if (hj2 != null) {
            hj2.a(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ck.p.j(surfaceTexture, "surface");
        Hj hj2 = this.f23559a.f23645e;
        if (hj2 == null) {
            return true;
        }
        hj2.a();
        return true;
    }
}
