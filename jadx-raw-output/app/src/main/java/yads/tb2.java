package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class tb2 implements ra3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hq1 f82951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fm0 f82952b = new fm0();

    @Override // yads.ra3
    public final String a(Context context, d4 d4Var, ox2 ox2Var) {
        Map map = this.f82951a.f78304c;
        uu0 uu0VarA = vu0.a(context, d4Var, ox2Var);
        if (map != null) {
            uu0VarA.f83631i.putAll(map);
        }
        return this.f82952b.a(context, new yu0(uu0VarA).toString());
    }

    public tb2(hq1 hq1Var) {
        this.f82951a = hq1Var;
    }

    @Override // yads.ra3
    public final String a(d4 d4Var) {
        String str = d4Var.f76560b.f82016a.f79100e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // yads.ra3
    public final qa3 a() {
        return qa3.f81784c;
    }
}
