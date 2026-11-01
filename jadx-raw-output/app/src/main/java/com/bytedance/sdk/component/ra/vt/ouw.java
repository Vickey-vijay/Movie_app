package com.bytedance.sdk.component.ra.vt;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public volatile boolean f11912lh;
    public File ouw;
    public File vt;

    public static boolean lh(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public static long vt(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final void ouw(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.ouw = new File(str, str2);
        this.vt = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.ra.vt.lh
    public final void lh() {
        this.f11912lh = true;
        super.lh();
    }

    public ouw(cf cfVar) {
        super(cfVar);
    }

    public final void vt() {
        try {
            this.ouw.delete();
        } catch (Throwable unused) {
        }
        try {
            this.vt.delete();
        } catch (Throwable unused2) {
        }
    }

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        File file = this.ouw;
        if (file != null && this.vt != null) {
            if (file.exists() && this.ouw.length() != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.bytedance.sdk.component.ra.vt vtVar = new com.bytedance.sdk.component.ra.vt(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
                vtVar.f11909ra = this.ouw;
                ouwVar.ouw(this, vtVar);
                return;
            }
            long length = this.vt.length();
            final long j10 = length >= 0 ? length : 0L;
            ryl.ouw ouwVar2 = new ryl.ouw();
            ouwVar2.fkw = yu();
            vt(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + "-");
            if (TextUtils.isEmpty(this.bly)) {
                ouwVar.ouw(this, new IOException("Url is Empty"));
                return;
            }
            try {
                ouwVar2.ouw(this.bly);
                if (!TextUtils.isEmpty(this.f11910le)) {
                    ouwVar2.pno = this.f11910le;
                }
                int i10 = this.f11911ra;
                if (i10 > 0) {
                    ouwVar2.f11958ra = i10;
                }
                ouw(ouwVar2);
                com.bytedance.sdk.component.vt.ouw.vt vtVarOuw = this.yu.ouw(ouwVar2.ouw("GET", (mwh) null).ouw());
                if (vtVarOuw == null) {
                    ouwVar.ouw(this, new IOException("new call error"));
                    return;
                } else {
                    vtVarOuw.ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.ouw.1
                        @Override // com.bytedance.sdk.component.vt.ouw.lh
                        public final void ouw(IOException iOException) {
                            com.bytedance.sdk.component.ra.ouw.ouw ouwVar3 = ouwVar;
                            if (ouwVar3 != null) {
                                ouwVar3.ouw(ouw.this, iOException);
                            }
                            ouw.this.vt();
                        }

                        /* JADX WARN: Code duplicated, block: B:117:0x0257 A[Catch: all -> 0x026d, TRY_LEAVE, TryCatch #5 {all -> 0x026d, blocks: (B:115:0x023d, B:117:0x0257), top: B:147:0x023d }] */
                        /* JADX WARN: Code duplicated, block: B:138:0x025e A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:66:0x0176  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v2 */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // com.bytedance.sdk.component.vt.ouw.lh
                        public final void ouw(jg jgVar) throws IOException {
                            File file2;
                            RandomAccessFile randomAccessFile;
                            long j11;
                            com.bytedance.sdk.component.ra.vt vtVar2;
                            InputStream inputStreamLh;
                            boolean z10;
                            boolean z11;
                            if (ouwVar == null) {
                                return;
                            }
                            HashMap map = new HashMap();
                            if (jgVar == null) {
                                return;
                            }
                            le leVarFkw = jgVar.fkw();
                            for (int i11 = 0; i11 < leVarFkw.ouw.length / 2; i11++) {
                                map.put(leVarFkw.ouw(i11), leVarFkw.vt(i11));
                            }
                            com.bytedance.sdk.component.ra.vt vtVar3 = new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), map, null, 0L, 0L);
                            if (jgVar.vt()) {
                                long jOuw = jgVar.yu().ouw();
                                if (jOuw <= 0) {
                                    jOuw = ouw.vt(map);
                                }
                                boolean zOuw = ouw.ouw(map);
                                int i12 = -1;
                                if (zOuw) {
                                    jOuw += j10;
                                    String str = (String) map.get("Content-Range");
                                    if (!TextUtils.isEmpty(str)) {
                                        String str2 = "bytes " + j10 + "-" + (jOuw - 1);
                                        if (TextUtils.indexOf(str, str2) == -1) {
                                            ouw.this.vt();
                                            ouwVar.ouw(ouw.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + ouw.this.vt + "]."));
                                            return;
                                        }
                                    }
                                }
                                String str3 = "Rename fail";
                                if (jOuw > 0 && ouw.this.vt.exists() && ouw.this.vt.length() == jOuw) {
                                    ouw ouwVar3 = ouw.this;
                                    if (ouwVar3.vt.renameTo(ouwVar3.ouw)) {
                                        ouw ouwVar4 = ouw.this;
                                        vtVar3.f11909ra = ouwVar4.ouw;
                                        ouwVar.ouw(ouwVar4, vtVar3);
                                        return;
                                    }
                                    ouwVar.ouw(ouw.this, new IOException("Rename fail"));
                                    return;
                                }
                                try {
                                    file2 = ouw.this.vt;
                                    randomAccessFile = new RandomAccessFile(file2, "rw");
                                    try {
                                        if (zOuw) {
                                            vtVar2 = vtVar3;
                                            randomAccessFile.seek(j10);
                                            j11 = j10;
                                        } else {
                                            file2 = vtVar3;
                                            randomAccessFile.setLength(0L);
                                            j11 = 0;
                                            vtVar2 = file2;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable unused2) {
                                    file2 = vtVar3;
                                    randomAccessFile = null;
                                }
                                try {
                                    inputStreamLh = jgVar.yu().lh();
                                    try {
                                        if (ouw.lh(map) && !(inputStreamLh instanceof GZIPInputStream)) {
                                            inputStreamLh = new GZIPInputStream(inputStreamLh);
                                        }
                                        try {
                                            byte[] bArr = new byte[16384];
                                            long j12 = 0;
                                            int i13 = 0;
                                            while (true) {
                                                int i14 = inputStreamLh.read(bArr, i13, 16384 - i13);
                                                if (i14 != i12) {
                                                    i13 += i14;
                                                    InputStream inputStream = inputStreamLh;
                                                    j12 += (long) i14;
                                                    try {
                                                        if (j12 % 16384 != 0) {
                                                            try {
                                                                if (j12 == jOuw - j10) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                inputStreamLh = inputStream;
                                                                try {
                                                                    com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when FileRequest.parseHttpResponse");
                                                                    th.printStackTrace();
                                                                    ouwVar.ouw(ouw.this, new IOException(th.getMessage()));
                                                                    if (!zOuw) {
                                                                        ouw.this.vt();
                                                                    }
                                                                    try {
                                                                        return;
                                                                    } catch (Throwable unused3) {
                                                                        return;
                                                                    }
                                                                } finally {
                                                                    if (inputStreamLh != null) {
                                                                        try {
                                                                            inputStreamLh.close();
                                                                        } catch (Throwable unused4) {
                                                                            com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                                                        }
                                                                    }
                                                                    try {
                                                                        randomAccessFile.close();
                                                                    } catch (Throwable unused5) {
                                                                        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            randomAccessFile.seek(j11);
                                                            randomAccessFile.write(bArr, 0, i13);
                                                            j11 += (long) i13;
                                                            i13 = 0;
                                                        }
                                                        try {
                                                            if (ouw.this.f11912lh) {
                                                                throw new IOException("net is cancel");
                                                            }
                                                            inputStreamLh = inputStream;
                                                            str3 = str3;
                                                            i12 = -1;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            inputStreamLh = inputStream;
                                                            com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when FileRequest.parseHttpResponse");
                                                            th.printStackTrace();
                                                            ouwVar.ouw(ouw.this, new IOException(th.getMessage()));
                                                            if (!zOuw) {
                                                                ouw.this.vt();
                                                            }
                                                            return;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        inputStream = inputStream;
                                                    }
                                                } else {
                                                    InputStream inputStream2 = inputStreamLh;
                                                    String str4 = str3;
                                                    if (i13 != 0) {
                                                        randomAccessFile.seek(j11);
                                                        z10 = false;
                                                        randomAccessFile.write(bArr, 0, i13);
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (!zOuw) {
                                                        jOuw = ouw.this.vt.length();
                                                    }
                                                    if (jOuw > 0 && ouw.this.vt.exists() && ouw.this.vt.length() == jOuw) {
                                                        ouw ouwVar5 = ouw.this;
                                                        if (ouwVar5.vt.renameTo(ouwVar5.ouw)) {
                                                            ouw ouwVar6 = ouw.this;
                                                            vtVar2.f11909ra = ouwVar6.ouw;
                                                            ouwVar.ouw(ouwVar6, vtVar2);
                                                        } else {
                                                            ouwVar.ouw(ouw.this, new IOException(str4));
                                                        }
                                                    } else {
                                                        com.bytedance.sdk.component.ra.ouw.ouw ouwVar7 = ouwVar;
                                                        ouw ouwVar8 = ouw.this;
                                                        StringBuilder sb2 = new StringBuilder(" tempFile.length() == fileSize is");
                                                        sb2.append(ouw.this.vt.length() == jOuw ? true : z10);
                                                        ouwVar7.ouw(ouwVar8, new IOException(sb2.toString()));
                                                    }
                                                    try {
                                                        inputStream2.close();
                                                    } catch (Throwable unused6) {
                                                        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                        return;
                                                    } catch (Throwable unused7) {
                                                        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                                        return;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    inputStreamLh = null;
                                }
                            } else {
                                ouwVar.ouw(ouw.this, vtVar3);
                            }
                        }
                    });
                    return;
                }
            } catch (IllegalArgumentException unused) {
                ouwVar.ouw(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
                return;
            }
        }
        ouwVar.ouw(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
    }

    public final com.bytedance.sdk.component.ra.vt ouw() {
        jg jgVarVt;
        RandomAccessFile randomAccessFile;
        long j10;
        InputStream inputStreamLh;
        File file = this.ouw;
        if (file == null || this.vt == null) {
            return null;
        }
        if (file.exists() && this.ouw.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.ra.vt vtVar = new com.bytedance.sdk.component.ra.vt(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            vtVar.f11909ra = this.ouw;
            return vtVar;
        }
        long length = this.vt.length();
        if (length < 0) {
            length = 0;
        }
        ryl.ouw ouwVar = new ryl.ouw();
        ouwVar.fkw = yu();
        vt(Command.HTTP_HEADER_RANGE, "bytes=" + length + "-");
        String str = "DownloadExecutor";
        if (TextUtils.isEmpty(this.bly)) {
            Log.e("DownloadExecutor", "execute: Url is Empty");
            return null;
        }
        try {
            ouwVar.ouw(this.bly);
            ouw(ouwVar);
            try {
                com.bytedance.sdk.component.vt.ouw.vt vtVarOuw = this.yu.ouw(ouwVar.ouw("GET", (mwh) null).ouw());
                if (vtVarOuw == null || (jgVarVt = vtVarOuw.vt()) == null || !jgVarVt.vt()) {
                    return null;
                }
                HashMap map = new HashMap();
                le leVarFkw = jgVarVt.fkw();
                for (int i10 = 0; i10 < leVarFkw.ouw.length / 2; i10++) {
                    map.put(leVarFkw.ouw(i10), leVarFkw.vt(i10));
                }
                com.bytedance.sdk.component.ra.vt vtVar2 = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, null, 0L, 0L);
                long jOuw = jgVarVt.yu().ouw();
                if (jOuw <= 0) {
                    jOuw = vt(map);
                }
                long length2 = this.vt.length();
                boolean zOuw = ouw(map);
                if (zOuw) {
                    jOuw += length2;
                    String str2 = (String) map.get("Content-Range");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = "bytes " + length2 + "-" + (jOuw - 1);
                        if (TextUtils.indexOf(str2, str3) == -1) {
                            com.bytedance.sdk.component.ra.lh.yu.ouw("DownloadExecutor", "execute: The Content-Range Header is invalid Assume[" + str3 + "] vs Real[" + str2 + "], please remove the temporary file [" + this.vt + "].");
                            vt();
                            return null;
                        }
                    }
                }
                if (jOuw > 0 && this.vt.exists() && this.vt.length() == jOuw) {
                    if (this.vt.renameTo(this.ouw)) {
                        vtVar2.f11909ra = this.ouw;
                        return vtVar2;
                    }
                    com.bytedance.sdk.component.ra.lh.yu.ouw("DownloadExecutor", "Rename fail");
                    return null;
                }
                try {
                    randomAccessFile = new RandomAccessFile(this.vt, "rw");
                    try {
                        if (zOuw) {
                            randomAccessFile.seek(length);
                            j10 = length;
                        } else {
                            randomAccessFile.setLength(0L);
                            j10 = 0;
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    randomAccessFile = null;
                }
                try {
                    inputStreamLh = jgVarVt.yu().lh();
                    try {
                        if (lh(map) && !(inputStreamLh instanceof GZIPInputStream)) {
                            inputStreamLh = new GZIPInputStream(inputStreamLh);
                        }
                        byte[] bArr = new byte[16384];
                        int i11 = 0;
                        long j11 = 0;
                        while (true) {
                            int i12 = inputStreamLh.read(bArr, i11, 16384 - i11);
                            boolean z10 = true;
                            String str4 = str;
                            if (i12 != -1) {
                                i11 += i12;
                                long j12 = jOuw;
                                j11 += (long) i12;
                                if (j11 % 16384 != 0 && j11 != j12 - length) {
                                    z10 = false;
                                }
                                if (z10) {
                                    randomAccessFile.seek(j10);
                                    randomAccessFile.write(bArr, 0, i11);
                                    j10 += (long) i11;
                                    i11 = 0;
                                }
                                if (this.f11912lh) {
                                    throw new IOException("net is cancel");
                                }
                                str = str4;
                                jOuw = j12;
                            } else {
                                long j13 = jOuw;
                                if (i12 != 0) {
                                    randomAccessFile.seek(j10);
                                    randomAccessFile.write(bArr, 0, i11);
                                }
                                long length3 = (!zOuw || length == 0) ? this.vt.length() : j13;
                                if (length3 > 0 && this.vt.exists() && this.vt.length() == length3) {
                                    if (this.vt.renameTo(this.ouw)) {
                                        vtVar2.f11909ra = this.ouw;
                                        try {
                                            inputStreamLh.close();
                                        } catch (Throwable unused3) {
                                            com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused4) {
                                            com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                        }
                                        return vtVar2;
                                    }
                                    try {
                                        inputStreamLh.close();
                                    } catch (Throwable unused5) {
                                        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                    }
                                    try {
                                        randomAccessFile.close();
                                        return null;
                                    } catch (Throwable unused6) {
                                        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                        return null;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(" tempFile.length() == fileSize is");
                                sb2.append(this.vt.length() == length3);
                                com.bytedance.sdk.component.ra.lh.yu.ouw(str4, sb2.toString());
                                try {
                                    inputStreamLh.close();
                                } catch (Throwable unused7) {
                                    com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                }
                                try {
                                    randomAccessFile.close();
                                    return null;
                                } catch (Throwable unused8) {
                                    com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                    return null;
                                }
                                e.printStackTrace();
                                vt();
                                return null;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when FileRequest.parseHttpResponse");
                            th.printStackTrace();
                            if (!zOuw) {
                                vt();
                            }
                            if (inputStreamLh != null) {
                                try {
                                    inputStreamLh.close();
                                } catch (Throwable unused9) {
                                    com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                }
                            }
                            try {
                                randomAccessFile.close();
                                return null;
                            } catch (Throwable unused10) {
                                com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                return null;
                            }
                        } catch (Throwable th3) {
                            if (inputStreamLh != null) {
                                try {
                                    inputStreamLh.close();
                                } catch (Throwable unused11) {
                                    com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
                                }
                            }
                            try {
                                randomAccessFile.close();
                                throw th3;
                            } catch (Throwable unused12) {
                                com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling tmpFile.close");
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamLh = null;
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                vt();
                return null;
            }
        } catch (IllegalArgumentException unused13) {
            Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            return null;
        }
    }

    public static boolean ouw(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }
}
