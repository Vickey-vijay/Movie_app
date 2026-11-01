package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTabsClient f7463b;

    public class a extends CustomTabsServiceConnection {
        public a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            f1.this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f7462a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.f7463b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f7462a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.f7463b = null;
        }
    }

    public class b extends CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7465a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f7465a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f7465a.get();
            if (aVar == null) {
                f1.this.f7462a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f7462a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                f1.this.f7462a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f7462a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackCustomTabsNavigationStarted(bVarG);
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackCustomTabsNavigationFinished(bVarG);
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackCustomTabsNavigationFailed(bVarG);
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackCustomTabsNavigationAborted(bVarG);
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    f1.this.f7462a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f7462a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            f1.this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f7462a.O();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Validation ");
                sb2.append(z10 ? "succeeded" : C3426d4.i.f28566t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public class c extends CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7467a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f7467a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f7467a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.f7462a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f7462a.O().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Native ad is null.");
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f7462a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.f7462a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f7462a.O().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            f1.this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f7462a.O();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Validation ");
                sb2.append(z10 ? "succeeded" : C3426d4.i.f28566t);
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p10, Context p11, Uri p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f44955a);
        p10.launchUrl(p11, p12);
    }

    public void b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.ga
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7575b.a(list, customTabsSession);
                }
            });
            return;
        }
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.f7462a = kVar;
    }

    public void a() {
        if (((Boolean) this.f7462a.a(x4.f9908d7)).booleanValue() && this.f7463b == null) {
            String packageName = CustomTabsClient.getPackageName(com.applovin.impl.sdk.k.o(), this.f7462a.c(x4.f9917e7), true);
            String packageName2 = CustomTabsClient.getPackageName(com.applovin.impl.sdk.k.o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f7462a.a(x4.f9926f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f7462a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7462a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g1 g1Var, CustomTabsSession customTabsSession) {
        this.f7463b.warmup(0L);
        if (g1Var == null) {
            return;
        }
        Integer numE = g1Var.e();
        String strB = g1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (customTabsSession == null) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        customTabsSession.validateRelationship(numE.intValue(), Uri.parse(strB), null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_GENERATE] */
    private void a(LinkedList linkedList) {
        boolean zBindCustomTabsService = false;
        try {
            zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!zBindCustomTabsService) {
                this.f7462a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7462a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (zBindCustomTabsService || linkedList.isEmpty()) {
                return;
            }
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
            }
        } catch (Throwable th2) {
            try {
                this.f7462a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7462a.O().a("CustomTabsManager", "Failed to bind to service", th2);
                }
            } finally {
                if (!zBindCustomTabsService && !linkedList.isEmpty()) {
                    this.f7462a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7462a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.f7463b == null) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f7463b.newSession(new b(aVar));
            a(customTabsSessionNewSession, aVar.g());
            return customTabsSessionNewSession;
        } catch (Exception e10) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    public CustomTabsSession a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f7463b == null) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f7463b.newSession(new c(appLovinNativeAdImpl));
            a(customTabsSessionNewSession, appLovinNativeAdImpl);
            return customTabsSessionNewSession;
        } catch (Exception e10) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, CustomTabsSession customTabsSession) {
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f7462a.O();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Warmup for URLs ");
            sb2.append(zMayLaunchUrl ? "succeeded" : C3426d4.i.f28566t);
            oVarO.a("CustomTabsManager", sb2.toString());
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.ea
            @Override // java.lang.Runnable
            public final void run() {
                this.f7445b.a(aVar, activity, uri);
            }
        })) {
            this.f7462a.m0().pauseForClick();
            return;
        }
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(aVar, activity), activity, uri);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new Runnable() { // from class: com.applovin.impl.da
            @Override // java.lang.Runnable
            public final void run() {
                this.f7317b.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (zA) {
            this.f7462a.m0().pauseForClick();
        } else {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
            }
            a(uri, activity);
        }
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(appLovinNativeAdImpl, activity), activity, uri);
    }

    private void a(CustomTabsSession customTabsSession, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), customTabsSession);
    }

    private void a(CustomTabsSession customTabsSession, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), customTabsSession);
    }

    private void a(final g1 g1Var, final CustomTabsSession customTabsSession) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.fa
            @Override // java.lang.Runnable
            public final void run() {
                this.f7508b.b(g1Var, customTabsSession);
            }
        });
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private CustomTabsIntent a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private CustomTabsIntent a(g1 g1Var, Bundle bundle, CustomTabsSession customTabsSession, Activity activity) {
        this.f7462a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7462a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        if (((Boolean) this.f7462a.a(x4.f9935g7)).booleanValue()) {
            int i10 = R.anim.applovin_slide_up_animation;
            int i11 = R.anim.applovin_slide_down_animation;
            builder.setStartAnimations(activity, i10, i11);
            builder.setExitAnimations(activity, i10, i11);
        }
        if (g1Var != null) {
            Integer numH = g1Var.h();
            if (numH != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(numH.intValue()).build());
            }
            Integer numA = g1Var.a();
            if (numA != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(numA.intValue()).build());
            }
            Boolean boolI = g1Var.i();
            if (boolI != null) {
                builder.setUrlBarHidingEnabled(boolI.booleanValue());
            }
            Boolean boolG = g1Var.g();
            if (boolG != null) {
                builder.setShowTitle(boolG.booleanValue());
            }
            Boolean boolC = g1Var.c();
            if (boolC != null) {
                builder.setInstantAppsEnabled(boolC.booleanValue());
            }
            Integer numF = g1Var.f();
            if (numF != null) {
                builder.setShareState(numF.intValue());
            }
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        if (g1Var != null) {
            String strD = g1Var.d();
            if (strD != null) {
                customTabsIntentBuild.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                customTabsIntentBuild.intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return customTabsIntentBuild;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f7462a.a(x4.f9944h7)).booleanValue()) {
            k7.a(uri, activity, this.f7462a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f7462a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f7462a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th2) {
            this.f7462a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7462a.O().a("CustomTabsManager", "Failed to run operation: " + str, th2);
            }
            this.f7462a.D().a("CustomTabsManager", str, th2);
            return false;
        }
    }
}
