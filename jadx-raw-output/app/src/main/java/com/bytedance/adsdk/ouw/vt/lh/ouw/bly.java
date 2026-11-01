package com.bytedance.adsdk.ouw.vt.lh.ouw;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class bly extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        com.bytedance.adsdk.ouw.vt.vt.ouw ouwVarPollFirst;
        if (')' != le.ouw(i10, str)) {
            return ouwVar.ouw(str, i10, deque);
        }
        LinkedList<com.bytedance.adsdk.ouw.vt.vt.ouw> linkedList = new LinkedList();
        while (true) {
            ouwVarPollFirst = deque.pollFirst();
            if (ouwVarPollFirst == null || ouwVarPollFirst.ouw() == com.bytedance.adsdk.ouw.vt.yu.yu.LEFT_PAREN || ((ouwVarPollFirst instanceof com.bytedance.adsdk.ouw.vt.vt.ouw.tlj) && ouwVarPollFirst.ouw() == com.bytedance.adsdk.ouw.vt.yu.vt.METHOD && !((com.bytedance.adsdk.ouw.vt.vt.ouw.tlj) ouwVarPollFirst).vt)) {
                break;
            }
            linkedList.addFirst(ouwVarPollFirst);
        }
        if (ouwVarPollFirst != null) {
            if (ouwVarPollFirst.ouw() == com.bytedance.adsdk.ouw.vt.yu.vt.METHOD) {
                com.bytedance.adsdk.ouw.vt.vt.ouw.tlj tljVar = (com.bytedance.adsdk.ouw.vt.vt.ouw.tlj) ouwVarPollFirst;
                LinkedList linkedList2 = new LinkedList();
                LinkedList linkedList3 = new LinkedList();
                for (com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2 : linkedList) {
                    if (ouwVar2.ouw() == com.bytedance.adsdk.ouw.vt.yu.yu.COMMA) {
                        linkedList2.add(com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(linkedList3, str, i10));
                        linkedList3.clear();
                    } else {
                        linkedList3.addLast(ouwVar2);
                    }
                }
                if (!linkedList3.isEmpty()) {
                    linkedList2.add(com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(linkedList3, str, i10));
                }
                tljVar.ouw = (com.bytedance.adsdk.ouw.vt.vt.ouw[]) linkedList2.toArray(new com.bytedance.adsdk.ouw.vt.vt.ouw[linkedList2.size()]);
                tljVar.vt = true;
                int i11 = i10 + 1;
                deque.push(tljVar);
                return i11;
            }
            deque.push(com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(linkedList, str, i10));
            return i10 + 1;
        }
        throw new IllegalArgumentException(str.substring(0, i10));
    }
}
