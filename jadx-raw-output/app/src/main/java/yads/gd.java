package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gd implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa2 f77738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77739b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd f77740c;

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f77739b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            boolean z10 = ad1.f75480a;
        }
    }

    public gd(pa2 pa2Var) {
        this.f77738a = pa2Var;
    }

    @Override // yads.n11
    public final void a(int i10) {
        hd hdVar;
        int[] iArr = {-12, -6, -11, -2};
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            if (i10 == iArr[i11]) {
                z10 = true;
                break;
            }
        }
        if (!z10 || (hdVar = this.f77740c) == null) {
            return;
        }
        ng0.a(((bd) hdVar).f75779a.f76229a);
    }

    public final List a() {
        return nj.r.e(new qd("noInterestAd", new fd(this)));
    }
}
