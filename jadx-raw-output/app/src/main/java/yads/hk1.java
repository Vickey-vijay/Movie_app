package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public class hk1 extends qa0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78258b;

    public hk1(IllegalStateException illegalStateException, ik1 ik1Var) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(ik1Var == null ? null : ik1Var.f78680a);
        super(sb2.toString(), illegalStateException);
        this.f78258b = ib3.f78556a >= 21 ? a(illegalStateException) : null;
    }

    public static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
