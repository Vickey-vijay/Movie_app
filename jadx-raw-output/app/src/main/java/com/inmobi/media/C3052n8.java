package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: com.inmobi.media.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3052n8 implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3077o8 f24878a;

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surfaceTexture) {
        ck.p.j(surfaceTexture, "surface");
        Surface surface = new Surface(surfaceTexture);
        C3077o8 c3077o8 = this.f24878a;
        Surface surface2 = c3077o8.f24967e;
        if (surface2 != null) {
            surface2.release();
        }
        c3077o8.f24967e = surface;
        Ij ij2 = this.f24878a.f24968f;
        if (ij2 != null) {
            ij2.c();
        }
    }

    public C3052n8(C3077o8 c3077o8) {
        this.f24878a = c3077o8;
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        this.f24878a.f24964b.clearVideoSurface();
        this.f24878a.f24964b.setVideoSurface(null);
        Surface surface = this.f24878a.f24967e;
        if (surface != null) {
            surface.release();
        }
        this.f24878a.f24967e = null;
    }
}
