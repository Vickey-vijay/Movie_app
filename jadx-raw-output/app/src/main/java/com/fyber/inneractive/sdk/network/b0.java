package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.material.datepicker.UtcDates;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f15997a = null;

    public static void a(Context context, String str, String str2, com.fyber.inneractive.sdk.flow.x xVar) {
        int i10;
        if (context == null || str == null || xVar.b() == null) {
            IAlog.a("Invalid report request parameters!", new Object[0]);
            return;
        }
        b0 b0Var = a0.f15994a;
        if (b0Var.f15997a == null) {
            b0Var.f15997a = context.getSharedPreferences("AutoWebActionPrefs", 0);
        }
        IAlog.e("IAautoWebActionReporter: reporting action: %s", str);
        IAlog.e("IAautoWebActionReporter: url: %s", str2);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (!iAConfigManager.f15014i.f15124c) {
            IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
            return;
        }
        t tVar = t.MRAID_AUTO_ACTION_DETECTED;
        InneractiveAdRequest inneractiveAdRequest = xVar.f15746a;
        com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
        JSONArray jSONArrayB = xVar.f15748c.b();
        w wVar = new w(eVarB);
        wVar.f16128b = tVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "action", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("url", str2);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str2);
            }
        }
        long j10 = b0Var.f15997a.getLong("lastReportTS", 0L);
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        Calendar calendar = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j10);
        if (j10 <= 0 || calendar.get(6) != calendar2.get(6)) {
            i10 = 0;
        } else {
            IAlog.e("IAautoWebActionReporter: encountered same date", new Object[0]);
            i10 = b0Var.f15997a.getInt("numReportsToday", 0);
        }
        int i11 = iAConfigManager.f15014i.f15125d;
        int i12 = i10 + 1;
        IAlog.e("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        if (i10 < i11) {
            IAlog.e("IAautoWebActionReporter: adding ad data", new Object[0]);
            wVar.f16133g = true;
        } else {
            IAlog.e("IAautoWebActionReporter: not adding ad data", new Object[0]);
        }
        Integer numValueOf = Integer.valueOf(i12);
        try {
            jSONObject.put("daily_count", numValueOf);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "daily_count", numValueOf);
        }
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
        SharedPreferences.Editor editorEdit = b0Var.f15997a.edit();
        editorEdit.putLong("lastReportTS", calendar.getTimeInMillis());
        editorEdit.putInt("numReportsToday", i12);
        editorEdit.apply();
    }
}
