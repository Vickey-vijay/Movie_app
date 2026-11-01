package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3440e0 implements InterfaceC3458f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28718b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28719c = "ext_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f28720a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.e0$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC3458f0
    public Map<String, String> a() {
        return this.f28720a;
    }

    @Override // com.ironsource.InterfaceC3458f0
    public void a(HashMap<String, String> map) {
        ck.p.j(map, "params");
        this.f28720a.putAll(map);
    }

    @Override // com.ironsource.InterfaceC3458f0
    public void b(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        this.f28720a.put("ext_" + str, str2);
    }

    @Override // com.ironsource.InterfaceC3458f0
    public void a(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        this.f28720a.put(str, str2);
    }
}
