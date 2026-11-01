package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx0 f79868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p51 f79869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f79871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pl2 f79872e;

    public abstract String c();

    public abstract i30 d();

    public abstract pl2 e();

    public final pl2 f() {
        return this.f79872e;
    }

    public lo2(mx0 mx0Var, p51 p51Var, hx2 hx2Var, ArrayList arrayList) {
        ni.a(!p51Var.isEmpty());
        this.f79868a = mx0Var;
        this.f79869b = p51.a((Collection) p51Var);
        this.f79871d = Collections.unmodifiableList(arrayList);
        this.f79872e = hx2Var.a(this);
        this.f79870c = hx2Var.a();
    }
}
