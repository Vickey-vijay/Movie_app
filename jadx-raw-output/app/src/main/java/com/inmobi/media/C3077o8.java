package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3077o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f24963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f24964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P7 f24966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f24967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ij f24968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3052n8 f24970h;

    public C3077o8(nk.l0 l0Var, ExoPlayer exoPlayer, G1 g10, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(exoPlayer, "mediaPlayer");
        ck.p.j(g10, "mediaPlayerLayout");
        this.f24963a = l0Var;
        this.f24964b = exoPlayer;
        this.f24965c = new ArrayList();
        Context context = g10.getContext();
        ck.p.i(context, "getContext(...)");
        this.f24966d = new P7(new C2900h5(context), g10, exoPlayer, interfaceC3028m9);
        this.f24970h = new C3052n8(this);
    }

    public final void a() {
        P4.a(this.f24965c);
        P7 p10 = this.f24966d;
        p10.f23319e = null;
        p10.f23315a.setSurfaceTextureListener(null);
        Surface surface = this.f24967e;
        if (surface != null) {
            surface.release();
        }
        this.f24967e = null;
        this.f24968f = null;
    }
}
