package gl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.rewarded.RewardedAdPreloader;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile j0 f53509m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53510a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f53511b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53512c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53513d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IComCallback f53514e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53515f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f53516g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53517h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f53518i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53519j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f53520k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1 f53521l = new l1(this);

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public final void h(boolean z10, String str, IComCallback iComCallback) {
        if (iComCallback != null) {
            try {
                if (!z10) {
                    iComCallback.onFailed(-1, str);
                } else if (!this.f53513d) {
                    this.f53513d = true;
                    iComCallback.onSuccess();
                }
                this.f53512c = false;
                if (this.f53511b.isEmpty()) {
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                iComCallback.onFailed(-1, e10.getMessage());
            } finally {
                this.f53512c = false;
                if (!this.f53511b.isEmpty()) {
                    ((Runnable) this.f53511b.poll()).run();
                }
            }
        } else {
            this.f53512c = false;
            if (this.f53511b.isEmpty()) {
            }
        }
    }

    public static j0 a() {
        if (f53509m == null) {
            synchronized (j0.class) {
                if (f53509m == null) {
                    f53509m = new j0();
                }
            }
        }
        return f53509m;
    }

    public final /* synthetic */ void b(final Activity activity, final ConsentInformation consentInformation, final IComCallback iComCallback) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: gl.i0
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                this.f53503a.e(consentInformation, activity, iComCallback, formError);
            }
        });
    }

    public final void c(final Activity activity, final IComCallback iComCallback) {
        try {
            ConsentRequestParameters consentRequestParametersBuild = new ConsentRequestParameters.Builder().build();
            final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
            consentInformation.requestConsentInfoUpdate(activity, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: gl.g0
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    this.f53489a.b(activity, consentInformation, iComCallback);
                }
            }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: gl.h0
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                public final void onConsentInfoUpdateFailure(FormError formError) {
                    this.f53498a.f(iComCallback, formError);
                }
            });
            if (consentInformation.canRequestAds()) {
                if (this.f53515f) {
                    AdLog.i("Admob utils has success");
                    h(true, "", iComCallback);
                    d(activity);
                } else {
                    MobileAds.initialize(activity, new t0(this, System.currentTimeMillis(), iComCallback, activity));
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            if (iComCallback != null) {
                iComCallback.onFailed(-1, e10.getMessage());
            }
        }
    }

    public final void e(ConsentInformation consentInformation, Activity activity, IComCallback iComCallback, FormError formError) {
        if (formError != null) {
            AdLog.w(formError.getErrorCode() + ": " + formError.getMessage());
        }
        if (consentInformation.canRequestAds()) {
            if (!this.f53515f) {
                MobileAds.initialize(activity, new t0(this, System.currentTimeMillis(), iComCallback, activity));
                return;
            }
            AdLog.i("Admob utils has success");
            h(true, "", iComCallback);
            d(activity);
        }
    }

    public final void d(Context context) {
        try {
            g(a.d.c().k(context, 16), a.d.c().k(context, 14));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void f(IComCallback iComCallback, FormError formError) {
        String str = formError.getErrorCode() + ": " + formError.getMessage();
        AdLog.w(str);
        h(false, str, iComCallback);
    }

    public final void g(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (this.f53518i) {
                    AdLog.i("admob inter preload is start");
                } else {
                    this.f53518i = true;
                    InterstitialAdPreloader.start(str, new PreloadConfiguration.Builder(str).setBufferSize(this.f53520k).build(), new p("interstitial", str));
                    AdLog.i("admob startPreload add inter");
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                if (this.f53519j) {
                    AdLog.i("admob reward preload is start");
                    return;
                }
                this.f53519j = true;
                RewardedAdPreloader.start(str2, new PreloadConfiguration.Builder(str2).setBufferSize(this.f53520k).build(), new p("reward", str2));
                AdLog.i("admob startPreload add reward");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
