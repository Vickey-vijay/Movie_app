package yads;

import android.media.MediaCodec;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class d53 implements bk1 {
    @Override // yads.bk1
    public final dk1 a(ak1 ak1Var) {
        MediaCodec mediaCodecB = null;
        try {
            mediaCodecB = b(ak1Var);
            d73.a("configureCodec");
            mediaCodecB.configure(ak1Var.f75543b, ak1Var.f75545d, ak1Var.f75546e, 0);
            d73.a();
            d73.a("startCodec");
            mediaCodecB.start();
            d73.a();
            return new e53(mediaCodecB);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecB != null) {
                mediaCodecB.release();
            }
            throw e10;
        }
    }

    public static MediaCodec b(ak1 ak1Var) throws IOException {
        ak1Var.f75542a.getClass();
        String str = ak1Var.f75542a.f78680a;
        d73.a("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        d73.a();
        return mediaCodecCreateByCodecName;
    }
}
