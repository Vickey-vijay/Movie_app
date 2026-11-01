package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class i53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f78498b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f78499a;

    public final h53 a(int i10, Object obj) {
        h53 h53VarA = a();
        h53VarA.f78073a = this.f78499a.obtainMessage(i10, obj);
        return h53VarA;
    }

    public i53(Handler handler) {
        this.f78499a = handler;
    }

    public static h53 a() {
        h53 h53Var;
        ArrayList arrayList = f78498b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                h53Var = new h53();
            } else {
                h53Var = (h53) arrayList.remove(arrayList.size() - 1);
            }
        }
        return h53Var;
    }
}
