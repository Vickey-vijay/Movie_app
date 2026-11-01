package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ya implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa3 f84870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f84871d;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f84869b.length() > 0) {
            this.f84870c.a(this.f84869b, this.f84871d);
        }
    }

    public ya(String str, wa3 wa3Var, Map map) {
        this.f84869b = str;
        this.f84870c = wa3Var;
        this.f84871d = map;
    }
}
