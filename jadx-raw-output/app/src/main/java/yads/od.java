package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class od implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd f80996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f80997b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pd f80998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f80999d;

    public final void a() {
        pd pdVar = this.f80998c;
        if (pdVar != null) {
            vc vcVar = (vc) pdVar;
            vcVar.f83875a.f84526b.a();
            ng0.a(vcVar.f83875a.f84525a);
        }
    }

    public final List b() {
        return nj.s.n(new qd("adtuneRendered", new nd(this)), new qd("adtuneClosed", new ld(this)), new qd("openOptOut", new md(this)));
    }

    public od(dd ddVar) {
        this.f80996a = ddVar;
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f80997b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
            pd pdVar = this.f80998c;
            if (pdVar != null) {
                ((vc) pdVar).f83875a.f84527c.a(str);
            }
        } catch (URISyntaxException unused) {
            boolean z10 = ad1.f75480a;
            a();
        }
    }

    @Override // yads.n11
    public final void a(int i10) {
        int[] iArr = {-12, -6, -11, -2};
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            if (i10 == iArr[i11]) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            a();
        }
    }
}
