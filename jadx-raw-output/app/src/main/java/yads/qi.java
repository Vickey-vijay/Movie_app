package yads;

import android.widget.ImageView;
import com.ironsource.C3426d4;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes10.dex */
public final class qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f81854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi2 f81855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tn1 f81856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d42 f81857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h32 f81858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final io2 f81859f;

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public final rj1 a(ImageView imageView, CustomizableMediaView customizableMediaView) {
        sn1 sn1VarA;
        c51 c51Var = imageView != null ? new c51(imageView, this.f81855b, this.f81854a) : null;
        if (customizableMediaView != null) {
            tn1 tn1Var = this.f81856c;
            mi2 mi2Var = this.f81855b;
            d42 d42Var = this.f81857d;
            h32 h32Var = this.f81858e;
            Object obj = tn1Var.f83107a.f76286a.get(C3426d4.i.I0);
            on1 on1Var = obj instanceof on1 ? (on1) obj : null;
            un1 un1Var = tn1Var.f83110d;
            if (un1Var != null) {
                sn1VarA = un1Var.a(customizableMediaView, tn1Var.f83108b, mi2Var, tn1Var.f83113g, tn1Var.f83109c, d42Var, h32Var, tn1Var.f83111e, tn1Var.f83112f, tn1Var.f83114h, on1Var);
            } else {
                sn1VarA = null;
            }
        } else {
            sn1VarA = null;
        }
        if (c51Var == null && sn1VarA == null) {
            return null;
        }
        return new rj1(c51Var, sn1VarA);
    }

    public qi(v9 v9Var, mi2 mi2Var, tn1 tn1Var, d42 d42Var, h32 h32Var, at1 at1Var, t20 t20Var) {
        this.f81854a = v9Var;
        this.f81855b = mi2Var;
        this.f81856c = tn1Var;
        this.f81857d = d42Var;
        this.f81858e = h32Var;
        this.f81859f = at1Var;
    }
}
