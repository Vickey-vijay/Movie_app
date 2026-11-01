package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FullUrlFormer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f58268a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f58269b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f58270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IParamsAppender f58271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigProvider f58272e;

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f58268a.get(this.f58269b)).buildUpon();
        this.f58271d.appendParams(builderBuildUpon, this.f58272e.getConfig());
        this.f58270c = builderBuildUpon.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.f58268a;
    }

    @Nullable
    public String getUrl() {
        return new c(this.f58270c).f58243a;
    }

    public boolean hasMoreHosts() {
        return this.f58269b + 1 < this.f58268a.size();
    }

    public void incrementAttemptNumber() {
        this.f58269b++;
    }

    public void setHosts(@Nullable List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f58268a = list;
    }

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f58271d = iParamsAppender;
        this.f58272e = configProvider;
    }
}
