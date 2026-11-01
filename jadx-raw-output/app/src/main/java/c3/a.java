package c3;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: PangleConstants.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    @NonNull
    public static AdError a(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.google.ads.mediation.pangle");
    }

    public static AdError b() {
        return new AdError(103, "MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.", "com.google.ads.mediation.pangle");
    }

    @NonNull
    public static AdError c(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.pangle.ads");
    }

    public static boolean d() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            return true;
        }
        return false;
    }
}
