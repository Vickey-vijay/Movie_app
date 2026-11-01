package com.facebook.appevents.cloudbridge;

import ck.p;
import ck.x;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.a0;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.ui.AdActivity;
import ik.i;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import mj.h;
import mj.r;
import nj.b0;
import nj.l0;
import nj.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yj.b;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b9\u0010:J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J=\u0010\u0011\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00062\u001a\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015Ji\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0002R$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000b0 j\b\u0012\u0004\u0012\u00020\u000b`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u000b0 j\b\u0012\u0004\u0012\u00020\u000b`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\"\u0010,\u001a\u00020&8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R4\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e0-8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b(\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0015R\"\u00108\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests;", "", "", "datasetID", "url", "accessKey", "Lmj/r;", "d", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "l", "", "responseCode", "", "", "processedEvents", "maxRetryCount", "g", "(Ljava/lang/Integer;Ljava/util/List;I)V", "events", "c", "(Ljava/util/List;)V", "urlStr", "requestMethod", "jsonBodyStr", "requestProperties", "timeOutInterval", "Lkotlin/Function2;", "requestCallback", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILbk/p;)V", CampaignEx.JSON_KEY_AD_K, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "ACCEPTABLE_HTTP_RESPONSE", "RETRY_EVENTS_HTTP_RESPONSE", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "e", "()Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "i", "(Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;)V", "credentials", "", "Ljava/util/List;", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/util/List;", "j", "transformedEvents", "I", "getCurrentRetryCount$facebook_core_release", "()I", "setCurrentRetryCount$facebook_core_release", "(I)V", "currentRetryCount", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventsConversionsAPITransformerWebRequests {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AppEventsConversionsAPITransformerWebRequests f14192a = new AppEventsConversionsAPITransformerWebRequests();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = q0.g(200, 202);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = q0.g(503, 504, Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static CloudBridgeCredentials credentials;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static List<Map<String, Object>> transformedEvents;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static int currentRetryCount;

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$a, reason: from toString */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "datasetID", "b", "cloudBridgeURL", "accessKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class CloudBridgeCredentials {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String datasetID;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String cloudBridgeURL;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String accessKey;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloudBridgeCredentials)) {
                return false;
            }
            CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) other;
            return p.e(this.datasetID, cloudBridgeCredentials.datasetID) && p.e(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && p.e(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        public int hashCode() {
            return (((this.datasetID.hashCode() * 31) + this.cloudBridgeURL.hashCode()) * 31) + this.accessKey.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.datasetID + ", cloudBridgeURL=" + this.cloudBridgeURL + ", accessKey=" + this.accessKey + ')';
        }

        public CloudBridgeCredentials(String str, String str2, String str3) {
            p.j(str, "datasetID");
            p.j(str2, "cloudBridgeURL");
            p.j(str3, "accessKey");
            this.datasetID = str;
            this.cloudBridgeURL = str2;
            this.accessKey = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessKey() {
            return this.accessKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDatasetID() {
            return this.datasetID;
        }
    }

    public static final void d(String str, String str2, String str3) {
        p.j(str, "datasetID");
        p.j(str2, "url");
        p.j(str3, "accessKey");
        a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = f14192a;
        appEventsConversionsAPITransformerWebRequests.i(new CloudBridgeCredentials(str, str2, str3));
        appEventsConversionsAPITransformerWebRequests.j(new ArrayList());
    }

    public static final void l(final GraphRequest graphRequest) {
        p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
        j0 j0Var = j0.f14425a;
        j0.w0(new Runnable() { // from class: s1.c
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                AppEventsConversionsAPITransformerWebRequests.m(graphRequest);
            }
        });
    }

    public static final void m(GraphRequest graphRequest) throws JSONException {
        p.j(graphRequest, "$request");
        String graphPath = graphRequest.getGraphPath();
        List listN0 = graphPath == null ? null : lk.a0.N0(graphPath, new String[]{"/"}, false, 0, 6, null);
        if (listN0 == null || listN0.size() != 2) {
            a0.INSTANCE.c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = f14192a;
            String str = appEventsConversionsAPITransformerWebRequests.e().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.e().getDatasetID() + "/events";
            List<Map<String, Object>> listK = appEventsConversionsAPITransformerWebRequests.k(graphRequest);
            if (listK == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.c(listK);
            int iMin = Math.min(appEventsConversionsAPITransformerWebRequests.f().size(), 10);
            List listF0 = b0.F0(appEventsConversionsAPITransformerWebRequests.f(), new i(0, iMin - 1));
            appEventsConversionsAPITransformerWebRequests.f().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listF0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.e().getAccessKey());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            a0.Companion companion = a0.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string = jSONObject.toString(2);
            p.i(string, "jsonBodyStr.toString(2)");
            companion.c(loggingBehavior, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, string);
            appEventsConversionsAPITransformerWebRequests.h(str, "POST", jSONObject.toString(), l0.g(h.a("Content-Type", G5.L)), 60000, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(listF0));
        } catch (UninitializedPropertyAccessException e10) {
            a0.INSTANCE.c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List<? extends Map<String, ? extends Object>> events) {
        if (events != null) {
            f().addAll(events);
        }
        int iMax = Math.max(0, f().size() - 1000);
        if (iMax > 0) {
            j(x.c(b0.X(f(), iMax)));
        }
    }

    public final CloudBridgeCredentials e() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        p.B("credentials");
        throw null;
    }

    public final List<Map<String, Object>> f() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        p.B("transformedEvents");
        throw null;
    }

    public final void g(Integer responseCode, List<? extends Map<String, ? extends Object>> processedEvents, int maxRetryCount) {
        p.j(processedEvents, "processedEvents");
        if (b0.U(RETRY_EVENTS_HTTP_RESPONSE, responseCode)) {
            if (currentRetryCount >= maxRetryCount) {
                f().clear();
                currentRetryCount = 0;
            } else {
                f().addAll(0, processedEvents);
                currentRetryCount++;
            }
        }
    }

    public final void h(String urlStr, String requestMethod, String jsonBodyStr, Map<String, String> requestProperties, int timeOutInterval, bk.p<? super String, ? super Integer, r> requestCallback) {
        Set<String> setKeySet;
        p.j(urlStr, "urlStr");
        p.j(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (requestProperties != null && (setKeySet = requestProperties.keySet()) != null) {
                for (String str : setKeySet) {
                    httpURLConnection.setRequestProperty(str, requestProperties.get(str));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(timeOutInterval);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(jsonBodyStr);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            b.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                }
                r rVar = r.f64562a;
                b.a(bufferedReader, null);
            }
            String string = sb2.toString();
            p.i(string, "connResponseSB.toString()");
            a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (requestCallback != null) {
                requestCallback.mo1invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e10) {
            a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e10.toString());
            if (requestCallback != null) {
                requestCallback.mo1invoke(null, 503);
            }
        } catch (IOException e11) {
            a0.INSTANCE.c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void i(CloudBridgeCredentials cloudBridgeCredentials) {
        p.j(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    public final void j(List<Map<String, Object>> list) {
        p.j(list, "<set-?>");
        transformedEvents = list;
    }

    public final List<Map<String, Object>> k(GraphRequest request) {
        JSONObject graphObject = request.getGraphObject();
        if (graphObject != null) {
            Map<String, ? extends Object> mapB = kotlin.collections.a.B(j0.n(graphObject));
            Object tag = request.getTag();
            if (tag != null) {
                mapB.put("custom_events", tag);
                StringBuilder sb2 = new StringBuilder();
                for (String str : mapB.keySet()) {
                    sb2.append(str);
                    sb2.append(" : ");
                    sb2.append(mapB.get(str));
                    sb2.append(System.getProperty("line.separator"));
                }
                a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
                return AppEventsConversionsAPITransformer.f14182a.e(mapB);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        return null;
    }
}
