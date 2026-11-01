package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.zin;
import java.util.Deque;

/* JADX INFO: loaded from: classes7.dex */
public final class yu extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        if ('(' != le.ouw(i10, str)) {
            return ouwVar.ouw(str, i10, deque);
        }
        deque.push(new zin(com.bytedance.adsdk.ouw.vt.yu.yu.LEFT_PAREN));
        return i10 + 1;
    }
}
