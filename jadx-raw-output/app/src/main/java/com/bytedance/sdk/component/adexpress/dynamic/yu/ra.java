package com.bytedance.sdk.component.adexpress.dynamic.yu;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.cf;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ra {
    public fkw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11478le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public JSONObject f11479lh;
    public int ouw;
    public String vt;
    public le yu;

    public final int ouw() {
        return (int) this.yu.yu;
    }

    public final int vt() {
        return (int) this.yu.f11450ra;
    }

    public final String bly() {
        return this.ouw == 1 ? this.vt : "";
    }

    public final int cf() {
        return ouw(this.yu.f11442ko);
    }

    public final String fkw() {
        if (this.ouw == 0) {
            return !TextUtils.isEmpty(this.vt) ? this.vt : this.f11479lh.optString(com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw()));
        }
        return "";
    }

    public final int le() {
        return ouw(this.yu.ryl);
    }

    public final int lh() {
        return (int) this.yu.fkw;
    }

    public final int mwh() {
        return ouw(this.yu.mwh);
    }

    public final String pno() {
        int i10 = this.ouw;
        return (i10 == 2 || i10 == 13) ? this.vt : "";
    }

    public final int ra() {
        String str = this.yu.f11434cf;
        if ("left".equals(str)) {
            return 17;
        }
        if ("center".equals(str)) {
            return 4;
        }
        return "right".equals(str) ? 3 : 2;
    }

    public final int ryl() {
        le leVar;
        String str = this.yu.ksc;
        if ("skip-with-time-skip-btn".equals(this.fkw.ouw) || "skip".equals(this.fkw.ouw) || TextUtils.equals("skip-with-countdowns-skip-btn", this.fkw.ouw)) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.fkw.ouw) && !"skip-with-time".equals(this.fkw.ouw)) {
            if (this.ouw == 10 && TextUtils.equals(this.yu.jae, "click")) {
                return 5;
            }
            if (jg() && ko()) {
                return 0;
            }
            if (jg()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.fkw.ouw)) {
                return 3;
            }
            if (!TextUtils.isEmpty(str) && !str.equals("none")) {
                if (str.equals("video") || (this.fkw.ouw() == 7 && TextUtils.equals(str, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.yu.vt() && (leVar = this.fkw.f11431lh) != null && leVar.npr) ? 11 : 4;
                }
                if (str.equals("normal")) {
                    return 1;
                }
                return (str.equals("creative") || "slide".equals(this.yu.jae)) ? 2 : 0;
            }
        }
        return 0;
    }

    public final double tlj() {
        if (this.ouw == 11) {
            try {
                double d10 = Double.parseDouble(this.vt);
                return !com.bytedance.sdk.component.adexpress.yu.vt() ? (int) d10 : d10;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public final int yu() {
        return (int) this.yu.f11443le;
    }

    public ra(fkw fkwVar) {
        this.fkw = fkwVar;
        this.ouw = fkwVar.ouw();
        this.vt = fkwVar.vt;
        this.f11479lh = fkwVar.f11431lh.f11441kn;
        this.f11478le = fkwVar.fkw;
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh;
        this.yu = fkwVar.f11431lh;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.yu = fkwVar.f11431lh;
        }
    }

    private boolean jg() {
        if ((com.bytedance.sdk.component.adexpress.yu.vt() && (this.fkw.ouw.contains("logo-union") || this.fkw.ouw.contains("logounion") || this.fkw.ouw.contains("logoad"))) || "logo-union".equals(this.fkw.ouw) || "logounion".equals(this.fkw.ouw) || "logoad".equals(this.fkw.ouw)) {
            return true;
        }
        return false;
    }

    private boolean ko() {
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.vt) || !this.vt.contains("adx:")) && !cf.vt()) {
            return false;
        }
        return true;
    }

    public static int ouw(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(C3426d4.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA)) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2])) | 0;
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public static float[] vt(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA);
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }
}
