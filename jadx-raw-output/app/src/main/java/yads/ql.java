package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ql {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ql.class != obj.getClass()) {
            return false;
        }
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
