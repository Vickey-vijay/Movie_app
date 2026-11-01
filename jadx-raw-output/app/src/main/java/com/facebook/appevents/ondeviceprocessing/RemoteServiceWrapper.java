package com.facebook.appevents.ondeviceprocessing;

import a2.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.j0;
import com.facebook.internal.k;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import nj.s;
import q1.t;
import y1.g;

/* JADX INFO: compiled from: RemoteServiceWrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u0012\u001bB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u001c\u0010\u0015\u001a\n \u0013*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper;", "", "", "b", "", "applicationId", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "e", "", "Lcom/facebook/appevents/AppEvent;", "appEvents", "c", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "eventType", "d", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "a", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/Boolean;", "isServiceAvailable", "<init>", "()V", "EventType", "ServiceResult", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class RemoteServiceWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RemoteServiceWrapper f14282a = new RemoteServiceWrapper();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static Boolean isServiceAvailable;

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static EventType[] valuesCustom() {
            EventType[] eventTypeArrValuesCustom = values();
            return (EventType[]) Arrays.copyOf(eventTypeArrValuesCustom, eventTypeArrValuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }

        EventType(String str) {
            this.eventType = str;
        }
    }

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ServiceResult[] valuesCustom() {
            ServiceResult[] serviceResultArrValuesCustom = values();
            return (ServiceResult[]) Arrays.copyOf(serviceResultArrValuesCustom, serviceResultArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$a;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "serviceBinder", "Lmj/r;", "onServiceConnected", "onNullBinding", "onServiceDisconnected", InneractiveMediationDefs.GENDER_MALE, "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "latch", "c", "Landroid/os/IBinder;", "binder", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final CountDownLatch latch = new CountDownLatch(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public IBinder binder;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.j(componentName, "name");
        }

        public final IBinder m() throws InterruptedException {
            this.latch.await(5L, TimeUnit.SECONDS);
            return this.binder;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            p.j(componentName, "name");
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.j(componentName, "name");
            p.j(iBinder, "serviceBinder");
            this.binder = iBinder;
            this.latch.countDown();
        }
    }

    public static final boolean b() {
        if (i2.a.d(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (isServiceAvailable == null) {
                isServiceAvailable = Boolean.valueOf(f14282a.a(t.l()) != null);
            }
            Boolean bool = isServiceAvailable;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th2) {
            i2.a.b(th2, RemoteServiceWrapper.class);
            return false;
        }
    }

    public static final ServiceResult c(String applicationId, List<AppEvent> appEvents) {
        if (i2.a.d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            p.j(applicationId, "applicationId");
            p.j(appEvents, "appEvents");
            return f14282a.d(EventType.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            i2.a.b(th2, RemoteServiceWrapper.class);
            return null;
        }
    }

    public static final ServiceResult e(String applicationId) {
        if (i2.a.d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            p.j(applicationId, "applicationId");
            return f14282a.d(EventType.MOBILE_APP_INSTALL, applicationId, s.k());
        } catch (Throwable th2) {
            i2.a.b(th2, RemoteServiceWrapper.class);
            return null;
        }
    }

    public final Intent a(Context context) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && k.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage(FbValidationUtils.DEBUG_FB_PACKAGE);
                if (packageManager.resolveService(intent2, 0) != null && k.a(context, FbValidationUtils.DEBUG_FB_PACKAGE)) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final ServiceResult d(EventType eventType, String applicationId, List<AppEvent> appEvents) {
        ServiceResult serviceResult;
        String str;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            g.b();
            Context contextL = t.l();
            Intent intentA = a(contextL);
            if (intentA == null) {
                return serviceResult2;
            }
            a aVar = new a();
            try {
                if (!contextL.bindService(intentA, aVar, 1)) {
                    return ServiceResult.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderM = aVar.m();
                    if (iBinderM != null) {
                        n2.a aVarH = n2.a.AbstractBinderC0588a.h(iBinderM);
                        Bundle bundleA = d.a(eventType, applicationId, appEvents);
                        if (bundleA != null) {
                            aVarH.j(bundleA);
                            j0 j0Var = j0.f14425a;
                            j0.e0(TAG, p.s("Successfully sent events to the remote service: ", bundleA));
                        }
                        serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                    }
                    return serviceResult2;
                } catch (RemoteException e10) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    j0 j0Var2 = j0.f14425a;
                    str = TAG;
                    j0.d0(str, e10);
                    contextL.unbindService(aVar);
                    j0.e0(str, "Unbound from the remote service");
                    return serviceResult;
                } catch (InterruptedException e11) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    j0 j0Var3 = j0.f14425a;
                    str = TAG;
                    j0.d0(str, e11);
                    contextL.unbindService(aVar);
                    j0.e0(str, "Unbound from the remote service");
                    return serviceResult;
                }
            } finally {
                contextL.unbindService(aVar);
                j0 j0Var4 = j0.f14425a;
                j0.e0(TAG, "Unbound from the remote service");
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
