package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.qbp;
import java.util.Deque;

/* JADX INFO: loaded from: classes7.dex */
public final class vt extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        if ('\'' != le.ouw(i10, str)) {
            return ouwVar.ouw(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && le.ouw(i12, str) != '\'') {
            i12++;
        }
        if (le.ouw(i12, str) == '\'') {
            deque.push(new qbp(str.substring(i11, i12)));
            return i12 + 1;
        }
        throw new com.bytedance.adsdk.ouw.ouw.ouw("String expression not surrounded by '", str.substring(i11 - 1));
    }
}
