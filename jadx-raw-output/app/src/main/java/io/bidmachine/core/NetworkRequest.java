package io.bidmachine.core;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> {

    @NonNull
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();

    @Nullable
    private Callback<RequestResultType, ErrorResultType> callback;

    @Nullable
    private CancelCallback cancelCallback;

    @Nullable
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> contentEncoders;

    @Nullable
    private URLConnection currentConnection;
    private State currentState = State.Idle;

    @Nullable
    private RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> dataBinder;

    @Nullable
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> dataEncoders;

    @Nullable
    private ErrorResultType errorResult;

    @NonNull
    private final Method method;

    @Nullable
    private final String path;

    @Nullable
    private final RequestDataType requestData;

    @Nullable
    private RequestResultType requestResult;

    public static class Base64RequestDataEncoder extends RequestDataEncoder {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        public byte[] decode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.decode(bArr, 0);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        public byte[] encode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.encode(bArr, 0);
        }
    }

    public interface Callback<RequestResultType, ErrorResultType> {
        void onFail(@Nullable ErrorResultType errorresulttype);

        void onSuccess(@Nullable RequestResultType requestresulttype);
    }

    public interface CancelCallback {
        void onCanceled();
    }

    public static class GZIPRequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> extends RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        public byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        Utils.close(gZIPOutputStream);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        Utils.flush(byteArrayOutputStream2);
                        Utils.close(byteArrayOutputStream2);
                        Utils.flush(null);
                        Utils.close(null);
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        Utils.flush(byteArrayOutputStream);
                        Utils.close(byteArrayOutputStream);
                        Utils.flush(gZIPOutputStream);
                        Utils.close(gZIPOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        public void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        public byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPInputStream gZIPInputStream;
            ByteArrayInputStream byteArrayInputStream;
            Throwable th2;
            ByteArrayOutputStream byteArrayOutputStream;
            if ("gzip".equals(uRLConnection.getContentEncoding())) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i10 = gZIPInputStream.read(bArr2);
                                    if (i10 != -1) {
                                        byteArrayOutputStream.write(bArr2, 0, i10);
                                    } else {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        Utils.flush(byteArrayOutputStream);
                                        Utils.close(byteArrayOutputStream);
                                        Utils.close(byteArrayInputStream);
                                        Utils.close(gZIPInputStream);
                                        return byteArray;
                                    }
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                Utils.flush(byteArrayOutputStream);
                                Utils.close(byteArrayOutputStream);
                                Utils.close(byteArrayInputStream);
                                Utils.close(gZIPInputStream);
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            gZIPInputStream = null;
                            th2 = th4;
                        }
                    } catch (Throwable th5) {
                        byteArrayInputStream = null;
                        th2 = th5;
                        gZIPInputStream = null;
                    }
                } catch (Throwable th6) {
                    gZIPInputStream = null;
                    byteArrayInputStream = null;
                    th2 = th6;
                    byteArrayOutputStream = null;
                }
            } else {
                return bArr;
            }
        }
    }

    public enum Method {
        Get("GET"),
        Post("POST");

        private final String methodString;

        public void apply(URLConnection uRLConnection) throws ProtocolException {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setRequestMethod(this.methodString);
            }
        }

        Method(String str) {
            this.methodString = str;
        }
    }

    public static abstract class RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> {
        public ErrorResultType createFailResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        public abstract RequestResultType createSuccessResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        @Nullable
        public abstract byte[] obtainData(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, @Nullable RequestDataType requestdatatype) throws Exception;

        public abstract void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection);

        public void prepareRequest(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    public static abstract class RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        public abstract byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        public abstract byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        public void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    public static class SimpleJsonArrayDataBinder<ErrorResultType> extends b<JSONArray, ErrorResultType> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public JSONArray createSuccessResult(NetworkRequest<JSONObject, JSONArray, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONArray(new String(bArr));
        }
    }

    public static class SimpleJsonObjectDataBinder<ErrorResultType> extends b<JSONObject, ErrorResultType> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public JSONObject createSuccessResult(NetworkRequest<JSONObject, JSONObject, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONObject(new String(bArr));
        }
    }

    public enum State {
        Idle,
        Running,
        Success,
        Fail,
        Canceled
    }

    public static abstract class b<RequestResultType, ErrorResultType> extends RequestDataBinder<JSONObject, RequestResultType, ErrorResultType> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        public byte[] obtainData(NetworkRequest<JSONObject, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, @Nullable JSONObject jSONObject) throws Exception {
            if (jSONObject != null) {
                return jSONObject.toString().getBytes("UTF-8");
            }
            return null;
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public void prepareHeaders(NetworkRequest<JSONObject, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        }
    }

    public final class c implements Runnable {
        private c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            NetworkRequest.this.process();
            if (NetworkRequest.this.callback == null || NetworkRequest.this.isCanceled()) {
                return;
            }
            if (NetworkRequest.this.currentState == State.Success) {
                NetworkRequest.this.callback.onSuccess(NetworkRequest.this.requestResult);
            } else {
                NetworkRequest.this.callback.onFail(NetworkRequest.this.errorResult);
            }
        }
    }

    public String getBaseUrl() throws Exception {
        return "TODO: implement url";
    }

    @NonNull
    public abstract ErrorResultType obtainError(@Nullable URLConnection uRLConnection, int i10);

    @NonNull
    public abstract ErrorResultType obtainError(@Nullable URLConnection uRLConnection, @Nullable Throwable th2);

    public void request() {
        request(TASK_MANAGER);
    }

    private InputStream obtainErrorStream(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    private int obtainResponseCode(URLConnection uRLConnection) throws IOException {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:158)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public void process() {
        URLConnection uRLConnection;
        State state;
        URL url;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder;
        BufferedOutputStream bufferedOutputStream;
        this.currentState = State.Running;
        try {
            if (this.path != null) {
                url = new URL(getBaseUrl() + "/" + this.path);
            } else {
                url = new URL(getBaseUrl());
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            try {
                this.currentConnection = uRLConnectionOpenConnection;
                this.method.apply(uRLConnectionOpenConnection);
                prepareRequestParams(uRLConnectionOpenConnection);
                byte[] bArrObtainRequestData = obtainRequestData(uRLConnectionOpenConnection);
                if (bArrObtainRequestData != null) {
                    byte[] bArrEncodeRequestData = encodeRequestData(uRLConnectionOpenConnection, bArrObtainRequestData);
                    uRLConnectionOpenConnection.setDoOutput(true);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(uRLConnectionOpenConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArrEncodeRequestData);
                            Utils.flush(bufferedOutputStream);
                            Utils.close(bufferedOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            Utils.flush(bufferedOutputStream);
                            Utils.close(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = null;
                    }
                }
                try {
                    int iObtainResponseCode = obtainResponseCode(uRLConnectionOpenConnection);
                    if (isCanceled()) {
                        Utils.flush(null);
                        Utils.close(null);
                        Utils.close(null);
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                        }
                        this.currentConnection = null;
                        if (isCanceled()) {
                            return;
                        }
                        this.currentState = this.errorResult == null ? State.Success : State.Fail;
                        return;
                    }
                    if (iObtainResponseCode != 200) {
                        this.errorResult = obtainError(uRLConnectionOpenConnection, iObtainResponseCode);
                        inputStream2 = null;
                        byteArrayOutputStream2 = null;
                    } else {
                        inputStream2 = uRLConnectionOpenConnection.getInputStream();
                        try {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = inputStream2.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream2.write(bArr, 0, i10);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                if (byteArray != null) {
                                    byteArray = decodeResponseData(uRLConnectionOpenConnection, byteArray);
                                }
                                if (byteArray != null && byteArray.length > 0 && (requestDataBinder = this.dataBinder) != null) {
                                    RequestResultType requestresulttypeCreateSuccessResult = requestDataBinder.createSuccessResult(this, uRLConnectionOpenConnection, byteArray);
                                    this.requestResult = requestresulttypeCreateSuccessResult;
                                    if (requestresulttypeCreateSuccessResult == null) {
                                        this.errorResult = this.dataBinder.createFailResult(this, uRLConnectionOpenConnection, byteArray);
                                    }
                                }
                            } catch (Throwable th4) {
                                inputStream = inputStream2;
                                th = th4;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                Utils.flush(byteArrayOutputStream);
                                Utils.close(byteArrayOutputStream);
                                Utils.close(inputStream);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            byteArrayOutputStream = null;
                            inputStream = inputStream2;
                            th = th5;
                        }
                    }
                    Utils.flush(byteArrayOutputStream2);
                    Utils.close(byteArrayOutputStream2);
                    Utils.close(inputStream2);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (isCanceled()) {
                        return;
                    }
                    if (this.errorResult == null) {
                        state = State.Success;
                    } else {
                        state = State.Fail;
                    }
                    this.currentState = state;
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th7) {
                uRLConnection = uRLConnectionOpenConnection;
                th = th7;
                try {
                    Logger.w(th);
                    this.errorResult = obtainError(uRLConnection, th);
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (isCanceled()) {
                        return;
                    }
                    if (this.errorResult == null) {
                        state = State.Success;
                    }
                    this.currentState = state;
                } catch (Throwable th8) {
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (!isCanceled()) {
                        this.currentState = this.errorResult == null ? State.Success : State.Fail;
                    }
                    throw th8;
                }
            }
        } catch (Throwable th9) {
            th = th9;
            uRLConnection = null;
        }
    }

    public void addContentEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(requestDataEncoder);
    }

    public void addDataEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(requestDataEncoder);
    }

    public void cancel() {
        this.currentState = State.Canceled;
        CancelCallback cancelCallback = this.cancelCallback;
        if (cancelCallback != null) {
            cancelCallback.onCanceled();
        }
    }

    public byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().decode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().decode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    public byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.dataEncoders;
        if (arrayList != null) {
            for (RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder : arrayList) {
                requestDataEncoder.prepareHeaders(this, uRLConnection);
                bArr = requestDataEncoder.encode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            for (RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder2 : arrayList2) {
                requestDataEncoder2.prepareHeaders(this, uRLConnection);
                bArr = requestDataEncoder2.encode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    @NonNull
    public Method getMethod() {
        return this.method;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        return this.currentState == State.Canceled;
    }

    public byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder = this.dataBinder;
        if (requestDataBinder == null) {
            return null;
        }
        requestDataBinder.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    public void request(@NonNull TaskManager taskManager) {
        try {
            taskManager.execute(new c());
        } catch (Throwable th2) {
            Logger.w(th2);
            Callback<RequestResultType, ErrorResultType> callback = this.callback;
            if (callback != null) {
                callback.onFail(obtainError((URLConnection) null, th2));
            }
        }
    }

    public void setCallback(@Nullable Callback<RequestResultType, ErrorResultType> callback) {
        this.callback = callback;
    }

    public void setCancelCallback(@Nullable CancelCallback cancelCallback) {
        this.cancelCallback = cancelCallback;
    }

    public void setDataBinder(@Nullable RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder) {
        this.dataBinder = requestDataBinder;
    }

    public NetworkRequest(@NonNull Method method, @Nullable String str, @Nullable RequestDataType requestdatatype) {
        this.method = method;
        this.path = str;
        this.requestData = requestdatatype;
    }

    public void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }
}
