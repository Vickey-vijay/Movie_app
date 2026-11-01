package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.app.NotificationCompat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC2746b5 {
    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p10, Context p11, Uri p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f44963i);
        p10.launchUrl(p11, p12);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public static void a(Context context, CustomTabsIntent customTabsIntent, Uri uri, Rh rh2, Ya ya2, InterfaceC3061nh interfaceC3061nh, String str) {
        int iA;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(customTabsIntent, "customTabsIntent");
        ck.p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str, "api");
        String strA = AbstractC2875g5.a(context);
        try {
            try {
                if (strA == null) {
                    ck.p.i("e5", "access$getLOG_TAG$cp(...)");
                    if (rh2 != null) {
                        String string = uri.toString();
                        ck.p.i(string, "toString(...)");
                        ck.p.j(string, "url");
                        ck.p.j(str, "api");
                        rh2.f23466a.getLandingPageHandler().a(string, str, ya2);
                        return;
                    }
                    return;
                }
                customTabsIntent.intent.setFlags(268435456);
                customTabsIntent.intent.setPackage(strA);
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntent, context, uri);
                if (ya2 != null) {
                    ya2.f23836f = "IN_NATIVE";
                }
                if (rh2 != null) {
                    J2.a(rh2, Na.LPStartSuccess, ya2);
                }
            } catch (Exception unused) {
                String string2 = uri.toString();
                ck.p.i(string2, "toString(...)");
                iA = AbstractC3296x3.a(context, string2, interfaceC3061nh, str);
                if (ya2 != null) {
                    ya2.f23836f = "EX_NATIVE";
                }
                if (iA != 0 || iA == 1) {
                    if (rh2 != null) {
                        J2.a(rh2, Na.LPStartSuccess, ya2);
                    }
                } else if (rh2 != null) {
                    Na na2 = Na.LPBrowserOpenFailed;
                    Integer numValueOf = Integer.valueOf(iA);
                    ck.p.j(na2, "landingPageFunnelState");
                    rh2.f23466a.getLandingPageHandler().a(na2, ya2, numValueOf);
                }
            }
        } catch (Exception unused2) {
            iA = 9;
            if (ya2 != null) {
                ya2.f23836f = "EX_NATIVE";
            }
            if (iA != 0) {
            }
            if (rh2 != null) {
                J2.a(rh2, Na.LPStartSuccess, ya2);
            }
        }
    }
}
