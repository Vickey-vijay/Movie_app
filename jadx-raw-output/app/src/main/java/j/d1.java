package j;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f61473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainSplashAdCallBack f61474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k.t0 f61475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f61476d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainSplashAdCallBack f61477e;

    @Override // j.y1
    public final int getApiAdType() {
        return 13;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    this.f61475c = new k.x();
                    break;
                case "pangle":
                    this.f61475c = new k.q0();
                    break;
                case "unity":
                    this.f61475c = new k.h();
                    break;
                case "vungle":
                    this.f61475c = new k.a0();
                    break;
                case "applovin":
                    this.f61475c = new k.y();
                    break;
                case "admob":
                    this.f61475c = new k.m();
                    break;
                case "mintegral":
                    this.f61475c = new k.z0();
                    break;
                case "facebook":
                    this.f61475c = new k.l0();
                    break;
                case "bigo":
                    this.f61475c = new k.k();
                    break;
                case "ironSource":
                    this.f61475c = new k.f0();
                    break;
                case "inMobi":
                    this.f61475c = new k.c0();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.f61475c = new k.x();
                        break;
                    } else {
                        this.f61475c = null;
                        break;
                    }
                    break;
            }
            k.t0 t0Var = this.f61475c;
            if (t0Var == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61474b));
                return;
            }
            t0Var.f61597r = this.IL1Iii;
            t0Var.f61598s = this.LL1IL;
            t0Var.p(jSONObject, 1, this.curAdType, this.adPlcID, this.f3381iILLL1);
            k.t0 t0Var2 = this.f61475c;
            t0Var2.B = this.f61476d;
            e2 e2Var = new e2(this, t0Var2, this.f61474b);
            t0Var2.l(getLoadTimeOut());
            k.t0 t0Var3 = this.f61475c;
            t0Var3.f61602w = e2Var;
            t0Var3.B(this.IL1Iii, this.f61473a, e2Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61474b));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        k.t0 t0Var = this.f61475c;
        return t0Var != null ? t0Var.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        k.t0 t0Var = this.f61475c;
        if (t0Var != null) {
            return t0Var.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        k.t0 t0Var = this.f61475c;
        if (t0Var != null) {
            return t0Var instanceof f.z;
        }
        return false;
    }

    public d1(Activity activity, String str, ViewGroup viewGroup, hl.r rVar) {
        this.curAdType = "开屏";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f61473a = viewGroup;
        this.f61474b = rVar;
        this.f3375IL = 1;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61475c = null;
    }

    @Override // j.y1
    public final void onAdBidLose() {
        super.onAdBidLose();
        k.t0 t0Var = this.f61475c;
        if (t0Var != null) {
            t0Var.w();
        }
    }

    @Override // j.y1
    public final void onAdBidWin() {
        super.onAdBidWin();
        k.t0 t0Var = this.f61475c;
        if (t0Var != null) {
            t0Var.u();
        }
    }
}
