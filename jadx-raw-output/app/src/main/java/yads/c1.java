package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f76080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f76081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f76082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sx f76083d;

    public /* synthetic */ c1(at1 at1Var, d4 d4Var, v9 v9Var) {
        this(at1Var, d4Var, v9Var, new sx());
    }

    public final void a(String str) {
        Object obj;
        fo2 fo2VarA = this.f76083d.a(this.f76082c, this.f76081b);
        yf2 yf2Var = (yf2) ag2.f75513a.getValue();
        if (yf2Var != null) {
            int iOrdinal = yf2Var.ordinal();
            if (iOrdinal == 0) {
                obj = PluginErrorDetails.Platform.FLUTTER;
            } else if (iOrdinal == 1) {
                obj = "react-native";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = "unity";
            }
        } else {
            obj = fo2VarA.f77471a.get("plugin_type");
        }
        co2 co2Var = co2.f76352c;
        this.f76080a.a(new eo2("activity_action", kotlin.collections.a.B(kotlin.collections.a.q(fo2VarA.f77471a, kotlin.collections.a.m(mj.h.a("activity_event", str), mj.h.a("plugin_type", obj)))), fo2VarA.f77472b));
    }

    public final void b() {
        a("on_resume");
    }

    public c1(at1 at1Var, d4 d4Var, v9 v9Var, sx sxVar) {
        this.f76080a = at1Var;
        this.f76081b = d4Var;
        this.f76082c = v9Var;
        this.f76083d = sxVar;
    }

    public final void a() {
        a("on_pause");
    }
}
