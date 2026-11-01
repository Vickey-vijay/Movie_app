package io.bidmachine.util.appintents;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.Executable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: IntentUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J*\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/bidmachine/util/appintents/IntentUtils;", "", "()V", "STORE_PACKAGE", "", "findAndSetIntentComponent", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "findComponentName", "Landroid/content/ComponentName;", "findEndpointAndOpenUrl", "url", "postMethod", "Lio/bidmachine/util/Executable;", "findStoreComponentName", "resolveInfoList", "", "Landroid/content/pm/ResolveInfo;", "openUrl", "uriToIntent", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Landroid/net/Uri;", "urlToIntent", "bidmachine-android-util_c_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();
    private static final String STORE_PACKAGE = "com.android.vending";

    private IntentUtils() {
    }

    public static final boolean findAndSetIntentComponent(Context context, Intent intent) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intent, "intent");
        return IntentUtilsKt.findAndSetIntentComponent(context, intent);
    }

    public static final ComponentName findComponentName(Context context, Intent intent) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intent, "intent");
        return IntentUtilsKt.findComponentName(context, intent);
    }

    public static final boolean findEndpointAndOpenUrl(Context context, String url, Executable<Boolean> postMethod) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return IntentUtilsKt.findEndpointAndOpenUrl(context, url, postMethod);
    }

    public static final ComponentName findStoreComponentName(List<? extends ResolveInfo> resolveInfoList) {
        Object next;
        p.j(resolveInfoList, "resolveInfoList");
        Iterator<T> it = resolveInfoList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p.e(((ResolveInfo) next).activityInfo.packageName, "com.android.vending"));
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static final boolean openUrl(Context context, String url) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return IntentUtilsKt.openUrl(context, url);
    }

    public static final Intent uriToIntent(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return IntentUtilsKt.toIntent(uri);
    }

    public static final Intent urlToIntent(String url) {
        p.j(url, "url");
        Uri uri = Uri.parse(url);
        p.i(uri, "parse(url)");
        return uriToIntent(uri);
    }
}
