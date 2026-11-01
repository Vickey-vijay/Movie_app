package yads;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class oo2 {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "LOW";
        }
        if (i10 == 2) {
            return "NORMAL";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "IMMEDIATE";
        }
        return "HIGH";
    }
}
