package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: BannerBridgeListener.java */
/* JADX INFO: loaded from: classes11.dex */
public interface a {
    void a(CampaignEx campaignEx);

    void a(boolean z10);

    void a(boolean z10, String str);

    void close();

    void readyStatus(int i10);

    void toggleCloseBtn(int i10);

    void triggerCloseBtn(String str);
}
