package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.content.FileProvider;
import com.safedk.android.utils.Logger;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class TrustedWebUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";
    public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private TrustedWebUtils() {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p10, Context p11, Uri p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p12 == null) {
            return;
        }
        p10.launchUrl(p11, p12);
    }

    public static boolean areSplashScreensSupported(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage(str), 64);
        if (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void launchAsTrustedWebActivity(@NonNull Context context, @NonNull CustomTabsIntent customTabsIntent, @NonNull Uri uri) {
        if (customTabsIntent.intent.getExtras().getBinder(CustomTabsIntent.EXTRA_SESSION) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        customTabsIntent.intent.putExtra(EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntent, context, uri);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void launchBrowserSiteSettings(@NonNull Context context, @NonNull CustomTabsSession customTabsSession, @NonNull Uri uri) {
        Intent intent = new Intent(ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA);
        intent.setPackage(customTabsSession.getComponentName().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, customTabsSession.getBinder());
        intent.putExtras(bundle);
        PendingIntent id2 = customTabsSession.getId();
        if (id2 != null) {
            intent.putExtra(CustomTabsIntent.EXTRA_SESSION_ID, id2);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    @WorkerThread
    public static boolean transferSplashImage(@NonNull Context context, @NonNull File file, @NonNull String str, @NonNull String str2, @NonNull CustomTabsSession customTabsSession) {
        Uri uriForFile = FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        return customTabsSession.receiveFile(uriForFile, 1, null);
    }
}
