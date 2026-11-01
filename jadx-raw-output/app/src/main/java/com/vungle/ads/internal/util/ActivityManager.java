package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import mj.r;

/* JADX INFO: compiled from: ActivityManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003./0B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J.\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", C3426d4.a.f28413f, "deInit", "", "isAppInForeground", "Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "callback", "addListener", "Landroid/content/Intent;", "deepLinkOverrideIntent", "defaultIntent", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "adOpenCallback", "startActivitySafely", "removeListener", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityStopped", "onActivityResumed", "onActivityPaused", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "foregroundActivityCount", "I", "Z", "Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "targetActivityInfo", "Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "callbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "<init>", "()V", VastTagName.COMPANION, "LifeCycleCallback", "TargetActivityInfo", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;
    private volatile TargetActivityInfo targetActivityInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ActivityManager instance = new ActivityManager();
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();

    /* JADX INFO: compiled from: ActivityManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$Companion;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "deepLinkOverrideIntent", "defaultIntent", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "adOpenCallback", "", "startWhenForeground", "Lmj/r;", C3426d4.a.f28413f, "isForeground", "Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLifecycleListener", "removeLifecycleListener", "deInit$vungle_ads_release", "(Landroid/content/Context;)V", "deInit", "Lcom/vungle/ads/internal/util/ActivityManager;", C3605n2.f30210p, "Lcom/vungle/ads/internal/util/ActivityManager;", "getInstance$vungle_ads_release", "()Lcom/vungle/ads/internal/util/ActivityManager;", "getInstance$vungle_ads_release$annotations", "()V", "", "TAG", "Ljava/lang/String;", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }

        public final void addLifecycleListener(LifeCycleCallback lifeCycleCallback) {
            p.j(lifeCycleCallback, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            getInstance$vungle_ads_release().addListener(lifeCycleCallback);
        }

        public final void deInit$vungle_ads_release(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            getInstance$vungle_ads_release().deInit(context);
        }

        public final void init(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            getInstance$vungle_ads_release().init(context);
        }

        public final void removeLifecycleListener(LifeCycleCallback lifeCycleCallback) {
            p.j(lifeCycleCallback, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            getInstance$vungle_ads_release().removeListener(lifeCycleCallback);
        }

        public final boolean startWhenForeground(Context context, Intent deepLinkOverrideIntent, Intent defaultIntent, PresenterAdOpenCallback adOpenCallback) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new TargetActivityInfo(new WeakReference(context), deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            return false;
        }

        public final ActivityManager getInstance$vungle_ads_release() {
            return ActivityManager.instance;
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }
    }

    /* JADX INFO: compiled from: ActivityManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "", "Lmj/r;", "onForeground", "onBackground", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static class LifeCycleCallback {
        public void onBackground() {
        }

        public void onForeground() {
        }
    }

    /* JADX INFO: compiled from: ActivityManager.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "", GAMConfig.KEY_CONTEXT, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "(Ljava/lang/ref/WeakReference;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;)V", "getAdOpenCallback", "()Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "getContext", "()Ljava/lang/ref/WeakReference;", "getDeepLinkOverrideIntent", "()Landroid/content/Intent;", "getDefaultIntent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class TargetActivityInfo {
        private final PresenterAdOpenCallback adOpenCallback;
        private final WeakReference<Context> context;
        private final Intent deepLinkOverrideIntent;
        private final Intent defaultIntent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetActivityInfo copy$default(TargetActivityInfo targetActivityInfo, WeakReference weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i10 & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                presenterAdOpenCallback = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, presenterAdOpenCallback);
        }

        public final WeakReference<Context> component1() {
            return this.context;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final TargetActivityInfo copy(WeakReference<Context> context, Intent deepLinkOverrideIntent, Intent defaultIntent, PresenterAdOpenCallback adOpenCallback) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            return new TargetActivityInfo(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetActivityInfo)) {
                return false;
            }
            TargetActivityInfo targetActivityInfo = (TargetActivityInfo) other;
            return p.e(this.context, targetActivityInfo.context) && p.e(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && p.e(this.defaultIntent, targetActivityInfo.defaultIntent) && p.e(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            PresenterAdOpenCallback presenterAdOpenCallback = this.adOpenCallback;
            return iHashCode3 + (presenterAdOpenCallback != null ? presenterAdOpenCallback.hashCode() : 0);
        }

        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }

        public TargetActivityInfo(WeakReference<Context> weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            p.j(weakReference, GAMConfig.KEY_CONTEXT);
            this.context = weakReference;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = presenterAdOpenCallback;
        }

        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final WeakReference<Context> getContext() {
            return this.context;
        }

        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44958d);
        p10.startActivity(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent deepLinkOverrideIntent, Intent defaultIntent, PresenterAdOpenCallback adOpenCallback) {
        try {
            if (deepLinkOverrideIntent == null) {
                if (defaultIntent != null) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, defaultIntent);
                }
                return false;
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, deepLinkOverrideIntent);
            if (adOpenCallback != null) {
                adOpenCallback.onDeeplinkClick(true);
            }
            return true;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to start activity: " + e10);
            if (deepLinkOverrideIntent != null && adOpenCallback != null) {
                try {
                    adOpenCallback.onDeeplinkClick(false);
                    if (deepLinkOverrideIntent != null) {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, defaultIntent);
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else if (deepLinkOverrideIntent != null && defaultIntent != null) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, defaultIntent);
                return true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(bundle, "outState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.add(lifeCycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objM3458constructorimpl;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            Context applicationContext = context.getApplicationContext();
            p.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "Error initializing ActivityManager", thM3461exceptionOrNullimpl);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            Context context = targetActivityInfo.getContext().get();
            if (context != null) {
                Companion companion = INSTANCE;
                p.i(context, "it");
                companion.startWhenForeground(context, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((LifeCycleCallback) it.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((LifeCycleCallback) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(LifeCycleCallback lifeCycleCallback) {
        p.j(lifeCycleCallback, "callback");
        this.callbacks.remove(lifeCycleCallback);
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        p.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }
}
