package sg.bigo.ads.common.p;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends sg.bigo.ads.common.p.a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f69886a = new h(0);
    }

    private h() {
        this.f69809b = new sg.bigo.ads.common.h.a.a();
    }

    public /* synthetic */ h(byte b10) {
        this();
    }

    @Override // sg.bigo.ads.common.p.a
    public final String a() {
        return "ImageLoader";
    }

    @Override // sg.bigo.ads.common.p.a
    public final sg.bigo.ads.common.c a(Context context, String str) {
        return c.a(context).f69871b.get(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context) {
        c.a(context).f69871b.evictAll();
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context, String str, sg.bigo.ads.common.c cVar) {
        c cVarA = c.a(context);
        if (cVar.f69494a.isRecycled()) {
            return;
        }
        cVarA.f69871b.put(str, cVar);
        sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "The left cache size: " + (c.f69870a.get() - cVarA.f69871b.size()));
    }

    @Override // sg.bigo.ads.common.p.a
    public final int b() {
        return this.f69809b.a();
    }

    @Override // sg.bigo.ads.common.p.a
    public final String b(Context context) {
        return o.e(context);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void b(Context context, String str) {
        c.a(context).f69871b.remove(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final String c(Context context, String str) {
        return o.e(context) + File.separator + str;
    }
}
