package ab;

import android.content.Context;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.io.IOException;
import java.util.List;
import za.h;

/* JADX INFO: compiled from: BaseLoader.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a<D> implements d<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3518a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public za.a f3520c;

    @Override // ab.d
    public <D> List<D> a(String str, Class<D> cls) {
        return null;
    }

    @Override // ab.d
    public boolean b(String str, D d10) {
        return false;
    }

    public final void c(Context context) {
        File file = new File(this.f3519b);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            this.f3520c = za.a.s(file, h.c(context), 1, ServiceProvider.HTTP_CACHE_DISK_SIZE);
            System.out.println("......create DiskLruCache......");
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public String d(String str) {
        h.e(str, "key can't be null");
        return ya.c.b("cache_" + str);
    }

    public a(String str, Context context) {
        this.f3519b = str;
        c(context);
    }
}
