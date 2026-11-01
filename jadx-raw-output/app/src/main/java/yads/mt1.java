package yads;

import com.yandex.div.core.DivKit;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class mt1 extends wt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80386a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd3 f80387b;

    public final void a(vt1 vt1Var) {
        try {
            pd3 pd3Var = this.f80387b;
            String versionName = DivKit.Companion.getVersionName();
            pd3Var.getClass();
            od3 od3VarA = pd3.a(versionName);
            this.f80387b.getClass();
            od3 od3VarA2 = pd3.a("32.18.1");
            Integer numValueOf = od3VarA2 != null ? Integer.valueOf(od3VarA2.f81007b) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (od3VarA == null || !(this.f80386a || od3VarA.f81007b == iIntValue)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = numValueOf;
                    objArr[1] = od3VarA != null ? Integer.valueOf(od3VarA.f81007b) : null;
                    String str = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(objArr, 2));
                    ck.p.i(str, "format(...)");
                    ub1 ub1Var = new ub1(str, str);
                    vt1Var.getClass();
                    throw ub1Var;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String str2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            ck.p.i(str2, "format(...)");
            ub1 ub1Var2 = new ub1(str2, str2);
            vt1Var.getClass();
            throw ub1Var2;
        }
    }

    public mt1(pd3 pd3Var) {
        this.f80387b = pd3Var;
    }
}
