package gl;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.yk.e.AbstractC4043il;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f53543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.e f53546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f53551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w0 f53552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d.d f53553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f53554l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f53557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MaxNativeAdLoader f53558p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MaxAd f53560r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f53565w;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f53555m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f53556n = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53559q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f53561s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f53562t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f53563u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f53564v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l0 f53566x = new l0(this);

    public static d.d a(n0 n0Var) {
        int i10;
        int i11;
        i.e eVar;
        i.e eVar2;
        boolean z10 = n0Var.f53556n;
        if (z10 || (eVar2 = n0Var.f53546d) == null || (i10 = eVar2.f54039d) == 0) {
            i10 = n0Var.f53547e;
        }
        int i12 = i10;
        if (z10 || (eVar = n0Var.f53546d) == null || (i11 = eVar.f54040e) == 0) {
            i11 = n0Var.f53548f;
        }
        Activity activity = n0Var.f53543a;
        d.d dVar = new d.d(activity, i12, i11, n0Var.f53549g, n0Var.f53550h);
        n0Var.f53553k = dVar;
        View.OnClickListener onClickListener = n0Var.f53554l;
        if (onClickListener != null) {
            MaxNativeAdView maxNativeAdView = dVar.f51760b;
            if (maxNativeAdView == null) {
                AdLog.e("ApplovinNativeView", "setCloseImageViewClickListener maxNativeAdView is null");
            } else {
                ImageView imageView = (ImageView) maxNativeAdView.findViewById(IDUtil.getViewID(activity, "main_al_native_im_close"));
                if (imageView != null) {
                    imageView.setOnClickListener(onClickListener);
                }
            }
        }
        if (n0Var.f53555m) {
            d.d dVar2 = n0Var.f53553k;
            MaxNativeAdView maxNativeAdView2 = dVar2.f51760b;
            if (maxNativeAdView2 == null) {
                AdLog.e("ApplovinNativeView", "showCloseImageView maxNativeAdView is null");
            } else {
                ImageView imageView2 = (ImageView) maxNativeAdView2.findViewById(IDUtil.getViewID(dVar2.f51759a, "main_al_native_im_close"));
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
        }
        return n0Var.f53553k;
    }

    public final void b(Activity activity) {
        d("unitID " + this.f53565w);
        AbstractC4043il.ILil(activity.getApplicationContext(), new j(this, activity));
        if (this.f53564v) {
            d("refreshAdCache, do not turn on the countdown");
        } else {
            new Handler().postDelayed(new n1(this), this.f53551i);
        }
        Constant.addFragmentListener(activity, new p0(this));
    }

    public final void d(String str) {
        AdLog.i("OktMaxNative", "adType = " + this.f53545c + ", adPlcID = " + this.f53544b + ", msg = " + str);
    }

    public n0(Activity activity, String str, String str2, String str3, i.e eVar, long j10, u uVar) {
        this.f53544b = "";
        this.f53545c = "";
        this.f53565w = "";
        this.f53543a = activity;
        this.f53545c = str;
        this.f53544b = str2;
        this.f53565w = str3;
        this.f53546d = eVar;
        this.f53551i = j10;
        this.f53557o = uVar;
    }

    public static void c(n0 n0Var, String str) {
        n0Var.getClass();
        n0Var.d("onThirdAdLoadFailed4Render, msg = " + str);
        if (!n0Var.f53562t && !n0Var.f53563u) {
            n0Var.f53562t = true;
            w0 w0Var = n0Var.f53552j;
            if (w0Var != null) {
                w0Var.a(str);
            }
        }
    }
}
