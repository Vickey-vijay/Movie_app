package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class rh1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f82272b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d63 f82271a = new d63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f82273c = new AtomicBoolean();

    public final void a() {
        if (ub.a(this.f82272b)) {
            this.f82271a.getClass();
            if (d63.a() || this.f82273c.getAndSet(true)) {
                return;
            }
            lc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }

    public rh1(Context context) {
        this.f82272b = context.getApplicationContext();
    }
}
