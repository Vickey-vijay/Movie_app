package com.unity3d.ads.core.domain.events;

import ck.p;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: EventObservers.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: EventObservers.kt */
    @d(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {16, 17}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventObservers.this.invoke(this);
        }
    }

    public EventObservers(OperativeEventObserver operativeEventObserver, DiagnosticEventObserver diagnosticEventObserver, TransactionEventObserver transactionEventObserver) {
        p.j(operativeEventObserver, "operativeEventObserver");
        p.j(diagnosticEventObserver, "diagnosticEventObserver");
        p.j(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        EventObservers eventObservers;
        EventObservers eventObservers2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eventObservers = (EventObservers) anonymousClass1.L$0;
                kotlin.c.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventObservers2 = (EventObservers) anonymousClass1.L$0;
                kotlin.c.b(obj);
            }
            eventObservers2.transactionEventObserver.invoke();
            return r.f64562a;
        }
        kotlin.c.b(obj);
        OperativeEventObserver operativeEventObserver = this.operativeEventObserver;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (operativeEventObserver.invoke(anonymousClass1) == objF) {
            return objF;
        }
        eventObservers = this;
        DiagnosticEventObserver diagnosticEventObserver = eventObservers.diagnosticEventObserver;
        anonymousClass1.L$0 = eventObservers;
        anonymousClass1.label = 2;
        if (diagnosticEventObserver.invoke(anonymousClass1) == objF) {
            return objF;
        }
        eventObservers2 = eventObservers;
        eventObservers2.transactionEventObserver.invoke();
        return r.f64562a;
    }
}
