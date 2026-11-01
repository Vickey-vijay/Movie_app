package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Sd implements InterfaceC2830ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f23505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qm f23506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3053n9 f23507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f23508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EnumC3184sg f23509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qk.k f23510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f23511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MediaPlayer f23512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2729ae f23513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2867fn f23514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3117pn f23515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rd f23516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qk.k f23517m;

    public Sd(Context context, nk.l0 l0Var, Qm qm2, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(qm2, "config");
        this.f23505a = l0Var;
        this.f23506b = qm2;
        this.f23507c = c3053n9;
        this.f23508d = new ArrayList();
        this.f23509e = EnumC3184sg.STATE_INITIALIZED;
        qk.k kVarB = qk.q.b(0, 0, null, 7, null);
        this.f23510f = kVarB;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f23511g = relativeLayout;
        Context context2 = relativeLayout.getContext();
        ck.p.i(context2, "getContext(...)");
        MediaPlayer mediaPlayerA = Rm.a(context2);
        this.f23512h = mediaPlayerA;
        this.f23513i = new C2729ae(relativeLayout, l0Var, mediaPlayerA, qm2, kVarB);
        this.f23514j = new C2867fn(mediaPlayerA, l0Var, qm2.f23413c.f22653f, kVarB);
        this.f23515k = new C3117pn(l0Var, mediaPlayerA, relativeLayout, qm2, c3053n9);
        this.f23516l = new Rd(this);
        this.f23517m = kVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        Qd qd2;
        if (continuationImpl instanceof Qd) {
            qd2 = (Qd) continuationImpl;
            int i10 = qd2.f23386c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qd2.f23386c = i10 - Integer.MIN_VALUE;
            } else {
                qd2 = new Qd(this, continuationImpl);
            }
        } else {
            qd2 = new Qd(this, continuationImpl);
        }
        Object objA = qd2.f23384a;
        Object objF = sj.a.f();
        int i11 = qd2.f23386c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            if (this.f23509e != EnumC3184sg.STATE_INITIALIZED) {
                throw new C2805dc();
            }
            this.f23509e = EnumC3184sg.STATE_PREPARING;
            P4.a(this.f23510f, this.f23505a, Bm.f22434a);
            C3053n9 c3053n9 = this.f23507c;
            if (c3053n9 != null) {
                c3053n9.a("NativeMediaPlayer", "Media Player Load started");
            }
            MediaPlayer mediaPlayer = this.f23512h;
            C3053n9 c3053n10 = this.f23507c;
            qd2.f23386c = 1;
            objA = Mm.a(mediaPlayer, arrayList, c3053n10, qd2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Cm cm2 = (Cm) objA;
        C3053n9 c3053n11 = this.f23507c;
        if (c3053n11 != null) {
            c3053n11.a("NativeMediaPlayer", "Media Player Load Status " + cm2);
        }
        if (!(cm2 instanceof Dm)) {
            if (!(cm2 instanceof C3365zm)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f23509e = EnumC3184sg.STATE_ERROR;
            P4.a(this.f23510f, this.f23505a, new Ql());
            throw new C2805dc();
        }
        P4.a(this.f23510f, this.f23505a, new Em(((Dm) cm2).f22548a));
        this.f23509e = EnumC3184sg.STATE_PREPARED;
        MediaPlayer mediaPlayer2 = this.f23512h;
        ck.p.j(mediaPlayer2, "<this>");
        try {
            mediaPlayer2.seekTo(0);
        } catch (IllegalStateException unused) {
        }
        C3117pn c3117pn = this.f23515k;
        Rd rd2 = this.f23516l;
        c3117pn.getClass();
        ck.p.j(rd2, "surfaceViewabilityListener");
        P4.a(c3117pn.f25104a, new C3017ln(c3117pn, rd2, null));
        C2729ae c2729ae = this.f23513i;
        P4.a(c2729ae.f23993b, new Wd(c2729ae, null));
        return this.f23511g;
    }
}
