package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class nm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f80707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f80708b;

    public /* synthetic */ nm2(Context context) {
        this(context, new lg0());
    }

    public final ll1 a() {
        return kg0.f79409d == this.f80707a.a(this.f80708b) ? new ll1(1920, 1080, 6800) : new ll1(854, 480, 1000);
    }

    public nm2(Context context, lg0 lg0Var) {
        this.f80707a = lg0Var;
        this.f80708b = context.getApplicationContext();
    }
}
