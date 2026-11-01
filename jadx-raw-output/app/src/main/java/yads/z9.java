package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes11.dex */
public final class z9 implements f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f85251b = {ck.s.f(new MutablePropertyReference1Impl(z9.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f85252a = mm2.a(null);

    @Override // yads.f4
    public final void a(int i10, Bundle bundle) {
        lm2 lm2Var = this.f85252a;
        jk.k kVar = f85251b[0];
        f4 f4Var = (f4) lm2Var.f79854a.get();
        if (f4Var != null) {
            f4Var.a(i10, bundle);
            boolean z10 = ad1.f75480a;
        }
    }

    public final void a(f4 f4Var) {
        lm2 lm2Var = this.f85252a;
        jk.k kVar = f85251b[0];
        lm2Var.getClass();
        lm2Var.f79854a = new WeakReference(f4Var);
    }
}
