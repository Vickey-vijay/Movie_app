package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q extends i<s> {
    public static final sg.bigo.ads.core.adview.h F = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.1
        @Override // sg.bigo.ads.core.adview.h
        public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
            sg.bigo.ads.common.t.a.a(0, 4, "emptyClick", "emptyClick stop event Propagation");
        }
    };

    @Nullable
    public sg.bigo.ads.ad.b.b C;

    @Nullable
    public ViewGroup D;

    @Nullable
    public Button E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t f68909a;

    public q(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        super.F();
        VideoController videoControllerAk = ak();
        if (videoControllerAk != null) {
            videoControllerAk.setVideoLifeCallback(null);
            videoControllerAk.setLoadHTMLCallback(null);
            videoControllerAk.setProgressChangeListener(null);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public boolean Q() {
        return this instanceof sg.bigo.ads.ad.interstitial.g.b;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean R() {
        return this instanceof sg.bigo.ads.ad.interstitial.g.a;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final sg.bigo.ads.ad.c af() {
        return this.C;
    }

    public int ai() {
        return 1;
    }

    @NonNull
    public final t aj() {
        if (this.f68909a == null) {
            this.f68909a = (aH() || U()) ? sg.bigo.ads.ad.interstitial.d.a.a(this.C) : sg.bigo.ads.ad.interstitial.d.a.a(this.C, n());
        }
        return this.f68909a;
    }

    @Nullable
    public final VideoController ak() {
        sg.bigo.ads.ad.b.b bVar = this.C;
        if (bVar != null) {
            return bVar.getVideoController();
        }
        return null;
    }

    public final boolean al() {
        T t10 = this.f68586y;
        return t10 != 0 && ((s) t10).B();
    }

    public final boolean am() {
        T t10 = this.f68586y;
        return t10 != 0 && ((s) t10).J();
    }

    public ValueCallback<Double> an() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public void g() {
        super.g();
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialPage", "performResume");
        t tVar = this.f68909a;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void g(@LayoutRes int i10) {
        ViewGroup viewGroup = (ViewGroup) p(R.id.inter_native_ad_view);
        this.D = viewGroup;
        if (viewGroup == null) {
            a("can not find ad root view.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public void i() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialPage", "performPause");
        t tVar = this.f68909a;
        if (tVar != null) {
            tVar.c();
        }
        if (al()) {
            h(true);
        } else {
            super.i();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public void l() {
        this.C = ((s) this.f68586y).H();
    }

    public abstract int n();
}
