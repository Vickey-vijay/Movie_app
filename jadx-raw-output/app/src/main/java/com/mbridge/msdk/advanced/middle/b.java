package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: NativeAdvancedLoadListenerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f32666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f32667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f32668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32670e;

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f32666a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.f32670e = str;
    }

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f32667b = cVar;
        this.f32668c = mBridgeIds;
        this.f32669d = mBridgeIds.getUnitId();
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        q0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i10);
        c cVar2 = this.f32667b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f32666a;
        if (nativeAdvancedAdListener != null && this.f32667b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f32668c);
        }
        this.f32667b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f32669d, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f32667b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f32667b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f32666a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f32668c, str);
        }
        this.f32667b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f32669d, !TextUtils.isEmpty(this.f32670e), bVar != null ? bVar.d() : null);
    }
}
