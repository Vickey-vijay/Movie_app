package com.mbridge.msdk.config.component.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class InnerCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33223h = "InnerStoreComponent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f33224i = "700001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.mbridge.msdk.config.component.inner.model.a f33225j;

    /* JADX WARN: Code duplicated, block: B:32:0x009a A[PHI: r0
  0x009a: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v0 java.lang.String), (r0v0 java.lang.String) binds: [B:34:0x009d, B:4:0x0008, B:23:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(Context context, String str, String str2, Map<String, Object> map) {
        Intent intent;
        String message = "";
        boolean z10 = true;
        try {
            if (TextUtils.isEmpty(str)) {
                z10 = false;
            } else {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (TextUtils.isEmpty(scheme) || !scheme.equals("android-app")) {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f33225j.b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                    } else {
                        intent.setFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                    }
                } else {
                    z10 = false;
                }
            }
        } catch (Throwable th2) {
            q0.b("InnerStoreComponent", th2.getMessage(), th2);
            message = th2.getMessage();
        }
        a(z10, message);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivity(p11);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "901001";
        this.f33225j = new com.mbridge.msdk.config.component.inner.model.a(map);
        if (e() != null) {
            this.f33225j.a(e().getContext());
        } else {
            this.f33225j.a(c.n().d());
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.f33225j;
        if (aVar != null) {
            a(aVar.a(), this.f33225j.d(), this.f33225j.e(), this.f33225j.b());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (!this.f33225j.f().equals("StoreKit")) {
            return;
        }
        String strC = this.f33225j.c();
        if (!TextUtils.isEmpty(strC) && strC.equals("display")) {
            g();
        }
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put("result", String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put("code", str);
            map.put("reason", "700001");
        }
        a(a("901005", map));
    }
}
