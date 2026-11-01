package dl;

import com.ironsource.G5;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: CharsetReader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f52182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f52183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f52184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f52185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f52187f;

    public q(InputStream inputStream, Charset charset) {
        ck.p.j(inputStream, "inputStream");
        ck.p.j(charset, G5.M);
        this.f52182a = inputStream;
        this.f52183b = charset;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        ck.p.i(charsetDecoderOnUnmappableCharacter, "charset.newDecoder()\n   …odingErrorAction.REPLACE)");
        this.f52184c = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(j.f52156c.d());
        ck.p.i(byteBufferWrap, "wrap(ByteArrayPool8k.take())");
        this.f52185d = byteBufferWrap;
        ck.p.h(byteBufferWrap, "null cannot be cast to non-null type java.nio.Buffer");
        byteBufferWrap.flip();
    }

    public final int b() {
        ByteBuffer byteBuffer;
        this.f52185d.compact();
        try {
            int iLimit = this.f52185d.limit();
            int iPosition = this.f52185d.position();
            int i10 = this.f52182a.read(this.f52185d.array(), this.f52185d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            return this.f52185d.remaining();
        } finally {
            byteBuffer = this.f52185d;
            ck.p.h(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.flip();
        }
    }

    public final int c() {
        if (this.f52186e) {
            this.f52186e = false;
            return this.f52187f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f52187f = cArr[1];
            this.f52186e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(char[] cArr, int i10, int i11) {
        ck.p.j(cArr, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (!((i10 >= 0 && i10 < cArr.length) && i11 >= 0 && i10 + i11 <= cArr.length)) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + cArr.length).toString());
        }
        if (this.f52186e) {
            cArr[i10] = this.f52187f;
            i10++;
            i11--;
            this.f52186e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(cArr, i10, i11) + i12;
        }
        int iC = c();
        if (iC != -1) {
            cArr[i10] = (char) iC;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void e() {
        j jVar = j.f52156c;
        byte[] bArrArray = this.f52185d.array();
        ck.p.i(bArrArray, "byteBuffer.array()");
        jVar.c(bArrArray);
    }

    public final int a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f52184c.decode(this.f52185d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (z10 || !charBufferWrap.hasRemaining()) {
                    break;
                }
                if (b() < 0) {
                    z10 = true;
                    if (charBufferWrap.position() == 0 && !this.f52185d.hasRemaining()) {
                        break;
                    }
                    this.f52184c.reset();
                } else {
                    continue;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f52184c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }
}
