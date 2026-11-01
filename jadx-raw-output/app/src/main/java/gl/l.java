package gl;

import android.content.Context;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l f53530c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f53531a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f53532b = null;

    public static l a() {
        if (f53530c == null) {
            synchronized (l.class) {
                if (f53530c == null) {
                    f53530c = new l();
                }
            }
        }
        return f53530c;
    }

    public static String b(Context context) {
        return context.getExternalFilesDir("") + File.separator + Constant.PATH_BD_CONFIG;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0083 A[Catch: IOException -> 0x007f, TRY_LEAVE, TryCatch #7 {IOException -> 0x007f, blocks: (B:43:0x007b, B:47:0x0083), top: B:55:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static HashMap d(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        File file = new File(str);
        HashMap map = new HashMap();
        if (file.exists() && file.isFile()) {
            FileReader fileReader = null;
            try {
                try {
                    FileReader fileReader2 = new FileReader(file);
                    try {
                        bufferedReader = new BufferedReader(fileReader2);
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                String[] strArrSplit = line.trim().split("=");
                                if (strArrSplit.length > 1) {
                                    map.put(strArrSplit[0], strArrSplit[1]);
                                }
                            } catch (Exception e10) {
                                bufferedReader2 = bufferedReader;
                                e = e10;
                                fileReader = fileReader2;
                                try {
                                    AdLog.e(e.getMessage(), e);
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    if (fileReader != null) {
                                        try {
                                            fileReader.close();
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                        } catch (IOException e11) {
                                            AdLog.e(e11.getMessage(), e11);
                                            throw th;
                                        }
                                    } else if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileReader = fileReader2;
                                if (fileReader != null) {
                                    fileReader.close();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                } else if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th;
                            }
                        }
                        fileReader2.close();
                        bufferedReader.close();
                    } catch (Exception e12) {
                        e = e12;
                        bufferedReader2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = null;
                    }
                } catch (IOException e13) {
                    AdLog.e(e13.getMessage(), e13);
                }
            } catch (Exception e14) {
                e = e14;
                bufferedReader2 = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
            }
        }
        return map;
    }

    public final boolean c(String str) {
        try {
            HashMap map = this.f53532b;
            boolean zEquals = (map == null || map.get(str) == null) ? false : Objects.equals(this.f53532b.get(str), this.f53531a.get(str));
            AdLog.i("BdUtils", "getDbConfig, key = " + str + ", state = " + zEquals);
            return zEquals;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return false;
        }
    }
}
