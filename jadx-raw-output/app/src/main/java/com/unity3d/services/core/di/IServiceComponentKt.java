package com.unity3d.services.core.di;

import bk.a;
import ck.p;
import ck.s;
import com.ironsource.C3426d4;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import mj.g;

/* JADX INFO: compiled from: IServiceComponent.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class IServiceComponentKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: IServiceComponent.kt */
    public static final class AnonymousClass1<T> extends Lambda implements a<T> {
        public final /* synthetic */ String $named;
        public final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // bk.a
        public final T invoke() {
            IServiceComponent iServiceComponent = this.$this_inject;
            String str = this.$named;
            IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            p.p(4, "T");
            return (T) registry.getService(str, s.b(Object.class));
        }
    }

    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String str) {
        p.j(iServiceComponent, "<this>");
        p.j(str, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        p.p(4, "T");
        return (T) registry.getService(str, s.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(iServiceComponent, "<this>");
        p.j(str, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        p.p(4, "T");
        return registry.getService(str, s.b(Object.class));
    }

    public static final /* synthetic */ <T> g<T> inject(IServiceComponent iServiceComponent, String str, LazyThreadSafetyMode lazyThreadSafetyMode) {
        p.j(iServiceComponent, "<this>");
        p.j(str, "named");
        p.j(lazyThreadSafetyMode, C3426d4.a.f28427t);
        p.o();
        return b.b(lazyThreadSafetyMode, new AnonymousClass1(iServiceComponent, str));
    }

    public static /* synthetic */ g inject$default(IServiceComponent iServiceComponent, String str, LazyThreadSafetyMode lazyThreadSafetyMode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        }
        p.j(iServiceComponent, "<this>");
        p.j(str, "named");
        p.j(lazyThreadSafetyMode, C3426d4.a.f28427t);
        p.o();
        return b.b(lazyThreadSafetyMode, new AnonymousClass1(iServiceComponent, str));
    }
}
