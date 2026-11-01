package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class z30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f85185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo2 f85186b;

    public final void a(y30 y30Var) {
        this.f85186b.b(y30Var.f84804b, "log_type");
        co2 co2Var = co2.f76352c;
        fo2 fo2Var = this.f85186b;
        Map map = fo2Var.f77471a;
        this.f85185a.a(new eo2(CreativeInfo.f44317an, kotlin.collections.a.B(map), fo2Var.f77472b));
    }

    public z30(at1 at1Var, fo2 fo2Var) {
        this.f85185a = at1Var;
        this.f85186b = fo2Var;
    }
}
