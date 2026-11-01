package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.e0;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14981c = false;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44970p);
        p10.startActivity(p11);
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return !this.f14981c && ("fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.f14979a) || this.f14980b || uri.toString().contains("FYBER_OPEN_BROWSER"));
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f14981c = true;
    }

    public i(boolean z10, String str) {
        this.f14979a = str;
        this.f14980b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        String queryParameter;
        d0 d0Var;
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            queryParameter = null;
        } else {
            Uri uri2 = Uri.parse(string);
            String scheme = uri2.getScheme();
            String host = uri2.getHost();
            if (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) {
                queryParameter = null;
            } else {
                queryParameter = uri2.getQueryParameter("url");
            }
        }
        if (queryParameter != null) {
            try {
                uri = Uri.parse(queryParameter);
            } catch (Exception unused) {
                IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", queryParameter);
                uri = null;
            }
            string = queryParameter;
        }
        if (this.f14981c) {
            return r.a(uri.toString(), null, "The process was cancelled");
        }
        f0 f0Var = f0.OPEN_EVERYTHING;
        try {
            context.getClass();
        } catch (Throwable unused2) {
        }
        try {
            IAlog.a("IAJavaUtil - valid url found: '%s' opening browser", string);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                d0Var = new d0(g0.OPEN_IN_EXTERNAL_BROWSER, null);
            } catch (ActivityNotFoundException unused3) {
                if (h0.a(context, string)) {
                    d0Var = new d0(g0.OPENED_USING_CHROME_NAVIGATE, null);
                } else {
                    d0Var = new d0(g0.FAILED, new e0("tryOpeningChromeGracefully has failed and couldn't open the url"));
                }
            } catch (Throwable unused4) {
                if (((h0.d(string) || h0.c(string)) ? false : true) && f0Var != f0.DO_NOT_OPEN_IN_INTERNAL_BROWSER) {
                    Intent intent2 = new Intent(context, (Class<?>) InneractiveInternalBrowserActivity.class);
                    intent2.putExtra("extra_url", string);
                    intent2.putExtra("spotId", (String) null);
                    if (!(context instanceof Activity)) {
                        intent2.setFlags(268435456);
                    }
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
                    d0Var = new d0(g0.OPENED_IN_INTERNAL_BROWSER, null);
                } else {
                    d0Var = new d0(g0.FAILED, new e0("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"));
                }
            }
        } catch (Throwable th2) {
            IAlog.a("IAJavaUtil - could not open a browser for url: %s", string);
            d0Var = new d0(g0.FAILED, th2);
        }
        if (list != null) {
            Throwable th3 = d0Var.f18573b;
            if (th3 != null) {
                list.add(new j(string, false, null, th3.toString()));
            } else {
                list.add(new j(string, true, q.OPENED_IN_EXTERNAL_BROWSER, null));
            }
        }
        return new b(uri.toString(), q.OPENED_IN_EXTERNAL_BROWSER, "FyberNativeBrowser", null);
    }
}
