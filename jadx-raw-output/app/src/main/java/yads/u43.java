package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class u43 implements v43 {
    public final s43 a(mx0 mx0Var) {
        String str = mx0Var.f80429m;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new el0(mx0Var.f80431o);
                case "application/pgs":
                    return new kc2();
                case "application/x-mp4-vtt":
                    return new lv1();
                case "text/vtt":
                    return new ro3();
                case "application/x-quicktime-tx3g":
                    return new x93(mx0Var.f80431o);
                case "text/x-ssa":
                    return new b33(mx0Var.f80431o);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new ht(str, mx0Var.E);
                case "text/x-exoplayer-cues":
                    return new vp0();
                case "application/cea-708":
                    return new mt(mx0Var.E, mx0Var.f80431o);
                case "application/x-subrip":
                    return new p43();
                case "application/ttml+xml":
                    return new r93();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    public final boolean b(mx0 mx0Var) {
        String str = mx0Var.f80429m;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
    }
}
