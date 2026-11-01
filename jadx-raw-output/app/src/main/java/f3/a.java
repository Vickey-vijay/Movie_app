package f3;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: UnityInterstitialEventAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialListener f52828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdapter f52829b;

    /* JADX INFO: renamed from: f3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UnityInterstitialEventAdapter.java */
    public static /* synthetic */ class C0468a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52830a;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f52830a = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52830a[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52830a[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52830a[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52830a[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void a(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f52828a == null) {
            return;
        }
        int i10 = C0468a.f52830a[adEvent.ordinal()];
        if (i10 == 1) {
            this.f52828a.onAdLoaded(this.f52829b);
            return;
        }
        if (i10 == 2) {
            this.f52828a.onAdOpened(this.f52829b);
            return;
        }
        if (i10 == 3) {
            this.f52828a.onAdClicked(this.f52829b);
        } else if (i10 == 4) {
            this.f52828a.onAdClosed(this.f52829b);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f52828a.onAdLeftApplication(this.f52829b);
        }
    }

    public a(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f52828a = mediationInterstitialListener;
        this.f52829b = mediationInterstitialAdapter;
    }
}
