package com.bytedance.adsdk.ouw.vt.lh.ouw;

import java.util.Deque;

/* JADX INFO: loaded from: classes9.dex */
public final class fkw extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        char cOuw;
        int i11 = i10;
        while (true) {
            cOuw = le.ouw(i11, str);
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw(cOuw) && !com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(cOuw)) {
                break;
            }
            i11++;
        }
        if (cOuw != '(') {
            return ouwVar.ouw(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.ouw.vt.vt.ouw.tlj(str.substring(i10, i11)));
        return i11 + 1;
    }
}
