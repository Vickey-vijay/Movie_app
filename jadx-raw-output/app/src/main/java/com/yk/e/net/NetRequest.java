package com.yk.e.net;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.G5;
import com.ironsource.Y1;
import com.yk.e.util.AES256;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NetRequest {
    public static final String TYPE_UNKNOWN_HOST = "HostException";
    private static String tag = "NetRequest";
    public NetCallBack netCallBack;
    public JSONObject object;
    public String url;
    public String requestMethod = "POST";
    public Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.yk.e.net.NetRequest.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            NetCallBack netCallBack = NetRequest.this.netCallBack;
            if (netCallBack == null) {
                return false;
            }
            netCallBack.execute(message.obj + "");
            return false;
        }
    });

    public interface NetCallBack {
        void execute(String str);
    }

    public NetRequest(String str) {
        this.url = "";
        this.url = str;
    }

    public static String getDataString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return new String(jSONObject.toString().getBytes("UTF-8"));
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return "";
        }
    }

    private String is2String(InputStream inputStream) {
        String strDecode = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, G5.N));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    strDecode = AES256.decode(Constant.AesKey, sb2.toString().trim(), Constant.AesIv.getBytes(G5.N));
                    bufferedReader.close();
                    return strDecode;
                }
                sb2.append(line);
            }
        } catch (Exception | OutOfMemoryError unused) {
            return strDecode;
        }
    }

    private static boolean isWifiProxy() {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = Y1.f27894f;
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    private void showLog(String str) {
        AdLog.i(tag, str);
    }

    public void execute() {
        new Thread(new Runnable() { // from class: com.yk.e.net.NetRequest.2
            @Override // java.lang.Runnable
            public void run() {
                String strPostData = NetRequest.this.requestMethod.equals("POST") ? NetRequest.this.postData(0) : NetRequest.this.getData();
                Message messageObtainMessage = NetRequest.this.handler.obtainMessage();
                messageObtainMessage.obj = strPostData;
                messageObtainMessage.sendToTarget();
            }
        }).start();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    public String getData() throws Throwable {
        HttpURLConnection httpURLConnection;
        Exception e10;
        String strIs2String = "";
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                getDataString(this.object);
                httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestProperty("User-Agent", Constant.userAgent);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        strIs2String = is2String(inputStream);
                        inputStream.close();
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    LogUtil.printException(e10);
                    if (httpURLConnection != null) {
                    }
                    showLog("result = " + strIs2String);
                    return strIs2String;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e12) {
            httpURLConnection = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        httpURLConnection.disconnect();
        showLog("result = " + strIs2String);
        return strIs2String;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00de A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #13 {all -> 0x00bd, blocks: (B:3:0x0010, B:4:0x0016, B:41:0x00c4, B:43:0x00de, B:53:0x00f5, B:55:0x0111), top: B:68:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #13 {all -> 0x00bd, blocks: (B:3:0x0010, B:4:0x0016, B:41:0x00c4, B:43:0x00de, B:53:0x00f5, B:55:0x0111), top: B:68:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    public String postData(int i10) throws Throwable {
        Exception exc;
        int i11;
        int responseCode;
        String dataString = TYPE_UNKNOWN_HOST;
        dataString = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                dataString = getDataString(this.object);
                try {
                    String strEncode = AES256.encode(Constant.AesKey, dataString, Constant.AesIv.getBytes(G5.N));
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.url).openConnection();
                    try {
                        try {
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setReadTimeout(5000);
                            httpURLConnection2.setConnectTimeout(5000);
                            httpURLConnection2.setUseCaches(false);
                            httpURLConnection2.setDoInput(true);
                            httpURLConnection2.setDoOutput(true);
                            OutputStream outputStream = httpURLConnection2.getOutputStream();
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                            bufferedWriter.append((CharSequence) strEncode);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            outputStream.close();
                            responseCode = httpURLConnection2.getResponseCode();
                            try {
                                if (responseCode != 200) {
                                    if (responseCode >= 400) {
                                        AdLog.e(tag, "postData HostException, responseCode = " + responseCode);
                                    }
                                    httpURLConnection2.disconnect();
                                    showLog("url = " + this.url + "\nparams = " + dataString + "\nresponseCode = " + responseCode + "\nresult = " + dataString + "\ncostTime = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                                    return dataString;
                                }
                                InputStream inputStream = httpURLConnection2.getInputStream();
                                dataString = is2String(inputStream);
                                inputStream.close();
                                dataString = dataString;
                                httpURLConnection2.disconnect();
                            } catch (ConnectException e10) {
                                e = e10;
                                i12 = responseCode;
                                dataString = dataString;
                                httpURLConnection = httpURLConnection2;
                                AdLog.e(tag, "postData HostException, msg = " + e.getMessage(), e);
                                if (i10 < 3) {
                                    String strPostData = postData(i10 + 1);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    return strPostData;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                dataString = dataString;
                                responseCode = i12;
                            } catch (UnknownHostException e11) {
                                e = e11;
                                i12 = responseCode;
                                dataString = dataString;
                                httpURLConnection = httpURLConnection2;
                                AdLog.e(tag, "postData HostException, msg = " + e.getMessage(), e);
                                if (i10 < 3) {
                                    String strPostData2 = postData(i10 + 1);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    return strPostData2;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                dataString = dataString;
                                responseCode = i12;
                            } catch (Exception e12) {
                                dataString = "";
                                dataString = dataString;
                                exc = e12;
                                i11 = responseCode;
                                httpURLConnection = httpURLConnection2;
                                AdLog.e(tag, String.format("postData error, url = %s, msg = %s", this.url, exc.getMessage()));
                                if (i10 < 3) {
                                    String strPostData3 = postData(i10 + 1);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    return strPostData3;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                responseCode = i11;
                                dataString = dataString;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (ConnectException e13) {
                        e = e13;
                    } catch (UnknownHostException e14) {
                        e = e14;
                    } catch (Exception e15) {
                        e = e15;
                        httpURLConnection = httpURLConnection2;
                        exc = e;
                        i11 = 0;
                        AdLog.e(tag, String.format("postData error, url = %s, msg = %s", this.url, exc.getMessage()));
                        if (i10 < 3) {
                            String strPostData4 = postData(i10 + 1);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return strPostData4;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        responseCode = i11;
                        dataString = dataString;
                        showLog("url = " + this.url + "\nparams = " + dataString + "\nresponseCode = " + responseCode + "\nresult = " + dataString + "\ncostTime = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                        return dataString;
                    }
                } catch (ConnectException e16) {
                    e = e16;
                    dataString = dataString;
                    AdLog.e(tag, "postData HostException, msg = " + e.getMessage(), e);
                    if (i10 < 3) {
                        String strPostData5 = postData(i10 + 1);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return strPostData5;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    dataString = dataString;
                    responseCode = i12;
                    showLog("url = " + this.url + "\nparams = " + dataString + "\nresponseCode = " + responseCode + "\nresult = " + dataString + "\ncostTime = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                    return dataString;
                } catch (UnknownHostException e17) {
                    e = e17;
                    dataString = dataString;
                    AdLog.e(tag, "postData HostException, msg = " + e.getMessage(), e);
                    if (i10 < 3) {
                        String strPostData6 = postData(i10 + 1);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return strPostData6;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    dataString = dataString;
                    responseCode = i12;
                    showLog("url = " + this.url + "\nparams = " + dataString + "\nresponseCode = " + responseCode + "\nresult = " + dataString + "\ncostTime = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                    return dataString;
                } catch (Exception e18) {
                    e = e18;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (ConnectException e19) {
            e = e19;
        } catch (UnknownHostException e20) {
            e = e20;
        } catch (Exception e21) {
            exc = e21;
            dataString = "";
        }
        showLog("url = " + this.url + "\nparams = " + dataString + "\nresponseCode = " + responseCode + "\nresult = " + dataString + "\ncostTime = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        return dataString;
    }

    public NetRequest(String str, JSONObject jSONObject, NetCallBack netCallBack) {
        this.url = "";
        this.url = str;
        this.object = jSONObject;
        this.netCallBack = netCallBack;
    }
}
