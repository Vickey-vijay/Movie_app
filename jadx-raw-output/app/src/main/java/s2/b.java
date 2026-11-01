package s2;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: DTExchangeErrorCodes.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f66982a = new b();

    /* JADX INFO: compiled from: DTExchangeErrorCodes.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OnFyberMarketplaceInitializedListener.FyberInitStatus.values().length];
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InneractiveErrorCode.values().length];
            try {
                iArr2[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InneractiveErrorCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InneractiveErrorCode.UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AdError a(InneractiveErrorCode inneractiveErrorCode) {
        p.j(inneractiveErrorCode, "inneractiveErrorCode");
        int i10 = 399;
        switch (a.$EnumSwitchMapping$1[inneractiveErrorCode.ordinal()]) {
            case 1:
                i10 = com.safedk.android.internal.d.f44769a;
                break;
            case 2:
                i10 = 301;
                break;
            case 3:
                i10 = 302;
                break;
            case 4:
                i10 = 303;
                break;
            case 5:
                i10 = 304;
                break;
            case 6:
                i10 = 305;
                break;
            case 7:
                i10 = 306;
                break;
            case 8:
                i10 = 307;
                break;
            case 9:
                i10 = 308;
                break;
            case 10:
                i10 = 309;
                break;
            case 11:
                i10 = 310;
                break;
            case 12:
                i10 = 311;
                break;
            case 13:
                i10 = 312;
                break;
            case 14:
                i10 = 313;
                break;
            case 15:
                i10 = 314;
                break;
            case 16:
                i10 = 315;
                break;
            case 17:
                i10 = 316;
                break;
            case 18:
                i10 = 317;
                break;
        }
        return new AdError(i10, "DT Exchange failed to request ad with reason: " + inneractiveErrorCode, "com.google.ads.mediation.dtexchange");
    }

    public static final AdError b(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        int i10;
        p.j(fyberInitStatus, "initStatus");
        int i11 = a.$EnumSwitchMapping$0[fyberInitStatus.ordinal()];
        if (i11 == 1) {
            i10 = 200;
        } else if (i11 == 2) {
            i10 = 201;
        } else if (i11 != 3) {
            i10 = i11 != 4 ? 299 : 203;
        } else {
            i10 = 202;
        }
        return new AdError(i10, "DT Exchange failed to initialize with reason: " + fyberInitStatus, "com.google.ads.mediation.dtexchange");
    }
}
