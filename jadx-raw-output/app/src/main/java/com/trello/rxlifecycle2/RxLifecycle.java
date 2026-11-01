package com.trello.rxlifecycle2;

import com.trello.rxlifecycle2.internal.Preconditions;
import ii.k;
import oi.c;
import oi.o;
import oi.q;

/* JADX INFO: loaded from: classes4.dex */
public class RxLifecycle {
    public static <T, R> LifecycleTransformer<T> bind(k<R> kVar) {
        return new LifecycleTransformer<>(kVar);
    }

    public static <T, R> LifecycleTransformer<T> bind(k<R> kVar, o<R, R> oVar) {
        Preconditions.checkNotNull(kVar, "lifecycle == null");
        Preconditions.checkNotNull(oVar, "correspondingEvents == null");
        return bind(takeUntilCorrespondingEvent(kVar.share(), oVar));
    }

    public static <T, R> LifecycleTransformer<T> bindUntilEvent(k<R> kVar, R r10) {
        Preconditions.checkNotNull(kVar, "lifecycle == null");
        Preconditions.checkNotNull(r10, "event == null");
        return bind(takeUntilEvent(kVar, r10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <R> k<Boolean> takeUntilCorrespondingEvent(k<R> kVar, o<R, R> oVar) {
        return k.combineLatest(kVar.take(1L).map(oVar), kVar.skip(1L), new c<R, R, Boolean>() { // from class: com.trello.rxlifecycle2.RxLifecycle.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // oi.c
            public Boolean apply(R r10, R r11) throws Exception {
                return Boolean.valueOf(r11.equals(r10));
            }
        }).onErrorReturn(Functions.RESUME_FUNCTION).filter(Functions.SHOULD_COMPLETE);
    }

    private static <R> k<R> takeUntilEvent(k<R> kVar, final R r10) {
        return kVar.filter(new q<R>() { // from class: com.trello.rxlifecycle2.RxLifecycle.1
            @Override // oi.q
            public boolean test(R r11) throws Exception {
                return r11.equals(r10);
            }
        });
    }

    private RxLifecycle() {
        throw new AssertionError("No instances");
    }
}
