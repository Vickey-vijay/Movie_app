package me.goldze.mvvmhabit.http.cookie.store;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

/* JADX INFO: loaded from: classes8.dex */
public class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = 6374381323722046732L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Cookie f64460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Cookie f64461c;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f64460b.name());
        objectOutputStream.writeObject(this.f64460b.value());
        objectOutputStream.writeLong(this.f64460b.expiresAt());
        objectOutputStream.writeObject(this.f64460b.domain());
        objectOutputStream.writeObject(this.f64460b.path());
        objectOutputStream.writeBoolean(this.f64460b.secure());
        objectOutputStream.writeBoolean(this.f64460b.httpOnly());
        objectOutputStream.writeBoolean(this.f64460b.hostOnly());
        objectOutputStream.writeBoolean(this.f64460b.persistent());
    }

    public Cookie getCookie() {
        Cookie cookie = this.f64460b;
        Cookie cookie2 = this.f64461c;
        return cookie2 != null ? cookie2 : cookie;
    }

    public SerializableHttpCookie(Cookie cookie) {
        this.f64460b = cookie;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Cookie.Builder builderDomain;
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long j10 = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean z10 = objectInputStream.readBoolean();
        boolean z11 = objectInputStream.readBoolean();
        boolean z12 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.Builder builderExpiresAt = new Cookie.Builder().name(str).value(str2).expiresAt(j10);
        if (z12) {
            builderDomain = builderExpiresAt.hostOnlyDomain(str3);
        } else {
            builderDomain = builderExpiresAt.domain(str3);
        }
        Cookie.Builder builderPath = builderDomain.path(str4);
        if (z10) {
            builderPath = builderPath.secure();
        }
        if (z11) {
            builderPath = builderPath.httpOnly();
        }
        this.f64461c = builderPath.build();
    }
}
