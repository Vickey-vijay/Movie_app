package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3065nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f24911a;

    public C3065nl(G g10) {
        ck.p.j(g10, "adContext");
        this.f24911a = g10;
    }

    public static void a(HashMap map, List list, C3053n9 c3053n9) {
        ck.p.j(map, "macros");
        ck.p.j(list, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ck.p.e(((C3257ve) obj).f25569b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C3257ve) it.next()).f25568a;
            ck.p.j(str, "<this>");
            ck.p.j(map, "macros");
            String strN = str;
            for (Map.Entry entry : map.entrySet()) {
                strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            arrayList2.add(strN);
        }
        for (String str2 : arrayList2) {
            C3271w3 c3271w3 = C3271w3.f25610a;
            Ag ag2 = Ag.REGULAR;
            ck.p.j(str2, "url");
            ck.p.j(ag2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Dg.a(ag2, new C3047n3(str2, c3053n9, null));
        }
    }
}
