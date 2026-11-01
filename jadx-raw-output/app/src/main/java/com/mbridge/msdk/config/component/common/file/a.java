package com.mbridge.msdk.config.component.common.file;

import android.net.Uri;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: ComponentFileUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static b a(String str, int i10, String str2) {
        b bVar;
        b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String strD = d(str);
            String strF = f(str);
            bVar = new b();
            try {
                bVar.a(a());
                bVar.c(strD);
                if (!strD.contains("mp4")) {
                    strF = strF.concat(strD);
                }
                bVar.b(strF);
                if (strD.contains("zip")) {
                    bVar.d(j(str));
                    String strB = b(str, i10, str2);
                    bVar.a(b(strB));
                    bVar.e(strB);
                } else {
                    bVar.a(b(bVar.a()));
                }
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
                q0.b("ComponentFileUtil", th.getMessage());
                bVar = bVar2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (bVar != null) {
            a(bVar.a());
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    public static boolean b(String str, String str2) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        IOException e10;
        Throwable th3;
        String canonicalPath;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        InputStream inputStream3 = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            FileOutputStream fileOutputStream3 = null;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement == null) {
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e11) {
                                    q0.b("ComponentFileUtil", "unzip error", e11);
                                }
                            }
                            if (fileOutputStream3 != null) {
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e12) {
                                    q0.b("ComponentFileUtil", "unzip error", e12);
                                }
                            }
                            return false;
                        }
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                canonicalPath = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                canonicalPath = "";
                            }
                            if (!TextUtils.isEmpty(canonicalPath) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                if (zipEntryNextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    fileOutputStreamFileOutputStreamCtor = MintegralFilesBridge.fileOutputStreamCtor(file2);
                                    try {
                                        inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i10 = inputStream3.read(bArr, 0, 1024);
                                            if (i10 == -1) {
                                                break;
                                            }
                                            fileOutputStreamFileOutputStreamCtor.write(bArr, 0, i10);
                                            fileOutputStreamFileOutputStreamCtor.flush();
                                        }
                                        fileOutputStream3 = fileOutputStreamFileOutputStreamCtor;
                                    } catch (IOException e13) {
                                        e10 = e13;
                                        try {
                                            q0.b("ComponentFileUtil", "unzip error", e10);
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e14) {
                                                    q0.b("ComponentFileUtil", "unzip error", e14);
                                                }
                                            }
                                            if (fileOutputStreamFileOutputStreamCtor != null) {
                                                try {
                                                    fileOutputStreamFileOutputStreamCtor.close();
                                                } catch (IOException e15) {
                                                    q0.b("ComponentFileUtil", "unzip error", e15);
                                                }
                                            }
                                            return false;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            inputStream = inputStream3;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                            fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                                            inputStream3 = inputStream;
                                            th3 = th2;
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e16) {
                                                    q0.b("ComponentFileUtil", "unzip error", e16);
                                                }
                                            }
                                            if (fileOutputStreamFileOutputStreamCtor == null) {
                                                throw th3;
                                            }
                                            try {
                                                fileOutputStreamFileOutputStreamCtor.close();
                                                throw th3;
                                            } catch (IOException e17) {
                                                q0.b("ComponentFileUtil", "unzip error", e17);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                        if (inputStream3 != null) {
                                            inputStream3.close();
                                        }
                                        if (fileOutputStreamFileOutputStreamCtor == null) {
                                            throw th3;
                                        }
                                        fileOutputStreamFileOutputStreamCtor.close();
                                        throw th3;
                                    }
                                }
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e18) {
                                    q0.b("ComponentFileUtil", "unzip error", e18);
                                }
                            }
                            if (fileOutputStream3 != null) {
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e19) {
                                    q0.b("ComponentFileUtil", "unzip error", e19);
                                }
                            }
                            return false;
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e20) {
                                q0.b("ComponentFileUtil", "unzip error", e20);
                            }
                        }
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e21) {
                                q0.b("ComponentFileUtil", "unzip error", e21);
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th2 = th6;
                        inputStream = inputStream3;
                        fileOutputStream = fileOutputStream3;
                        fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                        inputStream3 = inputStream;
                        th3 = th2;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStreamFileOutputStreamCtor == null) {
                            throw th3;
                        }
                        fileOutputStreamFileOutputStreamCtor.close();
                        throw th3;
                    }
                } catch (IOException e22) {
                    iOException = e22;
                    inputStream2 = inputStream3;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStreamFileOutputStreamCtor = fileOutputStream2;
                    inputStream3 = inputStream2;
                    e10 = iOException;
                    q0.b("ComponentFileUtil", "unzip error", e10);
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStreamFileOutputStreamCtor != null) {
                        fileOutputStreamFileOutputStreamCtor.close();
                    }
                    return false;
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e23) {
                    q0.b("ComponentFileUtil", "unzip error", e23);
                }
            }
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                } catch (IOException e24) {
                    q0.b("ComponentFileUtil", "unzip error", e24);
                }
            }
            return true;
        } catch (IOException e25) {
            iOException = e25;
            inputStream2 = null;
        } catch (Throwable th7) {
            th2 = th7;
            inputStream = null;
        }
    }

    public static b e(String str) {
        return a(str, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static String d(String str) {
        String str2;
        String str3 = "";
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment)) {
                str2 = "";
            } else {
                String[] strArrSplit = lastPathSegment.split("\\.");
                if (strArrSplit.length > 0) {
                    str2 = strArrSplit[strArrSplit.length - 1];
                } else {
                    str2 = "";
                }
            }
            try {
                return TextUtils.isEmpty(str2) ? "" : ".".concat(str2);
            } catch (Throwable th2) {
                str3 = str2;
                th = th2;
                q0.b("ComponentFileUtil", th.getMessage());
                return str3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String c(String str) {
        String strHexEncode = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i10);
                        q0.b("ComponentFileUtil", th.getMessage());
                    }
                    strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                    messageDigest.reset();
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                q0.b("ComponentFileUtil", th4.getMessage());
            }
        }
        return strHexEncode;
    }

    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return SameMD5.getMD5(c1.b(str.trim()));
        }
        return "";
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a() + "/" + f(str) + "/";
    }

    private static String h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            List<String> queryParameters = uri.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters != null && !queryParameters.isEmpty()) {
                return queryParameters.get(0);
            }
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                return "";
            }
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return "";
            }
            return strSubstring.replace(MultiDexExtractor.EXTRACTED_SUFFIX, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a();
        String strF = f(str);
        String strI = i(str);
        if (!TextUtils.isEmpty(strI)) {
            String str2 = strA + strF + "/" + strI + "/";
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(String str) {
        com.mbridge.msdk.config.component.database.a.a().c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    public static String a() {
        File file = new File(c.n().d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    private static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: r8.a
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.component.common.file.a.k(str);
            }
        });
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.indexOf("?") + 1);
        if (!TextUtils.isEmpty(strSubstring)) {
            str3 = "?" + strSubstring;
        }
        return AdPayload.FILE_SCHEME + str2 + str3;
    }

    private static String b(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strJ = j(str);
        String strI = i(str);
        String strH = h(str);
        if (!TextUtils.isEmpty(strI)) {
            if (i10 == 0) {
                return strJ + strI + "/" + strH;
            }
            if (i10 == 1) {
                return strJ + strI + ".html";
            }
            if (i10 == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strJ);
                if (!TextUtils.isEmpty(strH)) {
                    strI = strH;
                }
                sb2.append(strI);
                sb2.append("_");
                if (str2.equals("0")) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(".xml");
                return sb2.toString();
            }
        }
        return "";
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Throwable th2) {
            q0.b("ComponentFileUtil", th2.getMessage(), th2);
        }
    }
}
