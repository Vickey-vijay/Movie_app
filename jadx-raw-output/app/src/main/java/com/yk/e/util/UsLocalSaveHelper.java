package com.yk.e.util;

import com.safedk.android.internal.d;
import com.yk.e.object.ErrMsgParams;
import com.yk.e.object.PreCacheParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class UsLocalSaveHelper {
    private static UsLocalSaveHelper _instance;
    private int preloadCachePeriod = d.f44769a;
    private List<PreCacheParams> preCache4InitList = new ArrayList();
    private List<PreCacheParams> timerCacheList = new ArrayList();
    private List<String> cacheImgList = new ArrayList();
    private String netType = "";
    private Map<String, ErrMsgParams> errMsgParamsMap = new HashMap();
    private String writeLog = "0";
    private String cmp = "0";
    private Map<String, Long> adApiCostTimeMap = new HashMap();
    private String deviceID = "";

    public boolean isClientBidding() {
        return true;
    }

    public boolean useNativeCache() {
        return true;
    }

    public static UsLocalSaveHelper getInstance() {
        if (_instance == null) {
            _instance = new UsLocalSaveHelper();
        }
        return _instance;
    }

    public void addErrMsgParams(String str, ErrMsgParams errMsgParams) {
        this.errMsgParamsMap.put(str, errMsgParams);
    }

    public long getAdApiCostTime(String str) {
        try {
            if (this.adApiCostTimeMap.get(str) != null) {
                return this.adApiCostTimeMap.get(str).longValue();
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public List<String> getCacheImgList() {
        return this.cacheImgList;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public Map<String, ErrMsgParams> getErrMsgParamsMap() {
        return this.errMsgParamsMap;
    }

    public String getNetType() {
        return this.netType;
    }

    public List<PreCacheParams> getPreCache4InitList() {
        return this.preCache4InitList;
    }

    public int getPreloadCachePeriod() {
        return this.preloadCachePeriod;
    }

    public List<PreCacheParams> getTimerCacheList() {
        return this.timerCacheList;
    }

    public boolean isStartCmp() {
        return "1".equals(this.cmp);
    }

    public boolean isWriteLog() {
        return "1".equals(this.writeLog);
    }

    public void putAdApiCostTimeMap(String str, long j10) {
        this.adApiCostTimeMap.put(str, Long.valueOf(j10));
    }

    public void setCacheImgList(List<String> list) {
        this.cacheImgList = list;
    }

    public void setCmp(String str) {
        this.cmp = str;
    }

    public void setDeviceID(String str) {
        this.deviceID = str;
    }

    public void setNetType(String str) {
        this.netType = str;
    }

    public void setPreCache4InitList(List<PreCacheParams> list) {
        this.preCache4InitList = list;
    }

    public void setPreloadCachePeriod(int i10) {
        this.preloadCachePeriod = i10;
    }

    public void setTimerCacheList(List<PreCacheParams> list) {
        this.timerCacheList = list;
    }

    public void setWriteLog(String str) {
        this.writeLog = str;
    }

    private UsLocalSaveHelper() {
    }
}
