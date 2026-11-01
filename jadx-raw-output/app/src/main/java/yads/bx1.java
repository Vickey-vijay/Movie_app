package yads;

import android.content.Context;
import com.safedk.android.analytics.events.base.StatsEvent;

/* JADX INFO: loaded from: classes11.dex */
public final class bx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f76002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final at1 f76003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f76004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76006e;

    public final void a(String str) {
        co2 co2Var = co2.f76352c;
        this.f76003b.a(new eo2("multibanner_event", kotlin.collections.a.B(kotlin.collections.a.l(mj.h.a(StatsEvent.f44666z, str))), this.f76002a.f83817i));
    }

    public bx1(Context context, v9 v9Var, lu2 lu2Var) {
        this.f76002a = v9Var;
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        this.f76003b = cf.a(context, iu3Var.b());
        this.f76004c = true;
        this.f76005d = true;
        this.f76006e = true;
    }
}
