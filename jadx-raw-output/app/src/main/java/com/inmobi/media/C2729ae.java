package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.C2729ae;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2729ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f23992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f23993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f23994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qm f23995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qk.k f23996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1 f23997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f23998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2949j5 f24001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2949j5 f24002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2764bn f24003l;

    public static final void a(C2729ae c2729ae, View view) {
        P4.a(c2729ae.f23993b, new Zd(c2729ae, null));
    }

    public final void b() {
        this.f24001j.setOnClickListener(new View.OnClickListener() { // from class: b7.q5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2729ae.a(this.f5142b, view);
            }
        });
        this.f24002k.setOnClickListener(new View.OnClickListener() { // from class: b7.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2729ae.b(this.f5155b, view);
            }
        });
    }

    public C2729ae(RelativeLayout relativeLayout, nk.l0 l0Var, MediaPlayer mediaPlayer, Qm qm2, qk.k kVar) {
        ck.p.j(relativeLayout, "parentView");
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(mediaPlayer, "mediaPlayer");
        ck.p.j(qm2, "config");
        ck.p.j(kVar, "mediaPlayerFlow");
        this.f23992a = relativeLayout;
        this.f23993b = l0Var;
        this.f23994c = mediaPlayer;
        this.f23995d = qm2;
        this.f23996e = kVar;
        Context context = relativeLayout.getContext();
        ck.p.i(context, "getContext(...)");
        Q1 q10 = new Q1(context);
        this.f23997f = q10;
        RelativeLayout relativeLayout2 = new RelativeLayout(relativeLayout.getContext());
        this.f23998g = relativeLayout2;
        this.f23999h = J5.b();
        this.f24003l = new C2764bn(l0Var, relativeLayout2, qm2.f23413c, kVar);
        Vd vd2 = new Vd(this);
        ck.p.j(vd2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q10.f23361c = new WeakReference(vd2);
        Context context2 = relativeLayout2.getContext();
        ck.p.i(context2, "getContext(...)");
        this.f24001j = new C2949j5(context2, (byte) 9, null);
        Context context3 = relativeLayout2.getContext();
        ck.p.i(context3, "getContext(...)");
        this.f24002k = new C2949j5(context3, (byte) 10, null);
        b();
        relativeLayout2.setWillNotDraw(true);
        relativeLayout2.setBackgroundColor(0);
        Rm.a(mediaPlayer, q10);
    }

    public static final void b(C2729ae c2729ae, View view) {
        c2729ae.a();
        c2729ae.f23997f.a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f23994c;
        ck.p.j(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        a(this.f24001j, this.f24002k);
        P4.a(this.f23996e, this.f23993b, new S1(0.0f, true));
        this.f24000i = true;
    }

    public final void a(C2949j5 c2949j5, C2949j5 c2949j6) {
        if (ck.p.e(c2949j5.getParent(), this.f23998g)) {
            return;
        }
        this.f23998g.removeView(c2949j6);
        O1 o10 = this.f23995d.f23414d;
        float f10 = this.f23999h;
        ck.p.j(c2949j5, "<this>");
        ck.p.j(o10, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (o10.f23262b * f10), (int) (o10.f23263c * f10));
        int i10 = o10.f23265e;
        if (i10 == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i10 == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        Yb yb2 = o10.f23264d;
        layoutParams.leftMargin = (int) (yb2.f23837a * f10);
        layoutParams.topMargin = (int) (yb2.f23838b * f10);
        layoutParams.rightMargin = (int) (yb2.f23839c * f10);
        layoutParams.bottomMargin = (int) (yb2.f23840d * f10);
        c2949j5.setLayoutParams(layoutParams);
        this.f23998g.addView(c2949j5);
    }
}
