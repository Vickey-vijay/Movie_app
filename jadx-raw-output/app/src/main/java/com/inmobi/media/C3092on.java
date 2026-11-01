package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import com.safedk.android.internal.partials.InMobiVideoBridge;

/* JADX INFO: renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3092on implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3117pn f25018a;

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surfaceTexture) {
        ck.p.j(surfaceTexture, "surface");
        Surface surface = new Surface(surfaceTexture);
        C3117pn c3117pn = this.f25018a;
        c3117pn.f25110g = surface;
        MediaPlayer mediaPlayer = c3117pn.f25105b;
        ck.p.j(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface);
        } catch (IllegalStateException unused) {
        }
        this.f25018a.a();
        Ij ij2 = this.f25018a.f25111h;
        if (ij2 != null) {
            ij2.c();
        }
    }

    public C3092on(C3117pn c3117pn) {
        this.f25018a = c3117pn;
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        Surface surface = this.f25018a.f25110g;
        if (surface != null) {
            surface.release();
        }
        C3117pn c3117pn = this.f25018a;
        c3117pn.f25110g = null;
        MediaPlayer mediaPlayer = c3117pn.f25105b;
        ck.p.j(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
        } catch (IllegalStateException unused) {
        }
        this.f25018a.a();
    }
}
