package yads;

import android.content.Context;
import java.util.UUID;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes6.dex */
public final class mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f80408b = kotlin.b.a(new lw0(this));

    public final Object a(String str, nw0 nw0Var) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(nw0Var), 1);
        cVar.J();
        hr hrVar = new hr(str, new jw0(cVar), new kw0(cVar));
        hrVar.f81496j = false;
        UUID uuidRandomUUID = UUID.randomUUID();
        hrVar.f81503q = uuidRandomUUID;
        ((cp2) this.f80408b.getValue()).a(hrVar);
        cVar.p(new iw0(this, uuidRandomUUID));
        Object objB = cVar.B();
        if (objB == sj.a.f()) {
            tj.f.c(nw0Var);
        }
        return objB;
    }

    public mw0(Context context) {
        this.f80407a = context;
    }
}
