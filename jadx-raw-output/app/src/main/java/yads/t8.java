package yads;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f82912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f82913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8 f82914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v9 f82915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdQualityVerificationResult f82916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mj.g f82917f;

    public t8(d4 d4Var, Context context, j8 j8Var) {
        this.f82912a = d4Var;
        this.f82913b = context;
        this.f82914c = j8Var;
        this.f82916e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.f82917f = kotlin.b.a(new r8(this));
    }

    public final boolean b() {
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(this.f82913b);
        f8 f8Var = nt2VarA != null ? nt2VarA.f80798v0 : null;
        return f8Var != null && f8Var.f77325a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    public final void a() {
        sz szVar;
        fo2 fo2VarA;
        String str;
        String str2;
        d12 d12Var;
        if (b()) {
            j8 j8Var = this.f82914c;
            Context context = this.f82913b;
            AdQualityVerificationResult adQualityVerificationResult = this.f82916e;
            v9 v9Var = this.f82915d;
            j8Var.getClass();
            v7 v7Var = j8Var.f78935c;
            d4 d4Var = j8Var.f78933a;
            v7Var.getClass();
            Map linkedHashMap = null;
            if (v9Var != null) {
                szVar = v9Var.f83821m;
            } else {
                szVar = null;
            }
            if (szVar == sz.NATIVE) {
                Object obj = v9Var.f83828t;
                if (obj instanceof d12) {
                    d12Var = (d12) obj;
                } else {
                    d12Var = null;
                }
                fo2VarA = v7Var.f83790b.a(v9Var, d4Var, d12Var);
            } else {
                fo2VarA = v7Var.f83789a.a(v9Var, d4Var);
            }
            fo2VarA.a(d4Var.f76570l, "verification_network");
            j8Var.f78936d.getClass();
            Map mapJ = kotlin.collections.a.j();
            if (!ck.x.m(mapJ)) {
                mapJ = null;
            }
            if (mapJ == null) {
                mapJ = new LinkedHashMap();
            }
            String strA = l8.a(adQualityVerificationResult);
            if (strA == null) {
                mapJ.put("verification_status", "undefined");
            } else {
                mapJ.put("verification_status", strA);
            }
            boolean z10 = adQualityVerificationResult instanceof AdQualityVerificationResult.Verified;
            if (z10) {
                int i10 = k8.f79326a[((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationMode().ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        str = "longVerification";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = "fastVerification";
                }
            } else {
                str = null;
            }
            if (str == null) {
                mapJ.put("verification_flow", "undefined");
            } else {
                mapJ.put("verification_flow", str);
            }
            if (z10) {
                AdQualityVerificationState value = ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue();
                if ((value instanceof AdQualityVerificationState.Blocked) || (value instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay)) {
                    str2 = "success";
                } else {
                    if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified) {
                        ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason();
                    }
                    str2 = "error";
                }
            } else {
                if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified) {
                    ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason();
                }
                str2 = "error";
            }
            mapJ.put("status", str2);
            c cVar = fo2VarA.f77472b;
            if (cVar == null) {
                cVar = null;
            }
            Map mapQ = kotlin.collections.a.q(fo2VarA.f77471a, mapJ);
            if (ck.x.m(mapQ)) {
                linkedHashMap = mapQ;
            }
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            co2 co2Var = co2.f76352c;
            eo2 eo2Var = new eo2("ad_verification_result", kotlin.collections.a.B(linkedHashMap), cVar);
            ((iu3) j8Var.f78934b).getClass();
            pu3 pu3Var = pu3.f81606a;
            cf.a(context, new cq3(((iu3) j8Var.f78934b).f78817a)).a(eo2Var);
            ((a9) this.f82917f.getValue()).onInvalidated();
        }
    }

    public /* synthetic */ t8(d4 d4Var, lu2 lu2Var, Context context) {
        this(d4Var, context, new j8(d4Var, lu2Var));
    }
}
