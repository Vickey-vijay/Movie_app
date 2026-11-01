package com.unity3d.ads.core.domain;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import ck.s;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import mk.b;
import mk.j;
import mk.k;
import nk.h0;
import qk.e;
import qk.l;
import qk.v;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHandleFocusCounters.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidHandleFocusCounters {
    private final h0 defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, mk.a> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final l<FocusState> previousFocusState;
    private final SessionRepository sessionRepository;
    private final k timeSource;

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, h0 h0Var, k kVar) {
        p.j(sessionRepository, "sessionRepository");
        p.j(focusRepository, "focusRepository");
        p.j(androidGetIsAdActivity, "isAdActivity");
        p.j(h0Var, "defaultDispatcher");
        p.j(kVar, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = androidGetIsAdActivity;
        this.defaultDispatcher = h0Var;
        this.timeSource = kVar;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = v.a(null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleFocusCounters.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements bk.p<FocusState, c<? super r>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = AndroidHandleFocusCounters.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(FocusState focusState, c<? super r> cVar) {
            return ((AnonymousClass1) create(focusState, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strD;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                FocusState focusState = (FocusState) this.L$0;
                AndroidHandleFocusCounters.this.onFocusStateChange(focusState);
                Activity activity = focusState.getActivity().get();
                if (activity == null || (strD = s.b(activity.getClass()).d()) == null) {
                    strD = "unknown_activity_name";
                }
                if (!AndroidHandleFocusCounters.this.isAdActivity.invoke(strD)) {
                    return r.f64562a;
                }
                AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
                if (focusState instanceof FocusState.Focused) {
                    AndroidHandleFocusCounters.this.onResume(strD);
                } else if (focusState instanceof FocusState.Unfocused) {
                    AndroidHandleFocusCounters.this.onPause(strD);
                }
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        FocusState value;
        FocusState focusState2;
        l<FocusState> lVar = this.previousFocusState;
        do {
            value = lVar.getValue();
            focusState2 = value;
        } while (!lVar.a(value, focusState));
        if (focusState2 == null || focusState.getClass() == focusState2.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 == null || p.e(str2, str)) {
            mk.a aVarRemove = this.focusTimesPerActivity.remove(str);
            if (aVarRemove == null) {
                aVarRemove = this.timeSource.a();
            }
            p.i(aVarRemove, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) b.p(aVarRemove.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.a());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        e.x(e.A(this.focusRepository.getFocusState(), new AnonymousClass1(null)), kotlinx.coroutines.d.a(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, h0 h0Var, k kVar, int i10, i iVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, h0Var, (i10 & 16) != 0 ? j.f64572a : kVar);
    }
}
