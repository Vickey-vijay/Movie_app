package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0006\u000bB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/bidmachine/analytics/internal/j;", "Config", "", "Landroid/content/Context;", "applicationContext", "Lmj/r;", "a", "(Landroid/content/Context;)V", com.safedk.android.utils.i.f44984c, "(Ljava/lang/Object;)V", "c", "b", "d", InneractiveMediationDefs.GENDER_FEMALE, "e", "Ljava/lang/Object;", "lifecycleStateMonitor", "Lio/bidmachine/analytics/internal/j$b;", "Lio/bidmachine/analytics/internal/j$b;", "getLifecycleState", "()Lio/bidmachine/analytics/internal/j$b;", "setLifecycleState", "(Lio/bidmachine/analytics/internal/j$b;)V", "lifecycleState", "", "()Ljava/lang/String;", "name", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractC4740j<Config> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lifecycleStateMonitor = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b lifecycleState = b.EMPTY;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.j$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/j$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public enum b {
        EMPTY,
        CREATED,
        ENABLED,
        DISABLED,
        DESTROYED
    }

    public abstract String a();

    public final void a(Config configuration) {
        synchronized (this.lifecycleStateMonitor) {
            b bVar = this.lifecycleState;
            if (bVar == b.CREATED || bVar == b.DISABLED) {
                b(configuration);
                this.lifecycleState = b.DISABLED;
                mj.r rVar = mj.r.f64562a;
            }
        }
    }

    public abstract void b(Config configuration);

    public abstract void d(Context applicationContext);

    public abstract void e(Context applicationContext);

    public abstract void f(Context applicationContext);

    public final void a(Context applicationContext) {
        synchronized (this.lifecycleStateMonitor) {
            if (this.lifecycleState != b.EMPTY) {
                return;
            }
            d(applicationContext);
            this.lifecycleState = b.CREATED;
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b(Context applicationContext) {
        synchronized (this.lifecycleStateMonitor) {
            if (this.lifecycleState != b.ENABLED) {
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                e(applicationContext);
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            this.lifecycleState = b.DISABLED;
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void c(Context applicationContext) {
        synchronized (this.lifecycleStateMonitor) {
            if (this.lifecycleState != b.DISABLED) {
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                f(applicationContext);
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            this.lifecycleState = b.ENABLED;
            mj.r rVar = mj.r.f64562a;
        }
    }
}
