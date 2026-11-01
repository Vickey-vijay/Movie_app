package yads;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class qv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb2 f81983a;

    public final void a(String str) {
        this.f81983a.loadUrl("javascript: " + str);
        boolean z10 = ad1.f75480a;
    }

    public final void b(String str) {
        ck.w wVar = ck.w.f6066a;
        String str2 = String.format("window.mraidbridge.%s", Arrays.copyOf(new Object[]{str}, 1));
        ck.p.i(str2, "format(...)");
        a(str2);
    }

    public qv1(gw1 gw1Var) {
        this.f81983a = gw1Var;
    }

    public final void a(de1... de1VarArr) {
        int i10 = 0;
        if (!(de1VarArr.length == 0)) {
            StringBuilder sb2 = new StringBuilder("fireChangeEvent({");
            int length = de1VarArr.length;
            String str = "";
            while (i10 < length) {
                de1 de1Var = de1VarArr[i10];
                sb2.append(str);
                sb2.append(de1Var.a());
                i10++;
                str = ", ";
            }
            sb2.append("})");
            b(sb2.toString());
        }
    }

    public final void a(bw1 bw1Var, String str) {
        b("notifyErrorEvent(" + JSONObject.quote(bw1Var.a()) + ", " + JSONObject.quote(str) + ")");
    }

    public final void a(bw1 bw1Var) {
        b("nativeCallComplete(" + JSONObject.quote(bw1Var.a()) + ")");
    }
}
