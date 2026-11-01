package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pair<String, Integer> f70472a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l.a f70473i;

    public e(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
        this.f70472a = null;
        this.f70473i = new l.a() { // from class: sg.bigo.ads.controller.a.b.e.1
            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map) {
                e.this.f70460h.set(false);
                e eVar = e.this;
                eVar.a(eVar.f70472a, c.a(i12));
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str, int i10, String str2, @Nullable Map<String, Object> map) {
                e.this.f70460h.set(false);
                e eVar = e.this;
                eVar.a(eVar.f70472a, false);
            }
        };
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.b();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final void a(Pair<String, Integer> pair) {
        if (pair == null) {
            return;
        }
        this.f70460h.set(true);
        this.f70472a = pair;
        sg.bigo.ads.controller.a.b bVar = this.f70454b;
        String str = (String) pair.first;
        l.a aVar = this.f70473i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l lVar = new l(bVar.f70408b, bVar, new l.a() { // from class: sg.bigo.ads.controller.a.b.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sg.bigo.ads.controller.a.a.c f70422a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ l.a f70423b;

            public AnonymousClass3() {
                cVar = cVar;
                aVar = aVar;
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str2, int i10, int i11, int i12, @NonNull String str3, @Nullable Map<String, Object> map) {
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2, i10, i11, i12, str3, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.l.a
            public final void a(String str2, int i10, String str3, @Nullable Map<String, Object> map) {
                cVar.f70370h = System.currentTimeMillis();
                b.this.f70407a.a(0L);
                l.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2, i10, str3, map);
                }
            }
        });
        lVar.f70901i = str;
        lVar.b();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.controller.a.a.b b() {
        return this.f70454b.f70407a.f70334g;
    }
}
