package gl;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.util.AdLog;
import com.yk.e.util.LocalSaveUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f53523b;

    public j1(Context context, s sVar) {
        this.f53522a = context;
        this.f53523b = sVar;
    }

    @Override // gl.r
    public final void a(String str) {
        AdLog.i("gpAdid " + str);
        if (TextUtils.isEmpty(str)) {
            str = u1.b();
        }
        LocalSaveUtil.put(this.f53522a, "DeviceGPADID", str);
        r rVar = this.f53523b;
        if (rVar != null) {
            rVar.a(str);
        }
    }
}
