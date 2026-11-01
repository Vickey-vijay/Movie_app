package fd;

import androidx.annotation.NonNull;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: OkHttpClientStore.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52942b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f52943a;

    @NonNull
    public OkHttpClient a() {
        if (this.f52943a == null) {
            this.f52943a = new OkHttpClient();
        }
        return this.f52943a;
    }
}
