package xm;

import org.eclipse.jetty.util.Utf8Appendable;

/* JADX INFO: compiled from: Utf8StringBuilder.java */
/* JADX INFO: loaded from: classes10.dex */
public class s extends Utf8Appendable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f75072g;

    public s() {
        super(new StringBuilder());
        this.f75072g = (StringBuilder) this.f65743a;
    }

    public int i() {
        return this.f75072g.length();
    }

    public s(int i10) {
        super(new StringBuilder(i10));
        this.f75072g = (StringBuilder) this.f65743a;
    }

    @Override // org.eclipse.jetty.util.Utf8Appendable
    public void f() {
        super.f();
        this.f75072g.setLength(0);
    }

    public StringBuilder h() {
        d();
        return this.f75072g;
    }

    public String toString() {
        d();
        return this.f75072g.toString();
    }
}
