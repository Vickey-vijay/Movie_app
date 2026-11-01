package io.reactivex.internal.subscriptions;

import androidx.lifecycle.e;
import bj.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qi.a;
import qo.c;

/* JADX INFO: loaded from: classes10.dex */
public enum SubscriptionHelper implements c {
    CANCELLED;

    public static boolean setOnce(AtomicReference<c> atomicReference, c cVar) {
        a.e(cVar, "s is null");
        if (e.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(c cVar, c cVar2) {
        if (cVar2 == null) {
            ej.a.s(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // qo.c
    public void cancel() {
    }

    @Override // qo.c
    public void request(long j10) {
    }

    public static boolean isCancelled(c cVar) {
        return cVar == CANCELLED;
    }

    public static void reportMoreProduced(long j10) {
        ej.a.s(new ProtocolViolationException("More produced than requested: " + j10));
    }

    public static void reportSubscriptionSet() {
        ej.a.s(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean cancel(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (cVar != subscriptionHelper && (andSet = atomicReference.getAndSet(subscriptionHelper)) != subscriptionHelper) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    public static void deferredRequest(AtomicReference<c> atomicReference, AtomicLong atomicLong, long j10) {
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j10);
            return;
        }
        if (validate(j10)) {
            b.a(atomicLong, j10);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<c> atomicReference, AtomicLong atomicLong, c cVar) {
        if (setOnce(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar != null) {
                    cVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!e.a(atomicReference, cVar2, cVar));
        return true;
    }

    public static boolean set(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar != null) {
                    cVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!e.a(atomicReference, cVar2, cVar));
        if (cVar2 != null) {
            cVar2.cancel();
            return true;
        }
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        ej.a.s(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean setOnce(AtomicReference<c> atomicReference, c cVar, long j10) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        cVar.request(j10);
        return true;
    }
}
