package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f71362b = "h";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Map<String, String> f71364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f71365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f71366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f71367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f71368g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f71370i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f71369h = {0, 30000, 300000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71363a = 0;

    private h(@NonNull Map<String, String> map, q qVar, int i10, String str, String str2, String str3) {
        this.f71364c = map;
        this.f71365d = qVar;
        this.f71366e = str;
        this.f71367f = str2;
        this.f71368g = str3;
        this.f71370i = i10;
    }

    public static h a(@NonNull Map<String, String> map, q qVar, int i10, String str, String str2, String str3) {
        return new h(map, qVar, i10, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        sg.bigo.ads.common.t.a.a(0, 3, f71362b, "Vast tracker request start, action: " + this.f71366e + ", url: " + b(this.f71367f));
        sg.bigo.ads.core.e.b.a(context, 0, this.f71366e, new sg.bigo.ads.common.u.b.d(this.f71367f), this.f71368g, this.f71370i, false, this.f71363a, this.f71364c, new sg.bigo.ads.core.e.b.a() { // from class: sg.bigo.ads.core.e.a.h.2
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                sg.bigo.ads.common.t.a.a(0, 3, h.f71362b, "Vast tracker request error, action: " + h.this.f71366e + ", url: " + h.b(h.this.f71367f));
                h.b(h.this, context);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i10) {
                return h.this.f71365d != null && h.this.f71365d.a(i10);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                sg.bigo.ads.common.t.a.a(0, 3, h.f71362b, "Vast tracker request success, action: " + h.this.f71366e + ", url: " + h.b(h.this.f71367f));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (str == null || str.length() < 40) {
            return str;
        }
        return str.substring(0, 20) + "..." + str.substring(str.length() - 10);
    }

    public static /* synthetic */ void b(h hVar, Context context) {
        if (TextUtils.equals("va_show", hVar.f71366e) || TextUtils.equals("va_cli", hVar.f71366e) || TextUtils.equals("va_cpn_imp", hVar.f71366e) || TextUtils.equals("va_cpn_cli", hVar.f71366e)) {
            int i10 = hVar.f71363a + 1;
            hVar.f71363a = i10;
            hVar.a(context, i10);
        }
    }

    public final void a(final Context context, int i10) {
        if (i10 >= 3) {
            sg.bigo.ads.common.t.a.a(0, 3, f71362b, "Vast tracker retry time exceed, action: " + this.f71366e + ", url: " + b(this.f71367f));
            return;
        }
        int[] iArr = this.f71369h;
        int i11 = iArr[i10 % iArr.length];
        if (i11 <= 0) {
            a(context);
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, f71362b, "Vast tracker retry after " + i11 + " ms, action: " + this.f71366e + ", url: " + b(this.f71367f));
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.h.1
            @Override // java.lang.Runnable
            public final void run() {
                h.this.a(context);
            }
        }, (long) i11);
    }
}
