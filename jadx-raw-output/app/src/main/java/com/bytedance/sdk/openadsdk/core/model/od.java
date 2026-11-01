package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class od {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f12784cf;
    public String fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f12785jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f12786ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f12787le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f12788lh;
    public int mwh;
    public int ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12789ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public String f12790rn;
    public int ryl;
    public boolean tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public String f12791vm;
    public int vt;
    public int yu;
    public String zih;

    public static String cf(vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        od odVar = vppVar.nbp;
        if (odVar != null && odVar.f12788lh) {
            String str = odVar.f12787le;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (vppVar.fvf == 20) {
            return vppVar.osn;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
        if (vtVar != null) {
            return vtVar.pno;
        }
        return null;
    }

    public static od ouw(vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        return vppVar.nbp;
    }

    public static boolean pno(vpp vppVar) {
        od odVar = vppVar.nbp;
        return odVar != null && odVar.f12788lh && odVar.vt == 1;
    }

    public static boolean ra(vpp vppVar) {
        od odVar = vppVar.nbp;
        return odVar != null && odVar.f12788lh && odVar.vt == 1;
    }

    public od(JSONObject jSONObject) {
        int i10;
        boolean z10;
        this.ryl = 5;
        this.mwh = 5;
        this.f12785jg = 10;
        this.f12786ko = 20;
        this.f12790rn = "Next Ad";
        this.zih = "Next ad in %1$ds";
        this.f12791vm = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.f12788lh = jSONObject.optBoolean("is_playable");
        this.yu = jSONObject.optInt("playable_type", 0);
        this.fkw = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.f12787le = jSONObjectOptJSONObject.optString("playable_url", "");
            this.f12789ra = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.vt = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.ouw = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            if (this.yu == 1) {
                i10 = 10;
            } else {
                i10 = 5;
            }
            this.pno = jSONObjectOptJSONObject.optInt("playable_webview_timeout", i10);
            this.bly = jSONObjectOptJSONObject.optInt("playable_js_timeout", i10);
            if (jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.tlj = z10;
            this.ryl = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.mwh = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.f12785jg = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.f12786ko = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.zih = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.f12790rn = jSONObjectOptJSONObject.optString("next_ad_text");
            this.f12791vm = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.f12784cf = iOptInt;
            if (iOptInt != 0 && iOptInt != 1 && iOptInt != 2) {
                this.f12784cf = 0;
            }
        }
    }

    public static String bly(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.fkw;
    }

    public static boolean fkw(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null || !odVarOuw.f12788lh || TextUtils.isEmpty(cf(vppVar))) {
            return false;
        }
        return true;
    }

    public static String jg(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f12790rn;
    }

    public static String ko(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f12791vm;
    }

    public static boolean le(vpp vppVar) {
        if (fkw(vppVar) && zih(vppVar) == 1) {
            return true;
        }
        return false;
    }

    public static boolean lh(vpp vppVar) {
        if (vt(vppVar) && zih(vppVar) == 1) {
            return true;
        }
        return false;
    }

    public static int mwh(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.ryl;
    }

    public static int rn(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.mwh;
    }

    public static long ryl(vpp vppVar) {
        long j10;
        od odVarOuw = ouw(vppVar);
        long j11 = 5;
        if (odVarOuw == null) {
            j10 = 5;
        } else {
            j10 = odVarOuw.pno;
        }
        od odVarOuw2 = ouw(vppVar);
        if (odVarOuw2 != null) {
            j11 = odVarOuw2.bly;
        }
        return Math.max(j10, j11);
    }

    public static String tlj(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f12787le;
    }

    public static boolean vt(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null || !odVarOuw.f12788lh || TextUtils.isEmpty(cf(vppVar))) {
            return false;
        }
        return true;
    }

    public static boolean yu(vpp vppVar) {
        if (lh(vppVar) && !ra(vppVar)) {
            return true;
        }
        return false;
    }

    private static int zih(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.yu;
    }
}
