package com.tiktok;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class TikTokBusinessSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f45203a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f45204b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f45205c = Boolean.TRUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f45206d = "v1.2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f45207e = "analytics.us.tiktok.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static LogLevel f45208f = LogLevel.INFO;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AtomicBoolean f45209g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AtomicBoolean f45210h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static AtomicBoolean f45211i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f45212j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f45213k = UUID.randomUUID().toString();

    public enum LogLevel {
        NONE,
        INFO,
        WARN,
        DEBUG;

        public boolean log() {
            return this != NONE;
        }
    }

    public static LogLevel a() {
        return f45208f;
    }
}
