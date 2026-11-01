package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z10) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z11) {
                    }

                    /* JADX WARN: Code duplicated, block: B:103:0x016a A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:104:0x016c A[Catch: Exception -> 0x0168, TRY_LEAVE, TryCatch #8 {Exception -> 0x0168, blocks: (B:100:0x0164, B:104:0x016c), top: B:121:0x0164 }] */
                    /* JADX WARN: Code duplicated, block: B:110:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:115:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:121:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:59:0x00ec A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:60:0x00ee A[Catch: Exception -> 0x00ea, TRY_LEAVE, TryCatch #2 {Exception -> 0x00ea, blocks: (B:56:0x00e6, B:60:0x00ee), top: B:110:0x00e6 }] */
                    /* JADX WARN: Code duplicated, block: B:66:0x00ff A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:72:0x010e  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0110 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:64:0x00fb, B:67:0x0101, B:69:0x0104, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:79:0x0124, B:81:0x0128, B:82:0x012e, B:84:0x0132), top: B:115:0x00fb }] */
                    /* JADX WARN: Code duplicated, block: B:82:0x012e A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:64:0x00fb, B:67:0x0101, B:69:0x0104, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:79:0x0124, B:81:0x0128, B:82:0x012e, B:84:0x0132), top: B:115:0x00fb }] */
                    /* JADX WARN: Code duplicated, block: B:84:0x0132 A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #5 {all -> 0x010c, blocks: (B:64:0x00fb, B:67:0x0101, B:69:0x0104, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:79:0x0124, B:81:0x0128, B:82:0x012e, B:84:0x0132), top: B:115:0x00fb }] */
                    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0132, please report this as an issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v18, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v1 */
                    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v11 */
                    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v13 */
                    /* JADX WARN: Type inference failed for: r6v14 */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r6v4 */
                    /* JADX WARN: Type inference failed for: r6v5 */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v9 */
                    /* JADX WARN: Type inference failed for: r7v0 */
                    /* JADX WARN: Type inference failed for: r7v1 */
                    /* JADX WARN: Type inference failed for: r7v13 */
                    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    /* JADX WARN: Type inference failed for: r7v4 */
                    /* JADX WARN: Type inference failed for: r7v5 */
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
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void runTask() throws Throwable {
                        ?? byteArrayOutputStream;
                        InputStream inputStreamUrlConnectionGetInputStream;
                        byte[] byteArray;
                        ?? r10;
                        String message;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        boolean z11;
                        String str2;
                        boolean z12 = false;
                        InputStream inputStream = null;
                        try {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source3 != null) {
                                iOnDownLoadH5Source3.onStart();
                            }
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                            httpsURLConnection.setReadTimeout(30000);
                            httpsURLConnection.setConnectTimeout(20000);
                            int iHttpUrlConnectionGetResponseCode = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection);
                            q0.a(DownLoadUtils.TAG, "response code " + iHttpUrlConnectionGetResponseCode);
                            if (iHttpUrlConnectionGetResponseCode == 200) {
                                inputStreamUrlConnectionGetInputStream = MintegralNetworkBridge.urlConnectionGetInputStream(httpsURLConnection);
                                try {
                                    byte[] bArr = new byte[6144];
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        try {
                                            try {
                                                int i10 = inputStreamUrlConnectionGetInputStream.read(bArr);
                                                if (i10 == -1) {
                                                    break;
                                                } else {
                                                    byteArrayOutputStream.write(bArr, 0, i10);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (inputStreamUrlConnectionGetInputStream != null) {
                                                    try {
                                                        inputStreamUrlConnectionGetInputStream.close();
                                                        if (byteArrayOutputStream != 0) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                    } catch (Exception e10) {
                                                        e10.printStackTrace();
                                                        e10.getMessage();
                                                        throw th;
                                                    }
                                                } else if (byteArrayOutputStream != 0) {
                                                    byteArrayOutputStream.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            byteArray = null;
                                        }
                                    }
                                    if (byteArrayOutputStream.toByteArray() != null) {
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        try {
                                            str2 = !z10 ? new String(byteArray) : null;
                                        } catch (Exception e12) {
                                            e = e12;
                                            r10 = 0;
                                            message = e.getMessage();
                                            q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                            if (inputStreamUrlConnectionGetInputStream != null) {
                                                try {
                                                    inputStreamUrlConnectionGetInputStream.close();
                                                    if (byteArrayOutputStream != 0) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                } catch (Exception e13) {
                                                    e13.printStackTrace();
                                                    message = e13.getMessage();
                                                }
                                            } else if (byteArrayOutputStream != 0) {
                                                byteArrayOutputStream.close();
                                            }
                                            if (z12) {
                                                try {
                                                    if (!z10) {
                                                        if (z12) {
                                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source2 != null) {
                                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                            }
                                                        } else {
                                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source2 != null) {
                                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                            }
                                                        }
                                                    } else if (z12) {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    } else {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        th3.printStackTrace();
                                                    }
                                                    H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source4 != null) {
                                                        try {
                                                            iOnDownLoadH5Source4.onFailed(th3.getMessage());
                                                            return;
                                                        } catch (Exception e14) {
                                                            e14.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                            } else if (z12) {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            } else {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            }
                                        }
                                    } else {
                                        byteArray = null;
                                        str2 = null;
                                    }
                                    z11 = true;
                                    message = "";
                                    byteArrayOutputStream = byteArrayOutputStream;
                                    r10 = str2;
                                } catch (Exception e15) {
                                    e = e15;
                                    byteArray = null;
                                    byteArrayOutputStream = byteArray;
                                    r10 = byteArrayOutputStream;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStreamUrlConnectionGetInputStream != null) {
                                        inputStreamUrlConnectionGetInputStream.close();
                                        if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                    } else if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                    if (z12) {
                                        if (!z10) {
                                            if (z12) {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            } else {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            }
                                        } else if (z12) {
                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                            if (iOnDownLoadH5Source2 != null) {
                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                            }
                                        } else {
                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                            if (iOnDownLoadH5Source2 != null) {
                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                            }
                                        }
                                    } else if (z12) {
                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                        if (iOnDownLoadH5Source2 != null) {
                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                        }
                                    } else {
                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                        if (iOnDownLoadH5Source2 != null) {
                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    byteArrayOutputStream = 0;
                                    inputStream = inputStreamUrlConnectionGetInputStream;
                                    byteArrayOutputStream = byteArrayOutputStream;
                                    inputStreamUrlConnectionGetInputStream = inputStream;
                                    if (inputStreamUrlConnectionGetInputStream != null) {
                                        inputStreamUrlConnectionGetInputStream.close();
                                        if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                    } else if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                    throw th;
                                }
                            } else {
                                message = "responseCode is " + iHttpUrlConnectionGetResponseCode;
                                z11 = false;
                                inputStreamUrlConnectionGetInputStream = null;
                                byteArray = null;
                                byteArrayOutputStream = 0;
                                r10 = 0;
                            }
                            try {
                                try {
                                    MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
                                    if (inputStreamUrlConnectionGetInputStream != null) {
                                        try {
                                            inputStreamUrlConnectionGetInputStream.close();
                                        } catch (Exception e16) {
                                            e16.printStackTrace();
                                            message = e16.getMessage();
                                        }
                                    }
                                    if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                    z12 = z11;
                                } catch (Exception e17) {
                                    e = e17;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStreamUrlConnectionGetInputStream != null) {
                                        inputStreamUrlConnectionGetInputStream.close();
                                        if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                    } else if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream = inputStreamUrlConnectionGetInputStream;
                                byteArrayOutputStream = byteArrayOutputStream;
                                inputStreamUrlConnectionGetInputStream = inputStream;
                                if (inputStreamUrlConnectionGetInputStream != null) {
                                    inputStreamUrlConnectionGetInputStream.close();
                                    if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                } else if (byteArrayOutputStream != 0) {
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            inputStreamUrlConnectionGetInputStream = null;
                            byteArray = null;
                        } catch (Throwable th6) {
                            th = th6;
                            byteArrayOutputStream = 0;
                            inputStreamUrlConnectionGetInputStream = inputStream;
                            if (inputStreamUrlConnectionGetInputStream != null) {
                                inputStreamUrlConnectionGetInputStream.close();
                                if (byteArrayOutputStream != 0) {
                                    byteArrayOutputStream.close();
                                }
                            } else if (byteArrayOutputStream != 0) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                        if (z12) {
                            if (!z10 && byteArray != null && byteArray.length > 0) {
                                iOnDownLoadH5Source.onSuccess(null, byteArray, str);
                            } else if (z12 || !a1.b(r10) || r10.length() <= 0 || !r10.contains(DownLoadUtils.END_TAG)) {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            } else {
                                ?? r11 = iOnDownLoadH5Source;
                                if (r11 != 0) {
                                    r11.onSuccess(r10, byteArray, str);
                                }
                            }
                        } else if (z12) {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        }
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
