package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainNativeAdCallBack f61638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l.r f61641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainNativeAdCallBack f61642e;

    @Override // j.y1
    public final int getApiAdType() {
        return 11;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    this.f61641d = new l.e0();
                    break;
                case "pangle":
                    this.f61641d = new l.m();
                    break;
                case "vungle":
                    this.f61641d = new l.z();
                    break;
                case "applovin":
                    this.f61641d = new l.l();
                    break;
                case "admob":
                    this.f61641d = new l.k();
                    break;
                case "mintegral":
                    this.f61641d = new l.i0();
                    break;
                case "facebook":
                    this.f61641d = new l.y();
                    break;
                case "bigo":
                    this.f61641d = new l.w();
                    break;
                case "inMobi":
                    this.f61641d = new l.t();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.f61641d = new l.e0();
                        break;
                    } else {
                        this.f61641d = null;
                        break;
                    }
                    break;
            }
            l.r rVar = this.f61641d;
            if (rVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61638a));
                return;
            }
            rVar.f61597r = this.IL1Iii;
            rVar.f61598s = this.LL1IL;
            rVar.p(jSONObject, 4, this.curAdType, this.adPlcID, this.f3381iILLL1);
            l.r rVar2 = this.f61641d;
            z zVar = new z(this, rVar2, this.f61638a);
            rVar2.l(getLoadTimeOut());
            l.r rVar3 = this.f61641d;
            rVar3.f61602w = zVar;
            rVar3.B(this.IL1Iii, this.f61639b, this.f61640c, zVar);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61638a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        l.r rVar = this.f61641d;
        return rVar != null ? rVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        l.r rVar = this.f61641d;
        if (rVar != null) {
            return rVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        l.r rVar = this.f61641d;
        if (rVar != null) {
            return rVar.b();
        }
        return false;
    }

    public s0(Activity activity, String str, hl.m mVar) {
        this.curAdType = "信息流";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f61638a = mVar;
        this.f3375IL = 4;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61641d = null;
    }
}
