package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class us1 implements vs1 {
    public final dz2 a(mx0 mx0Var) {
        String str = mx0Var.f80429m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ng();
                case "application/x-icy":
                    return new n21();
                case "application/id3":
                    return new u21(null);
                case "application/x-emsg":
                    return new xm0();
                case "application/x-scte35":
                    return new k23();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }
}
