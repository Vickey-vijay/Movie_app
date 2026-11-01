package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;

/* JADX INFO: loaded from: classes5.dex */
public final class W8 implements X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W3 f27833a;

    /* JADX WARN: Multi-variable type inference failed */
    public W8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public W8(W3 w10) {
        ck.p.j(w10, "connectionFactory");
        this.f27833a = w10;
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.a aVar = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(new Exception("file does not exists")));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        if (drawableCreateFromPath != null) {
            return Result.m3458constructorimpl(drawableCreateFromPath);
        }
        Result.a aVar2 = Result.Companion;
        return Result.m3458constructorimpl(kotlin.c.a(new Exception("failed to create a drawable")));
    }

    private final Object c(String str) throws IOException {
        InputStream inputStreamA = this.f27833a.a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamA, new File(str).getName());
            yj.b.a(inputStreamA, null);
            if (drawableCreateFromStream != null) {
                return Result.m3458constructorimpl(drawableCreateFromStream);
            }
            Result.a aVar = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(new Exception("failed to create a drawable")));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(inputStreamA, th2);
                throw th3;
            }
        }
    }

    @Override // com.ironsource.X8
    public Object a(String str) {
        ck.p.j(str, "url");
        try {
            return d(str) ? c(str) : b(str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Result.a aVar = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(e10));
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    public /* synthetic */ W8(W3 w10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? L4.f26958a : w10);
    }
}
