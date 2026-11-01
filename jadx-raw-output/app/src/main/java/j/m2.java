package j;

import android.app.Activity;
import android.text.TextUtils;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.object.WorldNativeLyParams;
import com.yk.e.object.WorldNativeTagParams;
import com.yk.e.object.WorldNativeTvParams;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainWdNativeAdCallback f61567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.c0 f61568b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f61570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MainWdNativeAdCallback f61571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorldNativeTvParams f61572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WorldNativeTvParams f61573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WorldNativeTvParams f61574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WorldNativeImgParams f61575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WorldNativeLyParams f61576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorldNativeLyParams f61577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WorldNativeLyParams f61578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WorldNativeTagParams f61579m;

    @Override // j.y1
    public final int getApiAdType() {
        return 29;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            String strOptString2 = jSONObject.optString("offline_adv");
            switch (strOptString) {
                case "wx":
                    this.f61568b = new e.a();
                    break;
                case "pangle":
                    this.f61568b = new e.h0();
                    break;
                case "vungle":
                    this.f61568b = new e.u();
                    break;
                case "applovin":
                    this.f61568b = new e.p();
                    break;
                case "admob":
                    this.f61568b = new e.b0();
                    break;
                case "mintegral":
                    this.f61568b = new e.q();
                    break;
                case "facebook":
                    this.f61568b = new e.r();
                    break;
                case "bigo":
                    this.f61568b = new e.h();
                    break;
                case "inMobi":
                    this.f61568b = new e.s();
                    break;
                default:
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.f61568b = new e.a();
                        break;
                    } else {
                        this.f61568b = null;
                        break;
                    }
                    break;
            }
            e.c0 c0Var = this.f61568b;
            if (c0Var == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f61567a));
                return;
            }
            c0Var.f61597r = this.IL1Iii;
            c0Var.f61598s = this.LL1IL;
            c0Var.p(jSONObject, 29, this.curAdType, this.adPlcID, this.f3381iILLL1);
            e.c0 c0Var2 = this.f61568b;
            c0Var2.B = this.f61569c;
            c0Var2.C = this.f61570d;
            c0Var2.I = this.f61577k;
            c0Var2.K = this.f61579m;
            c0Var2.J = this.f61578l;
            c0Var2.H = this.f61576j;
            c0Var2.F = this.f61574h;
            c0Var2.G = this.f61575i;
            c0Var2.E = this.f61573g;
            c0Var2.D = this.f61572f;
            d0 d0Var = new d0(this, c0Var2, this.f61567a);
            c0Var2.l(getLoadTimeOut());
            e.c0 c0Var3 = this.f61568b;
            c0Var3.f61602w = d0Var;
            c0Var3.B(this.IL1Iii, d0Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f61567a));
        }
    }

    @Override // j.y1
    public final String getSubPlatform() {
        e.c0 c0Var = this.f61568b;
        return c0Var != null ? c0Var.c() : "";
    }

    @Override // j.y1
    public final boolean isExpired() {
        e.c0 c0Var = this.f61568b;
        if (c0Var != null) {
            return c0Var.t();
        }
        return true;
    }

    @Override // j.y1
    public final boolean isSupportAdCache() {
        e.c0 c0Var = this.f61568b;
        if (c0Var != null) {
            return c0Var.b();
        }
        return false;
    }

    public m2(Activity activity, String str, hl.p pVar) {
        this.curAdType = "wdNative";
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3375IL = 29;
        this.f61567a = pVar;
    }

    @Override // j.y1
    public final void loadAd() {
        super.loadAd();
    }
}
