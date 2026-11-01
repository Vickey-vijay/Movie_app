package com.pgl.ssdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public class af {
    private static void a(byte[] bArr, int i10, byte[] bArr2) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11 % bArr2.length]);
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int i10;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[4096];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                i10 = bufferedInputStream.read(bArr);
                if (i10 > 0) {
                    sb2.append(new String(bArr, 0, i10));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } while (i10 >= 4096);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0096  */
    /* JADX WARN: Code duplicated, block: B:65:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[SYNTHETIC] */
    private static String a(String str) throws Throwable {
        Process processExec;
        Process process;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedOutputStream bufferedOutputStream2 = null;
        BufferedInputStream bufferedInputStream3 = null;
        str = null;
        String str2 = null;
        try {
            processExec = Runtime.getRuntime().exec(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH);
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream2 = new BufferedInputStream(processExec.getInputStream());
                    try {
                        try {
                            bufferedOutputStream.write(str.getBytes());
                            bufferedOutputStream.write(10);
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            processExec.waitFor();
                            String strA = a(bufferedInputStream2);
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                            str2 = strA;
                        } catch (Exception e12) {
                            e = e12;
                            e.printStackTrace();
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                            }
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                }
                            }
                            if (processExec != null) {
                            }
                            return str2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream3 = bufferedInputStream2;
                        Process process2 = processExec;
                        bufferedInputStream = bufferedInputStream3;
                        bufferedOutputStream2 = bufferedOutputStream;
                        process = process2;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                        if (process == null) {
                            throw th;
                        }
                        process.destroy();
                        throw th;
                    }
                } catch (Exception e17) {
                    e = e17;
                    bufferedInputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    Process process3 = processExec;
                    bufferedInputStream = bufferedInputStream3;
                    bufferedOutputStream2 = bufferedOutputStream;
                    process = process3;
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (process == null) {
                        throw th;
                    }
                    process.destroy();
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                bufferedOutputStream = null;
                bufferedInputStream2 = null;
                e.printStackTrace();
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return str2;
            } catch (Throwable th4) {
                th = th4;
                process = processExec;
                bufferedInputStream = null;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (process == null) {
                    throw th;
                }
                process.destroy();
                throw th;
            }
        } catch (Exception e19) {
            e = e19;
            processExec = null;
        } catch (Throwable th5) {
            th = th5;
            processExec = null;
        }
        processExec.destroy();
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00dd  */
    public static synchronized String a(Context context) {
        String strA;
        try {
            String str = context.getFilesDir().getAbsolutePath() + "/dic";
            if (new File(str).exists()) {
                a("chmod 777 ".concat(String.valueOf(str)));
                String strA2 = a(str);
                a("chmod 600 ".concat(String.valueOf(str)));
                if (strA2 != null && strA2.length() > 0) {
                    return strA2;
                }
            }
            InputStream inputStreamOpen = context.getResources().getAssets().open("dic");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i10 = inputStreamOpen.read(bArr, 0, 4096);
                if (i10 == -1) {
                    break;
                }
                a(bArr, i10, "dic".getBytes(Charset.forName("UTF-8")));
                byteArrayOutputStream.write(bArr, 0, i10);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
            a("chmod 777 ".concat(String.valueOf(str)));
            strA = a(str);
            if (strA == null || strA.length() == 0) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(16L);
                randomAccessFile.write(new byte[]{2});
                randomAccessFile.close();
                strA = a(str);
            }
            a("chmod 600 ".concat(String.valueOf(str)));
        } catch (Throwable unused) {
            strA = "0[<!>]EXCEPTION[<!>]";
        }
        if (strA == null) {
            strA = "0[<!>]ERROR[<!>]";
        } else if (strA.length() == 0) {
            strA = "0[<!>]ERROR[<!>]";
        }
        return strA;
    }
}
