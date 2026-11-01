package io.bidmachine.rendering.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.ironsource.Z7;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;
import io.bidmachine.util.network.NetworkUtils;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class NetworkRequest<ResponseType> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final TaskManager f60909m = new NetworkTaskManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f60911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f60912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f60913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f60914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f60915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UrlConnectionProcessor f60916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DataRetriever f60917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ResponseProcessor f60918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Listener f60919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TaskManager f60920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CancelableTask f60921l;

    public static class Builder<ResponseType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f60922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f60923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f60924c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f60925d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f60926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f60927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private UrlConnectionProcessor f60928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private DataRetriever f60929h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ResponseProcessor f60930i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Listener f60931j;

        public Builder(@NonNull String str, @NonNull Method method) {
            this.f60922a = str;
            this.f60923b = method;
        }

        public Builder<ResponseType> addHeader(@NonNull String str, @NonNull String str2) {
            this.f60924c.put(str, str2);
            return this;
        }

        public Builder<ResponseType> addQueryParameter(@NonNull String str, @NonNull String str2) {
            this.f60925d.put(str, str2);
            return this;
        }

        @NonNull
        public NetworkRequest<ResponseType> build() {
            return new NetworkRequest<>(this.f60922a, this.f60923b, this.f60924c, this.f60925d, this.f60926e, this.f60927f, this.f60928g, this.f60929h, this.f60930i, this.f60931j);
        }

        @NonNull
        public NetworkRequest<ResponseType> send() {
            NetworkRequest<ResponseType> networkRequestBuild = build();
            networkRequestBuild.send();
            return networkRequestBuild;
        }

        public Builder<ResponseType> setConnectTimeout(@Nullable Integer num) {
            this.f60926e = num;
            return this;
        }

        public Builder<ResponseType> setHeaders(@Nullable Map<String, String> map) {
            Utils.set(this.f60924c, map);
            return this;
        }

        public Builder<ResponseType> setListener(@Nullable Listener<ResponseType> listener) {
            this.f60931j = listener;
            return this;
        }

        public Builder<ResponseType> setQueryParameters(@Nullable Map<String, String> map) {
            Utils.set(this.f60925d, map);
            return this;
        }

        public Builder<ResponseType> setReadTimeout(@Nullable Integer num) {
            this.f60927f = num;
            return this;
        }

        public Builder<ResponseType> setRequestDataRetriever(@Nullable DataRetriever dataRetriever) {
            this.f60929h = dataRetriever;
            return this;
        }

        public Builder<ResponseType> setResponseTransformer(@Nullable ResponseProcessor<ResponseType> responseProcessor) {
            this.f60930i = responseProcessor;
            return this;
        }

        public Builder<ResponseType> setUrlConnectionProcessor(@Nullable UrlConnectionProcessor urlConnectionProcessor) {
            this.f60928g = urlConnectionProcessor;
            return this;
        }

        public Builder<ResponseType> setUserAgent(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                addHeader("User-Agent", str);
            }
            return this;
        }
    }

    public static abstract class ByteArrayProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<byte[], T> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        Utils.write(inputStream2, byteArrayOutputStream);
                        T tTransform = transform(byteArrayOutputStream.toByteArray());
                        io.bidmachine.util.Utils.flushSafely(byteArrayOutputStream);
                        io.bidmachine.util.Utils.closeSafely(byteArrayOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream2);
                        return tTransform;
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        th = th2;
                        io.bidmachine.util.Utils.flushSafely(byteArrayOutputStream);
                        io.bidmachine.util.Utils.closeSafely(byteArrayOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        @Nullable
        public abstract /* synthetic */ Object transform(@NonNull Object obj);
    }

    public interface DataRetriever {
        @Nullable
        @WorkerThread
        byte[] retrieve();
    }

    public static abstract class FileOutputStreamProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<File, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f60932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f60933b;

        public FileOutputStreamProcessor(@NonNull Context context, @NonNull File file) {
            this.f60932a = context.getApplicationContext();
            this.f60933b = file;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) throws Throwable {
            FileOutputStream fileOutputStream;
            File externalDir = io.bidmachine.util.file.FileUtils.getExternalDir(this.f60932a);
            if (externalDir == null) {
                throw new IllegalStateException("Can't get external dir");
            }
            File fileCreateTempFile = io.bidmachine.util.file.FileUtils.createTempFile(externalDir);
            long contentLength = uRLConnection.getContentLength();
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        long jWrite = Utils.write(inputStream2, fileOutputStream);
                        io.bidmachine.util.Utils.flushSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream2);
                        if (contentLength != jWrite) {
                            io.bidmachine.util.file.FileUtils.deleteFile(fileCreateTempFile);
                            throw new IllegalStateException("The downloaded file size does not match the stated size");
                        }
                        if (!io.bidmachine.util.file.FileUtils.renameToSafely(fileCreateTempFile, this.f60933b)) {
                            io.bidmachine.util.file.FileUtils.deleteFile(fileCreateTempFile);
                            if (!io.bidmachine.util.file.FileUtils.hasContent(this.f60933b)) {
                                throw new IllegalStateException("Can't rename temp file");
                            }
                        }
                        return transform(this.f60933b);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        io.bidmachine.util.Utils.flushSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }

        @Nullable
        public abstract /* synthetic */ Object transform(@NonNull Object obj);
    }

    public interface Listener<ResponseType> {
        void onError(@NonNull Error error);

        void onSuccess(@Nullable ResponseType responsetype);
    }

    public enum Method {
        Get("GET"),
        Post("POST");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f60935a;

        Method(String str) {
            this.f60935a = str;
        }

        public String getNetworkName() {
            return this.f60935a;
        }
    }

    public interface ResponseProcessor<ResponseType> {
        @Nullable
        ResponseType process(@NonNull URLConnection uRLConnection);
    }

    public interface ResponseTransformer<From, To> {
        @Nullable
        To transform(@NonNull From from);
    }

    public static class StringProcessor extends ByteArrayProcessor<String> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ByteArrayProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        @Nullable
        public String transform(@NonNull byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public interface UrlConnectionProcessor {
        void process(@NonNull URLConnection uRLConnection);
    }

    public class b extends CancelableTask {
        private b() {
        }

        @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.b();
        }
    }

    public NetworkRequest(@NonNull String str, @NonNull Method method, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @Nullable Integer num, @Nullable Integer num2, @Nullable UrlConnectionProcessor urlConnectionProcessor, @Nullable DataRetriever dataRetriever, @Nullable ResponseProcessor<ResponseType> responseProcessor, @Nullable Listener<ResponseType> listener) {
        this.f60910a = str;
        this.f60911b = method;
        this.f60914e = num;
        this.f60915f = num2;
        this.f60918i = responseProcessor;
        this.f60912c = map;
        this.f60913d = map2;
        this.f60916g = urlConnectionProcessor;
        this.f60917h = dataRetriever;
        this.f60919j = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HttpURLConnection httpURLConnectionA;
        Throwable th2;
        Error error;
        try {
            httpURLConnectionA = a(a(this.f60910a, this.f60913d));
            try {
                int responseCode = httpURLConnectionA.getResponseCode();
                if (responseCode == 200) {
                    ResponseProcessor responseProcessor = this.f60918i;
                    if (responseProcessor == null) {
                        a((Object) null);
                        NetworkUtils.disconnectSafely(httpURLConnectionA);
                    } else {
                        try {
                            a(responseProcessor.process(httpURLConnectionA));
                        } catch (Throwable th3) {
                            error = Error.create(th3);
                            a(error);
                        }
                    }
                } else if (responseCode == 204) {
                    a((Object) null);
                } else {
                    error = new Error("Server response code - " + responseCode + Z7.f27998r + httpURLConnectionA.getResponseMessage());
                    a(error);
                }
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    a(Error.create(th2));
                } finally {
                    NetworkUtils.disconnectSafely(httpURLConnectionA);
                }
            }
        } catch (Throwable th5) {
            httpURLConnectionA = null;
            th2 = th5;
        }
    }

    public void cancel() {
        TaskManager taskManager = this.f60920k;
        CancelableTask cancelableTask = this.f60921l;
        if (taskManager != null && cancelableTask != null) {
            taskManager.cancel(cancelableTask);
        }
        a();
    }

    public void send() {
        send(f60909m);
    }

    private String a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public void send(@NonNull TaskManager taskManager) {
        cancel();
        this.f60920k = taskManager;
        b bVar = new b();
        this.f60921l = bVar;
        try {
            taskManager.execute(bVar);
        } catch (Throwable th2) {
            a(Error.create(th2));
        }
    }

    private void a() {
        this.f60920k = null;
        this.f60921l = null;
    }

    private void a(Error error) {
        Listener listener = this.f60919j;
        if (listener != null) {
            listener.onError(error);
        }
    }

    private void a(Object obj) {
        Listener listener = this.f60919j;
        if (listener != null) {
            listener.onSuccess(obj);
        }
    }

    private HttpURLConnection a(String str) throws Throwable {
        byte[] bArrRetrieve;
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod(this.f60911b.getNetworkName());
                for (Map.Entry entry : this.f60912c.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                UrlConnectionProcessor urlConnectionProcessor = this.f60916g;
                if (urlConnectionProcessor != null) {
                    urlConnectionProcessor.process(httpURLConnection2);
                }
                Integer num = this.f60914e;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.f60914e.intValue());
                }
                Integer num2 = this.f60915f;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.f60915f.intValue());
                }
                DataRetriever dataRetriever = this.f60917h;
                if (dataRetriever != null && (bArrRetrieve = dataRetriever.retrieve()) != null) {
                    a(httpURLConnection2, bArrRetrieve);
                }
                switch (httpURLConnection2.getResponseCode()) {
                    case 301:
                    case 302:
                    case 303:
                    case 305:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField) && io.bidmachine.util.Utils.isHttpUrl(headerField)) {
                            NetworkUtils.disconnectSafely(httpURLConnection2);
                            return a(headerField);
                        }
                        return httpURLConnection2;
                    case 304:
                    case 306:
                    default:
                        return httpURLConnection2;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                NetworkUtils.disconnectSafely(httpURLConnection);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(URLConnection uRLConnection, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(uRLConnection.getOutputStream());
            try {
                bufferedOutputStream2.write(bArr);
                io.bidmachine.iab.utils.Utils.flush(bufferedOutputStream2);
                io.bidmachine.iab.utils.Utils.close(bufferedOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                io.bidmachine.iab.utils.Utils.flush(bufferedOutputStream);
                io.bidmachine.iab.utils.Utils.close(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
