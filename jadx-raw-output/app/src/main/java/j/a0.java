package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainInterstitialAdCallBack f61435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xe.i0 f61436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f61437c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MainInterstitialAdCallBack f61438d;

    @Override // j.y1
    public final int getApiAdType() {
        return 16;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        xe.i0 uVar;
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    uVar = new xe.u();
                    break;
                case "pangle":
                    uVar = new xe.z();
                    break;
                case "unity":
                    uVar = new xe.n();
                    break;
                case "vungle":
                    uVar = new xe.l();
                    break;
                case "applovin":
                    uVar = new xe.t();
                    break;
                case "admob":
                    uVar = new xe.j();
                    break;
                case "mintegral":
                    uVar = new xe.m();
                    break;
                case "facebook":
                    uVar = new xe.c0();
                    break;
                case "bigo":
                    uVar = new xe.g();
                    break;
                case "ironSource":
                    uVar = new xe.w();
                    break;
                case "inMobi":
                    uVar = new xe.v();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        uVar = new xe.u();
                        break;
                    } else {
                        uVar = null;
                        break;
                    }
                    break;
            }
            if (uVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61435a));
                return;
            }
            uVar.f61597r = this.IL1Iii;
            uVar.f61598s = this.LL1IL;
            uVar.p(jSONObject, 6, this.curAdType, this.adPlcID, this.f3381iILLL1);
            uVar.B = this.f61437c;
            p pVar = new p(this, uVar, this.f61435a);
            uVar.l(getLoadTimeOut());
            uVar.f61602w = pVar;
            uVar.B(this.IL1Iii, pVar);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61435a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        xe.i0 i0Var = this.f61436b;
        return i0Var != null ? i0Var.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        xe.i0 i0Var = this.f61436b;
        if (i0Var != null) {
            return i0Var.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        xe.i0 i0Var = this.f61436b;
        if (i0Var != null) {
            return i0Var.b();
        }
        return false;
    }

    public a0(Activity activity, String str, hl.u uVar) {
        this.curAdType = "插屏";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3375IL = 6;
        this.f61435a = uVar;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61436b = null;
    }

    @Override // j.y1
    public final void onAdBidLose() {
        super.onAdBidLose();
        xe.i0 i0Var = this.f61436b;
        if (i0Var != null) {
            i0Var.w();
        }
    }

    @Override // j.y1
    public final void onAdBidWin() {
        super.onAdBidWin();
        xe.i0 i0Var = this.f61436b;
        if (i0Var != null) {
            i0Var.u();
        }
    }
}
