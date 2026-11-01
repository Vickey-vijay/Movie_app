package com.bytedance.sdk.component.le.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes10.dex */
public final class vt extends ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Queue<String> f11808lh;
    private final yu ouw;
    private final lh vt;

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, int i10) {
        yu yuVar;
        lh lhVar;
        if (i10 != 5) {
            if (pno.vt().bly.ouw(pno.vt().ouw) && (yuVar = this.ouw) != null && ouwVar != null) {
                yuVar.ouw(ouwVar, i10);
            }
            lhVar = this.vt;
            if (lhVar != null && ouwVar != null) {
                lhVar.ouw(ouwVar, i10);
            }
        } else {
            lhVar = this.vt;
            if (lhVar != null) {
                lhVar.ouw(ouwVar, i10);
            }
        }
        throw th;
    }

    public vt() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f11808lh = concurrentLinkedQueue;
        this.ouw = new le(concurrentLinkedQueue);
        this.vt = new lh();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized void ouw(int i10, List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
        while (it.hasNext()) {
            this.f11808lh.remove(it.next().lh());
        }
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(i10, list);
        }
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.ouw(i10, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i10, int i11, List<String> list) {
        int i12;
        boolean z10;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw = this.ouw.ouw(i10, i11, list);
        if (listOuw != 0 && listOuw.size() != 0) {
            listOuw.size();
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            if (i10 == 1 || i10 == 2) {
                lh lhVar = this.vt;
                com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = (com.bytedance.sdk.component.le.ouw.yu.ouw) listOuw.get(0);
                int size = listOuw.size();
                List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw2 = null;
                if (ouwVar.yu() == 0 && ouwVar.fkw() == 1 && com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
                    int i13 = lhVar.f11802ra.vt;
                    if (i13 > size) {
                        listOuw2 = lhVar.ouw.ouw(i13 - size, "_id");
                        if (listOuw2.size() != 0) {
                            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
                        }
                    }
                } else if (ouwVar.yu() == 3 && ouwVar.fkw() == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
                    int i14 = lhVar.bly.vt;
                    if (i14 > size) {
                        listOuw2 = lhVar.f11801lh.ouw(i14 - size, "_id");
                    }
                } else if (ouwVar.yu() == 0 && ouwVar.fkw() == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
                    int i15 = lhVar.pno.vt;
                    if (i15 > size) {
                        listOuw2 = lhVar.vt.ouw(i15 - size, "_id");
                        if (listOuw2.size() != 0) {
                            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                            com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
                        }
                    }
                } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
                    int i16 = lhVar.tlj.vt;
                    if (i16 > size) {
                        listOuw2 = lhVar.yu.ouw(i16 - size, "_id");
                        if (listOuw2.size() != 0) {
                            com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                            com.bytedance.sdk.component.le.ouw.fkw fkwVar3 = pno.vt().bly;
                        }
                    }
                } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
                    int i17 = lhVar.f11799cf.vt;
                    if (i17 > size) {
                        listOuw2 = lhVar.fkw.ouw(i17 - size, "_id");
                        if (listOuw2.size() != 0) {
                            com.bytedance.sdk.component.le.ouw.vt.yu yuVar4 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                            com.bytedance.sdk.component.le.ouw.fkw fkwVar4 = pno.vt().bly;
                        }
                    }
                } else if (ouwVar.yu() == 2 && ouwVar.fkw() == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le() && (i12 = lhVar.ryl.vt) > size) {
                    listOuw2 = lhVar.f11800le.ouw(i12 - size, "_id");
                }
                if (listOuw2 != null && listOuw2.size() != 0) {
                    listOuw2.size();
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    HashMap map = new HashMap();
                    for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2 : listOuw2) {
                        map.put(ouwVar2.lh(), ouwVar2);
                    }
                    ArrayList arrayList = new ArrayList(this.f11808lh);
                    for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar3 : listOuw2) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                            if (TextUtils.equals(ouwVar3.lh(), (String) it.next())) {
                                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            map.remove(ouwVar3.lh());
                        }
                    }
                    for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar4 : listOuw) {
                        map.put(ouwVar4.lh(), ouwVar4);
                    }
                    listOuw.clear();
                    Iterator it2 = map.keySet().iterator();
                    while (it2.hasNext()) {
                        listOuw.add(map.get((String) it2.next()));
                    }
                    listOuw2.clear();
                }
            }
        } else {
            ArrayList<String> arrayList2 = new ArrayList(this.f11808lh);
            if (list != null && !list.isEmpty()) {
                arrayList2.addAll(list);
            }
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw3 = this.vt.ouw(i10, i11, arrayList2);
            if (listOuw3 != 0 && listOuw3.size() != 0) {
                HashMap map2 = new HashMap();
                for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar5 : listOuw3) {
                    map2.put(ouwVar5.lh(), ouwVar5);
                }
                arrayList2.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                if (arrayList2.size() != 0) {
                    for (String str : arrayList2) {
                        if (map2.get(str) != null) {
                            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                            map2.remove(str);
                        }
                    }
                }
                listOuw3.clear();
                Iterator it3 = map2.keySet().iterator();
                while (it3.hasNext()) {
                    listOuw3.add(map2.get((String) it3.next()));
                }
            }
            listOuw = listOuw3;
        }
        if (listOuw != 0 && !listOuw.isEmpty()) {
            Iterator it4 = listOuw.iterator();
            while (it4.hasNext()) {
                this.f11808lh.offer(((com.bytedance.sdk.component.le.ouw.yu.ouw) it4.next()).lh());
            }
            return listOuw;
        }
        return new ArrayList();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized boolean ouw(int i10, boolean z10) {
        if (this.ouw.ouw(i10, z10)) {
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.vt.ouw(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
        return true;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i10, long j10) {
        this.vt.ouw(i10, j10);
        this.ouw.ouw(i10, j10);
    }
}
