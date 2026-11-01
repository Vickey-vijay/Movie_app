package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import yads.z82;

/* JADX INFO: loaded from: classes11.dex */
public final class z82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vq1 f85242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f85243b;

    public /* synthetic */ z82(xo1 xo1Var) {
        this(new vq1(xo1Var));
    }

    public final Object a(Context context, a03 a03Var, List list, rj.c cVar) {
        final ArrayList arrayList = new ArrayList(list.size());
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        ep epVar = new ep();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f85242a.a(context, a03Var, (qq1) it.next(), epVar, new tq1() { // from class: cp.wc
                @Override // yads.tq1
                public final void a(JSONObject jSONObject) {
                    z82.a(this.f51670a, countDownLatch, arrayList, jSONObject);
                }
            });
        }
        return nk.h.g(nk.w0.b(), new y82(this, countDownLatch, arrayList, epVar, null), cVar);
    }

    public z82(vq1 vq1Var) {
        this.f85242a = vq1Var;
        this.f85243b = new Object();
    }

    public static final void a(z82 z82Var, CountDownLatch countDownLatch, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (z82Var.f85243b) {
                arrayList.add(jSONObject);
            }
        }
        countDownLatch.countDown();
    }
}
