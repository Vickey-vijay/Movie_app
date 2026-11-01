package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainBannerCallBack f61444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.x f61447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainBannerCallBack f61448e;

    @Override // j.y1
    public final int getApiAdType() {
        return 18;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    this.f61447d = new f.g();
                    break;
                case "pangle":
                    this.f61447d = new f.s();
                    break;
                case "vungle":
                    this.f61447d = new f.i();
                    break;
                case "admob":
                    this.f61447d = new f.z();
                    break;
                case "applovin":
                    this.f61447d = new f.o();
                    break;
                case "mintegral":
                    this.f61447d = new f.q();
                    break;
                case "facebook":
                    this.f61447d = new f.f();
                    break;
                case "bigo":
                    this.f61447d = new f.f0();
                    break;
                case "inMobi":
                    this.f61447d = new f.j();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.f61447d = new f.g();
                        break;
                    } else {
                        this.f61447d = null;
                        break;
                    }
                    break;
            }
            f.x xVar = this.f61447d;
            if (xVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61444a));
                return;
            }
            xVar.f61597r = this.IL1Iii;
            xVar.f61598s = this.LL1IL;
            xVar.p(jSONObject, 7, this.curAdType, this.adPlcID, this.f3381iILLL1);
            f.x xVar2 = this.f61447d;
            xVar2.B = this.f61445b;
            xVar2.C = this.f61446c;
            p1 p1Var = new p1(this, xVar2, this.f61444a);
            xVar2.f61602w = p1Var;
            xVar2.l(getLoadTimeOut());
            this.f61447d.B(this.IL1Iii, p1Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61444a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        f.x xVar = this.f61447d;
        return xVar != null ? xVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        f.x xVar = this.f61447d;
        if (xVar != null) {
            return xVar.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        f.x xVar = this.f61447d;
        if (xVar != null) {
            return xVar.b();
        }
        return false;
    }

    public b0(Activity activity, String str, hl.f fVar) {
        this.curAdType = "banner";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3375IL = 7;
        this.f61444a = fVar;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61447d = null;
    }
}
