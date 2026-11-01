package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f61497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f61498c;

    public g0(y0 y0Var, Object[] objArr) {
        this.f61498c = y0Var;
        this.f61497b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = this.f61497b;
        String strOptString = "";
        if (objArr.length > 0) {
            j1 j1Var = this.f61498c.f61670a.f61452c;
            String str = (String) objArr[0];
            j1Var.getClass();
            try {
                strOptString = new JSONObject(str).optString("info", "");
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f61498c.f61670a.f61451b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onReward(strOptString);
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f61498c.f61670a.f61452c.f61525f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onReward(strOptString);
        }
    }
}
