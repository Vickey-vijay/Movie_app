package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class vt {
    public int bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public boolean f13070cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f13071cf;
    public int ex;
    public int fkw;
    public JSONObject fvf;
    public int jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f13072jg;
    public List<String> jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f13073ko;
    public int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13074le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13075lh;
    public int mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public boolean f13076od;
    public String ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public int f13077pd;
    public int pno;
    public int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13078ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public int f13079rn;
    public int ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public int f13080tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f13081th;
    public int tlj;
    public boolean uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f13082vm;
    public int vpp;
    public int vt;
    public int yu;
    public int zih;
    public boolean zin;

    public vt(JSONObject jSONObject) {
        this.vt = 1;
        this.f13075lh = 1;
        this.yu = 2;
        this.fkw = 1;
        this.f13074le = 100;
        this.f13078ra = 0;
        this.pno = 2;
        this.bly = 1;
        this.tlj = 3;
        this.f13071cf = 30;
        this.ryl = 30;
        this.mwh = 1;
        this.f13072jg = 1;
        this.f13073ko = 2;
        this.f13079rn = 1500;
        this.zih = 2;
        this.f13082vm = 3500;
        this.f13081th = 0;
        this.qbp = 5;
        this.zin = false;
        this.vpp = 0;
        this.ex = 2;
        this.f13080tc = 0;
        this.ksc = 0;
        this.jae = 5;
        this.f13076od = true;
        this.f13070cd = false;
        this.uq = false;
        this.f13077pd = -1;
        new JSONObject();
        this.fvf = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.ouw = jSONObject.optString("code_id");
        this.vt = jSONObject.optInt("auto_play", 1);
        this.f13077pd = jSONObject.optInt("endcard_close_time", -1);
        this.f13075lh = jSONObject.optInt("voice_control", 1);
        this.yu = jSONObject.optInt("rv_preload", 2);
        this.fkw = jSONObject.optInt("nv_preload", 1);
        this.f13074le = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.f13078ra = jSONObject.optInt("skip_time_displayed", 0);
        this.pno = jSONObject.optInt("video_skip_result", 2);
        this.bly = jSONObject.optInt("reg_creative_control", 1);
        this.tlj = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.f13071cf = iOptInt;
        if (iOptInt < 0) {
            this.f13071cf = 30;
        }
        this.mwh = jSONObject.optInt("voice_control", 2);
        this.f13072jg = jSONObject.optInt("if_show_win", 1);
        this.f13073ko = jSONObject.optInt("sp_preload", 2);
        this.f13079rn = jSONObject.optInt("stop_time", 1500);
        this.zih = jSONObject.optInt("native_playable_delay", 2);
        this.f13082vm = jSONObject.optInt("time_out_control", -1);
        this.f13081th = jSONObject.optInt("playable_reward_type", 0);
        this.vpp = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.qbp = iOptInt2;
        if (iOptInt2 < 0) {
            this.qbp = 5;
        }
        ouw(jSONObject.optJSONArray("parent_tpl_ids"));
        this.ex = jSONObject.optInt("slot_type", 2);
        this.zin = jSONObject.optBoolean("close_on_click", false);
        this.f13080tc = jSONObject.optInt("allow_system_back", 0);
        this.ksc = jSONObject.optInt("splash_skip_time", 0);
        this.jae = jSONObject.optInt("splash_image_count_down_time", 5);
        this.f13070cd = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.uq = jSONObject.optBoolean("splash_close_on_click", false);
        this.f13076od = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!ouw(this.f13075lh)) {
            this.f13075lh = 1;
        }
        if (!ouw(this.mwh)) {
            this.mwh = 1;
        }
        this.ryl = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean ouw(int i10) {
        return i10 == 1 || i10 == 2;
    }

    private void ouw(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.jqy = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.jqy.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public vt(String str) {
        this.vt = 1;
        this.f13075lh = 1;
        this.yu = 2;
        this.fkw = 1;
        this.f13074le = 100;
        this.f13078ra = 0;
        this.pno = 2;
        this.bly = 1;
        this.tlj = 3;
        this.f13071cf = 30;
        this.ryl = 30;
        this.mwh = 1;
        this.f13072jg = 1;
        this.f13073ko = 2;
        this.f13079rn = 1500;
        this.zih = 2;
        this.f13082vm = 3500;
        this.f13081th = 0;
        this.qbp = 5;
        this.zin = false;
        this.vpp = 0;
        this.ex = 2;
        this.f13080tc = 0;
        this.ksc = 0;
        this.jae = 5;
        this.f13076od = true;
        this.f13070cd = false;
        this.uq = false;
        this.f13077pd = -1;
        this.fvf = new JSONObject();
        this.ouw = str;
        this.f13075lh = 1;
    }
}
