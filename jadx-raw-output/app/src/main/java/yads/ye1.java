package yads;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ye1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f84921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f84922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f84923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f84925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d4 f84926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lu2 f84927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ze1 f84928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z30 f84929i;

    public /* synthetic */ ye1(Context context, v9 v9Var, kz kzVar, b2 b2Var, int i10, q2 q2Var, d4 d4Var, lu2 lu2Var) {
        this(v9Var, kzVar, b2Var, i10, q2Var, d4Var, lu2Var, new ze1(), new a40(context, lu2Var, new aq2().b(v9Var, d4Var)).a());
    }

    public final xe1 a(Context context, ViewGroup viewGroup, w02 w02Var, z00 z00Var, z3 z3Var, ir2 ir2Var, k63 k63Var, ph0 ph0Var, gi0 gi0Var, j7 j7Var) {
        d4 d4Var = this.f84926f;
        lu2 lu2Var = this.f84927g;
        v9 v9Var = this.f84921a;
        f2 f2Var = this.f84925e;
        int i10 = this.f84924d;
        List listA = (v9Var.f83809a == e00.f76861f ? new rr2(new nr2(d4Var, lu2Var, f2Var, i10)) : new od1(lu2Var, new nd1(d4Var, lu2Var, f2Var, i10), new dz1())).a(context, this.f84921a, w02Var, this.f84922b, this.f84923c, this.f84929i, z3Var, ir2Var, k63Var, ph0Var, gi0Var, j7Var);
        ze1 ze1Var = this.f84928h;
        v9 v9Var2 = this.f84921a;
        kz kzVar = this.f84922b;
        ze1Var.getClass();
        ArrayList arrayList = new ArrayList(nj.t.v(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((vy0) it.next()).a(context, v9Var2, w02Var, kzVar, z00Var));
        }
        return new xe1(context, viewGroup, new we1(arrayList), new ue1(), new te1());
    }

    public ye1(v9 v9Var, kz kzVar, b2 b2Var, int i10, q2 q2Var, d4 d4Var, lu2 lu2Var, ze1 ze1Var, z30 z30Var) {
        this.f84921a = v9Var;
        this.f84922b = kzVar;
        this.f84923c = b2Var;
        this.f84924d = i10;
        this.f84925e = q2Var;
        this.f84926f = d4Var;
        this.f84927g = lu2Var;
        this.f84928h = ze1Var;
        this.f84929i = z30Var;
    }

    public final ArrayList a(Context context, ExtendedNativeAdView extendedNativeAdView, w02 w02Var, z00 z00Var, f7 f7Var, ir2 ir2Var, sj2 sj2Var, i7 i7Var, ArrayList arrayList, gi0 gi0Var, c7 c7Var, lw lwVar) {
        if (w02Var instanceof v22) {
            v22 v22Var = (v22) w02Var;
            List list = c7Var.f76193a;
            ArrayList arrayListI = v22Var.i();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayListI.size();
            for (int i10 = 0; i10 < size; i10++) {
                j7 j7Var = (j7) nj.b0.i0(list, i10);
                arrayList2.add(a(context, extendedNativeAdView, (w02) arrayListI.get(i10), new o43(z00Var), f7Var, ir2Var, new k63(sj2Var, new d7(list), new h7(j7Var != null ? j7Var.f78926a : 0L), new e7(c7Var, i10), lwVar), i7Var, arrayList != null ? (gi0) nj.b0.i0(arrayList, i10) : null, j7Var));
            }
            j7 j7Var2 = (j7) nj.b0.i0(list, arrayListI.size());
            xe1 xe1VarA = gi0Var != null ? a(context, extendedNativeAdView, v22Var, z00Var, f7Var, ir2Var, new k63(sj2Var, new d7(list), new h7(j7Var2 != null ? j7Var2.f78926a : 0L), new fb2(), lwVar), i7Var, gi0Var, j7Var2) : null;
            if (xe1VarA == null) {
                return arrayList2;
            }
            arrayList2.add(xe1VarA);
            return arrayList2;
        }
        List list2 = c7Var.f76193a;
        ArrayList arrayList3 = new ArrayList();
        d7 d7Var = new d7(list2);
        j7 j7Var3 = (j7) nj.b0.h0(list2);
        arrayList3.add(a(context, extendedNativeAdView, w02Var, z00Var, f7Var, ir2Var, new k63(sj2Var, d7Var, new h7(j7Var3 != null ? j7Var3.f78926a : 0L), new e7(c7Var, 0), lwVar), i7Var, arrayList != null ? (gi0) nj.b0.h0(arrayList) : null, (j7) nj.b0.h0(list2)));
        j7 j7Var4 = (j7) nj.b0.i0(list2, 1);
        xe1 xe1VarA2 = gi0Var != null ? a(context, extendedNativeAdView, w02Var, z00Var, f7Var, ir2Var, new k63(sj2Var, new d7(list2), new h7(j7Var4 != null ? j7Var4.f78926a : 0L), new fb2()), i7Var, gi0Var, j7Var4) : null;
        if (xe1VarA2 != null) {
            arrayList3.add(xe1VarA2);
        }
        return arrayList3;
    }
}
