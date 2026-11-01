package com.bytedance.sdk.component.utils;

import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes11.dex */
public final class uq {
    public static List<File> ouw(String str, String str2, String str3) throws IOException {
        return ouw(ouw(str), ouw(str2), str3);
    }

    private static boolean vt(File file) {
        if (file.exists()) {
            return file.isFile();
        }
        if (!ouw(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static List<File> ouw(File file, File file2, String str) throws IOException {
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        try {
            if (vt(str)) {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name.contains("../")) {
                        ko.yu("ZipUtils", "entryName: " + name + " is dangerous!");
                    } else if (!ouw(file2, arrayList, zipFile, zipEntryNextElement, name)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            } else {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    String name2 = zipEntryNextElement2.getName();
                    if (name2.contains("../")) {
                        ko.yu("ZipUtils", "entryName: " + name2 + " is dangerous!");
                    } else if (name2.contains(str) && !ouw(file2, arrayList, zipFile, zipEntryNextElement2, name2)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            }
            zipFile.close();
            return arrayList;
        } catch (Throwable th2) {
            zipFile.close();
            throw th2;
        }
    }

    private static boolean vt(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    private static boolean ouw(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        File file2 = new File(file, str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            return ouw(file2);
        }
        if (!vt(file2)) {
            return false;
        }
        try {
            fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file2);
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStreamFileOutputStreamCtor);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i10 = bufferedInputStream.read(bArr);
                            if (i10 != -1) {
                                bufferedOutputStream.write(bArr, 0, i10);
                            } else {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                fileOutputStreamFileOutputStreamCtor.close();
                                return true;
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStreamFileOutputStreamCtor != null) {
                            fileOutputStreamFileOutputStreamCtor.close();
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                    th2 = th;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStreamFileOutputStreamCtor != null) {
                        fileOutputStreamFileOutputStreamCtor.close();
                    }
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
                bufferedInputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedOutputStream = null;
            fileOutputStreamFileOutputStreamCtor = null;
            bufferedInputStream = null;
        }
    }

    private static boolean ouw(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    private static File ouw(String str) {
        if (vt(str)) {
            return null;
        }
        return new File(str);
    }
}
