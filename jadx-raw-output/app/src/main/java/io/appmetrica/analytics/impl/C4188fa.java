package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4188fa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4188fa f56753d = new C4188fa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4545td f56754a = new C4545td();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f56755b = AbstractC4121ck.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56756c = false;

    public final void a(Context context) {
        C4114cd c4114cd;
        C4418oa.a(context);
        this.f56755b.onCreate(context);
        this.f56754a.getClass();
        List<String> listA = C4418oa.I.f57421s.a();
        ArrayList arrayList = new ArrayList(nj.t.v(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c4114cd = new C4114cd(str, false);
            } else {
                C4418oa.I.p().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
                c4114cd = new C4114cd(str, true);
            }
            arrayList.add(c4114cd);
        }
        new C4428ok(C4418oa.I.D().f55047d).a(context);
        xo xoVar = C4418oa.I.D().f55046c;
        synchronized (xoVar) {
            xoVar.f57978a.a();
        }
        C4418oa.I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f56756c) {
            return;
        }
        synchronized (this) {
            if (!this.f56756c) {
                a(context);
                this.f56756c = true;
            }
        }
    }

    public static C4140dd a() {
        C4353lk c4353lk = C4418oa.I.f57406d;
        if (c4353lk.f57226b == null) {
            synchronized (c4353lk) {
                if (c4353lk.f57226b == null) {
                    c4353lk.f57225a.getClass();
                    HandlerThreadC4138db handlerThreadC4138dbA = A9.a("IAA-SC");
                    c4353lk.f57226b = new A9(handlerThreadC4138dbA, handlerThreadC4138dbA.getLooper(), new Handler(handlerThreadC4138dbA.getLooper()));
                }
            }
        }
        return new C4140dd(c4353lk.f57226b, C4418oa.I.y(), "service_modules", new SystemTimeProvider());
    }
}
