package gl;

import android.content.Context;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.net.TaskThreadPool;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.StringUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f53465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f53466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f53467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainInitSdkCallback f53468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f53469e;

    @Override // i.f
    public final void a(Object... objArr) {
        JSONObject jSONObject = (JSONObject) objArr[0];
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f53469e.f53445d);
            this.f53469e.getClass();
            sb2.append(a1.b(jSONObject));
            sb2.append(a1.f53440j);
            jSONObject.put("sign", StringUtil.encryptToMD5(sb2.toString()));
            TaskThreadPool.connect(this.f53465a, jSONObject, new c1(this));
        } catch (Exception e10) {
            String str = "reqInit error, msg = " + e10.getMessage();
            AdLog.ad(str);
            AdLog.e(str, e10);
            MainInitSdkCallback mainInitSdkCallback = this.f53468d;
            if (mainInitSdkCallback == null || this.f53467c) {
                return;
            }
            mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "init error, msg = " + e10.getMessage());
        }
    }

    public d(a1 a1Var, String str, Context context, boolean z10, MainInitSdkCallback mainInitSdkCallback) {
        this.f53469e = a1Var;
        this.f53465a = str;
        this.f53466b = context;
        this.f53467c = z10;
        this.f53468d = mainInitSdkCallback;
    }
}
