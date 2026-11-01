package com.apm.insight.runtime;

import android.content.Context;
import com.ironsource.Z7;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: CrashTimes.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f6714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6716d;

    public final void a() throws Throwable {
        HashMap<String, Long> map = this.f6714b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lRemove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f6713a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f6713a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (com.apm.insight.a.a(jSONArrayA)) {
                return map;
            }
            Long lDecode = Long.decode(jSONArrayA.optString(0, null));
            if (System.currentTimeMillis() - lDecode.longValue() > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                File fileG = com.apm.insight.l.j.g(this.f6713a);
                fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                String[] list = fileG.list();
                if (list != null && list.length > 5) {
                    Arrays.sort(list);
                    new File(fileG, list[0]).delete();
                }
                return map;
            }
            map.put("time", lDecode);
            for (int i10 = 1; i10 < jSONArrayA.length(); i10++) {
                String[] strArrSplit = jSONArrayA.optString(i10, "").split(Z7.f27998r);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                }
            }
            return map;
        } catch (IOException unused) {
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
    }

    public f(Context context) {
        this.f6714b = null;
        this.f6715c = 50;
        this.f6716d = 100;
        this.f6713a = context;
        this.f6714b = b();
        this.f6715c = a.a(this.f6715c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f6716d = a.a(this.f6716d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    public final boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.c.AnonymousClass1.a(this.f6714b, str, 1L).longValue() < ((long) this.f6715c) && com.apm.insight.l.c.AnonymousClass1.a(this.f6714b, "all", 1L).longValue() < ((long) this.f6716d);
    }
}
