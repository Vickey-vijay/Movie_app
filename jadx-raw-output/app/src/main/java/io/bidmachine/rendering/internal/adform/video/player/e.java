package io.bidmachine.rendering.internal.adform.video.player;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes9.dex */
public interface e extends TextureView.SurfaceTextureListener {
    @Override // android.view.TextureView.SurfaceTextureListener
    default void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    default void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
