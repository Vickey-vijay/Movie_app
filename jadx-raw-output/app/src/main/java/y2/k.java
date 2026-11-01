package y2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.adapters.mintegral.BuildConfig;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MintegralUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f75257a = "k";

    public static String c() {
        return BuildConfig.VERSION_NAME;
    }

    public static String e() {
        return MBConfiguration.SDK_VERSION;
    }

    public static List<i> d(RtbSignalData rtbSignalData) {
        ArrayList arrayList = new ArrayList();
        for (MediationConfiguration mediationConfiguration : rtbSignalData.getConfigurations()) {
            String string = mediationConfiguration.getServerParameters().getString("ad_unit_id");
            String string2 = mediationConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                arrayList.add(new i(string, string2));
            }
        }
        return arrayList;
    }

    public static boolean f(@NonNull Bundle bundle) {
        return bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }

    public static void a(Context context, MBridgeSDK mBridgeSDK) {
        boolean z10 = true;
        if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() != 1) {
            z10 = false;
        }
        mBridgeSDK.setCoppaStatus(context, z10);
    }

    public static int b(@NonNull Context context, float f10) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f10 + 0.5f, resources.getDisplayMetrics());
    }

    @Nullable
    public static AdError g(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = d.a(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(f75257a, adErrorA.toString());
            return adErrorA;
        }
        if (TextUtils.isEmpty(str2)) {
            AdError adErrorA2 = d.a(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(f75257a, adErrorA2.toString());
            return adErrorA2;
        }
        return null;
    }

    @Nullable
    public static AdError h(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        AdError adErrorG = g(str, str2);
        if (adErrorG != null) {
            return adErrorG;
        }
        if (TextUtils.isEmpty(str3)) {
            AdError adErrorA = d.a(103, "Missing or invalid Mintegral bidding signal in this ad request.");
            Log.w(f75257a, adErrorA.toString());
            return adErrorA;
        }
        return null;
    }
}
