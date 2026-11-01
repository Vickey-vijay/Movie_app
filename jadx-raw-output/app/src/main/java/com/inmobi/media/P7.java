package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes6.dex */
public final class P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2900h5 f23315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f23316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoPlayer f23317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3028m9 f23318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f23319e;

    public final void a(int i10, int i11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23318d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int i12 = this.f23317c.getVideoSize().width;
        int i13 = this.f23317c.getVideoSize().height;
        if (i13 == 0) {
            this.f23315a.setAspectRatio(1.0f);
        } else {
            this.f23315a.setAspectRatio(i12 / i13);
        }
    }

    public P7(C2900h5 c2900h5, G1 g10, ExoPlayer exoPlayer, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(c2900h5, "textureView");
        ck.p.j(g10, "parentView");
        ck.p.j(exoPlayer, "mediaPlayer");
        this.f23315a = c2900h5;
        this.f23316b = g10;
        this.f23317c = exoPlayer;
        this.f23318d = interfaceC3028m9;
    }

    public final void a(Hj hj2) {
        ck.p.j(hj2, "surfaceTextureListener");
        this.f23319e = hj2;
        this.f23316b.addView(this.f23315a, new FrameLayout.LayoutParams(-1, -1));
        int i10 = this.f23317c.getVideoSize().width;
        int i11 = this.f23317c.getVideoSize().height;
        if (i11 == 0) {
            this.f23315a.setAspectRatio(1.0f);
        } else {
            this.f23315a.setAspectRatio(i10 / i11);
        }
        this.f23315a.setSurfaceTextureListener(new O7(this));
    }
}
