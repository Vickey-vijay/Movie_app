package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.utils.Logger;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CommonClickUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f32797a = new a(Looper.getMainLooper());

    /* JADX INFO: compiled from: CommonClickUtil.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32799b;

        public b(Context context, String str) {
            this.f32798a = context;
            this.f32799b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f0.class.getMethod("mia", Context.class, String.class);
                Context context = this.f32798a;
                if (context != null) {
                    method.invoke(null, context, this.f32799b);
                } else {
                    q0.b("CommonClickUtil", "Context is null");
                }
            } catch (Throwable th2) {
                q0.b("CommonClickUtil", th2.getMessage());
            }
        }
    }

    public static boolean a(CampaignEx campaignEx) {
        return d.a(campaignEx);
    }

    public static void b(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo next;
        try {
            if (TextUtils.isEmpty(str) || !a(context, str) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) == null || listQueryIntentActivities.size() <= 0 || (next = listQueryIntentActivities.iterator().next()) == null) {
                return;
            }
            ActivityInfo activityInfo = next.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Exception e10) {
            if (com.mbridge.msdk.util.b.a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e10.printStackTrace();
        }
    }

    public static boolean d(Context context, String str) {
        Intent intent;
        try {
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                if (uri.getScheme().equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (uri.getScheme().equals("android-app")) {
                    intent = Intent.parseUri(str, 2);
                } else {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (a(context, intent)) {
                        return true;
                    }
                    intent.setFlags(268435456);
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                    return true;
                }
            }
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage(), th2);
        }
        return false;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44969o);
        p10.startActivity(p11);
    }

    /* JADX INFO: compiled from: CommonClickUtil.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String str2;
            String string;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    Bundle data = message.getData();
                    if (data == null) {
                        str = "";
                        str2 = str;
                        string = str2;
                    } else {
                        String string2 = data.getString(ImpressionLog.f43648x);
                        String string3 = data.getString("rid_n");
                        string = data.getString("cid");
                        str = string2;
                        str2 = string3;
                    }
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(i10, i11, str, str2, string);
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public static String a(String str, String str2, String str3) {
        Map<String, com.mbridge.msdk.setting.b.a> mapL;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null || (mapL = gVarD.l()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            Iterator<Map.Entry<String, com.mbridge.msdk.setting.b.a>> it = mapL.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!TextUtils.isEmpty(key) && host.contains(key)) {
                    com.mbridge.msdk.setting.b.a aVar = mapL.get(key);
                    return aVar != null ? a(a(a(a(str, aVar.a(), String.valueOf(m0.m(com.mbridge.msdk.foundation.controller.c.n().d()))), aVar.b(), String.valueOf(m0.n(com.mbridge.msdk.foundation.controller.c.n().d()))), aVar.c(), str2), aVar.d(), str3) : str;
                }
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static void c(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static void e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            int i10 = MBCommonActivity.f32534e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof ContextThemeWrapper)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (ClassNotFoundException e10) {
            q0.b("CommonClickUtil", e10.getMessage());
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage());
        }
    }

    private static String a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    public static boolean a(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            if (context instanceof Activity) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return true;
            }
            if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
                if (!(contextF instanceof Activity)) {
                    return false;
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(contextF, intent);
                return true;
            }
            return false;
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage(), th2);
        }
    }

    public static void a(Context context, int i10, String str) {
        if (i10 == 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b(context, str));
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage());
        }
    }
}
