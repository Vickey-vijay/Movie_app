package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class qy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w73 f82035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l32 f82036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s03 f82037c;

    public /* synthetic */ qy1(lu2 lu2Var) {
        this(new w73(), new l32(lu2Var), new s03(lu2Var));
    }

    public final v22 a(Context context, ry1 ry1Var, mi2 mi2Var, xz1 xz1Var, fz1 fz1Var) {
        ry1 ry1Var2 = ry1Var;
        ix0 ix0Var = new ix0();
        l32 l32Var = this.f82036b;
        l32Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<fy1> list = ry1Var2.f82466a.f76509a;
        k72 k72Var = xz1Var.f84760c;
        for (fy1 fy1Var : list) {
            j72 j72VarA = k72Var.a(fy1Var);
            s02 s02Var = new s02(context, fy1Var, mi2Var, j72VarA);
            db dbVar = l32Var.f79693b;
            w73 w73Var = dbVar.f76604a;
            List list2 = fy1Var.f77552h;
            w73Var.getClass();
            ArrayList arrayListA = w73.a(list2, null);
            w73 w73Var2 = dbVar.f76604a;
            List list3 = fy1Var.f77551g;
            w73Var2.getClass();
            ArrayList arrayListA2 = w73.a(list3, null);
            List list4 = fy1Var.f77546b;
            l72 l72Var = new l72(list4, arrayListA, arrayListA2, fy1Var.f77547c, fy1Var.f77550f);
            py1 py1Var = l32Var.f79694c;
            va vaVar = va.f83857d;
            py1Var.getClass();
            Object obj = h22.f78023a;
            h22 h22VarA = g22.a();
            k72 k72Var2 = k72Var;
            ny1 ny1Var = new ny1(list4, h22VarA);
            ArrayList arrayList2 = arrayList;
            up upVar = new up(ry1Var, new k12(ny1Var, ry1Var2.f82467b), l72Var, j72VarA, xz1Var, new a6(ix0Var), new t12(context, ny1Var, h22VarA), py1Var.f81648a, fy1Var, vaVar);
            k32 k32Var = l32Var.f79692a;
            cq2 cq2Var = fy1Var.f77545a;
            k32Var.getClass();
            int iOrdinal = cq2Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (k32Var.f79291a != null) {
                arrayList2.add(new oy1(context, fy1Var, s02Var, mi2Var, upVar, fz1Var));
                k72Var = k72Var2;
                arrayList = arrayList2;
                l32Var = l32Var;
                ix0Var = ix0Var;
                ry1Var2 = ry1Var2;
            } else {
                k72Var = k72Var2;
                arrayList = arrayList2;
            }
        }
        ix0 ix0Var2 = ix0Var;
        ry1 ry1Var3 = ry1Var2;
        u22 u22Var = new u22(arrayList);
        s03 s03Var = this.f82037c;
        mb mbVar = s03Var.f82490b;
        mbVar.getClass();
        d12 d12Var = ry1Var3.f82466a;
        List list5 = d12Var.f76510b;
        w73 w73Var3 = mbVar.f80134a;
        List list6 = d12Var.f76515g;
        w73Var3.getClass();
        ArrayList arrayListA3 = w73.a(null, list6);
        w73 w73Var4 = mbVar.f80134a;
        List list7 = d12Var.f76511c;
        w73Var4.getClass();
        l72 l72Var2 = new l72(list5, arrayListA3, w73.a(null, list7), "ad_unit", d12Var.f76512d);
        Object obj2 = h22.f78023a;
        h22 h22VarA2 = g22.a();
        ny1 ny1Var2 = new ny1(list5, h22VarA2);
        Object obj3 = dw2.f76819j;
        return new v22(context, u22Var, mi2Var, new up(ry1Var, new v03(u22Var, ny1Var2, cw2.a(), ry1Var3.f82467b), l72Var2, new w03(list5), xz1Var, new lb(ix0Var2), new t12(context, ny1Var2, h22VarA2), s03Var.f82489a, null, va.f83856c), fz1Var);
    }

    public qy1(w73 w73Var, l32 l32Var, s03 s03Var) {
        this.f82035a = w73Var;
        this.f82036b = l32Var;
        this.f82037c = s03Var;
    }
}
