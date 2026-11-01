package com.unity3d.services.core.di;

import ck.i;
import ck.p;
import jk.c;

/* JADX INFO: compiled from: ServiceKey.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceKey {
    private final c<?> instanceClass;
    private final String named;

    public ServiceKey(String str, c<?> cVar) {
        p.j(str, "named");
        p.j(cVar, "instanceClass");
        this.named = str;
        this.instanceClass = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i10 & 2) != 0) {
            cVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c<?> component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String str, c<?> cVar) {
        p.j(str, "named");
        p.j(cVar, "instanceClass");
        return new ServiceKey(str, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return p.e(this.named, serviceKey.named) && p.e(this.instanceClass, serviceKey.instanceClass);
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public final c<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public /* synthetic */ ServiceKey(String str, c cVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? "" : str, cVar);
    }
}
