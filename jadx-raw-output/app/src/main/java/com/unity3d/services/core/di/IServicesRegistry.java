package com.unity3d.services.core.di;

import java.util.Map;
import jk.c;
import mj.g;

/* JADX INFO: compiled from: IServicesRegistry.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface IServicesRegistry {

    /* JADX INFO: compiled from: IServicesRegistry.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i10 & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, cVar);
        }
    }

    <T> T getService(String str, c<?> cVar);

    Map<ServiceKey, g<?>> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, g<? extends T> gVar);
}
