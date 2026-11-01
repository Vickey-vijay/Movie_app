package com.applovin.shadow.okhttp3;

import bk.l;
import ck.i;
import ck.n;
import ck.p;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.ironsource.G5;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import lk.c;
import mj.r;
import yj.b;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            r rVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                rVar = r.f64562a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                this.source.close();
            }
        }

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            p.j(bufferedSource, "source");
            p.j(charset, G5.M);
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            p.j(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i10, i11);
        }
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            p.j(str, "<this>");
            Charset charset = c.f63591b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(bufferedSource, mediaType, j10);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            p.j(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            p.j(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j10) {
            p.j(bufferedSource, "<this>");
            return new ResponseBody() { // from class: com.applovin.shadow.okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // com.applovin.shadow.okhttp3.ResponseBody
                public long contentLength() {
                    return j10;
                }

                @Override // com.applovin.shadow.okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.ResponseBody
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            p.j(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            p.j(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, ByteString byteString) {
            p.j(byteString, "content");
            return create(byteString, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j10, BufferedSource bufferedSource) {
            p.j(bufferedSource, "content");
            return create(bufferedSource, mediaType, j10);
        }
    }

    public static final ResponseBody create(MediaType mediaType, long j10, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j10, bufferedSource);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j10) {
        return Companion.create(bufferedSource, mediaType, j10);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        if (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(c.f63591b)) == null) {
            return c.f63591b;
        }
        return charset;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(l<? super BufferedSource, ? extends T> lVar, l<? super T, Integer> lVar2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceSource = source();
            try {
                T tInvoke = lVar.invoke(bufferedSourceSource);
                n.b(1);
                b.a(bufferedSourceSource, null);
                n.a(1);
                int iIntValue = lVar2.invoke(tInvoke).intValue();
                if (jContentLength != -1 && jContentLength != iIntValue) {
                    throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
                }
                return tInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    n.b(1);
                    b.a(bufferedSourceSource, th2);
                    n.a(1);
                    throw th3;
                }
            }
        }
        throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceSource = source();
            try {
                ByteString byteString = bufferedSourceSource.readByteString();
                b.a(bufferedSourceSource, null);
                int size = byteString.size();
                if (jContentLength != -1 && jContentLength != size) {
                    throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
                }
                return byteString;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(bufferedSourceSource, th2);
                    throw th3;
                }
            }
        }
        throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceSource = source();
            try {
                byte[] byteArray = bufferedSourceSource.readByteArray();
                b.a(bufferedSourceSource, null);
                int length = byteArray.length;
                if (jContentLength != -1 && jContentLength != length) {
                    throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
                }
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(bufferedSourceSource, th2);
                    throw th3;
                }
            }
        }
        throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(Util.readBomAsCharset(bufferedSourceSource, charset()));
            b.a(bufferedSourceSource, null);
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }
}
