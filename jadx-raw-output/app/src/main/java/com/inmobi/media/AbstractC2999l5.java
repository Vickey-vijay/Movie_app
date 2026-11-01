package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2999l5 {
    public static int a(Context context, String str, InterfaceC3061nh interfaceC3061nh, String str2, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "url");
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str2, "api");
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (str.length() == 0) {
            if (interfaceC3028m9 == null) {
                return 2;
            }
            ((C3053n9) interfaceC3028m9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listA = AbstractC3296x3.a(context, str);
            if (listA.isEmpty()) {
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, str, interfaceC3061nh, str2, interfaceC3028m9);
            }
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listA.get(0)).activityInfo.name);
            }
            return a(context, str, (ResolveInfo) listA.get(0), interfaceC3061nh, str2, interfaceC3028m9);
        } catch (URISyntaxException unused) {
            if (interfaceC3028m9 == null) {
                return 5;
            }
            ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            return 5;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivity(p11);
    }

    public static int b(Context context, String str, InterfaceC3061nh interfaceC3061nh, String str2, InterfaceC3028m9 interfaceC3028m9) {
        try {
            return AbstractC3296x3.a(context, str, interfaceC3061nh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC3061nh, str2, interfaceC3028m9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, interfaceC3061nh, str2, interfaceC3028m9);
        } catch (SecurityException unused3) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }

    public static boolean a(String str, Context context, InterfaceC3061nh interfaceC3061nh, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(str, "url");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        C3298x5.f25687a.getClass();
        if (!C3298x5.r() || !interfaceC3061nh.a()) {
            return false;
        }
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            ck.p.i(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            ck.p.j(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            ck.p.j(intent, "<this>");
            intent.setFlags(268436992);
            ck.p.j(intent, "<this>");
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            if (interfaceC3028m9 == null) {
                return true;
            }
            ((C3053n9) interfaceC3028m9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3061nh interfaceC3061nh, String str2, InterfaceC3028m9 interfaceC3028m9) {
        try {
            return AbstractC3296x3.a(context, str, resolveInfo, interfaceC3061nh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }
}
