package yads;

import android.content.Context;
import com.ironsource.C3605n2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ne3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng3 f80668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd3 f80669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le3 f80670c;

    public /* synthetic */ ne3(Context context, df3 df3Var) {
        this(new ng3(), new cd3(context), new le3(df3Var));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList a(List list, mj3 mj3Var) {
        List listH0;
        int i10;
        bd3 bd3Var;
        kl1 kl1VarA;
        ol1 ol1Var;
        Object next;
        Object next2;
        this.f80668a.getClass();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    listH0 = nj.b0.O0(list);
                    break;
                }
                if (((ud3) it.next()).f83431k != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((ud3) obj).f83431k != null) {
                            arrayList.add(obj);
                        }
                    }
                    listH0 = nj.b0.H0(arrayList, new mg3());
                    break;
                }
            }
        } else {
            listH0 = nj.b0.O0(list);
            break;
        }
        cd3 cd3Var = this.f80669b;
        cd3Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listH0.iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            ud3 ud3Var = (ud3) it2.next();
            b20 b20Var = (b20) nj.b0.h0(ud3Var.f83422b);
            if (b20Var == null) {
                bd3Var = null;
            } else if (!b20Var.f75700b.isEmpty()) {
                bd3Var = new bd3(ud3Var, b20Var, new kl1("", null, null, null, null, null, 0, 0, 0, null), null, null, null, null, null);
            } else {
                nt2 nt2Var = cd3Var.f76237e;
                if (nt2Var != null && nt2Var.A0 && ud3Var.f83421a) {
                    String str = ud3Var.f83429i;
                    if (str == null) {
                        str = "";
                    }
                    bd3Var = new bd3(ud3Var, b20Var, new kl1(str, null, null, null, null, null, 0, 0, 0, null), null, null, null, null, null);
                } else {
                    nl1 nl1Var = cd3Var.f76233a;
                    Object[] objArr = mj3Var != null && mj3Var.f80197c;
                    nl1Var.getClass();
                    kl1 kl1VarA2 = nl1Var.a(b20Var.f75699a);
                    if (kl1VarA2 == null) {
                        ol1Var = null;
                    } else {
                        if (objArr == true) {
                            List list2 = b20Var.f75699a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!ck.p.e(((kl1) obj2).f79460d, kl1VarA2.f79460d)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            kl1VarA = nl1Var.a(arrayList3);
                        } else {
                            kl1VarA = null;
                        }
                        ol1Var = new ol1(kl1VarA2, kl1VarA);
                    }
                    if (ol1Var != null) {
                        de3 de3Var = ud3Var.f83424d;
                        cd3Var.f76234b.getClass();
                        Iterator it3 = de3Var.f76657a.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            hq0 hq0Var = (hq0) next;
                            if (ck.p.e(hq0Var.f78301a, "social_ad_info") && hq0Var.f78302b.length() > 0) {
                                break;
                            }
                        }
                        hq0 hq0Var2 = (hq0) next;
                        String str2 = hq0Var2 != null ? hq0Var2.f78302b : null;
                        a23 a23Var = str2 != null ? new a23(str2) : null;
                        cd3Var.f76235c.getClass();
                        String strA = n5.a(de3Var);
                        cd3Var.f76235c.getClass();
                        String strA2 = n5.a(de3Var);
                        JSONObject jSONObjectA = strA2 != null ? ge1.a(strA2) : null;
                        cd3Var.f76236d.getClass();
                        Iterator it4 = de3Var.f76657a.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                        } while (!ck.p.e(((hq0) next2).f78301a, "AdTune"));
                        hq0 hq0Var3 = (hq0) next2;
                        String str3 = hq0Var3 != null ? hq0Var3.f78302b : null;
                        JSONObject jSONObjectA2 = str3 != null ? ge1.a(str3) : null;
                        bd3Var = new bd3(ud3Var, b20Var, ol1Var.f81097a, ol1Var.f81098b, a23Var, strA, jSONObjectA, jSONObjectA2 != null ? new ab(jSONObjectA2.optString("token"), jSONObjectA2.optString("advertiserInfo"), jSONObjectA2.optInt(C3605n2.f30216v, 0) == 1) : null);
                    } else {
                        bd3Var = null;
                    }
                }
            }
            if (bd3Var != null) {
                arrayList2.add(bd3Var);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList(nj.t.v(arrayList2, 10));
        for (Object obj3 : arrayList2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            bd3 bd3Var2 = (bd3) obj3;
            le3 le3Var = this.f80670c;
            le3Var.getClass();
            ud3 ud3Var2 = bd3Var2.f75782a;
            b20 b20Var2 = bd3Var2.f75783b;
            kl1 kl1Var = bd3Var2.f75784c;
            a23 a23Var2 = bd3Var2.f75786e;
            String str4 = bd3Var2.f75787f;
            JSONObject jSONObject = bd3Var2.f75788g;
            lf3 lf3Var = new lf3(size, i11);
            ab abVar = bd3Var2.f75789h;
            String strA3 = abVar != null ? bb.a(abVar) : null;
            Object objA = le3Var.f79764a.a(ud3Var2, b20Var2, kl1Var, lf3Var, str4, strA3, jSONObject);
            String strValueOf = String.valueOf(y21.f84797a.getAndIncrement());
            kl1 kl1Var2 = bd3Var2.f75785d;
            arrayList4.add(new je3(b20Var2, ud3Var2, kl1Var, objA, kl1Var2 != null ? le3Var.f79764a.a(ud3Var2, b20Var2, kl1Var2, lf3Var, str4, strA3, jSONObject) : null, a23Var2, strValueOf, abVar));
            i10 = i11;
        }
        return arrayList4;
    }

    public ne3(ng3 ng3Var, cd3 cd3Var, le3 le3Var) {
        this.f80668a = ng3Var;
        this.f80669b = cd3Var;
        this.f80670c = le3Var;
    }
}
