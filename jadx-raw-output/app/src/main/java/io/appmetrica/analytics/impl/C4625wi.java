package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4625wi extends C4381mn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RunnableC4600vi f57892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f57893e;

    @Override // io.appmetrica.analytics.impl.C4381mn
    public final void a() {
        this.f57893e.remove(this.f57892d);
    }

    @Override // io.appmetrica.analytics.impl.C4381mn
    public final void f() {
        this.f57294b.a();
        C4350lh c4350lh = (C4350lh) ((Y4) this.f57293a).f56209k.a();
        if (c4350lh.f57207k.a(c4350lh.f57206j)) {
            String str = c4350lh.f57209m;
            if (TextUtils.isEmpty(str) || com.ironsource.Y1.f27894f.equals(str)) {
                return;
            }
            try {
                a(Wd.a((Y4) this.f57293a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C4381mn
    public final void g() {
        this.f57893e.executeDelayed(this.f57892d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f57295c.get()) {
            return;
        }
        this.f57893e.remove(this.f57892d);
        if (((C4350lh) ((Y4) this.f57293a).f56209k.a()).f57203g > 0) {
            this.f57893e.executeDelayed(this.f57892d, TimeUnit.SECONDS.toMillis(((C4350lh) ((Y4) this.f57293a).f56209k.a()).f57203g));
        }
    }

    public C4625wi(@NonNull Y4 y10, @NonNull Ll ll2, @NonNull ICommonExecutor iCommonExecutor) {
        super(y10, ll2);
        this.f57892d = new RunnableC4600vi(this);
        this.f57893e = iCommonExecutor;
    }
}
