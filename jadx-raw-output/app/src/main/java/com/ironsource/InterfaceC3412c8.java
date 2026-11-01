package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3412c8<T> {

    /* JADX INFO: renamed from: com.ironsource.c8$a */
    public static class a<ListenerType> implements InterfaceC3412c8<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ListenerType f28335a;

        /* JADX INFO: renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        public static final class C0267a extends AbstractRunnableC3526ie {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f28336b;

            public C0267a(Runnable runnable) {
                this.f28336b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC3526ie
            public void a() {
                this.f28336b.run();
            }
        }

        public final ListenerType a() {
            return this.f28335a;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        public final void b(ListenerType listenertype) {
            this.f28335a = listenertype;
        }

        public final void a(Runnable runnable, boolean z10) {
            ck.p.j(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0267a(runnable), 0L, 2, null);
            }
        }

        public final void a(String str, String str2) {
            ck.p.j(str, "instanceId");
            ck.p.j(str2, "message");
            IronLog.CALLBACK.info(str2 + " instanceId=" + str);
        }

        @Override // com.ironsource.InterfaceC3412c8
        public void a(ListenerType listenertype) {
            this.f28335a = listenertype;
        }
    }

    void a(T t10);
}
