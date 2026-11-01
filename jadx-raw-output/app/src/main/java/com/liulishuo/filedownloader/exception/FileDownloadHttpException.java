package com.liulishuo.filedownloader.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w7.f;

/* JADX INFO: loaded from: classes10.dex */
public class FileDownloadHttpException extends IOException {
    private final int mCode;
    private final Map<String, List<String>> mRequestHeaderMap;
    private final Map<String, List<String>> mResponseHeaderMap;

    public FileDownloadHttpException(int i10, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(f.o("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i10), map, map2));
        this.mCode = i10;
        this.mRequestHeaderMap = a(map);
        this.mResponseHeaderMap = a(map);
    }

    public static Map<String, List<String>> a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            map2.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return map2;
    }

    public int getCode() {
        return this.mCode;
    }

    public Map<String, List<String>> getRequestHeader() {
        return this.mRequestHeaderMap;
    }

    public Map<String, List<String>> getResponseHeader() {
        return this.mResponseHeaderMap;
    }
}
