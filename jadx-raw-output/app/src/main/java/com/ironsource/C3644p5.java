package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3644p5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30413d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30414e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30415f = "C38FB23A402222A0C17D34A92F971D1F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f30416g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30417h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f30418i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C3644p5 f30419j = new C3644p5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30420a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30421b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30422c = "";

    private String a(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }

    public synchronized String d() {
        if (TextUtils.isEmpty(this.f30421b)) {
            this.f30421b = a(f30417h, 32);
        }
        return this.f30421b;
    }

    public static C3644p5 b() {
        return f30419j;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f30420a)) {
            this.f30420a = f30415f;
        }
        return this.f30420a;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f30422c)) {
            try {
                this.f30422c = C3432da.a(d(), f30416g);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f30422c;
    }
}
