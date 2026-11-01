package t4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends o3.g<h, i, SubtitleDecoderException> implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f72234n;

    public c(String str) {
        super(new h[2], new i[2]);
        this.f72234n = str;
        q(1024);
    }

    @Override // t4.f
    public void setPositionUs(long j10) {
    }

    public abstract e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    @Override // o3.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final h c() {
        return new h();
    }

    @Override // o3.g
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return new d(this);
    }

    @Override // o3.g
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException e(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // o3.g
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException f(h hVar, i iVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) g5.a.e(hVar.f64969c);
            iVar.a(hVar.f64971e, v(byteBuffer.array(), byteBuffer.limit(), z10), hVar.f72237h);
            iVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    public final void w(i iVar) {
        super.n(iVar);
    }
}
