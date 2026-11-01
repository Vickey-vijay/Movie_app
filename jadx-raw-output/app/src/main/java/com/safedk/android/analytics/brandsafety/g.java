package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class g implements AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44413a = "BrandSafetyReporter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f44414b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f44415c = null;

    private g() {
        d();
    }

    public static g a() {
        if (f44415c == null) {
            f44415c = new g();
        }
        return f44415c;
    }

    private void d() {
        com.safedk.android.analytics.b bVar = new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.g.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(g.f44413a, "Response received, response=" + bundle.toString());
            }
        };
        AppLovinBridge.registerListener(AppLovinBridge.f43425c, bVar);
        AppLovinBridge.registerListener(AppLovinBridge.f43426d, bVar);
    }

    public static void a(final Bundle bundle) {
        Logger.d(f44413a, "report image uploaded to server started");
        try {
            f44414b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle != null) {
                            if (bundle.size() > 0) {
                                Logger.d(g.f44413a, "Starting image upload report event.");
                                AppLovinBridge.reportImageUploadEvent(bundle, g.f44415c);
                                String string = bundle.getString("image_id");
                                c cVarH = b.h(string);
                                if (cVarH != null) {
                                    for (l lVar : cVarH.g()) {
                                        if (string.contains(lVar.f44513a)) {
                                            g.b(lVar, cVarH.f43777p);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(g.f44413a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                    } catch (Throwable th2) {
                        Logger.e(g.f44413a, "Caught exception while creating json data", th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f44413a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th2);
            new CrashReporter().caughtException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(l lVar, BrandSafetyUtils.AdType adType) {
        if (lVar != null) {
            a aVarA = SafeDK.getInstance().a(adType);
            if (aVarA != null) {
                Logger.d(f44413a, "Executing image cleanup request");
                aVarA.b(lVar);
            } else {
                Logger.d(f44413a, "Upload: finder not found for image cleanup request");
            }
        }
    }

    public static void b(final Bundle bundle) {
        try {
            f44414b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle != null) {
                            if (bundle.size() > 0) {
                                Logger.d(g.f44413a, "Starting url resolution report event.");
                                AppLovinBridge.reportClickUrlResolvedEvent(bundle, g.f44415c);
                            }
                        } else {
                            Logger.d(g.f44413a, "Data argument is null, which means reporting a resolved click url is not possible. ");
                        }
                    } catch (Throwable th2) {
                        Logger.e(g.f44413a, "Caught exception while creating json data", th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f44413a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public String b() {
        return AppLovinBridge.f43423a;
    }
}
