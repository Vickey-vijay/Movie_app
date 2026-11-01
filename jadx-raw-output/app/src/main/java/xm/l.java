package xm;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;

/* JADX INFO: compiled from: MultiPartInputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zm.c f75022h = zm.b.a(l.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final kj.g f75023i = new kj.g(System.getProperty("java.io.tmpdir"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f75024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kj.g f75025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f75026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MultiMap<String> f75027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f75028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f75029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75030g;

    /* JADX INFO: compiled from: MultiPartInputStream.java */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 < 0 || i10 != 61) {
                return i10;
            }
            int i11 = ((FilterInputStream) this).in.read();
            int i12 = ((FilterInputStream) this).in.read();
            if (i11 < 0 || i12 < 0) {
                throw new IOException("Unexpected end to quoted-printable byte");
            }
            return Integer.parseInt(new String(new char[]{(char) i11, (char) i12}), 16);
        }
    }

    /* JADX INFO: compiled from: MultiPartInputStream.java */
    public static class b extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f75032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f75033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f75034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f75035e;

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = this.f75034d;
            if (bArr == null || this.f75035e >= bArr.length) {
                String strD = this.f75032b.d();
                this.f75033c = strD;
                if (strD == null) {
                    return -1;
                }
                if (strD.startsWith("--")) {
                    this.f75034d = (this.f75033c + "\r\n").getBytes();
                } else if (this.f75033c.length() == 0) {
                    this.f75034d = "\r\n".getBytes();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((this.f75033c.length() * 4) / 3) + 2);
                    d.b(this.f75033c, byteArrayOutputStream);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    this.f75034d = byteArrayOutputStream.toByteArray();
                }
                this.f75035e = 0;
            }
            byte[] bArr2 = this.f75034d;
            int i10 = this.f75035e;
            this.f75035e = i10 + 1;
            return bArr2[i10];
        }

        public b(n nVar) {
            this.f75032b = nVar;
        }
    }

    /* JADX INFO: compiled from: MultiPartInputStream.java */
    public class c implements lj.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f75036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f75037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File f75038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public OutputStream f75039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g f75040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f75041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public MultiMap<String> f75042g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f75043h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f75044i = true;

        public c(String str, String str2) throws IOException {
            this.f75036a = str;
            this.f75037b = str2;
        }

        public void a() throws IOException {
            File file;
            if (this.f75044i && (file = this.f75038c) != null && file.exists()) {
                this.f75038c.delete();
            }
        }

        public void b() throws IOException {
            this.f75039d.close();
        }

        public void c() throws IOException {
            OutputStream outputStream;
            File fileCreateTempFile = File.createTempFile("MultiPart", "", l.this.f75028e);
            this.f75038c = fileCreateTempFile;
            fileCreateTempFile.setReadable(false, false);
            this.f75038c.setReadable(true, true);
            if (l.this.f75030g) {
                this.f75038c.deleteOnExit();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f75038c));
            if (this.f75043h > 0 && (outputStream = this.f75039d) != null) {
                outputStream.flush();
                this.f75040e.writeTo(bufferedOutputStream);
                this.f75039d.close();
                this.f75040e = null;
            }
            this.f75039d = bufferedOutputStream;
        }

        public String d() {
            return this.f75037b;
        }

        @Override // lj.m
        public void delete() throws IOException {
            File file = this.f75038c;
            if (file == null || !file.exists()) {
                return;
            }
            this.f75038c.delete();
        }

        public String e() {
            return this.f75041f;
        }

        public InputStream f() throws IOException {
            return this.f75038c != null ? new BufferedInputStream(new FileInputStream(this.f75038c)) : new ByteArrayInputStream(this.f75040e.d(), 0, this.f75040e.size());
        }

        public String g() {
            return this.f75036a;
        }

        public void h() throws IOException {
            String str = this.f75037b;
            if (str != null && str.trim().length() > 0) {
                c();
                return;
            }
            g gVar = new g();
            this.f75040e = gVar;
            this.f75039d = gVar;
        }

        public void i(String str) {
            this.f75041f = str;
        }

        public void j(MultiMap<String> multiMap) {
            this.f75042g = multiMap;
        }

        public void k(int i10) throws IOException {
            if (l.this.f75025b.c() > 0 && this.f75043h + 1 > l.this.f75025b.c()) {
                throw new IllegalStateException("Multipart Mime part " + this.f75036a + " exceeds max filesize");
            }
            if (l.this.f75025b.a() > 0 && this.f75043h + 1 > l.this.f75025b.a() && this.f75038c == null) {
                c();
            }
            this.f75039d.write(i10);
            this.f75043h++;
        }

        public void l(byte[] bArr, int i10, int i11) throws IOException {
            if (l.this.f75025b.c() > 0 && this.f75043h + ((long) i11) > l.this.f75025b.c()) {
                throw new IllegalStateException("Multipart Mime part " + this.f75036a + " exceeds max filesize");
            }
            if (l.this.f75025b.a() > 0 && this.f75043h + ((long) i11) > l.this.f75025b.a() && this.f75038c == null) {
                c();
            }
            this.f75039d.write(bArr, i10, i11);
            this.f75043h += (long) i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0273 A[Catch: all -> 0x02a4, TryCatch #1 {all -> 0x02a4, blocks: (B:88:0x01cb, B:90:0x01db, B:93:0x01e6, B:94:0x0203, B:100:0x020f, B:102:0x0212, B:104:0x0216, B:106:0x021d, B:108:0x0224, B:110:0x0229, B:111:0x022d, B:113:0x0238, B:115:0x0242, B:118:0x0248, B:125:0x025a, B:127:0x0261, B:128:0x0264, B:134:0x0273, B:136:0x027a, B:149:0x0294, B:122:0x0251, B:85:0x01c3), top: B:191:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:136:0x027a A[Catch: all -> 0x02a4, TryCatch #1 {all -> 0x02a4, blocks: (B:88:0x01cb, B:90:0x01db, B:93:0x01e6, B:94:0x0203, B:100:0x020f, B:102:0x0212, B:104:0x0216, B:106:0x021d, B:108:0x0224, B:110:0x0229, B:111:0x022d, B:113:0x0238, B:115:0x0242, B:118:0x0248, B:125:0x025a, B:127:0x0261, B:128:0x0264, B:134:0x0273, B:136:0x027a, B:149:0x0294, B:122:0x0251, B:85:0x01c3), top: B:191:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0281  */
    /* JADX WARN: Code duplicated, block: B:140:0x0284  */
    /* JADX WARN: Code duplicated, block: B:145:0x028c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0290  */
    /* JADX WARN: Code duplicated, block: B:218:0x0291 A[SYNTHETIC] */
    public void e() throws ServletException, IOException {
        String strE;
        InputStream aVar;
        int i10;
        boolean z10;
        if (this.f75027d != null) {
            return;
        }
        this.f75027d = new MultiMap<>();
        String str = this.f75026c;
        if (str == null || !str.startsWith(ShareTarget.ENCODING_TYPE_MULTIPART)) {
            return;
        }
        String str2 = "";
        if (this.f75025b.b() == null || "".equals(this.f75025b.b())) {
            this.f75028e = this.f75029f;
        } else {
            File file = new File(this.f75025b.b());
            if (file.isAbsolute()) {
                this.f75028e = file;
            } else {
                this.f75028e = new File(this.f75029f, this.f75025b.b());
            }
        }
        if (!this.f75028e.exists()) {
            this.f75028e.mkdirs();
        }
        int iIndexOf = this.f75026c.indexOf("boundary=");
        String str3 = ";";
        boolean z11 = true;
        if (iIndexOf >= 0) {
            int iIndexOf2 = this.f75026c.indexOf(";", iIndexOf);
            if (iIndexOf2 < 0) {
                iIndexOf2 = this.f75026c.length();
            }
            strE = m.e(f(this.f75026c.substring(iIndexOf, iIndexOf2), true).trim());
        } else {
            strE = "";
        }
        String str4 = "--" + strE;
        byte[] bytes = (str4 + "--").getBytes("ISO-8859-1");
        boolean z12 = false;
        try {
            String strD = ((n) this.f75024a).d();
            if (strD == null) {
                throw new IOException("Missing content for multipart request");
            }
            String strTrim = strD.trim();
            boolean z13 = false;
            while (strTrim != null && !strTrim.equals(str4)) {
                if (!z13) {
                    f75022h.g("Badly formatted multipart request", new Object[0]);
                    z13 = true;
                }
                strTrim = ((n) this.f75024a).d();
                if (strTrim != null) {
                    strTrim = strTrim.trim();
                }
            }
            if (strTrim == null || strTrim.length() == 0) {
                throw new IOException("Missing initial multi part boundary");
            }
            boolean z14 = false;
            long length = 0;
            loop1: while (!z14) {
                MultiMap<String> multiMap = new MultiMap<>();
                String str5 = null;
                String str6 = null;
                String str7 = null;
                while (true) {
                    String strD2 = ((n) this.f75024a).d();
                    if (strD2 == null) {
                        break loop1;
                    }
                    if (str2.equals(strD2)) {
                        break;
                    }
                    String str8 = str2;
                    String str9 = str3;
                    boolean z15 = z11;
                    length += (long) strD2.length();
                    if (this.f75025b.d() > 0 && length > this.f75025b.d()) {
                        throw new IllegalStateException("Request exceeds maxRequestSize (" + this.f75025b.d() + ")");
                    }
                    int iIndexOf3 = strD2.indexOf(58, 0);
                    if (iIndexOf3 > 0) {
                        String lowerCase = strD2.substring(0, iIndexOf3).trim().toLowerCase(Locale.ENGLISH);
                        String strTrim2 = strD2.substring(iIndexOf3 + 1, strD2.length()).trim();
                        multiMap.put(lowerCase, strTrim2);
                        if (lowerCase.equalsIgnoreCase("content-disposition")) {
                            str5 = strTrim2;
                        }
                        if (lowerCase.equalsIgnoreCase("content-type")) {
                            str6 = strTrim2;
                        }
                        if (lowerCase.equals("content-transfer-encoding")) {
                            str7 = strTrim2;
                        }
                    }
                    str2 = str8;
                    z11 = z15;
                    str3 = str9;
                    z12 = false;
                }
                if (str5 == null) {
                    throw new IOException("Missing content-disposition");
                }
                m mVar = new m(str5, str3, z12, z11);
                boolean z16 = z12;
                String strB = null;
                String strF = null;
                while (mVar.hasMoreTokens()) {
                    String strTrim3 = mVar.nextToken().trim();
                    String str10 = str2;
                    String lowerCase2 = strTrim3.toLowerCase(Locale.ENGLISH);
                    String str11 = str3;
                    if (strTrim3.startsWith("form-data")) {
                        z16 = true;
                    } else if (lowerCase2.startsWith("name=")) {
                        strF = f(strTrim3, true);
                    } else if (lowerCase2.startsWith("filename=")) {
                        strB = b(strTrim3);
                    }
                    str2 = str10;
                    str3 = str11;
                }
                str2 = str2;
                str3 = str3;
                if (z16 && strF != null) {
                    c cVar = new c(strF, strB);
                    cVar.j(multiMap);
                    cVar.i(str6);
                    this.f75027d.add(strF, cVar);
                    cVar.h();
                    if ("base64".equalsIgnoreCase(str7)) {
                        aVar = new b((n) this.f75024a);
                    } else {
                        aVar = "quoted-printable".equalsIgnoreCase(str7) ? new a(this.f75024a) : this.f75024a;
                    }
                    int i11 = -2;
                    int i12 = -2;
                    boolean z17 = false;
                    boolean z18 = false;
                    while (true) {
                        boolean z19 = z18;
                        boolean z20 = z17;
                        i10 = 0;
                        while (true) {
                            int i13 = i12 != i11 ? i12 : aVar.read();
                            if (i13 != -1) {
                                try {
                                    length++;
                                    if (this.f75025b.d() > 0 && length > this.f75025b.d()) {
                                        throw new IllegalStateException("Request exceeds maxRequestSize (" + this.f75025b.d() + ")");
                                    }
                                    int i14 = 13;
                                    if (i13 != 13) {
                                        if (i13 == 10) {
                                            i14 = 13;
                                        } else if (i10 < 0 || i10 >= bytes.length || i13 != bytes[i10]) {
                                            if (z20) {
                                                cVar.k(13);
                                            }
                                            if (z19) {
                                                cVar.k(10);
                                            }
                                            if (i10 > 0) {
                                                cVar.l(bytes, 0, i10);
                                            }
                                            cVar.k(i13);
                                            i10 = -1;
                                            i11 = -2;
                                            z20 = false;
                                            i12 = -2;
                                            z19 = false;
                                        } else {
                                            i10++;
                                            i11 = -2;
                                            i12 = -2;
                                        }
                                    }
                                    if (i13 == i14) {
                                        aVar.mark(1);
                                        i12 = aVar.read();
                                        if (i12 != 10) {
                                            aVar.reset();
                                            i12 = -2;
                                        }
                                    } else {
                                        i12 = -2;
                                    }
                                } catch (Throwable th2) {
                                    cVar.b();
                                    throw th2;
                                }
                            }
                            if (i10 <= 0 || i10 >= bytes.length - 2) {
                                z10 = true;
                                if (i10 == bytes.length - 1) {
                                }
                                if (i10 <= 0 || i13 == -1) {
                                    break;
                                    break;
                                }
                                if (z20) {
                                    cVar.k(13);
                                }
                                if (z19) {
                                    cVar.k(10);
                                }
                                if (i13 == 13) {
                                    z17 = z10;
                                } else {
                                    z17 = false;
                                }
                                if (i13 != 10 || i12 == 10) {
                                    z18 = z10;
                                } else {
                                    z18 = false;
                                }
                                if (i12 == 10) {
                                    i12 = -2;
                                }
                                i11 = -2;
                            } else {
                                z10 = true;
                            }
                            if (z20) {
                                cVar.k(13);
                            }
                            if (z19) {
                                cVar.k(10);
                            }
                            cVar.l(bytes, 0, i10);
                            i10 = -1;
                            z20 = false;
                            z19 = false;
                            if (i10 <= 0) {
                                break;
                            }
                            if (z20) {
                                cVar.k(13);
                            }
                            if (z19) {
                                cVar.k(10);
                            }
                            if (i13 == 13) {
                                z17 = z10;
                            } else {
                                z17 = false;
                            }
                            if (i13 != 10) {
                                z18 = z10;
                            } else {
                                z18 = z10;
                            }
                            if (i12 == 10) {
                                i12 = -2;
                            }
                            i11 = -2;
                        }
                    }
                    if (i10 == bytes.length) {
                        z14 = z10;
                    }
                    cVar.b();
                    z11 = z10;
                } else {
                    z11 = true;
                }
                z12 = false;
            }
            if (!z14) {
                throw new IOException("Incomplete parts");
            }
        } catch (IOException e10) {
            f75022h.g("Badly formatted multipart request", new Object[0]);
            throw e10;
        }
    }

    public final String b(String str) {
        String strTrim = str.substring(str.indexOf(61) + 1).trim();
        if (!strTrim.matches(".??[a-z,A-Z]\\:\\\\[^\\\\].*")) {
            return m.h(strTrim, true);
        }
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '\"' || cCharAt == '\'') {
            strTrim = strTrim.substring(1);
        }
        char cCharAt2 = strTrim.charAt(strTrim.length() - 1);
        return (cCharAt2 == '\"' || cCharAt2 == '\'') ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    public Collection<lj.m> c() {
        MultiMap<String> multiMap = this.f75027d;
        if (multiMap == null) {
            return Collections.emptyList();
        }
        Collection<Object> collectionValues = multiMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.addAll(LazyList.getList(it.next(), false));
        }
        return arrayList;
    }

    public final String f(String str, boolean z10) {
        return m.g(str.substring(str.indexOf(61) + 1).trim());
    }

    public l(InputStream inputStream, String str, kj.g gVar, File file) {
        this.f75024a = new n(inputStream);
        this.f75026c = str;
        this.f75025b = gVar;
        this.f75029f = file;
        if (file == null) {
            this.f75029f = new File(System.getProperty("java.io.tmpdir"));
        }
        if (this.f75025b == null) {
            this.f75025b = new kj.g(this.f75029f.getAbsolutePath());
        }
    }

    public void a() throws MultiException {
        Collection<lj.m> collectionC = c();
        MultiException multiException = new MultiException();
        Iterator<lj.m> it = collectionC.iterator();
        while (it.hasNext()) {
            try {
                ((c) it.next()).a();
            } catch (Exception e10) {
                multiException.add(e10);
            }
        }
        this.f75027d.clear();
        multiException.ifExceptionThrowMulti();
    }

    public Collection<lj.m> d() throws ServletException, IOException {
        e();
        Collection<Object> collectionValues = this.f75027d.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.addAll(LazyList.getList(it.next(), false));
        }
        return arrayList;
    }
}
