package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class tg3 extends ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83031a;

    public tg3(List list) {
        super(0);
        this.f83031a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg3) && ck.p.e(this.f83031a, ((tg3) obj).f83031a);
    }

    public final int hashCode() {
        return this.f83031a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f83031a + ")";
    }
}
