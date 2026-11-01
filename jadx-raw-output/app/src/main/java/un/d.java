package un;

import androidx.core.app.NotificationCompat;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Icon.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f72941h = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so.c f72942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final URI f72946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f72947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f72948g;

    public d(String str, int i10, int i11, int i12, URI uri) {
        this((str == null || str.length() <= 0) ? null : so.c.f(str), i10, i11, i12, uri, null);
    }

    public d(so.c cVar, int i10, int i11, int i12, URI uri, byte[] bArr) {
        this.f72942a = cVar;
        this.f72943b = i10;
        this.f72944c = i11;
        this.f72945d = i12;
        this.f72946e = uri;
        this.f72947f = bArr;
    }

    public d a() {
        return new d(f(), h(), e(), c(), g(), b());
    }

    public byte[] b() {
        return this.f72947f;
    }

    public int c() {
        return this.f72945d;
    }

    public a d() {
        return this.f72948g;
    }

    public int e() {
        return this.f72944c;
    }

    public so.c f() {
        return this.f72942a;
    }

    public URI g() {
        return this.f72946e;
    }

    public int h() {
        return this.f72943b;
    }

    public void i(a aVar) {
        if (this.f72948g != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f72948g = aVar;
    }

    public List<mn.k> j() {
        ArrayList arrayList = new ArrayList();
        if (f() == null) {
            Logger logger = f72941h;
            logger.warning("UPnP specification violation of: " + d());
            logger.warning("Invalid icon, missing mime type: " + this);
        }
        if (h() == 0) {
            Logger logger2 = f72941h;
            logger2.warning("UPnP specification violation of: " + d());
            logger2.warning("Invalid icon, missing width: " + this);
        }
        if (e() == 0) {
            Logger logger3 = f72941h;
            logger3.warning("UPnP specification violation of: " + d());
            logger3.warning("Invalid icon, missing height: " + this);
        }
        if (c() == 0) {
            Logger logger4 = f72941h;
            logger4.warning("UPnP specification violation of: " + d());
            logger4.warning("Invalid icon, missing bitmap depth: " + this);
        }
        if (g() == null) {
            arrayList.add(new mn.k(getClass(), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "URL is required"));
        } else {
            try {
                if (g().toURL() == null) {
                    throw new MalformedURLException();
                }
            } catch (IllegalArgumentException unused) {
            } catch (MalformedURLException e10) {
                arrayList.add(new mn.k(getClass(), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "URL must be valid: " + e10.getMessage()));
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Icon(" + h() + VastAttributes.HORIZONTAL_POSITION + e() + ", MIME: " + f() + ") " + g();
    }
}
