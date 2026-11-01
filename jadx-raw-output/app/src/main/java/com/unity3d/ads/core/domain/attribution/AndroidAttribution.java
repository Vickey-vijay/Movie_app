package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import bk.a;
import ck.p;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.g;
import mj.r;
import nk.l1;
import qk.u;
import rj.c;
import rj.f;

/* JADX INFO: compiled from: AndroidAttribution.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final g measurementManager$delegate;
    private final SessionRepository sessionRepository;

    private final MeasurementManager getMeasurementManager() {
        return (MeasurementManager) this.measurementManager$delegate.getValue();
    }

    public AndroidAttribution(final Context context, ISDKDispatchers iSDKDispatchers, SessionRepository sessionRepository) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(iSDKDispatchers, "dispatchers");
        p.j(sessionRepository, "sessionRepository");
        this.dispatchers = iSDKDispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = b.a(new a<MeasurementManager>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$measurementManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final MeasurementManager invoke() {
                return this.this$0.getMeasurementManager(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri uri = Uri.parse(str);
        p.i(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        p.i(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    public final Object isAvailable(c<? super Boolean> cVar) throws Throwable {
        r rVar;
        if (Device.getApiLevel() < 33) {
            return tj.a.a(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return tj.a.a(false);
        }
        if (getMeasurementManager() == null) {
            return tj.a.a(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return tj.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(l1.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(Exception exc) {
                    p.j(exc, "error");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m3458constructorimpl(Boolean.FALSE));
                }

                public void onResult(int i10) {
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m3458constructorimpl(Boolean.valueOf(i10 == 1)));
                }
            });
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            Result.a aVar = Result.Companion;
            fVar.resumeWith(Result.m3458constructorimpl(tj.a.a(false)));
        }
        Object objA = fVar.a();
        if (objA == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objA;
    }

    public final Object registerClick(String str, AdObject adObject, c<? super Boolean> cVar) throws Throwable {
        WebViewContainer webViewContainer;
        u<InputEvent> lastInputEvent;
        InputEvent value;
        r rVar;
        if (getMeasurementManager() == null) {
            return tj.a.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (webViewContainer = adPlayer.getWebViewContainer()) != null && (lastInputEvent = webViewContainer.getLastInputEvent()) != null && (value = lastInputEvent.getValue()) != null) {
            final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.registerSource(getUri(str, adObject), value, l1.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                    public void onError(Exception exc) {
                        p.j(exc, "error");
                        c<Boolean> cVar2 = fVar;
                        Result.a aVar = Result.Companion;
                        cVar2.resumeWith(Result.m3458constructorimpl(Boolean.FALSE));
                    }

                    public void onResult(Object obj) {
                        p.j(obj, "p0");
                        c<Boolean> cVar2 = fVar;
                        Result.a aVar = Result.Companion;
                        cVar2.resumeWith(Result.m3458constructorimpl(Boolean.TRUE));
                    }
                });
                rVar = r.f64562a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                Result.a aVar = Result.Companion;
                fVar.resumeWith(Result.m3458constructorimpl(tj.a.a(false)));
            }
            Object objA = fVar.a();
            if (objA == sj.a.f()) {
                tj.f.c(cVar);
            }
            return objA;
        }
        return tj.a.a(false);
    }

    public final Object registerView(String str, AdObject adObject, c<? super Boolean> cVar) throws Throwable {
        if (getMeasurementManager() == null) {
            return tj.a.a(false);
        }
        final f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        r rVar = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, l1.a(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onError(Exception exc) {
                    p.j(exc, "error");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m3458constructorimpl(Boolean.FALSE));
                }

                public void onResult(Object obj) {
                    p.j(obj, "p0");
                    c<Boolean> cVar2 = fVar;
                    Result.a aVar = Result.Companion;
                    cVar2.resumeWith(Result.m3458constructorimpl(Boolean.TRUE));
                }
            });
            rVar = r.f64562a;
        }
        if (rVar == null) {
            Result.a aVar = Result.Companion;
            fVar.resumeWith(Result.m3458constructorimpl(tj.a.a(false)));
        }
        Object objA = fVar.a();
        if (objA == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objA;
    }
}
