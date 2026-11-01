package me.jessyan.retrofiturlmanager;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.jessyan.retrofiturlmanager.parser.DefaultUrlParser;
import me.jessyan.retrofiturlmanager.parser.UrlParser;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class RetrofitUrlManager {
    private static final boolean DEPENDENCY_OKHTTP;
    private static final String DOMAIN_NAME = "Domain-Name";
    public static final String DOMAIN_NAME_HEADER = "Domain-Name: ";
    private static final String GLOBAL_DOMAIN_NAME = "me.jessyan.retrofiturlmanager.globalDomainName";
    public static final String IDENTIFICATION_IGNORE = "#url_ignore";
    public static final String IDENTIFICATION_PATH_SIZE = "#baseurl_path_size=";
    private static final String TAG = "RetrofitUrlManager";
    private HttpUrl baseUrl;
    private boolean debug;
    private boolean isRun;
    private final Map<String, HttpUrl> mDomainNameHub;
    private final Interceptor mInterceptor;
    private final List<onUrlChangeListener> mListeners;
    private UrlParser mUrlParser;
    private int pathSize;

    public static class RetrofitUrlManagerHolder {
        private static final RetrofitUrlManager INSTANCE = new RetrofitUrlManager();

        private RetrofitUrlManagerHolder() {
        }
    }

    public synchronized int domainSize() {
        return this.mDomainNameHub.size();
    }

    public synchronized HttpUrl fetchDomain(String str) {
        Utils.checkNotNull(str, "domainName cannot be null");
        return this.mDomainNameHub.get(str);
    }

    public synchronized HttpUrl getGlobalDomain() {
        return this.mDomainNameHub.get(GLOBAL_DOMAIN_NAME);
    }

    public synchronized boolean haveDomain(String str) {
        return this.mDomainNameHub.containsKey(str);
    }

    public void startAdvancedModel(String str) {
        Utils.checkNotNull(str, "baseUrl cannot be null");
        startAdvancedModel(Utils.checkUrl(str));
    }

    static {
        boolean z10;
        try {
            Class.forName("okhttp3.OkHttpClient");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        DEPENDENCY_OKHTTP = z10;
    }

    private RetrofitUrlManager() {
        this.isRun = true;
        this.debug = false;
        this.mDomainNameHub = new HashMap();
        this.mListeners = new ArrayList();
        if (!DEPENDENCY_OKHTTP) {
            throw new IllegalStateException("Must be dependency Okhttp");
        }
        DefaultUrlParser defaultUrlParser = new DefaultUrlParser();
        defaultUrlParser.init(this);
        setUrlParser(defaultUrlParser);
        this.mInterceptor = new Interceptor() { // from class: me.jessyan.retrofiturlmanager.RetrofitUrlManager.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                return !RetrofitUrlManager.this.isRun() ? chain.proceed(chain.request()) : chain.proceed(RetrofitUrlManager.this.processRequest(chain.request()));
            }
        };
    }

    private Object[] listenersToArray() {
        Object[] array;
        synchronized (this.mListeners) {
            array = this.mListeners.size() > 0 ? this.mListeners.toArray() : null;
        }
        return array;
    }

    private void notifyListener(Request request, String str, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                ((onUrlChangeListener) obj).onUrlChangeBefore(request.url(), str);
            }
        }
    }

    private String obtainDomainNameFromHeaders(Request request) {
        List<String> listHeaders = request.headers(DOMAIN_NAME);
        if (listHeaders == null || listHeaders.size() == 0) {
            return null;
        }
        if (listHeaders.size() <= 1) {
            return request.header(DOMAIN_NAME);
        }
        throw new IllegalArgumentException("Only one Domain-Name in the headers");
    }

    private Request pruneIdentification(Request.Builder builder, String str) {
        String[] strArrSplit = str.split(IDENTIFICATION_IGNORE);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(str2);
        }
        return builder.url(stringBuffer.toString()).build();
    }

    public void clearAllDomain() {
        this.mDomainNameHub.clear();
    }

    public HttpUrl getBaseUrl() {
        return this.baseUrl;
    }

    public int getPathSize() {
        return this.pathSize;
    }

    public boolean isAdvancedModel() {
        return this.baseUrl != null;
    }

    public boolean isRun() {
        return this.isRun;
    }

    public Request processRequest(Request request) {
        HttpUrl globalDomain;
        if (request == null) {
            return request;
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        String string = request.url().toString();
        if (string.contains(IDENTIFICATION_IGNORE)) {
            return pruneIdentification(builderNewBuilder, string);
        }
        String strObtainDomainNameFromHeaders = obtainDomainNameFromHeaders(request);
        Object[] objArrListenersToArray = listenersToArray();
        if (TextUtils.isEmpty(strObtainDomainNameFromHeaders)) {
            notifyListener(request, GLOBAL_DOMAIN_NAME, objArrListenersToArray);
            globalDomain = getGlobalDomain();
        } else {
            notifyListener(request, strObtainDomainNameFromHeaders, objArrListenersToArray);
            globalDomain = fetchDomain(strObtainDomainNameFromHeaders);
            builderNewBuilder.removeHeader(DOMAIN_NAME);
        }
        if (globalDomain == null) {
            return builderNewBuilder.build();
        }
        HttpUrl url = this.mUrlParser.parseUrl(globalDomain, request.url());
        if (this.debug) {
            Log.d(TAG, "The new url is { " + url.toString() + " }, old url is { " + request.url().toString() + " }");
        }
        if (objArrListenersToArray != null) {
            for (Object obj : objArrListenersToArray) {
                ((onUrlChangeListener) obj).onUrlChanged(url, request.url());
            }
        }
        return builderNewBuilder.url(url).build();
    }

    public void putDomain(String str, String str2) {
        Utils.checkNotNull(str, "domainName cannot be null");
        Utils.checkNotNull(str2, "domainUrl cannot be null");
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.put(str, Utils.checkUrl(str2));
        }
    }

    public void registerUrlChangeListener(onUrlChangeListener onurlchangelistener) {
        Utils.checkNotNull(onurlchangelistener, "listener cannot be null");
        synchronized (this.mListeners) {
            this.mListeners.add(onurlchangelistener);
        }
    }

    public void removeDomain(String str) {
        Utils.checkNotNull(str, "domainName cannot be null");
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.remove(str);
        }
    }

    public void removeGlobalDomain() {
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.remove(GLOBAL_DOMAIN_NAME);
        }
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setGlobalDomain(String str) {
        Utils.checkNotNull(str, "globalDomain cannot be null");
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.put(GLOBAL_DOMAIN_NAME, Utils.checkUrl(str));
        }
    }

    public String setPathSizeOfUrl(String str, int i10) {
        Utils.checkNotNull(str, "url cannot be null");
        if (i10 < 0) {
            throw new IllegalArgumentException("pathSize must be >= 0");
        }
        return str + IDENTIFICATION_PATH_SIZE + i10;
    }

    public void setRun(boolean z10) {
        this.isRun = z10;
    }

    public String setUrlNotChange(String str) {
        Utils.checkNotNull(str, "url cannot be null");
        return str + IDENTIFICATION_IGNORE;
    }

    public void setUrlParser(UrlParser urlParser) {
        Utils.checkNotNull(urlParser, "parser cannot be null");
        this.mUrlParser = urlParser;
    }

    public void unregisterUrlChangeListener(onUrlChangeListener onurlchangelistener) {
        Utils.checkNotNull(onurlchangelistener, "listener cannot be null");
        synchronized (this.mListeners) {
            this.mListeners.remove(onurlchangelistener);
        }
    }

    public OkHttpClient.Builder with(OkHttpClient.Builder builder) {
        Utils.checkNotNull(builder, "builder cannot be null");
        return builder.addInterceptor(this.mInterceptor);
    }

    public static final RetrofitUrlManager getInstance() {
        return RetrofitUrlManagerHolder.INSTANCE;
    }

    public synchronized void startAdvancedModel(HttpUrl httpUrl) {
        Utils.checkNotNull(httpUrl, "baseUrl cannot be null");
        this.baseUrl = httpUrl;
        this.pathSize = httpUrl.pathSize();
        List<String> listPathSegments = httpUrl.pathSegments();
        if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
            this.pathSize--;
        }
    }
}
