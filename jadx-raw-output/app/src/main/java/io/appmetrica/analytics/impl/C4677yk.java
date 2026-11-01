package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4677yk implements Qc, InterfaceC4355lm, AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58033a = "rp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f58034b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f58035c = new B7();

    public static void a(String str, String str2, Throwable th2) {
        Rj rj2 = AbstractC4452pj.f57520a;
        Map mapG = nj.l0.g(mj.h.a(str, nj.l0.g(mj.h.a(str2, mj.d.b(th2)))));
        rj2.getClass();
        rj2.a(new Qj("service_module_errors", mapG));
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final List<ModuleServicesDatabase> b() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f58034b;
        ArrayList arrayList2 = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th2);
                objValueOf = mj.r.f64562a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final Map<String, Zc> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f58034b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Pair pairA = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    pairA = mj.h.a(moduleServiceEntryPoint.getIdentifier(), new Zc(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        Map<String, Zc> mapV = kotlin.collections.a.v(arrayList);
        a(hashSet);
        return mapV;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final Map<String, Integer> d() {
        List listK;
        Map<String, Integer> blocks;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f58034b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null || (listK = nj.n0.D(blocks)) == null) {
                    listK = nj.s.k();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th2);
                hashSet.add(moduleServiceEntryPoint);
                listK = nj.s.k();
            }
            nj.x.C(arrayList, listK);
        }
        Map<String, Integer> mapV = kotlin.collections.a.v(arrayList);
        a(hashSet);
        return mapV;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f58034b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Consumer<Location> locationConsumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationConsumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController locationSourcesController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f58034b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationSourcesController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationSourcesController == null);
        a(hashSet);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final Toggle g() {
        Toggle locationControllerAppStateToggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f58034b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationControllerAppStateToggle == null);
        a(hashSet);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f58035c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final List<String> h() {
        List<String> listK;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f58034b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (listK = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                    listK = nj.s.k();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th2);
                hashSet.add(moduleServiceEntryPoint);
                listK = nj.s.k();
            }
            nj.x.C(arrayList, listK);
        }
        a(hashSet);
        return arrayList;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f58034b) {
            Bundle configBundleForClient = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    configBundleForClient = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        a(hashSet);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f58034b.add(moduleServiceEntryPoint);
        if (ck.p.e(this.f58033a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f58035c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4355lm
    public final void a(C4226gm c4226gm) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c4226gm.f56834d, c4226gm.f56831a, c4226gm.f56832b);
        Lg lg2 = new Lg(c4226gm.f56852v, c4226gm.f56851u);
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f58034b) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C4602vk(sdkIdentifiers, lg2, c4226gm.A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th2);
            }
        }
        a(hashSet);
    }

    public final void a(ServiceContext serviceContext, C4226gm c4226gm) {
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f58034b) {
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C4602vk(new SdkIdentifiers(c4226gm.f56834d, c4226gm.f56831a, c4226gm.f56832b), new Lg(c4226gm.f56852v, c4226gm.f56851u), c4226gm.A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    Vc vc2 = C4418oa.I.f57422t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (vc2) {
                        try {
                            vc2.f56022a.put(identifier, moduleEventServiceHandlerFactory);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            } catch (Throwable th3) {
                a(moduleServiceEntryPoint.getIdentifier(), C3426d4.a.f28413f, th3);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            this.f58034b.removeAll(hashSet);
        }
    }
}
