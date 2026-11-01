package j;

import android.app.Activity;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainMRECCallBack f61454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.j f61457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainMRECCallBack f61458e;

    @Override // j.y1
    public final int getApiAdType() {
        return 31;
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
                this.f61457d = new h.i();
            } else if (b10 == 1) {
                this.f61457d = new h.c();
            } else if (b10 == 2) {
                this.f61457d = new h.n();
            } else if (TextUtils.isEmpty(strOptString2)) {
                this.f61457d = null;
            } else {
                this.f61457d = new h.i();
            }
            h.j jVar = this.f61457d;
            if (jVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61454a));
                return;
            }
            jVar.f61597r = this.IL1Iii;
            jVar.f61598s = this.LL1IL;
            jVar.p(jSONObject, 31, this.curAdType, this.adPlcID, this.f3381iILLL1);
            h.j jVar2 = this.f61457d;
            jVar2.B = this.f61455b;
            jVar2.C = this.f61456c;
            z1 z1Var = new z1(this, jVar2, this.f61454a);
            jVar2.f61602w = z1Var;
            jVar2.l(getLoadTimeOut());
            this.f61457d.B(this.IL1Iii, z1Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61454a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        h.j jVar = this.f61457d;
        return jVar != null ? jVar.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        return this.f61457d == null;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        h.j jVar = this.f61457d;
        if (jVar != null) {
            return jVar.b();
        }
        return false;
    }

    public c0(Activity activity, String str, hl.e eVar) {
        this.curAdType = BrandSafetyUtils.f43552o;
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3375IL = 31;
        this.f61454a = eVar;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
        this.f61457d = null;
    }
}
