package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f18123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f18124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewGroup f18128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f18129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f18130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h1 f18131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f18132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f18133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f18134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f18135x;

    public abstract void a(int i10, int i11);

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2);

    public abstract void a(boolean z10);

    public void a(boolean z10, int i10, int i11) {
        this.f18125n = i10;
        this.f18126o = i11;
        this.f18127p = z10;
    }

    public abstract void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z10, String str);

    public abstract void b(boolean z10);

    public abstract void c(boolean z10);

    public abstract void d(boolean z10);

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract void e(boolean z10);

    public abstract void f();

    public abstract void f(boolean z10);

    public abstract void g();

    public abstract void g(boolean z10);

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public abstract void h();

    public abstract boolean i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z10);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean b() {
        return this.f18128q.getVisibility() == 0 || this.f18129r.getChildCount() > 0;
    }

    public ViewGroup getDefaultEndCardContainer() {
        return this.f18128q;
    }

    public ViewGroup getTextureHost() {
        return this.f18123l;
    }

    public int getVideoHeight() {
        return this.f18126o;
    }

    public int getVideoWidth() {
        return this.f18125n;
    }

    public s(Context context, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context);
        this.f18125n = -1;
        this.f18126o = -1;
        this.f18127p = false;
        this.f18130s = new h1(0, 0);
        this.f18135x = new h1(0, 0);
        IAlog.a("%sctor called", IAlog.a(this));
        int tickFractions = getTickFractions();
        this.f18121j = tickFractions;
        this.f18120i = getMaxTickFactor();
        this.f18122k = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f18133v = rVar;
        this.f18134w = str;
    }

    public void destroy() {
        h();
        setVisibility(8);
        if (this.f18073g != null) {
            this.f18073g = null;
        }
        IAlog.a("%sdestroyed called", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        a(this.f18135x, size, size2);
        h1 h1Var = this.f18135x;
        int i12 = h1Var.f18583a;
        if (i12 > 0 && h1Var.f18584b > 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(this.f18135x.f18584b, 1073741824);
            i10 = iMakeMeasureSpec;
        } else {
            h1Var.f18583a = size;
            h1Var.f18584b = size2;
        }
        if (!this.f18130s.equals(this.f18135x)) {
            h1 h1Var2 = this.f18130s;
            h1 h1Var3 = this.f18135x;
            h1Var2.getClass();
            h1Var2.f18583a = h1Var3.f18583a;
            h1Var2.f18584b = h1Var3.f18584b;
            o();
        }
        super.onMeasure(i10, i11);
    }

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            n nVar = this.f18073g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            ViewGroup viewGroup = fVar.f15368c;
            v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.f15361e, dVar.f15359c);
        }
    }

    public final void a(View view, int i10) {
        if (view != null) {
            view.setOnTouchListener(new r(new GestureDetector(view.getContext(), new q(this, view, new int[2], i10))));
        }
    }
}
