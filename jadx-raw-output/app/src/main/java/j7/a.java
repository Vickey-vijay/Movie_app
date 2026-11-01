package j7;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import oi.q;

/* JADX INFO: compiled from: Functions.java */
/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CallableC0545a f61714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Callable<Boolean> f61715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<Object> f61716c;

    /* JADX INFO: renamed from: j7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Functions.java */
    public static final class CallableC0545a implements Callable<Boolean>, q<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f61717b;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return this.f61717b;
        }

        @Override // oi.q
        public boolean test(Object obj) throws Exception {
            return this.f61717b.booleanValue();
        }

        public CallableC0545a(Boolean bool) {
            this.f61717b = bool;
        }
    }

    static {
        CallableC0545a callableC0545a = new CallableC0545a(Boolean.TRUE);
        f61714a = callableC0545a;
        f61715b = callableC0545a;
        f61716c = callableC0545a;
    }
}
