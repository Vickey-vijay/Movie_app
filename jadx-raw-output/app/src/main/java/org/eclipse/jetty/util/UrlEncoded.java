package org.eclipse.jetty.util;

import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import xm.g;
import xm.j;
import xm.o;
import xm.p;
import xm.r;
import xm.s;
import zm.b;
import zm.c;

/* JADX INFO: loaded from: classes6.dex */
public class UrlEncoded extends MultiMap implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f65739b = b.a(UrlEncoded.class);
    public static final String ENCODING = System.getProperty("org.eclipse.jetty.util.UrlEncoding.charset", "UTF-8");

    public UrlEncoded(UrlEncoded urlEncoded) {
        super((MultiMap) urlEncoded);
    }

    public static void decode88591To(InputStream inputStream, MultiMap multiMap, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        synchronized (multiMap) {
            StringBuffer stringBuffer = new StringBuffer();
            String string = null;
            int i15 = 0;
            while (true) {
                int i16 = inputStream.read();
                if (i16 >= 0) {
                    char c10 = (char) i16;
                    if (c10 == '%') {
                        int i17 = inputStream.read();
                        if (117 == i17) {
                            int i18 = inputStream.read();
                            if (i18 >= 0 && (i13 = inputStream.read()) >= 0 && (i14 = inputStream.read()) >= 0) {
                                stringBuffer.append(Character.toChars((p.c(i17) << 12) + (p.c(i18) << 8) + (p.c(i13) << 4) + p.c(i14)));
                            }
                        } else if (i17 >= 0 && (i12 = inputStream.read()) >= 0) {
                            stringBuffer.append((char) ((p.c(i17) << 4) + p.c(i12)));
                        }
                    } else if (c10 == '&') {
                        String string2 = stringBuffer.length() == 0 ? "" : stringBuffer.toString();
                        stringBuffer.setLength(0);
                        if (string != null) {
                            multiMap.add(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            multiMap.add(string2, "");
                        }
                        if (i11 > 0 && multiMap.size() > i11) {
                            throw new IllegalStateException(String.format("Form with too many keys [%d > %d]", Integer.valueOf(multiMap.size()), Integer.valueOf(i11)));
                        }
                        string = null;
                    } else if (c10 == '+') {
                        stringBuffer.append(' ');
                    } else if (c10 == '=' && string == null) {
                        string = stringBuffer.toString();
                        stringBuffer.setLength(0);
                    } else {
                        stringBuffer.append(c10);
                    }
                    if (i10 >= 0 && (i15 = i15 + 1) > i10) {
                        throw new IllegalStateException("Form too large");
                    }
                } else if (string != null) {
                    Object string3 = stringBuffer.length() == 0 ? "" : stringBuffer.toString();
                    stringBuffer.setLength(0);
                    multiMap.add(string, string3);
                } else if (stringBuffer.length() > 0) {
                    multiMap.add(stringBuffer.toString(), "");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9 A[Catch: UnsupportedEncodingException -> 0x0103, LOOP:1: B:23:0x0051->B:58:0x00c9, LOOP_END, TryCatch #2 {UnsupportedEncodingException -> 0x0103, blocks: (B:10:0x0026, B:16:0x0034, B:17:0x003c, B:65:0x00f7, B:20:0x0045, B:21:0x004d, B:29:0x0061, B:34:0x006d, B:58:0x00c9, B:48:0x00a2, B:39:0x008a, B:44:0x0095, B:49:0x00ac, B:52:0x00b7, B:54:0x00c3, B:53:0x00be, B:59:0x00d5, B:61:0x00e3, B:63:0x00e9, B:64:0x00f4, B:70:0x0109, B:73:0x0110, B:75:0x0117), top: B:145:0x0026 }] */
    public static String decodeString(String str, int i10, int i11, String str2) {
        int i12;
        int i13;
        r rVar = null;
        StringBuffer stringBuffer = null;
        char c10 = ' ';
        char c11 = '%';
        char c12 = '+';
        char c13 = 255;
        if (str2 == null || o.d(str2)) {
            int i14 = 0;
            while (i14 < i11) {
                int i15 = i10 + i14;
                char cCharAt = str.charAt(i15);
                if (cCharAt < 0 || cCharAt > 255) {
                    if (rVar == null) {
                        rVar = new r(i11);
                        rVar.h().append((CharSequence) str, i10, i15 + 1);
                    } else {
                        rVar.h().append(cCharAt);
                    }
                } else if (cCharAt == '+') {
                    if (rVar == null) {
                        rVar = new r(i11);
                        rVar.h().append((CharSequence) str, i10, i15);
                    }
                    rVar.h().append(' ');
                } else if (cCharAt == '%') {
                    if (rVar == null) {
                        rVar = new r(i11);
                        rVar.h().append((CharSequence) str, i10, i15);
                    }
                    r rVar2 = rVar;
                    int i16 = i14 + 2;
                    if (i16 < i11) {
                        int i17 = i15 + 1;
                        try {
                            if ('u' == str.charAt(i17)) {
                                i14 += 5;
                                if (i14 < i11) {
                                    rVar2.h().append(new String(Character.toChars(p.e(str, i15 + 2, 4, 16))));
                                } else {
                                    try {
                                        rVar2.h().append((char) 65533);
                                        i14 = i11;
                                    } catch (NumberFormatException e10) {
                                        e = e10;
                                        i14 = i11;
                                        f65739b.a(e);
                                        rVar2.h().append((char) 65533);
                                    } catch (Utf8Appendable.NotUtf8Exception e11) {
                                        e = e11;
                                        i14 = i11;
                                        c cVar = f65739b;
                                        cVar.g(e.toString(), new Object[0]);
                                        cVar.a(e);
                                    }
                                }
                            } else {
                                try {
                                    rVar2.a((byte) p.e(str, i17, 2, 16));
                                    i14 = i16;
                                } catch (NumberFormatException e12) {
                                    e = e12;
                                    i14 = i16;
                                    f65739b.a(e);
                                    rVar2.h().append((char) 65533);
                                } catch (Utf8Appendable.NotUtf8Exception e13) {
                                    e = e13;
                                    i14 = i16;
                                    c cVar2 = f65739b;
                                    cVar2.g(e.toString(), new Object[0]);
                                    cVar2.a(e);
                                }
                            }
                        } catch (NumberFormatException e14) {
                            e = e14;
                        } catch (Utf8Appendable.NotUtf8Exception e15) {
                            e = e15;
                        }
                    } else {
                        rVar2.h().append((char) 65533);
                        i14 = i11;
                    }
                    rVar = rVar2;
                } else if (rVar != null) {
                    rVar.h().append(cCharAt);
                }
                i14++;
            }
            if (rVar == null) {
                return (i10 == 0 && str.length() == i11) ? str : str.substring(i10, i10 + i11);
            }
            return rVar.g();
        }
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i10 + i18;
            try {
                char cCharAt2 = str.charAt(i19);
                if (cCharAt2 < 0 || cCharAt2 > c13) {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i11);
                        stringBuffer.append((CharSequence) str, i10, i19 + 1);
                    } else {
                        stringBuffer.append(cCharAt2);
                    }
                } else if (cCharAt2 == c12) {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i11);
                        stringBuffer.append((CharSequence) str, i10, i19);
                    }
                    stringBuffer.append(c10);
                } else if (cCharAt2 == c11) {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(i11);
                        stringBuffer.append((CharSequence) str, i10, i19);
                    }
                    StringBuffer stringBuffer2 = stringBuffer;
                    byte[] bArr = new byte[i11];
                    int length = 0;
                    while (cCharAt2 >= 0 && cCharAt2 <= c13) {
                        if (cCharAt2 == c11) {
                            if (i18 + 2 < i11) {
                                int i20 = i10 + i18;
                                int i21 = i20 + 1;
                                try {
                                    if ('u' == str.charAt(i21)) {
                                        i13 = i18 + 6;
                                        if (i13 < i11) {
                                            try {
                                                byte[] bytes = new String(Character.toChars(p.e(str, i20 + 2, 4, 16))).getBytes(str2);
                                                System.arraycopy(bytes, 0, bArr, length, bytes.length);
                                                length += bytes.length;
                                            } catch (NumberFormatException e16) {
                                                e = e16;
                                                i18 = i13;
                                                f65739b.h(e);
                                                i12 = length + 1;
                                                bArr[length] = 63;
                                                length = i12;
                                            }
                                        } else {
                                            int i22 = length + 1;
                                            try {
                                                bArr[length] = 63;
                                                length = i22;
                                                i13 = i11;
                                            } catch (NumberFormatException e17) {
                                                e = e17;
                                                length = i22;
                                                f65739b.h(e);
                                                i12 = length + 1;
                                                bArr[length] = 63;
                                                length = i12;
                                            }
                                        }
                                    } else {
                                        i18 += 3;
                                        bArr[length] = (byte) p.e(str, i21, 2, 16);
                                        length++;
                                        i13 = i18;
                                    }
                                    i18 = i13;
                                } catch (NumberFormatException e18) {
                                    e = e18;
                                }
                            } else {
                                bArr[length] = 63;
                                length++;
                                i18 = i11;
                            }
                            if (i18 >= i11) {
                                break;
                            }
                            cCharAt2 = str.charAt(i10 + i18);
                            c11 = '%';
                            c13 = 255;
                        } else {
                            if (cCharAt2 == '+') {
                                i12 = length + 1;
                                bArr[length] = 32;
                            } else {
                                i12 = length + 1;
                                bArr[length] = (byte) cCharAt2;
                            }
                            i18++;
                        }
                        length = i12;
                        if (i18 >= i11) {
                            break;
                            break;
                        }
                        cCharAt2 = str.charAt(i10 + i18);
                        c11 = '%';
                        c13 = 255;
                    }
                    i18--;
                    stringBuffer2.append(new String(bArr, 0, length, str2));
                    stringBuffer = stringBuffer2;
                } else if (stringBuffer != null) {
                    stringBuffer.append(cCharAt2);
                }
                i18++;
                c10 = ' ';
                c11 = '%';
                c12 = '+';
                c13 = 255;
            } catch (UnsupportedEncodingException e19) {
                throw new RuntimeException(e19);
            }
        }
        if (stringBuffer == null) {
            return (i10 == 0 && str.length() == i11) ? str : str.substring(i10, i10 + i11);
        }
        return stringBuffer.toString();
    }

    public static void decodeTo(String str, MultiMap multiMap, String str2) {
        decodeTo(str, multiMap, str2, -1);
    }

    public static void decodeUtf8To(byte[] bArr, int i10, int i11, MultiMap multiMap) {
        decodeUtf8To(bArr, i10, i11, multiMap, new s());
    }

    public static String encodeString(String str) {
        return encodeString(str, ENCODING);
    }

    public void decode(String str) {
        decodeTo(str, this, ENCODING, -1);
    }

    public String encode() {
        return encode(ENCODING, false);
    }

    public UrlEncoded() {
        super(6);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    public static void decodeTo(String str, MultiMap multiMap, String str2, int i10) {
        String strDecodeString;
        String strDecodeString2;
        if (str2 == null) {
            str2 = ENCODING;
        }
        synchronized (multiMap) {
            int i11 = -1;
            String strDecodeString3 = null;
            boolean z10 = false;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%') {
                    z10 = true;
                } else {
                    if (cCharAt == '&') {
                        int i13 = (i12 - i11) - 1;
                        if (i13 == 0) {
                            strDecodeString2 = "";
                        } else {
                            int i14 = i11 + 1;
                            strDecodeString2 = z10 ? decodeString(str, i14, i13, str2) : str.substring(i14, i12);
                        }
                        if (strDecodeString3 != null) {
                            multiMap.add(strDecodeString3, strDecodeString2);
                        } else if (strDecodeString2 != null && strDecodeString2.length() > 0) {
                            multiMap.add(strDecodeString2, "");
                        }
                        if (i10 > 0 && multiMap.size() > i10) {
                            throw new IllegalStateException(String.format("Form with too many keys [%d > %d]", Integer.valueOf(multiMap.size()), Integer.valueOf(i10)));
                        }
                        strDecodeString3 = null;
                    } else if (cCharAt == '+') {
                        z10 = true;
                    } else if (cCharAt == '=' && strDecodeString3 == null) {
                        strDecodeString3 = z10 ? decodeString(str, i11 + 1, (i12 - i11) - 1, str2) : str.substring(i11 + 1, i12);
                    }
                    z10 = false;
                    i11 = i12;
                }
            }
            if (strDecodeString3 != null) {
                int length = (str.length() - i11) - 1;
                if (length == 0) {
                    strDecodeString = "";
                } else {
                    int i15 = i11 + 1;
                    strDecodeString = z10 ? decodeString(str, i15, length, str2) : str.substring(i15);
                }
                multiMap.add(strDecodeString3, strDecodeString);
            } else if (i11 < str.length()) {
                String strDecodeString4 = z10 ? decodeString(str, i11 + 1, (str.length() - i11) - 1, str2) : str.substring(i11 + 1);
                if (strDecodeString4 != null && strDecodeString4.length() > 0) {
                    multiMap.add(strDecodeString4, "");
                }
            }
        }
    }

    public static void decodeUtf16To(InputStream inputStream, MultiMap multiMap, int i10, int i11) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C.UTF16_NAME);
        StringWriter stringWriter = new StringWriter(8192);
        j.e(inputStreamReader, stringWriter, i10);
        decodeTo(stringWriter.getBuffer().toString(), multiMap, C.UTF16_NAME, i11);
    }

    public static void decodeUtf8To(byte[] bArr, int i10, int i11, MultiMap multiMap, s sVar) {
        int i12;
        synchronized (multiMap) {
            int i13 = i11 + i10;
            String string = null;
            while (i10 < i13) {
                try {
                    byte b10 = bArr[i10];
                    char c10 = (char) (b10 & 255);
                    if (c10 == '%') {
                        if (i10 + 2 < i13) {
                            int i14 = i10 + 1;
                            byte b11 = bArr[i14];
                            if (117 != b11) {
                                i12 = i14 + 1;
                                sVar.a((byte) ((p.b(b11) << 4) + p.b(bArr[i12])));
                            } else if (i14 + 4 < i13) {
                                try {
                                    StringBuilder sbH = sVar.h();
                                    i12 = i14 + 1;
                                    try {
                                        int iB = p.b(bArr[i12]) << 12;
                                        int i15 = i12 + 1;
                                        int iB2 = iB + (p.b(bArr[i15]) << 8);
                                        int i16 = i15 + 1;
                                        int iB3 = iB2 + (p.b(bArr[i16]) << 4);
                                        i12 = i16 + 1;
                                        sbH.append(Character.toChars(iB3 + p.b(bArr[i12])));
                                    } catch (Utf8Appendable.NotUtf8Exception e10) {
                                        int i17 = i12;
                                        e = e10;
                                        i10 = i17;
                                        c cVar = f65739b;
                                        cVar.g(e.toString(), new Object[0]);
                                        cVar.a(e);
                                    }
                                } catch (Utf8Appendable.NotUtf8Exception e11) {
                                    e = e11;
                                    i10 = i14;
                                }
                            } else {
                                sVar.h().append((char) 65533);
                            }
                            i10 = i12;
                        } else {
                            sVar.h().append((char) 65533);
                        }
                        i10 = i13;
                    } else if (c10 == '&') {
                        String string2 = sVar.i() == 0 ? "" : sVar.toString();
                        sVar.f();
                        if (string != null) {
                            multiMap.add(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            multiMap.add(string2, "");
                        }
                        string = null;
                    } else if (c10 == '+') {
                        sVar.a((byte) 32);
                    } else if (c10 != '=') {
                        try {
                            sVar.a(b10);
                        } catch (Utf8Appendable.NotUtf8Exception e12) {
                            e = e12;
                            c cVar2 = f65739b;
                            cVar2.g(e.toString(), new Object[0]);
                            cVar2.a(e);
                        }
                    } else if (string != null) {
                        sVar.a(b10);
                    } else {
                        string = sVar.toString();
                        sVar.f();
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (string != null) {
                String strG = sVar.i() == 0 ? "" : sVar.g();
                sVar.f();
                multiMap.add(string, strG);
            } else if (sVar.i() > 0) {
                multiMap.add(sVar.g(), "");
            }
        }
    }

    public static String encodeString(String str, String str2) {
        byte[] bytes;
        int i10;
        if (str2 == null) {
            str2 = ENCODING;
        }
        try {
            bytes = str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] bArr = new byte[bytes.length * 3];
        boolean z10 = true;
        int i11 = 0;
        for (byte b10 : bytes) {
            if (b10 == 32) {
                bArr[i11] = 43;
                i11++;
            } else {
                if ((b10 < 97 || b10 > 122) && ((b10 < 65 || b10 > 90) && (b10 < 48 || b10 > 57))) {
                    int i12 = i11 + 1;
                    bArr[i11] = 37;
                    byte b11 = (byte) ((b10 & 240) >> 4);
                    if (b11 >= 10) {
                        i10 = i12 + 1;
                        bArr[i12] = (byte) ((b11 + 65) - 10);
                    } else {
                        i10 = i12 + 1;
                        bArr[i12] = (byte) (b11 + 48);
                    }
                    byte b12 = (byte) (b10 & 15);
                    if (b12 >= 10) {
                        i11 = i10 + 1;
                        bArr[i10] = (byte) ((b12 + 65) - 10);
                    } else {
                        i11 = i10 + 1;
                        bArr[i10] = (byte) (b12 + 48);
                    }
                } else {
                    bArr[i11] = b10;
                    i11++;
                }
            }
            z10 = false;
        }
        if (z10) {
            return str;
        }
        try {
            return new String(bArr, 0, i11, str2);
        } catch (UnsupportedEncodingException unused2) {
            return new String(bArr, 0, i11);
        }
    }

    public Object clone() {
        return new UrlEncoded(this);
    }

    public void decode(String str, String str2) {
        decodeTo(str, this, str2, -1);
    }

    public String encode(String str) {
        return encode(str, false);
    }

    public UrlEncoded(String str) {
        super(6);
        decode(str, ENCODING);
    }

    public synchronized String encode(String str, boolean z10) {
        return encode(this, str, z10);
    }

    public static String encode(MultiMap multiMap, String str, boolean z10) {
        if (str == null) {
            str = ENCODING;
        }
        StringBuilder sb2 = new StringBuilder(128);
        Iterator it = multiMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            int size = LazyList.size(value);
            if (size == 0) {
                sb2.append(encodeString(string, str));
                if (z10) {
                    sb2.append(G5.T);
                }
            } else {
                for (int i10 = 0; i10 < size; i10++) {
                    if (i10 > 0) {
                        sb2.append('&');
                    }
                    Object obj = LazyList.get(value, i10);
                    sb2.append(encodeString(string, str));
                    if (obj != null) {
                        String string2 = obj.toString();
                        if (string2.length() > 0) {
                            sb2.append(G5.T);
                            sb2.append(encodeString(string2, str));
                        } else if (z10) {
                            sb2.append(G5.T);
                        }
                    } else if (z10) {
                        sb2.append(G5.T);
                    }
                }
            }
            if (it.hasNext()) {
                sb2.append('&');
            }
        }
        return sb2.toString();
    }

    public UrlEncoded(String str, String str2) {
        super(6);
        decode(str, str2);
    }

    public static void decodeTo(InputStream inputStream, MultiMap multiMap, String str, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        if (str == null) {
            str = ENCODING;
        }
        if ("UTF-8".equalsIgnoreCase(str)) {
            decodeUtf8To(inputStream, multiMap, i10, i11);
            return;
        }
        if ("ISO-8859-1".equals(str)) {
            decode88591To(inputStream, multiMap, i10, i11);
            return;
        }
        if (C.UTF16_NAME.equalsIgnoreCase(str)) {
            decodeUtf16To(inputStream, multiMap, i10, i11);
            return;
        }
        synchronized (multiMap) {
            g gVar = new g();
            String string = null;
            int i15 = 0;
            while (true) {
                int i16 = inputStream.read();
                if (i16 > 0) {
                    char c10 = (char) i16;
                    if (c10 == '%') {
                        int i17 = inputStream.read();
                        if (117 == i17) {
                            int i18 = inputStream.read();
                            if (i18 >= 0 && (i13 = inputStream.read()) >= 0 && (i14 = inputStream.read()) >= 0) {
                                gVar.write(new String(Character.toChars((p.c(i17) << 12) + (p.c(i18) << 8) + (p.c(i13) << 4) + p.c(i14))).getBytes(str));
                            }
                        } else if (i17 >= 0 && (i12 = inputStream.read()) >= 0) {
                            gVar.write((p.c(i17) << 4) + p.c(i12));
                        }
                    } else if (c10 == '&') {
                        String string2 = gVar.size() == 0 ? "" : gVar.toString(str);
                        gVar.e(0);
                        if (string != null) {
                            multiMap.add(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            multiMap.add(string2, "");
                        }
                        if (i11 > 0 && multiMap.size() > i11) {
                            throw new IllegalStateException(String.format("Form with too many keys [%d > %d]", Integer.valueOf(multiMap.size()), Integer.valueOf(i11)));
                        }
                        string = null;
                    } else if (c10 == '+') {
                        gVar.write(32);
                    } else if (c10 != '=' || string != null) {
                        gVar.write(i16);
                    } else {
                        string = gVar.size() == 0 ? "" : gVar.toString(str);
                        gVar.e(0);
                    }
                    i15++;
                    if (i10 >= 0 && i15 > i10) {
                        throw new IllegalStateException("Form too large");
                    }
                } else {
                    int size = gVar.size();
                    if (string != null) {
                        Object string3 = size == 0 ? "" : gVar.toString(str);
                        gVar.e(0);
                        multiMap.add(string, string3);
                    } else if (size > 0) {
                        multiMap.add(gVar.toString(str), "");
                    }
                }
            }
        }
    }

    public static void decodeUtf8To(InputStream inputStream, MultiMap multiMap, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        synchronized (multiMap) {
            s sVar = new s();
            String string = null;
            int i15 = 0;
            while (true) {
                int i16 = inputStream.read();
                if (i16 >= 0) {
                    char c10 = (char) i16;
                    if (c10 == '%') {
                        int i17 = inputStream.read();
                        if (117 == i17) {
                            int i18 = inputStream.read();
                            if (i18 >= 0 && (i13 = inputStream.read()) >= 0 && (i14 = inputStream.read()) >= 0) {
                                sVar.h().append(Character.toChars((p.c(i17) << 12) + (p.c(i18) << 8) + (p.c(i13) << 4) + p.c(i14)));
                            }
                        } else if (i17 >= 0 && (i12 = inputStream.read()) >= 0) {
                            sVar.a((byte) ((p.c(i17) << 4) + p.c(i12)));
                        }
                    } else if (c10 == '&') {
                        String string2 = sVar.i() == 0 ? "" : sVar.toString();
                        sVar.f();
                        if (string != null) {
                            multiMap.add(string, string2);
                        } else if (string2 != null && string2.length() > 0) {
                            multiMap.add(string2, "");
                        }
                        if (i11 > 0) {
                            try {
                                if (multiMap.size() > i11) {
                                    throw new IllegalStateException(String.format("Form with too many keys [%d > %d]", Integer.valueOf(multiMap.size()), Integer.valueOf(i11)));
                                }
                            } catch (Utf8Appendable.NotUtf8Exception e10) {
                                e = e10;
                                string = null;
                                c cVar = f65739b;
                                cVar.g(e.toString(), new Object[0]);
                                cVar.a(e);
                            }
                        }
                        string = null;
                    } else if (c10 == '+') {
                        sVar.a((byte) 32);
                    } else if (c10 != '=') {
                        try {
                            sVar.a((byte) i16);
                        } catch (Utf8Appendable.NotUtf8Exception e11) {
                            e = e11;
                            c cVar2 = f65739b;
                            cVar2.g(e.toString(), new Object[0]);
                            cVar2.a(e);
                        }
                    } else if (string != null) {
                        sVar.a((byte) i16);
                    } else {
                        string = sVar.toString();
                        sVar.f();
                    }
                    if (i10 >= 0 && (i15 = i15 + 1) > i10) {
                        throw new IllegalStateException("Form too large");
                    }
                } else if (string != null) {
                    Object string3 = sVar.i() == 0 ? "" : sVar.toString();
                    sVar.f();
                    multiMap.add(string, string3);
                } else if (sVar.i() > 0) {
                    multiMap.add(sVar.toString(), "");
                }
            }
        }
    }
}
