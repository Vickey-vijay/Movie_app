package sg.bigo.ads.core.e.a;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f71266a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicBoolean f71267p;

    public a(q qVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4, Map<String, String> map) {
        super(qVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, map);
        this.f71266a = new AtomicBoolean(false);
        this.f71267p = new AtomicBoolean(false);
    }
}
