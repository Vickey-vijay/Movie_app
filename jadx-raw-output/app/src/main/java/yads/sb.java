package yads;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public final class sb implements ra3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fm0 f82574a = new fm0();

    @Override // yads.ra3
    public final String a(Context context, d4 d4Var, ox2 ox2Var) {
        return this.f82574a.a(context, new yu0(vu0.a(context, d4Var, ox2Var)).toString());
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
        return qa3.f81783b;
    }
}
