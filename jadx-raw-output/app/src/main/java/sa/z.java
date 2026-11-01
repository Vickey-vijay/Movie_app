package sa;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: PermissionUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class z {
    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static void a(Activity activity) {
        String str = Build.MANUFACTURER;
        if ("huawei".equalsIgnoreCase(str)) {
            c(activity);
            return;
        }
        if ("Meizu".equalsIgnoreCase(str)) {
            f(activity);
            return;
        }
        if ("Xiaomi".equalsIgnoreCase(str)) {
            k(activity);
            return;
        }
        if ("Sony".equalsIgnoreCase(str)) {
            i(activity);
            return;
        }
        if ("OPPO".equalsIgnoreCase(str)) {
            h(activity);
            return;
        }
        if ("LG".equalsIgnoreCase(str)) {
            e(activity);
            return;
        }
        if (!"Letv".equalsIgnoreCase(str)) {
            try {
                g(activity);
            } catch (Exception unused) {
                j(activity);
            }
            em.g.c("goToSetting", "目前暂不支持此系统");
        } else {
            d(activity);
            try {
                g(activity);
            } catch (Exception unused2) {
                j(activity);
            }
            em.g.c("goToSetting", "目前暂不支持此系统");
        }
    }

    public static Intent b(Activity activity) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        return intent;
    }

    public static void c(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, activity.getPackageName());
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (Exception unused) {
            g(activity);
        }
    }

    public static void d(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, activity.getPackageName());
            intent.setComponent(new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.PermissionAndApps"));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (Exception unused) {
            g(activity);
        }
    }

    public static void e(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(268435456);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, activity.getPackageName());
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (Exception unused) {
            g(activity);
        }
    }

    public static void f(Activity activity) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, activity.getPackageName());
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (Exception unused) {
            g(activity);
        }
    }

    public static void h(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, activity.getPackageName());
            intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (Exception unused) {
            g(activity);
        }
    }

    public static void i(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, activity.getPackageName());
            intent.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (Exception unused) {
            g(activity);
        }
    }

    public static void j(Activity activity) {
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent("android.settings.SETTINGS"));
    }

    public static void k(Activity activity) {
        try {
            try {
                Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", activity.getPackageName());
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
            } catch (Exception unused) {
                g(activity);
            }
        } catch (Exception unused2) {
            Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent2.putExtra("extra_pkgname", activity.getPackageName());
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent2);
        }
    }

    public static void g(Activity activity) {
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, b(activity));
    }
}
