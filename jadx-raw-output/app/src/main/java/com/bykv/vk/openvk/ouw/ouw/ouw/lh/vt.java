package com.bykv.vk.openvk.ouw.ouw.ouw.lh;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class vt {
    public String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f10454cf;
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f10457le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f10458lh;
    public int ouw;
    public String pno;
    private double qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f10459ra;
    public int ryl;
    public String tlj;
    public int vt;
    public double yu;
    public float mwh = -1.0f;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f10455jg = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f10456ko = 0;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public int f10460rn = 0;
    public int zih = 0;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f10462vm = 307200;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f10461th = 1;

    public final String ouw() {
        if (TextUtils.isEmpty(this.tlj)) {
            this.tlj = com.bykv.vk.openvk.ouw.ouw.ouw.ra.vt.ouw(this.f10459ra);
        }
        return this.tlj;
    }

    public final JSONObject lh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.ouw);
            jSONObject.put("cover_url", this.f10457le);
            jSONObject.put("cover_width", this.vt);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.pno);
            jSONObject.put("file_hash", ouw());
            jSONObject.put("resolution", this.fkw);
            jSONObject.put("size", this.f10458lh);
            jSONObject.put("video_duration", this.yu);
            jSONObject.put("video_url", this.f10459ra);
            jSONObject.put("playable_download_url", this.bly);
            jSONObject.put("if_playable_loading_show", this.f10455jg);
            jSONObject.put("remove_loading_page_type", this.f10456ko);
            jSONObject.put("fallback_endcard_judge", this.f10454cf);
            jSONObject.put("video_preload_size", vt());
            jSONObject.put("reward_video_cached_type", this.f10460rn);
            jSONObject.put("execute_cached_type", this.zih);
            jSONObject.put("endcard_render", this.ryl);
            jSONObject.put("replay_time", this.f10461th);
            jSONObject.put("play_speed_ratio", this.mwh);
            double d10 = this.qbp;
            if (d10 > 0.0d) {
                jSONObject.put("start", d10);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final int vt() {
        if (this.f10462vm < 0) {
            this.f10462vm = 307200;
        }
        long j10 = this.f10462vm;
        long j11 = this.f10458lh;
        if (j10 > j11) {
            this.f10462vm = (int) j11;
        }
        return this.f10462vm;
    }

    public final boolean yu() {
        return this.f10460rn == 0;
    }

    public final void ouw(int i10) {
        this.f10461th = Math.min(4, Math.max(1, i10));
    }
}
