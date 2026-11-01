package h;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;
import gl.r0;
import j.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends j {
    public MainMRECCallBack F;
    public MaxAdView G;
    public MaxAd H;
    public final String E = "MaxMREC";
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public String L = "";

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    @Override // h.j
    public final void B(Activity activity, z1 z1Var) {
        int i10;
        int i11;
        try {
            this.L = this.f61590k.f54038c;
            this.F = z1Var;
            View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_banner_applovin"), (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_applovin_banner_root_rl"));
            MaxAdView maxAdView = new MaxAdView(this.L, MaxAdFormat.MREC, activity);
            this.G = maxAdView;
            maxAdView.setListener(new o(this, viewInflate));
            this.G.setRevenueListener(new l());
            int iDpToPx = AppLovinSdkUtils.dpToPx(activity, com.safedk.android.internal.d.f44769a);
            int iDpToPx2 = AppLovinSdkUtils.dpToPx(activity, 250);
            this.G.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            i.e eVar = this.f61590k;
            if (eVar == null || (i10 = eVar.f54039d) == 0) {
                i10 = 1000;
            }
            if (eVar == null || (i11 = eVar.f54040e) == 0) {
                i11 = 570;
            }
            E(activity, i10, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.width = this.B;
            layoutParams.height = this.C;
            viewInflate.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpToPx, iDpToPx2);
            layoutParams2.gravity = 17;
            this.G.setLayoutParams(layoutParams2);
            linearLayout.addView(this.G);
            if (this.f61590k.f54043h.equals("0") && this.G != null) {
                AdLog.d(this.E, "stopAutoRefresh");
                this.G.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
                this.G.stopAutoRefresh();
            }
            if (!this.D && this.G != null) {
                AdLog.d(this.E, "stopAutoRefresh");
                this.G.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
                this.G.stopAutoRefresh();
            }
            this.G.loadAd();
            gl.a aVar = new gl.a((int) (this.f61603x / 1000), new h(this));
            aVar.f53435c.post(aVar.f53436d);
            Constant.addFragmentListener(activity, new k(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // h.j
    public final void C() {
        MainMRECCallBack mainMRECCallBack = this.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdShow(r0.b(this.H, this.f61585f));
        }
    }

    @Override // h.j
    public final void D() {
        AdLog.d(this.E, "resAutoRefresh");
        if (!this.f61590k.f54043h.equals("1") || this.G == null) {
            return;
        }
        AdLog.d(this.E, "startAutoRefresh");
        this.G.startAutoRefresh();
    }

    public final void E(Activity activity, int i10, int i11) {
        int i12 = this.B;
        if (i12 == 0) {
            this.B = (this.C * i10) / i11;
        } else {
            int i13 = this.C;
            if (i13 == 0) {
                this.C = (i12 * i11) / i10;
            } else {
                this.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.B == 0 && this.C == 0) {
            this.B = screenWidth;
            this.C = (i11 * screenWidth) / i10;
        }
        if (this.B >= screenWidth) {
            this.B = screenWidth;
            this.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.C >= screenHeight) {
            this.C = screenHeight;
            this.B = (i10 * screenHeight) / i11;
        }
        AdLog.d(this.E, "expressWidth " + this.B);
        AdLog.d(this.E, "expressHeight " + this.C);
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.I || this.J) {
            return;
        }
        this.J = true;
        super.v(str);
    }
}
