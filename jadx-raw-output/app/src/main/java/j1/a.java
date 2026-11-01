package j1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DefaultsFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Object> f61688a;

    static {
        HashMap map = new HashMap();
        map.put(Bundle.class, new d1.a());
        map.put(Intent.class, new d1.b());
        f61688a = Collections.unmodifiableMap(map);
    }

    public static Map<Class<?>, Object> a() {
        return f61688a;
    }

    public static n1.a b() {
        return new n1.b(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public static b1.a c() {
        return new b1.b();
    }

    public static o1.a d() {
        return new o1.b();
    }

    public static p1.b e() {
        return new p1.a(CreativeInfo.f44317an);
    }

    public static z0.b f() {
        return new z0.a();
    }

    public static c1.b g() {
        return new c1.a();
    }

    public static g1.b h() {
        return new g1.a();
    }

    public static h1.b i() {
        return new h1.a();
    }

    public static e1.b j() {
        return new e1.a();
    }

    public static f1.b k() {
        return new f1.a();
    }
}
