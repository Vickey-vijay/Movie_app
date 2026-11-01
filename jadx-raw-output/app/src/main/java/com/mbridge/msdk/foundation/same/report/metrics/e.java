package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ParameterWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f35189a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (!(obj instanceof String)) {
                this.f35189a.put(str, obj + "");
            } else if (!TextUtils.isEmpty((String) obj)) {
                this.f35189a.put(str, (String) obj);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f35189a.get(str);
    }

    public void c(String str) {
        if (this.f35189a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f35189a.remove(str);
    }

    public boolean a(String str) {
        return this.f35189a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f35189a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f35189a) == null || (map2 = this.f35189a) == null) {
            return;
        }
        map2.putAll(map);
    }
}
