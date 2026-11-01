package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;

/* JADX INFO: loaded from: classes6.dex */
public final class x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f84477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84478d;

    public x80(String str, int i10, Integer num, int i11) {
        this.f84475a = str;
        this.f84476b = i10;
        this.f84477c = num;
        this.f84478d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return ck.p.e(this.f84475a, x80Var.f84475a) && this.f84476b == x80Var.f84476b && ck.p.e(this.f84477c, x80Var.f84477c) && this.f84478d == x80Var.f84478d;
    }

    public final int hashCode() {
        int iA = nd3.a(this.f84476b, this.f84475a.hashCode() * 31, 31);
        Integer num = this.f84477c;
        return Integer.hashCode(this.f84478d) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f84475a + ", color=" + this.f84476b + ", icon=" + this.f84477c + ", style=" + this.f84478d + ")";
    }

    public /* synthetic */ x80(String str, int i10, Integer num, int i11, int i12) {
        this(str, (i12 & 2) != 0 ? R$attr.debug_panel_label_primary : i10, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? R$style.DebugPanelText_Body1 : i11);
    }
}
