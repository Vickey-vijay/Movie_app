package gl;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.net.NetRequest;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f53464a;

    public c1(d dVar) {
        this.f53464a = dVar;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (!TextUtils.isEmpty(str) && !NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1 b1VarA = b1.a(this.f53464a.f53466b);
            Context context = this.f53464a.f53466b;
            String str2 = Constant.commonApi;
            AdLog.d(b1VarA.f53457d, "setNewHost " + str2);
            LocalSaveUtil.put(context, b1VarA.f53459f, str2);
            d dVar = this.f53464a;
            if (!dVar.f53467c) {
                dVar.f53469e.i(str, dVar.f53466b, true, dVar.f53468d);
            }
            s1 s1VarA = s1.a();
            d dVar2 = this.f53464a;
            Context context2 = dVar2.f53466b;
            dVar2.f53469e.getClass();
            this.f53464a.f53469e.getClass();
            s1VarA.getClass();
            try {
                s1VarA.d(context2, String.format(Constant.fileApiCache, 9999), "1", new JSONObject(str));
                return;
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                return;
            }
        }
        if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1.a(this.f53464a.f53466b).c(new h1(this));
            return;
        }
        d dVar3 = this.f53464a;
        MainInitSdkCallback mainInitSdkCallback = dVar3.f53468d;
        if (mainInitSdkCallback != null && !dVar3.f53467c) {
            mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "请求初始化接口失败, msg = 网络错误");
        }
    }
}
