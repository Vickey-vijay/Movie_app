package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3741v1 implements N1 {

    /* JADX INFO: renamed from: com.ironsource.v1$a */
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3593ma f31442a;

        /* JADX INFO: renamed from: com.ironsource.v1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0291a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f31443a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f31443a = iArr;
            }
        }

        public a(InterfaceC3593ma interfaceC3593ma) {
            ck.p.j(interfaceC3593ma, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f31442a = interfaceC3593ma;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a aVar) {
            ck.p.j(event, "$event");
            ck.p.j(aVar, "this$0");
            int i10 = C0291a.f31443a[event.ordinal()];
            if (i10 == 1) {
                aVar.f31442a.b();
                return;
            }
            if (i10 == 2) {
                aVar.f31442a.c();
            } else if (i10 == 3) {
                aVar.f31442a.d();
            } else {
                if (i10 != 4) {
                    return;
                }
                aVar.f31442a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC3593ma interfaceC3593ma = this.f31442a;
            a aVar = obj instanceof a ? (a) obj : null;
            return ck.p.e(interfaceC3593ma, aVar != null ? aVar.f31442a : null);
        }

        public int hashCode() {
            return this.f31442a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, final Lifecycle.Event event) {
            ck.p.j(lifecycleOwner, "source");
            ck.p.j(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.am
                @Override // java.lang.Runnable
                public final void run() {
                    C3741v1.a.a(event, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "$observer");
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new a(interfaceC3593ma));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "$observer");
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(new a(interfaceC3593ma));
    }

    @Override // com.ironsource.N1
    public void a(final InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.yl
            @Override // java.lang.Runnable
            public final void run() {
                C3741v1.c(interfaceC3593ma);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.N1
    public void b(final InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.zl
            @Override // java.lang.Runnable
            public final void run() {
                C3741v1.d(interfaceC3593ma);
            }
        }, 0L, 2, null);
    }
}
