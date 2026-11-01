package gl;

import android.content.Context;
import com.yk.e.inf.IComCallback;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f53611a;

    public x0(d1 d1Var) {
        this.f53611a = d1Var;
    }

    @Override // gl.i1
    public final void b() {
        q1 q1Var = this.f53611a.f53473a;
        a1 a1Var = q1Var.f53586e;
        Context context = q1Var.f53584c;
        String str = q1Var.f53583b;
        JSONArray jSONArray = q1Var.f53582a;
        IComCallback iComCallback = q1Var.f53585d;
        a1Var.getClass();
        new Thread(new r1(new n(context, new q1(a1Var, jSONArray, str, context, iComCallback)))).start();
    }
}
