package androidx.core.util;

import androidx.annotation.NonNull;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;

/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    @NonNull
    public static <A, B> Pair<A, B> create(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f10 = this.first;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.second;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + Z7.f27998r + this.second + h.f44172e;
    }

    public Pair(F f10, S s10) {
        this.first = f10;
        this.second = s10;
    }
}
