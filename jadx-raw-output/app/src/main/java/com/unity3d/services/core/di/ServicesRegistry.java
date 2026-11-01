package com.unity3d.services.core.di;

import bk.a;
import ck.p;
import ck.s;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jk.c;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: ServicesRegistry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, g<?>> _services = new ConcurrentHashMap<>();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, s.b(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(aVar));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.p(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(str, s.b(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.p(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(str, s.b(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, s.b(Object.class));
        servicesRegistry.updateService(serviceKey, b.a(aVar));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String str, a<? extends T> aVar) {
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, s.b(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(aVar));
        return serviceKey;
    }

    public final /* synthetic */ <T> T get(String str) {
        p.j(str, "named");
        p.p(4, "T");
        return (T) resolveService(new ServiceKey(str, s.b(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String str) {
        p.j(str, "named");
        p.p(4, "T");
        return (T) resolveServiceOrNull(new ServiceKey(str, s.b(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String str, c<?> cVar) {
        p.j(str, "named");
        p.j(cVar, C3605n2.f30210p);
        return (T) resolveService(new ServiceKey(str, cVar));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, g<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey serviceKey) {
        p.j(serviceKey, C3426d4.i.W);
        g<?> gVar = getServices().get(serviceKey);
        if (gVar != null) {
            return (T) gVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + serviceKey);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey serviceKey) {
        p.j(serviceKey, C3426d4.i.W);
        g<?> gVar = getServices().get(serviceKey);
        if (gVar == null) {
            return null;
        }
        return (T) gVar.getValue();
    }

    public final /* synthetic */ <T> ServiceKey single(String str, a<? extends T> aVar) {
        p.j(str, "named");
        p.j(aVar, C3605n2.f30210p);
        p.p(4, "T");
        ServiceKey serviceKey = new ServiceKey(str, s.b(Object.class));
        updateService(serviceKey, b.a(aVar));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey serviceKey, g<? extends T> gVar) {
        p.j(serviceKey, C3426d4.i.W);
        p.j(gVar, C3605n2.f30210p);
        if (!getServices().containsKey(serviceKey)) {
            this._services.put(serviceKey, gVar);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + serviceKey).toString());
    }
}
