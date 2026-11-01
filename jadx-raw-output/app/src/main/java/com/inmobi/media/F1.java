package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes5.dex */
public abstract class F1 {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivity(p11);
    }

    public static boolean a(Context context, String str, InterfaceC3061nh interfaceC3061nh, String str2, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "url");
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str2, "api");
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        ck.p.j(str, "url");
        if (str.length() != 0) {
            Uri uri = Uri.parse(str);
            if (ck.p.e("market", uri.getScheme()) || ck.p.e("play.google.com", uri.getHost()) || ck.p.e("market.android.com", uri.getHost())) {
                Uri uri2 = Uri.parse(str);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!interfaceC3061nh.c()) {
                            interfaceC3061nh.a("EX_" + str2);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", uri2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                            if (interfaceC3028m9 != null) {
                                ((C3053n9) interfaceC3028m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e10) {
                            if (interfaceC3028m9 != null) {
                                ((C3053n9) interfaceC3028m9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e10.getMessage());
                            }
                            return false;
                        } catch (Exception e11) {
                            if (interfaceC3028m9 != null) {
                                ((C3053n9) interfaceC3028m9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e11.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.printStackTrace();
                    }
                }
                int iA = AbstractC2999l5.a(context, str, interfaceC3061nh, str2, interfaceC3028m9);
                if (iA != 0 && iA != 1) {
                    return false;
                }
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
