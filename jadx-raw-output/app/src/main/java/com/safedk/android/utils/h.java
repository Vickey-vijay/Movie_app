package com.safedk.android.utils;

import android.util.Base64;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44981a = "SerializingUtils";

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: Throwable -> 0x0076, IOException -> 0x00a6, TRY_LEAVE, TryCatch #2 {IOException -> 0x00a6, blocks: (B:10:0x001e, B:12:0x0023), top: B:51:0x001e, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[Catch: IOException -> 0x005c, Throwable -> 0x0076, TRY_LEAVE, TryCatch #10 {IOException -> 0x005c, blocks: (B:20:0x0053, B:22:0x0058), top: B:59:0x0053, outer: #8 }] */
    public static String a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        String strEncodeToString = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            synchronized (obj) {
                                objectOutputStream.writeObject(obj);
                            }
                            objectOutputStream.flush();
                            strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                } catch (IOException e10) {
                                    Logger.e(f44981a, "failed during closing serialization streams with object: " + obj, e10);
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                        } catch (IOException e11) {
                            e = e11;
                            Logger.e(f44981a, "failed during serialization object: " + obj + " : " + e.getMessage(), e);
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                } catch (IOException e12) {
                                    Logger.e(f44981a, "failed during closing serialization streams with object: " + obj, e12);
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                        }
                    } catch (IOException e13) {
                        e = e13;
                        objectOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (strEncodeToString != 0) {
                            try {
                                strEncodeToString.close();
                            } catch (IOException e14) {
                                Logger.e(f44981a, "failed during closing serialization streams with object: " + obj, e14);
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e15) {
                e = e15;
                objectOutputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th5) {
            Logger.e(f44981a, "failed during serializing object : " + th5.getMessage() + " for object : " + obj, th5);
            new CrashReporter().caughtException(th5);
        }
        return strEncodeToString;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #1 {IOException -> 0x0036, blocks: (B:16:0x002d, B:18:0x0032), top: B:28:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #3 {IOException -> 0x001f, blocks: (B:7:0x0016, B:9:0x001b), top: B:32:0x0016 }] */
    public static Object a(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                        } catch (IOException e10) {
                            Logger.e(f44981a, "failed while closing serialization stream", e10);
                        }
                    } else if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                        } catch (IOException e11) {
                            Logger.e(f44981a, "failed while closing serialization stream", e11);
                            throw th;
                        }
                    } else if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
            objectInputStream = null;
        }
    }
}
