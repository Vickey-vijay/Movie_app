package com.trello.rxlifecycle2;

import java.util.concurrent.CancellationException;
import ni.a;
import oi.o;
import oi.q;

/* JADX INFO: loaded from: classes.dex */
final class Functions {
    public static final o<Throwable, Boolean> RESUME_FUNCTION = new o<Throwable, Boolean>() { // from class: com.trello.rxlifecycle2.Functions.1
        @Override // oi.o
        public Boolean apply(Throwable th2) throws Exception {
            if (th2 instanceof OutsideLifecycleException) {
                return Boolean.TRUE;
            }
            a.a(th2);
            return Boolean.FALSE;
        }
    };
    public static final q<Boolean> SHOULD_COMPLETE = new q<Boolean>() { // from class: com.trello.rxlifecycle2.Functions.2
        @Override // oi.q
        public boolean test(Boolean bool) throws Exception {
            return bool.booleanValue();
        }
    };
    public static final o<Object, ii.a> CANCEL_COMPLETABLE = new o<Object, ii.a>() { // from class: com.trello.rxlifecycle2.Functions.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // oi.o
        public ii.a apply(Object obj) throws Exception {
            return ii.a.e(new CancellationException());
        }
    };

    private Functions() {
        throw new AssertionError("No instances!");
    }
}
