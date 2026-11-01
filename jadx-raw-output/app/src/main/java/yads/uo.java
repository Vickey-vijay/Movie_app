package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83552d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f83551c == uoVar.f83551c && this.f83552d == uoVar.f83552d && l92.a(this.f83549a, uoVar.f83549a) && l92.a(this.f83550b, uoVar.f83550b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f83549a, this.f83550b, Integer.valueOf(this.f83551c), Integer.valueOf(this.f83552d)});
    }

    public uo(int i10, int i11, String str, String str2) {
        this.f83549a = str;
        this.f83550b = str2;
        this.f83551c = i10;
        this.f83552d = i11;
    }
}
