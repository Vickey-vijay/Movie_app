package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ac implements nc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do2 f75463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75464b;

    public ac(do2 do2Var, String str) {
        this.f75463a = do2Var;
        this.f75464b = str;
    }

    @Override // yads.nc2
    public final Map a(long j10) {
        Map mapJ = kotlin.collections.a.j();
        if (!ck.x.m(mapJ)) {
            mapJ = null;
        }
        if (mapJ == null) {
            mapJ = new LinkedHashMap();
        }
        String str = this.f75464b;
        if (str == null) {
            mapJ.put(Q6.G1, "undefined");
        } else {
            mapJ.put(Q6.G1, str);
        }
        String str2 = this.f75463a.f76760b;
        if (str2 == null) {
            mapJ.put("status", "undefined");
        } else {
            mapJ.put("status", str2);
        }
        mapJ.put("duration", Long.valueOf(j10));
        return mapJ;
    }
}
