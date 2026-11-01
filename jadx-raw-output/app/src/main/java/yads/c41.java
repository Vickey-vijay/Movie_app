package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class c41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f76154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u82 f76155b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c41(Context context) {
        w82 w82VarA = w82.f84125d.a(context);
        this(w82VarA.b(), w82VarA.c());
    }

    public final void a(Set set, d51 d51Var) {
        if (set.isEmpty()) {
            d51Var.a(kotlin.collections.a.j());
        } else {
            new y31(this.f76154a, set, d51Var, new Handler(Looper.getMainLooper()), new AtomicInteger(set.size()), new js1()).a();
        }
    }

    public c41(k41 k41Var, u82 u82Var) {
        this.f76154a = k41Var;
        this.f76155b = u82Var;
    }
}
