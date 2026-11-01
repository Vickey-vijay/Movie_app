package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import mj.r;
import nj.b0;
import nj.s;
import nk.h0;
import nk.j;
import nk.k0;
import nk.l0;
import qk.e;
import qk.k;
import qk.l;
import qk.p;
import qk.q;
import qk.v;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidDiagnosticEventRepository.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final k<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final l<Boolean> configured;
    private final l0 coroutineScope;
    private final p<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final l<Boolean> enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidDiagnosticEventRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {70}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements bk.p<l0, c<? super r>, Object> {
        public final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$events = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidDiagnosticEventRepository.this.new AnonymousClass2(this.$events, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                k kVar = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                if (kVar.emit(list, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public AndroidDiagnosticEventRepository(CoroutineTimer coroutineTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, h0 h0Var) {
        ck.p.j(coroutineTimer, "flushTimer");
        ck.p.j(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        ck.p.j(h0Var, "dispatcher");
        this.flushTimer = coroutineTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = kotlinx.coroutines.d.h(kotlinx.coroutines.d.a(h0Var), new k0("DiagnosticEventRepository"));
        this.batch = v.a(s.k());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = v.a(bool);
        this.configured = v.a(bool);
        k<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> kVarB = q.b(100, 0, null, 6, null);
        this._diagnosticEvents = kVarB;
        this.diagnosticEvents = e.a(kVarB);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        ck.p.j(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar = this.batch;
            do {
                value2 = lVar.getValue();
            } while (!lVar.a(value2, b0.z0(value2, diagnosticEvent)));
        } else if (this.enabled.getValue().booleanValue()) {
            l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar2 = this.batch;
            do {
                value = lVar2.getValue();
            } while (!lVar2.a(value, b0.z0(value, diagnosticEvent)));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar = this.batch;
        while (!lVar.a(lVar.getValue(), s.k())) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
        ck.p.j(diagnosticEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticEventsConfiguration.getAllowedEventsList();
        ck.p.i(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticEventsConfiguration.getBlockedEventsList();
        ck.p.i(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticEventsConfiguration.getMaxBatchIntervalMs(), new bk.a<r>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure.1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AndroidDiagnosticEventRepository.this.flush();
            }
        });
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        if (this.enabled.getValue().booleanValue()) {
            l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar = this.batch;
            do {
                value = lVar.getValue();
            } while (!lVar.a(value, s.k()));
            final List listT = SequencesKt___SequencesKt.T(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.K(b0.S(value), new bk.l<DiagnosticEventRequestOuterClass.DiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEvent>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$2
                {
                    super(1);
                }

                @Override // bk.l
                public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    return diagnosticEvent == null ? this.this$0.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null, null) : diagnosticEvent;
                }
            }), new bk.l<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$3
                {
                    super(1);
                }

                @Override // bk.l
                public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    ck.p.j(diagnosticEvent, "it");
                    return Boolean.valueOf(this.this$0.allowedEvents.isEmpty() || this.this$0.allowedEvents.contains(diagnosticEvent.getEventType()));
                }
            }), new bk.l<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$4
                {
                    super(1);
                }

                @Override // bk.l
                public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    ck.p.j(diagnosticEvent, "it");
                    return Boolean.valueOf(!this.this$0.blockedEvents.contains(diagnosticEvent.getEventType()));
                }
            }));
            if (!listT.isEmpty()) {
                DeviceLog.debug((Callable<String>) new Callable() { // from class: com.unity3d.ads.core.data.repository.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AndroidDiagnosticEventRepository.flush$lambda$3(this.f45224b, listT);
                    }
                });
                j.d(this.coroutineScope, null, null, new AnonymousClass2(listT, null), 3, null);
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public p<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$3(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        ck.p.j(androidDiagnosticEventRepository, "this$0");
        ck.p.j(list, "$events");
        return "Unity Ads Sending diagnostic batch enabled: " + androidDiagnosticEventRepository.enabled.getValue().booleanValue() + " size: " + list.size() + " :: " + list;
    }
}
