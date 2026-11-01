package ii;

import com.ironsource.C3426d4;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: Notification.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j<Object> f54177b = new j<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54178a;

    public static <T> j<T> a() {
        return (j<T>) f54177b;
    }

    public static <T> j<T> b(Throwable th2) {
        qi.a.e(th2, "error is null");
        return new j<>(NotificationLite.error(th2));
    }

    public static <T> j<T> c(T t10) {
        qi.a.e(t10, "value is null");
        return new j<>(t10);
    }

    public Throwable d() {
        Object obj = this.f54178a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public T e() {
        Object obj = this.f54178a;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.f54178a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return qi.a.c(this.f54178a, ((j) obj).f54178a);
        }
        return false;
    }

    public boolean f() {
        return this.f54178a == null;
    }

    public boolean g() {
        return NotificationLite.isError(this.f54178a);
    }

    public boolean h() {
        Object obj = this.f54178a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f54178a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f54178a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + C3426d4.j.f28588e;
        }
        return "OnNextNotification[" + this.f54178a + C3426d4.j.f28588e;
    }

    public j(Object obj) {
        this.f54178a = obj;
    }
}
