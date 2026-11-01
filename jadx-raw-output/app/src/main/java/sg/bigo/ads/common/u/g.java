package sg.bigo.ads.common.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f69974a;

    @NonNull
    public static c<sg.bigo.ads.common.u.c.a> a(@NonNull sg.bigo.ads.common.u.b.c cVar) {
        b.a aVar = new b.a();
        f69974a.c(cVar, aVar);
        return new c<>(aVar.f69937b, aVar.f69938c);
    }

    public static void a(@NonNull sg.bigo.ads.common.u.b.a aVar, @Nullable b bVar) {
        if (bVar == null) {
            bVar = b.f69935d;
        }
        f69974a.b(aVar, bVar);
    }
}
