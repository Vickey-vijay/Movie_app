package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class jm0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f79095h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f79096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79097b = nj.s.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f79098c = kotlin.collections.a.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f79099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f79100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f79102g;

    public final Map a() {
        return this.f79098c;
    }

    public final String b() {
        String str;
        synchronized (f79095h) {
            str = this.f79102g;
        }
        return str;
    }
}
