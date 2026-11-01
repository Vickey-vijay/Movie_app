package t2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: InMobiAdapterUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: compiled from: InMobiAdapterUtils.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72175a;

        static {
            int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
            f72175a = iArr;
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f72175a[InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public static void a(Bundle bundle) {
        InMobiSdk.AgeGroup ageGroupC;
        InMobiSdk.Education educationD;
        if (bundle == null) {
            Log.d(InMobiMediationAdapter.TAG, "Bundle extras are null");
            bundle = new Bundle();
        }
        String str = "";
        String str2 = str;
        String str3 = str2;
        for (String str4 : bundle.keySet()) {
            String string = bundle.getString(str4);
            if (str4.equals("AREA_CODE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setAreaCode(string);
                }
            } else if (str4.equals("AGE")) {
                try {
                    if (!"".equals(string)) {
                        InMobiSdk.setAge(Integer.parseInt(string));
                    }
                } catch (NumberFormatException e10) {
                    Log.d(InMobiMediationAdapter.TAG, "Please Set age properly", e10);
                }
            } else if (str4.equals("POSTAL_CODE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setPostalCode(string);
                }
            } else if (str4.equals("LANGUAGE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setLanguage(string);
                }
            } else if (str4.equals("CITY")) {
                str = string;
            } else if (str4.equals("STATE")) {
                str2 = string;
            } else if (str4.equals("COUNTRY")) {
                str3 = string;
            } else if (str4.equals("AGE_GROUP")) {
                if (string != null && (ageGroupC = c(string)) != null) {
                    InMobiSdk.setAgeGroup(ageGroupC);
                }
            } else if (str4.equals("EDUCATION")) {
                if (string != null && (educationD = d(string)) != null) {
                    InMobiSdk.setEducation(educationD);
                }
            } else if (str4.equals("LOGLEVEL")) {
                if (string != null) {
                    InMobiSdk.setLogLevel(e(string));
                } else {
                    InMobiSdk.setLogLevel(InMobiSdk.LogLevel.NONE);
                }
            } else if (str4.equals("INTERESTS")) {
                InMobiSdk.setInterests(string);
            }
        }
        if (Objects.equals(str, "") || Objects.equals(str2, "") || Objects.equals(str3, "")) {
            return;
        }
        InMobiSdk.setLocationWithCityStateCountry(str, str2, str3);
    }

    @Nullable
    public static AdSize b(@NonNull Context context, @NonNull AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new AdSize(com.safedk.android.internal.d.f44769a, 250));
        arrayList.add(new AdSize(728, 90));
        return MediationUtils.findClosestSize(context, adSize, arrayList);
    }

    @VisibleForTesting
    public static InMobiSdk.LogLevel e(String str) {
        if (str.equals("LOGLEVEL_DEBUG")) {
            return InMobiSdk.LogLevel.DEBUG;
        }
        return str.equals("LOGLEVEL_ERROR") ? InMobiSdk.LogLevel.ERROR : InMobiSdk.LogLevel.NONE;
    }

    public static int f(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        switch (a.f72175a[inMobiAdRequestStatus.getStatusCode().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            default:
                return 99;
        }
    }

    public static long g(@NonNull Bundle bundle) {
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            Log.e(InMobiMediationAdapter.TAG, "Missing or invalid Placement ID.");
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException e10) {
            Log.e(InMobiMediationAdapter.TAG, "Invalid Placement ID.", e10);
            return 0L;
        }
    }

    public static void h() {
        i(new n());
    }

    @VisibleForTesting
    public static InMobiSdk.AgeGroup c(String str) {
        str.hashCode();
        switch (str) {
            case "BETWEEN_55_AND_65":
                return InMobiSdk.AgeGroup.BETWEEN_55_AND_65;
            case "ABOVE_65":
                return InMobiSdk.AgeGroup.ABOVE_65;
            case "BELOW_18":
                return InMobiSdk.AgeGroup.BELOW_18;
            case "BETWEEN_25_AND_29":
                return InMobiSdk.AgeGroup.BETWEEN_25_AND_29;
            case "BETWEEN_45_AND_54":
                return InMobiSdk.AgeGroup.BETWEEN_45_AND_54;
            case "BETWEEN_30_AND_34":
                return InMobiSdk.AgeGroup.BETWEEN_30_AND_34;
            case "BETWEEN_35_AND_44":
                return InMobiSdk.AgeGroup.BETWEEN_35_AND_44;
            case "BETWEEN_18_AND_24":
                return InMobiSdk.AgeGroup.BETWEEN_18_AND_24;
            default:
                return null;
        }
    }

    @VisibleForTesting
    public static InMobiSdk.Education d(String str) {
        str.hashCode();
        switch (str) {
            case "EDUCATION_COLLEGEORGRADUATE":
                return InMobiSdk.Education.COLLEGE_OR_GRADUATE;
            case "EDUCATION_POSTGRADUATEORABOVE":
                return InMobiSdk.Education.POST_GRADUATE_OR_ABOVE;
            case "EDUCATION_HIGHSCHOOLORLESS":
                return InMobiSdk.Education.HIGH_SCHOOL_OR_LESS;
            default:
                return null;
        }
    }

    @VisibleForTesting
    public static void i(n nVar) {
        if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1) {
            nVar.e(Boolean.TRUE);
        } else if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 0) {
            nVar.e(Boolean.FALSE);
        }
    }

    @Nullable
    public static AdError j(@Nullable String str, long j10) {
        if (!TextUtils.isEmpty(str) && j10 > 0) {
            return null;
        }
        AdError adErrorA = g.a(100, "Missing or invalid Account ID or Placement ID for this ad source instance in the AdMob or Ad Manager UI.");
        Log.e(InMobiMediationAdapter.TAG, adErrorA.toString());
        return adErrorA;
    }
}
