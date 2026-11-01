package io.appmetrica.analytics.screenshot.internal;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C4713h;
import io.appmetrica.analytics.screenshot.impl.C4717l;
import io.appmetrica.analytics.screenshot.impl.C4718m;
import io.appmetrica.analytics.screenshot.impl.C4727w;
import io.appmetrica.analytics.screenshot.impl.C4728x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "Lio/appmetrica/analytics/screenshot/impl/D;", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "Lmj/r;", "initClientSide", "onActivated", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "getServiceConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "serviceConfigExtensionConfiguration", "<init>", "()V", "screenshot_release"}, k = 1, mv = {1, 6, 0})
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4717l f58468a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f58471d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4713h f58469b = new C4713h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f58470c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<D> moduleServiceConfig) {
            C4717l c4717l;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = this.f58474a;
            synchronized (screenshotClientModuleEntryPoint) {
                D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                V v10 = null;
                if (featuresConfig != null) {
                    boolean zB = featuresConfig.b();
                    F fA = featuresConfig.a();
                    c4717l = new C4717l(zB, fA != null ? new C4718m(fA) : null);
                } else {
                    c4717l = null;
                }
                screenshotClientModuleEntryPoint.f58468a = c4717l;
                if (screenshotClientModuleEntryPoint.f58471d != null) {
                    V v11 = screenshotClientModuleEntryPoint.f58471d;
                    if (v11 == null) {
                        p.B("screenshotCaptorsController");
                    } else {
                        v10 = v11;
                    }
                    v10.a(screenshotClientModuleEntryPoint.f58468a);
                }
                r rVar = r.f64562a;
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String identifier = "screenshot";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f58473f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            return this.f58475a.f58469b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            return this.f58475a.f58470c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            C4728x c4728x = new C4728x(clientContext);
            this.f58471d = new V(AndroidUtils.isApiAchieved(34) ? new C4727w(clientContext, c4728x) : new I(clientContext, c4728x));
            r rVar = r.f64562a;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            V v10 = this.f58471d;
            if (v10 != null) {
                C4717l c4717l = this.f58468a;
                Iterator it = v10.f58397a.iterator();
                while (it.hasNext()) {
                    ((T) it.next()).a();
                }
                v10.a(c4717l);
            }
            r rVar = r.f64562a;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f58473f;
    }
}
