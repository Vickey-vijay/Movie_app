package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.k;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i<T extends k<?>> extends sg.bigo.ads.controller.e.b<T> implements k.b {
    public AdCountDownButton A;
    public final AtomicBoolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f68583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f68584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f68585c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public T f68586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewGroup f68587z;

    public i(@NonNull Activity activity) {
        super(activity);
        this.f68583a = new AtomicBoolean(false);
        this.B = new AtomicBoolean(true);
        this.f68584b = 0L;
        this.f68585c = 0L;
    }

    private void b() {
        AdCountDownButton adCountDownButton = (AdCountDownButton) p(R.id.inter_btn_close);
        this.A = adCountDownButton;
        if (adCountDownButton != null) {
            adCountDownButton.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.interstitial.i.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a() {
                    i.this.d(true);
                }

                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a(Rect rect) {
                    i.this.f68586y.A = rect;
                }
            });
        }
    }

    public int D() {
        return 1;
    }

    public void E() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.d();
        }
        if (this.f68586y != null && !Q() && this.f68583a.compareAndSet(false, true)) {
            this.f68586y.a(D(), 2);
        }
        if (this.f68586y == null || Q()) {
            return;
        }
        this.f68586y.destroy();
    }

    public boolean Q() {
        return false;
    }

    public boolean R() {
        return false;
    }

    @LayoutRes
    public int S() {
        return R.layout.bigo_ad_activity_interstitial;
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void T() {
        super.T();
        try {
            T t10 = (T) this.N;
            this.f68586y = t10;
            if (t10 == null) {
                aG();
                return;
            }
            if (!Q()) {
                aF();
                if (U()) {
                    int i10 = R.layout.bigo_ad_activity_popup;
                    int i11 = this.L.getResources().getDisplayMetrics().widthPixels;
                    int iC = sg.bigo.ads.common.utils.e.c(this.L);
                    this.L.setContentView(sg.bigo.ads.common.utils.a.a(this.L, i10, null, false), new ViewGroup.LayoutParams(i11, iC));
                } else {
                    o(S());
                }
            }
            l();
            this.f68587z = (ViewGroup) p(R.id.inter_main);
            if (R()) {
                b();
                aa();
                X();
            } else {
                if (Q()) {
                    h(W());
                    this.f68586y.a(this);
                    return;
                }
                int iW = W();
                b();
                g(iW);
                this.f68586y.a(this);
                X();
            }
        } catch (Exception unused) {
            a("Illegal InterstitialAd.");
        }
    }

    public boolean U() {
        return false;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean V() {
        return U();
    }

    @LayoutRes
    public int W() {
        int iY = Y();
        Activity activity = this.L;
        ViewGroup viewGroup = this.f68587z;
        sg.bigo.ads.common.utils.a.a(activity, iY, viewGroup, viewGroup != null);
        return iY;
    }

    public void X() {
        this.f68586y.C();
    }

    @LayoutRes
    public abstract int Y();

    public abstract boolean Z();

    public final void a(String str) {
        T t10 = this.f68586y;
        if (t10 != null) {
            t10.e(str);
        }
        aG();
    }

    public void aa() {
    }

    public final void ab() {
        if (this.f68586y != null && !this.f68583a.get()) {
            this.f68584b += SystemClock.elapsedRealtime() - this.f68585c;
            this.f68586y.a(D(), this.f68584b);
            this.f68584b = 0L;
        }
        aG();
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ac() {
        if (f() && this.B.compareAndSet(true, false)) {
            g();
        }
        sg.bigo.ads.controller.landing.c cVarY = af().y();
        if (cVarY == null || cVarY.f70979a != 4 || cVarY.f70981c) {
            return;
        }
        af().y().f70981c = true;
        sg.bigo.ads.controller.landing.e.a(this.L, af());
        Activity activity = this.L;
        sg.bigo.ads.core.landing.a.a(activity, cVarY.f70980b, activity.getPackageName());
    }

    public boolean ad() {
        return true;
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ae() {
        if (h() && this.B.compareAndSet(false, true)) {
            i();
        }
        sg.bigo.ads.controller.landing.e.a(this.L, af());
    }

    public sg.bigo.ads.ad.c af() {
        return this.f68586y;
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ag() {
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ah() {
    }

    public void b(String str) {
    }

    public void d(boolean z10) {
        ab();
    }

    public boolean f() {
        return true;
    }

    @CallSuper
    public void g() {
        h(false);
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f67721c || !ad()) {
            return;
        }
        this.A.c();
    }

    public abstract void g(@LayoutRes int i10);

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z10) {
        if (z10) {
            aF();
        }
    }

    public void h(@LayoutRes int i10) {
    }

    public final void h(boolean z10) {
        this.B.set(z10);
        if (z10) {
            this.f68584b += SystemClock.elapsedRealtime() - this.f68585c;
        } else {
            this.f68585c = SystemClock.elapsedRealtime();
        }
    }

    public boolean h() {
        return true;
    }

    @CallSuper
    public void i() {
        h(true);
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f67721c) {
            return;
        }
        adCountDownButton.b();
    }

    public final void k(@DrawableRes int i10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setCloseImageResource(i10);
        }
    }

    public abstract void l();
}
