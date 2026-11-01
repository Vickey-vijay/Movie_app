package com.safedk.android.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43490a = "ANRDetector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f43491b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f43492c = new HashSet(Arrays.asList("com.android.internal.os.RuntimeInit$UncaughtHandler.uncaughtException", "com.android.internal.os.RuntimeInit$KillApplicationHandler.uncaughtException"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f43493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f43494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f43496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.safedk.android.analytics.reporters.a f43497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f43498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f43499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f43500k;

    public a(Context context) {
        this(context, 5000, false);
    }

    public a(Context context, boolean z10) {
        this(context, 5000, z10);
    }

    public a(Context context, int i10, boolean z10) {
        this.f43493d = 0;
        this.f43500k = new Runnable() { // from class: com.safedk.android.analytics.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.f43493d = (a.this.f43493d + 1) % Integer.MAX_VALUE;
            }
        };
        this.f43494e = context;
        this.f43495f = i10;
        this.f43499j = z10;
        this.f43496g = new Handler(Looper.getMainLooper());
        this.f43497h = new com.safedk.android.analytics.reporters.a(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
    }

    private StackTraceElement[] a() {
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    private static String a(StackTraceElement[] stackTraceElementArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                messageDigest.update(stackTraceElement.toString().getBytes());
            }
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            return null;
        }
    }
}
