package e4;

import androidx.annotation.Nullable;
import c4.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import g5.k0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements c4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f52355c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f52356a = Charset.forName("UTF-8").newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f52357b = Charset.forName("ISO-8859-1").newDecoder();

    @Override // c4.a
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) g5.a.e(cVar.f64969c);
        String strB = b(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strB == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f52355c.matcher(strB);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strK0 = k0.K0(matcher.group(1));
            String strGroup = matcher.group(2);
            strK0.hashCode();
            if (strK0.equals("streamurl")) {
                str2 = strGroup;
            } else if (strK0.equals("streamtitle")) {
                str = strGroup;
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    @Nullable
    public final String b(ByteBuffer byteBuffer) {
        try {
            String string = this.f52356a.decode(byteBuffer).toString();
            this.f52356a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f52356a.reset();
            byteBuffer.rewind();
            try {
                return this.f52357b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f52357b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f52356a.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }
}
