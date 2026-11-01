package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3117pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f25104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaPlayer f25105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3053n9 f25106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ud f25109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f25110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ij f25111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Wm f25112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3092on f25113j;

    public C3117pn(nk.l0 l0Var, MediaPlayer mediaPlayer, RelativeLayout relativeLayout, Qm qm2, C3053n9 c3053n9) {
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(mediaPlayer, "mediaPlayer");
        ck.p.j(relativeLayout, "mediaPlayerLayout");
        ck.p.j(qm2, "config");
        this.f25104a = l0Var;
        this.f25105b = mediaPlayer;
        this.f25106c = c3053n9;
        this.f25107d = new AtomicBoolean(false);
        this.f25108e = new ArrayList();
        Context context = relativeLayout.getContext();
        ck.p.i(context, "getContext(...)");
        C2900h5 c2900h5 = new C2900h5(context);
        this.f25109f = new Ud(c2900h5, relativeLayout, mediaPlayer, c3053n9);
        this.f25112i = new Wm(l0Var, c2900h5, qm2.f23415e);
        this.f25113j = new C3092on(this);
    }

    public final void a() {
        if (this.f25110g != null && this.f25107d.get()) {
            C3284wg c3284wg = (C3284wg) this.f25112i.f23770d.getValue();
            c3284wg.f25651f.set(false);
            c3284wg.a();
        } else {
            C3284wg c3284wg2 = (C3284wg) this.f25112i.f23770d.getValue();
            c3284wg2.f25647b.setValue(Mn.HIDDEN);
            c3284wg2.f25651f.set(true);
            H6.a(c3284wg2.f25650e);
            c3284wg2.f25650e = null;
        }
    }

    public final void b() {
        P4.a(this.f25108e);
        Ud ud2 = this.f25109f;
        ud2.f23645e = null;
        ud2.f23641a.setSurfaceTextureListener(null);
        ud2.f23643c.setOnVideoSizeChangedListener(null);
        C3284wg c3284wg = (C3284wg) this.f25112i.f23770d.getValue();
        c3284wg.f25651f.set(true);
        H6.a(c3284wg.f25650e);
        c3284wg.f25650e = null;
        Surface surface = this.f25110g;
        if (surface != null) {
            surface.release();
        }
        this.f25110g = null;
        this.f25111h = null;
    }
}
