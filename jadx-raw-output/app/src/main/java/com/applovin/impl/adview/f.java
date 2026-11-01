package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.n1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
class f extends Dialog implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f6957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f6960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f6961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f6962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f6963g;

    public class a implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f6963g.setClickable(true);
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6960d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f6957a);
        this.f6962f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6962f.setBackgroundColor(-1157627904);
        this.f6962f.addView(this.f6960d);
        if (!this.f6961e.l1()) {
            a(this.f6961e.f1());
            g();
        }
        setContentView(this.f6962f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f6962f.removeView(this.f6960d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f6963g == null) {
                a();
            }
            this.f6963g.setVisibility(0);
            this.f6963g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f6963g.startAnimation(alphaAnimation);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6959c.a("ExpandedAdDialog", "Unable to fade in close button", th2);
            }
            a();
        }
    }

    public b c() {
        return this.f6960d;
    }

    private void a() {
        this.f6960d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f6963g.isClickable()) {
            this.f6963g.performClick();
        }
    }

    private void g() {
        this.f6957a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6965b.f();
            }
        });
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        this.f6957a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6968b.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f6960d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f6957a.getWindow().getAttributes().flags, this.f6957a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f6959c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6959c.a("ExpandedAdDialog", "Setting window flags failed.", th2);
            }
        }
    }

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar != null) {
            if (bVar != null) {
                if (kVar != null) {
                    if (activity != null) {
                        this.f6958b = kVar;
                        this.f6959c = kVar.O();
                        this.f6957a = activity;
                        this.f6960d = bVar;
                        this.f6961e = aVar;
                        requestWindowFeature(1);
                        setCancelable(false);
                        return;
                    }
                    throw new IllegalArgumentException("No activity specified");
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No main view specified");
        }
        throw new IllegalArgumentException("No ad specified");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    private void a(e.a aVar) {
        if (this.f6963g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6959c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f6957a);
        this.f6963g = eVarA;
        eVarA.setVisibility(8);
        this.f6963g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6947b.a(view);
            }
        });
        this.f6963g.setClickable(false);
        int iA = a(((Integer) this.f6958b.a(x4.f10087z1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f6958b;
        x4 x4Var = x4.C1;
        layoutParams.addRule(((Boolean) kVar.a(x4Var)).booleanValue() ? 9 : 11);
        this.f6963g.a(iA);
        int iA2 = a(((Integer) this.f6958b.a(x4.B1)).intValue());
        int iA3 = a(((Integer) this.f6958b.a(x4.A1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f6962f.addView(this.f6963g, layoutParams);
        this.f6963g.bringToFront();
        int iA4 = a(((Integer) this.f6958b.a(x4.D1)).intValue());
        View view = new View(this.f6957a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f6958b.a(x4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6956b.b(view2);
            }
        });
        this.f6962f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f6961e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f6957a, i10);
    }
}
