package sg.bigo.ads.core.landing;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.common.utils.c;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.d.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static Intent a(@NonNull Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
    }

    private static Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d?id=".concat(String.valueOf(str))));
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str2);
        return intent;
    }

    private static Pair<Integer, String> a(Activity activity, Uri uri, String str, String str2, boolean z10) {
        if (activity != null && uri != null) {
            try {
                if (uri.getScheme() != null && !TextUtils.isEmpty(str)) {
                    String queryParameter = uri.getQueryParameter("id");
                    if (!TextUtils.equals(str2, queryParameter)) {
                        return new Pair<>(3, queryParameter);
                    }
                    if ("market".equalsIgnoreCase(uri.getScheme())) {
                        String lowerCase = uri.toString().toLowerCase();
                        if (!lowerCase.contains("details") && !lowerCase.contains("launch")) {
                            return new Pair<>(2, queryParameter);
                        }
                    } else if (!"details".equalsIgnoreCase(uri.getLastPathSegment())) {
                        return new Pair<>(2, queryParameter);
                    }
                    Intent intentA = a(queryParameter, str);
                    if (intentA.resolveActivity(activity.getPackageManager()) == null) {
                        return new Pair<>(2, queryParameter);
                    }
                    if (z10) {
                        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intentA, 0);
                    }
                    return new Pair<>(1, queryParameter);
                }
            } catch (Throwable th2) {
                sg.bigo.ads.common.t.a.a(0, 3, "LinkUtils", "launchGPInline error =" + th2.getMessage());
                return new Pair<>(2, null);
            }
        }
        return new Pair<>(2, null);
    }

    public static String a(String str, Map<String, String> map, String str2) {
        StringBuilder sb2;
        String host = Uri.parse(str2).getHost();
        if (q.a((CharSequence) str) || map.isEmpty() || q.a((CharSequence) host)) {
            return str2;
        }
        try {
            Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
            if (!str.equals("all") && !str.contains(host)) {
                return str2;
            }
            StringBuilder sb3 = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!queryParameterNames.contains(entry.getKey())) {
                    sb3.append(entry.getValue());
                    sb3.append(C3426d4.j.f28584c);
                }
            }
            String string = sb3.toString();
            if (TextUtils.isEmpty(string)) {
                return str2;
            }
            String strSubstring = string.substring(0, string.length() - 1);
            if (str2.contains("?")) {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(C3426d4.j.f28584c);
                sb2.append(strSubstring);
            } else {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("?");
                sb2.append(strSubstring);
            }
            str2 = sb2.toString();
            return str2;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "LinkUtils", "appendPixel error =" + th2.getMessage());
            return str2;
        }
    }

    public static void a(Activity activity, String str, String str2) {
        try {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, a(str, str2), 0);
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, 3, "LinkUtils", "launchGPInline error =" + th2.getMessage());
        }
    }

    public static boolean a(Context context, String str) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context, String str, String str2, @NonNull List<String> list) {
        String str3;
        try {
            Intent intentA = a(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                intentA.setPackage(str2);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
        } catch (Exception e10) {
            if (e10 instanceof ActivityNotFoundException) {
                str3 = "Unable to open target URL by browser due to ActivityNotFoundException.";
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(e10.getMessage());
                list.add(sb2.toString());
                str3 = "Unable to open target URL by system browser.";
            }
            sg.bigo.ads.common.t.a.a(2, "LinkUtils", str3);
            return false;
        }
    }

    public static boolean a(Context context, String str, @Nullable JSONArray jSONArray) {
        int i10;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = "http://".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String strOptString = jSONArray.optString(i11);
                if (!TextUtils.isEmpty(strOptString) && a(context, str, strOptString, arrayList)) {
                    b.a("1", arrayList, strOptString, 1);
                    return true;
                }
            }
        }
        if (c.b(context, "com.android.chrome") == 1 && a(context, str, "com.android.chrome", arrayList)) {
            i10 = 2;
        } else {
            if (!a(context, str, null, arrayList)) {
                b.a("0", arrayList, "", 0);
                return false;
            }
            i10 = 3;
        }
        b.a("1", arrayList, "", i10);
        return true;
    }

    public static boolean a(Uri uri, Context context, Activity activity, @NonNull d dVar, @Nullable String str, boolean z10, String str2, boolean z11) {
        if (uri == null || uri.getScheme() == null || context == null || uri.getScheme().startsWith("http")) {
            return false;
        }
        dVar.f69367i = uri.toString();
        if (uri.getScheme().startsWith("market")) {
            if (z10) {
                Pair<Integer, String> pairA = a(activity, uri, context.getPackageName(), str2, z11);
                int iIntValue = ((Integer) pairA.first).intValue();
                dVar.f69362d = iIntValue;
                dVar.f69363e = (String) pairA.second;
                if (iIntValue == 1) {
                    return true;
                }
            }
            Intent intentA = a(uri);
            intentA.setPackage("com.android.vending");
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                dVar.f69360b = 1;
                return true;
            } catch (ActivityNotFoundException unused) {
                dVar.f69360b = 2;
            } catch (Exception e10) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", e10.toString());
                dVar.f69360b = 4;
            }
        }
        dVar.f69368j = str;
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(uri));
            dVar.f69361c = 1;
            return true;
        } catch (ActivityNotFoundException unused2) {
            dVar.f69360b = 2;
            return false;
        } catch (Exception e11) {
            sg.bigo.ads.common.t.a.a(0, "LinkUtils", e11.toString());
            dVar.f69361c = 4;
            return false;
        }
    }

    public static boolean a(Uri uri, Context context, Activity activity, @NonNull d dVar, boolean z10, String str, boolean z11) {
        int i10;
        if (context != null && uri != null) {
            if (z10) {
                Pair<Integer, String> pairA = a(activity, uri, context.getPackageName(), str, z11);
                int iIntValue = ((Integer) pairA.first).intValue();
                dVar.f69362d = iIntValue;
                dVar.f69363e = (String) pairA.second;
                if (iIntValue == 1) {
                    return true;
                }
            }
            Intent intentA = a(uri);
            intentA.setPackage("com.android.vending");
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                dVar.f69360b = 1;
                return true;
            } catch (ActivityNotFoundException unused) {
                i10 = 2;
                dVar.f69360b = i10;
                try {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(uri));
                    return true;
                } catch (Exception e10) {
                    sg.bigo.ads.common.t.a.a(0, "LinkUtils", e10.toString());
                }
            } catch (Exception e11) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", e11.toString());
                i10 = 4;
                dVar.f69360b = i10;
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(uri));
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        return str.startsWith("market://") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void b(Context context, String str) {
        Intent intentA = AdActivity.a(context, WebViewActivityImpl.class);
        intentA.putExtra("url", str);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }
}
