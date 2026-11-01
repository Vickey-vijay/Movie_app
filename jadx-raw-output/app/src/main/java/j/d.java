package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainMaterialCallback f61463a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f61466d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MainMaterialCallback f61469g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dp.u f61464b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f61467e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f61468f = false;

    @Override // j.y1
    public final int getApiAdType() {
        return 28;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    this.f61464b = new dp.n();
                    break;
                case "pangle":
                    this.f61464b = new dp.b0();
                    break;
                case "vungle":
                    this.f61464b = new dp.e();
                    break;
                case "admob":
                    this.f61464b = new dp.a0();
                    break;
                case "applovin":
                    this.f61464b = new dp.g();
                    break;
                case "mintegral":
                    this.f61464b = new dp.v();
                    break;
                case "facebook":
                    this.f61464b = new dp.m0();
                    break;
                case "bigo":
                    this.f61464b = new dp.i0();
                    break;
                case "inMobi":
                    this.f61464b = new dp.a();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.f61464b = new dp.n();
                        break;
                    } else {
                        this.f61464b = null;
                        break;
                    }
                    break;
            }
            dp.u uVar = this.f61464b;
            if (uVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61463a));
                return;
            }
            uVar.f61597r = this.IL1Iii;
            uVar.f61598s = this.LL1IL;
            uVar.p(jSONObject, 28, this.curAdType, this.adPlcID, this.f3381iILLL1);
            dp.u uVar2 = this.f61464b;
            uVar2.B = this.f61465c;
            uVar2.C = this.f61466d;
            uVar2.D = this.f61467e;
            uVar2.E = this.f61468f;
            l1 l1Var = new l1(this, uVar2, this.f61463a);
            uVar2.l(getLoadTimeOut());
            dp.u uVar3 = this.f61464b;
            uVar3.f61602w = l1Var;
            uVar3.B(this.IL1Iii, l1Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61463a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        dp.u uVar = this.f61464b;
        return uVar != null ? uVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        dp.u uVar = this.f61464b;
        if (uVar != null) {
            return uVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        dp.u uVar = this.f61464b;
        if (uVar != null) {
            return uVar.b();
        }
        return false;
    }

    public d(Activity activity, String str, hl.s sVar) {
        this.curAdType = "pauseInterstitial";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3375IL = 28;
        this.f61463a = sVar;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61464b = null;
    }
}
