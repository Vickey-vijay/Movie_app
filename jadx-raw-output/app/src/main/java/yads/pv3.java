package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class pv3 implements pw3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final pv3 f81620f = new pv3(new rw3());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx3 f81621a = new bx3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f81622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rw3 f81624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81625e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.pw3
    public final void a(boolean z10) {
        if (!this.f81625e && z10) {
            this.f81621a.getClass();
            Date date = new Date();
            Date date2 = this.f81622b;
            if (date2 == null || date.after(date2)) {
                this.f81622b = date;
                if (this.f81623c) {
                    Iterator it = Collections.unmodifiableCollection(nw3.f80846c.f80848b).iterator();
                    while (it.hasNext()) {
                        ka kaVar = ((wv3) it.next()).f84355e;
                        Date date3 = this.f81622b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        kaVar.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            lw3.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            ix3.f78850a.a((WebView) kaVar.f79343b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.f81625e = z10;
    }

    public pv3(rw3 rw3Var) {
        this.f81624d = rw3Var;
    }
}
