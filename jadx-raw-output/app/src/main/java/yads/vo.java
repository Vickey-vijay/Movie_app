package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import yads.uo;
import yads.vo;

/* JADX INFO: loaded from: classes11.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f83966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f83967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f83968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f83969d;

    public vo() {
        this(new Random());
    }

    public static int a(uo uoVar, uo uoVar2) {
        int iCompare = Integer.compare(uoVar.f83551c, uoVar2.f83551c);
        return iCompare != 0 ? iCompare : uoVar.f83550b.compareTo(uoVar2.f83550b);
    }

    public vo(Random random) {
        this.f83968c = new HashMap();
        this.f83969d = random;
        this.f83966a = new HashMap();
        this.f83967b = new HashMap();
    }

    public static void a(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final uo b(p51 p51Var) {
        ArrayList arrayListA = a(p51Var);
        if (arrayListA.size() < 2) {
            Object next = null;
            Iterator it = arrayListA.iterator();
            if (it.hasNext()) {
                next = it.next();
            }
            return (uo) next;
        }
        Collections.sort(arrayListA, new Comparator() { // from class: cp.ob
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return vo.a((uo) obj, (uo) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((uo) arrayListA.get(0)).f83551c;
        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
            uo uoVar = (uo) arrayListA.get(i11);
            if (i10 != uoVar.f83551c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (uo) arrayListA.get(0);
            }
            arrayList.add(new Pair(uoVar.f83550b, Integer.valueOf(uoVar.f83552d)));
        }
        uo uoVar2 = (uo) this.f83968c.get(arrayList);
        if (uoVar2 == null) {
            List listSubList = arrayListA.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < listSubList.size(); i13++) {
                i12 += ((uo) listSubList.get(i13)).f83552d;
            }
            int iNextInt = this.f83969d.nextInt(i12);
            int i14 = 0;
            for (int i15 = 0; i15 < listSubList.size(); i15++) {
                uo uoVar3 = (uo) listSubList.get(i15);
                i14 += uoVar3.f83552d;
                if (iNextInt < i14) {
                    uoVar2 = uoVar3;
                    this.f83968c.put(arrayList, uoVar2);
                }
            }
            uoVar2 = (uo) vd1.a(listSubList);
            this.f83968c.put(arrayList, uoVar2);
        }
        return uoVar2;
    }

    public final ArrayList a(p51 p51Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a(jElapsedRealtime, this.f83966a);
        a(jElapsedRealtime, this.f83967b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < p51Var.size(); i10++) {
            uo uoVar = (uo) p51Var.get(i10);
            if (!this.f83966a.containsKey(uoVar.f83550b) && !this.f83967b.containsKey(Integer.valueOf(uoVar.f83551c))) {
                arrayList.add(uoVar);
            }
        }
        return arrayList;
    }
}
