package gl;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.inf.IComCallback;
import com.yk.e.net.NetRequest;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IComCallback f53581b;

    public q0(Context context, o0 o0Var) {
        this.f53580a = context;
        this.f53581b = o0Var;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (!TextUtils.isEmpty(str) && !NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1 b1VarA = b1.a(this.f53580a);
            Context context = this.f53580a;
            String str2 = Constant.commonApi;
            AdLog.d(b1VarA.f53457d, "setNewHost " + str2);
            LocalSaveUtil.put(context, b1VarA.f53459f, str2);
            IComCallback iComCallback = this.f53581b;
            if (iComCallback != null) {
                iComCallback.onSuccess();
                return;
            }
            return;
        }
        IComCallback iComCallback2 = this.f53581b;
        if (iComCallback2 != null) {
            iComCallback2.onFailed(-1, "send collectLog failed, net error");
        }
    }
}
