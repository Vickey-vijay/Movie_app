package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class RequestDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f58291a = NetworkTask.Method.GET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f58292b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f58293c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f58294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f58295e;

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f58292b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f58291a;
    }

    @Nullable
    public byte[] getPostData() {
        return this.f58293c;
    }

    @Nullable
    public Long getSendTimestamp() {
        return this.f58294d;
    }

    @Nullable
    public Integer getSendTimezoneSec() {
        return this.f58295e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f58292b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(@Nullable byte[] bArr) {
        this.f58291a = NetworkTask.Method.POST;
        this.f58293c = bArr;
    }

    public void applySendTime(long j10) {
        this.f58294d = Long.valueOf(j10);
        this.f58295e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j10) * 1000) / 1000);
    }
}
