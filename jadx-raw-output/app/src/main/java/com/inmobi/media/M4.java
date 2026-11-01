package com.inmobi.media;

import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class M4 {
    public static JSONArray a(L4 l10, List list) {
        ck.p.j(l10, "it");
        ck.p.j(list, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list2 = L4.f23049j;
        ck.p.j(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(l10.f23050a);
        }
        ck.p.j("bid", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("bid")) {
            jSONArray.put(l10.f23051b);
        }
        ck.p.j("its", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("its")) {
            jSONArray.put(l10.f23052c);
        }
        ck.p.j("vtm", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("vtm")) {
            jSONArray.put(l10.f23053d);
        }
        ck.p.j("plid", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("plid")) {
            jSONArray.put(l10.f23054e);
        }
        ck.p.j("catid", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("catid")) {
            jSONArray.put(l10.f23055f);
        }
        ck.p.j("hcd", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("hcd")) {
            jSONArray.put(l10.f23056g);
        }
        ck.p.j("hsv", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("hsv")) {
            jSONArray.put(l10.f23057h);
        }
        ck.p.j("hcv", C3426d4.i.W);
        ck.p.j(list, "skipList");
        if (!list.contains("hcv")) {
            jSONArray.put(l10.f23058i);
        }
        return jSONArray;
    }
}
