package com.bytedance.sdk.openadsdk.core.ryl.ouw;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vt {
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f13022le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13023lh;
    public int ouw;
    public final Context vt;
    public double yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f13024lh;
        public int ouw;
        public int vt;
    }

    public static boolean ouw(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public abstract com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(String str, File file, List<lh> list);

    public vt(Context context, int i10, int i11) {
        this.f13023lh = 0;
        this.yu = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.yu = ((double) i10) / ((double) i11);
        }
        float fBly = osn.bly(context);
        if (fBly != 0.0f && i10 > 0) {
            this.f13023lh = (int) (i10 / fBly);
        }
        this.vt = context.getApplicationContext();
    }

    public final String ouw(String str, List<lh> list) {
        int i10 = this.ouw;
        if (i10 >= 5) {
            return null;
        }
        this.ouw = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
            vtVarVt.ouw(str);
            return vtVarVt.ouw().yu;
        } catch (Exception e10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("exception", e10.getMessage());
                jSONObject.put("error_code", 0);
                com.bytedance.sdk.openadsdk.rn.lh.ouw().ouw("load_vast", jSONObject);
            } catch (Exception unused) {
            }
            if (list.isEmpty()) {
                return null;
            }
            lh.vt(null, list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.WRAPPER_TIMEOUT, -1L, null, null);
            return null;
        }
    }
}
