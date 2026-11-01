package com.google.ads.mediation.unity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.safedk.android.internal.d;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAdsAdapterUtils {

    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f18939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f18940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f18941d;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            f18941d = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18941d[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            f18940c = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18940c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18940c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18940c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18940c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            f18939b = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18939b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18939b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            f18938a = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f18938a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f18938a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f18938a[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    @NonNull
    public static AdError b(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.unity3d.ads");
    }

    public static int g(@NonNull UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i10 = a.f18939b[unityAdsInitializationError.ordinal()];
        if (i10 == 1) {
            return 301;
        }
        if (i10 == 2) {
            return 302;
        }
        if (i10 != 3) {
            return d.f44769a;
        }
        return 303;
    }

    public static int h(@NonNull UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i10 = a.f18940c[unityAdsLoadError.ordinal()];
        if (i10 == 1) {
            return 401;
        }
        if (i10 == 2) {
            return 402;
        }
        if (i10 == 3) {
            return 403;
        }
        if (i10 != 4) {
            return i10 != 5 ? 400 : 405;
        }
        return 404;
    }

    public static int i(@NonNull UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (a.f18941d[unityAdsShowError.ordinal()]) {
            case 1:
                return 501;
            case 2:
                return 502;
            case 3:
                return 503;
            case 4:
                return 504;
            case 5:
                return 505;
            case 6:
                return 506;
            case 7:
                return 507;
            case 8:
                return 508;
            default:
                return 500;
        }
    }

    public static int j(@NonNull BannerErrorInfo bannerErrorInfo) {
        int i10 = a.f18938a[bannerErrorInfo.errorCode.ordinal()];
        if (i10 == 1) {
            return 201;
        }
        if (i10 == 2) {
            return 202;
        }
        if (i10 != 3) {
            return i10 != 4 ? 200 : 204;
        }
        return 203;
    }

    @Nullable
    public static UnityBannerSize k(@NonNull Context context, @NonNull AdSize adSize, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize != null) {
            return new UnityBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
        }
        if (z10) {
            return new UnityBannerSize(adSize.getWidth(), adSize.getHeight());
        }
        return null;
    }

    public static void l(int i10, @NonNull Context context) throws JSONException {
        MetaData metaData = new MetaData(context);
        if (i10 == 0) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    @NonNull
    public static AdError c(@NonNull UnityAds.UnityAdsInitializationError unityAdsInitializationError, @NonNull String str) {
        return b(g(unityAdsInitializationError), str);
    }

    @NonNull
    public static AdError d(@NonNull UnityAds.UnityAdsLoadError unityAdsLoadError, @NonNull String str) {
        return b(h(unityAdsLoadError), str);
    }

    @NonNull
    public static AdError e(@NonNull UnityAds.UnityAdsShowError unityAdsShowError, @NonNull String str) {
        return b(i(unityAdsShowError), str);
    }

    @Nullable
    public static AdFormat f(RtbSignalData rtbSignalData) {
        Iterator<MediationConfiguration> it = rtbSignalData.getConfigurations().iterator();
        if (it.hasNext()) {
            return it.next().getFormat();
        }
        return null;
    }
}
