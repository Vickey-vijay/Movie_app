package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.vpp;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class lh extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        int i11;
        char cOuw = le.ouw(i10, str);
        if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw(cOuw) && cOuw != '$') {
            return ouwVar.ouw(str, i10, deque);
        }
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cOuw2 = le.ouw(i11, str);
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw(cOuw2) && !com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(cOuw2) && '.' != cOuw2 && '[' != cOuw2 && ']' != cOuw2 && '_' != cOuw2 && '$' != cOuw2) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.ouw.vt.yu.ouw.ouw(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.ouw.vt.vt.ouw.ra(strSubstring));
        } else {
            deque.push(new vpp(strSubstring));
        }
        return i11;
    }
}
