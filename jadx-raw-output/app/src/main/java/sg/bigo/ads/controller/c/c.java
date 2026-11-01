package sg.bigo.ads.controller.c;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:45:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x006d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.InputStream, java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.zip.GZIPInputStream] */
    @Nullable
    @VisibleForTesting
    public static String a(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        BufferedReader bufferedReader;
        ?? gZIPInputStream;
        Throwable th2;
        ?? sb2;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader((InputStream) gZIPInputStream, "UTF-8"));
                    try {
                        try {
                            sb2 = new StringBuilder();
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line != null) {
                                        sb2.append(line);
                                    } else {
                                        try {
                                            break;
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Exception unused2) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    if (gZIPInputStream != 0) {
                                        try {
                                            gZIPInputStream.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    if (byteArrayInputStream != null) {
                                    }
                                    if (sb2 == 0) {
                                        return null;
                                    }
                                    return sb2.toString();
                                }
                            }
                            bufferedReader.close();
                            try {
                                gZIPInputStream.close();
                            } catch (IOException unused5) {
                            }
                        } catch (Exception unused6) {
                            sb2 = 0;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (gZIPInputStream != 0) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        if (byteArrayInputStream != null) {
                            throw th2;
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th2;
                        } catch (IOException unused9) {
                            throw th2;
                        }
                    }
                } catch (Exception unused10) {
                    bufferedReader = null;
                    gZIPInputStream = gZIPInputStream;
                    sb2 = bufferedReader;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (gZIPInputStream != 0) {
                        gZIPInputStream.close();
                    }
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (sb2 == 0) {
                        return null;
                    }
                    return sb2.toString();
                } catch (Throwable th4) {
                    bufferedReader = null;
                    th2 = th4;
                }
            } catch (Exception unused11) {
                gZIPInputStream = 0;
                bufferedReader = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                th2 = th;
                gZIPInputStream = bufferedReader;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (gZIPInputStream != 0) {
                    gZIPInputStream.close();
                }
                if (byteArrayInputStream != null) {
                    throw th2;
                }
                byteArrayInputStream.close();
                throw th2;
            }
        } catch (Exception unused12) {
            gZIPInputStream = 0;
            byteArrayInputStream = null;
            bufferedReader = null;
        } catch (Throwable th6) {
            th = th6;
            byteArrayInputStream = null;
            bufferedReader = null;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused13) {
        }
        if (sb2 == 0) {
            return null;
        }
        return sb2.toString();
    }
}
