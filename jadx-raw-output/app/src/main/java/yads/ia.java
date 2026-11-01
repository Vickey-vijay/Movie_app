package yads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb2 f78534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f78535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f78536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f78537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f78539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ja f78541h;

    public ia(rb2 rb2Var, String str, List list) {
        ja jaVar = ja.f78955d;
        ArrayList arrayList = new ArrayList();
        this.f78536c = arrayList;
        this.f78537d = new HashMap();
        this.f78534a = rb2Var;
        this.f78535b = null;
        this.f78538e = str;
        this.f78541h = jaVar;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            md3 md3Var = (md3) it.next();
            this.f78537d.put(UUID.randomUUID().toString(), md3Var);
        }
        this.f78540g = null;
        this.f78539f = null;
    }

    public final ja a() {
        return this.f78541h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.f78537d);
    }

    public final String c() {
        return this.f78538e;
    }

    public final WebView d() {
        return this.f78535b;
    }
}
