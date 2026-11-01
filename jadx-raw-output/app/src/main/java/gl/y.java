package gl;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.net.NetRequest;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.ErrMsgParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LocalSaveUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrMsgParams f53613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f53614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f53615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f53616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f53617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f53618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f53619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f53620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f53621j;

    public y(a1 a1Var, Context context, ErrMsgParams errMsgParams, boolean z10, s0 s0Var, String str, int i10, String str2, int i11, String str3) {
        this.f53621j = a1Var;
        this.f53612a = context;
        this.f53613b = errMsgParams;
        this.f53614c = z10;
        this.f53615d = s0Var;
        this.f53616e = str;
        this.f53617f = i10;
        this.f53618g = str2;
        this.f53619h = i11;
        this.f53620i = str3;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (!TextUtils.isEmpty(str) && !NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1 b1VarA = b1.a(this.f53612a);
            Context context = this.f53612a;
            String str2 = Constant.commonApi;
            AdLog.d(b1VarA.f53457d, "setNewHost " + str2);
            LocalSaveUtil.put(context, b1VarA.f53459f, str2);
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f53613b.setRepData(jSONObject.toString());
                int iOptInt = jSONObject.optInt("status");
                this.f53621j.getClass();
                if (iOptInt == 1001) {
                    if (!this.f53614c) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                        this.f53615d.a(Integer.valueOf(jSONObjectOptJSONObject.optInt("loadNumber", 1)), jSONObjectOptJSONObject.optJSONArray("adList"), Integer.valueOf(jSONObjectOptJSONObject.optInt("biddingTime", 1)), Integer.valueOf(jSONObjectOptJSONObject.optInt(com.ironsource.mediationsdk.d.f29596h, 1)), jSONObjectOptJSONObject.optJSONArray("bottomAdList"));
                    }
                } else {
                    String strOptString = jSONObject.optString("info");
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = "sdk api error";
                    }
                    AdLog.e(strOptString);
                    this.f53621j.f(this.f53612a, this.f53616e, "", strOptString, "0", "0", null);
                    if (!this.f53614c) {
                        this.f53615d.b(AdSdkStateCode.API_REQUEST_ERROR, strOptString);
                    }
                }
                s1 s1VarA = s1.a();
                Context context2 = this.f53612a;
                int i10 = this.f53617f;
                String str3 = this.f53616e;
                s1VarA.getClass();
                s1VarA.d(context2, String.format(Constant.fileApiCache, Integer.valueOf(i10)), str3, jSONObject);
                return;
            } catch (Exception e10) {
                String str4 = IDUtil.getString(this.f53612a, "main_load_fail") + ", msg = " + e10.getMessage();
                if (!this.f53614c) {
                    this.f53615d.b(AdSdkStateCode.API_PARSE_FAILED, str4);
                }
                AdLog.ad(str4);
                AdLog.e(e10.getMessage(), e10);
                this.f53621j.f(this.f53612a, this.f53616e, "", str4, "0", "0", null);
                return;
            }
        }
        if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1.a(this.f53612a).c(new t(this));
            return;
        }
        String string = IDUtil.getString(this.f53612a, "main_load_data_fail");
        if (!this.f53614c) {
            this.f53615d.b(AdSdkStateCode.API_REQUEST_FAILED, string);
        }
        this.f53621j.f(this.f53612a, this.f53616e, "", string + ", msg = 网络错误", "0", "0", null);
    }
}
