package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh3 f84224a;

    public wj3(Context context) {
        this.f84224a = new mh3(context);
    }

    public final void a(vj3 vj3Var, String str) {
        List list = (List) vj3Var.a().get(str);
        if (list != null) {
            this.f84224a.a(list, kotlin.collections.a.j());
        }
    }
}
