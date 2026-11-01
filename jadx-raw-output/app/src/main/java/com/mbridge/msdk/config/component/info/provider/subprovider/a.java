package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: ADIDProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33192a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33193b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33194c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33195d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33196e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33197f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.listener.a f33198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f33199h;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                this.f33192a = advertisingIdInfo.getId();
                this.f33194c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
            } catch (Exception unused) {
                q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
            }
        } catch (Exception unused2) {
            com.mbridge.msdk.foundation.tools.c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
            this.f33192a = bVarA.a();
            this.f33194c = bVarA.b() ? 1 : 0;
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
        a(this.f33192a, this.f33194c);
        if (this.f33198g != null) {
            HashMap map = new HashMap();
            map.put(com.ironsource.sdk.controller.f.b.f30919c, this.f33192a);
            map.put("adIdB64", k0.b(this.f33192a));
            map.put("adIdLimit", String.valueOf(this.f33194c));
            this.f33198g.a(map);
        }
    }

    public Map<String, Object> a() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.f33192a)) {
            str = TextUtils.isEmpty(this.f33193b) ? "" : this.f33193b;
        } else {
            str = this.f33192a;
        }
        int i10 = this.f33194c;
        if (i10 == -1 && (i10 = this.f33195d) == -1) {
            i10 = 0;
        }
        map.put(com.ironsource.sdk.controller.f.b.f30919c, str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f33196e);
        map.put("amazonIdInfoB64", this.f33197f);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f33193b = com.mbridge.msdk.config.component.common.util.b.a(this.f33199h).a(com.ironsource.sdk.controller.f.b.f30919c, "");
        this.f33195d = com.mbridge.msdk.config.component.common.util.b.a(this.f33199h).a("isLimitAdId", -1);
    }

    public a(Context context, com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f33199h = context;
        this.f33198g = aVar;
        a(context);
        b();
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f33199h == null) {
            this.f33199h = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        if (str.equals(this.f33193b) && i10 == this.f33195d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(this.f33199h).b(com.ironsource.sdk.controller.f.b.f30919c, str);
        com.mbridge.msdk.config.component.common.util.b.a(this.f33199h).b("isLimitAdId", i10);
    }

    private void a(final Context context) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f33211b.c();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f33212b.b(context);
            }
        });
    }

    private void b() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    this.f33196e = string2;
                    this.f33197f = k0.b(string2);
                    if (this.f33198g != null) {
                        HashMap map = new HashMap();
                        map.put("amazonIdInfo", this.f33196e);
                        map.put("amazonIdInfoB64", this.f33197f);
                        this.f33198g.a(map);
                    }
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("ADIDProvider", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
    }
}
