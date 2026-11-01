package gl;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.net.NetRequest;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f53625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.d f53626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f53627c;

    public z0(a1 a1Var, s0 s0Var, i.d dVar) {
        this.f53627c = a1Var;
        this.f53625a = s0Var;
        this.f53626b = dVar;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (!TextUtils.isEmpty(str) && !NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1 b1VarA = b1.a(this.f53627c.f53449h);
            Context context = this.f53627c.f53449h;
            String str2 = Constant.commonApi;
            AdLog.d(b1VarA.f53457d, "setNewHost " + str2);
            LocalSaveUtil.put(context, b1VarA.f53459f, str2);
            s0 s0Var = this.f53625a;
            if (s0Var != null) {
                s0Var.a(str);
                return;
            }
            return;
        }
        if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            b1.a(this.f53627c.f53449h).c(new z(this));
        }
    }
}
