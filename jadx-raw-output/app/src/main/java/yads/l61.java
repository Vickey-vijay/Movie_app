package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class l61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m61 f79707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f79708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ul3 f79709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oc1 f79710d;

    public l61(m61 m61Var, Handler handler, ul3 ul3Var, oc1 oc1Var) {
        this.f79707a = m61Var;
        this.f79708b = handler;
        this.f79709c = ul3Var;
        this.f79710d = oc1Var;
    }

    public /* synthetic */ l61(j52 j52Var, List list) {
        this(new m61(), new Handler(Looper.getMainLooper()), new ul3(), pc1.a(j52Var, list));
    }
}
