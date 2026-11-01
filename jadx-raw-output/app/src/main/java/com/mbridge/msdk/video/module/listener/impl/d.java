package com.mbridge.msdk.video.module.listener.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: ContainerViewStatisticsListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.f39066a) {
            try {
                CampaignEx campaignEx = this.f39067b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i10 != 105 && i10 != 106 && i10 != 113) {
                if (i10 != 122) {
                    switch (i10) {
                        case 109:
                            a(2);
                            b(2);
                            break;
                        case 110:
                            a(1);
                            b(1);
                            break;
                        case 111:
                            b(1);
                            break;
                    }
                }
                g();
                return;
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
            if (i10 != 105) {
                String noticeUrl = this.f39067b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f34903m)) {
                        noticeUrl = noticeUrl + C3426d4.j.f28584c + com.mbridge.msdk.foundation.same.a.f34903m + "=2";
                    } else {
                        noticeUrl = noticeUrl.replace(com.mbridge.msdk.foundation.same.a.f34903m + "=" + Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f34903m), com.mbridge.msdk.foundation.same.a.f34903m + "=2");
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b, this.f39072g, noticeUrl, true, false, com.mbridge.msdk.click.retry.a.f32918o);
            }
        }
    }
}
