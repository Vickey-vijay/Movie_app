package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dp3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f76773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ep3 f76774b;

    @Override // yads.to2
    public final void a(be3 be3Var) {
        this.f76773a.a(be3Var);
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        List listI0 = (List) obj;
        ep3 ep3Var = this.f76774b;
        ip3 ip3Var = ep3Var.f77165a.f79524a.f83433m;
        if (ip3Var != null) {
            if (!ip3Var.f78769b) {
                ep3Var.f77166b.getClass();
                listI0 = pg3.a(listI0).f81036a;
            }
            if (!ip3Var.f78768a) {
                listI0 = nj.b0.I0(listI0, 1);
            }
            zo3 zo3Var = ep3Var.f77167c;
            zo3Var.getClass();
            int i10 = 10;
            ArrayList arrayList = new ArrayList(nj.t.v(listI0, 10));
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                ud3 ud3Var = (ud3) it.next();
                xo3 xo3Var = zo3Var.f85555b;
                List list = xo3Var.f84664a.f83422b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    nj.x.C(arrayList2, ((b20) it2.next()).f75702d);
                }
                List list2 = ud3Var.f83422b;
                ArrayList arrayList3 = new ArrayList(nj.t.v(list2, i10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    b20 b20Var = (b20) it3.next();
                    xo3Var.f84665b.getClass();
                    List list3 = b20Var.f75701c;
                    ArrayList arrayList4 = new ArrayList(nj.t.v(list3, i10));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((j21) it4.next()).f78901a);
                    }
                    Set setS0 = nj.b0.S0(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        nj.x.C(arrayList5, ((b20) it5.next()).f75701c);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (setS0.add(((j21) obj2).f78901a)) {
                            arrayList6.add(obj2);
                        }
                    }
                    List listK = b20Var.f75702d;
                    List listY0 = nj.b0.y0(b20Var.f75699a, b20Var.f75700b);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = it;
                    ArrayList arrayList9 = new ArrayList();
                    xo3 xo3Var2 = xo3Var;
                    String str = b20Var.f75706h;
                    if (listY0 == null) {
                        listY0 = nj.s.k();
                    }
                    arrayList7.addAll(listY0);
                    List listK2 = b20Var.f75701c;
                    if (listK2 == null) {
                        listK2 = nj.s.k();
                    }
                    arrayList8.addAll(listK2);
                    arrayList9.addAll(arrayList2);
                    String str2 = b20Var.f75704f;
                    List list4 = list;
                    n03 n03Var = b20Var.f75705g;
                    ArrayList arrayList10 = arrayList2;
                    int i11 = b20Var.f75707i;
                    arrayList8.addAll(arrayList6);
                    if (listK == null) {
                        listK = nj.s.k();
                    }
                    arrayList9.addAll(listK);
                    String str3 = b20Var.f75708j;
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        Iterator it8 = it3;
                        Object next = it7.next();
                        Iterator it9 = it7;
                        if (next instanceof kl1) {
                            arrayList11.add(next);
                        }
                        it7 = it9;
                        it3 = it8;
                    }
                    Iterator it10 = it3;
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it11 = arrayList7.iterator();
                    while (it11.hasNext()) {
                        Object next2 = it11.next();
                        Iterator it12 = it11;
                        if (next2 instanceof rc1) {
                            arrayList12.add(next2);
                        }
                        it11 = it12;
                    }
                    arrayList3.add(new b20(arrayList11, arrayList12, arrayList8, arrayList9, null, str2, n03Var, str, i11, str3));
                    it = it6;
                    xo3Var = xo3Var2;
                    list = list4;
                    arrayList2 = arrayList10;
                    it3 = it10;
                    i10 = 10;
                }
                Iterator it13 = it;
                yo3 yo3Var = zo3Var.f85556c;
                ud3 ud3Var2 = zo3Var.f85554a;
                yo3Var.getClass();
                de3 de3Var = ud3Var.f83424d;
                de3 de3Var2 = ud3Var2.f83424d;
                de3 de3Var3 = new de3(nj.b0.y0(de3Var.f76657a, de3Var2.f76657a), nj.b0.y0(de3Var.f76658b, de3Var2.f76658b));
                ap3 ap3Var = zo3Var.f85557d;
                ud3 ud3Var3 = zo3Var.f85554a;
                ap3Var.getClass();
                List listN = nj.s.n(ud3Var, ud3Var3);
                ArrayList arrayList13 = new ArrayList();
                Iterator it14 = listN.iterator();
                while (it14.hasNext()) {
                    ol3 ol3Var = ((ud3) it14.next()).f83430j;
                    List listK3 = ol3Var != null ? ol3Var.f81099a : null;
                    if (listK3 == null) {
                        listK3 = nj.s.k();
                    }
                    nj.x.C(arrayList13, listK3);
                }
                ol3 ol3Var2 = new ol3(arrayList13);
                Map map = ud3Var.f83423c;
                ud3 ud3Var4 = zo3Var.f85554a;
                Map map2 = ud3Var4.f83423c;
                List listY1 = nj.b0.y0(ud3Var.f83434n, ud3Var4.f83434n);
                td3 td3Var = new td3(ud3Var.f83421a, new kg3(zo3Var.f85558e));
                td3Var.f82993k = ud3Var.f83432l;
                td3Var.f82994l.addAll(arrayList3);
                td3 td3VarA = td3Var.a(map);
                td3VarA.f82986d = ud3Var.f83425e;
                td3VarA.f82987e = ud3Var.f83426f;
                td3VarA.f82988f = ud3Var.f83427g;
                td3VarA.f82989g = ud3Var.f83428h;
                td3VarA.f82990h = ud3Var.f83429i;
                td3VarA.f82997o = de3Var3;
                td3VarA.f82991i = ol3Var2;
                td3VarA.f82985c = ud3Var.f83433m;
                td3 td3VarA2 = td3VarA.a(map2);
                ArrayList arrayList14 = td3VarA2.f82995m;
                if (listY1 == null) {
                    listY1 = nj.s.k();
                }
                arrayList14.addAll(listY1);
                arrayList.add(td3VarA2.a());
                it = it13;
                i10 = 10;
            }
            listI0 = arrayList;
        }
        this.f76773a.onSuccess(listI0);
    }

    public dp3(gp3 gp3Var, ep3 ep3Var) {
        this.f76773a = gp3Var;
        this.f76774b = ep3Var;
    }
}
