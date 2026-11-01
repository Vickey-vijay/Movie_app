package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import io.bidmachine.iab.vast.tags.VastTagName;
import yads.pj;

/* JADX INFO: loaded from: classes10.dex */
public final class pj implements bk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y43 f81420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y43 f81421b;

    public pj(final int i10) {
        this(new y43() { // from class: cp.f8
            @Override // yads.y43
            public final Object get() {
                return pj.a(i10);
            }
        }, new y43() { // from class: cp.g8
            @Override // yads.y43
            public final Object get() {
                return pj.b(i10);
            }
        });
    }

    @Override // yads.bk1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qj a(ak1 ak1Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ak1Var.f75542a.f78680a;
        qj qjVar = null;
        try {
            d73.a("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                qj qjVar2 = new qj(mediaCodecCreateByCodecName, (HandlerThread) this.f81420a.get(), (HandlerThread) this.f81421b.get(), false);
                try {
                    d73.a();
                    qjVar2.a(ak1Var.f75543b, ak1Var.f75545d, ak1Var.f75546e);
                    return qjVar2;
                } catch (Exception e10) {
                    e = e10;
                    qjVar = qjVar2;
                    if (qjVar != null) {
                        qjVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    public pj(y43 y43Var, y43 y43Var2) {
        this.f81420a = y43Var;
        this.f81421b = y43Var2;
    }

    public static HandlerThread a(int i10) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append(VastTagName.VIDEO);
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }

    public static HandlerThread b(int i10) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append(VastTagName.VIDEO);
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }
}
