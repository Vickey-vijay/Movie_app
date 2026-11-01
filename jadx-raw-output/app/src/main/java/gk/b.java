package gk;

import ck.p;
import java.util.Random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends gk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f53432c = new a();

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // gk.a
    public Random d() {
        Random random = this.f53432c.get();
        p.i(random, "get(...)");
        return random;
    }
}
