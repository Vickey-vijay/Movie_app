package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3296x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25683a = 0;

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3061nh interfaceC3061nh, String str2) throws URISyntaxException {
        ck.p.j(str, "url");
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str2, "api");
        if (context == null) {
            return 7;
        }
        if (!interfaceC3061nh.c()) {
            interfaceC3061nh.a("EX_" + str2);
            return 8;
        }
        Intent uri = Intent.parseUri(str, 3);
        ck.p.i(uri, "parseUri(...)");
        C3298x5.f25687a.getClass();
        if (C3298x5.t() && uri.getAction() == null) {
            uri.setAction("android.intent.action.VIEW");
        }
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    uri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        uri.setFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, uri);
        return 0;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivity(p11);
    }

    public static int a(Context context, String str, InterfaceC3061nh interfaceC3061nh, String str2) throws URISyntaxException {
        ck.p.j(str, "url");
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str2, "api");
        if (context == null) {
            return 7;
        }
        if (!interfaceC3061nh.c()) {
            interfaceC3061nh.a("EX_" + str2);
            return 8;
        }
        try {
            Intent uri = Intent.parseUri(str, 0);
            uri.setFlags(268435456);
            C3298x5.f25687a.getClass();
            if (C3298x5.t() && uri.getAction() == null) {
                uri.setAction("android.intent.action.VIEW");
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, uri);
            return 0;
        } catch (ActivityNotFoundException e10) {
            Uri uri2 = Uri.parse(str);
            ck.p.i(uri2, "Uri.parse(this)");
            String strA = a(str);
            if (ck.p.e("intent", uri2.getScheme()) && strA != null && strA.length() != 0) {
                return a(context, strA, interfaceC3061nh, str2);
            }
            throw e10;
        } catch (NullPointerException e11) {
            Uri uri3 = Uri.parse(str);
            ck.p.i(uri3, "Uri.parse(this)");
            String strA2 = a(str);
            if (ck.p.e("intent", uri3.getScheme()) && strA2 != null && strA2.length() != 0) {
                return a(context, strA2, interfaceC3061nh, str2);
            }
            throw e11;
        }
    }

    public static int a(Ra ra2, InterfaceC3061nh interfaceC3061nh, String str) {
        PackageManager packageManager;
        ck.p.j(ra2, "validationResult");
        ck.p.j(interfaceC3061nh, "redirectionValidator");
        ck.p.j(str, "api");
        if (!interfaceC3061nh.c()) {
            interfaceC3061nh.a("EX_" + str);
            return 8;
        }
        Activity activity = ra2.f23445a;
        String str2 = ra2.f23446b;
        boolean z10 = ra2.f23448d;
        String str3 = ra2.f23447c;
        if (lk.a0.n0(str2)) {
            return 2;
        }
        ck.p.i("x3", "TAG");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse(str2));
        intent.putExtra("overlay", z10);
        intent.putExtra("callerId", str3);
        try {
            packageManager = activity.getPackageManager();
        } catch (Exception unused) {
            packageManager = null;
        }
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            return 6;
        }
        try {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, 0);
            ck.p.i("x3", "TAG");
            intent.toString();
            return 0;
        } catch (ActivityNotFoundException unused2) {
            return 6;
        } catch (NullPointerException unused3) {
            return 13;
        } catch (SecurityException unused4) {
            return 12;
        } catch (URISyntaxException unused5) {
            return 5;
        } catch (Exception unused6) {
            return 9;
        }
    }

    public static String a(String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            C3298x5.f25687a.getClass();
            if (C3298x5.t() && uri.getAction() == null) {
                uri.setAction("android.intent.action.VIEW");
            }
            return uri.getStringExtra("browser_fallback_url");
        } catch (URISyntaxException e10) {
            ck.p.i("x3", "TAG");
            e10.getMessage();
            return null;
        }
    }

    public static boolean a(Uri uri) {
        ck.p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return ck.p.e("http", uri.getScheme()) || ck.p.e("https", uri.getScheme());
    }

    public static List a(Context context, String str) throws URISyntaxException {
        ck.p.j(str, "url");
        if (str.length() == 0 || context == null) {
            return nj.s.k();
        }
        Intent uri = Intent.parseUri(str, 3);
        ck.p.i(uri, "parseUri(...)");
        C3298x5.f25687a.getClass();
        if (C3298x5.t() && uri.getAction() == null) {
            uri.setAction("android.intent.action.VIEW");
        }
        List<ResolveInfo> listQueryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, uri, 0);
        ck.p.i(listQueryIntentActivityOptions, "queryIntentActivityOptions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
