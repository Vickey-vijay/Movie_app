package com.bytedance.adsdk.ouw.vt;

import com.bytedance.adsdk.ouw.vt.lh.ouw.bly;
import com.bytedance.adsdk.ouw.vt.lh.ouw.fkw;
import com.bytedance.adsdk.ouw.vt.lh.ouw.le;
import com.bytedance.adsdk.ouw.vt.lh.ouw.lh;
import com.bytedance.adsdk.ouw.vt.lh.ouw.pno;
import com.bytedance.adsdk.ouw.vt.lh.ouw.ra;
import com.bytedance.adsdk.ouw.vt.lh.ouw.tlj;
import com.bytedance.adsdk.ouw.vt.lh.ouw.vt;
import com.bytedance.adsdk.ouw.vt.lh.ouw.yu;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    private static final com.bytedance.adsdk.ouw.vt.lh.ouw ouw;
    private String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.adsdk.ouw.vt.vt.ouw f10739lh;
    private final com.bytedance.adsdk.ouw.vt.lh.ouw vt;
    private Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> yu = new LinkedList();

    public static ouw ouw(String str) {
        return new ouw(str, ouw);
    }

    static {
        int i10 = 8;
        le[] leVarArr = {new tlj(), new yu(), new bly(), new vt(), new fkw(), new com.bytedance.adsdk.ouw.vt.lh.ouw.ouw(), new ra(), new lh(), new pno()};
        final com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar = new com.bytedance.adsdk.ouw.vt.lh.ouw() { // from class: com.bytedance.adsdk.ouw.vt.ouw.1
            @Override // com.bytedance.adsdk.ouw.vt.lh.ouw
            public final int ouw(String str, int i11, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final le leVar = leVarArr[i10];
            i10--;
            ouwVar = new com.bytedance.adsdk.ouw.vt.lh.ouw() { // from class: com.bytedance.adsdk.ouw.vt.ouw.2
                @Override // com.bytedance.adsdk.ouw.vt.lh.ouw
                public final int ouw(String str, int i11, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque) {
                    return leVar.ouw(str, i11, deque, ouwVar);
                }
            };
        }
        ouw = ouwVar;
    }

    private void ouw() {
        int length = this.fkw.length();
        int i10 = 0;
        while (i10 < length) {
            int iOuw = this.vt.ouw(this.fkw, i10, this.yu);
            if (iOuw == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.fkw.substring(0, i10));
            }
            i10 = iOuw;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.ouw.vt.vt.ouw ouwVarPollFirst = this.yu.pollFirst();
            if (ouwVarPollFirst == null) {
                this.f10739lh = com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(arrayList, this.fkw, i10);
                this.yu = null;
                return;
            }
            arrayList.add(0, ouwVarPollFirst);
        }
    }

    private ouw(String str, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        this.vt = ouwVar;
        this.fkw = str;
        try {
            ouw();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.ouw.ouw.vt(str, e10);
        }
    }

    public final <T> T ouw(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) ouw(map);
    }

    private <T> T ouw(Map<String, JSONObject> map) {
        return (T) this.f10739lh.ouw(map);
    }
}
