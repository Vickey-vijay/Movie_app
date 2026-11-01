package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.r;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: MeasurementManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class MeasurementManager {
    public static final Companion Companion = new Companion(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    /* JADX INFO: compiled from: MeasurementManager.kt */
    @RequiresExtension(extension = 1000000, version = 5)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final class Api33Ext5Impl extends MeasurementManager {
        private final android.adservices.measurement.MeasurementManager mMeasurementManager;

        public Api33Ext5Impl(android.adservices.measurement.MeasurementManager measurementManager) {
            p.j(measurementManager, "mMeasurementManager");
            this.mMeasurementManager = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.DeletionRequest convertDeletionRequest(DeletionRequest deletionRequest) {
            android.adservices.measurement.DeletionRequest deletionRequestBuild = new android.adservices.measurement.DeletionRequest.Builder().setDeletionMode(deletionRequest.getDeletionMode()).setMatchBehavior(deletionRequest.getMatchBehavior()).setStart(deletionRequest.getStart()).setEnd(deletionRequest.getEnd()).setDomainUris(deletionRequest.getDomainUris()).setOriginUris(deletionRequest.getOriginUris()).build();
            p.i(deletionRequestBuild, "Builder()\n              …\n                .build()");
            return deletionRequestBuild;
        }

        private final List<android.adservices.measurement.WebSourceParams> convertWebSourceParams(List<WebSourceParams> list) {
            ArrayList arrayList = new ArrayList();
            for (WebSourceParams webSourceParams : list) {
                android.adservices.measurement.WebSourceParams webSourceParamsBuild = new android.adservices.measurement.WebSourceParams.Builder(webSourceParams.getRegistrationUri()).setDebugKeyAllowed(webSourceParams.getDebugKeyAllowed()).build();
                p.i(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebSourceRegistrationRequest convertWebSourceRequest(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequestBuild = new android.adservices.measurement.WebSourceRegistrationRequest.Builder(convertWebSourceParams(webSourceRegistrationRequest.getWebSourceParams()), webSourceRegistrationRequest.getTopOriginUri()).setWebDestination(webSourceRegistrationRequest.getWebDestination()).setAppDestination(webSourceRegistrationRequest.getAppDestination()).setInputEvent(webSourceRegistrationRequest.getInputEvent()).setVerifiedDestination(webSourceRegistrationRequest.getVerifiedDestination()).build();
            p.i(webSourceRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webSourceRegistrationRequestBuild;
        }

        private final List<android.adservices.measurement.WebTriggerParams> convertWebTriggerParams(List<WebTriggerParams> list) {
            ArrayList arrayList = new ArrayList();
            for (WebTriggerParams webTriggerParams : list) {
                android.adservices.measurement.WebTriggerParams webTriggerParamsBuild = new android.adservices.measurement.WebTriggerParams.Builder(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed()).build();
                p.i(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebTriggerRegistrationRequest convertWebTriggerRequest(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            android.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = new android.adservices.measurement.WebTriggerRegistrationRequest.Builder(convertWebTriggerParams(webTriggerRegistrationRequest.getWebTriggerParams()), webTriggerRegistrationRequest.getDestination()).build();
            p.i(webTriggerRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webTriggerRegistrationRequestBuild;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        public Object deleteRegistrations(DeletionRequest deletionRequest, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mMeasurementManager.deleteRegistrations(convertDeletionRequest(deletionRequest), new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object getMeasurementApiStatus(c<? super Integer> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mMeasurementManager.getMeasurementApiStatus(new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerSource(Uri uri, InputEvent inputEvent, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mMeasurementManager.registerSource(uri, inputEvent, new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerTrigger(Uri uri, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mMeasurementManager.registerTrigger(uri, new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mMeasurementManager.registerWebSource(convertWebSourceRequest(webSourceRegistrationRequest), new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, c<? super r> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mMeasurementManager.registerWebTrigger(convertWebTriggerRequest(webTriggerRegistrationRequest), new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB == sj.a.f() ? objB : r.f64562a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext5Impl(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            Object systemService = context.getSystemService((Class<Object>) android.adservices.measurement.MeasurementManager.class);
            p.i(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.measurement.MeasurementManager) systemService);
        }
    }

    /* JADX INFO: compiled from: MeasurementManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final MeasurementManager obtain(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            sb2.append(adServicesInfo.version());
            Log.d("MeasurementManager", sb2.toString());
            if (adServicesInfo.version() >= 5) {
                return new Api33Ext5Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final MeasurementManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object deleteRegistrations(DeletionRequest deletionRequest, c<? super r> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object getMeasurementApiStatus(c<? super Integer> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerSource(Uri uri, InputEvent inputEvent, c<? super r> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerTrigger(Uri uri, c<? super r> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, c<? super r> cVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, c<? super r> cVar);
}
