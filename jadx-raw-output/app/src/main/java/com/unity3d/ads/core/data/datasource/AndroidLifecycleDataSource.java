package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import qk.e;
import qk.l;
import qk.u;
import qk.v;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidLifecycleDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, LifecycleEventObserver {
    private final l<Boolean> _appActive;
    private final u<Boolean> appActive;

    /* JADX INFO: compiled from: AndroidLifecycleDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidLifecycleDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidLifecycleDataSource.this.new AnonymousClass1(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(AndroidLifecycleDataSource.this);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public u<Boolean> getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ck.p.j(lifecycleOwner, "source");
        ck.p.j(event, "event");
        l<Boolean> lVar = this._appActive;
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i10 == 1) {
            zBooleanValue = false;
        } else if (i10 != 2) {
            zBooleanValue = getAppActive().getValue().booleanValue();
        }
        lVar.setValue(Boolean.valueOf(zBooleanValue));
    }

    public AndroidLifecycleDataSource() {
        l<Boolean> lVarA = v.a(Boolean.TRUE);
        this._appActive = lVarA;
        this.appActive = e.b(lVarA);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        j.d(kotlinx.coroutines.d.b(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return getAppActive().getValue().booleanValue();
    }
}
