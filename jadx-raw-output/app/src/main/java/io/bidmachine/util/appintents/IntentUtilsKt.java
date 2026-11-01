package io.bidmachine.util.appintents;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ck.p;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.Executable;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.UrlUtilsKt;
import io.bidmachine.util.Utils;
import io.bidmachine.util.appintents.IntentUtilsKt;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import lk.a0;
import mj.r;
import nj.b0;
import nj.q0;

/* JADX INFO: compiled from: IntentUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a$\u0010\u000f\u001a\u00020\t*\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u001a$\u0010\u0013\u001a\u00020\t*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\t*\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u001a$\u0010\u0015\u001a\u00020\t*\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u001a\n\u0010\u0016\u001a\u00020\f*\u00020\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"CUSTOM_PARAM_RAW_URL", "", "CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS", "KEY_CUSTOM_PARAMS", "extractBmCustomParams", "", "urlString", "removeBmCustomParams", "findAndSetIntentComponent", "", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "findComponentName", "Landroid/content/ComponentName;", "findEndpointAndOpenUrl", "url", "postMethod", "Lio/bidmachine/util/Executable;", "openRawUrl", "openUrl", "openUrlWithPostback", "toIntent", "Landroid/net/Uri;", "bidmachine-android-util_c_0_13_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class IntentUtilsKt {
    private static final String CUSTOM_PARAM_RAW_URL = "lraw";
    private static final String CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS = "rcp";
    private static final String KEY_CUSTOM_PARAMS = "bmcp";

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
        p10.startActivity(p11);
    }

    public static final Set<String> extractBmCustomParams(String str) {
        p.j(str, "urlString");
        Uri uri = UrlUtilsKt.parseUri(str);
        if (uri == null) {
            return q0.f();
        }
        String queryParameter = uri.getQueryParameter(KEY_CUSTOM_PARAMS);
        if (queryParameter == null) {
            queryParameter = "";
        }
        List listN0 = a0.N0(queryParameter, new String[]{"_"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (!a0.n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return b0.T0(arrayList);
    }

    public static final boolean findAndSetIntentComponent(Context context, Intent intent) {
        p.j(context, "<this>");
        p.j(intent, "intent");
        ComponentName componentNameFindComponentName = findComponentName(context, intent);
        if (componentNameFindComponentName == null) {
            return false;
        }
        intent.setComponent(componentNameFindComponentName);
        return true;
    }

    public static final ComponentName findComponentName(Context context, Intent intent) {
        p.j(context, "<this>");
        p.j(intent, "intent");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        p.i(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        if (!(!listQueryIntentActivities.isEmpty())) {
            return null;
        }
        ComponentName componentNameFindStoreComponentName = IntentUtils.findStoreComponentName(listQueryIntentActivities);
        return componentNameFindStoreComponentName == null ? new ComponentName(listQueryIntentActivities.get(0).activityInfo.packageName, listQueryIntentActivities.get(0).activityInfo.name) : componentNameFindStoreComponentName;
    }

    public static final boolean findEndpointAndOpenUrl(Context context, String str, final Executable<Boolean> executable) {
        p.j(context, "<this>");
        if (str == null || str.length() == 0) {
            if (executable != null) {
                executable.execute(Boolean.FALSE);
            }
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        final String validUrl = Utils.getValidUrl(str);
        if (validUrl == null || validUrl.length() == 0) {
            if (executable != null) {
                executable.execute(Boolean.FALSE);
            }
            return false;
        }
        Set<String> setExtractBmCustomParams = extractBmCustomParams(validUrl);
        if (setExtractBmCustomParams.contains(CUSTOM_PARAM_RAW_URL)) {
            if (setExtractBmCustomParams.contains(CUSTOM_PARAM_REMOVE_CUSTOM_PARAMS)) {
                str = removeBmCustomParams(str);
            }
            return openRawUrl(context, str, executable);
        }
        if (Utils.isHttpUrl(validUrl)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: gi.a
                @Override // java.lang.Runnable
                public final void run() {
                    IntentUtilsKt.findEndpointAndOpenUrl$lambda$0(applicationContext, validUrl, executable);
                }
            });
            return true;
        }
        p.i(applicationContext, "applicationContext");
        return openUrlWithPostback(applicationContext, validUrl, executable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findEndpointAndOpenUrl$lambda$0(Context context, String str, Executable executable) {
        p.i(context, "applicationContext");
        openUrlWithPostback(context, NetworkUtils.findEndpoint$default(str, 0, 2, null), executable);
    }

    public static final boolean openRawUrl(Context context, String str, Executable<Boolean> executable) {
        Object objM3458constructorimpl;
        r rVar;
        p.j(context, "<this>");
        p.j(str, "urlString");
        Uri uri = UrlUtilsKt.parseUri(str);
        if (uri == null) {
            if (executable == null) {
                return false;
            }
            executable.execute(Boolean.FALSE);
            return false;
        }
        try {
            Result.a aVar = Result.Companion;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, toIntent(uri));
            if (executable != null) {
                executable.execute(Boolean.TRUE);
                rVar = r.f64562a;
            } else {
                rVar = null;
            }
            objM3458constructorimpl = Result.m3458constructorimpl(rVar);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null && executable != null) {
            executable.execute(Boolean.FALSE);
        }
        return Result.m3464isSuccessimpl(objM3458constructorimpl);
    }

    public static final boolean openUrl(Context context, String str) {
        Boolean bool;
        p.j(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intentUrlToIntent = IntentUtils.urlToIntent(str);
            if (!IntentUtils.findAndSetIntentComponent(context, intentUrlToIntent)) {
                String strDecode = URLDecoder.decode(str, lk.c.f63591b.name());
                p.i(strDecode, "decodedUrl");
                intentUrlToIntent = IntentUtils.urlToIntent(strDecode);
                IntentUtils.findAndSetIntentComponent(context, intentUrlToIntent);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentUrlToIntent);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.e(bool, Boolean.TRUE);
    }

    public static final boolean openUrlWithPostback(Context context, String str, final Executable<Boolean> executable) {
        p.j(context, "<this>");
        final boolean zOpenUrl = openUrl(context, str);
        UiUtils.onUiThread(new Runnable() { // from class: gi.b
            @Override // java.lang.Runnable
            public final void run() {
                IntentUtilsKt.openUrlWithPostback$lambda$3$lambda$2(executable, zOpenUrl);
            }
        });
        return zOpenUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openUrlWithPostback$lambda$3$lambda$2(Executable executable, boolean z10) {
        if (executable != null) {
            executable.execute(Boolean.valueOf(z10));
        }
    }

    public static final String removeBmCustomParams(String str) {
        p.j(str, "urlString");
        Uri uri = UrlUtilsKt.parseUri(str);
        if (uri == null) {
            return str;
        }
        String string = UrlUtilsKt.removeQueryParameters(uri, KEY_CUSTOM_PARAMS).toString();
        p.i(string, "uri.removeQueryParameter…CUSTOM_PARAMS).toString()");
        return string;
    }

    public static final Intent toIntent(Uri uri) {
        p.j(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        return intent;
    }
}
