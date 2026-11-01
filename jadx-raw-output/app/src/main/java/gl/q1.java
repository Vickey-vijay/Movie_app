package gl;

import android.content.Context;
import com.yk.e.inf.IComCallback;
import com.yk.e.net.TaskThreadPool;
import com.yk.e.util.AdLog;
import com.yk.e.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f53582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f53584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IComCallback f53585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f53586e;

    @Override // i.f
    public final void a(Object... objArr) {
        JSONObject jSONObject = (JSONObject) objArr[0];
        try {
            jSONObject.put("adids", this.f53582a.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f53586e.f53445d);
            this.f53586e.getClass();
            sb2.append(a1.b(jSONObject));
            sb2.append(a1.f53440j);
            jSONObject.put("sign", StringUtil.encryptToMD5(sb2.toString()));
            TaskThreadPool.connect(this.f53583b, jSONObject, new d1(this));
        } catch (Exception e10) {
            String str = "reqTimer error, msg = " + e10.getMessage();
            AdLog.ad(str);
            AdLog.e(str, e10);
            this.f53585d.onFailed(-1, str);
        }
    }

    public q1(a1 a1Var, JSONArray jSONArray, String str, Context context, IComCallback iComCallback) {
        this.f53586e = a1Var;
        this.f53582a = jSONArray;
        this.f53583b = str;
        this.f53584c = context;
        this.f53585d = iComCallback;
    }
}
