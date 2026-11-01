package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.material.datepicker.UtcDates;
import com.ironsource.C3754ve;
import com.ironsource.G5;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f16115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f16121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f16122h;

    public v(w wVar, y yVar, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f16122h = wVar;
        this.f16115a = yVar;
        this.f16116b = str;
        this.f16117c = str2;
        this.f16118d = str3;
        this.f16119e = str4;
        this.f16120f = num;
        this.f16121g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        HashMap map;
        com.fyber.inneractive.sdk.response.e eVar;
        w wVar = this.f16122h;
        t tVar = wVar.f16128b;
        if (tVar != null) {
            this.f16115a.a(Integer.valueOf(tVar.val), NotificationCompat.CATEGORY_ERROR);
            this.f16122h.f16128b.getClass();
            strA = r1.ERROR_TABLE.a();
            IAlog.a("Event dispatcher - dispatching error: %s", this.f16122h.f16128b);
            IAlog.d("%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(this.f16122h.f16128b.val));
        } else {
            u uVar = wVar.f16129c;
            if (uVar != null) {
                this.f16115a.a(Integer.valueOf(uVar.val), "event");
                this.f16122h.f16129c.getClass();
                strA = r1.EVENT_TABLE.a();
                IAlog.a("Event dispatcher - dispatching event: %s", this.f16122h.f16129c);
                IAlog.d("%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(this.f16122h.f16129c.val));
            } else {
                strA = null;
            }
        }
        y yVar = this.f16115a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strA);
        w wVar2 = this.f16122h;
        t tVar2 = wVar2.f16128b;
        sb2.append(tVar2 != null ? String.valueOf(tVar2.val) : String.valueOf(wVar2.f16129c.val));
        yVar.a(sb2.toString(), G5.Q);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
        this.f16115a.a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.d()) {
            this.f16115a.a(this.f16116b, "contentid");
            this.f16115a.a(this.f16117c, "fairbidv");
            if (!TextUtils.isEmpty(this.f16118d)) {
                this.f16115a.a(this.f16118d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.f16119e)) {
                this.f16115a.a(this.f16119e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String strI = com.fyber.inneractive.sdk.util.k.i();
                if (!TextUtils.isEmpty(strI)) {
                    this.f16115a.a(strI, "ciso");
                }
            }
            this.f16115a.a(this.f16120f, "ad_type");
            if (this.f16122h.f16133g && !TextUtils.isEmpty(this.f16121g)) {
                this.f16115a.f16140c = this.f16121g;
            }
            this.f16115a.a(com.fyber.inneractive.sdk.util.z0.a().b(), "n");
            try {
                this.f16115a.a(w.f16126h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f16115a.a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.f16122h.f16130d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f16115a.a(this.f16122h.f16130d, C3754ve.f31473d);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.f16122h.f16131e;
            if (eVar2 != null && eVar2.D) {
                this.f16115a.a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f16115a.a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.O;
            this.f16115a.a(iAConfigManager.E.n() && (eVar = this.f16122h.f16131e) != null && eVar.H != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : "0", "ignite");
            y yVar2 = this.f16115a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f15795p;
            yVar2.a(lVar != null ? lVar.f61679a.d() : null, "ignitep");
            y yVar3 = this.f16115a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f15795p;
            yVar3.a(lVar2 != null ? lVar2.f61679a.i() : null, "ignitev");
            JSONArray jSONArrayB = iAConfigManager.M.b();
            if (jSONArrayB != null && jSONArrayB.length() > 0) {
                this.f16115a.a(jSONArrayB, "s_experiments");
            }
            JSONArray jSONArray2 = this.f16122h.f16132f;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    if (jSONArray2.optJSONObject(i10).length() >= 1) {
                        this.f16115a.a(this.f16122h.f16132f, "extra");
                        break;
                    }
                }
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.f16122h.f16131e;
            if (eVar3 != null && eVar3.L) {
                this.f16115a.a("1", "dynamic_controls");
            }
        }
        y yVar4 = this.f16115a;
        if (TextUtils.isEmpty(yVar4.f16138a) || (map = yVar4.f16139b) == null || map.size() == 0) {
            return;
        }
        f fVar = IAConfigManager.O.I;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = yVar4.f16139b;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String strSubstring = yVar4.f16140c;
        if (strSubstring != null) {
            int length = strSubstring.length();
            if (length > 51200) {
                int iIndexOf = strSubstring.indexOf("iawrapper");
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                strSubstring = strSubstring.substring(iIndexOf, 51199);
                IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", strSubstring);
            } catch (JSONException e10) {
                IAlog.a("Failed inserting ad body to json", e10, new Object[0]);
            }
        }
        if (IAlog.f18551a == 1) {
            try {
                IAlog.d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused3) {
            }
        }
        fVar.f16015a.offer(jSONObject);
        if (fVar.f16015a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.f16018d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.f16018d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.f16018d;
            if (d1Var2 != null) {
                d1Var2.post(new c(fVar, 12312329, 0L));
            }
        }
    }
}
