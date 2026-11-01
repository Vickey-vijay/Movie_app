package com.mbridge.msdk.foundation.download.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "UnzipUtility";

    private void extractFile(ZipInputStream zipInputStream, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(MintegralFilesBridge.fileOutputStreamCtor(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = zipInputStream.read(bArr);
                        if (i10 == -1) {
                            bufferedOutputStream.close();
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[SYNTHETIC] */
    public int unzip(String str, String str2) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        IOException e10;
        Throwable th3;
        String canonicalPath;
        if (str == null || str2 == null) {
            return -1;
        }
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        File file = new File(str);
        if (!file.exists()) {
            return 1;
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
                                    q0.b(TAG, e11.getMessage());
                                }
                            }
                            if (fileOutputStream3 != null) {
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e12) {
                                    q0.b(TAG, e12.getMessage());
                                }
                            }
                            return 2;
                        }
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                canonicalPath = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                canonicalPath = "";
                            }
                            if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str2) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                if (zipEntryNextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (!file2.getParentFile().exists()) {
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
                                            q0.b(TAG, e10.getMessage());
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e14) {
                                                    q0.b(TAG, e14.getMessage());
                                                }
                                            }
                                            if (fileOutputStreamFileOutputStreamCtor != null) {
                                                try {
                                                    fileOutputStreamFileOutputStreamCtor.close();
                                                } catch (IOException e15) {
                                                    q0.b(TAG, e15.getMessage());
                                                }
                                            }
                                            return 3;
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
                                                    q0.b(TAG, e16.getMessage());
                                                }
                                            }
                                            if (fileOutputStreamFileOutputStreamCtor == null) {
                                                throw th3;
                                            }
                                            try {
                                                fileOutputStreamFileOutputStreamCtor.close();
                                                throw th3;
                                            } catch (IOException e17) {
                                                q0.b(TAG, e17.getMessage());
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
                                    q0.b(TAG, e18.getMessage());
                                }
                            }
                            if (fileOutputStream3 != null) {
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e19) {
                                    q0.b(TAG, e19.getMessage());
                                }
                            }
                            return 2;
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e20) {
                                q0.b(TAG, e20.getMessage());
                            }
                        }
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e21) {
                                q0.b(TAG, e21.getMessage());
                            }
                        }
                        return 2;
                    } catch (IOException e22) {
                        iOException = e22;
                        inputStream2 = inputStream3;
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStreamFileOutputStreamCtor = fileOutputStream2;
                        inputStream3 = inputStream2;
                        e10 = iOException;
                        q0.b(TAG, e10.getMessage());
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStreamFileOutputStreamCtor != null) {
                            fileOutputStreamFileOutputStreamCtor.close();
                        }
                        return 3;
                    }
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
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e23) {
                    q0.b(TAG, e23.getMessage());
                }
            }
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                } catch (IOException e24) {
                    q0.b(TAG, e24.getMessage());
                }
            }
            return 0;
        } catch (IOException e25) {
            iOException = e25;
            inputStream2 = null;
        } catch (Throwable th7) {
            th2 = th7;
            inputStream = null;
        }
    }
}
