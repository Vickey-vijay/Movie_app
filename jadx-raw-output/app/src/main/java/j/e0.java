package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainThirdBannerCallBack f61481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fl.j f61484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainThirdBannerCallBack f61485e;

    @Override // j.y1
    public final int getApiAdType() {
        return 30;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            byte b10 = -1;
            int iHashCode = strOptString.hashCode();
            if (iHashCode != 3809) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 1179703863 && strOptString.equals("applovin")) {
                        b10 = 1;
                    }
                } else if (strOptString.equals("admob")) {
                    b10 = 2;
                }
            } else if (strOptString.equals(Constant.platform)) {
                b10 = 0;
            }
            if (b10 == 0) {
                this.f61484d = new fl.i();
            } else if (b10 == 1) {
                this.f61484d = new fl.c();
            } else if (b10 == 2) {
                this.f61484d = new fl.n();
            } else if (TextUtils.isEmpty(strOptString2)) {
                this.f61484d = null;
            } else {
                this.f61484d = new fl.i();
            }
            fl.j jVar = this.f61484d;
            if (jVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61481a));
                return;
            }
            jVar.f61597r = this.IL1Iii;
            jVar.f61598s = this.LL1IL;
            jVar.p(jSONObject, 30, this.curAdType, this.adPlcID, this.f3381iILLL1);
            fl.j jVar2 = this.f61484d;
            jVar2.B = this.f61482b;
            jVar2.C = this.f61483c;
            k2 k2Var = new k2(this, jVar2, this.f61481a);
            jVar2.f61602w = k2Var;
            jVar2.l(getLoadTimeOut());
            this.f61484d.B(this.IL1Iii, k2Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61481a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        fl.j jVar = this.f61484d;
        return jVar != null ? jVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        return this.f61484d == null;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        fl.j jVar = this.f61484d;
        if (jVar != null) {
            return jVar.b();
        }
        return false;
    }

    public e0(Activity activity, String str, hl.i0 i0Var) {
        this.curAdType = "thirdBanner";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3375IL = 30;
        this.f61481a = i0Var;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61484d = null;
    }
}
