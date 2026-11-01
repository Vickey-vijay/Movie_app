package com.bykv.vk.openvk.ouw.ouw.ouw.le;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public final class yu extends TextureView implements TextureView.SurfaceTextureListener, vt {
    private ouw ouw;
    private vt.ouw vt;

    public yu(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final View getView() {
        return this;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final void ouw(ouw ouwVar) {
        this.ouw = ouwVar;
        setSurfaceTextureListener(this);
    }

    private yu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_TextureView", "onSurfaceTextureAvailable: ");
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.ouw(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_TextureView", "onSurfaceTextureDestroyed: ");
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.yu();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_TextureView", "onSurfaceTextureSizeChanged: ");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.fkw();
        }
    }

    public final void setWindowVisibilityChangedListener(vt.ouw ouwVar) {
        this.vt = ouwVar;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th2) {
            th2.printStackTrace();
            if (com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh()) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_TextureView", "rethrow exception for debug & local_test, (TextureView)", th2);
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final void ouw(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
