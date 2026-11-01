package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Cf {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
        p10.startActivity(p11);
    }

    public final void a(Context context, String str, JSONObject jSONObject, String str2, String str3, Boolean bool, boolean z10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "appKey");
        ck.p.j(jSONObject, "initResponse");
        ck.p.j(str2, "sdkVersion");
        ck.p.j(str3, "testSuiteControllerUrl");
        Kf kf2 = Kf.f26939a;
        a(context, a(str, str2, kf2.c(context), kf2.a(context), kf2.b(context), bool, jSONObject, z10, kf2.b(), kf2.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", str3);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public final String b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, List<String>> entry : Kf.f26939a.d().entrySet()) {
            jSONObjectJsonObjectInit.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObjectJsonObjectInit;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z10, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(kotlin.collections.a.m(mj.h.a("deviceOS", C3426d4.f28386d), mj.h.a("appKey", str), mj.h.a("sdkVersion", str2), mj.h.a("bundleId", str3), mj.h.a("appName", str4), mj.h.a("appVersion", str5), mj.h.a("initResponse", jSONObject), mj.h.a("isRvManual", Boolean.valueOf(z10)), mj.h.a("generalProperties", jSONObject2), mj.h.a("adaptersVersion", jSONObject3), mj.h.a("metaData", jSONObject4), mj.h.a("gdprConsent", bool))).toString();
        ck.p.i(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        ck.p.i(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        ck.p.i(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }
}
