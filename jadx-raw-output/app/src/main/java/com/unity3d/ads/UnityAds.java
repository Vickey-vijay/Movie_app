package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.utils.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Result;
import kotlin.c;
import mj.r;

/* JADX INFO: compiled from: UnityAds.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final void initialize(Context context, String str) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, false, null);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void load(String str) {
        try {
            Result.a aVar = Result.Companion;
            load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String str2) {
                    p.j(str2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String str2, UnityAds.UnityAdsLoadError unityAdsLoadError, String str3) {
                    p.j(str2, "placementId");
                    p.j(unityAdsLoadError, "error");
                    p.j(str3, "message");
                }
            });
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    public static final void show(Activity activity, String str) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    public static final void getToken(final IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) == null || iUnityAdsTokenListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: kc.e
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.getToken$lambda$30$lambda$29$lambda$28(iUnityAdsTokenListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$30$lambda$29$lambda$28(IUnityAdsTokenListener iUnityAdsTokenListener) {
        p.j(iUnityAdsTokenListener, "$tokenListener");
        iUnityAdsTokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$33$lambda$32(IUnityAdsTokenListener iUnityAdsTokenListener) {
        p.j(iUnityAdsTokenListener, "$listener");
        iUnityAdsTokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th2) {
        p.j(iUnityAdsInitializationListener, "$listener");
        p.j(th2, "$exception");
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th2) {
        p.j(iUnityAdsInitializationListener, "$listener");
        p.j(th2, "$exception");
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th2) {
        p.j(iUnityAdsLoadListener, "$loadListener");
        p.j(th2, "$exception");
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$26$lambda$25$lambda$24(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th2) {
        p.j(iUnityAdsLoadListener, "$loadListener");
        p.j(th2, "$exception");
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th2.getMessage());
    }

    public static final void setDebugMode(boolean z10) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().setDebugMode(z10);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th2) {
        p.j(iUnityAdsShowListener, "$listener");
        p.j(th2, "$exception");
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th2.getMessage());
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        p.i(version, "getInstance().version");
        return version;
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static final void initialize(Context context, String str, final IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        final Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: kc.g
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(iUnityAdsInitializationListener, thM3461exceptionOrNullimpl);
            }
        });
    }

    public static final void load(final String str, final IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        final Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: kc.d
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$22$lambda$21$lambda$20(iUnityAdsLoadListener, str, thM3461exceptionOrNullimpl);
            }
        });
    }

    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    public static final void getToken(TokenConfiguration tokenConfiguration, final IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object objM3458constructorimpl;
        p.j(tokenConfiguration, i.f44984c);
        p.j(iUnityAdsTokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().getToken(tokenConfiguration, iUnityAdsTokenListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: kc.a
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAds.getToken$lambda$33$lambda$32(iUnityAdsTokenListener);
                }
            });
        }
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    public static final void initialize(Context context, String str, boolean z10) {
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, z10, null);
            Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(c.a(th2));
        }
    }

    public static final void load(final String str, UnityAdsLoadOptions unityAdsLoadOptions, final IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (unityAdsLoadOptions == null) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        final Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: kc.c
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$26$lambda$25$lambda$24(iUnityAdsLoadListener, str, thM3461exceptionOrNullimpl);
            }
        });
    }

    public static final void show(Activity activity, final String str, UnityAdsShowOptions unityAdsShowOptions, final IUnityAdsShowListener iUnityAdsShowListener) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        final Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null || iUnityAdsShowListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: kc.b
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.show$lambda$16$lambda$15$lambda$14(iUnityAdsShowListener, str, thM3461exceptionOrNullimpl);
            }
        });
    }

    public static final void initialize(Context context, String str, boolean z10, final IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            UnityAdsImplementation.getInstance().initialize(context, str, z10, iUnityAdsInitializationListener);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        final Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: kc.f
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(iUnityAdsInitializationListener, thM3461exceptionOrNullimpl);
            }
        });
    }
}
