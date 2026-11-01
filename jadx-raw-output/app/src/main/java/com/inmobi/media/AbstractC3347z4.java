package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3347z4 {
    public static final ArrayList a(G g10, String str) {
        ck.p.j(g10, "<this>");
        ck.p.j(str, "type");
        List list = g10.f22697f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ck.p.e(((Trackers) obj).getType(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nj.x.C(arrayList2, ((Trackers) it.next()).getUrl());
        }
        return arrayList2.isEmpty() ? a(str, g10.f22698g) : arrayList2;
    }

    public static final ArrayList a(String str, List list) {
        ck.p.j(list, "<this>");
        ck.p.j(str, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList<TrackersV2> arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (ck.p.e(((TrackersV2) obj).getType(), str)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (TrackersV2 trackersV2 : arrayList2) {
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(nj.t.v(imExts, 10));
                for (String str2 : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str2);
                }
                nj.x.C(arrayList3, nj.b0.y0(url, arrayList4));
            }
            nj.x.C(arrayList, arrayList3);
        }
        return arrayList;
    }
}
