package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: CommonJumpLoader.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32803e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f32806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f32807i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JumpLoaderResult f32800b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32801c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32802d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f32804f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32805g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f32808j = new Handler(Looper.getMainLooper());

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f32802d = str2;
        this.f32804f = gVar;
        this.f32800b = null;
        this.f32803e = i10;
        boolean z12 = false;
        if (campaignEx != null) {
            z12 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f32807i.a(str2, gVar, z12, id2, str, campaignEx, z10, z11, i10);
    }

    public e(Context context) {
        this.f32806h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f32807i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f32802d = new String(campaignEx.getClickURL());
        this.f32804f = gVar;
        this.f32800b = null;
        this.f32807i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f32919p);
    }

    public void a() {
        this.f32805g = false;
    }
}
