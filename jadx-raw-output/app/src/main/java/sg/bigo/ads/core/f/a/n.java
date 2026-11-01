package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f71454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f71456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f71457d;

    public n(@NonNull String str) {
        this.f71457d = false;
        this.f71454a = true;
        this.f71455b = str;
    }

    public n(@NonNull String str, byte b10) {
        this(str);
        this.f71457d = true;
    }

    public String toString() {
        return "{\"Content\":\"" + this.f71455b + "\"}";
    }
}
