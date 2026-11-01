package sg.bigo.ads.controller.g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.controller.b.d f70917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg.bigo.ads.common.g f70918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.api.b f70919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sg.bigo.ads.api.a.l f70920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> f70921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70922f;

    public c(sg.bigo.ads.controller.b.d dVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.api.b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar) {
        this.f70917a = dVar;
        this.f70918b = gVar;
        this.f70919c = bVar;
        this.f70920d = lVar;
        this.f70921e = eVar;
        bVar.a(gVar.Q(), gVar.R(), gVar.S());
        this.f70922f = sg.bigo.ads.common.y.a.a();
    }

    private void a(int i10, int i11, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar = this.f70921e;
        if (eVar != null) {
            eVar.a(this.f70922f, i10, i11, str, this.f70920d);
        }
    }

    @Override // sg.bigo.ads.controller.g.i
    public final int a() {
        return this.f70922f;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    @Override // sg.bigo.ads.controller.g.i
    public final void b() throws Throwable {
        String str;
        String strA;
        String str2 = this.f70919c.f69320b;
        if (TextUtils.isEmpty(str2)) {
            a(1018, 10200, "An adm show be passed when constructing an ad request if using a server bidding slot.");
            return;
        }
        this.f70919c.c(sg.bigo.ads.common.f.b.c());
        sg.bigo.ads.common.g gVar = this.f70918b;
        if (gVar != null) {
            this.f70919c.b(gVar.X());
        }
        int[] iArr = new int[1];
        sg.bigo.ads.controller.h.a aVar = null;
        if (!TextUtils.isEmpty(str2)) {
            byte[] bArrB = sg.bigo.ads.common.j.a.b(str2, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
            if (bArrB == null) {
                iArr[0] = 1;
            } else {
                strA = sg.bigo.ads.controller.c.c.a(bArrB);
                if (TextUtils.isEmpty(strA)) {
                    iArr[0] = 2;
                } else if (!TextUtils.isEmpty(strA)) {
                    aVar = new sg.bigo.ads.controller.h.a(strA);
                }
            }
            strA = null;
            if (!TextUtils.isEmpty(strA)) {
                aVar = new sg.bigo.ads.controller.h.a(strA);
            }
        }
        if (aVar == null || !aVar.a()) {
            if (aVar != null) {
                if (aVar.b()) {
                    sg.bigo.ads.common.x.a.e(System.currentTimeMillis());
                }
                a(1005, aVar.f70927a, aVar.f70928b);
                return;
            } else {
                int i10 = iArr[0];
                if (i10 == 1) {
                    str = "Invalid payload response.";
                } else {
                    str = i10 == 2 ? "Invalid payload data." : "Unknown payload error.";
                }
                a(1005, 10201, str);
                return;
            }
        }
        String str3 = aVar.f70929c;
        Map<String, Object> map = aVar.f70930d;
        if (this.f70921e != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.controller.c.b bVarA = sg.bigo.ads.controller.c.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.f70919c.f69326h, this.f70920d, str3);
            if (bVarA == null) {
                a(1005, 0, "Empty ad data.");
            } else if (TextUtils.equals(bVarA.b(), bVarA.f70644x)) {
                this.f70921e.a(this.f70922f, this.f70919c, bVarA);
            } else {
                a(1005, 0, "Unmatched slot of ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.b k() {
        return this.f70919c;
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.a.l l() {
        return this.f70920d;
    }
}
