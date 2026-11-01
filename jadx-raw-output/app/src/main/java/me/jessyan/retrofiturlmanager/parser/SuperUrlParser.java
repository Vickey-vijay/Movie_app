package me.jessyan.retrofiturlmanager.parser;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import me.jessyan.retrofiturlmanager.cache.Cache;
import me.jessyan.retrofiturlmanager.cache.LruCache;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes6.dex */
public class SuperUrlParser implements UrlParser {
    private Cache<String, String> mCache;
    private RetrofitUrlManager mRetrofitUrlManager;

    private String getKey(HttpUrl httpUrl, HttpUrl httpUrl2, int i10) {
        return httpUrl.encodedPath() + httpUrl2.encodedPath() + i10;
    }

    @Override // me.jessyan.retrofiturlmanager.parser.UrlParser
    public void init(RetrofitUrlManager retrofitUrlManager) {
        this.mRetrofitUrlManager = retrofitUrlManager;
        this.mCache = new LruCache(100);
    }

    @Override // me.jessyan.retrofiturlmanager.parser.UrlParser
    public HttpUrl parseUrl(HttpUrl httpUrl, HttpUrl httpUrl2) {
        if (httpUrl == null) {
            return httpUrl2;
        }
        HttpUrl.Builder builderNewBuilder = httpUrl2.newBuilder();
        int iResolvePathSize = resolvePathSize(httpUrl2, builderNewBuilder);
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2, iResolvePathSize)))) {
            for (int i10 = 0; i10 < httpUrl2.pathSize(); i10++) {
                builderNewBuilder.removePathSegment(0);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(httpUrl.encodedPathSegments());
            if (httpUrl2.pathSize() > iResolvePathSize) {
                List<String> listEncodedPathSegments = httpUrl2.encodedPathSegments();
                for (int i11 = iResolvePathSize; i11 < listEncodedPathSegments.size(); i11++) {
                    arrayList.add(listEncodedPathSegments.get(i11));
                }
            } else if (httpUrl2.pathSize() < iResolvePathSize) {
                throw new IllegalArgumentException(String.format("Your final path is %s, the pathSize = %d, but the #baseurl_path_size = %d, #baseurl_path_size must be less than or equal to pathSize of the final path", httpUrl2.scheme() + "://" + httpUrl2.host() + httpUrl2.encodedPath(), Integer.valueOf(httpUrl2.pathSize()), Integer.valueOf(iResolvePathSize)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addEncodedPathSegment((String) it.next());
            }
        } else {
            builderNewBuilder.encodedPath(this.mCache.get(getKey(httpUrl, httpUrl2, iResolvePathSize)));
        }
        HttpUrl httpUrlBuild = builderNewBuilder.scheme(httpUrl.scheme()).host(httpUrl.host()).port(httpUrl.port()).build();
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2, iResolvePathSize)))) {
            this.mCache.put(getKey(httpUrl, httpUrl2, iResolvePathSize), httpUrlBuild.encodedPath());
        }
        return httpUrlBuild;
    }

    private int resolvePathSize(HttpUrl httpUrl, HttpUrl.Builder builder) {
        String strFragment = httpUrl.fragment();
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        if (strFragment.indexOf("#") == -1) {
            String[] strArrSplit = strFragment.split("=");
            if (strArrSplit.length > 1) {
                i10 = Integer.parseInt(strArrSplit[1]);
            }
        } else if (strFragment.indexOf(RetrofitUrlManager.IDENTIFICATION_PATH_SIZE) == -1) {
            int iIndexOf = strFragment.indexOf("#");
            stringBuffer.append(strFragment.substring(iIndexOf + 1, strFragment.length()));
            String[] strArrSplit2 = strFragment.substring(0, iIndexOf).split("=");
            if (strArrSplit2.length > 1) {
                i10 = Integer.parseInt(strArrSplit2[1]);
            }
        } else {
            String[] strArrSplit3 = strFragment.split(RetrofitUrlManager.IDENTIFICATION_PATH_SIZE);
            stringBuffer.append(strArrSplit3[0]);
            if (strArrSplit3.length > 1) {
                int iIndexOf2 = strArrSplit3[1].indexOf("#");
                if (iIndexOf2 != -1) {
                    String str = strArrSplit3[1];
                    stringBuffer.append(str.substring(iIndexOf2, str.length()));
                    String strSubstring = strArrSplit3[1].substring(0, iIndexOf2);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        i10 = Integer.parseInt(strSubstring);
                    }
                } else {
                    i10 = Integer.parseInt(strArrSplit3[1]);
                }
            }
        }
        if (TextUtils.isEmpty(stringBuffer.toString())) {
            builder.fragment(null);
        } else {
            builder.fragment(stringBuffer.toString());
        }
        return i10;
    }
}
