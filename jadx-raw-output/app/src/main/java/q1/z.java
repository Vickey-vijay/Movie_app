package q1;

import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.timepicker.TimeModel;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: GraphResponse.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 /2\u00020\u0001:\u0001\u0007BC\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b)\u0010*B-\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010+B+\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0019¢\u0006\u0004\b)\u0010-B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b)\u0010.J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\r\u0010 R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u0016\u0010#R\u0019\u0010(\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u00060"}, d2 = {"Lq1/z;", "", "Lorg/json/JSONObject;", "c", "", "toString", "Lcom/facebook/GraphRequest;", "a", "Lcom/facebook/GraphRequest;", "getRequest", "()Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "Ljava/net/HttpURLConnection;", "b", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "connection", "Ljava/lang/String;", "getRawResponse", "()Ljava/lang/String;", "rawResponse", "d", "Lorg/json/JSONObject;", "graphObject", "Lorg/json/JSONArray;", "e", "Lorg/json/JSONArray;", "graphObjectArray", "Lcom/facebook/FacebookRequestError;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/FacebookRequestError;", "()Lcom/facebook/FacebookRequestError;", "error", "g", "()Lorg/json/JSONObject;", "jsonObject", "h", "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "<init>", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "graphObjects", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "i", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class z {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f66385j = z.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final GraphRequest request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String rawResponse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final JSONObject graphObject;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final JSONArray graphObjectArray;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final FacebookRequestError error;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final JSONObject jsonObject;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final JSONArray jsonArray;

    /* JADX INFO: renamed from: q1.z$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: GraphResponse.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0016\u001a\u00020\u0001H\u0002J*\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0002R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001c¨\u0006$"}, d2 = {"Lq1/z$a;", "", "Ljava/net/HttpURLConnection;", "connection", "Lq1/y;", "requests", "", "Lq1/z;", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/net/HttpURLConnection;Lq1/y;)Ljava/util/List;", "Ljava/io/InputStream;", "stream", "d", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lq1/y;)Ljava/util/List;", "", "responseString", "e", "(Ljava/lang/String;Ljava/net/HttpURLConnection;Lq1/y;)Ljava/util/List;", "Lcom/facebook/GraphRequest;", "Lcom/facebook/FacebookException;", "error", "a", "sourceObject", "c", AdActivity.REQUEST_KEY_EXTRA, "originalResult", "b", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final List<z> a(List<GraphRequest> requests, HttpURLConnection connection, FacebookException error) {
            ck.p.j(requests, "requests");
            ArrayList arrayList = new ArrayList(nj.t.v(requests, 10));
            Iterator<T> it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new z((GraphRequest) it.next(), connection, new FacebookRequestError(connection, error)));
            }
            return arrayList;
        }

        public final z b(GraphRequest request, HttpURLConnection connection, Object sourceObject, Object originalResult) throws JSONException {
            if (sourceObject instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) sourceObject;
                FacebookRequestError facebookRequestErrorA = FacebookRequestError.INSTANCE.a(jSONObject, originalResult, connection);
                if (facebookRequestErrorA != null) {
                    Log.e(z.f66385j, facebookRequestErrorA.toString());
                    if (facebookRequestErrorA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE java.lang.String() == 190) {
                        com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                        if (com.facebook.internal.j0.T(request.getAccessToken())) {
                            if (facebookRequestErrorA.getSubErrorCode() != 493) {
                                AccessToken.INSTANCE.h(null);
                            } else {
                                AccessToken.Companion companion = AccessToken.INSTANCE;
                                AccessToken accessTokenE = companion.e();
                                if (ck.p.e(accessTokenE != null ? Boolean.valueOf(accessTokenE.n()) : null, Boolean.FALSE)) {
                                    companion.d();
                                }
                            }
                        }
                    }
                    return new z(request, connection, facebookRequestErrorA);
                }
                Object objK = com.facebook.internal.j0.K(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objK instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objK;
                    return new z(request, connection, jSONObject2.toString(), jSONObject2);
                }
                if (objK instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objK;
                    return new z(request, connection, jSONArray.toString(), jSONArray);
                }
                sourceObject = JSONObject.NULL;
                ck.p.i(sourceObject, "NULL");
            }
            if (sourceObject == JSONObject.NULL) {
                return new z(request, connection, sourceObject.toString(), (JSONObject) null);
            }
            throw new FacebookException(ck.p.s("Got unexpected object type in response, class: ", sourceObject.getClass().getSimpleName()));
        }

        public final List<z> d(InputStream stream, HttpURLConnection connection, y requests) throws Throwable {
            ck.p.j(requests, "requests");
            String strN0 = com.facebook.internal.j0.n0(stream);
            com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strN0.length()), strN0);
            return e(strN0, connection, requests);
        }

        public final List<z> e(String responseString, HttpURLConnection connection, y requests) throws JSONException, FacebookException, IOException {
            ck.p.j(responseString, "responseString");
            ck.p.j(requests, "requests");
            Object objNextValue = new JSONTokener(responseString).nextValue();
            ck.p.i(objNextValue, "resultObject");
            List<z> listC = c(connection, requests, objNextValue);
            com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), Integer.valueOf(responseString.length()), listC);
            return listC;
        }

        public final List<z> f(HttpURLConnection connection, y requests) {
            List<z> listA;
            ck.p.j(connection, "connection");
            ck.p.j(requests, "requests");
            InputStream errorStream = null;
            try {
                try {
                    if (!t.E()) {
                        Log.e(z.f66385j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    listA = d(errorStream, connection, requests);
                    com.facebook.internal.j0.j(errorStream);
                    return listA;
                } catch (FacebookException e10) {
                    com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e10);
                    listA = a(requests, connection, e10);
                } catch (Exception e11) {
                    com.facebook.internal.a0.INSTANCE.c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e11);
                    listA = a(requests, connection, new FacebookException(e11));
                }
            } catch (Throwable th2) {
                com.facebook.internal.j0.j(null);
                throw th2;
            }
        }

        public final List<z> c(HttpURLConnection connection, List<GraphRequest> requests, Object sourceObject) throws JSONException, FacebookException {
            Object obj;
            int responseCode;
            int size = requests.size();
            ArrayList arrayList = new ArrayList(size);
            int i10 = 0;
            if (size == 1) {
                GraphRequest graphRequest = requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", sourceObject);
                    if (connection == null) {
                        responseCode = 200;
                    } else {
                        responseCode = connection.getResponseCode();
                    }
                    jSONObject.put("code", responseCode);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new z(graphRequest, connection, new FacebookRequestError(connection, e10)));
                    obj = sourceObject;
                } catch (JSONException e11) {
                    arrayList.add(new z(graphRequest, connection, new FacebookRequestError(connection, e11)));
                    obj = sourceObject;
                }
            } else {
                obj = sourceObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    if (length > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            GraphRequest graphRequest2 = requests.get(i10);
                            try {
                                Object obj2 = ((JSONArray) obj).get(i10);
                                ck.p.i(obj2, IconCompat.EXTRA_OBJ);
                                arrayList.add(b(graphRequest2, connection, obj2, sourceObject));
                            } catch (FacebookException e12) {
                                arrayList.add(new z(graphRequest2, connection, new FacebookRequestError(connection, e12)));
                            } catch (JSONException e13) {
                                arrayList.add(new z(graphRequest2, connection, new FacebookRequestError(connection, e13)));
                            }
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }
    }

    public z(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        ck.p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
        this.request = graphRequest;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FacebookRequestError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public String toString() {
        String str;
        try {
            ck.w wVar = ck.w.f6066a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.connection;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(objArr, 1));
            ck.p.i(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
        ck.p.i(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        ck.p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        ck.p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(str, "rawResponse");
        ck.p.j(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        ck.p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(facebookRequestError, "error");
    }
}
