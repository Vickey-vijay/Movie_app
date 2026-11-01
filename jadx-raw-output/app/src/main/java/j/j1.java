package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainRewardVideoAdCallBack f61520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f f61521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61522c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61523d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f61524e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MainRewardVideoAdCallBack f61525f;

    @Override // j.y1
    public final int getApiAdType() {
        return 14;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        c.f vVar;
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    vVar = new c.v();
                    break;
                case "pangle":
                    vVar = new c.t();
                    break;
                case "unity":
                    vVar = new c.z();
                    break;
                case "vungle":
                    vVar = new c.d();
                    break;
                case "applovin":
                    vVar = new c.k0();
                    break;
                case "admob":
                    vVar = new c.i0();
                    break;
                case "mintegral":
                    vVar = new c.m();
                    break;
                case "facebook":
                    vVar = new c.w();
                    break;
                case "bigo":
                    vVar = new c.p();
                    break;
                case "ironSource":
                    vVar = new c.b();
                    break;
                case "inMobi":
                    vVar = new c.x();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        vVar = new c.v();
                        break;
                    } else {
                        vVar = null;
                        break;
                    }
                    break;
            }
            if (vVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61520a));
                return;
            }
            vVar.f61597r = this.IL1Iii;
            vVar.f61598s = this.LL1IL;
            vVar.p(jSONObject, 3, this.curAdType, this.adPlcID, this.f3381iILLL1);
            vVar.f61595p = this.f61523d;
            vVar.f61596q = this.f61524e;
            b2 b2Var = new b2(this, vVar, this.f61520a);
            vVar.l(getLoadTimeOut());
            vVar.f61602w = b2Var;
            vVar.B(this.IL1Iii, this.f61522c, b2Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61520a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        c.f fVar = this.f61521b;
        return fVar != null ? fVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        c.f fVar = this.f61521b;
        if (fVar != null) {
            return fVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        c.f fVar = this.f61521b;
        if (fVar != null) {
            return fVar.b();
        }
        return false;
    }

    public j1(Activity activity, String str, hl.a aVar) {
        this.curAdType = "激励视频";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f61520a = aVar;
        this.f3375IL = 3;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61521b = null;
    }

    @Override // j.y1
    public final void onAdBidLose() {
        super.onAdBidLose();
        c.f fVar = this.f61521b;
        if (fVar != null) {
            fVar.w();
        }
    }

    @Override // j.y1
    public final void onAdBidWin() {
        super.onAdBidWin();
        c.f fVar = this.f61521b;
        if (fVar != null) {
            fVar.u();
        }
    }
}
