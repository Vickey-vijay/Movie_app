package yads;

import com.yandex.mobile.ads.R$style;

/* JADX INFO: loaded from: classes8.dex */
public final class q50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81711c;

    public q50(int i10, int i11, String str) {
        this.f81709a = str;
        this.f81710b = i10;
        this.f81711c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return ck.p.e(this.f81709a, q50Var.f81709a) && this.f81710b == q50Var.f81710b && this.f81711c == q50Var.f81711c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81711c) + nd3.a(this.f81710b, this.f81709a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelColoredText(text=" + this.f81709a + ", color=" + this.f81710b + ", style=" + this.f81711c + ")";
    }

    public /* synthetic */ q50(String str, int i10) {
        this(i10, R$style.DebugPanelText_Body2, str);
    }
}
