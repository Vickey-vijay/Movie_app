package io.reactivex.internal.util;

import com.ironsource.C3426d4;
import ii.r;
import java.io.Serializable;
import mi.b;
import qi.a;
import qo.c;

/* JADX INFO: loaded from: classes5.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final b upstream;

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + C3426d4.j.f28588e;
        }

        public DisposableNotification(b bVar) {
            this.upstream = bVar;
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f61403e;

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return a.c(this.f61403e, ((ErrorNotification) obj).f61403e);
            }
            return false;
        }

        public int hashCode() {
            return this.f61403e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f61403e + C3426d4.j.f28588e;
        }

        public ErrorNotification(Throwable th2) {
            this.f61403e = th2;
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final c upstream;

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + C3426d4.j.f28588e;
        }

        public SubscriptionNotification(c cVar) {
            this.upstream = cVar;
        }
    }

    public static <T> boolean accept(Object obj, qo.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            bVar.onError(((ErrorNotification) obj).f61403e);
            return true;
        }
        bVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, qo.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            bVar.onError(((ErrorNotification) obj).f61403e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            bVar.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        bVar.onNext(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(b bVar) {
        return new DisposableNotification(bVar);
    }

    public static Object error(Throwable th2) {
        return new ErrorNotification(th2);
    }

    public static b getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f61403e;
    }

    public static c getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static Object subscription(c cVar) {
        return new SubscriptionNotification(cVar);
    }

    public static <T> boolean accept(Object obj, r<? super T> rVar) {
        if (obj == COMPLETE) {
            rVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            rVar.onError(((ErrorNotification) obj).f61403e);
            return true;
        }
        rVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, r<? super T> rVar) {
        if (obj == COMPLETE) {
            rVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            rVar.onError(((ErrorNotification) obj).f61403e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            rVar.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        rVar.onNext(obj);
        return false;
    }
}
