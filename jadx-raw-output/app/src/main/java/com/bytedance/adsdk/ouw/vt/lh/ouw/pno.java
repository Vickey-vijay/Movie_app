package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.rn;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class pno extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        boolean z10;
        char cOuw = le.ouw(i10, str);
        if ('+' != cOuw && '-' != cOuw && '*' != cOuw && '/' != cOuw && '%' != cOuw && '=' != cOuw && '>' != cOuw && '<' != cOuw && '!' != cOuw && '&' != cOuw && '|' != cOuw && '?' != cOuw && ':' != cOuw) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return ouwVar.ouw(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{le.ouw(i10, str), le.ouw(i11, str)});
        if (com.bytedance.adsdk.ouw.vt.yu.lh.ouw(str2) != null) {
            deque.push(new rn(com.bytedance.adsdk.ouw.vt.yu.lh.ouw(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(le.ouw(i10, str));
        if (com.bytedance.adsdk.ouw.vt.yu.lh.ouw(strValueOf) != null) {
            deque.push(new rn(com.bytedance.adsdk.ouw.vt.yu.lh.ouw(strValueOf)));
            return i11;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i10));
    }
}
