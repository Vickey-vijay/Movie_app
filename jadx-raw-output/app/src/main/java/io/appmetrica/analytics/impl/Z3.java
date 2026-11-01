package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class Z3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I5 f56266c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3 f56264a = new Y3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f56265b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f56267d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th2) {
        Rj rj2 = AbstractC4452pj.f57520a;
        Map mapG = nj.l0.g(mj.h.a(str, nj.l0.g(mj.h.a(str2, mj.d.b(th2)))));
        rj2.getClass();
        rj2.a(new Qj("client_module_errors", mapG));
    }

    public final ModuleAdRevenueProcessor b() {
        L5 l10;
        I5 i10 = this.f56266c;
        if (i10 == null || (l10 = ((L3) i10).f55498b) == null) {
            return null;
        }
        return l10.f55507a;
    }

    public final void c() {
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f56265b) {
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th2);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f56267d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f56265b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AdRevenueCollector) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(nj.t.v(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it2.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(nj.b0.W(arrayList3));
    }

    public final List<String> a() {
        return this.f56267d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f56265b.add(moduleClientEntryPoint);
    }

    public final void a(I5 i10) {
        this.f56266c = i10;
        HashSet hashSet = new HashSet();
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f56265b) {
            try {
                moduleClientEntryPoint.initClientSide(i10);
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th2);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (!hashSet.isEmpty()) {
            this.f56265b.removeAll(hashSet);
        }
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f56265b) {
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    Y3 y10 = this.f56264a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    y10.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    X3 x10 = bundle2 != null ? new X3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (x10 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(x10);
                    }
                }
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th2);
            }
        }
    }
}
