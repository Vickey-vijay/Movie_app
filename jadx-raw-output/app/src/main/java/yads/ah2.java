package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ah2 implements wa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv f75518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53 f75519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be0 f75520c;

    @Override // yads.wa3
    public final void a(String str, Map map) {
        String strA = this.f75520c.a(str, map);
        if (strA.length() == 0) {
            boolean z10 = ad1.f75480a;
        } else {
            this.f75519b.a(this.f75518a, strA);
        }
    }

    public ah2(lv lvVar, o53 o53Var, be0 be0Var) {
        this.f75518a = lvVar;
        this.f75519b = o53Var;
        this.f75520c = be0Var;
    }
}
