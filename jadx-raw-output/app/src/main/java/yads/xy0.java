package yads;

import android.content.Context;
import android.location.Location;

/* JADX INFO: loaded from: classes11.dex */
public final class xy0 implements ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh1 f84745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84746b;

    public /* synthetic */ xy0(Context context, String str) {
        this(new hh1(context, str));
    }

    @Override // yads.ch1
    public final Location a() {
        Location location;
        synchronized (this.f84746b) {
            hh1 hh1Var = this.f84745a;
            gh1 gh1VarA = hh1Var.f78237c;
            if (gh1VarA == null) {
                gh1VarA = hh1Var.a();
            }
            location = null;
            if (gh1VarA != null) {
                Object objA = om2.a(gh1VarA.f77803a, "isComplete", new Object[0]);
                Boolean bool = objA instanceof Boolean ? (Boolean) objA : null;
                if (bool != null && bool.booleanValue()) {
                    Object objA2 = om2.a(gh1VarA.f77803a, "getResult", new Object[0]);
                    location = objA2 instanceof Location ? (Location) objA2 : null;
                    hh1 hh1Var2 = this.f84745a;
                    hh1Var2.f78237c = hh1Var2.a();
                    hh1Var2.f78237c = hh1Var2.a();
                }
            }
        }
        return location;
    }

    public xy0(hh1 hh1Var) {
        this.f84745a = hh1Var;
        this.f84746b = new Object();
    }
}
