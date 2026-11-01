package com.mbridge.msdk.mbsignalcommon.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: IMraidSignalCommunication.java */
/* JADX INFO: loaded from: classes11.dex */
public interface b {
    void close();

    void expand(String str, boolean z10);

    CampaignEx getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z10);
}
