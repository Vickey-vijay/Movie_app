package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f15684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f15685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animation f15686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animation f15687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f15688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f15689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15691h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f15692i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f10;
        this.f15684a = view;
        this.f15686c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.f15687d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        o oVar = IAConfigManager.O.f15026u.f15195b;
        oVar.getClass();
        try {
            f10 = Float.parseFloat(oVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f10 = 0.7f;
        }
        this.f15690g = Math.max(f10, 0.7f);
        this.f15689f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f15685b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f15685b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f15684a.setLayoutParams(layoutParams2);
        this.f15685b.setVisibility(8);
        ViewGroup viewGroup2 = this.f15685b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f15685b.addView(this.f15684a);
        }
        if (this.f15688e == null) {
            b bVar2 = new b(this);
            this.f15688e = bVar2;
            com.fyber.inneractive.sdk.util.o.f18599a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iD;
        int iC = com.fyber.inneractive.sdk.util.o.c();
        if (iC != this.f15691h && (view = this.f15684a) != null && view.getLayoutParams() != null) {
            this.f15691h = iC;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f15684a.getLayoutParams();
            if (iC == 2) {
                iD = com.fyber.inneractive.sdk.util.o.e();
            } else {
                iD = (int) (com.fyber.inneractive.sdk.util.o.d() * this.f15690g);
            }
            layoutParams.height = iD;
            this.f15684a.setLayoutParams(layoutParams);
        }
    }
}
