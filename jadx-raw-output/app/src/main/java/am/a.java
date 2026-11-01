package am;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: CookieJarImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bm.a f3676a;

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        return this.f3676a.a(httpUrl);
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f3676a.b(httpUrl, list);
    }

    public a(bm.a aVar) {
        if (aVar != null) {
            this.f3676a = aVar;
            return;
        }
        throw new IllegalArgumentException("cookieStore can not be null!");
    }
}
