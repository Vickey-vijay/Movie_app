package bm;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: CookieStore.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    List<Cookie> a(HttpUrl httpUrl);

    void b(HttpUrl httpUrl, List<Cookie> list);
}
