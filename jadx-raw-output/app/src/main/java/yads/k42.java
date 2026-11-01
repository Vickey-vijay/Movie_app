package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class k42 implements oa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f79303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53 f79304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f79305c;

    @Override // yads.oa2
    public final void a(String str) {
        za zaVar = this.f79303a;
        o53 o53Var = this.f79304b;
        lv lvVar = this.f79305c;
        zaVar.getClass();
        ah2 ah2Var = new ah2(lvVar, o53Var, new be0());
        Map mapJ = kotlin.collections.a.j();
        if (str.length() > 0) {
            za.f85258d.execute(new ya(str, ah2Var, mapJ));
        }
    }

    public k42(za zaVar, o53 o53Var, lv lvVar) {
        this.f79303a = zaVar;
        this.f79304b = o53Var;
        this.f79305c = lvVar;
    }
}
