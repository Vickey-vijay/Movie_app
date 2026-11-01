package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44897a = "ConfigurationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f44898b = new HashSet(Arrays.asList("CONTENTCAT", "PLAYBACKMETHODS", "STOREID", "STOREURL", "CACHEBUSTING", "TIMESTAMP", "ADCATEGORIES", "ADCOUNT", "ADTYPE", "BLOCKEDADCATEGORIES", "BREAKMAXADLENGTH", "BREAKMAXADS", "BREAKMAXDURATION", "BREAKMINADLENGTH", "BREAKPOSITION", "CONTENTPLAYHEAD", "MEDIAPLAYHEAD", "PLACEMENTTYPE", "TRANSACTIONID", "UNIVERSALADID", "CLIENTUA", "DEVICEIP", "DEVICEUA", "IFA", "IFATYPE", "LATLONG", "SERVERSIDE", "SERVERUA", "APPBUNDLE", "DOMAIN", "PAGEURL", "APIFRAMEWORKS", "CLICKTYPE", "EXTENSIONS", "MEDIAMIME", "OMIDPARTNER", "PLAYERCAPABILITIES", "VASTVERSIONS", "VERIFICATIONVENDORS", "ADPLAYHEAD", "ADSERVINGID", "ASvastMacroQueryParams.RI", "CONTENTID", "CONTENTURI", "INVENTORYSTATE", "PLAYERSIZE", "PLAYERSTATE", "PODSEQUENCE", "CLICKPOS", "ERRORCODE", "REASON", "GDPRCONSENT", "LIMITADTRACKING", "REGULATIONS"));

    public static boolean a(String str) {
        boolean z10 = false;
        com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(str);
        if (aVarI == null) {
            Logger.d(f44897a, "cannot determine config item SUPPORTS_BANNER_IMPRESSION_TRACKING for sdk " + str);
        }
        if (aVarI != null && aVarI.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING)) {
            z10 = true;
        }
        Logger.d(f44897a, "isBannerMonitoringSupported returned " + z10 + " for sdk " + str);
        return z10;
    }
}
