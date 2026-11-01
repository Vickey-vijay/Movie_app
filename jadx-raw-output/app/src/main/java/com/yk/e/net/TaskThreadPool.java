package com.yk.e.net;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TaskThreadPool {
    public static ExecutorService pool = Executors.newFixedThreadPool(30);
    public static ExecutorService poolTwo = Executors.newFixedThreadPool(1);

    public static void connect(String str, JSONObject jSONObject, NetRequest.NetCallBack netCallBack) {
        new NetRequest(str, jSONObject, netCallBack).execute();
    }

    public static void connectGet(String str, JSONObject jSONObject, NetRequest.NetCallBack netCallBack) {
        NetRequest netRequest = new NetRequest(str, jSONObject, netCallBack);
        netRequest.requestMethod = "GET";
        netRequest.execute();
    }

    public static void connectNoCallBack(String str) {
        NetRequest netRequest = new NetRequest(str);
        netRequest.requestMethod = "GET";
        netRequest.execute();
    }

    public static void executeRunnable(Runnable runnable) {
        pool.execute(runnable);
    }

    public static void executeRunnableTwo(Runnable runnable) {
        poolTwo.execute(runnable);
    }

    public static void shutDown() {
        pool.shutdown();
    }
}
