package fl;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdView;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import j.k2;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends j {
    public MainThirdBannerCallBack F;
    public AdView G;
    public View H;
    public final String E = "AdmobThirdBanner";
    public final AdInfo I = new AdInfo();
    public boolean J = false;
    public String K = "";
    public final g L = new g(this);

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    @Override // fl.j
    public final void B(Activity activity, k2 k2Var) {
        try {
            this.F = k2Var;
            this.K = this.f61590k.f54038c;
            View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_banner_admob"), (ViewGroup) null);
            this.H = viewInflate;
            AbstractC4043il.IL1Iii(activity, new b(this, activity, (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_admob_banner_root_rl"))));
            Constant.addFragmentListener(activity, new d(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.J) {
            return;
        }
        super.v(str);
    }

    public static String E(n nVar, AdView adView) {
        nVar.getClass();
        try {
            if (adView.getResponseInfo() != null && adView.getResponseInfo().getLoadedAdapterResponseInfo() != null) {
                return adView.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return "admob";
    }
}
