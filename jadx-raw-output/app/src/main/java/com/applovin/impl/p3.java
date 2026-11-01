package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.Q6;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p3 implements q0.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f8714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f8715m = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f8718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3 f8719d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8722g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f8725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f8726k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8720e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f8721f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8723h = 2;

    public class a extends b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f8714l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f8714l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f8719d, p3.this.f8716a.e());
                }
                p3.f8715m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f8714l = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f8716a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.id
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f7738b.a(dialogInterface, i10);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44955a);
        p10.startActivity(p11);
    }

    public void h() {
        a((Map) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f8714l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private void f() {
        this.f8716a.e().a(new a());
    }

    public void e() {
        if (this.f8721f.compareAndSet(false, true)) {
            this.f8716a.q0().a((i5) new w5(this, this.f8716a), d6.b.OTHER);
        }
    }

    public boolean g() {
        return this.f8722g;
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f8719d + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.f8716a = kVar;
        this.f8717b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f8718c = contextO;
        o3 o3Var = new o3(contextO);
        this.f8719d = o3Var;
        this.f8726k = new b0(kVar, o3Var);
    }

    public void a(boolean z10, int i10) {
        this.f8722g = z10;
        this.f8723h = i10;
    }

    public void a(Map map) {
        this.f8725j = map;
        e();
        if (!c() && f8715m.compareAndSet(false, true)) {
            if (!this.f8724i) {
                f();
                this.f8724i = true;
            }
            Intent intent = new Intent(this.f8718c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f8718c, intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f8725j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f8725j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.gd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7579b.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, Q6.E1, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.f8720e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f8720e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.J() != null ? kVar.J().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8717b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List listA = a(jSONObject, this.f8716a);
        List listA2 = a(jSONObject, listA, this.f8716a);
        List listA3 = a(listA2, this.f8716a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f8719d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f8716a);
        if (!listA4.isEmpty()) {
            this.f8726k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.hd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7644b.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f8723h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8717b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f8716a.D().a("fetchMediationDebuggerInfo", str, i10, str2);
        this.f8719d.a(null, null, null, null, null, null, null, false, this.f8716a);
        this.f8721f.set(false);
    }
}
