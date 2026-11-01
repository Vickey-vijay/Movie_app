package me.jessyan.retrofiturlmanager;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
class Utils {
    public static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private Utils() {
        throw new IllegalStateException("do not instantiation me");
    }

    public static HttpUrl checkUrl(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null) {
            return httpUrl;
        }
        throw new InvalidUrlException(str);
    }
}
