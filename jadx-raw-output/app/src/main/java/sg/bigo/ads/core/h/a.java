package sg.bigo.ads.core.h;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends sg.bigo.ads.common.h.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f71530g = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f71531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicBoolean f71532f = new AtomicBoolean(false);

    private a() {
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        if (aVar.e(context)) {
            String strD = aVar.d(context);
            aVar.f69731a = strD;
            if (!TextUtils.isEmpty(strD)) {
                sg.bigo.ads.common.t.a.a("BannerJsManager", "Fetch banner js from file successfully.");
                aVar.f69732b = true;
            }
        }
        aVar.b(context);
    }

    public static a f() {
        return f71530g;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String a() {
        return "BannerJsManager";
    }

    @Override // sg.bigo.ads.common.h.d
    public final String a(Context context) {
        return o.h(context);
    }

    @Override // sg.bigo.ads.common.h.d
    public final void a(String str) {
        sg.bigo.ads.common.x.a.c(str);
    }

    @Override // sg.bigo.ads.common.h.d
    public final boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, str2)) ? false : true;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String b() {
        return "banner_insert_js.js";
    }

    @Override // sg.bigo.ads.common.h.d
    public final boolean b(String str) {
        return true;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String c() {
        return null;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String d() {
        return this.f71531e;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String e() {
        return sg.bigo.ads.common.x.a.h();
    }
}
