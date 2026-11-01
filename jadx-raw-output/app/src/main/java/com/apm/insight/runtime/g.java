package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultCommonParams.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6717a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6718b = -1;

    public static com.apm.insight.nativecrash.b a(Context context) {
        return new com.apm.insight.nativecrash.b(context, new ICommonParams() { // from class: com.apm.insight.runtime.g.1
            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }
        });
    }

    public final void a(String str) {
        this.f6717a = str;
        o.a().a(str);
    }

    public final boolean b() {
        return this.f6717a != null;
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f6717a) && !"0".equals(this.f6717a)) {
            return this.f6717a;
        }
        String strD = com.apm.insight.e.a().d();
        this.f6717a = strD;
        if (!TextUtils.isEmpty(strD) && !"0".equals(this.f6717a)) {
            return this.f6717a;
        }
        String strB = o.a().b();
        this.f6717a = strB;
        return strB;
    }
}
