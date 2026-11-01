package kf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ReflectionUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class n {
    @NonNull
    public static AdManagerAdRequest a(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String requestAgent = adUnit.getRequestAgent();
        if (!TextUtils.isEmpty(requestAgent)) {
            builder.setRequestAgent(requestAgent);
        }
        for (Map.Entry<String, String> entry : adUnit.getCustomTargetingMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting(key, value);
            }
        }
        return builder.build();
    }

    @NonNull
    public static BMError a(@NonNull BMError bMError, @NonNull AdError adError) {
        return new BMError(bMError, adError.getCode(), adError.getMessage());
    }

    @Nullable
    @WorkerThread
    public static InternalAdLoadData a(@Nullable BaseAdView baseAdView) {
        if (baseAdView == null) {
            return null;
        }
        Waterfall.Result.EstimatedPrice estimatedPriceA = a(baseAdView, new String[]{"zza", "zzj", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, "ae"});
        ResponseInfo responseInfo = baseAdView.getResponseInfo();
        String string = responseInfo != null ? responseInfo.toString() : null;
        if (estimatedPriceA == null && string == null) {
            return null;
        }
        return new InternalAdLoadData(estimatedPriceA, string);
    }

    @Nullable
    @WorkerThread
    public static InternalAdLoadData a(@Nullable InterstitialAd interstitialAd) {
        if (interstitialAd == null) {
            return null;
        }
        return new InternalAdLoadData(a(interstitialAd, new String[]{"zzc", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, "ae"}), interstitialAd.getResponseInfo().toString());
    }

    @Nullable
    @WorkerThread
    public static InternalAdLoadData a(@Nullable RewardedAd rewardedAd) {
        if (rewardedAd == null) {
            return null;
        }
        return new InternalAdLoadData(a(rewardedAd, new String[]{"zzb", "zza", "b", CampaignEx.JSON_KEY_AD_K, "ae"}), rewardedAd.getResponseInfo().toString());
    }

    @NonNull
    public static Waterfall.Result.EstimatedPrice a(@NonNull AdValue adValue) {
        return Waterfall.Result.EstimatedPrice.newBuilder().setValue(DoubleValue.newBuilder().setValue(adValue.getValueMicros()).build()).setCurrency(StringValue.newBuilder().setValue(adValue.getCurrencyCode()).build()).setPrecision(UInt32Value.newBuilder().setValue(adValue.getPrecisionType()).build()).build();
    }

    @Nullable
    @WorkerThread
    public static Waterfall.Result.EstimatedPrice a(@NonNull Object obj, @NonNull String[] strArr) {
        try {
            Object objFindValueByPath = ReflectionUtils.findValueByPath(obj, strArr);
            if (objFindValueByPath == null) {
                return null;
            }
            Integer num = (Integer) ReflectionUtils.findValue(objFindValueByPath, "b");
            String str = (String) ReflectionUtils.findValue(objFindValueByPath, "c");
            Number number = (Number) ReflectionUtils.findValue(objFindValueByPath, "d");
            Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            if (num == null && str == null && dValueOf == null) {
                return null;
            }
            Waterfall.Result.EstimatedPrice.Builder builderNewBuilder = Waterfall.Result.EstimatedPrice.newBuilder();
            if (dValueOf != null) {
                builderNewBuilder.setValue(DoubleValue.newBuilder().setValue(dValueOf.doubleValue()).build());
            }
            if (str != null) {
                builderNewBuilder.setCurrency(StringValue.newBuilder().setValue(str).build());
            }
            if (num != null) {
                builderNewBuilder.setPrecision(UInt32Value.newBuilder().setValue(num.intValue()).build());
            }
            return builderNewBuilder.build();
        } catch (Throwable unused) {
            return null;
        }
    }
}
