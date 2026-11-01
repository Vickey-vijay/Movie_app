package io.bidmachine.util.network;

import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import bk.l;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.events.RedirectEvent;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.network.NetworkRequest;
import io.bidmachine.util.taskmanager.CancelableTask;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mj.r;
import nk.j2;
import nk.k0;
import nk.w0;

/* JADX INFO: compiled from: NetworkRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u0000 c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005dcefgB¡\u0001\u0012\u0006\u0010\n\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020&\u0012\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0+\u0012\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0+\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010H\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a¢\u0006\u0004\ba\u0010bJ'\u0010\u0007\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001a\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J-\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u0012\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007J\b\u0010\u001f\u001a\u00020\u0005H\u0007J\u0006\u0010 \u001a\u00020\u0013J\u0006\u0010!\u001a\u00020\u0005R\u0017\u0010\n\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0+8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u00108\u001a\u0004\u0018\u0001078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010A\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u0019\u0010D\u001a\u0004\u0018\u00010C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010I\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001f\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010 \u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010SR\u0014\u0010U\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006h"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest;", "ResponseType", "", "Lkotlin/Function1;", "Lio/bidmachine/util/network/NetworkRequest$a;", "Lmj/r;", "action", "sendWithAction", "sendInternal", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "openConnection", "startTimeout", "stopTimeout", "processTimeout", "response", "notifySuccess", "(Ljava/lang/Object;)V", "", "skipCheck", "", "throwable", "notifyError", "Lio/bidmachine/util/network/NetworkError;", "networkError", "Lio/bidmachine/util/network/NetworkRequest$Listener;", "notifyWithAction", "Lio/bidmachine/util/taskmanager/TaskManager;", "taskManager", "send", "sendSync", "isDestroyed", "destroy", "", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lio/bidmachine/util/network/Method;", "method", "Lio/bidmachine/util/network/Method;", "getMethod", "()Lio/bidmachine/util/network/Method;", "", "headers", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "queryParameters", "getQueryParameters", "Lio/bidmachine/util/network/Redirect;", RedirectEvent.f44645b, "Lio/bidmachine/util/network/Redirect;", "getRedirect", "()Lio/bidmachine/util/network/Redirect;", "", "timeoutMs", "Ljava/lang/Long;", "getTimeoutMs", "()Ljava/lang/Long;", "", "connectTimeoutMs", "Ljava/lang/Integer;", "getConnectTimeoutMs", "()Ljava/lang/Integer;", "readTimeoutMs", "getReadTimeoutMs", "Lio/bidmachine/util/network/RequestProcessor;", "requestProcessor", "Lio/bidmachine/util/network/RequestProcessor;", "getRequestProcessor", "()Lio/bidmachine/util/network/RequestProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "responseProcessor", "Lio/bidmachine/util/network/ResponseProcessor;", "getResponseProcessor", "()Lio/bidmachine/util/network/ResponseProcessor;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/util/network/NetworkRequest$Listener;", "getListener", "()Lio/bidmachine/util/network/NetworkRequest$Listener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSend", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isNotified", "isDataReceived", "lastTaskManager", "Lio/bidmachine/util/taskmanager/TaskManager;", "Lio/bidmachine/util/taskmanager/CancelableTask;", "processTask", "Lio/bidmachine/util/taskmanager/CancelableTask;", "timeoutTask", "", "requestData", "[B", "connectionCount", "I", "<init>", "(Ljava/lang/String;Lio/bidmachine/util/network/Method;Ljava/util/Map;Ljava/util/Map;Lio/bidmachine/util/network/Redirect;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lio/bidmachine/util/network/RequestProcessor;Lio/bidmachine/util/network/ResponseProcessor;Lio/bidmachine/util/network/NetworkRequest$Listener;)V", VastTagName.COMPANION, "Builder", "Listener", "a", "b", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class NetworkRequest<ResponseType> {
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final int MAX_CONNECTION_COUNT = 20;
    private final Integer connectTimeoutMs;
    private int connectionCount;
    private final Map<String, String> headers;
    private final AtomicBoolean isDataReceived;
    private final AtomicBoolean isDestroyed;
    private final AtomicBoolean isNotified;
    private final AtomicBoolean isSend;
    private TaskManager lastTaskManager;
    private final Listener<ResponseType> listener;
    private final Method method;
    private CancelableTask processTask;
    private final Map<String, String> queryParameters;
    private final Integer readTimeoutMs;
    private final Redirect redirect;
    private byte[] requestData;
    private final RequestProcessor requestProcessor;
    private final ResponseProcessor<ResponseType> responseProcessor;
    private final Long timeoutMs;
    private CancelableTask timeoutTask;
    private final String url;
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();
    private static final TaskManager TIME_OUT_TASK_MANAGER = new CoroutineTaskManager(new k0("NetworkTimeOutTaskManager").plus(j2.b(null, 1, null)).plus(w0.b()));

    /* JADX INFO: compiled from: NetworkRequest.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001fJ\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\"H\u0007J\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001fJ\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010%J\"\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010'J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000eJ\"\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010'J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010%J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0016J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u00102\u001a\u0004\u0018\u00010\u0004R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$Builder;", "ResponseType", "", "url", "", "method", "Lio/bidmachine/util/network/Method;", "(Ljava/lang/String;Lio/bidmachine/util/network/Method;)V", "connectTimeoutMs", "", "Ljava/lang/Integer;", "headers", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/util/network/NetworkRequest$Listener;", "queryParameters", "readTimeoutMs", RedirectEvent.f44645b, "Lio/bidmachine/util/network/Redirect;", "requestProcessor", "Lio/bidmachine/util/network/RequestProcessor;", "responseProcessor", "Lio/bidmachine/util/network/ResponseProcessor;", "timeoutMs", "", "Ljava/lang/Long;", "addHeader", C3426d4.i.W, "value", "addQueryParameter", BillingClientBuilderBridgeCommon.buildMethodName, "Lio/bidmachine/util/network/NetworkRequest;", "send", "taskManager", "Lio/bidmachine/util/taskmanager/TaskManager;", "sendSync", "setConnectTimeoutMs", "(Ljava/lang/Integer;)Lio/bidmachine/util/network/NetworkRequest$Builder;", "setHeaders", "", "setListener", "setQueryParameters", "parameters", "setReadTimeoutMs", "setRedirect", "setRequestProcessor", "setResponseProcessor", "setTimeoutMs", "(Ljava/lang/Long;)Lio/bidmachine/util/network/NetworkRequest$Builder;", "setUserAgentHeader", "userAgent", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder<ResponseType> {
        private Integer connectTimeoutMs;
        private final Map<String, String> headers;
        private Listener<ResponseType> listener;
        private final Method method;
        private final Map<String, String> queryParameters;
        private Integer readTimeoutMs;
        private Redirect redirect;
        private RequestProcessor requestProcessor;
        private ResponseProcessor<ResponseType> responseProcessor;
        private Long timeoutMs;
        private final String url;

        public final NetworkRequest<ResponseType> send() {
            return send$default(this, null, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0010  */
        public final Builder<ResponseType> setUserAgentHeader(String userAgent) {
            boolean z10;
            if (userAgent != null) {
                z10 = userAgent.length() > 0;
            }
            if (z10) {
                addHeader("User-Agent", userAgent);
            }
            return this;
        }

        public Builder(String str, Method method) {
            p.j(str, "url");
            p.j(method, "method");
            this.url = str;
            this.method = method;
            this.headers = new HashMap();
            this.queryParameters = new HashMap();
            this.redirect = Redirect.Manual;
        }

        public static /* synthetic */ NetworkRequest send$default(Builder builder, TaskManager taskManager, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                taskManager = NetworkRequest.TASK_MANAGER;
            }
            return builder.send(taskManager);
        }

        public final Builder<ResponseType> addHeader(String key, String value) {
            p.j(key, C3426d4.i.W);
            p.j(value, "value");
            this.headers.put(key, value);
            return this;
        }

        public final Builder<ResponseType> addQueryParameter(String key, String value) {
            p.j(key, C3426d4.i.W);
            p.j(value, "value");
            this.queryParameters.put(key, value);
            return this;
        }

        public final NetworkRequest<ResponseType> build() {
            return new NetworkRequest<>(this.url, this.method, this.headers, this.queryParameters, this.redirect, this.timeoutMs, this.connectTimeoutMs, this.readTimeoutMs, this.requestProcessor, this.responseProcessor, this.listener);
        }

        public final NetworkRequest<ResponseType> send(TaskManager taskManager) {
            p.j(taskManager, "taskManager");
            NetworkRequest<ResponseType> networkRequestBuild = build();
            networkRequestBuild.send(taskManager);
            return networkRequestBuild;
        }

        public final Builder<ResponseType> setConnectTimeoutMs(Integer connectTimeoutMs) {
            this.connectTimeoutMs = connectTimeoutMs;
            return this;
        }

        public final Builder<ResponseType> setHeaders(Map<String, String> headers) {
            UtilsKt.setSafely(this.headers, headers);
            return this;
        }

        public final Builder<ResponseType> setListener(Listener<ResponseType> listener) {
            this.listener = listener;
            return this;
        }

        public final Builder<ResponseType> setQueryParameters(Map<String, String> parameters) {
            UtilsKt.setSafely(this.queryParameters, parameters);
            return this;
        }

        public final Builder<ResponseType> setReadTimeoutMs(Integer readTimeoutMs) {
            this.readTimeoutMs = readTimeoutMs;
            return this;
        }

        public final Builder<ResponseType> setRedirect(Redirect redirect) {
            p.j(redirect, RedirectEvent.f44645b);
            this.redirect = redirect;
            return this;
        }

        public final Builder<ResponseType> setRequestProcessor(RequestProcessor requestProcessor) {
            this.requestProcessor = requestProcessor;
            return this;
        }

        public final Builder<ResponseType> setResponseProcessor(ResponseProcessor<ResponseType> responseProcessor) {
            this.responseProcessor = responseProcessor;
            return this;
        }

        public final Builder<ResponseType> setTimeoutMs(Long timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }

        public final NetworkRequest<ResponseType> sendSync() {
            NetworkRequest<ResponseType> networkRequestBuild = build();
            networkRequestBuild.sendSync();
            return networkRequestBuild;
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$Listener;", "ResponseType", "", "response", "Lmj/r;", "onSuccess", "(Ljava/lang/Object;)V", "Lio/bidmachine/util/network/NetworkError;", "networkError", "onError", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
    public interface Listener<ResponseType> {
        void onError(NetworkError networkError);

        void onSuccess(ResponseType response);
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$a;", "Lio/bidmachine/util/taskmanager/CancelableTask;", "Lmj/r;", "runTask", "<init>", "(Lio/bidmachine/util/network/NetworkRequest;)V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
    public final class a extends CancelableTask {
        public a() {
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.sendInternal();
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$b;", "Lio/bidmachine/util/taskmanager/CancelableTask;", "Lmj/r;", "runTask", "<init>", "(Lio/bidmachine/util/network/NetworkRequest;)V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
    public final class b extends CancelableTask {
        public b() {
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.processTimeout();
        }
    }

    public NetworkRequest(String str, Method method, Map<String, String> map, Map<String, String> map2, Redirect redirect, Long l10, Integer num, Integer num2, RequestProcessor requestProcessor, ResponseProcessor<ResponseType> responseProcessor, Listener<ResponseType> listener) {
        p.j(str, "url");
        p.j(method, "method");
        p.j(map, "headers");
        p.j(map2, "queryParameters");
        p.j(redirect, RedirectEvent.f44645b);
        this.url = str;
        this.method = method;
        this.headers = map;
        this.queryParameters = map2;
        this.redirect = redirect;
        this.timeoutMs = l10;
        this.connectTimeoutMs = num;
        this.readTimeoutMs = num2;
        this.requestProcessor = requestProcessor;
        this.responseProcessor = responseProcessor;
        this.listener = listener;
        this.isSend = new AtomicBoolean(false);
        this.isNotified = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.isDataReceived = new AtomicBoolean(false);
    }

    private final void notifyError(boolean z10, Throwable th2) {
        notifyError(z10, new NetworkError(th2));
    }

    public static /* synthetic */ void notifyError$default(NetworkRequest networkRequest, boolean z10, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        networkRequest.notifyError(z10, th2);
    }

    public static /* synthetic */ void notifyWithAction$default(NetworkRequest networkRequest, boolean z10, l lVar, int i10, Object obj) {
        Listener<ResponseType> listener;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if (networkRequest.isNotified.compareAndSet(false, true) || z10) {
            if ((!networkRequest.isDestroyed() || z10) && (listener = networkRequest.getListener()) != null) {
                lVar.invoke(listener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInternal() {
        HttpURLConnection httpURLConnectionOpenConnection;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionOpenConnection = openConnection(new URL(NetworkUtils.appendQueryParameters(this.url, this.queryParameters)));
            try {
                if (isDestroyed()) {
                    NetworkUtilsKt.disconnectSafely(httpURLConnectionOpenConnection);
                    return;
                }
                int responseCode = httpURLConnectionOpenConnection.getResponseCode();
                if (isDestroyed()) {
                    NetworkUtilsKt.disconnectSafely(httpURLConnectionOpenConnection);
                    return;
                }
                if (responseCode == 200) {
                    ResponseProcessor<ResponseType> responseProcessor = this.responseProcessor;
                    notifySuccess(responseProcessor != null ? responseProcessor.process(httpURLConnectionOpenConnection) : null);
                } else if (responseCode != 204) {
                    notifyError$default((NetworkRequest) this, false, (Throwable) new IllegalResponseException(responseCode), 1, (Object) null);
                } else {
                    notifySuccess(null);
                }
            } catch (RequestInDestroyedStateException unused) {
                httpURLConnection = httpURLConnectionOpenConnection;
                NetworkUtilsKt.disconnectSafely(httpURLConnection);
            } catch (Throwable th2) {
                th = th2;
                try {
                    notifyError$default((NetworkRequest) this, false, th, 1, (Object) null);
                } finally {
                    NetworkUtilsKt.disconnectSafely(httpURLConnectionOpenConnection);
                }
            }
        } catch (RequestInDestroyedStateException unused2) {
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionOpenConnection = null;
        }
    }

    @AnyThread
    public final void send() {
        send$default(this, null, 1, null);
    }

    private final void notifyError(boolean z10, NetworkError networkError) {
        Listener<ResponseType> listener;
        if (this.isNotified.compareAndSet(false, true) || z10) {
            if ((!isDestroyed() || z10) && (listener = getListener()) != null) {
                listener.onError(networkError);
            }
        }
    }

    public static /* synthetic */ void notifyError$default(NetworkRequest networkRequest, boolean z10, NetworkError networkError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        networkRequest.notifyError(z10, networkError);
    }

    private final HttpURLConnection openConnection(URL url) throws Throwable {
        boolean z10 = true;
        int i10 = this.connectionCount + 1;
        this.connectionCount = i10;
        if (i10 > 20) {
            throw new IllegalStateException("The maximum number of connections for one request has been reached");
        }
        if (isDestroyed()) {
            throw new RequestInDestroyedStateException();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            p.h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection2.setInstanceFollowRedirects(this.redirect == Redirect.Native);
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setUseCaches(false);
            httpURLConnection2.setAllowUserInteraction(false);
            try {
                RequestProcessor requestProcessor = this.requestProcessor;
                if (requestProcessor != null) {
                    requestProcessor.setupConnection(httpURLConnection2);
                }
                httpURLConnection2.setRequestMethod(this.method.getNetworkName());
                for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                }
                Integer num = this.connectTimeoutMs;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.connectTimeoutMs.intValue());
                }
                Integer num2 = this.readTimeoutMs;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.readTimeoutMs.intValue());
                }
                if (this.isDataReceived.compareAndSet(false, true)) {
                    RequestProcessor requestProcessor2 = this.requestProcessor;
                    this.requestData = requestProcessor2 != null ? requestProcessor2.getBody() : null;
                }
                byte[] bArr = this.requestData;
                if (bArr != null) {
                    httpURLConnection2.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    p.i(outputStream, "httpURLConnection.outputStream");
                    BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                    try {
                        bufferedOutputStream.write(bArr);
                        r rVar = r.f64562a;
                        yj.b.a(bufferedOutputStream, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yj.b.a(bufferedOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                if (isDestroyed()) {
                    throw new RequestInDestroyedStateException();
                }
                if (this.redirect == Redirect.Manual) {
                    int responseCode = httpURLConnection2.getResponseCode();
                    switch (responseCode) {
                        case 301:
                        case 302:
                        case 303:
                        case 305:
                        case 307:
                        case 308:
                            String headerField = httpURLConnection2.getHeaderField("Location");
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            if (headerField != null && headerField.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                throw new IllegalArgumentException("Location header url could not be null or empty when server responds with " + responseCode + " code");
                            }
                            URL url2 = new URL(url, headerField);
                            if (NetworkUtilsKt.isHttp(url2)) {
                                return openConnection(url2);
                            }
                            throw new IllegalArgumentException("Location header url is not http or https, but has " + url2.getProtocol() + " protocol");
                        case 304:
                        case 306:
                        default:
                            break;
                    }
                }
                return httpURLConnection2;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                NetworkUtilsKt.disconnectSafely(httpURLConnection);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processTimeout$lambda$9(NetworkRequest networkRequest) {
        p.j(networkRequest, "this$0");
        networkRequest.notifyError(true, new NetworkError(new TimeoutException("NetworkRequest timeout reached")));
    }

    public static /* synthetic */ void send$default(NetworkRequest networkRequest, TaskManager taskManager, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            taskManager = TASK_MANAGER;
        }
        networkRequest.send(taskManager);
    }

    private final void stopTimeout() {
        CancelableTask cancelableTask = this.timeoutTask;
        if (cancelableTask != null) {
            TIME_OUT_TASK_MANAGER.cancel(cancelableTask);
        }
        this.timeoutTask = null;
    }

    public final void destroy() {
        TaskManager taskManager;
        this.isDestroyed.set(true);
        stopTimeout();
        CancelableTask cancelableTask = this.processTask;
        if (cancelableTask != null && (taskManager = this.lastTaskManager) != null) {
            taskManager.cancel(cancelableTask);
        }
        this.lastTaskManager = null;
        this.processTask = null;
        this.requestData = null;
    }

    public final Integer getConnectTimeoutMs() {
        return this.connectTimeoutMs;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final Listener<ResponseType> getListener() {
        return this.listener;
    }

    public final Method getMethod() {
        return this.method;
    }

    public final Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    public final Integer getReadTimeoutMs() {
        return this.readTimeoutMs;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    public final RequestProcessor getRequestProcessor() {
        return this.requestProcessor;
    }

    public final ResponseProcessor<ResponseType> getResponseProcessor() {
        return this.responseProcessor;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    @AnyThread
    public final void send(TaskManager taskManager) {
        p.j(taskManager, "taskManager");
        if (isDestroyed()) {
            notifyError(true, (Throwable) new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"));
            return;
        }
        if (this.isSend.compareAndSet(false, true)) {
            startTimeout();
            try {
                a aVar = new a();
                taskManager.execute(aVar);
                this.lastTaskManager = taskManager;
                this.processTask = aVar;
            } catch (Throwable th2) {
                notifyError$default((NetworkRequest) this, false, th2, 1, (Object) null);
            }
        }
    }

    private final void notifySuccess(ResponseType response) {
        Listener<ResponseType> listener;
        if (this.isNotified.compareAndSet(false, true) && !isDestroyed() && (listener = getListener()) != null) {
            listener.onSuccess(response);
        }
    }

    private final void notifyWithAction(boolean z10, l<? super Listener<ResponseType>, r> lVar) {
        Listener<ResponseType> listener;
        if (!this.isNotified.compareAndSet(false, true) && !z10) {
            return;
        }
        if ((!isDestroyed() || z10) && (listener = getListener()) != null) {
            lVar.invoke(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processTimeout() {
        if (isDestroyed()) {
            return;
        }
        destroy();
        TaskManager taskManager = this.lastTaskManager;
        if (taskManager == null) {
            taskManager = TASK_MANAGER;
        }
        taskManager.executeSafely(new Runnable() { // from class: hi.a
            @Override // java.lang.Runnable
            public final void run() {
                NetworkRequest.processTimeout$lambda$9(this.f53914b);
            }
        });
    }

    private final void sendWithAction(l<? super NetworkRequest<ResponseType>.a, r> lVar) {
        if (isDestroyed()) {
            notifyError(true, (Throwable) new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"));
            return;
        }
        if (!this.isSend.compareAndSet(false, true)) {
            return;
        }
        startTimeout();
        try {
            a aVar = new a();
            lVar.invoke(aVar);
            this.processTask = aVar;
        } catch (Throwable th2) {
            notifyError$default((NetworkRequest) this, false, th2, 1, (Object) null);
        }
    }

    private final void startTimeout() {
        stopTimeout();
        Long l10 = this.timeoutMs;
        if (l10 != null && l10.longValue() > 0) {
            try {
                b bVar = new b();
                TIME_OUT_TASK_MANAGER.scheduleSafely(bVar, this.timeoutMs.longValue());
                this.timeoutTask = bVar;
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
    }

    @WorkerThread
    public final void sendSync() {
        if (isDestroyed()) {
            notifyError(true, (Throwable) new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"));
            return;
        }
        if (this.isSend.compareAndSet(false, true)) {
            startTimeout();
            try {
                a aVar = new a();
                aVar.run();
                this.processTask = aVar;
            } catch (Throwable th2) {
                notifyError$default((NetworkRequest) this, false, th2, 1, (Object) null);
            }
        }
    }

    public /* synthetic */ NetworkRequest(String str, Method method, Map map, Map map2, Redirect redirect, Long l10, Integer num, Integer num2, RequestProcessor requestProcessor, ResponseProcessor responseProcessor, Listener listener, int i10, i iVar) {
        this(str, method, (i10 & 4) != 0 ? new HashMap() : map, (i10 & 8) != 0 ? new HashMap() : map2, (i10 & 16) != 0 ? Redirect.Manual : redirect, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : requestProcessor, (i10 & 512) != 0 ? null : responseProcessor, (i10 & 1024) != 0 ? null : listener);
    }
}
